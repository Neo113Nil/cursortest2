package u4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f7403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7404b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7405c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7406d;

    public h(int i, int i8, long j7, long j8) {
        this.f7403a = i;
        this.f7404b = i8;
        this.f7405c = j7;
        this.f7406d = j8;
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
            dataOutputStream.writeInt(this.f7403a);
            dataOutputStream.writeInt(this.f7404b);
            dataOutputStream.writeLong(this.f7405c);
            dataOutputStream.writeLong(this.f7406d);
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
            if (this.f7404b == hVar.f7404b && this.f7405c == hVar.f7405c && this.f7403a == hVar.f7403a && this.f7406d == hVar.f7406d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7404b), Long.valueOf(this.f7405c), Integer.valueOf(this.f7403a), Long.valueOf(this.f7406d));
    }
}
