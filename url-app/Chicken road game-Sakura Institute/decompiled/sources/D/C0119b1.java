package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119b1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1718e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.a f1719i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f1720j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f1721k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q.m0 f1722l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f1723m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1724n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119b1(int i2, Function2 function2, O.a aVar, Function2 function22, Function2 function23, q.m0 m0Var, Function2 function24, int i4) {
        super(2);
        this.f1717d = i2;
        this.f1718e = function2;
        this.f1719i = aVar;
        this.f1720j = function22;
        this.f1721k = function23;
        this.f1722l = m0Var;
        this.f1723m = function24;
        this.f1724n = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1724n | 1);
        O.a aVar = this.f1719i;
        Function2 function2 = this.f1720j;
        Function2 function22 = this.f1721k;
        AbstractC0122c1.b(this.f1717d, this.f1718e, aVar, function2, function22, this.f1722l, this.f1723m, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
