package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126e extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O.a f1749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f1750e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f1751i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f1752j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f1753k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z.P f1754l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1756n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1757o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f1758p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f1759q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f1760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1761s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1762t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126e(O.a aVar, S.o oVar, Function2 function2, Function2 function22, Function2 function23, Z.P p4, long j4, float f4, long j5, long j6, long j7, long j8, int i2, int i4) {
        super(2);
        this.f1749d = aVar;
        this.f1750e = oVar;
        this.f1751i = function2;
        this.f1752j = function22;
        this.f1753k = function23;
        this.f1754l = p4;
        this.f1755m = j4;
        this.f1756n = f4;
        this.f1757o = j5;
        this.f1758p = j6;
        this.f1759q = j7;
        this.f1760r = j8;
        this.f1761s = i2;
        this.f1762t = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1761s | 1);
        int U4 = C0192d.U(this.f1762t);
        O.a aVar = this.f1749d;
        long j4 = this.f1757o;
        long j5 = this.f1758p;
        AbstractC0150m.a(aVar, this.f1750e, this.f1751i, this.f1752j, this.f1753k, this.f1754l, this.f1755m, this.f1756n, j4, j5, this.f1759q, this.f1760r, (C0216p) obj, U3, U4);
        return Unit.f7487a;
    }
}
