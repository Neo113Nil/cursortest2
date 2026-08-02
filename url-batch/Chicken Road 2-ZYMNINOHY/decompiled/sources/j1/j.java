package j1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f13886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13887b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13888c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13889d;

    public j(int i4, int i5, long j4, long j5) {
        this.f13886a = i4;
        this.f13887b = i5;
        this.f13888c = j4;
        this.f13889d = j5;
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
            dataOutputStream.writeInt(this.f13886a);
            dataOutputStream.writeInt(this.f13887b);
            dataOutputStream.writeLong(this.f13888c);
            dataOutputStream.writeLong(this.f13889d);
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
            if (this.f13887b == jVar.f13887b && this.f13888c == jVar.f13888c && this.f13886a == jVar.f13886a && this.f13889d == jVar.f13889d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13887b), Long.valueOf(this.f13888c), Integer.valueOf(this.f13886a), Long.valueOf(this.f13889d));
    }
}
