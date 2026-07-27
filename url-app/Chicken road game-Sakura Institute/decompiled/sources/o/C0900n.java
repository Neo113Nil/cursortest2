package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900n extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8832k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0906q f8834m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function2 f8835n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0900n(C0906q c0906q, Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f8834m = c0906q;
        this.f8835n = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0900n) j((C2.a) obj2, (S) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0900n c0900n = new C0900n(this.f8834m, this.f8835n, aVar);
        c0900n.f8833l = obj;
        return c0900n;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8832k;
        C0906q c0906q = this.f8834m;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                S s4 = (S) this.f8833l;
                c0906q.f8857d.setValue(Boolean.TRUE);
                Function2 function2 = this.f8835n;
                this.f8832k = 1;
                if (function2.h(s4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
            }
            c0906q.f8857d.setValue(Boolean.FALSE);
            return Unit.f7487a;
        } catch (Throwable th) {
            c0906q.f8857d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
