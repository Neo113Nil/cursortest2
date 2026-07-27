package m;

import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C0900n;
import o.C0904p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class d0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public e3.a f8096k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8097l;

    /* renamed from: m, reason: collision with root package name */
    public C0904p f8098m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f8099n;

    /* renamed from: o, reason: collision with root package name */
    public int f8100o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8101p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b0 f8102q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e0 f8103r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0900n f8104s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0904p f8105t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, e0 e0Var, C0900n c0900n, C0904p c0904p, C2.a aVar) {
        super(2, aVar);
        this.f8102q = b0Var;
        this.f8103r = e0Var;
        this.f8104s = c0900n;
        this.f8105t = c0904p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((d0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        d0 d0Var = new d0(this.f8102q, this.f8103r, this.f8104s, this.f8105t, aVar);
        d0Var.f8101p = obj;
        return d0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // E2.a
    public final Object l(Object obj) {
        e0 e0Var;
        C0904p c0904p;
        c0 c0Var;
        e3.a aVar;
        Function2 function2;
        c0 c0Var2;
        e0 e0Var2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        D2.a aVar2 = D2.a.f2163d;
        ?? r12 = this.f8100o;
        try {
            try {
                if (r12 == 0) {
                    AbstractC1343r.b(obj);
                    CoroutineContext.Element k4 = ((InterfaceC0302y) this.f8101p).q().k(C0299v.f4296e);
                    Intrinsics.c(k4);
                    c0 c0Var3 = new c0(this.f8102q, (InterfaceC0280c0) k4);
                    while (true) {
                        e0Var = this.f8103r;
                        AtomicReference atomicReference3 = e0Var.f8109a;
                        c0 c0Var4 = (c0) atomicReference3.get();
                        if (c0Var4 != null && c0Var3.f8087a.compareTo(c0Var4.f8087a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c0Var4, c0Var3)) {
                            if (atomicReference3.get() != c0Var4) {
                                break;
                            }
                        }
                        if (c0Var4 != null) {
                            c0Var4.f8088b.a(new G.V("Mutation interrupted", 5));
                        }
                        this.f8101p = c0Var3;
                        e3.c cVar = e0Var.f8110b;
                        this.f8096k = cVar;
                        C0900n c0900n = this.f8104s;
                        this.f8097l = c0900n;
                        C0904p c0904p2 = this.f8105t;
                        this.f8098m = c0904p2;
                        this.f8099n = e0Var;
                        this.f8100o = 1;
                        if (cVar.c(null, this) == aVar2) {
                            return aVar2;
                        }
                        c0904p = c0904p2;
                        c0Var = c0Var3;
                        aVar = cVar;
                        function2 = c0900n;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e0Var2 = (e0) this.f8097l;
                        aVar = this.f8096k;
                        c0Var2 = (c0) this.f8101p;
                        try {
                            AbstractC1343r.b(obj);
                            atomicReference2 = e0Var2.f8109a;
                            while (!atomicReference2.compareAndSet(c0Var2, null) && atomicReference2.get() == c0Var2) {
                            }
                            ((e3.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = e0Var2.f8109a;
                            while (!atomicReference.compareAndSet(c0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    e0 e0Var3 = this.f8099n;
                    c0904p = this.f8098m;
                    function2 = (Function2) this.f8097l;
                    e3.a aVar3 = this.f8096k;
                    c0Var = (c0) this.f8101p;
                    AbstractC1343r.b(obj);
                    e0Var = e0Var3;
                    aVar = aVar3;
                }
                this.f8101p = c0Var;
                this.f8096k = aVar;
                this.f8097l = e0Var;
                this.f8098m = null;
                this.f8099n = null;
                this.f8100o = 2;
                Object h4 = function2.h(c0904p, this);
                if (h4 == aVar2) {
                    return aVar2;
                }
                e0Var2 = e0Var;
                obj = h4;
                c0Var2 = c0Var;
                atomicReference2 = e0Var2.f8109a;
                while (!atomicReference2.compareAndSet(c0Var2, null)) {
                }
                ((e3.c) aVar).e(null);
                return obj;
            } catch (Throwable th3) {
                c0Var2 = c0Var;
                e0Var2 = e0Var;
                th = th3;
                atomicReference = e0Var2.f8109a;
                while (!atomicReference.compareAndSet(c0Var2, null) && atomicReference.get() == c0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((e3.c) r12).e(null);
            throw th4;
        }
    }
}
