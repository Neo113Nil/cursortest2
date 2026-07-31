package F;

import D1.C0014b;
import H2.AbstractC0080b;
import I.C0096g0;
import I.C0122u;
import I.EnumC0121t0;
import M1.AbstractC0140a;
import M1.AbstractC0144e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0253D;
import b0.C0254E;
import b0.C0255F;
import b0.C0256G;
import b0.C0261L;
import b0.C0264O;
import b0.C0265P;
import b0.C0271d;
import b0.C0275h;
import b0.C0278k;
import b0.C0281n;
import b0.C0282o;
import b0.C0288u;
import b0.InterfaceC0258I;
import b0.InterfaceC0263N;
import b0.InterfaceC0285r;
import c0.AbstractC0300c;
import c0.C0301d;
import d0.C0320a;
import d0.C0321b;
import d0.C0325f;
import d0.C0326g;
import d0.InterfaceC0323d;
import e0.C0336b;
import e1.C0351N;
import e2.AbstractC0381e;
import e2.C0377a;
import f.AbstractC0382a;
import f2.InterfaceC0390e;
import g1.C0402i;
import h0.AbstractC0419C;
import h0.C0422c;
import h1.C0438i;
import j.C0475A;
import j.C0503u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k.C0523b;
import k2.C0536h;
import l.C0568m;
import m.C0607q;
import n.C0661p;
import n.C0662q;
import n.C0663s;
import n.C0664t;
import n.C0667w;
import n2.C0692Q;
import q1.C0775D;
import q1.C0784h;
import q1.C0785i;
import q1.C0787k;
import r0.InterfaceC0838k;
import s.C0871n;
import s.C0880w;

