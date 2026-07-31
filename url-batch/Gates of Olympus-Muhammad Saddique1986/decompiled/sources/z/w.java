package z;

import C0.H;
import C0.J;
import a0.C0239d;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import b0.G;
import b0.M;
import n.z0;
import r0.InterfaceC0919p;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final C1239c f10475a;

    /* renamed from: b, reason: collision with root package name */
    public final C1256t f10476b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10478d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10479e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10480f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10481g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10482h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10483i;

    /* renamed from: j, reason: collision with root package name */
    public I0.z f10484j;

    /* renamed from: k, reason: collision with root package name */
    public H f10485k;

    /* renamed from: l, reason: collision with root package name */
    public I0.t f10486l;

    /* renamed from: m, reason: collision with root package name */
    public C0239d f10487m;

    /* renamed from: n, reason: collision with root package name */
    public C0239d f10488n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10477c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f10489o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f10490p = G.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f10491q = new Matrix();

    public w(C1239c c1239c, C1256t c1256t) {
        this.f10475a = c1239c;
        this.f10476b = c1256t;
    }

    public final void a() {
        I0.t tVar;
        CursorAnchorInfo.Builder builder;
        H h3;
        boolean z3;
        int i3;
        C1256t c1256t = this.f10476b;
        InputMethodManager m3 = c1256t.m();
        View view = (View) c1256t.f10466e;
        if (!m3.isActive(view) || this.f10484j == null || this.f10486l == null || this.f10485k == null || this.f10487m == null || this.f10488n == null) {
            return;
        }
        float[] fArr = this.f10490p;
        G.d(fArr);
        InterfaceC0919p interfaceC0919p = (InterfaceC0919p) this.f10475a.f10435l.f10474t.getValue();
        if (interfaceC0919p != null) {
            if (!interfaceC0919p.o()) {
                interfaceC0919p = null;
            }
            if (interfaceC0919p != null) {
                interfaceC0919p.u(fArr);
            }
        }
        C0239d c0239d = this.f10488n;
        f2.j.c(c0239d);
        float f3 = -c0239d.f4724a;
        C0239d c0239d2 = this.f10488n;
        f2.j.c(c0239d2);
        G.h(fArr, f3, -c0239d2.f4725b, 0.0f);
        Matrix matrix = this.f10491q;
        M.x(matrix, fArr);
        I0.z zVar = this.f10484j;
        f2.j.c(zVar);
        I0.t tVar2 = this.f10486l;
        f2.j.c(tVar2);
        H h4 = this.f10485k;
        f2.j.c(h4);
        C0239d c0239d3 = this.f10487m;
        f2.j.c(c0239d3);
        C0239d c0239d4 = this.f10488n;
        f2.j.c(c0239d4);
        boolean z4 = this.f10480f;
        boolean z5 = this.f10481g;
        boolean z6 = this.f10482h;
        boolean z7 = this.f10483i;
        CursorAnchorInfo.Builder builder2 = this.f10489o;
        builder2.reset();
        builder2.setMatrix(matrix);
        long j3 = zVar.f3098b;
        int e3 = J.e(j3);
        builder2.setSelectionRange(e3, J.d(j3));
        N0.h hVar = N0.h.f3545e;
        if (!z4 || e3 < 0) {
            tVar = tVar2;
            builder = builder2;
            h3 = h4;
        } else {
            int b3 = tVar2.b(e3);
            C0239d c2 = h4.c(b3);
            tVar = tVar2;
            float x3 = O2.d.x(c2.f4724a, 0.0f, (int) (h4.f559c >> 32));
            boolean g3 = z0.g(c0239d3, x3, c2.f4725b);
            boolean g4 = z0.g(c0239d3, x3, c2.f4727d);
            boolean z8 = h4.a(b3) == hVar;
            int i4 = (g3 || g4) ? 1 : 0;
            if (!g3 || !g4) {
                i4 |= 2;
            }
            int i5 = z8 ? i4 | 4 : i4;
            float f4 = c2.f4725b;
            float f5 = c2.f4727d;
            h3 = h4;
            builder = builder2;
            builder2.setInsertionMarkerLocation(x3, f4, f5, f5, i5);
        }
        if (z5) {
            J j4 = zVar.f3099c;
            int e4 = j4 != null ? J.e(j4.f569a) : -1;
            int d3 = j4 != null ? J.d(j4.f569a) : -1;
            if (e4 >= 0 && e4 < d3) {
                builder.setComposingText(e4, zVar.f3097a.f596a.subSequence(e4, d3));
                I0.t tVar3 = tVar;
                int b4 = tVar3.b(e4);
                int b5 = tVar3.b(d3);
                float[] fArr2 = new float[(b5 - b4) * 4];
                z3 = z7;
                h3.f558b.a(O2.l.J(b4, b5), fArr2);
                while (e4 < d3) {
                    int b6 = tVar3.b(e4);
                    int i6 = (b6 - b4) * 4;
                    float f6 = fArr2[i6];
                    int i7 = d3;
                    float f7 = fArr2[i6 + 1];
                    I0.t tVar4 = tVar3;
                    float f8 = fArr2[i6 + 2];
                    float f9 = fArr2[i6 + 3];
                    int i8 = b4;
                    int i9 = (c0239d3.f4726c <= f6 || f8 <= c0239d3.f4724a || c0239d3.f4727d <= f7 || f9 <= c0239d3.f4725b) ? 0 : 1;
                    if (!z0.g(c0239d3, f6, f7) || !z0.g(c0239d3, f8, f9)) {
                        i9 |= 2;
                    }
                    if (h3.a(b6) == hVar) {
                        i9 |= 4;
                    }
                    builder.addCharacterBounds(e4, f6, f7, f8, f9, i9);
                    e4++;
                    fArr2 = fArr2;
                    d3 = i7;
                    tVar3 = tVar4;
                    b4 = i8;
                }
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33 && z6) {
                    AbstractC1245i.a(builder, c0239d4);
                }
                if (i3 >= 34 && z3) {
                    AbstractC1246j.a(builder, h3, c0239d3);
                }
                c1256t.m().updateCursorAnchorInfo(view, builder.build());
                this.f10479e = false;
            }
        }
        z3 = z7;
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            AbstractC1245i.a(builder, c0239d4);
        }
        if (i3 >= 34) {
            AbstractC1246j.a(builder, h3, c0239d3);
        }
        c1256t.m().updateCursorAnchorInfo(view, builder.build());
        this.f10479e = false;
    }
}
