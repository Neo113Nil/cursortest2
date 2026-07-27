package P0;

import Z2.G;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import w.P;
import y.C1316f;

/* renamed from: P0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261c extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3709e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3710i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3711j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3712k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0261c(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(0);
        this.f3708d = i2;
        this.f3709e = obj;
        this.f3710i = obj2;
        this.f3711j = obj3;
        this.f3712k = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Z2.y i2;
        switch (this.f3708d) {
            case 0:
                ((y) this.f3709e).h((Function0) this.f3710i, (w) this.f3711j, (M0.k) this.f3712k);
                return Unit.f7487a;
            default:
                if (!((P) this.f3709e).b()) {
                    ((X.p) this.f3710i).a(X.i.f4327k);
                }
                int i4 = ((G0.m) this.f3711j).f3071d;
                if (!G0.o.a(i4, 7) && !G0.o.a(i4, 8) && (i2 = ((C1316f) this.f3712k).i()) != null) {
                    ((G) i2).b(Unit.f7487a);
                }
                return Boolean.TRUE;
        }
    }
}
