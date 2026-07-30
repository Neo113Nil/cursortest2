package q;

import android.content.Context;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.c1;
import g0.i1;
import g0.m2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.o1;
import r1.z0;
import s1.b3;
import s1.c3;
import s1.g1;
import s1.h2;
import s1.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Object obj, int i7, Object obj2) {
        super(1);
        this.f7342g = i7;
        this.f7343h = obj;
        this.f7344i = obj2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        y.w wVar;
        androidx.lifecycle.x f9;
        int i7 = 6;
        int i8 = 5;
        int i9 = 2;
        int i10 = 4;
        int i11 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z8 = false;
        r6 = false;
        r6 = false;
        boolean z9 = false;
        int i12 = 1;
        switch (this.f7342g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                u0 u0Var = (u0) this.f7343h;
                View view = (View) this.f7344i;
                a0 a0Var = u0Var.f7367t;
                if (u0Var.f7366s == 0) {
                    int i13 = b3.s.f1365a;
                    b3.l.u(view, a0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(a0Var);
                    b3.s.a(view, a0Var);
                }
                u0Var.f7366s++;
                return new l.j0(u0Var, i10, view);
            case 1:
                s.g0 g0Var = (s.g0) this.f7343h;
                LinkedHashSet linkedHashSet = g0Var.f8009c;
                Object obj2 = this.f7344i;
                linkedHashSet.remove(obj2);
                return new l.j0(g0Var, i8, obj2);
            case 2:
                Context context = (Context) this.f7343h;
                Context applicationContext = context.getApplicationContext();
                s1.m0 m0Var = (s1.m0) this.f7344i;
                applicationContext.registerComponentCallbacks(m0Var);
                return new l.j0(context, i7, m0Var);
            case 3:
                Context context2 = (Context) this.f7343h;
                Context applicationContext2 = context2.getApplicationContext();
                s1.n0 n0Var = (s1.n0) this.f7344i;
                applicationContext2.registerComponentCallbacks(n0Var);
                return new l.j0(context2, 7, n0Var);
            case 4:
                return new p1((y.u) this.f7343h, new z0(i9, (s1.p0) this.f7344i));
            case 5:
                p1 p1Var = (p1) this.f7343h;
                synchronized (p1Var.f8346c) {
                    try {
                        p1Var.f8348e = true;
                        i0.d dVar = p1Var.f8347d;
                        int i14 = dVar.f4842h;
                        if (i14 > 0) {
                            Object[] objArr = dVar.f4840f;
                            do {
                                g2.n nVar = (g2.n) ((WeakReference) objArr[i11]).get();
                                if (nVar != null && (wVar = nVar.f4049b) != null) {
                                    nVar.a(wVar);
                                    nVar.f4049b = null;
                                }
                                i11++;
                            } while (i11 < i14);
                        }
                        p1Var.f8347d.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((s1.p0) this.f7344i).f8341g.f4068a.h();
                return d6.z.f2639a;
            case 6:
                s1.t0 t0Var = (s1.t0) this.f7343h;
                g0.b0 b0Var = (g0.b0) this.f7344i;
                synchronized (t0Var.f8424j) {
                    t0Var.f8426l.remove(b0Var);
                }
                return d6.z.f2639a;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Choreographer) ((i1) this.f7343h).f3752g).removeFrameCallback((g0.b0) this.f7344i);
                return d6.z.f2639a;
            case 8:
                s1.l lVar = (s1.l) obj;
                q6.e eVar = (q6.e) this.f7344i;
                c3 c3Var = (c3) this.f7343h;
                if (!c3Var.f8190h) {
                    androidx.lifecycle.x f10 = lVar.f8275a.f();
                    c3Var.f8192j = eVar;
                    if (c3Var.f8191i == null) {
                        c3Var.f8191i = f10;
                        f10.a(c3Var);
                    } else if (f10.f1046d.compareTo(androidx.lifecycle.o.f1009h) >= 0) {
                        c3Var.f8189g.j(new o0.a(-2000640158, new b3(c3Var, eVar, i12), true));
                    }
                }
                return d6.z.f2639a;
            case c.f7259c /* 9 */:
                t3.e0 e0Var = (t3.e0) obj;
                t3.b0 b0Var2 = (t3.b0) this.f7344i;
                r6.k.f(e0Var, "$this$navOptions");
                c1 c1Var = e0Var.f8781a;
                c1Var.f1876a = 0;
                c1Var.f1877b = 0;
                t3.v vVar = (t3.v) this.f7343h;
                if (vVar instanceof t3.y) {
                    int i15 = t3.v.f8856n;
                    Iterator it = r4.a.E(vVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            t3.v vVar2 = (t3.v) it.next();
                            t3.h hVar = (t3.h) b0Var2.f8751g.y();
                            t3.v vVar3 = hVar != null ? hVar.f8792g : null;
                            if (r6.k.a(vVar2, vVar3 != null ? vVar3.f8858g : null)) {
                            }
                        } else {
                            int i16 = t3.y.f8873s;
                            e0Var.f8784d = t6.a.y(b0Var2.f()).f8862k;
                            n5.a aVar = new n5.a();
                            aVar.f6555a = true;
                            e0Var.f8785e = aVar.f6555a;
                        }
                    }
                }
                return d6.z.f2639a;
            case c.f7261e /* 10 */:
                t3.b0 b0Var3 = (t3.b0) this.f7343h;
                androidx.lifecycle.v vVar4 = (androidx.lifecycle.v) this.f7344i;
                b0Var3.getClass();
                r6.k.f(vVar4, "owner");
                t3.j jVar = b0Var3.f8763s;
                if (!vVar4.equals(b0Var3.f8759o)) {
                    androidx.lifecycle.v vVar5 = b0Var3.f8759o;
                    if (vVar5 != null && (f9 = vVar5.f()) != null) {
                        f9.f(jVar);
                    }
                    b0Var3.f8759o = vVar4;
                    vVar4.f().a(jVar);
                }
                return new o1(1);
            case 11:
                return new l.j0((m2) this.f7343h, 9, (u3.i) this.f7344i);
            case 12:
                KeyEvent keyEvent = ((j1.b) obj).f4986a;
                if (((w.j0) this.f7343h).a() == w.a0.f9184g && keyEvent.getKeyCode() == 4 && j1.c.e0(keyEvent) == 1) {
                    ((a0.x0) this.f7344i).e(null);
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 13:
                KeyEvent keyEvent2 = ((j1.b) obj).f4986a;
                x0.g gVar = (x0.g) this.f7343h;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && j1.c.e0(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    if (w.g0.i(keyEvent2, 19)) {
                        z8 = ((androidx.compose.ui.focus.b) gVar).d(5);
                    } else if (w.g0.i(keyEvent2, 20)) {
                        z8 = ((androidx.compose.ui.focus.b) gVar).d(6);
                    } else if (w.g0.i(keyEvent2, 21)) {
                        z8 = ((androidx.compose.ui.focus.b) gVar).d(3);
                    } else if (w.g0.i(keyEvent2, 22)) {
                        z8 = ((androidx.compose.ui.focus.b) gVar).d(4);
                    } else if (w.g0.i(keyEvent2, 23)) {
                        h2 h2Var = ((w.j0) this.f7344i).f9257c;
                        if (h2Var != null) {
                            ((g1) h2Var).b();
                        }
                        z8 = true;
                    }
                }
                return Boolean.valueOf(z8);
            case 14:
                return new l.j0((g0.z0) this.f7343h, 10, (p.j) this.f7344i);
            case c.f7263g /* 15 */:
                p1.m0.h((p1.m0) obj, (p1.n0) this.f7343h, ((z0.o) this.f7344i).f10029s);
                return d6.z.f2639a;
            default:
                p1.m0.h((p1.m0) obj, (p1.n0) this.f7343h, ((z0.q0) this.f7344i).C);
                return d6.z.f2639a;
        }
    }
}
