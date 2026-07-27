package l;

import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763H extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public e3.a f7572k;

    /* renamed from: l, reason: collision with root package name */
    public Object f7573l;

    /* renamed from: m, reason: collision with root package name */
    public C0764I f7574m;

    /* renamed from: n, reason: collision with root package name */
    public int f7575n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f7576o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7577p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0764I f7578q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E2.j f7579r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0763H(int i2, C0764I c0764i, Function1 function1, C2.a aVar) {
        super(2, aVar);
        this.f7577p = i2;
        this.f7578q = c0764i;
        this.f7579r = (E2.j) function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0763H) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, kotlin.jvm.functions.Function1] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0763H c0763h = new C0763H(this.f7577p, this.f7578q, this.f7579r, aVar);
        c0763h.f7576o = obj;
        return c0763h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [e3.a] */
    @Override // E2.a
    public final Object l(Object obj) {
        C0764I c0764i;
        ?? r32;
        C0762G c0762g;
        e3.c cVar;
        e3.a aVar;
        C0762G c0762g2;
        C0764I c0764i2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        D2.a aVar2 = D2.a.f2163d;
        ?? r12 = this.f7575n;
        try {
            try {
                if (r12 == 0) {
                    AbstractC1343r.b(obj);
                    CoroutineContext.Element k4 = ((InterfaceC0302y) this.f7576o).q().k(C0299v.f4296e);
                    Intrinsics.c(k4);
                    C0762G c0762g3 = new C0762G(this.f7577p, (InterfaceC0280c0) k4);
                    while (true) {
                        c0764i = this.f7578q;
                        AtomicReference atomicReference3 = c0764i.f7580a;
                        C0762G c0762g4 = (C0762G) atomicReference3.get();
                        if (c0762g4 != null && AbstractC0784j.a(c0762g3.f7570a, c0762g4.f7570a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c0762g4, c0762g3)) {
                            if (atomicReference3.get() != c0762g4) {
                                break;
                            }
                        }
                        if (c0762g4 != null) {
                            c0762g4.f7571b.a(new G.V("Mutation interrupted", 3));
                        }
                        this.f7576o = c0762g3;
                        e3.c cVar2 = c0764i.f7581b;
                        this.f7572k = cVar2;
                        E2.j jVar = this.f7579r;
                        this.f7573l = jVar;
                        this.f7574m = c0764i;
                        this.f7575n = 1;
                        if (cVar2.c(null, this) == aVar2) {
                            return aVar2;
                        }
                        r32 = jVar;
                        c0762g = c0762g3;
                        cVar = cVar2;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0764i2 = (C0764I) this.f7573l;
                        aVar = this.f7572k;
                        c0762g2 = (C0762G) this.f7576o;
                        try {
                            AbstractC1343r.b(obj);
                            atomicReference2 = c0764i2.f7580a;
                            while (!atomicReference2.compareAndSet(c0762g2, null) && atomicReference2.get() == c0762g2) {
                            }
                            ((e3.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = c0764i2.f7580a;
                            while (!atomicReference.compareAndSet(c0762g2, null)) {
                            }
                            throw th;
                        }
                    }
                    C0764I c0764i3 = this.f7574m;
                    Function1 function1 = (Function1) this.f7573l;
                    ?? r5 = this.f7572k;
                    c0762g = (C0762G) this.f7576o;
                    AbstractC1343r.b(obj);
                    c0764i = c0764i3;
                    r32 = function1;
                    cVar = r5;
                }
                this.f7576o = c0762g;
                this.f7572k = aVar;
                this.f7573l = c0764i;
                this.f7574m = null;
                this.f7575n = 2;
                Object invoke = r32.invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                c0764i2 = c0764i;
                obj = invoke;
                c0762g2 = c0762g;
                atomicReference2 = c0764i2.f7580a;
                while (!atomicReference2.compareAndSet(c0762g2, null)) {
                }
                ((e3.c) aVar).e(null);
                return obj;
            } catch (Throwable th3) {
                c0762g2 = c0762g;
                c0764i2 = c0764i;
                th = th3;
                atomicReference = c0764i2.f7580a;
                while (!atomicReference.compareAndSet(c0762g2, null) && atomicReference.get() == c0762g2) {
                }
                throw th;
            }
            aVar = cVar;
        } catch (Throwable th4) {
            ((e3.c) r12).e(null);
            throw th4;
        }
    }
}
