package k;

import Z.S;
import b0.AbstractC0497e;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;

/* renamed from: k.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726B extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7234e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7235i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7236j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7237k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0726B(Object obj, long j4, long j5, Object obj2, int i2) {
        super(1);
        this.f7233d = i2;
        this.f7236j = obj;
        this.f7234e = j4;
        this.f7235i = j5;
        this.f7237k = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7233d) {
            case 0:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                long j4 = this.f7234e;
                long j5 = this.f7235i;
                P.h hVar = (P.h) this.f7237k;
                AbstractC0954O abstractC0954O = (AbstractC0954O) this.f7236j;
                abstractC0953N.getClass();
                long g4 = j0.c.g(((int) (j4 >> 32)) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L)));
                AbstractC0953N.a(abstractC0953N, abstractC0954O);
                abstractC0954O.n0(M0.h.c(g4, abstractC0954O.f9009k), 0.0f, hVar);
                break;
            default:
                r0.G g5 = (r0.G) obj;
                g5.a();
                InterfaceC0496d.R(g5, (S) this.f7236j, this.f7234e, this.f7235i, 0.0f, (AbstractC0497e) this.f7237k, 104);
                break;
        }
        return Unit.f7487a;
    }
}
