package r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f40225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40226b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40227c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40228d;

    public g(long j9, long j10, int i, int i4) {
        this.f40225a = i;
        this.f40226b = i4;
        this.f40227c = j9;
        this.f40228d = j10;
    }

    public static g a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f40225a);
            dataOutputStream.writeInt(this.f40226b);
            dataOutputStream.writeLong(this.f40227c);
            dataOutputStream.writeLong(this.f40228d);
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
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f40226b == gVar.f40226b && this.f40227c == gVar.f40227c && this.f40225a == gVar.f40225a && this.f40228d == gVar.f40228d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40226b), Long.valueOf(this.f40227c), Integer.valueOf(this.f40225a), Long.valueOf(this.f40228d));
    }
}
