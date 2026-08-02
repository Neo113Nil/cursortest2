package org.bouncycastle.pqc.crypto.lms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes10.dex */
class LMOtsSignature implements Encodable {
    private final byte[] C;

    /* renamed from: type, reason: collision with root package name */
    private final LMOtsParameters f1615type;
    private final byte[] y;

    public LMOtsSignature(LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.f1615type = lMOtsParameters;
        this.C = bArr;
        this.y = bArr2;
    }

    public static LMOtsSignature getInstance(Object obj) {
        if (obj instanceof LMOtsSignature) {
            return (LMOtsSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getN() * parametersForType.getP()];
            dataInputStream.readFully(bArr2);
            return new LMOtsSignature(parametersForType, bArr, bArr2);
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
                LMOtsSignature lMOtsSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsSignature;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMOtsSignature lMOtsSignature = (LMOtsSignature) obj;
        LMOtsParameters lMOtsParameters = this.f1615type;
        LMOtsParameters lMOtsParameters2 = lMOtsSignature.f1615type;
        if (lMOtsParameters == null ? lMOtsParameters2 != null : !lMOtsParameters.equals(lMOtsParameters2)) {
            return false;
        }
        if (Arrays.equals(this.C, lMOtsSignature.C)) {
            return Arrays.equals(this.y, lMOtsSignature.y);
        }
        return false;
    }

    public byte[] getC() {
        return this.C;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.f1615type.getType()).bytes(this.C).bytes(this.y).build();
    }

    public LMOtsParameters getType() {
        return this.f1615type;
    }

    public byte[] getY() {
        return this.y;
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.f1615type;
        int hashCode = lMOtsParameters != null ? lMOtsParameters.hashCode() : 0;
        return Arrays.hashCode(this.y) + ((Arrays.hashCode(this.C) + (hashCode * 31)) * 31);
    }
}
