package s1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f7540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7541b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7543d;

    public j(int i3, int i4, long j3, long j4) {
        this.f7540a = i3;
        this.f7541b = i4;
        this.f7542c = j3;
        this.f7543d = j4;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
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
            dataOutputStream.writeInt(this.f7540a);
            dataOutputStream.writeInt(this.f7541b);
            dataOutputStream.writeLong(this.f7542c);
            dataOutputStream.writeLong(this.f7543d);
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
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7541b == jVar.f7541b && this.f7542c == jVar.f7542c && this.f7540a == jVar.f7540a && this.f7543d == jVar.f7543d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7541b), Long.valueOf(this.f7542c), Integer.valueOf(this.f7540a), Long.valueOf(this.f7543d));
    }
}
