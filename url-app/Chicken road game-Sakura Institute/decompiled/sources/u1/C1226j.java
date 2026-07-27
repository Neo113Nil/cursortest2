package u1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: u1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226j {

    /* renamed from: a, reason: collision with root package name */
    public final int f10921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10923c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10924d;

    public C1226j(int i2, int i4, long j4, long j5) {
        this.f10921a = i2;
        this.f10922b = i4;
        this.f10923c = j4;
        this.f10924d = j5;
    }

    public static C1226j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1226j c1226j = new C1226j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1226j;
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
            dataOutputStream.writeInt(this.f10921a);
            dataOutputStream.writeInt(this.f10922b);
            dataOutputStream.writeLong(this.f10923c);
            dataOutputStream.writeLong(this.f10924d);
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
        if (obj == null || !(obj instanceof C1226j)) {
            return false;
        }
        C1226j c1226j = (C1226j) obj;
        return this.f10922b == c1226j.f10922b && this.f10923c == c1226j.f10923c && this.f10921a == c1226j.f10921a && this.f10924d == c1226j.f10924d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10922b), Long.valueOf(this.f10923c), Integer.valueOf(this.f10921a), Long.valueOf(this.f10924d));
    }
}
