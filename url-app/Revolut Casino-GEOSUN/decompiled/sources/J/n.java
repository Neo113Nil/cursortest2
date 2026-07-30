package J;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f452a;

    /* renamed from: b, reason: collision with root package name */
    public final int f453b;

    /* renamed from: c, reason: collision with root package name */
    public final long f454c;

    /* renamed from: d, reason: collision with root package name */
    public final long f455d;

    public n(int i2, int i3, long j2, long j3) {
        this.f452a = i2;
        this.f453b = i3;
        this.f454c = j2;
        this.f455d = j3;
    }

    public static n a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            n nVar = new n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nVar;
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
            dataOutputStream.writeInt(this.f452a);
            dataOutputStream.writeInt(this.f453b);
            dataOutputStream.writeLong(this.f454c);
            dataOutputStream.writeLong(this.f455d);
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
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f453b == nVar.f453b && this.f454c == nVar.f454c && this.f452a == nVar.f452a && this.f455d == nVar.f455d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f453b), Long.valueOf(this.f454c), Integer.valueOf(this.f452a), Long.valueOf(this.f455d));
    }
}
