package D;

import A.C0028y;
import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import y2.InterfaceC1332g;

/* renamed from: D.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147l extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1332g f1874e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1875i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1876j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1877k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1878l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0147l(Object obj, Object obj2, Object obj3, Function2 function2, int i2, int i4) {
        super(2);
        this.f1873d = i4;
        this.f1876j = obj;
        this.f1877k = obj2;
        this.f1878l = obj3;
        this.f1874e = function2;
        this.f1875i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1873d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f1875i | 1);
                O.a aVar = (O.a) this.f1874e;
                AbstractC0150m.d((Function0) this.f1876j, (S.o) this.f1877k, (P0.w) this.f1878l, aVar, (C0216p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f1875i | 1);
                O.a aVar2 = (O.a) this.f1874e;
                AbstractC0171t0.a((K) this.f1876j, (C0143j1) this.f1877k, (T1) this.f1878l, aVar2, (C0216p) obj, U4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int U5 = C0192d.U(this.f1875i | 1);
                C0028y c0028y = (C0028y) this.f1874e;
                n.r.c((n.h) this.f1878l, (Function0) this.f1876j, (S.o) this.f1877k, c0028y, (C0216p) obj, U5);
                break;
            default:
                ((Number) obj2).intValue();
                m3.o.a((S2.c) this.f1876j, (S.o) this.f1877k, (s.z) this.f1878l, (Function2) this.f1874e, (C0216p) obj, C0192d.U(this.f1875i | 1));
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147l(n.h hVar, Function0 function0, S.o oVar, C0028y c0028y, int i2) {
        super(2);
        this.f1873d = 2;
        this.f1878l = hVar;
        this.f1876j = function0;
        this.f1877k = oVar;
        this.f1874e = c0028y;
        this.f1875i = i2;
    }
}
