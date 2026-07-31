package o;

import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class I extends R1.h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6439e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P1.i f6441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R1.h f6442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(P1.i iVar, Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f6441g = iVar;
        this.f6442h = (R1.h) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.h, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        I i3 = new I(this.f6441g, this.f6442h, dVar);
        i3.f6440f = obj;
        return i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((I) create((n0.t) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, n0.t] */
    /* JADX WARN: Type inference failed for: r1v7, types: [R1.h, Y1.e] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object I3;
        n0.t tVar;
        n0.t tVar2;
        Q1.a aVar = Q1.a.f3113d;
        n0.t tVar3 = this.f6439e;
        P1.i iVar = this.f6441g;
        try {
        } catch (CancellationException e3) {
            e = e3;
            if (AbstractC0552y.n(iVar)) {
                throw e;
            }
            this.f6440f = tVar3;
            this.f6439e = 3;
            Object I4 = g2.i.I(tVar3, this);
            tVar2 = tVar3;
            if (I4 == aVar) {
                return aVar;
            }
            tVar = tVar2;
            if (AbstractC0552y.n(iVar)) {
            }
        }
        if (tVar3 == 0) {
            I2.l.Q(obj);
            tVar = (n0.t) this.f6440f;
            if (AbstractC0552y.n(iVar)) {
            }
        } else if (tVar3 != 1) {
            if (tVar3 == 2) {
                n0.t tVar4 = (n0.t) this.f6440f;
                I2.l.Q(obj);
                tVar2 = tVar4;
            } else {
                if (tVar3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0.t tVar5 = (n0.t) this.f6440f;
                I2.l.Q(obj);
                tVar2 = tVar5;
            }
            tVar = tVar2;
            if (AbstractC0552y.n(iVar)) {
                try {
                } catch (CancellationException e4) {
                    tVar3 = tVar;
                    e = e4;
                    if (AbstractC0552y.n(iVar)) {
                    }
                }
                ?? r12 = this.f6442h;
                this.f6440f = tVar;
                this.f6439e = 1;
                if (r12.g(tVar, this) == aVar) {
                    return aVar;
                }
                tVar3 = tVar;
                this.f6440f = tVar3;
                this.f6439e = 2;
                I3 = g2.i.I(tVar3, this);
                tVar2 = tVar3;
                if (I3 == aVar) {
                    return aVar;
                }
                tVar = tVar2;
                if (AbstractC0552y.n(iVar)) {
                    return L1.z.f2729a;
                }
            }
        } else {
            n0.t tVar6 = (n0.t) this.f6440f;
            I2.l.Q(obj);
            tVar3 = tVar6;
            this.f6440f = tVar3;
            this.f6439e = 2;
            I3 = g2.i.I(tVar3, this);
            tVar2 = tVar3;
            if (I3 == aVar) {
            }
            tVar = tVar2;
            if (AbstractC0552y.n(iVar)) {
            }
        }
    }
}
