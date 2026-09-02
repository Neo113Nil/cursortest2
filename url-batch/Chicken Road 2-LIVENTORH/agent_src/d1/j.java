package d1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1113b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1114c;
    public final long d;

    public j(int i, int i4, long j4, long j5) {
        this.f1112a = i;
        this.f1113b = i4;
        this.f1114c = j4;
        this.d = j5;
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
            dataOutputStream.writeInt(this.f1112a);
            dataOutputStream.writeInt(this.f1113b);
            dataOutputStream.writeLong(this.f1114c);
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
            if (this.f1113b == jVar.f1113b && this.f1114c == jVar.f1114c && this.f1112a == jVar.f1112a && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1113b), Long.valueOf(this.f1114c), Integer.valueOf(this.f1112a), Long.valueOf(this.d));
    }
}
