package o;

import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class K extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public M2.E f8647k;

    /* renamed from: l, reason: collision with root package name */
    public M2.E f8648l;

    /* renamed from: m, reason: collision with root package name */
    public int f8649m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8650n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8651o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C0891i0 c0891i0, C2.a aVar) {
        super(2, aVar);
        this.f8651o = c0891i0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((K) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        K k4 = new K(this.f8651o, aVar);
        k4.f8650n = obj;
        return k4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)(1:45)|(1:44)|27|28|29|(2:34|(2:36|(1:38)))(2:31|(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0 A[Catch: CancellationException -> 0x00d5, TryCatch #1 {CancellationException -> 0x00d5, blocks: (B:29:0x00ba, B:31:0x00c0, B:34:0x00d7, B:36:0x00db), top: B:28:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7 A[Catch: CancellationException -> 0x00d5, TryCatch #1 {CancellationException -> 0x00d5, blocks: (B:29:0x00ba, B:31:0x00c0, B:34:0x00d7, B:36:0x00db), top: B:28:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0035, blocks: (B:23:0x0097, B:45:0x00b5, B:59:0x002f), top: B:58:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d2 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e6 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f4 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0302y interfaceC0302y;
        M2.E e4;
        M2.E e5;
        M2.E e6;
        InterfaceC0302y interfaceC0302y2;
        InterfaceC0302y interfaceC0302y3;
        Object obj2;
        Object e7;
        AbstractC0915v abstractC0915v;
        Object obj3;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8649m;
        C0891i0 c0891i0 = this.f8651o;
        switch (i2) {
            case 0:
                AbstractC1343r.b(obj);
                interfaceC0302y = (InterfaceC0302y) this.f8650n;
                if (!W2.B.k(interfaceC0302y)) {
                    e4 = new M2.E();
                    Y2.e eVar = c0891i0.f8801z;
                    if (eVar != null) {
                        this.f8650n = interfaceC0302y;
                        this.f8647k = e4;
                        this.f8648l = e4;
                        this.f8649m = 1;
                        obj = eVar.l(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        e5 = e4;
                        abstractC0915v = (AbstractC0915v) obj;
                        e4.f3580d = abstractC0915v;
                        obj3 = e5.f3580d;
                        if (obj3 instanceof C0911t) {
                            this.f8650n = interfaceC0302y;
                            this.f8647k = e5;
                            this.f8648l = null;
                            this.f8649m = 2;
                            if (C0891i0.F0(c0891i0, (C0911t) obj3, this) == aVar) {
                                return aVar;
                            }
                            e6 = e5;
                            interfaceC0302y2 = interfaceC0302y;
                            J j4 = new J(e6, c0891i0, null);
                            this.f8650n = interfaceC0302y2;
                            this.f8647k = e6;
                            this.f8649m = 3;
                            m.b0 b0Var = m.b0.f8080e;
                            C0908r0 c0908r0 = c0891i0.f8791I;
                            e7 = c0908r0.e(b0Var, new C0875a0(j4, c0908r0, null), this);
                            if (e7 == D2.a.f2163d) {
                                e7 = Unit.f7487a;
                            }
                            if (e7 == aVar) {
                                return aVar;
                            }
                            interfaceC0302y = interfaceC0302y2;
                            obj2 = e6.f3580d;
                            if (obj2 instanceof C0913u) {
                                Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                this.f8650n = interfaceC0302y;
                                this.f8647k = null;
                                this.f8649m = 4;
                                if (C0891i0.G0(c0891i0, (C0913u) obj2, this) == aVar) {
                                    return aVar;
                                }
                            } else if (obj2 instanceof r) {
                                this.f8650n = interfaceC0302y;
                                this.f8647k = null;
                                this.f8649m = 5;
                                if (C0891i0.E0(c0891i0, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        if (!W2.B.k(interfaceC0302y)) {
                            return Unit.f7487a;
                        }
                    } else {
                        e5 = e4;
                        abstractC0915v = null;
                        e4.f3580d = abstractC0915v;
                        obj3 = e5.f3580d;
                        if (obj3 instanceof C0911t) {
                        }
                        if (!W2.B.k(interfaceC0302y)) {
                        }
                    }
                }
            case 1:
                e4 = this.f8648l;
                e5 = this.f8647k;
                interfaceC0302y = (InterfaceC0302y) this.f8650n;
                AbstractC1343r.b(obj);
                abstractC0915v = (AbstractC0915v) obj;
                e4.f3580d = abstractC0915v;
                obj3 = e5.f3580d;
                if (obj3 instanceof C0911t) {
                }
                if (!W2.B.k(interfaceC0302y)) {
                }
                break;
            case 2:
                e6 = this.f8647k;
                interfaceC0302y2 = (InterfaceC0302y) this.f8650n;
                AbstractC1343r.b(obj);
                J j42 = new J(e6, c0891i0, null);
                this.f8650n = interfaceC0302y2;
                this.f8647k = e6;
                this.f8649m = 3;
                m.b0 b0Var2 = m.b0.f8080e;
                C0908r0 c0908r02 = c0891i0.f8791I;
                e7 = c0908r02.e(b0Var2, new C0875a0(j42, c0908r02, null), this);
                if (e7 == D2.a.f2163d) {
                }
                if (e7 == aVar) {
                }
                interfaceC0302y = interfaceC0302y2;
                obj2 = e6.f3580d;
                if (obj2 instanceof C0913u) {
                }
                if (!W2.B.k(interfaceC0302y)) {
                }
                break;
            case 3:
                e6 = this.f8647k;
                interfaceC0302y2 = (InterfaceC0302y) this.f8650n;
                try {
                    AbstractC1343r.b(obj);
                } catch (CancellationException unused) {
                    interfaceC0302y3 = interfaceC0302y2;
                    this.f8650n = interfaceC0302y3;
                    this.f8647k = null;
                    this.f8649m = 6;
                    if (C0891i0.E0(c0891i0, this) == aVar) {
                    }
                    interfaceC0302y = interfaceC0302y3;
                    if (!W2.B.k(interfaceC0302y)) {
                    }
                }
                interfaceC0302y = interfaceC0302y2;
                obj2 = e6.f3580d;
                if (obj2 instanceof C0913u) {
                }
                if (!W2.B.k(interfaceC0302y)) {
                }
                break;
            case 4:
                interfaceC0302y3 = (InterfaceC0302y) this.f8650n;
                try {
                    AbstractC1343r.b(obj);
                } catch (CancellationException unused2) {
                    this.f8650n = interfaceC0302y3;
                    this.f8647k = null;
                    this.f8649m = 6;
                    if (C0891i0.E0(c0891i0, this) == aVar) {
                        return aVar;
                    }
                    interfaceC0302y = interfaceC0302y3;
                    if (!W2.B.k(interfaceC0302y)) {
                    }
                }
                interfaceC0302y = interfaceC0302y3;
                if (!W2.B.k(interfaceC0302y)) {
                }
                break;
            case 5:
                interfaceC0302y3 = (InterfaceC0302y) this.f8650n;
                AbstractC1343r.b(obj);
                interfaceC0302y = interfaceC0302y3;
                if (!W2.B.k(interfaceC0302y)) {
                }
                break;
            case 6:
                interfaceC0302y3 = (InterfaceC0302y) this.f8650n;
                AbstractC1343r.b(obj);
                interfaceC0302y = interfaceC0302y3;
                if (!W2.B.k(interfaceC0302y)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
