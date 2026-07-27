package A;

import A0.C0043n;
import B1.C0097d;
import G.C0199g0;
import G.C0225u;
import G.C0236z0;
import G.EnumC0224t0;
import G.X0;
import P0.C0259a;
import W2.C0286h;
import W2.InterfaceC0280c0;
import Z.C0310g;
import Z.C0313j;
import Z.C0316m;
import Z.C0317n;
import Z.C0323u;
import a.AbstractC0345a;
import a0.AbstractC0348c;
import a0.C0349d;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.C0493a;
import b0.C0494b;
import b0.C0499g;
import b0.C0500h;
import b0.InterfaceC0496d;
import com.appsflyer.attribution.RequestError;
import f0.AbstractC0572C;
import f0.C0582c;
import h1.C0656i;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k.C0726B;
import k.C0746l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.C0800A;
import m.C0844q;
import m.C0845s;
import m.C0846t;
import m.C0850x;
import m.u0;
import o.C0891i0;
import o.C0908r0;
import p0.C0941B;
import p0.C0976l;
import p0.InterfaceC0961W;
import p0.InterfaceC0980p;
import q.AbstractC1024c;
import r0.InterfaceC1060a;
import s.C1112p;
import s0.C1150j0;
import w2.C1294c;
import y2.C1338m;

/* loaded from: classes.dex */
public final class g0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i2, Object obj) {
        super(1);
        this.f143d = i2;
        this.f144e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x038a, code lost:
    
