package c0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1697b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1698c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1699d;

    public k(int i, int i2, long j2, long j3) {
        this.f1696a = i;
        this.f1697b = i2;
        this.f1698c = j2;
        this.f1699d = j3;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
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
            dataOutputStream.writeInt(this.f1696a);
            dataOutputStream.writeInt(this.f1697b);
            dataOutputStream.writeLong(this.f1698c);
            dataOutputStream.writeLong(this.f1699d);
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
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1697b == kVar.f1697b && this.f1698c == kVar.f1698c && this.f1696a == kVar.f1696a && this.f1699d == kVar.f1699d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1697b), Long.valueOf(this.f1698c), Integer.valueOf(this.f1696a), Long.valueOf(this.f1699d));
    }
}
