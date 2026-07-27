package f1;

import W2.C0292n;
import W2.InterfaceC0302y;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class I extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6500k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f6502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.j f6503n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(N n2, Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f6502m = n2;
        this.f6503n = (E2.j) function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((I) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        I i2 = new I(this.f6502m, this.f6503n, aVar);
        i2.f6501l = obj;
        return i2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6500k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f6501l;
            C0292n c0292n = new C0292n(true);
            c0292n.R(null);
            N n2 = this.f6502m;
            P p4 = new P(this.f6503n, c0292n, n2.f6525m.w(), interfaceC0302y.q());
            Y0.b bVar = n2.f6529q;
            Object o4 = ((Y2.e) bVar.f4392k).o(p4);
            if (o4 instanceof Y2.j) {
                Y2.j jVar = (Y2.j) o4;
                if (jVar == null) {
                    jVar = null;
                }
                Throwable th = jVar != null ? jVar.f4442a : null;
                if (th == null) {
                    throw new U1.a("Channel was closed normally");
                }
                throw th;
            }
            if (o4 instanceof Y2.k) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((C0607a) bVar.f4389e).f6561e).getAndIncrement() == 0) {
                W2.B.m((InterfaceC0302y) bVar.f4390i, null, null, new T(bVar, null), 3);
            }
            this.f6500k = 1;
            obj = c0292n.h0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
