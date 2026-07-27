package f1;

import h1.C0658k;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class M extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public M2.C f6512k;

    /* renamed from: l, reason: collision with root package name */
    public int f6513l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6514m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M2.C f6515n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f6516o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f6517p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f6518q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(M2.C c4, N n2, Object obj, boolean z4, C2.a aVar) {
        super(2, aVar);
        this.f6515n = c4;
        this.f6516o = n2;
        this.f6517p = obj;
        this.f6518q = z4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((M) j((C2.a) obj2, (C0658k) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        M m4 = new M(this.f6515n, this.f6516o, this.f6517p, this.f6518q, aVar);
        m4.f6514m = obj;
        return m4;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        M2.C c4;
        C0658k c0658k;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6513l;
        M2.C c5 = this.f6515n;
        Object obj2 = this.f6517p;
        N n2 = this.f6516o;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0658k c0658k2 = (C0658k) this.f6514m;
            X e4 = n2.e();
            this.f6514m = c0658k2;
            this.f6512k = c5;
            this.f6513l = 1;
            Integer num = new Integer(((AtomicInteger) e4.f6555b.f6561e).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            c4 = c5;
            c0658k = c0658k2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                if (this.f6518q) {
                    n2.f6525m.y(new C0610d(obj2 != null ? obj2.hashCode() : 0, c5.f3578d, obj2));
                }
                return Unit.f7487a;
            }
            c4 = this.f6512k;
            c0658k = (C0658k) this.f6514m;
            AbstractC1343r.b(obj);
        }
        c4.f3578d = ((Number) obj).intValue();
        this.f6514m = null;
        this.f6512k = null;
        this.f6513l = 2;
        if (c0658k.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f6518q) {
        }
        return Unit.f7487a;
    }
}
