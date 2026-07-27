package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p.C0935k;

/* renamed from: D.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175u1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f2044e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f2045i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2046j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2047k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2048l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0935k f2049m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O.a f2050n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2051o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175u1(boolean z4, Function0 function0, S.o oVar, boolean z5, long j4, long j5, C0935k c0935k, O.a aVar, int i2) {
        super(2);
        this.f2043d = z4;
        this.f2044e = function0;
        this.f2045i = oVar;
        this.f2046j = z5;
        this.f2047k = j4;
        this.f2048l = j5;
        this.f2049m = c0935k;
        this.f2050n = aVar;
        this.f2051o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f2051o | 1);
        O.a aVar = this.f2050n;
        long j4 = this.f2047k;
        long j5 = this.f2048l;
        z1.a(this.f2043d, this.f2044e, this.f2045i, this.f2046j, j4, j5, this.f2049m, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
