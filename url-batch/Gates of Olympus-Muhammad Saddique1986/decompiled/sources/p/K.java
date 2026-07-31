package p;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class K extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public f2.u f7544h;

    /* renamed from: i, reason: collision with root package name */
    public f2.u f7545i;

    /* renamed from: j, reason: collision with root package name */
    public int f7546j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7547k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7548l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C0776m0 c0776m0, V1.d dVar) {
        super(2, dVar);
        this.f7548l = c0776m0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((K) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        K k3 = new K(this.f7548l, dVar);
        k3.f7547k = obj;
        return k3;
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
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC0835w interfaceC0835w;
        f2.u uVar;
        f2.u uVar2;
        f2.u uVar3;
        InterfaceC0835w interfaceC0835w2;
        InterfaceC0835w interfaceC0835w3;
        Object obj2;
        Object e3;
        AbstractC0792v abstractC0792v;
        Object obj3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7546j;
        C0776m0 c0776m0 = this.f7548l;
        switch (i3) {
            case 0:
                R1.a.e(obj);
                interfaceC0835w = (InterfaceC0835w) this.f7547k;
                if (!AbstractC0837y.p(interfaceC0835w)) {
                    uVar = new f2.u();
                    s2.g gVar = c0776m0.f7730w;
                    if (gVar != null) {
                        this.f7547k = interfaceC0835w;
                        this.f7544h = uVar;
                        this.f7545i = uVar;
                        this.f7546j = 1;
                        obj = gVar.i(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        uVar2 = uVar;
                        abstractC0792v = (AbstractC0792v) obj;
                        uVar.f5832d = abstractC0792v;
                        obj3 = uVar2.f5832d;
                        if (obj3 instanceof C0788t) {
                            this.f7547k = interfaceC0835w;
                            this.f7544h = uVar2;
                            this.f7545i = null;
                            this.f7546j = 2;
                            if (C0776m0.C0(c0776m0, (C0788t) obj3, this) == aVar) {
                                return aVar;
                            }
                            uVar3 = uVar2;
                            interfaceC0835w2 = interfaceC0835w;
                            J j3 = new J(uVar3, c0776m0, null);
                            this.f7547k = interfaceC0835w2;
                            this.f7544h = uVar3;
                            this.f7546j = 3;
                            n.e0 e0Var = n.e0.f7123e;
                            C0793v0 c0793v0 = c0776m0.f7720F;
                            e3 = c0793v0.e(e0Var, new C0760e0(j3, c0793v0, null), this);
                            if (e3 == W1.a.f4608d) {
                                e3 = R1.y.f4171a;
                            }
                            if (e3 == aVar) {
                                return aVar;
                            }
                            interfaceC0835w = interfaceC0835w2;
                            obj2 = uVar3.f5832d;
                            if (obj2 instanceof C0790u) {
                                f2.j.d(obj2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                this.f7547k = interfaceC0835w;
                                this.f7544h = null;
                                this.f7546j = 4;
                                if (C0776m0.D0(c0776m0, (C0790u) obj2, this) == aVar) {
                                    return aVar;
                                }
                            } else if (obj2 instanceof r) {
                                this.f7547k = interfaceC0835w;
                                this.f7544h = null;
                                this.f7546j = 5;
                                if (C0776m0.B0(c0776m0, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        if (!AbstractC0837y.p(interfaceC0835w)) {
                            return R1.y.f4171a;
                        }
                    } else {
                        uVar2 = uVar;
                        abstractC0792v = null;
                        uVar.f5832d = abstractC0792v;
                        obj3 = uVar2.f5832d;
                        if (obj3 instanceof C0788t) {
                        }
                        if (!AbstractC0837y.p(interfaceC0835w)) {
                        }
                    }
                }
            case 1:
                uVar = this.f7545i;
                uVar2 = this.f7544h;
                interfaceC0835w = (InterfaceC0835w) this.f7547k;
                R1.a.e(obj);
                abstractC0792v = (AbstractC0792v) obj;
                uVar.f5832d = abstractC0792v;
                obj3 = uVar2.f5832d;
                if (obj3 instanceof C0788t) {
                }
                if (!AbstractC0837y.p(interfaceC0835w)) {
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                uVar3 = this.f7544h;
                interfaceC0835w2 = (InterfaceC0835w) this.f7547k;
                R1.a.e(obj);
                J j32 = new J(uVar3, c0776m0, null);
                this.f7547k = interfaceC0835w2;
                this.f7544h = uVar3;
                this.f7546j = 3;
                n.e0 e0Var2 = n.e0.f7123e;
                C0793v0 c0793v02 = c0776m0.f7720F;
                e3 = c0793v02.e(e0Var2, new C0760e0(j32, c0793v02, null), this);
                if (e3 == W1.a.f4608d) {
                }
                if (e3 == aVar) {
                }
                interfaceC0835w = interfaceC0835w2;
                obj2 = uVar3.f5832d;
                if (obj2 instanceof C0790u) {
                }
                if (!AbstractC0837y.p(interfaceC0835w)) {
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                uVar3 = this.f7544h;
                interfaceC0835w2 = (InterfaceC0835w) this.f7547k;
                try {
                    R1.a.e(obj);
                } catch (CancellationException unused) {
                    interfaceC0835w3 = interfaceC0835w2;
                    this.f7547k = interfaceC0835w3;
                    this.f7544h = null;
                    this.f7546j = 6;
                    if (C0776m0.B0(c0776m0, this) == aVar) {
                    }
                    interfaceC0835w = interfaceC0835w3;
                    if (!AbstractC0837y.p(interfaceC0835w)) {
                    }
                }
                interfaceC0835w = interfaceC0835w2;
                obj2 = uVar3.f5832d;
                if (obj2 instanceof C0790u) {
                }
                if (!AbstractC0837y.p(interfaceC0835w)) {
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                interfaceC0835w3 = (InterfaceC0835w) this.f7547k;
                try {
                    R1.a.e(obj);
                } catch (CancellationException unused2) {
                    this.f7547k = interfaceC0835w3;
                    this.f7544h = null;
                    this.f7546j = 6;
                    if (C0776m0.B0(c0776m0, this) == aVar) {
                        return aVar;
                    }
                    interfaceC0835w = interfaceC0835w3;
                    if (!AbstractC0837y.p(interfaceC0835w)) {
                    }
                }
                interfaceC0835w = interfaceC0835w3;
                if (!AbstractC0837y.p(interfaceC0835w)) {
                }
                break;
            case 5:
                interfaceC0835w3 = (InterfaceC0835w) this.f7547k;
                R1.a.e(obj);
                interfaceC0835w = interfaceC0835w3;
                if (!AbstractC0837y.p(interfaceC0835w)) {
                }
                break;
            case 6:
                interfaceC0835w3 = (InterfaceC0835w) this.f7547k;
                R1.a.e(obj);
                interfaceC0835w = interfaceC0835w3;
                if (!AbstractC0837y.p(interfaceC0835w)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
