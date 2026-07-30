package m;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.x1;
import r1.o1;
import r1.q1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6099g;

    /* renamed from: h, reason: collision with root package name */
    public int f6100h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6101i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6102j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6103k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6104l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, long j8, Object obj2, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6099g = i7;
        this.f6103k = obj;
        this.f6101i = j8;
        this.f6104l = obj2;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6099g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new a((q) this.f6103k, this.f6101i, (p.j) this.f6104l, dVar, 0);
            case 1:
                a aVar = new a((o.f1) this.f6103k, this.f6101i, (r6.s) this.f6104l, dVar, 1);
                aVar.f6102j = obj;
                return aVar;
            default:
                return new a((g0.z0) this.f6103k, this.f6101i, (p.j) this.f6104l, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f6099g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((a) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((a) create((o.d1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((a) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r11.b(r0, r18) == r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r11.b(r5, r18) == r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c4, code lost:
    
        if (((p.j) r11).b(r0, r18) == r7) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b1, code lost:
    
        if (c7.a0.e(r0, r18) == r7) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [s0.n] */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        boolean z9;
        g0.t tVar;
        int i7;
        boolean z10;
        p.l lVar;
        g0.z0 z0Var;
        p.l lVar2;
        int i8 = this.f6099g;
        i0.d dVar = null;
        d6.z zVar = d6.z.f2639a;
        long j8 = this.f6101i;
        i6.a aVar = i6.a.f4956f;
        Object obj2 = this.f6103k;
        int i9 = 2;
        Object obj3 = this.f6104l;
        switch (i8) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar = (q) obj2;
                int i10 = this.f6100h;
                if (i10 == 0) {
                    d6.a.e(obj);
                    s0.n nVar = qVar.f8104f;
                    if (!nVar.f8116r) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    s0.n nVar2 = nVar.f8108j;
                    r1.d0 t2 = r1.f.t(qVar);
                    boolean z11 = false;
                    while (t2 != null) {
                        int i11 = 262144;
                        if ((((s0.n) t2.A.f3895f).f8107i & 262144) != 0) {
                            while (nVar2 != null) {
                                if ((nVar2.f8106h & i11) != 0) {
                                    r1.m mVar = nVar2;
                                    i0.d dVar2 = dVar;
                                    while (mVar != 0) {
                                        if (mVar instanceof q1) {
                                            q1 q1Var = (q1) mVar;
                                            if (o.o0.f6709t.equals(q1Var.o())) {
                                                boolean z12 = z11 || ((o.o0) q1Var).f6710s;
                                                z10 = !z12;
                                                z11 = z12;
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                if (!z11) {
                                                    int i12 = r.f6240b;
                                                    ViewParent parent = r1.f.v(qVar).getParent();
                                                    while (parent != null && (parent instanceof ViewGroup)) {
                                                        ViewGroup viewGroup = (ViewGroup) parent;
                                                        if (viewGroup.shouldDelayChildPressedState()) {
                                                            z9 = true;
                                                            if (!z9) {
                                                                z8 = false;
                                                                if (z8) {
                                                                    long j9 = r.f6239a;
                                                                    this.f6100h = 1;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            parent = viewGroup.getParent();
                                                        }
                                                    }
                                                    z9 = false;
                                                    if (!z9) {
                                                    }
                                                }
                                                z8 = true;
                                                if (z8) {
                                                }
                                            }
                                        } else if ((mVar.f8106h & i11) != 0 && (mVar instanceof r1.m)) {
                                            s0.n nVar3 = mVar.f7853t;
                                            int i13 = 0;
                                            s0.n nVar4 = mVar;
                                            while (nVar3 != null) {
                                                int i14 = i11;
                                                if ((nVar3.f8106h & i14) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        nVar4 = nVar3;
                                                    } else {
                                                        i0.d dVar3 = dVar2 == null ? new i0.d(new s0.n[16]) : dVar2;
                                                        if (nVar4 != null) {
                                                            dVar3.b(nVar4);
                                                            nVar4 = null;
                                                        }
                                                        dVar3.b(nVar3);
                                                        dVar2 = dVar3;
                                                    }
                                                }
                                                nVar3 = nVar3.f8109k;
                                                i11 = i14;
                                                nVar4 = nVar4;
                                            }
                                            i7 = i11;
                                            if (i13 == 1) {
                                                i11 = i7;
                                                mVar = nVar4;
                                            }
                                            nVar4 = r1.f.f(dVar2);
                                            i11 = i7;
                                            mVar = nVar4;
                                        }
                                        i7 = i11;
                                        nVar4 = r1.f.f(dVar2);
                                        i11 = i7;
                                        mVar = nVar4;
                                    }
                                }
                                nVar2 = nVar2.f8108j;
                                i11 = i11;
                                dVar = null;
                            }
                        }
                        t2 = t2.s();
                        nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
                        dVar = null;
                    }
                    if (!z11) {
                    }
                    z8 = true;
                    if (z8) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar = (p.l) this.f6102j;
                        d6.a.e(obj);
                        qVar.E = lVar;
                        return zVar;
                    }
                    d6.a.e(obj);
                }
                lVar = new p.l(j8);
                this.f6102j = lVar;
                this.f6100h = 2;
                break;
            case 1:
                o.f1 f1Var = (o.f1) obj2;
                int i15 = this.f6100h;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return zVar;
                }
                d6.a.e(obj);
                o.d1 d1Var = (o.d1) this.f6102j;
                float f9 = f1Var.f(j8);
                x1 x1Var = new x1((r6.s) obj3, f1Var, d1Var, i9);
                this.f6100h = 1;
                return l.e.c(0.0f, f9, null, x1Var, this, 12) == aVar ? aVar : zVar;
            default:
                p.j jVar = (p.j) obj3;
                g0.z0 z0Var2 = (g0.z0) obj2;
                int i16 = this.f6100h;
                if (i16 == 0) {
                    d6.a.e(obj);
                    p.l lVar3 = (p.l) z0Var2.getValue();
                    if (lVar3 != null) {
                        p.k kVar = new p.k(lVar3);
                        if (jVar != null) {
                            this.f6102j = z0Var2;
                            this.f6100h = 1;
                            break;
                        }
                        z0Var = z0Var2;
                    }
                    lVar2 = new p.l(j8);
                    if (jVar != null) {
                        this.f6102j = lVar2;
                        this.f6100h = 2;
                        break;
                    }
                    z0Var2.setValue(lVar2);
                    return zVar;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar2 = (p.l) this.f6102j;
                    d6.a.e(obj);
                    z0Var2.setValue(lVar2);
                    return zVar;
                }
                z0Var = (g0.z0) this.f6102j;
                d6.a.e(obj);
                z0Var.setValue(null);
                lVar2 = new p.l(j8);
                if (jVar != null) {
                }
                z0Var2.setValue(lVar2);
                return zVar;
        }
    }
}
