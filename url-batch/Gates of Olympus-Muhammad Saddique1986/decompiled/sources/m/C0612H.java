package m;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C0832t;
import q2.InterfaceC0835w;

/* renamed from: m.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612H extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public y2.a f6610h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6611i;

    /* renamed from: j, reason: collision with root package name */
    public C0613I f6612j;

    /* renamed from: k, reason: collision with root package name */
    public int f6613k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6614l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6615m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0613I f6616n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X1.i f6617o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0612H(int i3, C0613I c0613i, InterfaceC0424c interfaceC0424c, V1.d dVar) {
        super(2, dVar);
        this.f6615m = i3;
        this.f6616n = c0613i;
        this.f6617o = (X1.i) interfaceC0424c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0612H) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.c] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0612H c0612h = new C0612H(this.f6615m, this.f6616n, this.f6617o, dVar);
        c0612h.f6614l = obj;
        return c0612h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [e2.c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [y2.a] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0613I c0613i;
        ?? r3;
        C0611G c0611g;
        y2.c cVar;
        y2.a aVar;
        C0611G c0611g2;
        C0613I c0613i2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        W1.a aVar2 = W1.a.f4608d;
        ?? r12 = this.f6613k;
        try {
            try {
                if (r12 == 0) {
                    R1.a.e(obj);
                    V1.g v3 = ((InterfaceC0835w) this.f6614l).q().v(C0832t.f7929e);
                    f2.j.c(v3);
                    C0611G c0611g3 = new C0611G(this.f6615m, (q2.X) v3);
                    while (true) {
                        c0613i = this.f6616n;
                        AtomicReference atomicReference3 = c0613i.f6618a;
                        C0611G c0611g4 = (C0611G) atomicReference3.get();
                        if (c0611g4 != null) {
                            int i3 = c0611g3.f6608a;
                            int i4 = c0611g4.f6608a;
                            if (i3 == 0 || i4 == 0) {
                                break;
                            }
                            if (i3 - i4 < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(c0611g4, c0611g3)) {
                            if (atomicReference3.get() != c0611g4) {
                                break;
                            }
                        }
                        if (c0611g4 != null) {
                            c0611g4.f6609b.a(new I.V("Mutation interrupted", 2));
                        }
                        this.f6614l = c0611g3;
                        y2.c cVar2 = c0613i.f6619b;
                        this.f6610h = cVar2;
                        X1.i iVar = this.f6617o;
                        this.f6611i = iVar;
                        this.f6612j = c0613i;
                        this.f6613k = 1;
                        if (cVar2.c(null, this) == aVar2) {
                            return aVar2;
                        }
                        r3 = iVar;
                        c0611g = c0611g3;
                        cVar = cVar2;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0613i2 = (C0613I) this.f6611i;
                        aVar = this.f6610h;
                        c0611g2 = (C0611G) this.f6614l;
                        try {
                            R1.a.e(obj);
                            atomicReference2 = c0613i2.f6618a;
                            while (!atomicReference2.compareAndSet(c0611g2, null) && atomicReference2.get() == c0611g2) {
                            }
                            ((y2.c) aVar).e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = c0613i2.f6618a;
                            while (!atomicReference.compareAndSet(c0611g2, null) && atomicReference.get() == c0611g2) {
                            }
                            throw th;
                        }
                    }
                    C0613I c0613i3 = this.f6612j;
                    InterfaceC0424c interfaceC0424c = (InterfaceC0424c) this.f6611i;
                    ?? r5 = this.f6610h;
                    c0611g = (C0611G) this.f6614l;
                    R1.a.e(obj);
                    c0613i = c0613i3;
                    r3 = interfaceC0424c;
                    cVar = r5;
                }
                this.f6614l = c0611g;
                this.f6610h = aVar;
                this.f6611i = c0613i;
                this.f6612j = null;
                this.f6613k = 2;
                Object n3 = r3.n(this);
                if (n3 == aVar2) {
                    return aVar2;
                }
                c0613i2 = c0613i;
                obj = n3;
                c0611g2 = c0611g;
                atomicReference2 = c0613i2.f6618a;
                while (!atomicReference2.compareAndSet(c0611g2, null)) {
                }
                ((y2.c) aVar).e(null);
                return obj;
            } catch (Throwable th3) {
                c0611g2 = c0611g;
                c0613i2 = c0613i;
                th = th3;
                atomicReference = c0613i2.f6618a;
                while (!atomicReference.compareAndSet(c0611g2, null)) {
                }
                throw th;
            }
            aVar = cVar;
        } catch (Throwable th4) {
            ((y2.c) r12).e(null);
            throw th4;
        }
    }
}
