package m;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.NoSuchElementException;
import o.t1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6168h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6169i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6170j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        super(0);
        this.f6167g = i7;
        this.f6168h = obj;
        this.f6169i = obj2;
        this.f6170j = obj3;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [q6.a, r6.l] */
    @Override // q6.a
    public final Object a() {
        int i7 = this.f6167g;
        int i8 = 0;
        d6.z zVar = d6.z.f2639a;
        Object obj = this.f6170j;
        Object obj2 = this.f6169i;
        Object obj3 = this.f6168h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r1.f0 f0Var = (r1.f0) obj;
                ((r6.v) obj3).f7968f = ((i) obj2).f6174t.g(f0Var.f7767f.d(), f0Var.getLayoutDirection(), f0Var);
                return zVar;
            case 1:
                o.i iVar = (o.i) obj3;
                l1.i iVar2 = iVar.f6638v;
                while (true) {
                    i0.d dVar = iVar2.f5811a;
                    if (dVar.m()) {
                        if (dVar.l()) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        y0.d dVar2 = (y0.d) ((o.h) dVar.f4840f[dVar.f4842h - 1]).f6627a.a();
                        if (dVar2 == null ? true : iVar.C0(dVar2, iVar.f6642z)) {
                            ((o.h) dVar.o(dVar.f4842h - 1)).f6628b.resumeWith(zVar);
                        }
                    }
                }
                if (iVar.f6641y) {
                    y0.d B0 = iVar.B0();
                    if (B0 != null && iVar.C0(B0, iVar.f6642z)) {
                        iVar.f6641y = false;
                    }
                }
                ((t1) obj2).f6752e = o.i.A0(iVar, (o.d) obj);
                return zVar;
            case 2:
                r.e eVar = (r.e) ((g0.e0) obj3).getValue();
                r.s sVar = (r.s) obj2;
                return new r.h(sVar, eVar, (r.b) obj, new a0.l((w6.d) ((s.t) sVar.f7677d.f1517e).getValue(), eVar));
            case 3:
                r1.l0 l0Var = (r1.l0) obj;
                r1.i0 i0Var = (r1.i0) obj3;
                r1.l0 l0Var2 = i0Var.C;
                l0Var2.f7840j = 0;
                i0.d v5 = l0Var2.f7831a.v();
                int i9 = v5.f4842h;
                if (i9 > 0) {
                    Object[] objArr = v5.f4840f;
                    int i10 = 0;
                    do {
                        r1.i0 i0Var2 = ((r1.d0) objArr[i10]).B.f7849s;
                        r6.k.c(i0Var2);
                        i0Var2.f7787l = i0Var2.f7788m;
                        i0Var2.f7788m = Integer.MAX_VALUE;
                        if (i0Var2.f7789n == 2) {
                            i0Var2.f7789n = 3;
                        }
                        i10++;
                    } while (i10 < i9);
                }
                r1.d0 d0Var = l0Var2.f7831a;
                r1.d0 d0Var2 = l0Var2.f7831a;
                i0.d v8 = d0Var.v();
                int i11 = v8.f4842h;
                if (i11 > 0) {
                    Object[] objArr2 = v8.f4840f;
                    int i12 = 0;
                    do {
                        r1.i0 i0Var3 = ((r1.d0) objArr2[i12]).B.f7849s;
                        r6.k.c(i0Var3);
                        i0Var3.f7797v.f7757d = false;
                        i12++;
                    } while (i12 < i11);
                }
                r1.s sVar2 = i0Var.l().P;
                if (sVar2 != null) {
                    boolean z8 = sVar2.f7865m;
                    i0.a aVar = (i0.a) l0Var.f7831a.n();
                    int i13 = aVar.f4834f.f4842h;
                    for (int i14 = 0; i14 < i13; i14++) {
                        r1.p0 K0 = ((r1.a1) ((r1.d0) aVar.get(i14)).A.f3893d).K0();
                        if (K0 != null) {
                            K0.f7865m = z8;
                        }
                    }
                }
                ((r1.p0) obj2).v0().p();
                if (i0Var.l().P != null) {
                    i0.a aVar2 = (i0.a) l0Var.f7831a.n();
                    int i15 = aVar2.f4834f.f4842h;
                    for (int i16 = 0; i16 < i15; i16++) {
                        r1.p0 K02 = ((r1.a1) ((r1.d0) aVar2.get(i16)).A.f3893d).K0();
                        if (K02 != null) {
                            K02.f7865m = false;
                        }
                    }
                }
                i0.d v9 = d0Var2.v();
                int i17 = v9.f4842h;
                if (i17 > 0) {
                    Object[] objArr3 = v9.f4840f;
                    int i18 = 0;
                    do {
                        r1.i0 i0Var4 = ((r1.d0) objArr3[i18]).B.f7849s;
                        r6.k.c(i0Var4);
                        int i19 = i0Var4.f7787l;
                        int i20 = i0Var4.f7788m;
                        if (i19 != i20 && i20 == Integer.MAX_VALUE) {
                            i0Var4.q0();
                        }
                        i18++;
                    } while (i18 < i17);
                }
                i0.d v10 = d0Var2.v();
                int i21 = v10.f4842h;
                if (i21 > 0) {
                    Object[] objArr4 = v10.f4840f;
                    do {
                        r1.i0 i0Var5 = ((r1.d0) objArr4[i8]).B.f7849s;
                        r6.k.c(i0Var5);
                        r1.e0 e0Var = i0Var5.f7797v;
                        e0Var.f7758e = e0Var.f7757d;
                        i8++;
                    } while (i8 < i21);
                }
                return zVar;
            case 4:
                z0.n0 n0Var = r1.a1.J;
                ((r1.a1) obj3).G0((z0.r) obj2, (c1.c) obj);
                return zVar;
            case 5:
                s1.a aVar3 = (s1.a) obj3;
                aVar3.removeOnAttachStateChangeListener((s1.u) obj2);
                a0.s sVar3 = (a0.s) obj;
                r6.k.f(sVar3, "listener");
                j1.c.a0(aVar3).f3292a.remove(sVar3);
                return zVar;
            case 6:
                t.g gVar = (t.g) obj3;
                y0.d A0 = t.g.A0(gVar, (r1.a1) obj2, (r6.l) obj);
                if (A0 == null) {
                    return null;
                }
                o.i iVar3 = gVar.f8726s;
                if (m2.j.a(iVar3.f6642z, 0L)) {
                    throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return A0.h(iVar3.E0(A0, iVar3.f6642z) ^ (-9223372034707292160L));
            default:
                t6.a aVar4 = ((s7.d) obj3).f8558b;
                r6.k.c(aVar4);
                return aVar4.u(((s7.j) obj2).a(), ((s7.a) obj).f8536h.f8611d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(t.g gVar, r1.a1 a1Var, q6.a aVar) {
        super(0);
        this.f6167g = 6;
        this.f6168h = gVar;
        this.f6169i = a1Var;
        this.f6170j = (r6.l) aVar;
    }
}
