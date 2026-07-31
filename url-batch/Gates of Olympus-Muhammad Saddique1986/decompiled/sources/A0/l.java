package A0;

import B.C0022x;
import B.Y;
import I.C0150g0;
import I.C0176u;
import I.C0187z0;
import I.D;
import I.EnumC0175t0;
import I.W0;
import R1.y;
import S.w;
import S.z;
import S1.AbstractC0222a;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import a0.C0240e;
import a0.C0241f;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.C0334c;
import b0.C0338g;
import b0.C0341j;
import b0.C0344m;
import b0.C0345n;
import b0.C0352v;
import b0.F;
import b0.H;
import b0.I;
import b0.J;
import b0.K;
import b0.L;
import b0.M;
import b0.O;
import b0.S;
import b0.T;
import c0.AbstractC0357c;
import c0.C0358d;
import d0.C0400a;
import d0.C0401b;
import d0.C0406g;
import d0.C0407h;
import d0.InterfaceC0403d;
import e0.C0416b;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import h0.AbstractC0450C;
import h0.C0460c;
import h1.N;
import j.C0519A;
import j.C0547u;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l.C0586l;
import m.C0632q;
import n.C0690p;
import n.C0691q;
import n.C0692s;
import n.C0693t;
import n.C0698y;
import n.y0;
import n0.C0700A;
import p.C0776m0;
import p.C0793v0;
import q2.C0821h;
import q2.X;
import r.AbstractC0856c;
import r0.InterfaceC0919p;
import t.C;
import t0.G;
import t2.C1045P;
import x.V;

