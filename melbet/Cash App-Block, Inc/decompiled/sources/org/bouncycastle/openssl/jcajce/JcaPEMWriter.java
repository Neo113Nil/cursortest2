package org.bouncycastle.openssl.jcajce;

import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.openssl.PEMEncryptor;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import org.bouncycastle.util.io.pem.PemWriter;

/* loaded from: classes8.dex */
public class JcaPEMWriter extends PemWriter {
    public JcaPEMWriter(Writer writer) {
        super(writer);
    }

    public void writeObject(Object obj, PEMEncryptor pEMEncryptor) {
        try {
            super.writeObject((PemObjectGenerator) new JcaMiscPEMGenerator(obj, pEMEncryptor));
        } catch (PemGenerationException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    public void writeObject(Object obj) {
        writeObject(obj, null);
    }

    @Override // org.bouncycastle.util.io.pem.PemWriter
    public void writeObject(PemObjectGenerator pemObjectGenerator) {
        super.writeObject(pemObjectGenerator);
    }
}
