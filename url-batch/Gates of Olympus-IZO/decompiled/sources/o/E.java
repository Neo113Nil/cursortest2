package o;

import h1.C0438i;
import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class E extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public Z1.t f6429e;

    /* renamed from: f, reason: collision with root package name */
    public Z1.t f6430f;

    /* renamed from: g, reason: collision with root package name */
    public int f6431g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0 f6433i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(g0 g0Var, P1.d dVar) {
        super(2, dVar);
        this.f6433i = g0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        E e3 = new E(this.f6433i, dVar);
        e3.f6432h = obj;
        return e3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((E) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)(1:45)|(1:44)|27|28|29|(2:34|(2:36|(1:38)))(2:31|(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:29:0x00bb, B:31:0x00c1, B:34:0x00d8, B:36:0x00dc), top: B:28:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:29:0x00bb, B:31:0x00c1, B:34:0x00d8, B:36:0x00dc), top: B:28:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6 A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0035, blocks: (B:23:0x0097, B:45:0x00b6, B:59:0x002f), top: B:58:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f5 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0550w interfaceC0550w;
        Z1.t tVar;
        Z1.t tVar2;
        Z1.t tVar3;
        InterfaceC0550w interfaceC0550w2;
        InterfaceC0550w interfaceC0550w3;
        Object obj2;
        Object e3;
        AbstractC0744u abstractC0744u;
        Object obj3;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6431g;
        g0 g0Var = this.f6433i;
        switch (i3) {
            case 0:
                I2.l.Q(obj);
                interfaceC0550w = (InterfaceC0550w) this.f6432h;
                if (!AbstractC0552y.o(interfaceC0550w)) {
                    tVar = new Z1.t();
                    m2.e eVar = g0Var.f6526w;
                    if (eVar != null) {
                        this.f6432h = interfaceC0550w;
                        this.f6429e = tVar;
                        this.f6430f = tVar;
                        this.f6431g = 1;
                        obj = eVar.c(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        tVar2 = tVar;
                        abstractC0744u = (AbstractC0744u) obj;
                        tVar.f3480d = abstractC0744u;
                        obj3 = tVar2.f3480d;
                        if (obj3 instanceof C0742s) {
                            this.f6432h = interfaceC0550w;
                            this.f6429e = tVar2;
                            this.f6430f = null;
                            this.f6431g = 2;
                            if (g0.z0(g0Var, (C0742s) obj3, this) == aVar) {
                                return aVar;
                            }
                            tVar3 = tVar2;
                            interfaceC0550w2 = interfaceC0550w;
                            D d3 = new D(tVar3, g0Var, null);
                            this.f6432h = interfaceC0550w2;
                            this.f6429e = tVar3;
                            this.f6431g = 3;
                            n.X x3 = n.X.f6037e;
                            o0 o0Var = g0Var.f6516F;
                            e3 = o0Var.e(x3, new Y(d3, o0Var, null), this);
                            if (e3 == Q1.a.f3113d) {
                                e3 = L1.z.f2729a;
                            }
                            if (e3 == aVar) {
                                return aVar;
                            }
                            interfaceC0550w = interfaceC0550w2;
                            obj2 = tVar3.f3480d;
                            if (obj2 instanceof C0743t) {
                                Z1.i.d(obj2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                this.f6432h = interfaceC0550w;
                                this.f6429e = null;
                                this.f6431g = 4;
                                if (g0.A0(g0Var, (C0743t) obj2, this) == aVar) {
                                    return aVar;
                                }
                            } else if (obj2 instanceof C0741q) {
                                this.f6432h = interfaceC0550w;
                                this.f6429e = null;
                                this.f6431g = 5;
                                if (g0.y0(g0Var, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        if (!AbstractC0552y.o(interfaceC0550w)) {
                            return L1.z.f2729a;
                        }
                    } else {
                        tVar2 = tVar;
                        abstractC0744u = null;
                        tVar.f3480d = abstractC0744u;
                        obj3 = tVar2.f3480d;
                        if (obj3 instanceof C0742s) {
                        }
                        if (!AbstractC0552y.o(interfaceC0550w)) {
                        }
                    }
                }
            case 1:
                tVar = this.f6430f;
                tVar2 = this.f6429e;
                interfaceC0550w = (InterfaceC0550w) this.f6432h;
                I2.l.Q(obj);
                abstractC0744u = (AbstractC0744u) obj;
                tVar.f3480d = abstractC0744u;
                obj3 = tVar2.f3480d;
                if (obj3 instanceof C0742s) {
                }
                if (!AbstractC0552y.o(interfaceC0550w)) {
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                tVar3 = this.f6429e;
                interfaceC0550w2 = (InterfaceC0550w) this.f6432h;
                I2.l.Q(obj);
                D d32 = new D(tVar3, g0Var, null);
                this.f6432h = interfaceC0550w2;
                this.f6429e = tVar3;
                this.f6431g = 3;
                n.X x32 = n.X.f6037e;
                o0 o0Var2 = g0Var.f6516F;
                e3 = o0Var2.e(x32, new Y(d32, o0Var2, null), this);
                if (e3 == Q1.a.f3113d) {
                }
                if (e3 == aVar) {
                }
                interfaceC0550w = interfaceC0550w2;
                obj2 = tVar3.f3480d;
                if (obj2 instanceof C0743t) {
                }
                if (!AbstractC0552y.o(interfaceC0550w)) {
                }
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                tVar3 = this.f6429e;
                interfaceC0550w2 = (InterfaceC0550w) this.f6432h;
                try {
                    I2.l.Q(obj);
                } catch (CancellationException unused) {
                    interfaceC0550w3 = interfaceC0550w2;
                    this.f6432h = interfaceC0550w3;
                    this.f6429e = null;
                    this.f6431g = 6;
                    if (g0.y0(g0Var, this) == aVar) {
                    }
                    interfaceC0550w = interfaceC0550w3;
                    if (!AbstractC0552y.o(interfaceC0550w)) {
                    }
                }
                interfaceC0550w = interfaceC0550w2;
                obj2 = tVar3.f3480d;
                if (obj2 instanceof C0743t) {
                }
                if (!AbstractC0552y.o(interfaceC0550w)) {
                }
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                interfaceC0550w3 = (InterfaceC0550w) this.f6432h;
                try {
                    I2.l.Q(obj);
                } catch (CancellationException unused2) {
                    this.f6432h = interfaceC0550w3;
                    this.f6429e = null;
                    this.f6431g = 6;
                    if (g0.y0(g0Var, this) == aVar) {
                        return aVar;
                    }
                    interfaceC0550w = interfaceC0550w3;
                    if (!AbstractC0552y.o(interfaceC0550w)) {
                    }
                }
                interfaceC0550w = interfaceC0550w3;
                if (!AbstractC0552y.o(interfaceC0550w)) {
                }
                break;
            case 5:
                interfaceC0550w3 = (InterfaceC0550w) this.f6432h;
                I2.l.Q(obj);
                interfaceC0550w = interfaceC0550w3;
                if (!AbstractC0552y.o(interfaceC0550w)) {
                }
                break;
            case 6:
                interfaceC0550w3 = (InterfaceC0550w) this.f6432h;
                I2.l.Q(obj);
                interfaceC0550w = interfaceC0550w3;
                if (!AbstractC0552y.o(interfaceC0550w)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
