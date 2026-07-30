package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p60 implements u91 {
    public static final p60 b = new p60(0);
    public static final p60 c = new p60(1);
    public final /* synthetic */ int a;

    public /* synthetic */ p60(int i) {
        this.a = i;
    }

    @Override // defpackage.u91
    public final ka0 a(long j, vc0 vc0Var, nr nrVar) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float H = nrVar.H(30.0f);
                return new ht0(new s11(0.0f, -H, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + H));
            case 1:
                float H2 = nrVar.H(30.0f);
                return new ht0(new s11(-H2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + H2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ht0(t90.c(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
