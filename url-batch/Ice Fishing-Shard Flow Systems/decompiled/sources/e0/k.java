package e0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4697b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4698c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4699d;

    public k(int i2, int i5, long j, long j7) {
        this.f4696a = i2;
        this.f4697b = i5;
        this.f4698c = j;
        this.f4699d = j7;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f4696a);
            dataOutputStream.writeInt(this.f4697b);
            dataOutputStream.writeLong(this.f4698c);
            dataOutputStream.writeLong(this.f4699d);
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
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f4697b == kVar.f4697b && this.f4698c == kVar.f4698c && this.f4696a == kVar.f4696a && this.f4699d == kVar.f4699d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4697b), Long.valueOf(this.f4698c), Integer.valueOf(this.f4696a), Long.valueOf(this.f4699d));
    }
}
