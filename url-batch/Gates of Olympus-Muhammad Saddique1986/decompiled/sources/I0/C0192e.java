package I0;

import C0.J;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import b0.M;
import u0.C1123s;
import u0.L;

/* renamed from: I0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192e {

    /* renamed from: a, reason: collision with root package name */
    public final C1123s f3043a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.m f3044b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3047e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3048f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3049g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3050h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3051i;

    /* renamed from: j, reason: collision with root package name */
    public z f3052j;

    /* renamed from: k, reason: collision with root package name */
    public C0.H f3053k;

    /* renamed from: l, reason: collision with root package name */
    public t f3054l;

    /* renamed from: n, reason: collision with root package name */
    public C0239d f3056n;

    /* renamed from: o, reason: collision with root package name */
    public C0239d f3057o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3045c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public f2.k f3055m = C0191d.f3037g;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3058p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f3059q = b0.G.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f3060r = new Matrix();

    public C0192e(C1123s c1123s, G1.m mVar) {
        this.f3043a = c1123s;
        this.f3044b = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [e2.c, f2.k] */
    public final void a() {
        View view;
        R1.f fVar;
        N0.h hVar;
        CursorAnchorInfo.Builder builder;
        G1.m mVar = this.f3044b;
        ?? r22 = mVar.f2117c;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = (View) mVar.f2116b;
        if (inputMethodManager.isActive(view2)) {
            ?? r3 = this.f3055m;
            float[] fArr = this.f3059q;
            r3.n(new b0.G(fArr));
            C1123s c1123s = this.f3043a;
            c1123s.B();
            b0.G.g(fArr, c1123s.f9465O);
            float d3 = C0238c.d(c1123s.f9469S);
            float e3 = C0238c.e(c1123s.f9469S);
            float[] fArr2 = c1123s.f9464N;
            b0.G.d(fArr2);
            b0.G.h(fArr2, d3, e3, 0.0f);
            L.x(fArr, fArr2);
            Matrix matrix = this.f3060r;
            M.x(matrix, fArr);
            z zVar = this.f3052j;
            f2.j.c(zVar);
            t tVar = this.f3054l;
            f2.j.c(tVar);
            C0.H h3 = this.f3053k;
            f2.j.c(h3);
            C0239d c0239d = this.f3056n;
            f2.j.c(c0239d);
            C0239d c0239d2 = this.f3057o;
            f2.j.c(c0239d2);
            boolean z3 = this.f3048f;
            boolean z4 = this.f3049g;
            boolean z5 = this.f3050h;
            boolean z6 = this.f3051i;
            CursorAnchorInfo.Builder builder2 = this.f3058p;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j3 = zVar.f3098b;
            int e4 = J.e(j3);
            builder2.setSelectionRange(e4, J.d(j3));
            N0.h hVar2 = N0.h.f3545e;
            if (!z3 || e4 < 0) {
                view = view2;
                fVar = r22;
                hVar = hVar2;
                builder = builder2;
            } else {
                int b3 = tVar.b(e4);
                C0239d c2 = h3.c(b3);
                float x3 = O2.d.x(c2.f4724a, 0.0f, (int) (h3.f559c >> 32));
                boolean q3 = AbstractC0235a.q(c0239d, x3, c2.f4725b);
                boolean q4 = AbstractC0235a.q(c0239d, x3, c2.f4727d);
                view = view2;
                boolean z7 = h3.a(b3) == hVar2;
                int i3 = (q3 || q4) ? 1 : 0;
                if (!q3 || !q4) {
                    i3 |= 2;
                }
                int i4 = z7 ? i3 | 4 : i3;
                float f3 = c2.f4725b;
                float f4 = c2.f4727d;
                hVar = hVar2;
                fVar = r22;
                builder = builder2;
                builder2.setInsertionMarkerLocation(x3, f3, f4, f4, i4);
            }
            if (z4) {
                J j4 = zVar.f3099c;
                int e5 = j4 != null ? J.e(j4.f569a) : -1;
                int d4 = j4 != null ? J.d(j4.f569a) : -1;
                if (e5 >= 0 && e5 < d4) {
                    builder.setComposingText(e5, zVar.f3097a.f596a.subSequence(e5, d4));
                    int b4 = tVar.b(e5);
                    int b5 = tVar.b(d4);
                    float[] fArr3 = new float[(b5 - b4) * 4];
                    h3.f558b.a(O2.l.J(b4, b5), fArr3);
                    while (e5 < d4) {
                        int b6 = tVar.b(e5);
                        int i5 = (b6 - b4) * 4;
                        float f5 = fArr3[i5];
                        float f6 = fArr3[i5 + 1];
                        int i6 = d4;
                        float f7 = fArr3[i5 + 2];
                        float f8 = fArr3[i5 + 3];
                        int i7 = b4;
                        int i8 = (c0239d.f4726c <= f5 || f7 <= c0239d.f4724a || c0239d.f4727d <= f6 || f8 <= c0239d.f4725b) ? 0 : 1;
                        if (!AbstractC0235a.q(c0239d, f5, f6) || !AbstractC0235a.q(c0239d, f7, f8)) {
                            i8 |= 2;
                        }
                        if (h3.a(b6) == hVar) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(e5, f5, f6, f7, f8, i8);
                        e5++;
                        d4 = i6;
                        b4 = i7;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z5) {
                AbstractC0189b.a(builder, c0239d2);
            }
            if (i9 >= 34 && z6) {
                AbstractC0190c.a(builder, h3, c0239d);
            }
            ((InputMethodManager) fVar.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f3047e = false;
        }
    }
}
