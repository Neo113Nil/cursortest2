package v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9149b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9150c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9151d;

    public i(int i7, int i8, long j8, long j9) {
        this.f9148a = i7;
        this.f9149b = i8;
        this.f9150c = j8;
        this.f9151d = j9;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9148a);
            dataOutputStream.writeInt(this.f9149b);
            dataOutputStream.writeLong(this.f9150c);
            dataOutputStream.writeLong(this.f9151d);
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
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f9149b == iVar.f9149b && this.f9150c == iVar.f9150c && this.f9148a == iVar.f9148a && this.f9151d == iVar.f9151d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9149b), Long.valueOf(this.f9150c), Integer.valueOf(this.f9148a), Long.valueOf(this.f9151d));
    }
}
