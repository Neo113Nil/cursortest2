package F;

import b0.C0352v;
import t0.AbstractC0993f;

/* loaded from: classes.dex */
public final class W implements b0.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1408b;

    public /* synthetic */ W(int i3, Object obj) {
        this.f1407a = i3;
        this.f1408b = obj;
    }

    @Override // b0.w
    public final long a() {
        switch (this.f1407a) {
            case 0:
                Y y3 = (Y) this.f1408b;
                long j3 = ((f1) y3.f1454v.f1408b).f1539c;
                if (j3 != 16) {
                    return j3;
                }
                c1 c1Var = (c1) AbstractC0993f.i(y3, e1.f1525b);
                if (c1Var != null) {
                    long j4 = c1Var.f1491a;
                    if (j4 != 16) {
                        return j4;
                    }
                }
                return ((C0352v) AbstractC0993f.i(y3, V.f1382a)).f5441a;
            default:
                return ((f1) this.f1408b).f1539c;
        }
    }
}
