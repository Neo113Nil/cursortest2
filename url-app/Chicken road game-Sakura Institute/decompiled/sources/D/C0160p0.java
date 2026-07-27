package D;

import G.C0192d;
import G.C0216p;
import f0.C0585f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160p0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0585f f1961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f1962e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1964j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1965k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160p0(C0585f c0585f, S.o oVar, long j4, int i2, int i4) {
        super(2);
        this.f1961d = c0585f;
        this.f1962e = oVar;
        this.f1963i = j4;
        this.f1964j = i2;
        this.f1965k = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1964j | 1);
        C0585f c0585f = this.f1961d;
        AbstractC0165r0.a(c0585f, this.f1962e, this.f1963i, (C0216p) obj, U3, this.f1965k);
        return Unit.f7487a;
    }
}
