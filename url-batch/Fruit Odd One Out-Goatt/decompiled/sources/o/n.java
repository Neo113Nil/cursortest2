package o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f1004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1005b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1006c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1007d;

    public n(int i2, int i3, long j2, long j3) {
        this.f1004a = i2;
        this.f1005b = i3;
        this.f1006c = j2;
        this.f1007d = j3;
    }

    public static n a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            n nVar = new n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1004a);
            dataOutputStream.writeInt(this.f1005b);
            dataOutputStream.writeLong(this.f1006c);
            dataOutputStream.writeLong(this.f1007d);
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
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (this.f1005b == nVar.f1005b && this.f1006c == nVar.f1006c && this.f1004a == nVar.f1004a && this.f1007d == nVar.f1007d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1005b), Long.valueOf(this.f1006c), Integer.valueOf(this.f1004a), Long.valueOf(this.f1007d));
    }
}
