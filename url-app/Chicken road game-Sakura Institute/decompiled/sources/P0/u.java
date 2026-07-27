package P0;

import A.C0016l;
import A.a0;
import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;
import q.AbstractC1035n;
import s.C1103g;
import s0.C1142f0;
import w.M;

/* loaded from: classes.dex */
public final class u extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3762e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3763i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i2, int i4, Object obj) {
        super(2);
        this.f3761d = i4;
        this.f3763i = obj;
        this.f3762e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f3761d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f3762e | 1);
                ((v) this.f3763i).a(U3, (C0216p) obj);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f3762e | 1);
                ((B) this.f3763i).a(U4, (C0216p) obj);
                break;
            case 2:
                ((Number) obj2).intValue();
                int U5 = C0192d.U(this.f3762e | 1);
                AbstractC1035n.a((S.o) this.f3763i, (C0216p) obj, U5);
                break;
            case 3:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    r.h hVar = (r.h) this.f3763i;
                    C0016l c0016l = hVar.f9455b.f9453a;
                    int i2 = this.f3762e;
                    C1103g d4 = c0016l.d(i2);
                    int i4 = i2 - d4.f9930a;
                    ((O.a) d4.f9932c.f7977c).f(hVar.f9456c, Integer.valueOf(i4), c0216p, 0);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                int U6 = C0192d.U(this.f3762e | 1);
                ((C1142f0) this.f3763i).a(U6, (C0216p) obj);
                break;
            case 5:
                ((Number) obj2).intValue();
                int U7 = C0192d.U(this.f3762e | 1);
                AbstractC0864b.d((t1.p) this.f3763i, (C0216p) obj, U7);
                break;
            default:
                ((Number) obj2).intValue();
                int U8 = C0192d.U(this.f3762e | 1);
                M.e((a0) this.f3763i, (C0216p) obj, U8);
                break;
        }
        return Unit.f7487a;
    }
}