/* loaded from: classes.dex */
public final class l extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i3, Object obj) {
        super(1);
        this.f133e = i3;
        this.f134f = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:(3:47|(1:49)(1:120)|50)(1:121)|51|(1:53)|54|(1:56)|57|(1:59)(1:119)|(1:61)(1:118)|(2:(1:64)(1:116)|(1:115)(1:66))|117|(5:(2:70|(16:75|76|(1:78)|79|80|81|82|83|84|85|86|87|89|90|91|92))|89|90|91|92)|111|112|76|(0)|79|80|81|82|83|84|85|86|87) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0392, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0393, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0396, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0397, code lost:
    
        r9 = r14;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
    
        if (r10 != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026f  */
    /* JADX WARN: Type inference failed for: r1v50, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r1v51, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r1v54, types: [e2.c, f2.k] */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        int i3;
        C0344m c0344m;
        C0338g c0338g;
        b0.r rVar;
        C0401b c0401b;
        float f3;
        float f4;
        G1.m mVar;
        float f5;
        long n3;
        boolean z3;
        int i4 = 8;
        switch (this.f133e) {
            case 0:
                u.d((i) obj, ((f) this.f134f).f98a);
                return y.f4171a;
            case 1:
                ((List) obj).add((Float) ((C) this.f134f).b());
                return true;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0238c(((C0238c) ((InterfaceC0422a) this.f134f).b()).f4722a);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0150g0) this.f134f).h((int) (((O0.j) obj).f3740a >> 32));
                return y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                ((O) obj).b(((Number) ((W0) this.f134f).getValue()).floatValue());
                return y.f4171a;
            case 5:
                H0.r rVar2 = (H0.r) obj;
                return ((H0.e) this.f134f).a(new H0.r(null, rVar2.f2607b, rVar2.f2608c, rVar2.f2609d, rVar2.f2610e)).f2611d;
            case 6:
                D.f2647e.removeFrameCallback((I.C) this.f134f);
                return y.f4171a;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                C0187z0 c0187z0 = (C0187z0) this.f134f;
                synchronized (c0187z0.f2985b) {
                    try {
                        X x3 = c0187z0.f2986c;
                        if (x3 != null) {
                            C1045P c1045p = c0187z0.f3001r;
                            EnumC0175t0 enumC0175t0 = EnumC0175t0.f2920e;
                            c1045p.getClass();
                            c1045p.l(null, enumC0175t0);
                            C1045P c1045p2 = C0187z0.f2982v;
                            x3.a(cancellationException);
                            c0187z0.f2998o = null;
                            x3.x(new C0022x(c0187z0, i4, th));
                        } else {
                            c0187z0.f2987d = cancellationException;
                            C1045P c1045p3 = c0187z0.f3001r;
                            EnumC0175t0 enumC0175t02 = EnumC0175t0.f2919d;
                            c1045p3.getClass();
                            c1045p3.l(null, enumC0175t02);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return y.f4171a;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                ((C0176u) this.f134f).w(obj);
                return y.f4171a;
            case AbstractC0856c.f8037c /* 9 */:
                if (obj instanceof z) {
                    ((z) obj).f(4);
                }
                ((C0519A) this.f134f).a(obj);
                return y.f4171a;
            case AbstractC0856c.f8039e /* 10 */:
                R.k kVar = ((R.i) this.f134f).f4029c;
                return Boolean.valueOf(kVar != null ? kVar.b(obj) : true);
            case 11:
                w wVar = (w) this.f134f;
                wVar.getClass();
                synchronized (wVar.f4276f) {
                    S.v vVar = wVar.f4278h;
                    f2.j.c(vVar);
                    Object obj2 = vVar.f4260b;
                    f2.j.c(obj2);
                    int i5 = vVar.f4262d;
                    C0547u c0547u = vVar.f4261c;
                    if (c0547u == null) {
                        c0547u = new C0547u();
                        vVar.f4261c = c0547u;
                        vVar.f4264f.i(obj2, c0547u);
                    }
                    vVar.c(obj, i5, obj2, c0547u);
                }
                return y.f4171a;
            case 12:
                return obj == ((AbstractC0222a) this.f134f) ? "(this Collection)" : String.valueOf(obj);
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                f2.j.f(entry, "it");
                S1.e eVar = (S1.e) this.f134f;
                eVar.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == eVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != eVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 14:
                G g3 = (G) obj;
                ((C0022x) this.f134f).n(g3);
                g3.b();
                return y.f4171a;
            case AbstractC0856c.f8041g /* 15 */:
                O o3 = (O) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f134f;
                shadowGraphicsLayerElement.getClass();
                o3.h(o3.f5377v.a() * o.j.f7406d);
                o3.i(shadowGraphicsLayerElement.f4891a);
                o3.e(shadowGraphicsLayerElement.f4892b);
                o3.c(shadowGraphicsLayerElement.f4893c);
                o3.j(shadowGraphicsLayerElement.f4894d);
                return y.f4171a;
            case 16:
                O o4 = (O) obj;
                S s3 = (S) this.f134f;
                o4.f(s3.f5389q);
                o4.g(s3.f5390r);
                o4.b(s3.f5391s);
                float f6 = s3.f5392t;
                if (o4.f5363h != f6) {
                    o4.f5359d = 8 | o4.f5359d;
                    o4.f5363h = f6;
                }
                float f7 = s3.f5393u;
                if (o4.f5364i != f7) {
                    o4.f5359d |= 16;
                    o4.f5364i = f7;
                }
                o4.h(s3.f5394v);
                float f8 = s3.f5395w;
                if (o4.f5368m != f8) {
                    o4.f5359d |= 256;
                    o4.f5368m = f8;
                }
                float f9 = s3.f5396x;
                if (o4.f5369n != f9) {
                    o4.f5359d |= 512;
                    o4.f5369n = f9;
                }
                float f10 = s3.f5397y;
                if (o4.f5370o != f10) {
                    o4.f5359d |= 1024;
                    o4.f5370o = f10;
                }
                float f11 = s3.f5398z;
                if (o4.f5371p != f11) {
                    o4.f5359d |= 2048;
                    o4.f5371p = f11;
                }
                o4.m(s3.f5384A);
                o4.i(s3.f5385B);
                o4.e(s3.C);
                if (!f2.j.a(null, null)) {
                    o4.f5359d |= 131072;
                }
                o4.c(s3.D);
                o4.j(s3.f5386E);
                int i6 = s3.f5387F;
                if (!M.q(o4.f5375t, i6)) {
                    o4.f5359d |= 32768;
                    o4.f5375t = i6;
                }
                return y.f4171a;
            case 17:
                InterfaceC0403d interfaceC0403d = (InterfaceC0403d) obj;
                C0416b c0416b = (C0416b) this.f134f;
                C0341j c0341j = c0416b.f5705l;
                if (c0416b.f5707n && c0416b.f5715v && c0341j != null) {
                    ?? r12 = c0416b.f5697d;
                    G1.m S3 = interfaceC0403d.S();
                    long n4 = S3.n();
                    S3.h().f();
                    try {
                        ((G1.m) ((Y) S3.f2116b).f334d).h().i(c0341j, 1);
                        r12.n(interfaceC0403d);
                    } finally {
                        A.k.q(S3, n4);
                    }
                } else {
                    c0416b.f5697d.n(interfaceC0403d);
                }
                return y.f4171a;
            case 18:
                AbstractC0450C abstractC0450C = (AbstractC0450C) obj;
                C0460c c0460c = (C0460c) this.f134f;
                c0460c.g(abstractC0450C);
                ?? r13 = c0460c.f5917i;
                if (r13 != 0) {
                    r13.n(abstractC0450C);
                }
                return y.f4171a;
            case 19:
                Throwable th3 = (Throwable) obj;
                h1.M m3 = (h1.M) this.f134f;
                if (th3 != null) {
                    m3.f6098j.s(new N(th3));
                }
                if (m3.f6100l.f4157e != R1.v.f4168a) {
                    ((j1.i) m3.f6100l.getValue()).close();
                }
                return y.f4171a;
            case 20:
                W0 w02 = (W0) ((C0586l) this.f134f).f6504d.e(obj);
                return new O0.j(w02 != null ? ((O0.j) w02.getValue()).f3740a : 0L);
            case 21:
                C0632q c0632q = (C0632q) obj;
                float f12 = c0632q.f6871b;
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                float f13 = c0632q.f6872c;
                if (f13 < -0.5f) {
                    f13 = -0.5f;
                }
                if (f13 > 0.5f) {
                    f13 = 0.5f;
                }
                float f14 = c0632q.f6873d;
                float f15 = f14 >= -0.5f ? f14 : -0.5f;
                float f16 = f15 <= 0.5f ? f15 : 0.5f;
                float f17 = c0632q.f6870a;
                float f18 = f17 >= 0.0f ? f17 : 0.0f;
                return new C0352v(C0352v.a(M.b(f12, f13, f16, f18 <= 1.0f ? f18 : 1.0f, C0358d.f5493t), (AbstractC0357c) this.f134f));
            case 22:
                Y.c cVar = (Y.c) obj;
                C0693t c0693t = (C0693t) this.f134f;
                if (cVar.a() * c0693t.f7203t < 0.0f || C0241f.c(cVar.f4651d.d()) <= 0.0f) {
                    return cVar.b(C0691q.f7187f);
                }
                float f19 = 2;
                float min = Math.min(O0.e.a(c0693t.f7203t, 0.0f) ? 1.0f : (float) Math.ceil(cVar.a() * c0693t.f7203t), (float) Math.ceil(C0241f.c(cVar.f4651d.d()) / f19));
                float f20 = min / f19;
                long e3 = l0.c.e(f20, f20);
                long e4 = AbstractC0235a.e(C0241f.d(cVar.f4651d.d()) - min, C0241f.b(cVar.f4651d.d()) - min);
                float f21 = min * f19;
                boolean z4 = f21 > C0241f.c(cVar.f4651d.d());
                K d3 = c0693t.f7205v.d(cVar.f4651d.d(), cVar.f4651d.getLayoutDirection(), cVar);
                if (!(d3 instanceof H)) {
                    if (!(d3 instanceof J)) {
                        if (!(d3 instanceof I)) {
                            throw new C1.c();
                        }
                        T t3 = c0693t.f7204u;
                        long j3 = z4 ? 0L : e3;
                        if (z4) {
                            e4 = cVar.f4651d.d();
                        }
                        return cVar.b(new l.C(t3, j3, e4, z4 ? C0406g.f5653a : new C0407h(min, 0.0f, 0, 0, 30), 1));
                    }
                    T t4 = c0693t.f7204u;
                    C0240e c0240e = ((J) d3).f5353a;
                    if (O2.l.j0(c0240e)) {
                        return cVar.b(new C0692s(z4, t4, c0240e.f4732e, f20, min, e3, e4, new C0407h(min, 0.0f, 0, 0, 30)));
                    }
                    if (c0693t.f7202s == null) {
                        c0693t.f7202s = new C0690p();
                    }
                    C0690p c0690p = c0693t.f7202s;
                    f2.j.c(c0690p);
                    L l3 = c0690p.f7185d;
                    if (l3 == null) {
                        l3 = M.h();
                        c0690p.f7185d = l3;
                    }
                    C0341j c0341j2 = (C0341j) l3;
                    c0341j2.e();
                    L.a(c0341j2, c0240e);
                    if (!z4) {
                        L h3 = M.h();
                        L.a(h3, new C0240e(min, min, c0240e.b() - min, c0240e.a() - min, n.r.r(c0240e.f4732e, min), n.r.r(c0240e.f4733f, min), n.r.r(c0240e.f4734g, min), n.r.r(c0240e.f4735h, min)));
                        c0341j2.d(c0341j2, h3, 0);
                    }
                    return cVar.b(new C0022x(c0341j2, 26, t4));
                }
                T t5 = c0693t.f7204u;
                H h4 = (H) d3;
                if (z4) {
                    return cVar.b(new C0022x(h4, 25, t5));
                }
                if (t5 != null) {
                    long j4 = t5.f5399a;
                    c0344m = new C0344m(j4, 5, Build.VERSION.SDK_INT >= 29 ? C0345n.f5427a.a(j4, 5) : new PorterDuffColorFilter(M.D(j4), M.G(5)));
                    i3 = 1;
                } else {
                    i3 = 0;
                    c0344m = null;
                }
                C0341j c0341j3 = h4.f5351a;
                C0239d c2 = c0341j3.c();
                if (c0693t.f7202s == null) {
                    c0693t.f7202s = new C0690p();
                }
                C0690p c0690p2 = c0693t.f7202s;
                f2.j.c(c0690p2);
                L l4 = c0690p2.f7185d;
                if (l4 == null) {
                    l4 = M.h();
                    c0690p2.f7185d = l4;
                }
                L l5 = l4;
                C0341j c0341j4 = (C0341j) l5;
                c0341j4.e();
                L.b(l5, c2);
                c0341j4.d(c0341j4, c0341j3, 0);
                f2.u uVar = new f2.u();
                C0344m c0344m2 = c0344m;
                long d4 = O2.d.d((int) Math.ceil(c2.c()), (int) Math.ceil(c2.b()));
                C0690p c0690p3 = c0693t.f7202s;
                f2.j.c(c0690p3);
                C0338g c0338g2 = c0690p3.f7182a;
                b0.r rVar3 = c0690p3.f7183b;
                F f22 = c0338g2 != null ? new F(c0338g2.a()) : null;
                if (!(f22 == null ? false : F.a(f22.f5349a, 0))) {
                    F f23 = c0338g2 != null ? new F(c0338g2.a()) : null;
                    if (f23 == null || i3 != f23.f5349a) {
                        z3 = false;
                        break;
                    } else {
                        z3 = true;
                        break;
                    }
                }
                r7 = true;
                try {
                    try {
                        if (c0338g2 != null && rVar3 != null) {
                            float d5 = C0241f.d(cVar.f4651d.d());
                            Bitmap bitmap = c0338g2.f5413a;
                            if (d5 <= bitmap.getWidth() && C0241f.b(cVar.f4651d.d()) <= bitmap.getHeight() && r7) {
                                rVar = rVar3;
                                c0338g = c0338g2;
                                c0401b = c0690p3.f7184c;
                                if (c0401b == null) {
                                    c0401b = new C0401b();
                                    c0690p3.f7184c = c0401b;
                                }
                                long f02 = O2.d.f0(d4);
                                O0.k layoutDirection = cVar.f4651d.getLayoutDirection();
                                C0400a c0400a = c0401b.f5648d;
                                O0.b bVar = c0400a.f5644a;
                                O0.k kVar2 = c0400a.f5645b;
                                b0.r rVar4 = c0400a.f5646c;
                                C0338g c0338g3 = c0338g;
                                long j5 = c0400a.f5647d;
                                c0400a.f5644a = cVar;
                                c0400a.f5645b = layoutDirection;
                                c0400a.f5646c = rVar;
                                c0400a.f5647d = f02;
                                rVar.f();
                                r17.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b.d(), 0L) : f02, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
                                f3 = -c2.f4724a;
                                f4 = -c2.f4725b;
                                G1.m mVar2 = c0401b.f5649e;
                                ((Y) mVar2.f2116b).r(f3, f4);
                                InterfaceC0403d.z(c0401b, h4.f5351a, t5, 0.0f, new C0407h(f21, 0.0f, 0, 0, 30), 52);
                                float f24 = 1;
                                float d6 = (C0241f.d(c0401b.d()) + f24) / C0241f.d(c0401b.d());
                                float b3 = (C0241f.b(c0401b.d()) + f24) / C0241f.b(c0401b.d());
                                long y3 = c0401b.y();
                                n3 = mVar2.n();
                                mVar2.h().f();
                                mVar = mVar2;
                                ((Y) mVar.f2116b).o(d6, b3, y3);
                                InterfaceC0403d.z(c0401b, l5, t5, 0.0f, null, 28);
                                mVar.h().a();
                                mVar.z(n3);
                                ((Y) mVar.f2116b).r(-f3, -f4);
                                rVar.a();
                                c0400a.f5644a = bVar;
                                c0400a.f5645b = kVar2;
                                c0400a.f5646c = rVar4;
                                c0400a.f5647d = j5;
                                c0338g3.f5413a.prepareToDraw();
                                uVar.f5832d = c0338g3;
                                return cVar.b(new C0.n(c2, uVar, d4, c0344m2));
                            }
                        }
                        mVar.h().a();
                        mVar.z(n3);
                        ((Y) mVar.f2116b).r(-f3, -f4);
                        rVar.a();
                        c0400a.f5644a = bVar;
                        c0400a.f5645b = kVar2;
                        c0400a.f5646c = rVar4;
                        c0400a.f5647d = j5;
                        c0338g3.f5413a.prepareToDraw();
                        uVar.f5832d = c0338g3;
                        return cVar.b(new C0.n(c2, uVar, d4, c0344m2));
                    } catch (Throwable th4) {
                        th = th4;
                        f5 = f4;
                        ((Y) mVar.f2116b).r(-f3, -f5);
                        throw th;
                    }
                    ((Y) mVar.f2116b).o(d6, b3, y3);
                    InterfaceC0403d.z(c0401b, l5, t5, 0.0f, null, 28);
                } catch (Throwable th5) {
                    f5 = f4;
                    try {
                        mVar.h().a();
                        mVar.z(n3);
                        throw th5;
                    } catch (Throwable th6) {
                        th = th6;
                        ((Y) mVar.f2116b).r(-f3, -f5);
                        throw th;
                    }
                }
                C0338g f25 = M.f((int) (d4 >> 32), (int) (4294967295L & d4), i3);
                c0690p3.f7182a = f25;
                C0334c a3 = M.a(f25);
                c0690p3.f7183b = a3;
                c0338g = f25;
                rVar = a3;
                c0401b = c0690p3.f7184c;
                if (c0401b == null) {
                }
                long f022 = O2.d.f0(d4);
                O0.k layoutDirection2 = cVar.f4651d.getLayoutDirection();
                C0400a c0400a2 = c0401b.f5648d;
                O0.b bVar2 = c0400a2.f5644a;
                O0.k kVar22 = c0400a2.f5645b;
                b0.r rVar42 = c0400a2.f5646c;
                C0338g c0338g32 = c0338g;
                long j52 = c0400a2.f5647d;
                c0400a2.f5644a = cVar;
                c0400a2.f5645b = layoutDirection2;
                c0400a2.f5646c = rVar;
                c0400a2.f5647d = f022;
                rVar.f();
                r17.F(C0352v.f5434b, 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(c0401b.d(), 0L) : f022, 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
                f3 = -c2.f4724a;
                f4 = -c2.f4725b;
                G1.m mVar22 = c0401b.f5649e;
                ((Y) mVar22.f2116b).r(f3, f4);
                InterfaceC0403d.z(c0401b, h4.f5351a, t5, 0.0f, new C0407h(f21, 0.0f, 0, 0, 30), 52);
                float f242 = 1;
                float d62 = (C0241f.d(c0401b.d()) + f242) / C0241f.d(c0401b.d());
                float b32 = (C0241f.b(c0401b.d()) + f242) / C0241f.b(c0401b.d());
                long y32 = c0401b.y();
                n3 = mVar22.n();
                mVar22.h().f();
                mVar = mVar22;
                break;
            case 23:
                long j6 = ((C0238c) obj).f4722a;
                C0698y c0698y = (C0698y) this.f134f;
                if (c0698y.f7237w) {
                    c0698y.f7238x.b();
                }
                return y.f4171a;
            case 24:
                float floatValue = ((Number) obj).floatValue();
                y0 y0Var = (y0) this.f134f;
                float g4 = y0Var.f7242a.g() + floatValue + y0Var.f7246e;
                float x4 = O2.d.x(g4, 0.0f, y0Var.f7245d.g());
                r7 = g4 == x4;
                C0150g0 c0150g0 = y0Var.f7242a;
                float g5 = x4 - c0150g0.g();
                int round = Math.round(g5);
                c0150g0.h(c0150g0.g() + round);
                y0Var.f7246e = g5 - round;
                if (!r7) {
                    floatValue = g5;
                }
                return Float.valueOf(floatValue);
            case 25:
                Throwable th7 = (Throwable) obj;
                C0700A c0700a = (C0700A) this.f134f;
                C0821h c0821h = c0700a.f7254f;
                if (c0821h != null) {
                    c0821h.C(th7);
                }
                c0700a.f7254f = null;
                return y.f4171a;
            case 26:
                ((o.n) this.f134f).f7419a.setValue(new o.l(((C0238c) obj).f4722a));
                return y.f4171a;
            case 27:
                ((V) this.f134f).b();
                return y.f4171a;
            case 28:
                ((C0776m0) this.f134f).f7722H.f7697v = (InterfaceC0919p) obj;
                return y.f4171a;
            default:
                long j7 = ((C0238c) obj).f4722a;
                C0793v0 c0793v0 = (C0793v0) this.f134f;
                return new C0238c(C0793v0.a(c0793v0, c0793v0.f7785h, j7, c0793v0.f7784g));
        }
    }
}
