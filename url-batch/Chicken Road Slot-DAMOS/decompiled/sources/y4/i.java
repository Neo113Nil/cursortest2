package y4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f10609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10611c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10612d;

    public i(int i3, int i10, long j, long j3) {
        this.f10609a = i3;
        this.f10610b = i10;
        this.f10611c = j;
        this.f10612d = j3;
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
            dataOutputStream.writeInt(this.f10609a);
            dataOutputStream.writeInt(this.f10610b);
            dataOutputStream.writeLong(this.f10611c);
            dataOutputStream.writeLong(this.f10612d);
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
            if (this.f10610b == iVar.f10610b && this.f10611c == iVar.f10611c && this.f10609a == iVar.f10609a && this.f10612d == iVar.f10612d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10610b), Long.valueOf(this.f10611c), Integer.valueOf(this.f10609a), Long.valueOf(this.f10612d));
    }
}
