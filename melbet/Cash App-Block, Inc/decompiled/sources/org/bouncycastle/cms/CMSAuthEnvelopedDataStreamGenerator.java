package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.operator.OutputAEADEncryptor;

/* loaded from: classes9.dex */
public class CMSAuthEnvelopedDataStreamGenerator extends CMSAuthEnvelopedGenerator {
    private boolean _berEncodeRecipientSet;
    private int _bufferSize;

    private OutputStream doOpen(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, OutputAEADEncryptor outputAEADEncryptor) {
        return open(aSN1ObjectIdentifier, outputStream, CMSUtils.getRecipentInfos(outputAEADEncryptor.getKey(), ((CMSAuthEnvelopedGenerator) this).recipientInfoGenerators), outputAEADEncryptor);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, ASN1EncodableVector aSN1EncodableVector, OutputAEADEncryptor outputAEADEncryptor) {
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((ASN1Primitive) CMSObjectIdentifiers.authEnvelopedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((ASN1Primitive) new ASN1Integer(0L));
        CMSUtils.addOriginatorInfoToGenerator(bERSequenceGenerator2, ((CMSAuthEnvelopedGenerator) this).originatorInfo);
        CMSUtils.addRecipientInfosToGenerator(aSN1EncodableVector, bERSequenceGenerator2, this._berEncodeRecipientSet);
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((ASN1Primitive) aSN1ObjectIdentifier);
        bERSequenceGenerator3.getRawOutputStream().write(outputAEADEncryptor.getAlgorithmIdentifier().getEncoded());
        return new CMSAuthEnvelopedDataOutputStream(outputAEADEncryptor, CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this._bufferSize), bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }

    public void setBEREncodeRecipients(boolean z) {
        this._berEncodeRecipientSet = z;
    }

    public void setBufferSize(int i) {
        this._bufferSize = i;
    }

    public class CMSAuthEnvelopedDataOutputStream extends OutputStream {
        private final BERSequenceGenerator _cGen;
        private final OutputStream _cOut;
        private final BERSequenceGenerator _eiGen;
        private final OutputAEADEncryptor _encryptor;
        private final BERSequenceGenerator _envGen;
        private final OutputStream _octetStream;

        public CMSAuthEnvelopedDataOutputStream(OutputAEADEncryptor outputAEADEncryptor, OutputStream outputStream, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this._encryptor = outputAEADEncryptor;
            this._octetStream = outputStream;
            this._cOut = outputAEADEncryptor.getOutputStream(outputStream);
            this._cGen = bERSequenceGenerator;
            this._envGen = bERSequenceGenerator2;
            this._eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ASN1Set processAuthAttrSet = CMSUtils.processAuthAttrSet(CMSAuthEnvelopedDataStreamGenerator.this.authAttrsGenerator, this._encryptor);
            this._cOut.close();
            this._octetStream.close();
            this._eiGen.close();
            if (processAuthAttrSet != null) {
                this._envGen.addObject((ASN1Primitive) new DERTaggedObject(false, 1, (ASN1Encodable) processAuthAttrSet));
            }
            this._envGen.addObject((ASN1Primitive) new DEROctetString(this._encryptor.getMAC()));
            CMSUtils.addAttriSetToGenerator(this._envGen, CMSAuthEnvelopedDataStreamGenerator.this.unauthAttrsGenerator, 2, Collections.EMPTY_MAP);
            this._envGen.close();
            this._cGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this._cOut.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this._cOut.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this._cOut.write(bArr, i, i2);
        }
    }

    public OutputStream open(OutputStream outputStream, OutputAEADEncryptor outputAEADEncryptor) {
        return doOpen(new ASN1ObjectIdentifier(CMSObjectIdentifiers.data.getId()), outputStream, outputAEADEncryptor);
    }

    public OutputStream open(OutputStream outputStream, ASN1EncodableVector aSN1EncodableVector, OutputAEADEncryptor outputAEADEncryptor) {
        try {
            return open(CMSObjectIdentifiers.data, outputStream, aSN1EncodableVector, outputAEADEncryptor);
        } catch (IOException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "exception decoding algorithm parameters.");
            return null;
        }
    }
}
