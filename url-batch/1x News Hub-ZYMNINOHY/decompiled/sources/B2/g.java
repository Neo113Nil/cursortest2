package B2;

import K.N;
import K.W;
import K.Z;
import b2.C0194h;
import b2.C0195i;
import l2.l;
import t2.C1196f;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, Object obj) {
        super(1);
        this.f175e = i3;
        this.f = obj;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        switch (this.f175e) {
            case 0:
                ((i) this.f).b();
                return C0195i.f2555a;
            case 1:
                Throwable th = (Throwable) obj;
                N n3 = (N) this.f;
                if (th != null) {
                    n3.f701h.w(new Z(th));
                }
                if (n3.f703j.f2552b != C0194h.f2554a) {
                    ((W) n3.f703j.a()).close();
                }
                return C0195i.f2555a;
            default:
                C0195i c0195i = C0195i.f2555a;
                ((C1196f) this.f).f(c0195i);
                return c0195i;
        }
    }
}
