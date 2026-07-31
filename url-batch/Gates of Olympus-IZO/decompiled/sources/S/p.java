package S;

import h1.C0438i;
import m.C0601k;
import m.i0;
import m.y0;
import m.z0;

/* loaded from: classes.dex */
public final class p extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z1.j f3233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(int i3, Y1.c cVar) {
        super(1);
        this.f3232e = i3;
        switch (i3) {
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f3233f = (Z1.j) cVar;
                super(1);
                break;
            default:
                this.f3233f = (Z1.j) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Y1.e, Z1.j] */
    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3232e) {
            case 0:
                i iVar = (i) this.f3233f.j((n) obj);
                synchronized (q.f3235b) {
                    q.f3236c = q.f3236c.j(iVar.d());
                }
                return iVar;
            case 1:
                C0601k c0601k = (C0601k) obj;
                Object value = c0601k.f5790e.getValue();
                y0 y0Var = z0.f5885a;
                this.f3233f.g(value, i0.f5763n.j(c0601k.f5791f));
                return L1.z.f2729a;
            default:
                return this.f3233f.j(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Y1.e eVar) {
        super(1);
        this.f3232e = 1;
        y0 y0Var = z0.f5885a;
        this.f3233f = (Z1.j) eVar;
    }
}
