package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xm2 {
    public static final ThreadLocal Y1f8riQaR6yg = new ThreadLocal();
    public final int PxuCJdSBwIXG;
    public volatile int TSizfFm2Yiuu = 0;
    public final e0 lS5Rgt96tfkO;

    public xm2(e0 e0Var, int i) {
        this.lS5Rgt96tfkO = e0Var;
        this.PxuCJdSBwIXG = i;
    }

    public final int PxuCJdSBwIXG(int i) {
        z51 lS5Rgt96tfkO = lS5Rgt96tfkO();
        int PxuCJdSBwIXG = lS5Rgt96tfkO.PxuCJdSBwIXG(16);
        if (PxuCJdSBwIXG == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) lS5Rgt96tfkO.dgRBjINgWbAK;
        int i2 = PxuCJdSBwIXG + lS5Rgt96tfkO.rtx2ld2ELZv4;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final z51 lS5Rgt96tfkO() {
        ThreadLocal threadLocal = Y1f8riQaR6yg;
        z51 z51Var = (z51) threadLocal.get();
        if (z51Var == null) {
            z51Var = new z51();
            threadLocal.set(z51Var);
        }
        a61 a61Var = (a61) this.lS5Rgt96tfkO.OPXfSBeufaJ8;
        int PxuCJdSBwIXG = a61Var.PxuCJdSBwIXG(6);
        if (PxuCJdSBwIXG != 0) {
            int i = PxuCJdSBwIXG + a61Var.rtx2ld2ELZv4;
            int i2 = (this.PxuCJdSBwIXG * 4) + ((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) a61Var.dgRBjINgWbAK).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) a61Var.dgRBjINgWbAK;
            z51Var.dgRBjINgWbAK = byteBuffer;
            if (byteBuffer != null) {
                z51Var.rtx2ld2ELZv4 = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                z51Var.OPXfSBeufaJ8 = i4;
                z51Var.wdg6QnbFHrFF = ((ByteBuffer) z51Var.dgRBjINgWbAK).getShort(i4);
                return z51Var;
            }
            z51Var.rtx2ld2ELZv4 = 0;
            z51Var.OPXfSBeufaJ8 = 0;
            z51Var.wdg6QnbFHrFF = 0;
        }
        return z51Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        z51 lS5Rgt96tfkO = lS5Rgt96tfkO();
        int PxuCJdSBwIXG = lS5Rgt96tfkO.PxuCJdSBwIXG(4);
        sb.append(Integer.toHexString(PxuCJdSBwIXG != 0 ? ((ByteBuffer) lS5Rgt96tfkO.dgRBjINgWbAK).getInt(PxuCJdSBwIXG + lS5Rgt96tfkO.rtx2ld2ELZv4) : 0));
        sb.append(", codepoints:");
        z51 lS5Rgt96tfkO2 = lS5Rgt96tfkO();
        int PxuCJdSBwIXG2 = lS5Rgt96tfkO2.PxuCJdSBwIXG(16);
        if (PxuCJdSBwIXG2 != 0) {
            int i2 = PxuCJdSBwIXG2 + lS5Rgt96tfkO2.rtx2ld2ELZv4;
            i = ((ByteBuffer) lS5Rgt96tfkO2.dgRBjINgWbAK).getInt(((ByteBuffer) lS5Rgt96tfkO2.dgRBjINgWbAK).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(PxuCJdSBwIXG(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
