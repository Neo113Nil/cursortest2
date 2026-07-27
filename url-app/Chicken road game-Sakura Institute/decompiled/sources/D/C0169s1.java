package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p.C0935k;

/* renamed from: D.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169s1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f2011e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f2012i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2013j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f2014k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f2015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0935k f2018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2019p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169s1(boolean z4, Function0 function0, S.o oVar, boolean z5, Function2 function2, Function2 function22, long j4, long j5, C0935k c0935k, int i2) {
        super(2);
        this.f2010d = z4;
        this.f2011e = function0;
        this.f2012i = oVar;
        this.f2013j = z5;
        this.f2014k = function2;
        this.f2015l = function22;
        this.f2016m = j4;
        this.f2017n = j5;
        this.f2018o = c0935k;
        this.f2019p = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f2019p | 1);
        Function2 function2 = this.f2015l;
        long j4 = this.f2016m;
        z1.b(this.f2010d, this.f2011e, this.f2012i, this.f2013j, this.f2014k, function2, j4, this.f2017n, this.f2018o, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
