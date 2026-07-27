package l;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774b extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public C0788n f7676k;

    /* renamed from: l, reason: collision with root package name */
    public M2.A f7677l;

    /* renamed from: m, reason: collision with root package name */
    public int f7678m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0778d f7679n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f7680o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0 f7681p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f7682q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function1 f7683r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774b(C0778d c0778d, Object obj, e0 e0Var, long j4, Function1 function1, C2.a aVar) {
        super(1, aVar);
        this.f7679n = c0778d;
        this.f7680o = obj;
        this.f7681p = e0Var;
        this.f7682q = j4;
        this.f7683r = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e0 e0Var = this.f7681p;
        return new C0774b(this.f7679n, this.f7680o, e0Var, this.f7682q, this.f7683r, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        M2.A a4;
        C0788n c0788n;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7678m;
        int i4 = 1;
        C0778d c0778d = this.f7679n;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                c0778d.f7700c.f7814i = (AbstractC0792s) c0778d.f7698a.f7853a.invoke(this.f7680o);
                e0 e0Var = this.f7681p;
                c0778d.f7702e.setValue(e0Var.f7739c);
                c0778d.f7701d.setValue(Boolean.TRUE);
                C0788n c0788n2 = c0778d.f7700c;
                C0788n c0788n3 = new C0788n(c0788n2.f7812d, c0788n2.f7813e.getValue(), AbstractC0779e.f(c0788n2.f7814i), c0788n2.f7815j, Long.MIN_VALUE, c0788n2.f7817l);
                M2.A a5 = new M2.A();
                long j4 = this.f7682q;
                C0772a c0772a = new C0772a(c0778d, c0788n3, this.f7683r, a5, 0);
                this.f7676k = c0788n3;
                this.f7677l = a5;
                this.f7678m = 1;
                if (AbstractC0779e.b(c0788n3, e0Var, j4, c0772a, this) == aVar) {
                    return aVar;
                }
                a4 = a5;
                c0788n = c0788n3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a4 = this.f7677l;
                c0788n = this.f7676k;
                AbstractC1343r.b(obj);
            }
            if (!a4.f3576d) {
                i4 = 2;
            }
            C0778d.b(c0778d);
            return new C0785k(c0788n, i4);
        } catch (CancellationException e4) {
            C0778d.b(c0778d);
            throw e4;
        }
    }
}
