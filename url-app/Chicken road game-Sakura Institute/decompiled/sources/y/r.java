package y;

import a2.h0;
import a2.j0;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import u3.z;
import z0.f0;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final c f9728a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9729b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9733f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9734g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9735h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9736i;

    /* renamed from: j, reason: collision with root package name */
    public g2.w f9737j;

    /* renamed from: k, reason: collision with root package name */
    public h0 f9738k;

    /* renamed from: l, reason: collision with root package name */
    public g2.q f9739l;

    /* renamed from: m, reason: collision with root package name */
    public y0.d f9740m;

    /* renamed from: n, reason: collision with root package name */
    public y0.d f9741n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9730c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f9742o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f9743p = f0.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f9744q = new Matrix();

    public r(c cVar, p pVar) {
        this.f9728a = cVar;
        this.f9729b = pVar;
    }

    public final void a() {
        boolean z8;
        boolean z9;
        p pVar = this.f9729b;
        InputMethodManager a3 = pVar.a();
        View view = pVar.f9723b;
        if (!a3.isActive(view) || this.f9737j == null || this.f9739l == null || this.f9738k == null || this.f9740m == null || this.f9741n == null) {
            return;
        }
        float[] fArr = this.f9743p;
        f0.d(fArr);
        p1.p pVar2 = (p1.p) this.f9728a.f9708n.f9727v.getValue();
        if (pVar2 != null) {
            if (!pVar2.O()) {
                pVar2 = null;
            }
            if (pVar2 != null) {
                pVar2.R(fArr);
            }
        }
        y0.d dVar = this.f9741n;
        r6.k.c(dVar);
        float f9 = -dVar.f9780a;
        y0.d dVar2 = this.f9741n;
        r6.k.c(dVar2);
        f0.h(fArr, f9, -dVar2.f9781b);
        Matrix matrix = this.f9744q;
        l0.q(matrix, fArr);
        g2.w wVar = this.f9737j;
        r6.k.c(wVar);
        long j8 = wVar.f4066b;
        g2.q qVar = this.f9739l;
        r6.k.c(qVar);
        h0 h0Var = this.f9738k;
        r6.k.c(h0Var);
        y0.d dVar3 = this.f9740m;
        r6.k.c(dVar3);
        y0.d dVar4 = this.f9741n;
        r6.k.c(dVar4);
        boolean z10 = this.f9733f;
        boolean z11 = this.f9734g;
        boolean z12 = this.f9735h;
        boolean z13 = this.f9736i;
        CursorAnchorInfo.Builder builder = this.f9742o;
        builder.reset();
        builder.setMatrix(matrix);
        j0 j0Var = wVar.f4067c;
        int e9 = j0.e(j8);
        builder.setSelectionRange(e9, j0.d(j8));
        l2.h hVar = l2.h.f5874g;
        if (!z10 || e9 < 0) {
            z8 = z11;
            z9 = z12;
        } else {
            int b9 = qVar.b(e9);
            y0.d c4 = h0Var.c(b9);
            z8 = z11;
            z9 = z12;
            float d8 = v1.g.d(c4.f9780a, 0.0f, (int) (h0Var.f390c >> 32));
            boolean e10 = z.e(dVar3, d8, c4.f9781b);
            boolean e11 = z.e(dVar3, d8, c4.f9783d);
            boolean z14 = h0Var.a(b9) == hVar;
            int i7 = (e10 || e11) ? 1 : 0;
            if (!e10 || !e11) {
                i7 |= 2;
            }
            if (z14) {
                i7 |= 4;
            }
            float f10 = c4.f9781b;
            float f11 = c4.f9783d;
            builder.setInsertionMarkerLocation(d8, f10, f11, f11, i7);
        }
        if (z8) {
            int e12 = j0Var != null ? j0.e(j0Var.f408a) : -1;
            int d9 = j0Var != null ? j0.d(j0Var.f408a) : -1;
            if (e12 >= 0 && e12 < d9) {
                builder.setComposingText(e12, wVar.f4065a.f373f.subSequence(e12, d9));
                int b10 = qVar.b(e12);
                int b11 = qVar.b(d9);
                float[] fArr2 = new float[(b11 - b10) * 4];
                h0Var.f389b.a(r4.a.h(b10, b11), fArr2);
                int i8 = e12;
                while (i8 < d9) {
                    int b12 = qVar.b(i8);
                    int i9 = (b12 - b10) * 4;
                    float f12 = fArr2[i9];
                    int i10 = d9;
                    float f13 = fArr2[i9 + 1];
                    int i11 = b10;
                    float f14 = fArr2[i9 + 2];
                    float f15 = fArr2[i9 + 3];
                    int i12 = i8;
                    int i13 = (dVar3.f9782c <= f12 || f14 <= dVar3.f9780a || dVar3.f9783d <= f13 || f15 <= dVar3.f9781b) ? 0 : 1;
                    if (!z.e(dVar3, f12, f13) || !z.e(dVar3, f14, f15)) {
                        i13 |= 2;
                    }
                    if (h0Var.a(b12) == hVar) {
                        i13 |= 4;
                    }
                    builder.addCharacterBounds(i12, f12, f13, f14, f15, i13);
                    i8 = i12 + 1;
                    d9 = i10;
                    b10 = i11;
                }
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33 && z9) {
            h.a(builder, dVar4);
        }
        if (i14 >= 34 && z13) {
            i.a(builder, h0Var, dVar3);
        }
        pVar.a().updateCursorAnchorInfo(view, builder.build());
        this.f9732e = false;
    }
}
