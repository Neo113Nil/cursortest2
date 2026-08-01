package d0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f1898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1899b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1900c;
    public final long d;

    public l(int i, int i2, long j2, long j3) {
        this.f1898a = i;
        this.f1899b = i2;
        this.f1900c = j2;
        this.d = j3;
    }

    public static l a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            l lVar = new l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return lVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1898a);
            dataOutputStream.writeInt(this.f1899b);
            dataOutputStream.writeLong(this.f1900c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1899b == lVar.f1899b && this.f1900c == lVar.f1900c && this.f1898a == lVar.f1898a && this.d == lVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1899b), Long.valueOf(this.f1900c), Integer.valueOf(this.f1898a), Long.valueOf(this.d));
    }
}