        if (r13 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03b9, code lost:
    
        if (r8 != false) goto L146;
     */
    /* JADX WARN: Type inference failed for: r2v117, types: [p0.O, r0.a] */
    /* JADX WARN: Type inference failed for: r2v30, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i2;
        C0316m c0316m;
        boolean z4;
        int i4 = 5;
        switch (this.f143d) {
            case 0:
                return new Y.c(((Y.c) ((Function0) this.f144e).invoke()).f4372a);
            case 1:
                ((C0199g0) this.f144e).f((int) (((M0.j) obj).f3554a >> 32));
                return Unit.f7487a;
            case 2:
                F0.s sVar = (F0.s) obj;
                return ((F0.e) this.f144e).a(new F0.s(null, sVar.f2628b, sVar.f2629c, sVar.f2630d, sVar.f2631e)).f2632d;
            case 3:
                G.D.f2645e.removeFrameCallback((G.C) this.f144e);
                return Unit.f7487a;
            case 4:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                C0236z0 c0236z0 = (C0236z0) this.f144e;
                synchronized (c0236z0.f2983b) {
                    try {
                        InterfaceC0280c0 interfaceC0280c0 = c0236z0.f2984c;
                        if (interfaceC0280c0 != null) {
                            Z2.S s4 = c0236z0.f2999r;
                            EnumC0224t0 enumC0224t0 = EnumC0224t0.f2917e;
                            s4.getClass();
                            s4.l(null, enumC0224t0);
                            Z2.S s5 = C0236z0.f2980v;
                            interfaceC0280c0.a(cancellationException);
                            c0236z0.f2996o = null;
                            interfaceC0280c0.r(new C0028y(c0236z0, 10, th));
                        } else {
                            c0236z0.f2985d = cancellationException;
                            Z2.S s6 = c0236z0.f2999r;
                            EnumC0224t0 enumC0224t02 = EnumC0224t0.f2916d;
                            s6.getClass();
                            s6.l(null, enumC0224t02);
                            Unit unit = Unit.f7487a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.f7487a;
            case 5:
                ((C0225u) this.f144e).w(obj);
                return Unit.f7487a;
            case 6:
                P.k kVar = ((P.i) this.f144e).f3667c;
                return Boolean.valueOf(kVar != null ? kVar.b(obj) : true);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Q.A a4 = (Q.A) this.f144e;
                a4.getClass();
                synchronized (a4.f3795f) {
                    Q.z zVar = a4.f3797h;
                    Intrinsics.c(zVar);
                    Object obj2 = zVar.f3906b;
                    Intrinsics.c(obj2);
                    int i5 = zVar.f3908d;
                    i.v vVar = zVar.f3907c;
                    if (vVar == null) {
                        vVar = new i.v();
                        zVar.f3907c = vVar;
                        zVar.f3910f.i(obj2, vVar);
                        Unit unit2 = Unit.f7487a;
                    }
                    zVar.c(obj, i5, obj2, vVar);
                }
                return Unit.f7487a;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                r0.G g4 = (r0.G) obj;
                ((C0028y) this.f144e).invoke(g4);
                g4.a();
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                Z.M m4 = (Z.M) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.f144e;
                shadowGraphicsLayerElement.getClass();
                m4.g(m4.f4484y.e() * n.k.f8527d);
                m4.i(shadowGraphicsLayerElement.f5166a);
                m4.c(shadowGraphicsLayerElement.f5167b);
                m4.b(shadowGraphicsLayerElement.f5168c);
                m4.j(shadowGraphicsLayerElement.f5169d);
                return Unit.f7487a;
            case 10:
                Z.M m5 = (Z.M) obj;
                Z.Q q2 = (Z.Q) this.f144e;
                m5.d(q2.f4501t);
                m5.f(q2.f4502u);
                m5.a(q2.f4503v);
                float f4 = q2.f4504w;
                if (m5.f4470k != f4) {
                    m5.f4466d |= 8;
                    m5.f4470k = f4;
                }
                float f5 = q2.f4505x;
                if (m5.f4471l != f5) {
                    m5.f4466d |= 16;
                    m5.f4471l = f5;
                }
                m5.g(q2.f4506y);
                float f6 = q2.f4507z;
                if (m5.f4475p != f6) {
                    m5.f4466d |= 256;
                    m5.f4475p = f6;
                }
                float f7 = q2.f4492A;
                if (m5.f4476q != f7) {
                    m5.f4466d |= 512;
                    m5.f4476q = f7;
                }
                float f8 = q2.B;
                if (m5.f4477r != f8) {
                    m5.f4466d |= 1024;
                    m5.f4477r = f8;
                }
                float f9 = q2.f4493C;
                if (m5.f4478s != f9) {
                    m5.f4466d |= 2048;
                    m5.f4478s = f9;
                }
                m5.k(q2.f4494D);
                m5.i(q2.f4495E);
                m5.c(q2.f4496F);
                if (!Intrinsics.a(null, null)) {
                    m5.f4466d |= 131072;
                }
                m5.b(q2.f4497G);
                m5.j(q2.f4498H);
                int i6 = q2.f4499I;
                if (!Z.K.p(m5.f4482w, i6)) {
                    m5.f4466d |= 32768;
                    m5.f4482w = i6;
                }
                return Unit.f7487a;
            case RequestError.STOP_TRACKING /* 11 */:
                AbstractC0572C abstractC0572C = (AbstractC0572C) obj;
                C0582c c0582c = (C0582c) this.f144e;
                c0582c.g(abstractC0572C);
                ?? r2 = c0582c.f6341i;
                if (r2 != 0) {
                    r2.invoke(abstractC0572C);
                }
                return Unit.f7487a;
            case 12:
                Throwable th3 = (Throwable) obj;
                f1.N n2 = (f1.N) this.f144e;
                if (th3 != null) {
                    n2.f6525m.y(new f1.O(th3));
                }
                if (n2.f6527o.a()) {
                    ((C0656i) n2.f6527o.getValue()).close();
                }
                return Unit.f7487a;
            case 13:
                return obj == ((i.w) this.f144e) ? "(this)" : String.valueOf(obj);
            case 14:
                X0 x02 = (X0) ((C0746l) this.f144e).f7303d.e(obj);
                return new M0.j(x02 != null ? ((M0.j) x02.getValue()).f3554a : 0L);
            case AbstractC1024c.f9246g /* 15 */:
                l.r rVar = (l.r) obj;
                float f10 = rVar.f7835b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = rVar.f7836c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = rVar.f7837d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = rVar.f7834a;
                r10 = f15 >= 0.0f ? f15 : 0.0f;
                return new C0323u(C0323u.a(Z.K.b(f10, f11, f14, r10 <= 1.0f ? r10 : 1.0f, C0349d.f4780t), (AbstractC0348c) this.f144e));
            case 16:
                Throwable th4 = (Throwable) obj;
                C0800A c0800a = (C0800A) this.f144e;
                C0286h c0286h = c0800a.f7869i;
                if (c0286h != null) {
                    c0286h.H(th4);
                }
                c0800a.f7869i = null;
                return Unit.f7487a;
            case 17:
                W.c cVar = (W.c) obj;
                C0846t c0846t = (C0846t) this.f144e;
                if (cVar.e() * c0846t.f8185w < 0.0f || Y.f.c(cVar.f4193d.h()) <= 0.0f) {
                    return cVar.a(m.r.f8167e);
                }
                float f16 = 2;
                float min = Math.min(M0.e.a(c0846t.f8185w, 0.0f) ? 1.0f : (float) Math.ceil(cVar.e() * c0846t.f8185w), (float) Math.ceil(Y.f.c(cVar.f4193d.h()) / f16));
                float f17 = min / f16;
                long c4 = AbstractC0345a.c(f17, f17);
                long N3 = u3.l.N(Y.f.d(cVar.f4193d.h()) - min, Y.f.b(cVar.f4193d.h()) - min);
                float f18 = min * f16;
                boolean z5 = f18 > Y.f.c(cVar.f4193d.h());
                Z.I a5 = c0846t.f8187y.a(cVar.f4193d.h(), cVar.f4193d.getLayoutDirection(), cVar);
                if (!(a5 instanceof Z.F)) {
                    if (!(a5 instanceof Z.H)) {
                        if (!(a5 instanceof Z.G)) {
                            throw new C1338m();
                        }
                        Z.S s7 = c0846t.f8186x;
                        long j4 = z5 ? 0L : c4;
                        if (z5) {
                            N3 = cVar.f4193d.h();
                        }
                        return cVar.a(new C0726B(s7, j4, N3, z5 ? C0499g.f5607a : new C0500h(min, 0.0f, 0, 0, 30), 1));
                    }
                    Z.S s8 = c0846t.f8186x;
                    Y.e eVar = ((Z.H) a5).f4459a;
                    if (u3.d.L(eVar)) {
                        return cVar.a(new C0845s(z5, s8, eVar.f4382e, f17, min, c4, N3, new C0500h(min, 0.0f, 0, 0, 30)));
                    }
                    if (c0846t.f8184v == null) {
                        c0846t.f8184v = new C0844q();
                    }
                    C0844q c0844q = c0846t.f8184v;
                    Intrinsics.c(c0844q);
                    Z.J j5 = c0844q.f8164d;
                    if (j5 == null) {
                        j5 = Z.K.h();
                        c0844q.f8164d = j5;
                    }
                    C0313j c0313j = (C0313j) j5;
                    c0313j.e();
                    Z.J.a(c0313j, eVar);
                    if (!z5) {
                        Z.J h4 = Z.K.h();
                        Z.J.a(h4, new Y.e(min, min, eVar.b() - min, eVar.a() - min, u3.d.T(min, eVar.f4382e), u3.d.T(min, eVar.f4383f), u3.d.T(min, eVar.f4384g), u3.d.T(min, eVar.f4385h)));
                        c0313j.d(c0313j, h4, 0);
                    }
                    return cVar.a(new C0028y(c0313j, 24, s8));
                }
                Z.S s9 = c0846t.f8186x;
                Z.F f19 = (Z.F) a5;
                if (z5) {
                    return cVar.a(new C0028y(f19, 23, s9));
                }
                if (s9 != null) {
                    long j6 = s9.f4508a;
                    c0316m = new C0316m(j6, 5, Build.VERSION.SDK_INT >= 29 ? C0317n.f4537a.a(j6, 5) : new PorterDuffColorFilter(Z.K.D(j6), Z.K.G(5)));
                    i2 = 1;
                } else {
                    i2 = 0;
                    c0316m = null;
                }
                C0313j c0313j2 = f19.f4457a;
                Y.d c5 = c0313j2.c();
                if (c0846t.f8184v == null) {
                    c0846t.f8184v = new C0844q();
                }
                C0844q c0844q2 = c0846t.f8184v;
                Intrinsics.c(c0844q2);
                Z.J j7 = c0844q2.f8164d;
                if (j7 == null) {
                    j7 = Z.K.h();
                    c0844q2.f8164d = j7;
                }
                Z.J j8 = j7;
                C0313j c0313j3 = (C0313j) j8;
                c0313j3.e();
                Z.J.b(j8, c5);
                c0313j3.d(c0313j3, c0313j2, 0);
                M2.E e4 = new M2.E();
                long c6 = u3.d.c((int) Math.ceil(c5.c()), (int) Math.ceil(c5.b()));
                C0844q c0844q3 = c0846t.f8184v;
                Intrinsics.c(c0844q3);
                C0310g c0310g = c0844q3.f8161a;
                Z.r rVar2 = c0844q3.f8162b;
                Z.C c7 = c0310g != null ? new Z.C(c0310g.a()) : null;
                if (!(c7 == null ? false : Z.C.a(c7.f4450a, 0))) {
                    Z.C c8 = c0310g != null ? new Z.C(c0310g.a()) : null;
                    if (c8 != null && i2 == c8.f4450a) {
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                r8 = true;
                if (c0310g != null && rVar2 != null) {
                    float d4 = Y.f.d(cVar.f4193d.h());
                    Bitmap bitmap = c0310g.f4523a;
                    if (d4 <= bitmap.getWidth()) {
                        if (Y.f.b(cVar.f4193d.h()) <= bitmap.getHeight()) {
                        }
                    }
                }
                c0310g = Z.K.f((int) (c6 >> 32), (int) (c6 & 4294967295L), i2);
                c0844q3.f8161a = c0310g;
                rVar2 = Z.K.a(c0310g);
                c0844q3.f8162b = rVar2;
                C0494b c0494b = c0844q3.f8163c;
                if (c0494b == null) {
                    c0494b = new C0494b();
                    c0844q3.f8163c = c0494b;
                }
                long U3 = u3.d.U(c6);
                M0.k layoutDirection = cVar.f4193d.getLayoutDirection();
                C0493a c0493a = c0494b.f5602d;
                M0.b bVar = c0493a.f5598a;
                M0.k kVar2 = c0493a.f5599b;
                C0316m c0316m2 = c0316m;
                Z.r rVar3 = c0493a.f5600c;
                long j9 = c0493a.f5601d;
                c0493a.f5598a = cVar;
                c0493a.f5599b = layoutDirection;
                c0493a.f5600c = rVar2;
                c0493a.f5601d = U3;
                rVar2.g();
                r24.B(C0323u.f4542b, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b.h(), 0L) : U3, 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
                float f20 = -c5.f4374a;
                float f21 = -c5.f4375b;
                C0097d c0097d = c0494b.f5603e;
                ((C1294c) c0097d.f987e).r(f20, f21);
                try {
                    C0310g c0310g2 = c0310g;
                    InterfaceC0496d.U(c0494b, f19.f4457a, s9, 0.0f, new C0500h(f18, 0.0f, 0, 0, 30), 52);
                    float f22 = 1;
                    float d5 = (Y.f.d(c0494b.h()) + f22) / Y.f.d(c0494b.h());
                    float b4 = (Y.f.b(c0494b.h()) + f22) / Y.f.b(c0494b.h());
                    long w4 = c0494b.w();
                    Z.r rVar4 = rVar2;
                    long s10 = c0097d.s();
                    c0097d.k().g();
                    try {
                        ((C1294c) c0097d.f987e).n(d5, b4, w4);
                        InterfaceC0496d.U(c0494b, j8, s9, 0.0f, null, 28);
                        ((C1294c) c0097d.f987e).r(-f20, -f21);
                        rVar4.b();
                        c0493a.f5598a = bVar;
                        c0493a.f5599b = kVar2;
                        c0493a.f5600c = rVar3;
                        c0493a.f5601d = j9;
                        c0310g2.f4523a.prepareToDraw();
                        e4.f3580d = c0310g2;
                        return cVar.a(new C0043n(c5, e4, c6, c0316m2));
                    } finally {
                        c0097d.k().b();
                        c0097d.G(s10);
                    }
                } catch (Throwable th5) {
                    ((C1294c) c0097d.f987e).r(-f20, -f21);
                    throw th5;
                }
            case 18:
                long j10 = ((Y.c) obj).f4372a;
                C0850x c0850x = (C0850x) this.f144e;
                if (c0850x.f8229z) {
                    c0850x.f8214A.invoke();
                }
                return Unit.f7487a;
            case 19:
                float floatValue = ((Number) obj).floatValue();
                u0 u0Var = (u0) this.f144e;
                float d6 = u0Var.f8194a.d() + floatValue + u0Var.f8198e;
                float d7 = kotlin.ranges.b.d(d6, 0.0f, u0Var.f8197d.d());
                r8 = d6 == d7;
                C0199g0 c0199g0 = u0Var.f8194a;
                float d8 = d7 - c0199g0.d();
                int round = Math.round(d8);
                c0199g0.f(c0199g0.d() + round);
                u0Var.f8198e = d8 - round;
                if (!r8) {
                    floatValue = d8;
                }
                return Float.valueOf(floatValue);
            case 20:
                ((n.o) this.f144e).f8540a.setValue(new n.m(((Y.c) obj).f4372a));
                return Unit.f7487a;
            case 21:
                ((w.U) this.f144e).invoke();
                return Unit.f7487a;
            case 22:
                ((C0891i0) this.f144e).f8793K.f8814y = (InterfaceC0980p) obj;
                return Unit.f7487a;
            case 23:
                long j11 = ((Y.c) obj).f4372a;
                C0908r0 c0908r0 = (C0908r0) this.f144e;
                return new Y.c(C0908r0.a(c0908r0, c0908r0.f8872h, j11, c0908r0.f8871g));
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                InterfaceC0961W interfaceC0961W = (InterfaceC0961W) entry.getValue();
                C0941B c0941b = (C0941B) this.f144e;
                int j12 = c0941b.f8990s.j(key);
                if (j12 < 0 || j12 >= c0941b.f8982k) {
                    interfaceC0961W.a();
                    r8 = true;
                }
                return Boolean.valueOf(r8);
            case 25:
                float f23 = -((Number) obj).floatValue();
                r.v vVar2 = (r.v) this.f144e;
                if ((f23 >= 0.0f || vVar2.a()) && (f23 <= 0.0f || vVar2.c())) {
                    if (Math.abs(vVar2.f9557g) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + vVar2.f9557g).toString());
                    }
                    float f24 = vVar2.f9557g + f23;
                    vVar2.f9557g = f24;
                    if (Math.abs(f24) > 0.5f) {
                        r.n nVar = (r.n) vVar2.f9555e.getValue();
                        float f25 = vVar2.f9557g;
                        int round2 = Math.round(f25);
                        r.n nVar2 = vVar2.f9553c;
                        boolean a6 = nVar.a(round2, !vVar2.f9552b);
                        if (a6 && nVar2 != null) {
                            a6 = nVar2.a(round2, true);
                        }
                        if (a6) {
                            vVar2.f(nVar, vVar2.f9552b, true);
                            vVar2.f9571u.setValue(Unit.f7487a);
                            vVar2.h(f25 - vVar2.f9557g, nVar);
                        } else {
                            r0.E e5 = vVar2.f9560j;
                            if (e5 != null) {
                                e5.k();
                            }
                            vVar2.h(f25 - vVar2.f9557g, vVar2.g());
                        }
                    }
                    if (Math.abs(vVar2.f9557g) > 0.5f) {
                        f23 -= vVar2.f9557g;
                        vVar2.f9557g = 0.0f;
                    }
                    r10 = f23;
                }
                return Float.valueOf(-r10);
            case 26:
                InterfaceC1060a interfaceC1060a = (InterfaceC1060a) obj;
                if (interfaceC1060a.g()) {
                    if (interfaceC1060a.k().f9615b) {
                        interfaceC1060a.f();
                    }
                    Iterator it = interfaceC1060a.k().f9622i.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        r0.F f26 = (r0.F) this.f144e;
                        if (hasNext) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            r0.F.a(f26, (C0976l) entry2.getKey(), ((Number) entry2.getValue()).intValue(), interfaceC1060a.T());
                        } else {
                            r0.a0 a0Var = interfaceC1060a.T().f9764t;
                            Intrinsics.c(a0Var);
                            while (!a0Var.equals(f26.f9614a.T())) {
                                for (C0976l c0976l : f26.b(a0Var).keySet()) {
                                    r0.F.a(f26, c0976l, f26.c(a0Var, c0976l), a0Var);
                                }
                                a0Var = a0Var.f9764t;
                                Intrinsics.c(a0Var);
                            }
                        }
                    }
                }
                return Unit.f7487a;
            case 27:
                return new C0259a(3, (C1112p) this.f144e);
            case 28:
                return new C0259a(i4, (s.v) this.f144e);
            default:
                return new C0259a(6, (C1150j0) this.f144e);
        }
    }
}
