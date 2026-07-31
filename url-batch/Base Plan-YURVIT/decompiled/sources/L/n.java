package L;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f637b;

    /* renamed from: c, reason: collision with root package name */
    public final long f638c;

    /* renamed from: d, reason: collision with root package name */
    public final long f639d;

    public n(int i2, int i3, long j2, long j3) {
        this.f636a = i2;
        this.f637b = i3;
        this.f638c = j2;
        this.f639d = j3;
    }

    public static n a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            n nVar = new n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f636a);
            dataOutputStream.writeInt(this.f637b);
            dataOutputStream.writeLong(this.f638c);
            dataOutputStream.writeLong(this.f639d);
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
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (this.f637b == nVar.f637b && this.f638c == nVar.f638c && this.f636a == nVar.f636a && this.f639d == nVar.f639d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f637b), Long.valueOf(this.f638c), Integer.valueOf(this.f636a), Long.valueOf(this.f639d));
    }
}
