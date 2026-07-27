package k;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.m0;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748n extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f7306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f7307e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f7308i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0730F f7309j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0731G f7310k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f7311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.a f7312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f7313n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0748n(m0 m0Var, Function1 function1, S.o oVar, C0730F c0730f, C0731G c0731g, Function2 function2, O.a aVar, int i2) {
        super(2);
        this.f7306d = m0Var;
        this.f7307e = function1;
        this.f7308i = oVar;
        this.f7309j = c0730f;
        this.f7310k = c0731g;
        this.f7311l = function2;
        this.f7312m = aVar;
        this.f7313n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f7313n | 1);
        O.a aVar = this.f7312m;
        C0731G c0731g = this.f7310k;
        Function2 function2 = this.f7311l;
        androidx.compose.animation.a.a(this.f7306d, this.f7307e, this.f7308i, this.f7309j, c0731g, function2, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
