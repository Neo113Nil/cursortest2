package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uq1 {
    public final int PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public uq1(int i, int i2, long j, long j2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = j;
        this.Y1f8riQaR6yg = j2;
    }

    public static uq1 PxuCJdSBwIXG(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            uq1 uq1Var = new uq1(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return uq1Var;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof uq1)) {
            uq1 uq1Var = (uq1) obj;
            if (this.lS5Rgt96tfkO == uq1Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == uq1Var.TSizfFm2Yiuu && this.PxuCJdSBwIXG == uq1Var.PxuCJdSBwIXG && this.Y1f8riQaR6yg == uq1Var.Y1f8riQaR6yg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.lS5Rgt96tfkO), Long.valueOf(this.TSizfFm2Yiuu), Integer.valueOf(this.PxuCJdSBwIXG), Long.valueOf(this.Y1f8riQaR6yg));
    }

    public final void lS5Rgt96tfkO(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.PxuCJdSBwIXG);
            dataOutputStream.writeInt(this.lS5Rgt96tfkO);
            dataOutputStream.writeLong(this.TSizfFm2Yiuu);
            dataOutputStream.writeLong(this.Y1f8riQaR6yg);
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
}
