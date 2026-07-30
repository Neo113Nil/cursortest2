package c1;

import a0.y;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import c7.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import f1.d0;
import f2.r;
import f7.q0;
import g0.b0;
import g0.c0;
import g0.d1;
import g0.m2;
import g0.q1;
import g0.t1;
import g0.u;
import g2.t;
import g3.a0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m.g1;
import m.q;
import o.f1;
import q0.s;
import q0.v;
import r1.a1;
import r6.w;
import z0.e0;
import z0.g0;
import z0.h0;
import z0.i0;
import z0.j0;
import z0.k0;
import z0.l0;
import z0.n0;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1523g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1524h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj) {
        super(1);
        this.f1523g = i7;
        this.f1524h = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03e9, code lost:
    
        if (r6 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b9, code lost:
    
        if (r5 != r14.f9989a) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0408  */
    /* JADX WARN: Type inference failed for: r2v3, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r2v4, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r3v60, types: [p1.n0, r1.a] */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        String concat;
        int i7;
        z0.m mVar;
        b1.c cVar;
        b1.b bVar;
        float f9;
        float f10;
        long p6;
        float d8;
        Bitmap bitmap;
        int i8 = 5;
        switch (this.f1523g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b1.e eVar = (b1.e) obj;
                c cVar2 = (c) this.f1524h;
                k0 k0Var = cVar2.f1539l;
                if (cVar2.f1541n && cVar2.f1549v && k0Var != null) {
                    ?? r22 = cVar2.f1531d;
                    b1.b B = eVar.B();
                    long p8 = B.p();
                    B.k().o();
                    try {
                        ((b1.b) ((b6.c) B.f1230g).f1394g).k().i(k0Var);
                        r22.f(eVar);
                    } finally {
                        a0.m.s(B, p8);
                    }
                } else {
                    cVar2.f1531d.f(eVar);
                }
                return z.f2639a;
            case 1:
                ((n0) obj).b(((Number) ((m2) this.f1524h).getValue()).floatValue());
                return z.f2639a;
            case 2:
                return obj == ((e6.a) this.f1524h) ? "(this Collection)" : String.valueOf(obj);
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                r6.k.f(entry, "it");
                e6.e eVar2 = (e6.e) this.f1524h;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == eVar2 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != eVar2 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 4:
                d0 d0Var = (d0) obj;
                f1.c cVar3 = (f1.c) this.f1524h;
                cVar3.g(d0Var);
                q6.c cVar4 = cVar3.f3092i;
                if (cVar4 != null) {
                    cVar4.f(d0Var);
                }
                return z.f2639a;
            case 5:
                r rVar = (r) obj;
                return ((f2.e) this.f1524h).a(new r(null, rVar.f3286b, rVar.f3287c, rVar.f3288d, rVar.f3289e)).f3290f;
            case 6:
                c0.f3697g.removeFrameCallback((b0) this.f1524h);
                return z.f2639a;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                t1 t1Var = (t1) this.f1524h;
                synchronized (t1Var.f3908b) {
                    try {
                        x0 x0Var = t1Var.f3909c;
                        if (x0Var != null) {
                            q0 q0Var = t1Var.f3924r;
                            q1 q1Var = q1.f3861g;
                            q0Var.getClass();
                            q0Var.l(null, q1Var);
                            q0 q0Var2 = t1.f3905v;
                            x0Var.c(cancellationException);
                            t1Var.f3921o = null;
                            x0Var.I(new y(t1Var, 9, th));
                        } else {
                            t1Var.f3910d = cancellationException;
                            q0 q0Var3 = t1Var.f3924r;
                            q1 q1Var2 = q1.f3860f;
                            q0Var3.getClass();
                            q0Var3.l(null, q1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return z.f2639a;
            case 8:
                ((u) this.f1524h).v(obj);
                return z.f2639a;
            case q.c.f7259c /* 9 */:
                if (obj instanceof v) {
                    ((v) obj).d(4);
                }
                ((i.b0) this.f1524h).a(obj);
                return z.f2639a;
            case q.c.f7261e /* 10 */:
                g2.i iVar = (g2.i) obj;
                String str = ((g2.i) this.f1524h) == iVar ? " > " : "   ";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (iVar instanceof g2.a) {
                    StringBuilder sb3 = new StringBuilder("CommitTextCommand(text.length=");
                    g2.a aVar = (g2.a) iVar;
                    sb3.append(aVar.f3996a.f373f.length());
                    sb3.append(", newCursorPosition=");
                    concat = a0.m.l(sb3, aVar.f3997b, ')');
                } else if (iVar instanceof g2.u) {
                    StringBuilder sb4 = new StringBuilder("SetComposingTextCommand(text.length=");
                    g2.u uVar = (g2.u) iVar;
                    sb4.append(uVar.f4061a.f373f.length());
                    sb4.append(", newCursorPosition=");
                    concat = a0.m.l(sb4, uVar.f4062b, ')');
                } else if (iVar instanceof t) {
                    concat = iVar.toString();
                } else if (iVar instanceof g2.g) {
                    concat = iVar.toString();
                } else if (iVar instanceof g2.h) {
                    concat = iVar.toString();
                } else if (iVar instanceof g2.v) {
                    concat = iVar.toString();
                } else if (iVar instanceof g2.k) {
                    concat = "FinishComposingTextCommand()";
                } else if (iVar instanceof g2.f) {
                    concat = "DeleteAllCommand()";
                } else {
                    String b9 = w.a(iVar.getClass()).b();
                    if (b9 == null) {
                        b9 = "{anonymous EditCommand}";
                    }
                    concat = "Unknown EditCommand: ".concat(b9);
                }
                sb2.append(concat);
                return sb2.toString();
            case 11:
                Throwable th3 = (Throwable) obj;
                a0 a0Var = (a0) this.f1524h;
                if (th3 != null) {
                    a0Var.f4095l.C(new g3.b0(th3));
                }
                if (a0Var.f4097n.f2625g != d6.w.f2636a) {
                    ((i3.i) a0Var.f4097n.getValue()).close();
                }
                return z.f2639a;
            case 12:
                return Boolean.valueOf(r6.k.a(obj, this.f1524h));
            case 13:
                m2 m2Var = (m2) ((k.m) this.f1524h).f5242d.e(obj);
                return new m2.j(m2Var != null ? ((m2.j) m2Var.getValue()).f6321a : 0L);
            case 14:
                l.p pVar = (l.p) obj;
                float f11 = pVar.f5599b;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                float f12 = pVar.f5600c;
                if (f12 < -0.5f) {
                    f12 = -0.5f;
                }
                if (f12 > 0.5f) {
                    f12 = 0.5f;
                }
                float f13 = pVar.f5601d;
                float f14 = f13 >= -0.5f ? f13 : -0.5f;
                float f15 = f14 <= 0.5f ? f14 : 0.5f;
                float f16 = pVar.f5598a;
                r10 = f16 >= 0.0f ? f16 : 0.0f;
                return new z0.u(z0.u.a(l0.b(f11, f12, f15, r10 <= 1.0f ? r10 : 1.0f, a1.d.f237t), (a1.c) this.f1524h));
            case q.c.f7263g /* 15 */:
                Throwable th4 = (Throwable) obj;
                l1.c0 c0Var = (l1.c0) this.f1524h;
                c7.h hVar = c0Var.f5782h;
                if (hVar != null) {
                    hVar.g(th4);
                }
                c0Var.f5782h = null;
                return z.f2639a;
            case 16:
                w0.c cVar5 = (w0.c) obj;
                m.m mVar2 = (m.m) this.f1524h;
                if (cVar5.a() * mVar2.f6203v < 0.0f || y0.f.c(cVar5.f9477f.d()) <= 0.0f) {
                    return cVar5.b(m.k.f6187h);
                }
                float f17 = 2;
                float min = Math.min(m2.e.a(mVar2.f6203v, 0.0f) ? 1.0f : (float) Math.ceil(cVar5.a() * mVar2.f6203v), (float) Math.ceil(y0.f.c(cVar5.f9477f.d()) / f17));
                float f18 = min / f17;
                long a3 = u3.r.a(f18, f18);
                long a9 = v0.d.a(y0.f.d(cVar5.f9477f.d()) - min, y0.f.b(cVar5.f9477f.d()) - min);
                float f19 = min * f17;
                boolean z8 = f19 > y0.f.c(cVar5.f9477f.d());
                j0 g9 = mVar2.f6205x.g(cVar5.f9477f.d(), cVar5.f9477f.getLayoutDirection(), cVar5);
                if (!(g9 instanceof g0)) {
                    if (!(g9 instanceof i0)) {
                        boolean z9 = z8;
                        if (!(g9 instanceof h0)) {
                            throw new b4.c();
                        }
                        r0 r0Var = mVar2.f6204w;
                        long j8 = z9 ? 0L : a3;
                        if (z9) {
                            a9 = cVar5.f9477f.d();
                        }
                        return cVar5.b(new k.d0(r0Var, j8, a9, z9 ? b1.h.f1238a : new b1.i(min, 0.0f, 0, 0, 30), 1));
                    }
                    r0 r0Var2 = mVar2.f6204w;
                    y0.e eVar3 = ((i0) g9).f10000a;
                    if (u3.z.i(eVar3)) {
                        return cVar5.b(new m.l(z8, r0Var2, eVar3.f9788e, f18, min, a3, a9, new b1.i(min, 0.0f, 0, 0, 30)));
                    }
                    boolean z10 = z8;
                    if (mVar2.f6202u == null) {
                        mVar2.f6202u = new m.j();
                    }
                    m.j jVar = mVar2.f6202u;
                    r6.k.c(jVar);
                    z0.j jVar2 = jVar.f6185d;
                    z0.j jVar3 = jVar2;
                    if (jVar2 == null) {
                        z0.j h3 = l0.h();
                        jVar.f6185d = h3;
                        jVar3 = h3;
                    }
                    jVar3.d();
                    k0.a(jVar3, eVar3);
                    if (!z10) {
                        k0 h8 = l0.h();
                        k0.a(h8, new y0.e(min, min, eVar3.b() - min, eVar3.a() - min, a8.m.L(eVar3.f9788e, min), a8.m.L(eVar3.f9789f, min), a8.m.L(eVar3.f9790g, min), a8.m.L(eVar3.f9791h, min)));
                        jVar3.c(jVar3, h8, 0);
                    }
                    return cVar5.b(new y(jVar3, 23, r0Var2));
                }
                r0 r0Var3 = mVar2.f6204w;
                g0 g0Var = (g0) g9;
                k0 k0Var2 = g0Var.f9995a;
                if (z8) {
                    return cVar5.b(new y(g0Var, 22, r0Var3));
                }
                if (r0Var3 != null) {
                    long j9 = r0Var3.f10045a;
                    mVar = new z0.m(j9, 5, Build.VERSION.SDK_INT >= 29 ? z0.n.f10013a.a(j9, 5) : new PorterDuffColorFilter(l0.w(j9), l0.z(5)));
                    i7 = 1;
                } else {
                    i7 = 0;
                    mVar = null;
                }
                z0.j jVar4 = (z0.j) k0Var2;
                if (jVar4.f10003b == null) {
                    jVar4.f10003b = new RectF();
                }
                RectF rectF = jVar4.f10003b;
                r6.k.c(rectF);
                jVar4.f10002a.computeBounds(rectF, true);
                float f20 = rectF.left;
                float f21 = rectF.top;
                y0.d dVar = new y0.d(f20, f21, rectF.right, rectF.bottom);
                if (mVar2.f6202u == null) {
                    mVar2.f6202u = new m.j();
                }
                m.j jVar5 = mVar2.f6202u;
                r6.k.c(jVar5);
                z0.j jVar6 = jVar5.f6185d;
                z0.j jVar7 = jVar6;
                if (jVar6 == null) {
                    z0.j h9 = l0.h();
                    jVar5.f6185d = h9;
                    jVar7 = h9;
                }
                jVar7.d();
                k0.b(jVar7, dVar);
                jVar7.c(jVar7, k0Var2, 0);
                r6.v vVar = new r6.v();
                long G = j1.c.G((int) Math.ceil(dVar.c()), (int) Math.ceil(dVar.b()));
                m.j jVar8 = mVar2.f6202u;
                r6.k.c(jVar8);
                z0.h hVar2 = jVar8.f6182a;
                z0.d dVar2 = jVar8.f6183b;
                e0 e0Var = hVar2 != null ? new e0(hVar2.a()) : null;
                try {
                    try {
                        if (e0Var == null || e0Var.f9989a != 0) {
                            e0 e0Var2 = hVar2 != null ? new e0(hVar2.a()) : null;
                            if (e0Var2 != null) {
                                break;
                            }
                            if (hVar2 != null && dVar2 != null) {
                                d8 = y0.f.d(cVar5.f9477f.d());
                                bitmap = hVar2.f9996a;
                                if (d8 <= bitmap.getWidth()) {
                                    if (y0.f.b(cVar5.f9477f.d()) <= bitmap.getHeight()) {
                                    }
                                }
                            }
                            hVar2 = l0.f((int) (G >> 32), (int) (G & 4294967295L), i7);
                            jVar8.f6182a = hVar2;
                            dVar2 = l0.a(hVar2);
                            jVar8.f6183b = dVar2;
                            cVar = jVar8.f6184c;
                            if (cVar == null) {
                                cVar = new b1.c();
                                jVar8.f6184c = cVar;
                            }
                            bVar = cVar.f1234g;
                            b1.a aVar2 = cVar.f1233f;
                            long o02 = j1.c.o0(G);
                            m2.k layoutDirection = cVar5.f9477f.getLayoutDirection();
                            m2.b bVar2 = aVar2.f1225a;
                            b1.c cVar6 = cVar;
                            m2.k kVar = aVar2.f1226b;
                            z0.j jVar9 = jVar7;
                            z0.r rVar2 = aVar2.f1227c;
                            long j10 = aVar2.f1228d;
                            aVar2.f1225a = cVar5;
                            aVar2.f1226b = layoutDirection;
                            aVar2.f1227c = dVar2;
                            aVar2.f1228d = o02;
                            dVar2.o();
                            b1.e.t(cVar6, z0.u.f10052b, 0L, o02, 58);
                            f9 = -f20;
                            f10 = -f21;
                            ((b6.c) bVar.f1230g).B(f9, f10);
                            b1.e.n(cVar6, g0Var.f9995a, r0Var3, 0.0f, new b1.i(f19, 0.0f, 0, 0, 30), 52);
                            float f22 = 1;
                            float d9 = (y0.f.d(cVar6.d()) + f22) / y0.f.d(cVar6.d());
                            float b10 = (y0.f.b(cVar6.d()) + f22) / y0.f.b(cVar6.d());
                            long Q = cVar6.Q();
                            z0.h hVar3 = hVar2;
                            z0.d dVar3 = dVar2;
                            p6 = bVar.p();
                            bVar.k().o();
                            ((b6.c) bVar.f1230g).y(d9, b10, Q);
                            b1.e.n(cVar6, jVar9, r0Var3, 0.0f, null, 28);
                            ((b6.c) bVar.f1230g).B(-f9, -f10);
                            dVar3.n();
                            aVar2.f1225a = bVar2;
                            aVar2.f1226b = kVar;
                            aVar2.f1227c = rVar2;
                            aVar2.f1228d = j10;
                            hVar3.f9996a.prepareToDraw();
                            vVar.f7968f = hVar3;
                            return cVar5.b(new a2.n(dVar, vVar, G, mVar));
                        }
                        ((b6.c) bVar.f1230g).y(d9, b10, Q);
                        b1.e.n(cVar6, jVar9, r0Var3, 0.0f, null, 28);
                        ((b6.c) bVar.f1230g).B(-f9, -f10);
                        dVar3.n();
                        aVar2.f1225a = bVar2;
                        aVar2.f1226b = kVar;
                        aVar2.f1227c = rVar2;
                        aVar2.f1228d = j10;
                        hVar3.f9996a.prepareToDraw();
                        vVar.f7968f = hVar3;
                        return cVar5.b(new a2.n(dVar, vVar, G, mVar));
                    } finally {
                        bVar.k().n();
                        bVar.C(p6);
                    }
                    b1.e.n(cVar6, g0Var.f9995a, r0Var3, 0.0f, new b1.i(f19, 0.0f, 0, 0, 30), 52);
                    float f222 = 1;
                    float d92 = (y0.f.d(cVar6.d()) + f222) / y0.f.d(cVar6.d());
                    float b102 = (y0.f.b(cVar6.d()) + f222) / y0.f.b(cVar6.d());
                    long Q2 = cVar6.Q();
                    z0.h hVar32 = hVar2;
                    z0.d dVar32 = dVar2;
                    p6 = bVar.p();
                    bVar.k().o();
                } catch (Throwable th5) {
                    ((b6.c) bVar.f1230g).B(-f9, -f10);
                    throw th5;
                }
                r6 = true;
                if (hVar2 != null) {
                    d8 = y0.f.d(cVar5.f9477f.d());
                    bitmap = hVar2.f9996a;
                    if (d8 <= bitmap.getWidth()) {
                    }
                }
                hVar2 = l0.f((int) (G >> 32), (int) (G & 4294967295L), i7);
                jVar8.f6182a = hVar2;
                dVar2 = l0.a(hVar2);
                jVar8.f6183b = dVar2;
                cVar = jVar8.f6184c;
                if (cVar == null) {
                }
                bVar = cVar.f1234g;
                b1.a aVar22 = cVar.f1233f;
                long o022 = j1.c.o0(G);
                m2.k layoutDirection2 = cVar5.f9477f.getLayoutDirection();
                m2.b bVar22 = aVar22.f1225a;
                b1.c cVar62 = cVar;
                m2.k kVar2 = aVar22.f1226b;
                z0.j jVar92 = jVar7;
                z0.r rVar22 = aVar22.f1227c;
                long j102 = aVar22.f1228d;
                aVar22.f1225a = cVar5;
                aVar22.f1226b = layoutDirection2;
                aVar22.f1227c = dVar2;
                aVar22.f1228d = o022;
                dVar2.o();
                b1.e.t(cVar62, z0.u.f10052b, 0L, o022, 58);
                f9 = -f20;
                f10 = -f21;
                ((b6.c) bVar.f1230g).B(f9, f10);
                break;
            case 17:
                long j11 = ((y0.c) obj).f9778a;
                q qVar = (q) this.f1524h;
                if (qVar.f6235y) {
                    qVar.f6236z.a();
                }
                return z.f2639a;
            case 18:
                float floatValue = ((Number) obj).floatValue();
                g1 g1Var = (g1) this.f1524h;
                d1 d1Var = g1Var.f6159a;
                float e9 = d1Var.e() + floatValue + g1Var.f6163e;
                float d10 = v1.g.d(e9, 0.0f, g1Var.f6162d.e());
                r6 = e9 == d10;
                float e10 = d10 - d1Var.e();
                int round = Math.round(e10);
                d1Var.f(d1Var.e() + round);
                g1Var.f6163e = e10 - round;
                if (!r6) {
                    floatValue = e10;
                }
                return Float.valueOf(floatValue);
            case 19:
                ((n.j) this.f1524h).f6493a.setValue(new n.h(((y0.c) obj).f9778a));
                return z.f2639a;
            case 20:
                ((w.k0) this.f1524h).a();
                return z.f2639a;
            case 21:
                ((o.x0) this.f1524h).J.f6639w = (p1.p) obj;
                return z.f2639a;
            case 22:
                long j12 = ((y0.c) obj).f9778a;
                f1 f1Var = (f1) this.f1524h;
                return new y0.c(f1.a(f1Var, f1Var.f6616h, j12, f1Var.f6615g));
            case 23:
                p0.i iVar2 = ((p0.g) this.f1524h).f7005c;
                return Boolean.valueOf(iVar2 != null ? iVar2.a(obj) : true);
            case 24:
                q0.t tVar = (q0.t) this.f1524h;
                synchronized (tVar.f7459f) {
                    s sVar = tVar.f7461h;
                    r6.k.c(sVar);
                    Object obj2 = sVar.f7443b;
                    r6.k.c(obj2);
                    int i9 = sVar.f7445d;
                    i.u uVar2 = sVar.f7444c;
                    if (uVar2 == null) {
                        uVar2 = new i.u();
                        sVar.f7444c = uVar2;
                        sVar.f7447f.i(obj2, uVar2);
                    }
                    sVar.c(obj, i9, obj2, uVar2);
                }
                return z.f2639a;
            case 25:
                float floatValue2 = ((Number) obj).floatValue();
                r.s sVar2 = (r.s) this.f1524h;
                float f23 = -floatValue2;
                if ((f23 >= 0.0f || sVar2.d()) && (f23 <= 0.0f || sVar2.a())) {
                    if (Math.abs(sVar2.f7680g) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + sVar2.f7680g).toString());
                    }
                    float f24 = sVar2.f7680g + f23;
                    sVar2.f7680g = f24;
                    if (Math.abs(f24) > 0.5f) {
                        r.l lVar = (r.l) sVar2.f7678e.getValue();
                        float f25 = sVar2.f7680g;
                        int round2 = Math.round(f25);
                        r.l lVar2 = sVar2.f7676c;
                        boolean a10 = lVar.a(round2, !sVar2.f7675b);
                        if (a10 && lVar2 != null) {
                            a10 = lVar2.a(round2, true);
                        }
                        if (a10) {
                            sVar2.f(lVar, sVar2.f7675b, true);
                            sVar2.f7694u.setValue(z.f2639a);
                            sVar2.h(f25 - sVar2.f7680g, lVar);
                        } else {
                            r1.d0 d0Var2 = sVar2.f7683j;
                            if (d0Var2 != null) {
                                d0Var2.k();
                            }
                            sVar2.h(f25 - sVar2.f7680g, sVar2.g());
                        }
                    }
                    if (Math.abs(sVar2.f7680g) > 0.5f) {
                        f23 -= sVar2.f7680g;
                        sVar2.f7680g = 0.0f;
                    }
                    r10 = f23;
                }
                return Float.valueOf(-r10);
            case 26:
                r1.a aVar3 = (r1.a) obj;
                r1.e0 e0Var3 = (r1.e0) this.f1524h;
                if (aVar3.I()) {
                    if (aVar3.o().f7755b) {
                        aVar3.E();
                    }
                    for (Map.Entry entry2 : aVar3.o().f7762i.entrySet()) {
                        r1.e0.a(e0Var3, (p1.l) entry2.getKey(), ((Number) entry2.getValue()).intValue(), aVar3.l());
                    }
                    a1 a1Var = aVar3.l().f7702s;
                    r6.k.c(a1Var);
                    while (!a1Var.equals(e0Var3.f7754a.l())) {
                        for (p1.l lVar3 : e0Var3.b(a1Var).keySet()) {
                            r1.e0.a(e0Var3, lVar3, e0Var3.c(a1Var, lVar3), a1Var);
                        }
                        a1Var = a1Var.f7702s;
                        r6.k.c(a1Var);
                    }
                }
                return z.f2639a;
            case 27:
                ((i0.d) this.f1524h).b((s0.m) obj);
                return Boolean.TRUE;
            case 28:
                return new c.g(3, (s.o) this.f1524h);
            default:
                return new c.g(i8, (s.u) this.f1524h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g2.i iVar, androidx.room.c cVar) {
        super(1);
        this.f1523g = 10;
        this.f1524h = iVar;
    }
}
