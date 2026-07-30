package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class a {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private a() {
    }

    public static a compose() {
        return new a();
    }

    public a bool(boolean z7) {
        this.bos.write(z7 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.bos.toByteArray();
    }

    public a bytes(org.bouncycastle.util.c cVar) {
        try {
            this.bos.write(cVar.getEncoded());
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public a pad(int i8, int i9) {
        while (i9 >= 0) {
            try {
                this.bos.write(i8);
                i9--;
            } catch (Exception e8) {
                throw new RuntimeException(e8.getMessage(), e8);
            }
        }
        return this;
    }

    public a padUntil(int i8, int i9) {
        while (this.bos.size() < i9) {
            this.bos.write(i8);
        }
        return this;
    }

    public a u16str(int i8) {
        int i9 = i8 & 65535;
        this.bos.write((byte) (i9 >>> 8));
        this.bos.write((byte) i9);
        return this;
    }

    public a u32str(int i8) {
        this.bos.write((byte) (i8 >>> 24));
        this.bos.write((byte) (i8 >>> 16));
        this.bos.write((byte) (i8 >>> 8));
        this.bos.write((byte) i8);
        return this;
    }

    public a u64str(long j8) {
        u32str((int) (j8 >>> 32));
        u32str((int) j8);
        return this;
    }

    public a bytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public a bytes(byte[] bArr, int i8, int i9) {
        try {
            this.bos.write(bArr, i8, i9);
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public a bytes(org.bouncycastle.util.c[] cVarArr) {
        try {
            for (org.bouncycastle.util.c cVar : cVarArr) {
                this.bos.write(cVar.getEncoded());
            }
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public a bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.bos.write(bArr2);
            }
            return this;
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public a bytes(byte[][] bArr, int i8, int i9) {
        while (i8 != i9) {
            try {
                this.bos.write(bArr[i8]);
                i8++;
            } catch (Exception e8) {
                throw new RuntimeException(e8.getMessage(), e8);
            }
        }
        return this;
    }
}
