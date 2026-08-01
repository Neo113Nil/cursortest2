package f0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096l {

    /* renamed from: a, reason: collision with root package name */
    public final int f2175a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2176b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2177c;
    public final long d;

    public C0096l(int i, int i2, long j2, long j3) {
        this.f2175a = i;
        this.f2176b = i2;
        this.f2177c = j2;
        this.d = j3;
    }

    public static C0096l a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0096l c0096l = new C0096l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0096l;
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
            dataOutputStream.writeInt(this.f2175a);
            dataOutputStream.writeInt(this.f2176b);
            dataOutputStream.writeLong(this.f2177c);
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
        if (obj == null || !(obj instanceof C0096l)) {
            return false;
        }
        C0096l c0096l = (C0096l) obj;
        return this.f2176b == c0096l.f2176b && this.f2177c == c0096l.f2177c && this.f2175a == c0096l.f2175a && this.d == c0096l.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2176b), Long.valueOf(this.f2177c), Integer.valueOf(this.f2175a), Long.valueOf(this.d));
    }
}
