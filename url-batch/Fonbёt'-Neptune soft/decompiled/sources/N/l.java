package N;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f815b;

    /* renamed from: c, reason: collision with root package name */
    public final long f816c;

    /* renamed from: d, reason: collision with root package name */
    public final long f817d;

    public l(int i2, int i3, long j2, long j3) {
        this.f814a = i2;
        this.f815b = i3;
        this.f816c = j2;
        this.f817d = j3;
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
            dataOutputStream.writeInt(this.f814a);
            dataOutputStream.writeInt(this.f815b);
            dataOutputStream.writeLong(this.f816c);
            dataOutputStream.writeLong(this.f817d);
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
        return this.f815b == lVar.f815b && this.f816c == lVar.f816c && this.f814a == lVar.f814a && this.f817d == lVar.f817d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f815b), Long.valueOf(this.f816c), Integer.valueOf(this.f814a), Long.valueOf(this.f817d));
    }
}
