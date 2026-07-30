package D;

import M0.C0048f;
import u0.C0246f;
import u0.C0247g;

/* loaded from: classes.dex */
public final class M extends F0.j implements E0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i2, Object obj) {
        super(1);
        this.f109f = i2;
        this.f110g = obj;
    }

    @Override // E0.l
    public final Object i(Object obj) {
        switch (this.f109f) {
            case 0:
                Throwable th = (Throwable) obj;
                S s2 = (S) this.f110g;
                if (th != null) {
                    s2.f133l.G(new d0(th));
                }
                if (s2.f135n.f3002f != C0246f.f3004a) {
                    ((a0) s2.f135n.a()).close();
                }
                return C0247g.f3005a;
            case 1:
                C0247g c0247g = C0247g.f3005a;
                ((C0048f) this.f110g).resumeWith(c0247g);
                return c0247g;
            default:
                ((U0.h) this.f110g).b();
                return C0247g.f3005a;
        }
    }
}
