package org.bouncycastle.pqc.crypto.lms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes10.dex */
class LMOtsPublicKey implements Encodable {
    private final byte[] I;
    private final byte[] K;
    private final LMOtsParameters parameter;
    private final int q;

    public LMOtsPublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.q = i;
        this.K = bArr2;
    }

    public static LMOtsPublicKey getInstance(Object obj) {
        if (obj instanceof LMOtsPublicKey) {
            return (LMOtsPublicKey) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int readInt = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new LMOtsPublicKey(parametersForType, bArr, readInt, bArr2);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m("cannot parse ", obj));
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMOtsPublicKey lMOtsPublicKey = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsPublicKey;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public LMSContext createOtsContext(LMSSignature lMSSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.I, digest);
        LmsUtils.u32str(this.q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMSSignature.getOtsSignature().getC(), digest);
        return new LMSContext(this, lMSSignature, digest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey) obj;
            if (this.q == lMOtsPublicKey.q && Objects.areEqual(this.parameter, lMOtsPublicKey.parameter) && Arrays.areEqual(this.I, lMOtsPublicKey.I) && Arrays.areEqual(this.K, lMOtsPublicKey.K)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.parameter.getType()).bytes(this.I).u32str(this.q).bytes(this.K).build();
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getK() {
        return this.K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.q;
    }

    public int hashCode() {
        return Arrays.hashCode(this.K) + ((Arrays.hashCode(this.I) + ((Objects.hashCode(this.parameter) + (this.q * 31)) * 31)) * 31);
    }

    public LMSContext createOtsContext(LMOtsSignature lMOtsSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.I, digest);
        LmsUtils.u32str(this.q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMOtsSignature.getC(), digest);
        return new LMSContext(this, lMOtsSignature, digest);
    }
}
