package y;

import A0.I;
import A0.K;
import W2.EnumC0303z;
import W2.r0;
import Z2.G;
import Z2.H;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import s0.AbstractC1144g0;
import s0.C1146h0;
import s0.C1160o0;
import s0.L0;
import w.C1277q;
import x.AbstractC1298d;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316f implements G0.t {

    /* renamed from: a, reason: collision with root package name */
    public v f11475a;

    /* renamed from: b, reason: collision with root package name */
    public r0 f11476b;

    /* renamed from: c, reason: collision with root package name */
    public z f11477c;

    /* renamed from: d, reason: collision with root package name */
    public G f11478d;

    @Override // G0.t
    public final void a(Y.d dVar) {
        Rect rect;
        z zVar = this.f11477c;
        if (zVar != null) {
            zVar.f11533l = new Rect(O2.c.a(dVar.f4374a), O2.c.a(dVar.f4375b), O2.c.a(dVar.f4376c), O2.c.a(dVar.f4377d));
            if (!zVar.f11531j.isEmpty() || (rect = zVar.f11533l) == null) {
                return;
            }
            zVar.f11522a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // G0.t
    public final void b() {
        L0 l02;
        v vVar = this.f11475a;
        if (vVar == null || (l02 = (L0) AbstractC1065f.i(vVar, AbstractC1144g0.f10226n)) == null) {
            return;
        }
        ((C1146h0) l02).b();
    }

    @Override // G0.t
    public final void c() {
        L0 l02;
        v vVar = this.f11475a;
        if (vVar == null || (l02 = (L0) AbstractC1065f.i(vVar, AbstractC1144g0.f10226n)) == null) {
            return;
        }
        ((C1146h0) l02).a();
    }

    @Override // G0.t
    public final void d() {
        r0 r0Var = this.f11476b;
        if (r0Var != null) {
            r0Var.a(null);
        }
        this.f11476b = null;
        Z2.y i2 = i();
        if (i2 != null) {
            ((G) i2).a();
        }
    }

    @Override // G0.t
    public final void e(G0.y yVar, G0.m mVar, P.h hVar, C1277q c1277q) {
        j(new P0.h(yVar, this, mVar, hVar, c1277q, 3));
    }

    @Override // G0.t
    public final void f(G0.y yVar, G0.s sVar, I i2, C1160o0 c1160o0, Y.d dVar, Y.d dVar2) {
        z zVar = this.f11477c;
        if (zVar != null) {
            w wVar = zVar.f11534m;
            synchronized (wVar.f11505c) {
                try {
                    wVar.f11512j = yVar;
                    wVar.f11514l = sVar;
                    wVar.f11513k = i2;
                    wVar.f11515m = dVar;
                    wVar.f11516n = dVar2;
                    if (!wVar.f11507e) {
                        if (wVar.f11506d) {
                        }
                        Unit unit = Unit.f7487a;
                    }
                    wVar.a();
                    Unit unit2 = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // G0.t
    public final void g() {
        j(null);
    }

    @Override // G0.t
    public final void h(G0.y yVar, G0.y yVar2) {
        z zVar = this.f11477c;
        if (zVar != null) {
            boolean z4 = (K.a(zVar.f11529h.f3094b, yVar2.f3094b) && Intrinsics.a(zVar.f11529h.f3095c, yVar2.f3095c)) ? false : true;
            zVar.f11529h = yVar2;
            int size = zVar.f11531j.size();
            for (int i2 = 0; i2 < size; i2++) {
                InputConnectionC1308B inputConnectionC1308B = (InputConnectionC1308B) ((WeakReference) zVar.f11531j.get(i2)).get();
                if (inputConnectionC1308B != null) {
                    inputConnectionC1308B.f11451g = yVar2;
                }
            }
            w wVar = zVar.f11534m;
            synchronized (wVar.f11505c) {
                wVar.f11512j = null;
                wVar.f11514l = null;
                wVar.f11513k = null;
                wVar.f11515m = null;
                wVar.f11516n = null;
                Unit unit = Unit.f7487a;
            }
            if (Intrinsics.a(yVar, yVar2)) {
                if (z4) {
                    t tVar = zVar.f11523b;
                    int e4 = K.e(yVar2.f3094b);
                    int d4 = K.d(yVar2.f3094b);
                    K k4 = zVar.f11529h.f3095c;
                    int e5 = k4 != null ? K.e(k4.f301a) : -1;
                    K k5 = zVar.f11529h.f3095c;
                    tVar.o().updateSelection((View) tVar.f11494e, e4, d4, e5, k5 != null ? K.d(k5.f301a) : -1);
                    return;
                }
                return;
            }
            if (yVar != null && (!Intrinsics.a(yVar.f3093a.f328a, yVar2.f3093a.f328a) || (K.a(yVar.f3094b, yVar2.f3094b) && !Intrinsics.a(yVar.f3095c, yVar2.f3095c)))) {
                t tVar2 = zVar.f11523b;
                tVar2.o().restartInput((View) tVar2.f11494e);
                return;
            }
            int size2 = zVar.f11531j.size();
            for (int i4 = 0; i4 < size2; i4++) {
                InputConnectionC1308B inputConnectionC1308B2 = (InputConnectionC1308B) ((WeakReference) zVar.f11531j.get(i4)).get();
                if (inputConnectionC1308B2 != null) {
                    G0.y yVar3 = zVar.f11529h;
                    t tVar3 = zVar.f11523b;
                    if (inputConnectionC1308B2.f11455k) {
                        inputConnectionC1308B2.f11451g = yVar3;
                        if (inputConnectionC1308B2.f11453i) {
                            tVar3.o().updateExtractedText((View) tVar3.f11494e, inputConnectionC1308B2.f11452h, m3.s.d(yVar3));
                        }
                        K k6 = yVar3.f3095c;
                        int e6 = k6 != null ? K.e(k6.f301a) : -1;
                        K k7 = yVar3.f3095c;
                        int d5 = k7 != null ? K.d(k7.f301a) : -1;
                        long j4 = yVar3.f3094b;
                        tVar3.o().updateSelection((View) tVar3.f11494e, K.e(j4), K.d(j4), e6, d5);
                    }
                }
            }
        }
    }

    public final Z2.y i() {
        G g4 = this.f11478d;
        if (g4 != null) {
            return g4;
        }
        if (!AbstractC1298d.f11401a) {
            return null;
        }
        G b4 = H.b(1, 0, Y2.a.f4400i, 2);
        this.f11478d = b4;
        return b4;
    }

    public final void j(P0.h hVar) {
        v vVar = this.f11475a;
        if (vVar == null) {
            return;
        }
        this.f11476b = vVar.f3990s ? W2.B.m(vVar.p0(), null, EnumC0303z.f4307j, new u(vVar, new C1315e(hVar, this, vVar, null), null), 1) : null;
    }

    public final void k(v vVar) {
        if (this.f11475a == vVar) {
            this.f11475a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + vVar + " but was " + this.f11475a).toString());
    }
}
