package p;

import I.C0160l0;
import I.InterfaceC0142c0;
import a0.C0238c;
import android.content.Context;
import android.os.CancellationSignal;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.InterfaceC0292v;
import c1.AbstractC0388l;
import c1.AbstractC0394s;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n.AbstractC0695v;
import r.AbstractC0856c;
import r.RunnableC0841C;
import t1.C1013A;
import t1.C1015C;
import t1.C1017E;
import t1.C1022b;
import t1.C1028h;
import u0.C1103h0;
import u0.C1110l;
import u0.C1122r0;
import u0.j1;
import u0.k1;
import z.InputConnectionC1234B;

/* renamed from: p.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758d0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0758d0(Object obj, int i3, Object obj2) {
        super(1);
        this.f7653e = i3;
        this.f7654f = obj;
        this.f7655g = obj2;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        InputConnectionC1234B inputConnectionC1234B;
        C0294x e3;
        int i3 = 3;
        int i4 = 6;
        int i5 = 5;
        int i6 = 4;
        int i7 = 0;
        r7 = false;
        r7 = false;
        r7 = false;
        r7 = false;
        r7 = false;
        boolean z3 = false;
        r7 = false;
        r7 = false;
        boolean z4 = false;
        int i8 = 1;
        switch (this.f7653e) {
            case 0:
                long j3 = ((C0786s) obj).f7766a;
                long a3 = ((C0793v0) this.f7655g).f7781d == P.f7568e ? C0238c.a(j3, 0.0f, 1) : C0238c.a(j3, 0.0f, 2);
                C0793v0 c0793v0 = ((C0787s0) this.f7654f).f7767a;
                c0793v0.f7784g = 1;
                n.l0 l0Var = c0793v0.f7779b;
                if (l0Var == null || !(c0793v0.f7778a.a() || c0793v0.f7778a.c())) {
                    C0793v0.a(c0793v0, c0793v0.f7785h, a3, 1);
                } else {
                    l0Var.c(a3, c0793v0.f7784g, c0793v0.f7787j);
                }
                return R1.y.f4171a;
            case 1:
                ((Number) obj).longValue();
                X0 x02 = (X0) this.f7654f;
                float f3 = x02.f7632e;
                x02.f7632e = 0.0f;
                ((InterfaceC0424c) this.f7655g).n(Float.valueOf(f3));
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                r.Y y3 = (r.Y) this.f7654f;
                int i9 = y3.f8021s;
                View view = (View) this.f7655g;
                if (i9 == 0) {
                    int i10 = AbstractC0394s.f5610a;
                    RunnableC0841C runnableC0841C = y3.f8022t;
                    AbstractC0388l.u(view, runnableC0841C);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC0841C);
                    AbstractC0394s.a(view, runnableC0841C);
                }
                y3.f8021s++;
                return new m.n0(y3, i3, view);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                t.I i11 = (t.I) this.f7654f;
                LinkedHashSet linkedHashSet = i11.f8444c;
                Object obj2 = this.f7655g;
                linkedHashSet.remove(obj2);
                return new m.n0(i11, i6, obj2);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C1017E c1017e = (C1017E) obj;
                f2.j.f(c1017e, "$this$navOptions");
                C1015C c1015c = c1017e.f8846a;
                c1015c.f8837f = 0;
                c1015c.f8838g = 0;
                t1.u uVar = (t1.u) this.f7654f;
                if (uVar instanceof t1.x) {
                    int i12 = t1.u.f8930l;
                    Iterator it = n.r.m(uVar).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C1013A c1013a = (C1013A) this.f7655g;
                        if (hasNext) {
                            t1.u uVar2 = (t1.u) it.next();
                            C1028h c1028h = (C1028h) c1013a.f8812g.k();
                            t1.u uVar3 = c1028h != null ? c1028h.f8874e : null;
                            if (f2.j.a(uVar2, uVar3 != null ? uVar3.f8932e : null)) {
                            }
                        } else {
                            int i13 = t1.x.f8947q;
                            int i14 = AbstractC0695v.j(c1013a.f()).f8936i;
                            C1022b c1022b = C1022b.f8861k;
                            c1017e.f8849d = i14;
                            t1.I i15 = new t1.I();
                            c1022b.n(i15);
                            c1017e.f8850e = i15.f8855a;
                        }
                    }
                }
                return R1.y.f4171a;
            case 5:
                Context context = (Context) this.f7654f;
                Context applicationContext = context.getApplicationContext();
                u0.N n3 = (u0.N) this.f7655g;
                applicationContext.registerComponentCallbacks(n3);
                return new m.n0(context, i5, n3);
            case 6:
                Context context2 = (Context) this.f7654f;
                Context applicationContext2 = context2.getApplicationContext();
                u0.O o3 = (u0.O) this.f7655g;
                applicationContext2.registerComponentCallbacks(o3);
                return new m.n0(context2, i4, o3);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1122r0((z.z) this.f7654f, new t0.D(7, (u0.S) this.f7655g));
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                C1122r0 c1122r0 = (C1122r0) this.f7654f;
                synchronized (c1122r0.f9447c) {
                    try {
                        c1122r0.f9449e = true;
                        K.d dVar = c1122r0.f9448d;
                        int i16 = dVar.f3216f;
                        if (i16 > 0) {
                            Object[] objArr = dVar.f3214d;
                            do {
                                I0.p pVar = (I0.p) ((WeakReference) objArr[i7]).get();
                                if (pVar != null && (inputConnectionC1234B = pVar.f3081b) != null) {
                                    pVar.a(inputConnectionC1234B);
                                    pVar.f3081b = null;
                                }
                                i7++;
                            } while (i7 < i16);
                        }
                        c1122r0.f9448d.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((u0.S) this.f7655g).f9266e.f3005a.e();
                return R1.y.f4171a;
            case AbstractC0856c.f8037c /* 9 */:
                u0.W w2 = (u0.W) this.f7654f;
                I.C c2 = (I.C) this.f7655g;
                synchronized (w2.f9282h) {
                    w2.f9284j.remove(c2);
                }
                return R1.y.f4171a;
            case AbstractC0856c.f8039e /* 10 */:
                ((Choreographer) ((C0160l0) this.f7654f).f2831e).removeFrameCallback((I.C) this.f7655g);
                return R1.y.f4171a;
            case 11:
                C1110l c1110l = (C1110l) obj;
                k1 k1Var = (k1) this.f7654f;
                if (!k1Var.f9390f) {
                    C0294x e4 = c1110l.f9393a.e();
                    Q.a aVar = (Q.a) this.f7655g;
                    k1Var.f9392h = aVar;
                    if (k1Var.f9391g == null) {
                        k1Var.f9391g = e4;
                        e4.a(k1Var);
                    } else if (e4.f5242d.compareTo(EnumC0286o.f5228f) >= 0) {
                        k1Var.f9389e.j(new Q.a(-2000640158, new j1(k1Var, aVar, i8), true));
                    }
                }
                return R1.y.f4171a;
            case 12:
                C1013A c1013a2 = (C1013A) this.f7654f;
                c1013a2.getClass();
                InterfaceC0292v interfaceC0292v = (InterfaceC0292v) this.f7655g;
                f2.j.f(interfaceC0292v, "owner");
                if (!interfaceC0292v.equals(c1013a2.f8820o)) {
                    InterfaceC0292v interfaceC0292v2 = c1013a2.f8820o;
                    t1.j jVar = c1013a2.f8824s;
                    if (interfaceC0292v2 != null && (e3 = interfaceC0292v2.e()) != null) {
                        e3.f(jVar);
                    }
                    c1013a2.f8820o = interfaceC0292v;
                    interfaceC0292v.e().a(jVar);
                }
                return new m.k0(1);
            case 13:
                return new m.n0((I.W0) this.f7654f, 8, (u1.i) this.f7655g);
            case 14:
                ((CancellationSignal) this.f7654f).cancel();
                ((q2.m0) this.f7655g).a(null);
                return R1.y.f4171a;
            case AbstractC0856c.f8041g /* 15 */:
                KeyEvent keyEvent = ((l0.b) obj).f6574a;
                if (((x.Q) this.f7654f).a() == x.F.f9945e && keyEvent.getKeyCode() == 4 && AbstractC0508a.y(l0.c.z(keyEvent), 1)) {
                    ((B.a0) this.f7655g).e(null);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 16:
                KeyEvent keyEvent2 = ((l0.b) obj).f6574a;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC0508a.y(l0.c.z(keyEvent2), 2) && keyEvent2.getSource() != 257) {
                    boolean i17 = x.N.i(keyEvent2, 19);
                    Z.h hVar = (Z.h) this.f7654f;
                    if (i17) {
                        z3 = ((androidx.compose.ui.focus.b) hVar).d(5);
                    } else if (x.N.i(keyEvent2, 20)) {
                        z3 = ((androidx.compose.ui.focus.b) hVar).d(6);
                    } else if (x.N.i(keyEvent2, 21)) {
                        z3 = ((androidx.compose.ui.focus.b) hVar).d(3);
                    } else if (x.N.i(keyEvent2, 22)) {
                        z3 = ((androidx.compose.ui.focus.b) hVar).d(4);
                    } else if (x.N.i(keyEvent2, 23)) {
                        u0.K0 k02 = ((x.Q) this.f7655g).f9977c;
                        if (k02 != null) {
                            ((C1103h0) k02).b();
                        }
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            default:
                return new m.n0((InterfaceC0142c0) this.f7654f, 9, (q.k) this.f7655g);
        }
    }
}