/* renamed from: F.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047j0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0047j0(int i3, Object obj) {
        super(1);
        this.f1273e = i3;
        this.f1274f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d7, code lost:
    
        if (r13 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0406, code lost:
    
        if (r9 != false) goto L165;
     */
    /* JADX WARN: Type inference failed for: r2v36, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r2v37, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r2v43, types: [Y1.c, Z1.j] */
    @Override // Y1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i3;
        C0281n c0281n;
        InterfaceC0285r interfaceC0285r;
        boolean z3;
        Object[] objArr;
        int i4 = 4;
        int i5 = 2;
        boolean z4 = false;
        int i6 = 0;
        boolean z5 = false;
        switch (this.f1273e) {
            case 0:
                ((C0096g0) this.f1274f).h((int) (((M0.i) obj).f2774a >> 32));
                return L1.z.f2729a;
            case 1:
                ((C0261L) obj).b(((Number) ((I.X0) this.f1274f).getValue()).floatValue());
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                z0.e eVar = new z0.e(((Number) ((Y1.a) this.f1274f).b()).floatValue(), new C0377a(0.0f, 1.0f));
                InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
                z0.t tVar = z0.q.f9012c;
                InterfaceC0390e interfaceC0390e = z0.s.f9036a[1];
                tVar.a((z0.i) obj, eVar);
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                F0.s sVar = (F0.s) obj;
                return ((F0.f) this.f1274f).a(new F0.s(null, sVar.f1464b, sVar.f1465c, sVar.f1466d, sVar.f1467e)).f1468d;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                I.D.f2086e.removeFrameCallback((I.C) this.f1274f);
                return L1.z.f2729a;
            case 5:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                I.A0 a02 = (I.A0) this.f1274f;
                synchronized (a02.f2061b) {
                    try {
                        k2.X x3 = a02.f2062c;
                        if (x3 != null) {
                            C0692Q c0692q = a02.f2076r;
                            EnumC0121t0 enumC0121t0 = EnumC0121t0.f2361e;
                            c0692q.getClass();
                            c0692q.k(null, enumC0121t0);
                            C0692Q c0692q2 = I.A0.f2058v;
                            x3.a(cancellationException);
                            a02.f2074o = null;
                            x3.L(new D0(a02, i4, th));
                        } else {
                            a02.f2063d = cancellationException;
                            C0692Q c0692q3 = a02.f2076r;
                            EnumC0121t0 enumC0121t02 = EnumC0121t0.f2360d;
                            c0692q3.getClass();
                            c0692q3.k(null, enumC0121t02);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return L1.z.f2729a;
            case 6:
                ((C0122u) this.f1274f).w(obj);
                return L1.z.f2729a;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                if (obj instanceof S.y) {
                    ((S.y) obj).f(4);
                }
                ((C0475A) this.f1274f).a(obj);
                return L1.z.f2729a;
            case 8:
                return obj == ((AbstractC0140a) this.f1274f) ? "(this Collection)" : String.valueOf(obj);
            case AbstractC0382a.f4777a /* 9 */:
                Map.Entry entry = (Map.Entry) obj;
                Z1.i.f(entry, "it");
                AbstractC0144e abstractC0144e = (AbstractC0144e) this.f1274f;
                abstractC0144e.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == abstractC0144e ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != abstractC0144e ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case AbstractC0382a.f4779c /* 10 */:
                R.k kVar = ((R.i) this.f1274f).f3156c;
                return Boolean.valueOf(kVar != null ? kVar.c(obj) : true);
            case 11:
                S.w wVar = (S.w) this.f1274f;
                wVar.getClass();
                synchronized (wVar.f3267f) {
                    S.v vVar = wVar.f3269h;
                    Z1.i.c(vVar);
                    Object obj2 = vVar.f3251b;
                    Z1.i.c(obj2);
                    int i7 = vVar.f3253d;
                    C0503u c0503u = vVar.f3252c;
                    if (c0503u == null) {
                        c0503u = new C0503u();
                        vVar.f3252c = c0503u;
                        vVar.f3255f.i(obj2, c0503u);
                    }
                    vVar.c(obj, i7, obj2, c0503u);
                }
                return L1.z.f2729a;
            case 12:
                if (!((X.d) obj).p) {
                    return t0.p0.f7943e;
                }
                Z1.p pVar = (Z1.p) this.f1274f;
                pVar.f3476d = pVar.f3476d;
                return t0.p0.f7942d;
            case 13:
                C0261L c0261l = (C0261L) obj;
                C0264O c0264o = (C0264O) this.f1274f;
                c0261l.d(c0264o.f4247q);
                c0261l.e(c0264o.f4248r);
                c0261l.b(c0264o.f4249s);
                float f3 = c0264o.f4250t;
                if (c0261l.f4223h != f3) {
                    c0261l.f4219d |= 8;
                    c0261l.f4223h = f3;
                }
                float f4 = c0264o.f4251u;
                if (c0261l.f4224i != f4) {
                    c0261l.f4219d |= 16;
                    c0261l.f4224i = f4;
                }
                float f5 = c0264o.f4252v;
                if (c0261l.f4225j != f5) {
                    c0261l.f4219d |= 32;
                    c0261l.f4225j = f5;
                }
                float f6 = c0264o.f4253w;
                if (c0261l.f4228m != f6) {
                    c0261l.f4219d |= 256;
                    c0261l.f4228m = f6;
                }
                float f7 = c0264o.f4254x;
                if (c0261l.f4229n != f7) {
                    c0261l.f4219d |= 512;
                    c0261l.f4229n = f7;
                }
                float f8 = c0264o.f4255y;
                if (c0261l.f4230o != f8) {
                    c0261l.f4219d |= 1024;
                    c0261l.f4230o = f8;
                }
                float f9 = c0264o.f4256z;
                if (c0261l.p != f9) {
                    c0261l.f4219d |= 2048;
                    c0261l.p = f9;
                }
                c0261l.h(c0264o.f4243A);
                InterfaceC0263N interfaceC0263N = c0264o.B;
                if (!Z1.i.a(c0261l.f4232r, interfaceC0263N)) {
                    c0261l.f4219d |= 8192;
                    c0261l.f4232r = interfaceC0263N;
                }
                boolean z6 = c0264o.C;
                if (c0261l.f4233s != z6) {
                    c0261l.f4219d |= 16384;
                    c0261l.f4233s = z6;
                }
                if (!Z1.i.a(null, null)) {
                    c0261l.f4219d |= 131072;
                }
                long j3 = c0264o.D;
                if (!C0288u.c(c0261l.f4226k, j3)) {
                    c0261l.f4219d |= 64;
                    c0261l.f4226k = j3;
                }
                long j4 = c0264o.f4244E;
                if (!C0288u.c(c0261l.f4227l, j4)) {
                    c0261l.f4219d |= 128;
                    c0261l.f4227l = j4;
                }
                int i8 = c0264o.f4245F;
                if (!AbstractC0259J.o(c0261l.f4234t, i8)) {
                    c0261l.f4219d |= 32768;
                    c0261l.f4234t = i8;
                }
                return L1.z.f2729a;
            case 14:
                InterfaceC0323d interfaceC0323d = (InterfaceC0323d) obj;
                C0336b c0336b = (C0336b) this.f1274f;
                C0278k c0278k = c0336b.f4483l;
                if (c0336b.f4485n && c0336b.f4492v && c0278k != null) {
                    ?? r22 = c0336b.f4475d;
                    C0014b P2 = interfaceC0323d.P();
                    long m3 = P2.m();
                    P2.h().f();
                    try {
                        ((C0014b) ((A2.g) P2.f536b).f83b).h().i(c0278k, 1);
                        r22.j(interfaceC0323d);
                    } finally {
                        P2.h().a();
                        P2.y(m3);
                    }
                } else {
                    c0336b.f4475d.j(interfaceC0323d);
                }
                return L1.z.f2729a;
            case AbstractC0382a.f4781e /* 15 */:
                Throwable th3 = (Throwable) obj;
                C0351N c0351n = (C0351N) this.f1274f;
                if (th3 != null) {
                    c0351n.f4645g.v(new e1.O(th3));
                }
                if (c0351n.f4647i.f2715e != L1.w.f2726a) {
                    ((C0402i) c0351n.f4647i.getValue()).close();
                }
                return L1.z.f2729a;
            case 16:
                AbstractC0419C abstractC0419C = (AbstractC0419C) obj;
                C0422c c0422c = (C0422c) this.f1274f;
                c0422c.g(abstractC0419C);
                ?? r23 = c0422c.f4928i;
                if (r23 != 0) {
                    r23.j(abstractC0419C);
                }
                return L1.z.f2729a;
            case 17:
                I.X0 x02 = (I.X0) ((C0568m) this.f1274f).f5482d.e(obj);
                return new M0.i(x02 != null ? ((M0.i) x02.getValue()).f2774a : 0L);
            case 18:
                C0607q c0607q = (C0607q) obj;
                float f10 = c0607q.f5833b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = c0607q.f5834c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = c0607q.f5835d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = c0607q.f5832a;
                r11 = f15 >= 0.0f ? f15 : 0.0f;
                return new C0288u(C0288u.a(AbstractC0259J.a(f10, f11, f14, r11 <= 1.0f ? r11 : 1.0f, C0301d.f4367t), (AbstractC0300c) this.f1274f));
            case 19:
                return new P0.a(i5, (m.s0) this.f1274f);
            case 20:
                Y.c cVar = (Y.c) obj;
                C0664t c0664t = (C0664t) this.f1274f;
                if (cVar.a() * c0664t.f6158t < 0.0f || a0.f.c(cVar.f3395d.c()) <= 0.0f) {
                    return cVar.b(C0662q.f6141f);
                }
                float f16 = 2;
                float min = Math.min(M0.e.a(c0664t.f6158t, 0.0f) ? 1.0f : (float) Math.ceil(cVar.a() * c0664t.f6158t), (float) Math.ceil(a0.f.c(cVar.f3395d.c()) / f16));
                float f17 = min / f16;
                long f18 = I2.l.f(f17, f17);
                long h3 = I2.d.h(a0.f.d(cVar.f3395d.c()) - min, a0.f.b(cVar.f3395d.c()) - min);
                float f19 = min * f16;
                boolean z7 = f19 > a0.f.c(cVar.f3395d.c());
                AbstractC0257H a3 = c0664t.f6160v.a(cVar.f3395d.c(), cVar.f3395d.getLayoutDirection(), cVar);
                if (!(a3 instanceof C0254E)) {
                    if (!(a3 instanceof C0256G)) {
                        if (!(a3 instanceof C0255F)) {
                            throw new L1.f();
                        }
                        C0265P c0265p = c0664t.f6159u;
                        long j5 = z7 ? 0L : f18;
                        if (z7) {
                            h3 = cVar.f3395d.c();
                        }
                        return cVar.b(new l.C(c0265p, j5, h3, z7 ? C0325f.f4448b : new C0326g(min, 0.0f, 0, 0, 30), 1));
                    }
                    C0265P c0265p2 = c0664t.f6159u;
                    a0.e eVar2 = ((C0256G) a3).f4213a;
                    if (M1.B.H(eVar2)) {
                        return cVar.b(new C0663s(z7, c0265p2, eVar2.f3499e, f17, min, f18, h3, new C0326g(min, 0.0f, 0, 0, 30)));
                    }
                    if (c0664t.f6157s == null) {
                        c0664t.f6157s = new C0661p();
                    }
                    C0661p c0661p = c0664t.f6157s;
                    Z1.i.c(c0661p);
                    InterfaceC0258I interfaceC0258I = c0661p.f6140d;
                    InterfaceC0258I interfaceC0258I2 = interfaceC0258I;
                    if (interfaceC0258I == null) {
                        C0278k g3 = AbstractC0259J.g();
                        c0661p.f6140d = g3;
                        interfaceC0258I2 = g3;
                    }
                    C0278k c0278k2 = (C0278k) interfaceC0258I2;
                    c0278k2.h();
                    InterfaceC0258I.a(c0278k2, eVar2);
                    if (!z7) {
                        InterfaceC0258I g4 = AbstractC0259J.g();
                        InterfaceC0258I.a(g4, new a0.e(min, min, eVar2.b() - min, eVar2.a() - min, AbstractC0382a.y(eVar2.f3499e, min), AbstractC0382a.y(eVar2.f3500f, min), AbstractC0382a.y(eVar2.f3501g, min), AbstractC0382a.y(eVar2.f3502h, min)));
                        c0278k2.g(c0278k2, g4, 0);
                    }
                    return cVar.b(new D0(c0278k2, 19, c0265p2));
                }
                C0265P c0265p3 = c0664t.f6159u;
                C0254E c0254e = (C0254E) a3;
                if (z7) {
                    return cVar.b(new D0(c0254e, 18, c0265p3));
                }
                if (c0265p3 != null) {
                    long j6 = c0265p3.f4257e;
                    c0281n = new C0281n(j6, 5, Build.VERSION.SDK_INT >= 29 ? C0282o.f4285a.a(j6, 5) : new PorterDuffColorFilter(AbstractC0259J.E(j6), AbstractC0259J.G(5)));
                    i3 = 1;
                } else {
                    i3 = 0;
                    c0281n = null;
                }
                C0278k c0278k3 = c0254e.f4211a;
                a0.d d3 = c0278k3.d();
                if (c0664t.f6157s == null) {
                    c0664t.f6157s = new C0661p();
                }
                C0661p c0661p2 = c0664t.f6157s;
                Z1.i.c(c0661p2);
                InterfaceC0258I interfaceC0258I3 = c0661p2.f6140d;
                if (interfaceC0258I3 == null) {
                    interfaceC0258I3 = AbstractC0259J.g();
                    c0661p2.f6140d = interfaceC0258I3;
                }
                C0278k c0278k4 = (C0278k) interfaceC0258I3;
                c0278k4.h();
                InterfaceC0258I.b(interfaceC0258I3, d3);
                c0278k4.g(c0278k4, c0278k3, 0);
                Z1.t tVar2 = new Z1.t();
                long e3 = I2.l.e((int) Math.ceil(d3.c()), (int) Math.ceil(d3.b()));
                C0661p c0661p3 = c0664t.f6157s;
                Z1.i.c(c0661p3);
                C0275h c0275h = c0661p3.f6137a;
                InterfaceC0285r interfaceC0285r2 = c0661p3.f6138b;
                C0253D c0253d = c0275h != null ? new C0253D(c0275h.a()) : null;
                if (!(c0253d == null ? false : C0253D.a(c0253d.f4210a, 0))) {
                    C0253D c0253d2 = c0275h != null ? new C0253D(c0275h.a()) : null;
                    if (c0253d2 != null && i3 == c0253d2.f4210a) {
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                }
                z4 = true;
                if (c0275h != null && interfaceC0285r2 != null) {
                    float d4 = a0.f.d(cVar.f3395d.c());
                    Bitmap bitmap = c0275h.f4271a;
                    if (d4 <= bitmap.getWidth()) {
                        interfaceC0285r = interfaceC0285r2;
                        if (a0.f.b(cVar.f3395d.c()) <= bitmap.getHeight()) {
                        }
                    }
                }
                c0275h = AbstractC0259J.e((int) (e3 >> 32), (int) (e3 & 4294967295L), i3);
                c0661p3.f6137a = c0275h;
                Canvas canvas = AbstractC0272e.f4266a;
                C0271d c0271d = new C0271d();
                c0271d.f4263a = new Canvas(c0275h.f4271a);
                c0661p3.f6138b = c0271d;
                interfaceC0285r = c0271d;
                C0321b c0321b = c0661p3.f6139c;
                if (c0321b == null) {
                    c0321b = new C0321b();
                    c0661p3.f6139c = c0321b;
                }
                long R2 = I2.l.R(e3);
                M0.j layoutDirection = cVar.f3395d.getLayoutDirection();
                C0320a c0320a = c0321b.f4443d;
                M0.b bVar = c0320a.f4439a;
                M0.j jVar = c0320a.f4440b;
                InterfaceC0285r interfaceC0285r3 = c0320a.f4441c;
                C0275h c0275h2 = c0275h;
                InterfaceC0258I interfaceC0258I4 = interfaceC0258I3;
                long j7 = c0320a.f4442d;
                c0320a.f4439a = cVar;
                c0320a.f4440b = layoutDirection;
                c0320a.f4441c = interfaceC0285r;
                c0320a.f4442d = R2;
                interfaceC0285r.f();
                InterfaceC0323d.s(c0321b, C0288u.f4292b, 0L, R2, null, 58);
                float f20 = -d3.f3491a;
                float f21 = -d3.f3492b;
                C0014b c0014b = c0321b.f4444e;
                ((A2.g) c0014b.f536b).u(f20, f21);
                try {
                    InterfaceC0323d.S(c0321b, c0254e.f4211a, c0265p3, 0.0f, new C0326g(f19, 0.0f, 0, 0, 30), 52);
                    float f22 = 1;
                    float d5 = (a0.f.d(c0321b.c()) + f22) / a0.f.d(c0321b.c());
                    float b2 = (a0.f.b(c0321b.c()) + f22) / a0.f.b(c0321b.c());
                    long w3 = c0321b.w();
                    long m4 = c0014b.m();
                    c0014b.h().f();
                    try {
                        ((A2.g) c0014b.f536b).s(d5, b2, w3);
                        InterfaceC0323d.S(c0321b, interfaceC0258I4, c0265p3, 0.0f, null, 28);
                        ((A2.g) c0014b.f536b).u(-f20, -f21);
                        interfaceC0285r.a();
                        c0320a.f4439a = bVar;
                        c0320a.f4440b = jVar;
                        c0320a.f4441c = interfaceC0285r3;
                        c0320a.f4442d = j7;
                        c0275h2.f4271a.prepareToDraw();
                        tVar2.f3480d = c0275h2;
                        return cVar.b(new n.r(d3, tVar2, e3, c0281n));
                    } finally {
                        c0014b.h().a();
                        c0014b.y(m4);
                    }
                } catch (Throwable th4) {
                    ((A2.g) c0014b.f536b).u(-f20, -f21);
                    throw th4;
                }
            case 21:
                long j8 = ((a0.c) obj).f3489a;
                C0667w c0667w = (C0667w) this.f1274f;
                if (c0667w.f6179w) {
                    c0667w.f6180x.b();
                }
                return L1.z.f2729a;
            case 22:
                float floatValue = ((Number) obj).floatValue();
                n.k0 k0Var = (n.k0) this.f1274f;
                float g5 = k0Var.f6106a.g() + floatValue + k0Var.f6110e;
                float q2 = AbstractC0381e.q(g5, 0.0f, k0Var.f6109d.g());
                boolean z8 = g5 == q2;
                C0096g0 c0096g0 = k0Var.f6106a;
                float g6 = q2 - c0096g0.g();
                int round = Math.round(g6);
                c0096g0.h(c0096g0.g() + round);
                k0Var.f6110e = g6 - round;
                if (!z8) {
                    floatValue = g6;
                }
                return Float.valueOf(floatValue);
            case 23:
                Throwable th5 = (Throwable) obj;
                n0.t tVar3 = (n0.t) this.f1274f;
                C0536h c0536h = tVar3.f6256f;
                if (c0536h != null) {
                    c0536h.v(th5);
                }
                tVar3.f6256f = null;
                return L1.z.f2729a;
            case 24:
                ((o.g0) this.f1274f).f6518H.f6554v = (InterfaceC0838k) obj;
                return L1.z.f2729a;
            case 25:
                long j9 = ((a0.c) obj).f3489a;
                o.o0 o0Var = (o.o0) this.f1274f;
                return new a0.c(o.o0.a(o0Var, o0Var.f6599h, j9, o0Var.f6598g));
            case 26:
                C0784h c0784h = (C0784h) obj;
                Z1.i.f(c0784h, "backStackEntry");
                q1.w wVar2 = c0784h.f6895e;
                if (wVar2 == null) {
                    wVar2 = null;
                }
                if (wVar2 == null) {
                    return null;
                }
                c0784h.g();
                q1.J j10 = (q1.J) this.f1274f;
                q1.w c3 = j10.c(wVar2);
                if (c3 == null) {
                    return null;
                }
                if (c3.equals(wVar2)) {
                    return c0784h;
                }
                C0787k b3 = j10.b();
                Bundle b4 = c3.b(c0784h.g());
                C0775D c0775d = b3.f6919h;
                return C0523b.c(c0775d.f6828a, c3, b4, c0775d.g(), c0775d.p);
            case 27:
                Map.Entry entry2 = (Map.Entry) obj;
                Object key2 = entry2.getKey();
                r0.N n3 = (r0.N) entry2.getValue();
                r0.w wVar3 = (r0.w) this.f1274f;
                int k3 = wVar3.p.k(key2);
                if (k3 < 0 || k3 >= wVar3.f7182h) {
                    n3.a();
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 28:
                Bundle bundle = (Bundle) obj;
                C0775D F3 = g2.i.F((Context) this.f1274f);
                if (bundle != null) {
                    bundle.setClassLoader(F3.f6828a.getClassLoader());
                    F3.f6831d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    F3.f6832e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = F3.f6841n;
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i9 = 0;
                        while (i6 < length) {
                            F3.f6840m.put(Integer.valueOf(intArray[i6]), stringArrayList.get(i9));
                            i6++;
                            i9++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str : stringArrayList2) {
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                            if (parcelableArray != null) {
                                Z1.i.e(str, "id");
                                int length2 = parcelableArray.length;
                                M1.j jVar2 = new M1.j();
                                if (length2 == 0) {
                                    objArr = M1.j.f2796g;
                                } else {
                                    if (length2 <= 0) {
                                        throw new IllegalArgumentException(AbstractC0080b.h("Illegal Capacity: ", length2));
                                    }
                                    objArr = new Object[length2];
                                }
                                jVar2.f2798e = objArr;
                                L1.q h4 = Z1.i.h(parcelableArray);
                                while (h4.hasNext()) {
                                    Parcelable parcelable = (Parcelable) h4.next();
                                    Z1.i.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                    jVar2.addLast((C0785i) parcelable);
                                }
                                linkedHashMap.put(str, jVar2);
                            }
                        }
                    }
                    F3.f6833f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return F3;
            default:
                float f23 = -((Number) obj).floatValue();
                C0880w c0880w = (C0880w) this.f1274f;
                if ((f23 >= 0.0f || c0880w.a()) && (f23 <= 0.0f || c0880w.c())) {
                    if (Math.abs(c0880w.f7480g) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + c0880w.f7480g).toString());
                    }
                    float f24 = c0880w.f7480g + f23;
                    c0880w.f7480g = f24;
                    if (Math.abs(f24) > 0.5f) {
                        C0871n c0871n = (C0871n) c0880w.f7478e.getValue();
                        float f25 = c0880w.f7480g;
                        int round2 = Math.round(f25);
                        C0871n c0871n2 = c0880w.f7476c;
                        boolean a4 = c0871n.a(round2, !c0880w.f7475b);
                        if (a4 && c0871n2 != null) {
                            a4 = c0871n2.a(round2, true);
                        }
                        if (a4) {
                            c0880w.f(c0871n, c0880w.f7475b, true);
                            c0880w.f7493u.setValue(L1.z.f2729a);
                            c0880w.h(f25 - c0880w.f7480g, c0871n);
                        } else {
                            t0.D d6 = c0880w.f7483j;
                            if (d6 != null) {
                                d6.k();
                            }
                            c0880w.h(f25 - c0880w.f7480g, c0880w.g());
                        }
                    }
                    if (Math.abs(c0880w.f7480g) > 0.5f) {
                        f23 -= c0880w.f7480g;
                        c0880w.f7480g = 0.0f;
                    }
                    r11 = f23;
                }
                return Float.valueOf(-r11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047j0(A2.g gVar, X.d dVar, Z1.p pVar) {
        super(1);
        this.f1273e = 12;
        this.f1274f = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047j0(q1.J j3, q1.G g3) {
        super(1);
        this.f1273e = 26;
        this.f1274f = j3;
    }
}
