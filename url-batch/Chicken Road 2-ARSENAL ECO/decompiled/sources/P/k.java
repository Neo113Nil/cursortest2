package P;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1864c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1865d;

    public k(int i7, int i8, long j4, long j7) {
        this.f1862a = i7;
        this.f1863b = i8;
        this.f1864c = j4;
        this.f1865d = j7;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1862a);
            dataOutputStream.writeInt(this.f1863b);
            dataOutputStream.writeLong(this.f1864c);
            dataOutputStream.writeLong(this.f1865d);
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
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f1863b == kVar.f1863b && this.f1864c == kVar.f1864c && this.f1862a == kVar.f1862a && this.f1865d == kVar.f1865d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1863b), Long.valueOf(this.f1864c), Integer.valueOf(this.f1862a), Long.valueOf(this.f1865d));
    }
}
