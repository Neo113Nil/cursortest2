package U;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f3067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3068b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3069c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3070d;

    public m(int i2, int i3, long j2, long j6) {
        this.f3067a = i2;
        this.f3068b = i3;
        this.f3069c = j2;
        this.f3070d = j6;
    }

    public static m a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            m mVar = new m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return mVar;
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
            dataOutputStream.writeInt(this.f3067a);
            dataOutputStream.writeInt(this.f3068b);
            dataOutputStream.writeLong(this.f3069c);
            dataOutputStream.writeLong(this.f3070d);
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
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3068b == mVar.f3068b && this.f3069c == mVar.f3069c && this.f3067a == mVar.f3067a && this.f3070d == mVar.f3070d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3068b), Long.valueOf(this.f3069c), Integer.valueOf(this.f3067a), Long.valueOf(this.f3070d));
    }
}
