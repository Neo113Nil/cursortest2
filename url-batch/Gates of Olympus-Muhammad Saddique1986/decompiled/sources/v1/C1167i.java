package v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: v1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9772a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9773b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9774c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9775d;

    public C1167i(int i3, int i4, long j3, long j4) {
        this.f9772a = i3;
        this.f9773b = i4;
        this.f9774c = j3;
        this.f9775d = j4;
    }

    public static C1167i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1167i c1167i = new C1167i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1167i;
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
            dataOutputStream.writeInt(this.f9772a);
            dataOutputStream.writeInt(this.f9773b);
            dataOutputStream.writeLong(this.f9774c);
            dataOutputStream.writeLong(this.f9775d);
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
        if (obj == null || !(obj instanceof C1167i)) {
            return false;
        }
        C1167i c1167i = (C1167i) obj;
        return this.f9773b == c1167i.f9773b && this.f9774c == c1167i.f9774c && this.f9772a == c1167i.f9772a && this.f9775d == c1167i.f9775d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9773b), Long.valueOf(this.f9774c), Integer.valueOf(this.f9772a), Long.valueOf(this.f9775d));
    }
}
