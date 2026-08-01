package f0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f2683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2684b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2685c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2686d;

    public l(int i, int i2, long j, long j2) {
        this.f2683a = i;
        this.f2684b = i2;
        this.f2685c = j;
        this.f2686d = j2;
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
            dataOutputStream.writeInt(this.f2683a);
            dataOutputStream.writeInt(this.f2684b);
            dataOutputStream.writeLong(this.f2685c);
            dataOutputStream.writeLong(this.f2686d);
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
        return this.f2684b == lVar.f2684b && this.f2685c == lVar.f2685c && this.f2683a == lVar.f2683a && this.f2686d == lVar.f2686d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2684b), Long.valueOf(this.f2685c), Integer.valueOf(this.f2683a), Long.valueOf(this.f2686d));
    }
}
