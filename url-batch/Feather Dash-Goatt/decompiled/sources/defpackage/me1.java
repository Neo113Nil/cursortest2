package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class me1 implements ir1 {
    public final /* synthetic */ int d;

    public /* synthetic */ me1(int i) {
        this.d = i;
    }

    public static final int b(int i, long j) {
        int i2 = uq1.q;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static s40 c(wj wjVar, uq uqVar, int i) {
        wn1 wn1Var = uqVar;
        if ((i & 2) != 0) {
            wn1Var = wjVar instanceof wj ? wjVar.d() : uq.b;
        }
        bo c = wjVar instanceof wj ? wjVar.c() : ao.b;
        wn1Var.getClass();
        c.getClass();
        return new s40(wjVar.g(), wn1Var, c);
    }

    @Override // defpackage.kr1
    public /* synthetic */ Object a() {
        return new ur1("IntegrityService");
    }

    public long d() {
        switch (this.d) {
            case 3:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
