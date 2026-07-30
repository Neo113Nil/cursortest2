package c;

import a2.d0;
import a2.o;
import android.view.DragEvent;
import androidx.lifecycle.v;
import b.i0;
import c7.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import g0.m2;
import g0.z0;
import g2.c0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import k.m;
import k.q0;
import k.w;
import l1.x;
import l2.j;
import o.d1;
import o.f1;
import p1.h0;
import p1.m0;
import q.g0;
import q0.q;
import r1.p1;
import r1.q1;
import r6.k;
import r6.l;
import s1.k1;
import s1.r;
import u3.p;
import u3.t;
import w.j0;
import z0.n0;
import z0.o0;
import z0.s0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1433i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1434j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        super(1);
        this.f1431g = i7;
        this.f1432h = obj;
        this.f1433i = obj2;
        this.f1434j = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [q6.c, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        boolean booleanValue;
        switch (this.f1431g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i0 i0Var = (i0) this.f1432h;
                v vVar = (v) this.f1433i;
                e eVar = (e) this.f1434j;
                i0Var.a(vVar, eVar);
                return new g(0, eVar);
            case 1:
                return new k.c((q) this.f1432h, this.f1433i, (m) this.f1434j);
            case 2:
                n0 n0Var = (n0) obj;
                m2 m2Var = (m2) this.f1433i;
                m2 m2Var2 = (m2) this.f1432h;
                n0Var.b(m2Var2 != null ? ((Number) m2Var2.getValue()).floatValue() : 1.0f);
                n0Var.f(m2Var != null ? ((Number) m2Var.getValue()).floatValue() : 1.0f);
                n0Var.g(m2Var != null ? ((Number) m2Var.getValue()).floatValue() : 1.0f);
                m2 m2Var3 = (m2) this.f1434j;
                n0Var.k(m2Var3 != null ? ((s0) m2Var3.getValue()).f10049a : s0.f10047b);
                return z.f2639a;
            case 3:
                k.i0 i0Var2 = (k.i0) this.f1434j;
                int ordinal = ((w) obj).ordinal();
                s0 s0Var = null;
                if (ordinal == 0) {
                    q0 q0Var = i0Var2.f5225a;
                } else if (ordinal == 1) {
                    s0Var = (s0) this.f1432h;
                } else {
                    if (ordinal != 2) {
                        throw new b4.c();
                    }
                    q0 q0Var2 = i0Var2.f5225a;
                }
                return new s0(s0Var != null ? s0Var.f10049a : s0.f10047b);
            case 4:
                float floatValue = ((Number) obj).floatValue();
                o.i iVar = (o.i) this.f1432h;
                float f9 = iVar.f6637u ? 1.0f : -1.0f;
                f1 f1Var = iVar.f6636t;
                d1 d1Var = (d1) this.f1434j;
                long d8 = f1Var.d(f1Var.g(f9 * floatValue));
                f1 f1Var2 = d1Var.f6593a;
                float f10 = f1Var.f(f1Var.d(f1.a(f1Var2, f1Var2.f6616h, d8, 1))) * f9;
                if (Math.abs(f10) < Math.abs(floatValue)) {
                    x0 x0Var = (x0) this.f1433i;
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f10 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    x0Var.c(cancellationException);
                }
                return z.f2639a;
            case 5:
                p0.f fVar = (p0.f) this.f1434j;
                p0.g gVar = (p0.g) this.f1432h;
                LinkedHashMap linkedHashMap = gVar.f7004b;
                Object obj2 = this.f1433i;
                if (!linkedHashMap.containsKey(obj2)) {
                    gVar.f7003a.remove(obj2);
                    linkedHashMap.put(obj2, fVar);
                    return new k.c(fVar, gVar, obj2);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            case 6:
                p1.n0 n0Var2 = (p1.n0) this.f1433i;
                m0 m0Var = (m0) obj;
                h0 h0Var = (h0) this.f1434j;
                g0 g0Var = (g0) this.f1432h;
                if (g0Var.f7284w) {
                    m0.f(m0Var, n0Var2, h0Var.K(g0Var.f7280s), h0Var.K(g0Var.f7281t));
                } else {
                    m0.d(m0Var, n0Var2, h0Var.K(g0Var.f7280s), h0Var.K(g0Var.f7281t));
                }
                return z.f2639a;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                p1.n0 n0Var3 = (p1.n0) this.f1432h;
                h0 h0Var2 = (h0) this.f1433i;
                q.i0 i0Var3 = (q.i0) this.f1434j;
                m0.d((m0) obj, n0Var3, h0Var2.K(i0Var3.f7290s.b(h0Var2.getLayoutDirection())), h0Var2.K(i0Var3.f7290s.d()));
                return z.f2639a;
            case 8:
                m0 m0Var2 = (m0) obj;
                ArrayList arrayList = (ArrayList) this.f1432h;
                r.m mVar = (r.m) this.f1433i;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    r.m mVar2 = (r.m) arrayList.get(i7);
                    if (mVar2 != mVar) {
                        mVar2.b(m0Var2);
                    }
                }
                if (mVar != null) {
                    mVar.b(m0Var2);
                }
                ((z0) this.f1434j).getValue();
                return z.f2639a;
            case q.c.f7259c /* 9 */:
                q qVar = (q) this.f1432h;
                t3.h hVar = (t3.h) this.f1433i;
                qVar.add(hVar);
                return new k.c((p) this.f1434j, hVar, qVar);
            case q.c.f7261e /* 10 */:
                q1 q1Var = (q1) obj;
                v0.c cVar = (v0.c) q1Var;
                if (((k1) ((r) r1.f.u((v0.c) this.f1433i)).getDragAndDropManager()).f8273b.contains(cVar)) {
                    DragEvent dragEvent = (DragEvent) ((x) this.f1434j).f5847g;
                    if (v0.d.b(cVar, u3.r.a(dragEvent.getX(), dragEvent.getY()))) {
                        ((r6.v) this.f1432h).f7968f = q1Var;
                        return p1.f7878h;
                    }
                }
                return p1.f7876f;
            case 11:
                g2.w wVar = (g2.w) obj;
                ((z0) this.f1433i).setValue(wVar);
                z0 z0Var = (z0) this.f1434j;
                boolean a3 = k.a((String) z0Var.getValue(), wVar.f4065a.f373f);
                a2.g gVar2 = wVar.f4065a;
                z0Var.setValue(gVar2.f373f);
                if (!a3) {
                    ((q6.c) this.f1432h).f(gVar2.f373f);
                }
                return z.f2639a;
            case 12:
                b1.e eVar2 = (b1.e) obj;
                j0 j0Var = (j0) this.f1432h;
                w.z0 d9 = j0Var.d();
                if (d9 != null) {
                    long j8 = ((g2.w) this.f1433i).f4066b;
                    g2.q qVar2 = (g2.q) this.f1434j;
                    z0.r k8 = eVar2.B().k();
                    long j9 = ((a2.j0) j0Var.f9278x.getValue()).f408a;
                    long j10 = ((a2.j0) j0Var.f9279y.getValue()).f408a;
                    a2.h0 h0Var3 = d9.f9471a;
                    a2.g0 g0Var2 = h0Var3.f388a;
                    o oVar = h0Var3.f389b;
                    f7.i0 i0Var4 = j0Var.f9276v;
                    long j11 = j0Var.f9277w;
                    if (!a2.j0.b(j9)) {
                        i0Var4.e(j11);
                        int b9 = qVar2.b(a2.j0.e(j9));
                        int b10 = qVar2.b(a2.j0.d(j9));
                        if (b9 != b10) {
                            k8.d(h0Var3.j(b9, b10), i0Var4);
                        }
                    } else if (!a2.j0.b(j10)) {
                        long b11 = g0Var2.f378b.b();
                        u uVar = new u(b11);
                        if (b11 == 16) {
                            uVar = null;
                        }
                        long j12 = uVar != null ? uVar.f10059a : u.f10052b;
                        i0Var4.e(u.b(j12, u.d(j12) * 0.2f));
                        int b12 = qVar2.b(a2.j0.e(j10));
                        int b13 = qVar2.b(a2.j0.d(j10));
                        if (b12 != b13) {
                            k8.d(h0Var3.j(b12, b13), i0Var4);
                        }
                    } else if (!a2.j0.b(j8)) {
                        i0Var4.e(j11);
                        int b14 = qVar2.b(a2.j0.e(j8));
                        int b15 = qVar2.b(a2.j0.d(j8));
                        if (b14 != b15) {
                            k8.d(h0Var3.j(b14, b15), i0Var4);
                        }
                    }
                    long j13 = h0Var3.f390c;
                    boolean z8 = ((((float) ((int) (j13 >> 32))) > oVar.f427d ? 1 : (((float) ((int) (j13 >> 32))) == oVar.f427d ? 0 : -1)) < 0 || oVar.f426c || (((float) ((int) (j13 & 4294967295L))) > oVar.f428e ? 1 : (((float) ((int) (j13 & 4294967295L))) == oVar.f428e ? 0 : -1)) < 0) && g0Var2.f382f != 3;
                    if (z8) {
                        y0.d a9 = t.a(0L, v0.d.a((int) (j13 >> 32), (int) (j13 & 4294967295L)));
                        k8.o();
                        z0.r.h(k8, a9);
                    }
                    d0 d0Var = g0Var2.f378b.f412a;
                    j jVar = d0Var.f359m;
                    l2.m mVar3 = d0Var.f347a;
                    if (jVar == null) {
                        jVar = j.f5877b;
                    }
                    j jVar2 = jVar;
                    o0 o0Var = d0Var.f360n;
                    if (o0Var == null) {
                        o0Var = o0.f10030d;
                    }
                    o0 o0Var2 = o0Var;
                    b1.f fVar2 = d0Var.f362p;
                    if (fVar2 == null) {
                        fVar2 = b1.h.f1238a;
                    }
                    b1.f fVar3 = fVar2;
                    try {
                        z0.p c4 = mVar3.c();
                        l2.l lVar = l2.l.f5882a;
                        if (c4 != null) {
                            o.g(oVar, k8, c4, mVar3 != lVar ? mVar3.a() : 1.0f, o0Var2, jVar2, fVar3);
                        } else {
                            long b16 = mVar3 != lVar ? mVar3.b() : u.f10052b;
                            k8.o();
                            ArrayList arrayList2 = oVar.f431h;
                            int size2 = arrayList2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                a2.r rVar = (a2.r) arrayList2.get(i8);
                                rVar.f440a.f(k8, b16, o0Var2, jVar2, fVar3);
                                k8.k(0.0f, rVar.f440a.b());
                            }
                            k8.n();
                        }
                        if (z8) {
                            k8.n();
                        }
                    } finally {
                    }
                }
                return z.f2639a;
            case 13:
                androidx.room.c cVar2 = (androidx.room.c) this.f1432h;
                q6.c cVar3 = (q6.c) this.f1433i;
                c0 c0Var = (c0) ((r6.v) this.f1434j).f7968f;
                g2.w n8 = cVar2.n((List) obj);
                if (c0Var != null) {
                    c0Var.a(null, n8);
                }
                cVar3.f(n8);
                return z.f2639a;
            default:
                x0.r rVar2 = (x0.r) obj;
                if (k.a(rVar2, (x0.r) this.f1432h)) {
                    booleanValue = false;
                } else {
                    if (k.a(rVar2, ((androidx.compose.ui.focus.b) this.f1433i).f716f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((l) this.f1434j).f(rVar2)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ArrayList arrayList, r.m mVar, boolean z8, z0 z0Var) {
        super(1);
        this.f1431g = 8;
        this.f1432h = arrayList;
        this.f1433i = mVar;
        this.f1434j = z0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(x0.r rVar, androidx.compose.ui.focus.b bVar, q6.c cVar) {
        super(1);
        this.f1431g = 14;
        this.f1432h = rVar;
        this.f1433i = bVar;
        this.f1434j = (l) cVar;
    }
}
