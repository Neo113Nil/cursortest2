package n;

import I.C0174t;
import android.view.ViewGroup;
import android.view.ViewParent;
import e2.InterfaceC0426e;
import p.C0751a;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;
import t0.AbstractC1000m;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677c extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public q.m f7090h;

    /* renamed from: i, reason: collision with root package name */
    public int f7091i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0698y f7092j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7093k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q.k f7094l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677c(C0698y c0698y, long j3, q.k kVar, V1.d dVar) {
        super(2, dVar);
        this.f7092j = c0698y;
        this.f7093k = j3;
        this.f7094l = kVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0677c) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0677c(this.f7092j, this.f7093k, this.f7094l, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [U.p] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [U.p] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        boolean z3;
        boolean z4;
        C0174t c0174t;
        boolean z5;
        q.m mVar;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7091i;
        C0698y c0698y = this.f7092j;
        if (i3 == 0) {
            R1.a.e(obj);
            C0751a c0751a = p.V.f7614r;
            U.p pVar = c0698y.f4489d;
            if (!pVar.f4501p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.p pVar2 = pVar.f4493h;
            t0.E t3 = AbstractC0993f.t(c0698y);
            boolean z6 = false;
            loop0: while (t3 != null) {
                if ((((U.p) t3.f8561y.f2915f).f4492g & 262144) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f4491f & 262144) != 0) {
                            AbstractC1000m abstractC1000m = pVar2;
                            ?? r13 = 0;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof t0.r0) {
                                    t0.r0 r0Var = (t0.r0) abstractC1000m;
                                    if (c0751a.equals(r0Var.w())) {
                                        z6 = z6 || ((p.V) r0Var).f7615q;
                                        z5 = !z6;
                                    } else {
                                        z5 = true;
                                    }
                                    if (!z5) {
                                        break loop0;
                                    }
                                } else if ((abstractC1000m.f4491f & 262144) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar3 = abstractC1000m.f8771r;
                                    int i4 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r13 = r13;
                                    while (pVar3 != null) {
                                        if ((pVar3.f4491f & 262144) != 0) {
                                            i4++;
                                            r13 = r13;
                                            if (i4 == 1) {
                                                abstractC1000m = pVar3;
                                            } else {
                                                if (r13 == 0) {
                                                    r13 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m != 0) {
                                                    r13.b(abstractC1000m);
                                                    abstractC1000m = 0;
                                                }
                                                r13.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f4494i;
                                        abstractC1000m = abstractC1000m;
                                        r13 = r13;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(r13);
                            }
                        }
                        pVar2 = pVar2.f4493h;
                    }
                }
                t3 = t3.s();
                pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (t0.p0) c0174t.f2914e;
            }
            if (!z6) {
                int i5 = AbstractC0699z.f7251b;
                ViewParent parent = AbstractC0993f.v(c0698y).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        z4 = true;
                        break;
                    }
                    parent = viewGroup.getParent();
                }
                z4 = false;
                if (!z4) {
                    z3 = false;
                    if (z3) {
                        long j3 = AbstractC0699z.f7250a;
                        this.f7091i = 1;
                        if (AbstractC0837y.f(j3, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            z3 = true;
            if (z3) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = this.f7090h;
                R1.a.e(obj);
                c0698y.C = mVar;
                return R1.y.f4171a;
            }
            R1.a.e(obj);
        }
        mVar = new q.m(this.f7093k);
        this.f7090h = mVar;
        this.f7091i = 2;
        if (this.f7094l.b(mVar, this) == aVar) {
            return aVar;
        }
        c0698y.C = mVar;
        return R1.y.f4171a;
    }
}
