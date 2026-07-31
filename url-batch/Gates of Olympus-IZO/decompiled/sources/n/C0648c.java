package n;

import I.C0120t;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e2.AbstractC0381e;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import o.C0724a;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.o0;
import t0.q0;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648c extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public q.l f6062e;

    /* renamed from: f, reason: collision with root package name */
    public int f6063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0667w f6064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f6065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.j f6066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648c(C0667w c0667w, long j3, q.j jVar, P1.d dVar) {
        super(2, dVar);
        this.f6064g = c0667w;
        this.f6065h = j3;
        this.f6066i = jVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0648c(this.f6064g, this.f6065h, this.f6066i, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0648c) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [U.k] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [U.k] */
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
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        boolean z4;
        C0120t c0120t;
        boolean z5;
        q.l lVar;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6063f;
        C0667w c0667w = this.f6064g;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0724a c0724a = o.O.f6458r;
            U.k kVar = c0667w.f3303d;
            if (!kVar.p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.k kVar2 = kVar.f3307h;
            t0.D t3 = AbstractC0898f.t(c0667w);
            boolean z6 = false;
            loop0: while (t3 != null) {
                if ((((U.k) t3.f7735x.f2356f).f3306g & 262144) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f3305f & 262144) != 0) {
                            AbstractC0905m abstractC0905m = kVar2;
                            ?? r13 = 0;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof q0) {
                                    q0 q0Var = (q0) abstractC0905m;
                                    if (c0724a.equals(q0Var.v())) {
                                        z6 = z6 || ((o.O) q0Var).f6459q;
                                        z5 = !z6;
                                    } else {
                                        z5 = true;
                                    }
                                    if (!z5) {
                                        break loop0;
                                    }
                                } else if ((abstractC0905m.f3305f & 262144) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    U.k kVar3 = abstractC0905m.f7937r;
                                    int i4 = 0;
                                    abstractC0905m = abstractC0905m;
                                    r13 = r13;
                                    while (kVar3 != null) {
                                        if ((kVar3.f3305f & 262144) != 0) {
                                            i4++;
                                            r13 = r13;
                                            if (i4 == 1) {
                                                abstractC0905m = kVar3;
                                            } else {
                                                if (r13 == 0) {
                                                    r13 = new K.d(new U.k[16]);
                                                }
                                                if (abstractC0905m != 0) {
                                                    r13.b(abstractC0905m);
                                                    abstractC0905m = 0;
                                                }
                                                r13.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f3308i;
                                        abstractC0905m = abstractC0905m;
                                        r13 = r13;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(r13);
                            }
                        }
                        kVar2 = kVar2.f3307h;
                    }
                }
                t3 = t3.q();
                kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
            }
            if (!z6) {
                int i5 = AbstractC0668x.f6184b;
                if (!c0667w.f3303d.p) {
                    AbstractC0381e.N("Cannot get View because the Modifier node is not currently attached.");
                    throw null;
                }
                ViewParent parent = ((View) t0.G.a(AbstractC0898f.t(c0667w))).getParent();
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
                        long j3 = AbstractC0668x.f6183a;
                        this.f6063f = 1;
                        if (AbstractC0552y.e(j3, this) == aVar) {
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
                lVar = this.f6062e;
                I2.l.Q(obj);
                c0667w.C = lVar;
                return L1.z.f2729a;
            }
            I2.l.Q(obj);
        }
        lVar = new q.l(this.f6065h);
        this.f6062e = lVar;
        this.f6063f = 2;
        if (this.f6066i.b(lVar, this) == aVar) {
            return aVar;
        }
        c0667w.C = lVar;
        return L1.z.f2729a;
    }
}
