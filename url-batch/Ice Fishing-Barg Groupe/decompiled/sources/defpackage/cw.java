package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cw {
    public Parcel PxuCJdSBwIXG;

    public long PxuCJdSBwIXG() {
        gl glVar = hl.Companion;
        long readLong = this.PxuCJdSBwIXG.readLong();
        long j = 63 & readLong;
        return j < 16 ? readLong : (readLong & (-64)) | (j + 1);
    }

    public void TSizfFm2Yiuu(byte b) {
        this.PxuCJdSBwIXG.writeByte(b);
    }

    public void Y1f8riQaR6yg(float f) {
        this.PxuCJdSBwIXG.writeFloat(f);
    }

    public void e9gEMXR7LXtO(long j) {
        long lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j);
        ij2 ij2Var = jj2.Companion;
        ij2Var.getClass();
        byte b = 0;
        if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 0L)) {
            ij2Var.getClass();
            if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
                b = 1;
            } else {
                ij2Var.getClass();
                if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 8589934592L)) {
                    b = 2;
                }
            }
        }
        TSizfFm2Yiuu(b);
        long lS5Rgt96tfkO2 = hj2.lS5Rgt96tfkO(j);
        ij2Var.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO2, 0L)) {
            return;
        }
        Y1f8riQaR6yg(hj2.TSizfFm2Yiuu(j));
    }

    public long lS5Rgt96tfkO() {
        long j;
        Parcel parcel = this.PxuCJdSBwIXG;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            jj2.Companion.getClass();
            j = 4294967296L;
        } else if (readByte == 2) {
            jj2.Companion.getClass();
            j = 8589934592L;
        } else {
            jj2.Companion.getClass();
            j = 0;
        }
        jj2.Companion.getClass();
        if (!jj2.PxuCJdSBwIXG(j, 0L)) {
            return ki0.wLFCmsViZrNT(j, parcel.readFloat());
        }
        hj2.Companion.getClass();
        return hj2.TSizfFm2Yiuu;
    }
}
