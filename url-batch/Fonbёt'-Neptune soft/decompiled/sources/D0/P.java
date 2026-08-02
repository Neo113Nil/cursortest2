package D0;

import Y0.C0112f;

/* loaded from: classes.dex */
public final class P extends Q0.i implements P0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i2, Object obj) {
        super(1);
        this.f265f = i2;
        this.f266g = obj;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        switch (this.f265f) {
            case 0:
                ((P0.l) this.f266g).i(new Q(((F0.e) obj).f464e));
                return F0.h.f469a;
            case 1:
                Throwable th = (Throwable) obj;
                I.P p2 = (I.P) this.f266g;
                if (th != null) {
                    p2.f576l.t(new I.b0(th));
                }
                if (p2.f578n.f466f != F0.g.f468a) {
                    ((I.Y) p2.f578n.a()).close();
                }
                return F0.h.f469a;
            case 2:
                U0.c cVar = (U0.c) obj;
                Q0.h.e(cVar, "it");
                return ((String) this.f266g).subSequence(cVar.f1087e, cVar.f1088f + 1).toString();
            case 3:
                F0.h hVar = F0.h.f469a;
                ((C0112f) this.f266g).j(hVar);
                return hVar;
            default:
                ((g1.h) this.f266g).b();
                return F0.h.f469a;
        }
    }
}
