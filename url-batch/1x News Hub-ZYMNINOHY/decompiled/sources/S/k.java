package S;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1318b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1319c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1320d;

    public k(int i3, int i4, long j3, long j4) {
        this.f1317a = i3;
        this.f1318b = i4;
        this.f1319c = j3;
        this.f1320d = j4;
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
            dataOutputStream.writeInt(this.f1317a);
            dataOutputStream.writeInt(this.f1318b);
            dataOutputStream.writeLong(this.f1319c);
            dataOutputStream.writeLong(this.f1320d);
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
            if (this.f1318b == kVar.f1318b && this.f1319c == kVar.f1319c && this.f1317a == kVar.f1317a && this.f1320d == kVar.f1320d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1318b), Long.valueOf(this.f1319c), Integer.valueOf(this.f1317a), Long.valueOf(this.f1320d));
    }
}
