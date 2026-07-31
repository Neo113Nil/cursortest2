package p;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import n0.C0700A;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class O extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int f7562f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V1.i f7564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X1.h f7565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(V1.i iVar, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f7564h = iVar;
        this.f7565i = (X1.h) interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((O) o((V1.d) obj2, (C0700A) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.h, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        O o3 = new O(this.f7564h, this.f7565i, dVar);
        o3.f7563g = obj;
        return o3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, n0.A] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X1.h, e2.e] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object f3;
        C0700A c0700a;
        C0700A c0700a2;
        W1.a aVar = W1.a.f4608d;
        C0700A c0700a3 = this.f7562f;
        V1.i iVar = this.f7564h;
        try {
        } catch (CancellationException e3) {
            e = e3;
            if (AbstractC0837y.o(iVar)) {
                throw e;
            }
            this.f7563g = c0700a3;
            this.f7562f = 3;
            Object f4 = n.r.f(c0700a3, this);
            c0700a2 = c0700a3;
            if (f4 == aVar) {
                return aVar;
            }
            c0700a = c0700a2;
            if (AbstractC0837y.o(iVar)) {
            }
        }
        if (c0700a3 == 0) {
            R1.a.e(obj);
            c0700a = (C0700A) this.f7563g;
            if (AbstractC0837y.o(iVar)) {
            }
        } else if (c0700a3 != 1) {
            if (c0700a3 == 2) {
                C0700A c0700a4 = (C0700A) this.f7563g;
                R1.a.e(obj);
                c0700a2 = c0700a4;
            } else {
                if (c0700a3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0700A c0700a5 = (C0700A) this.f7563g;
                R1.a.e(obj);
                c0700a2 = c0700a5;
            }
            c0700a = c0700a2;
            if (AbstractC0837y.o(iVar)) {
                try {
                } catch (CancellationException e4) {
                    c0700a3 = c0700a;
                    e = e4;
                    if (AbstractC0837y.o(iVar)) {
                    }
                }
                ?? r12 = this.f7565i;
                this.f7563g = c0700a;
                this.f7562f = 1;
                if (r12.h(c0700a, this) == aVar) {
                    return aVar;
                }
                c0700a3 = c0700a;
                this.f7563g = c0700a3;
                this.f7562f = 2;
                f3 = n.r.f(c0700a3, this);
                c0700a2 = c0700a3;
                if (f3 == aVar) {
                    return aVar;
                }
                c0700a = c0700a2;
                if (AbstractC0837y.o(iVar)) {
                    return R1.y.f4171a;
                }
            }
        } else {
            C0700A c0700a6 = (C0700A) this.f7563g;
            R1.a.e(obj);
            c0700a3 = c0700a6;
            this.f7563g = c0700a3;
            this.f7562f = 2;
            f3 = n.r.f(c0700a3, this);
            c0700a2 = c0700a3;
            if (f3 == aVar) {
            }
            c0700a = c0700a2;
            if (AbstractC0837y.o(iVar)) {
            }
        }
    }
}
