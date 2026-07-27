package y;

import A0.I;
import Z.E;
import Z.K;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final C1313c f11503a;

    /* renamed from: b, reason: collision with root package name */
    public final t f11504b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11506d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11508f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11509g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11510h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11511i;

    /* renamed from: j, reason: collision with root package name */
    public G0.y f11512j;

    /* renamed from: k, reason: collision with root package name */
    public I f11513k;

    /* renamed from: l, reason: collision with root package name */
    public G0.s f11514l;

    /* renamed from: m, reason: collision with root package name */
    public Y.d f11515m;

    /* renamed from: n, reason: collision with root package name */
    public Y.d f11516n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11505c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f11517o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f11518p = E.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f11519q = new Matrix();

    public w(C1313c c1313c, t tVar) {
        this.f11503a = c1313c;
        this.f11504b = tVar;
    }

    public final void a() {
        G0.y yVar;
        CursorAnchorInfo.Builder builder;
        View view;
        t tVar = this.f11504b;
        InputMethodManager o4 = tVar.o();
        View view2 = (View) tVar.f11494e;
        if (o4.isActive(view2)) {
            float[] fArr = this.f11518p;
            E.d(fArr);
            InterfaceC0980p interfaceC0980p = (InterfaceC0980p) this.f11503a.f11463o.f11502w.getValue();
            if (interfaceC0980p != null) {
                if (!interfaceC0980p.p()) {
                    interfaceC0980p = null;
                }
                if (interfaceC0980p != null) {
                    interfaceC0980p.u(fArr);
                }
            }
            Unit unit = Unit.f7487a;
            Y.d dVar = this.f11516n;
            Intrinsics.c(dVar);
            float f4 = -dVar.f4374a;
            Y.d dVar2 = this.f11516n;
            Intrinsics.c(dVar2);
            E.h(fArr, f4, -dVar2.f4375b, 0.0f);
            Matrix matrix = this.f11519q;
            K.x(matrix, fArr);
            G0.y yVar2 = this.f11512j;
            Intrinsics.c(yVar2);
            G0.s sVar = this.f11514l;
            Intrinsics.c(sVar);
            I i2 = this.f11513k;
            Intrinsics.c(i2);
            Y.d dVar3 = this.f11515m;
            Intrinsics.c(dVar3);
            Y.d dVar4 = this.f11516n;
            Intrinsics.c(dVar4);
            boolean z4 = this.f11508f;
            boolean z5 = this.f11509g;
            boolean z6 = this.f11510h;
            boolean z7 = this.f11511i;
            CursorAnchorInfo.Builder builder2 = this.f11517o;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j4 = yVar2.f3094b;
            int e4 = A0.K.e(j4);
            builder2.setSelectionRange(e4, A0.K.d(j4));
            L0.h hVar = L0.h.f3507e;
            if (!z4 || e4 < 0) {
                yVar = yVar2;
                builder = builder2;
            } else {
                int b4 = sVar.b(e4);
                Y.d c4 = i2.c(b4);
                yVar = yVar2;
                float d4 = kotlin.ranges.b.d(c4.f4374a, 0.0f, (int) (i2.f291c >> 32));
                boolean o5 = m3.o.o(dVar3, d4, c4.f4375b);
                boolean o6 = m3.o.o(dVar3, d4, c4.f4377d);
                boolean z8 = i2.a(b4) == hVar;
                int i4 = (o5 || o6) ? 1 : 0;
                if (!o5 || !o6) {
                    i4 |= 2;
                }
                int i5 = z8 ? i4 | 4 : i4;
                float f5 = c4.f4375b;
                float f6 = c4.f4377d;
                builder = builder2;
                builder2.setInsertionMarkerLocation(d4, f5, f6, f6, i5);
            }
            if (z5) {
                G0.y yVar3 = yVar;
                A0.K k4 = yVar3.f3095c;
                int e5 = k4 != null ? A0.K.e(k4.f301a) : -1;
                view = view2;
                int d5 = k4 != null ? A0.K.d(k4.f301a) : -1;
                if (e5 >= 0 && e5 < d5) {
                    builder.setComposingText(e5, yVar3.f3093a.f328a.subSequence(e5, d5));
                    int b5 = sVar.b(e5);
                    int b6 = sVar.b(d5);
                    float[] fArr2 = new float[(b6 - b5) * 4];
                    i2.f290b.a(M1.a.j(b5, b6), fArr2);
                    int i6 = e5;
                    while (i6 < d5) {
                        int b7 = sVar.b(i6);
                        int i7 = (b7 - b5) * 4;
                        float f7 = fArr2[i7];
                        int i8 = d5;
                        float f8 = fArr2[i7 + 1];
                        int i9 = b5;
                        float f9 = fArr2[i7 + 2];
                        G0.s sVar2 = sVar;
                        float f10 = fArr2[i7 + 3];
                        float[] fArr3 = fArr2;
                        int i10 = (dVar3.f4376c <= f7 || f9 <= dVar3.f4374a || dVar3.f4377d <= f8 || f10 <= dVar3.f4375b) ? 0 : 1;
                        if (!m3.o.o(dVar3, f7, f8) || !m3.o.o(dVar3, f9, f10)) {
                            i10 |= 2;
                        }
                        if (i2.a(b7) == hVar) {
                            i10 |= 4;
                        }
                        builder.addCharacterBounds(i6, f7, f8, f9, f10, i10);
                        i6++;
                        fArr2 = fArr3;
                        d5 = i8;
                        b5 = i9;
                        sVar = sVar2;
                    }
                }
            } else {
                view = view2;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33 && z6) {
                j.a(builder, dVar4);
            }
            if (i11 >= 34 && z7) {
                k.a(builder, i2, dVar3);
            }
            tVar.o().updateCursorAnchorInfo(view, builder.build());
            this.f11507e = false;
        }
    }
}
