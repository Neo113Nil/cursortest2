package D;

import Z.C0323u;
import Z.InterfaceC0324v;
import r0.AbstractC1065f;

/* loaded from: classes.dex */
public final class T implements InterfaceC0324v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1627b;

    public /* synthetic */ T(int i2, Object obj) {
        this.f1626a = i2;
        this.f1627b = obj;
    }

    @Override // Z.InterfaceC0324v
    public final long a() {
        switch (this.f1626a) {
            case 0:
                V v4 = (V) this.f1627b;
                long a4 = v4.f1666y.a();
                if (a4 != 16) {
                    return a4;
                }
                V0 v02 = (V0) AbstractC1065f.i(v4, X0.f1675b);
                if (v02 != null) {
                    long j4 = v02.f1668a;
                    if (j4 != 16) {
                        return j4;
                    }
                }
                return ((C0323u) AbstractC1065f.i(v4, S.f1616a)).f4549a;
            default:
                return ((Y0) this.f1627b).f1684c;
        }
    }
}
