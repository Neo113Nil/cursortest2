package p;

import I.C0143d;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import m.C0629n;
import m.InterfaceC0627l;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C0629n f7627f = new C0629n(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final m.w0 f7628a;

    /* renamed from: b, reason: collision with root package name */
    public long f7629b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public C0629n f7630c = f7627f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7631d;

    /* renamed from: e, reason: collision with root package name */
    public float f7632e;

    public X0(InterfaceC0627l interfaceC0627l) {
        this.f7628a = interfaceC0627l.a(m.v0.f6899a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r12v4, types: [e2.a] */
    /* JADX WARN: Type inference failed for: r13v4, types: [e2.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X1.c, p.V0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.X0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b5 -> B:24:0x00b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(R.h hVar, K2.i iVar, X1.c cVar) {
        ?? r22;
        int i3;
        float f3;
        X0 x02;
        V0 v0;
        R.h hVar2;
        K2.i iVar2;
        InterfaceC0422a interfaceC0422a;
        X0 x03;
        try {
            if (cVar instanceof V0) {
                V0 v02 = (V0) cVar;
                int i4 = v02.f7622m;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    v02.f7622m = i4 - Integer.MIN_VALUE;
                    r22 = v02;
                    Object obj = r22.f7620k;
                    W1.a aVar = W1.a.f4608d;
                    i3 = r22.f7622m;
                    C0629n c0629n = f7627f;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        if (this.f7631d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        V1.i iVar3 = r22.f4642e;
                        f2.j.c(iVar3);
                        U.r rVar = (U.r) iVar3.v(U.b.f4476s);
                        float s3 = rVar != null ? rVar.s() : 1.0f;
                        this.f7631d = true;
                        f3 = s3;
                        x02 = this;
                        v0 = r22;
                        hVar2 = hVar;
                        iVar2 = iVar;
                        if (Math.abs(x02.f7632e) >= 0.01f) {
                            W0 w02 = new W0(x02, f3, hVar2);
                            v0.f7616g = x02;
                            v0.f7617h = hVar2;
                            v0.f7618i = iVar2;
                            v0.f7619j = f3;
                            v0.f7622m = 1;
                            V1.i iVar4 = v0.f4642e;
                            f2.j.c(iVar4);
                            if (C0143d.F(iVar4).n(w02, v0) == aVar) {
                                return aVar;
                            }
                            iVar2.b();
                        }
                        X0 x04 = x02;
                        K2.i iVar5 = iVar2;
                        X0 x05 = x04;
                        if (Math.abs(x05.f7632e) == 0.0f) {
                            x03 = x05;
                            x03.f7629b = Long.MIN_VALUE;
                            x03.f7630c = c0629n;
                            x03.f7631d = false;
                            return R1.y.f4171a;
                        }
                        C0758d0 c0758d0 = new C0758d0(x05, 1, hVar2);
                        v0.f7616g = x05;
                        v0.f7617h = iVar5;
                        v0.f7618i = null;
                        v0.f7622m = 2;
                        V1.i iVar6 = v0.f4642e;
                        f2.j.c(iVar6);
                        if (C0143d.F(iVar6).n(c0758d0, v0) == aVar) {
                            return aVar;
                        }
                        interfaceC0422a = iVar5;
                        r22 = x05;
                        interfaceC0422a.b();
                        x03 = r22;
                        x03.f7629b = Long.MIN_VALUE;
                        x03.f7630c = c0629n;
                        x03.f7631d = false;
                        return R1.y.f4171a;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0422a = (InterfaceC0422a) r22.f7617h;
                        X0 x06 = r22.f7616g;
                        R1.a.e(obj);
                        r22 = x06;
                        interfaceC0422a.b();
                        x03 = r22;
                        x03.f7629b = Long.MIN_VALUE;
                        x03.f7630c = c0629n;
                        x03.f7631d = false;
                        return R1.y.f4171a;
                    }
                    float f4 = r22.f7619j;
                    ?? r12 = r22.f7618i;
                    ?? r13 = (InterfaceC0424c) r22.f7617h;
                    X0 x07 = r22.f7616g;
                    try {
                        R1.a.e(obj);
                        hVar2 = r13;
                        f3 = f4;
                        x02 = x07;
                        v0 = r22;
                        iVar2 = r12;
                        try {
                            iVar2.b();
                        } catch (Throwable th) {
                            th = th;
                            r22 = x02;
                            r22.f7629b = Long.MIN_VALUE;
                            r22.f7630c = c0629n;
                            r22.f7631d = false;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r22 = x07;
                        r22.f7629b = Long.MIN_VALUE;
                        r22.f7630c = c0629n;
                        r22.f7631d = false;
                        throw th;
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        r22 = new V0(this, cVar);
        Object obj2 = r22.f7620k;
        W1.a aVar2 = W1.a.f4608d;
        i3 = r22.f7622m;
        C0629n c0629n2 = f7627f;
    }
}
