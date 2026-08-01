package z0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3654b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3655d;

    public h(int i4, int i5, long j4, long j5) {
        this.f3653a = i4;
        this.f3654b = i5;
        this.c = j4;
        this.f3655d = j5;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3653a);
            dataOutputStream.writeInt(this.f3654b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.f3655d);
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
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f3654b == hVar.f3654b && this.c == hVar.c && this.f3653a == hVar.f3653a && this.f3655d == hVar.f3655d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3654b), Long.valueOf(this.c), Integer.valueOf(this.f3653a), Long.valueOf(this.f3655d));
    }
}
