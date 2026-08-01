package d0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f2018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2019b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2020c;
    public final long d;

    public l(int i, int i2, long j2, long j3) {
        this.f2018a = i;
        this.f2019b = i2;
        this.f2020c = j2;
        this.d = j3;
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
            dataOutputStream.writeInt(this.f2018a);
            dataOutputStream.writeInt(this.f2019b);
            dataOutputStream.writeLong(this.f2020c);
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
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2019b == lVar.f2019b && this.f2020c == lVar.f2020c && this.f2018a == lVar.f2018a && this.d == lVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2019b), Long.valueOf(this.f2020c), Integer.valueOf(this.f2018a), Long.valueOf(this.d));
    }
}
