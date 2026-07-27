package D;

import A.C0028y;
import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;
import p.C0935k;
import y2.InterfaceC1332g;

/* renamed from: D.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157o0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1938d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1939e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1941j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1332g f1945n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157o0(O.a aVar, O.a aVar2, O.a aVar3, O.a aVar4, boolean z4, Function0 function0, int i2) {
        super(2);
        this.f1942k = aVar;
        this.f1943l = aVar2;
        this.f1944m = aVar3;
        this.f1945n = aVar4;
        this.f1939e = z4;
        this.f1940i = function0;
        this.f1941j = i2;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1938d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f1941j | 1);
                boolean z4 = this.f1939e;
                C0154n0 c0154n0 = (C0154n0) this.f1943l;
                W0.f((Function0) this.f1940i, (S.o) this.f1942k, z4, c0154n0, (C0935k) this.f1944m, (Function2) this.f1945n, (C0216p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                H0.c((O.a) this.f1942k, (O.a) this.f1943l, (O.a) this.f1944m, (O.a) this.f1945n, this.f1939e, (Function0) this.f1940i, (C0216p) obj, C0192d.U(this.f1941j | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f1941j | 1);
                O.a aVar = (O.a) this.f1945n;
                C0028y c0028y = (C0028y) this.f1944m;
                S.o oVar = (S.o) this.f1942k;
                AbstractC0864b.c((n.o) this.f1943l, (Function0) this.f1940i, c0028y, oVar, this.f1939e, aVar, (C0216p) obj, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0192d.U(this.f1941j | 1);
                ?? r6 = (M2.p) this.f1945n;
                n.c cVar = (n.c) this.f1943l;
                S.o oVar2 = (S.o) this.f1942k;
                n.r.b((String) this.f1940i, this.f1939e, cVar, oVar2, (L2.c) this.f1944m, r6, (C0216p) obj, U5);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0157o0(String str, boolean z4, n.c cVar, S.o oVar, L2.c cVar2, Function0 function0, int i2) {
        super(2);
        this.f1940i = str;
        this.f1939e = z4;
        this.f1943l = cVar;
        this.f1942k = oVar;
        this.f1944m = cVar2;
        this.f1945n = (M2.p) function0;
        this.f1941j = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157o0(Function0 function0, S.o oVar, boolean z4, C0154n0 c0154n0, C0935k c0935k, Function2 function2, int i2) {
        super(2);
        this.f1940i = function0;
        this.f1942k = oVar;
        this.f1939e = z4;
        this.f1943l = c0154n0;
        this.f1944m = c0935k;
        this.f1945n = function2;
        this.f1941j = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157o0(n.o oVar, Function0 function0, C0028y c0028y, S.o oVar2, boolean z4, O.a aVar, int i2) {
        super(2);
        this.f1943l = oVar;
        this.f1940i = function0;
        this.f1944m = c0028y;
        this.f1942k = oVar2;
        this.f1939e = z4;
        this.f1945n = aVar;
        this.f1941j = i2;
    }
}
