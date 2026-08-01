package n;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088o {

    /* renamed from: a, reason: collision with root package name */
    public final int f1070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1071b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1072c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1073d;

    public C0088o(int i2, int i3, long j2, long j3) {
        this.f1070a = i2;
        this.f1071b = i3;
        this.f1072c = j2;
        this.f1073d = j3;
    }

    public static C0088o a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0088o c0088o = new C0088o(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0088o;
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
            dataOutputStream.writeInt(this.f1070a);
            dataOutputStream.writeInt(this.f1071b);
            dataOutputStream.writeLong(this.f1072c);
            dataOutputStream.writeLong(this.f1073d);
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
        if (obj == null || !(obj instanceof C0088o)) {
            return false;
        }
        C0088o c0088o = (C0088o) obj;
        return this.f1071b == c0088o.f1071b && this.f1072c == c0088o.f1072c && this.f1070a == c0088o.f1070a && this.f1073d == c0088o.f1073d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1071b), Long.valueOf(this.f1072c), Integer.valueOf(this.f1070a), Long.valueOf(this.f1073d));
    }
}
