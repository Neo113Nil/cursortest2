package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lq3 {
    public final oq3 a;
    public int b = 1;
    public long c = a();

    public lq3(oq3 oq3Var) {
        this.a = oq3Var;
    }

    public final long a() {
        oq3 oq3Var = this.a;
        ll3.v(oq3Var);
        long longValue = ((Long) ug3.v.a(null)).longValue();
        long longValue2 = ((Long) ug3.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        oq3Var.e().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
