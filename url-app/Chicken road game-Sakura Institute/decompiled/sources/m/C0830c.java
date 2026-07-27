package m;

import G.C0223t;
import W2.InterfaceC0302y;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C0874a;
import p.C0935k;
import p.C0937m;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import y2.AbstractC1343r;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830c extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public C0937m f8082k;

    /* renamed from: l, reason: collision with root package name */
    public int f8083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0850x f8084m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8085n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0935k f8086o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0830c(C0850x c0850x, long j4, C0935k c0935k, C2.a aVar) {
        super(2, aVar);
        this.f8084m = c0850x;
        this.f8085n = j4;
        this.f8086o = c0935k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0830c) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0830c(this.f8084m, this.f8085n, this.f8086o, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [S.n] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        boolean z4;
        boolean z5;
        C0223t c0223t;
        C0937m c0937m;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8083l;
        C0850x c0850x = this.f8084m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            c0850x.getClass();
            M2.A a4 = new M2.A();
            C0874a c0874a = o.T.f8713u;
            V.c cVar = new V.c(a4, 2);
            S.n nVar = c0850x.f3978d;
            if (!nVar.f3990s) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            S.n nVar2 = nVar.f3982k;
            r0.E v4 = AbstractC1065f.v(c0850x);
            loop0: while (v4 != null) {
                if ((((S.n) v4.B.f2912f).f3981j & 262144) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f3980i & 262144) != 0) {
                            AbstractC1073n abstractC1073n = nVar2;
                            ?? r14 = 0;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof r0.q0) {
                                    r0.q0 q0Var = (r0.q0) abstractC1073n;
                                    if (!(c0874a.equals(q0Var.u()) ? ((Boolean) cVar.invoke(q0Var)).booleanValue() : true)) {
                                        break loop0;
                                    }
                                } else {
                                    if (((abstractC1073n.f3980i & 262144) != 0) && (abstractC1073n instanceof AbstractC1073n)) {
                                        S.n nVar3 = abstractC1073n.f9826u;
                                        int i4 = 0;
                                        abstractC1073n = abstractC1073n;
                                        r14 = r14;
                                        while (nVar3 != null) {
                                            if ((nVar3.f3980i & 262144) != 0) {
                                                i4++;
                                                r14 = r14;
                                                if (i4 == 1) {
                                                    abstractC1073n = nVar3;
                                                } else {
                                                    if (r14 == 0) {
                                                        r14 = new I.d(new S.n[16]);
                                                    }
                                                    if (abstractC1073n != 0) {
                                                        r14.b(abstractC1073n);
                                                        abstractC1073n = 0;
                                                    }
                                                    r14.b(nVar3);
                                                }
                                            }
                                            nVar3 = nVar3.f3983l;
                                            abstractC1073n = abstractC1073n;
                                            r14 = r14;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(r14);
                            }
                        }
                        nVar2 = nVar2.f3982k;
                    }
                }
                v4 = v4.s();
                nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (r0.o0) c0223t.f2911e;
            }
            if (!a4.f3576d) {
                int i5 = AbstractC0851y.f8231b;
                ViewParent parent = AbstractC1065f.x(c0850x).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        z5 = true;
                        break;
                    }
                    parent = viewGroup.getParent();
                }
                z5 = false;
                if (!z5) {
                    z4 = false;
                    if (z4) {
                        long j4 = AbstractC0851y.f8230a;
                        this.f8083l = 1;
                        if (W2.F.a(j4, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            z4 = true;
            if (z4) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0937m = this.f8082k;
                AbstractC1343r.b(obj);
                c0850x.f8218F = c0937m;
                return Unit.f7487a;
            }
            AbstractC1343r.b(obj);
        }
        C0937m c0937m2 = new C0937m(this.f8085n);
        this.f8082k = c0937m2;
        this.f8083l = 2;
        if (this.f8086o.b(c0937m2, this) == aVar) {
            return aVar;
        }
        c0937m = c0937m2;
        c0850x.f8218F = c0937m;
        return Unit.f7487a;
    }
}
