package g2;

import a2.h0;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import s1.j0;
import z0.f0;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final s1.r f4012a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.b f4013b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4015d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4016e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4017f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4018g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4019h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4020i;

    /* renamed from: j, reason: collision with root package name */
    public w f4021j;

    /* renamed from: k, reason: collision with root package name */
    public h0 f4022k;

    /* renamed from: l, reason: collision with root package name */
    public q f4023l;

    /* renamed from: n, reason: collision with root package name */
    public y0.d f4025n;

    /* renamed from: o, reason: collision with root package name */
    public y0.d f4026o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4014c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public r6.l f4024m = d.f4004i;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f4027p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f4028q = f0.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f4029r = new Matrix();

    public e(s1.r rVar, b1.b bVar) {
        this.f4012a = rVar;
        this.f4013b = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [q6.c, r6.l] */
    public final void a() {
        boolean z8;
        boolean z9;
        b1.b bVar = this.f4013b;
        ?? r22 = bVar.f1231h;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view = (View) bVar.f1230g;
        if (inputMethodManager.isActive(view)) {
            ?? r32 = this.f4024m;
            float[] fArr = this.f4028q;
            r32.f(new f0(fArr));
            s1.r rVar = this.f4012a;
            rVar.A();
            f0.g(fArr, rVar.Q);
            float d8 = y0.c.d(rVar.U);
            float e9 = y0.c.e(rVar.U);
            float[] fArr2 = rVar.P;
            f0.d(fArr2);
            f0.h(fArr2, d8, e9);
            j0.x(fArr, fArr2);
            Matrix matrix = this.f4029r;
            l0.q(matrix, fArr);
            w wVar = this.f4021j;
            r6.k.c(wVar);
            long j8 = wVar.f4066b;
            q qVar = this.f4023l;
            r6.k.c(qVar);
            h0 h0Var = this.f4022k;
            r6.k.c(h0Var);
            y0.d dVar = this.f4025n;
            r6.k.c(dVar);
            y0.d dVar2 = this.f4026o;
            r6.k.c(dVar2);
            boolean z10 = this.f4017f;
            boolean z11 = this.f4018g;
            boolean z12 = this.f4019h;
            boolean z13 = this.f4020i;
            CursorAnchorInfo.Builder builder = this.f4027p;
            builder.reset();
            builder.setMatrix(matrix);
            a2.j0 j0Var = wVar.f4067c;
            int e10 = a2.j0.e(j8);
            builder.setSelectionRange(e10, a2.j0.d(j8));
            l2.h hVar = l2.h.f5874g;
            if (!z10 || e10 < 0) {
                z8 = z11;
                z9 = z12;
            } else {
                int b9 = qVar.b(e10);
                y0.d c4 = h0Var.c(b9);
                z8 = z11;
                z9 = z12;
                float d9 = v1.g.d(c4.f9780a, 0.0f, (int) (h0Var.f390c >> 32));
                boolean x8 = r4.a.x(dVar, d9, c4.f9781b);
                boolean x9 = r4.a.x(dVar, d9, c4.f9783d);
                boolean z14 = h0Var.a(b9) == hVar;
                int i7 = (x8 || x9) ? 1 : 0;
                if (!x8 || !x9) {
                    i7 |= 2;
                }
                if (z14) {
                    i7 |= 4;
                }
                float f9 = c4.f9781b;
                float f10 = c4.f9783d;
                builder.setInsertionMarkerLocation(d9, f9, f10, f10, i7);
            }
            if (z8) {
                int e11 = j0Var != null ? a2.j0.e(j0Var.f408a) : -1;
                int d10 = j0Var != null ? a2.j0.d(j0Var.f408a) : -1;
                if (e11 >= 0 && e11 < d10) {
                    builder.setComposingText(e11, wVar.f4065a.f373f.subSequence(e11, d10));
                    int b10 = qVar.b(e11);
                    int b11 = qVar.b(d10);
                    float[] fArr3 = new float[(b11 - b10) * 4];
                    h0Var.f389b.a(r4.a.h(b10, b11), fArr3);
                    int i8 = e11;
                    while (i8 < d10) {
                        int b12 = qVar.b(i8);
                        int i9 = (b12 - b10) * 4;
                        float f11 = fArr3[i9];
                        int i10 = d10;
                        float f12 = fArr3[i9 + 1];
                        int i11 = b10;
                        float f13 = fArr3[i9 + 2];
                        float f14 = fArr3[i9 + 3];
                        int i12 = i8;
                        int i13 = (dVar.f9782c <= f11 || f13 <= dVar.f9780a || dVar.f9783d <= f12 || f14 <= dVar.f9781b) ? 0 : 1;
                        if (!r4.a.x(dVar, f11, f12) || !r4.a.x(dVar, f13, f14)) {
                            i13 |= 2;
                        }
                        if (h0Var.a(b12) == hVar) {
                            i13 |= 4;
                        }
                        builder.addCharacterBounds(i12, f11, f12, f13, f14, i13);
                        i8 = i12 + 1;
                        d10 = i10;
                        b10 = i11;
                    }
                }
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33 && z9) {
                b.a(builder, dVar2);
            }
            if (i14 >= 34 && z13) {
                c.a(builder, h0Var, dVar);
            }
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f4016e = false;
        }
    }
}
