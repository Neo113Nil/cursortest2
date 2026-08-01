package m;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1020b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1021c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1022d;

    public C0078n(int i2, int i3, long j2, long j3) {
        this.f1019a = i2;
        this.f1020b = i3;
        this.f1021c = j2;
        this.f1022d = j3;
    }

    public static C0078n a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0078n c0078n = new C0078n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0078n;
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
            dataOutputStream.writeInt(this.f1019a);
            dataOutputStream.writeInt(this.f1020b);
            dataOutputStream.writeLong(this.f1021c);
            dataOutputStream.writeLong(this.f1022d);
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
        if (obj == null || !(obj instanceof C0078n)) {
            return false;
        }
        C0078n c0078n = (C0078n) obj;
        return this.f1020b == c0078n.f1020b && this.f1021c == c0078n.f1021c && this.f1019a == c0078n.f1019a && this.f1022d == c0078n.f1022d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1020b), Long.valueOf(this.f1021c), Integer.valueOf(this.f1019a), Long.valueOf(this.f1022d));
    }
}
