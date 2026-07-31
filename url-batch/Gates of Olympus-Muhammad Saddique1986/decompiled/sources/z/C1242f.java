package z;

import C0.H;
import C0.J;
import a0.C0239d;
import android.graphics.Rect;
import android.view.View;
import h2.AbstractC0508a;
import java.lang.ref.WeakReference;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.m0;
import r0.C0929z;
import s2.EnumC0967a;
import t0.AbstractC0993f;
import t2.AbstractC1035F;
import t2.C1034E;
import t2.InterfaceC1071x;
import u0.AbstractC1101g0;
import u0.C1103h0;
import u0.K0;
import x.C1204q;
import y.AbstractC1230d;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242f implements I0.u {

    /* renamed from: a, reason: collision with root package name */
    public C1258v f10447a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f10448b;

    /* renamed from: c, reason: collision with root package name */
    public z f10449c;

    /* renamed from: d, reason: collision with root package name */
    public C1034E f10450d;

    @Override // I0.u
    public final void a() {
        K0 k02;
        C1258v c1258v = this.f10447a;
        if (c1258v == null || (k02 = (K0) AbstractC0993f.i(c1258v, AbstractC1101g0.f9362n)) == null) {
            return;
        }
        ((C1103h0) k02).b();
    }

    @Override // I0.u
    public final void b(C0239d c0239d) {
        Rect rect;
        z zVar = this.f10449c;
        if (zVar != null) {
            zVar.f10505l = new Rect(AbstractC0508a.Q(c0239d.f4724a), AbstractC0508a.Q(c0239d.f4725b), AbstractC0508a.Q(c0239d.f4726c), AbstractC0508a.Q(c0239d.f4727d));
            if (!zVar.f10503j.isEmpty() || (rect = zVar.f10505l) == null) {
                return;
            }
            zVar.f10494a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // I0.u
    public final void c() {
        K0 k02;
        C1258v c1258v = this.f10447a;
        if (c1258v == null || (k02 = (K0) AbstractC0993f.i(c1258v, AbstractC1101g0.f9362n)) == null) {
            return;
        }
        ((C1103h0) k02).a();
    }

    @Override // I0.u
    public final void d(I0.z zVar, I0.m mVar, R.h hVar, C1204q c1204q) {
        j(new R0.g(zVar, this, mVar, hVar, c1204q, 3));
    }

    @Override // I0.u
    public final void e() {
        m0 m0Var = this.f10448b;
        if (m0Var != null) {
            m0Var.a(null);
        }
        this.f10448b = null;
        InterfaceC1071x i3 = i();
        if (i3 != null) {
            ((C1034E) i3).a();
        }
    }

    @Override // I0.u
    public final void f(I0.z zVar, I0.z zVar2) {
        z zVar3 = this.f10449c;
        if (zVar3 != null) {
            boolean z3 = (J.a(zVar3.f10501h.f3098b, zVar2.f3098b) && f2.j.a(zVar3.f10501h.f3099c, zVar2.f3099c)) ? false : true;
            zVar3.f10501h = zVar2;
            int size = zVar3.f10503j.size();
            for (int i3 = 0; i3 < size; i3++) {
                InputConnectionC1234B inputConnectionC1234B = (InputConnectionC1234B) ((WeakReference) zVar3.f10503j.get(i3)).get();
                if (inputConnectionC1234B != null) {
                    inputConnectionC1234B.f10423g = zVar2;
                }
            }
            w wVar = zVar3.f10506m;
            synchronized (wVar.f10477c) {
                wVar.f10484j = null;
                wVar.f10486l = null;
                wVar.f10485k = null;
                wVar.f10487m = null;
                wVar.f10488n = null;
            }
            if (f2.j.a(zVar, zVar2)) {
                if (z3) {
                    C1256t c1256t = zVar3.f10495b;
                    int e3 = J.e(zVar2.f3098b);
                    int d3 = J.d(zVar2.f3098b);
                    J j3 = zVar3.f10501h.f3099c;
                    int e4 = j3 != null ? J.e(j3.f569a) : -1;
                    J j4 = zVar3.f10501h.f3099c;
                    c1256t.m().updateSelection((View) c1256t.f10466e, e3, d3, e4, j4 != null ? J.d(j4.f569a) : -1);
                    return;
                }
                return;
            }
            if (zVar != null && (!f2.j.a(zVar.f3097a.f596a, zVar2.f3097a.f596a) || (J.a(zVar.f3098b, zVar2.f3098b) && !f2.j.a(zVar.f3099c, zVar2.f3099c)))) {
                C1256t c1256t2 = zVar3.f10495b;
                c1256t2.m().restartInput((View) c1256t2.f10466e);
                return;
            }
            int size2 = zVar3.f10503j.size();
            for (int i4 = 0; i4 < size2; i4++) {
                InputConnectionC1234B inputConnectionC1234B2 = (InputConnectionC1234B) ((WeakReference) zVar3.f10503j.get(i4)).get();
                if (inputConnectionC1234B2 != null) {
                    I0.z zVar4 = zVar3.f10501h;
                    C1256t c1256t3 = zVar3.f10495b;
                    if (inputConnectionC1234B2.f10427k) {
                        inputConnectionC1234B2.f10423g = zVar4;
                        if (inputConnectionC1234B2.f10425i) {
                            c1256t3.m().updateExtractedText((View) c1256t3.f10466e, inputConnectionC1234B2.f10424h, n.r.e(zVar4));
                        }
                        J j5 = zVar4.f3099c;
                        int e5 = j5 != null ? J.e(j5.f569a) : -1;
                        J j6 = zVar4.f3099c;
                        int d4 = j6 != null ? J.d(j6.f569a) : -1;
                        long j7 = zVar4.f3098b;
                        c1256t3.m().updateSelection((View) c1256t3.f10466e, J.e(j7), J.d(j7), e5, d4);
                    }
                }
            }
        }
    }

    @Override // I0.u
    public final void g(I0.z zVar, I0.t tVar, H h3, C0929z c0929z, C0239d c0239d, C0239d c0239d2) {
        z zVar2 = this.f10449c;
        if (zVar2 != null) {
            w wVar = zVar2.f10506m;
            synchronized (wVar.f10477c) {
                try {
                    wVar.f10484j = zVar;
                    wVar.f10486l = tVar;
                    wVar.f10485k = h3;
                    wVar.f10487m = c0239d;
                    wVar.f10488n = c0239d2;
                    if (!wVar.f10479e) {
                        if (wVar.f10478d) {
                        }
                    }
                    wVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // I0.u
    public final void h() {
        j(null);
    }

    public final InterfaceC1071x i() {
        C1034E c1034e = this.f10450d;
        if (c1034e != null) {
            return c1034e;
        }
        if (!AbstractC1230d.f10377a) {
            return null;
        }
        C1034E b3 = AbstractC1035F.b(1, 0, EnumC0967a.f8361f, 2);
        this.f10450d = b3;
        return b3;
    }

    public final void j(R0.g gVar) {
        C1258v c1258v = this.f10447a;
        if (c1258v == null) {
            return;
        }
        this.f10448b = c1258v.f4501p ? AbstractC0837y.r(c1258v.m0(), null, EnumC0836x.f7937g, new C1257u(c1258v, new C1241e(gVar, this, c1258v, null), null), 1) : null;
    }

    public final void k(C1258v c1258v) {
        if (this.f10447a == c1258v) {
            this.f10447a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + c1258v + " but was " + this.f10447a).toString());
    }
}
