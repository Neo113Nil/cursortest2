package e1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1377c;
    public final long d;

    public j(int i, int i4, long j2, long j4) {
        this.f1375a = i;
        this.f1376b = i4;
        this.f1377c = j2;
        this.d = j4;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1375a);
            dataOutputStream.writeInt(this.f1376b);
            dataOutputStream.writeLong(this.f1377c);
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
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f1376b == jVar.f1376b && this.f1377c == jVar.f1377c && this.f1375a == jVar.f1375a && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1376b), Long.valueOf(this.f1377c), Integer.valueOf(this.f1375a), Long.valueOf(this.d));
    }
}
