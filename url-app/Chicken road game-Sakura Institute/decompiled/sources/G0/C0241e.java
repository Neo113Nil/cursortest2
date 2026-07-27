package G0;

import A0.I;
import B1.C0097d;
import Z.K;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC1125K;
import s0.C1166s;
import y2.InterfaceC1335j;

/* renamed from: G0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241e {

    /* renamed from: a, reason: collision with root package name */
    public final C1166s f3039a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097d f3040b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3042d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3044f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3045g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3046h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3047i;

    /* renamed from: j, reason: collision with root package name */
    public y f3048j;

    /* renamed from: k, reason: collision with root package name */
    public I f3049k;

    /* renamed from: l, reason: collision with root package name */
    public s f3050l;

    /* renamed from: n, reason: collision with root package name */
    public Y.d f3052n;

    /* renamed from: o, reason: collision with root package name */
    public Y.d f3053o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3041c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public M2.p f3051m = C0240d.f3033i;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3054p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f3055q = Z.E.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f3056r = new Matrix();

    public C0241e(C1166s c1166s, C0097d c0097d) {
        this.f3039a = c1166s;
        this.f3040b = c0097d;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void a() {
        View view;
        InterfaceC1335j interfaceC1335j;
        L0.h hVar;
        CursorAnchorInfo.Builder builder;
        C0097d c0097d = this.f3040b;
        ?? r2 = c0097d.f988i;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view2 = (View) c0097d.f987e;
        if (inputMethodManager.isActive(view2)) {
            ?? r32 = this.f3051m;
            float[] fArr = this.f3055q;
            r32.invoke(new Z.E(fArr));
            C1166s c1166s = this.f3039a;
            c1166s.A();
            Z.E.g(fArr, c1166s.f10335R);
            float d4 = Y.c.d(c1166s.f10339V);
            float e4 = Y.c.e(c1166s.f10339V);
            float[] fArr2 = c1166s.f10334Q;
            Z.E.d(fArr2);
            Z.E.h(fArr2, d4, e4, 0.0f);
            AbstractC1125K.m(fArr, fArr2);
            Matrix matrix = this.f3056r;
            K.x(matrix, fArr);
            y yVar = this.f3048j;
            Intrinsics.c(yVar);
            s sVar = this.f3050l;
            Intrinsics.c(sVar);
            I i2 = this.f3049k;
            Intrinsics.c(i2);
            Y.d dVar = this.f3052n;
            Intrinsics.c(dVar);
            Y.d dVar2 = this.f3053o;
            Intrinsics.c(dVar2);
            boolean z4 = this.f3044f;
            boolean z5 = this.f3045g;
            boolean z6 = this.f3046h;
            boolean z7 = this.f3047i;
            CursorAnchorInfo.Builder builder2 = this.f3054p;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j4 = yVar.f3094b;
            int e5 = A0.K.e(j4);
            builder2.setSelectionRange(e5, A0.K.d(j4));
            L0.h hVar2 = L0.h.f3507e;
            if (!z4 || e5 < 0) {
                view = view2;
                interfaceC1335j = r2;
                hVar = hVar2;
                builder = builder2;
            } else {
                int b4 = sVar.b(e5);
                Y.d c4 = i2.c(b4);
                float d5 = kotlin.ranges.b.d(c4.f4374a, 0.0f, (int) (i2.f291c >> 32));
                boolean s4 = M1.a.s(dVar, d5, c4.f4375b);
                boolean s5 = M1.a.s(dVar, d5, c4.f4377d);
                view = view2;
                boolean z8 = i2.a(b4) == hVar2;
                int i4 = (s4 || s5) ? 1 : 0;
                if (!s4 || !s5) {
                    i4 |= 2;
                }
                int i5 = z8 ? i4 | 4 : i4;
                float f4 = c4.f4375b;
                float f5 = c4.f4377d;
                hVar = hVar2;
                interfaceC1335j = r2;
                builder = builder2;
                builder2.setInsertionMarkerLocation(d5, f4, f5, f5, i5);
            }
            if (z5) {
                A0.K k4 = yVar.f3095c;
                int e6 = k4 != null ? A0.K.e(k4.f301a) : -1;
                int d6 = k4 != null ? A0.K.d(k4.f301a) : -1;
                if (e6 >= 0 && e6 < d6) {
                    builder.setComposingText(e6, yVar.f3093a.f328a.subSequence(e6, d6));
                    int b5 = sVar.b(e6);
                    int b6 = sVar.b(d6);
                    float[] fArr3 = new float[(b6 - b5) * 4];
                    i2.f290b.a(M1.a.j(b5, b6), fArr3);
                    while (e6 < d6) {
                        int b7 = sVar.b(e6);
                        int i6 = (b7 - b5) * 4;
                        float f6 = fArr3[i6];
                        float f7 = fArr3[i6 + 1];
                        int i7 = d6;
                        float f8 = fArr3[i6 + 2];
                        float f9 = fArr3[i6 + 3];
                        int i8 = b5;
                        int i9 = (dVar.f4376c <= f6 || f8 <= dVar.f4374a || dVar.f4377d <= f7 || f9 <= dVar.f4375b) ? 0 : 1;
                        if (!M1.a.s(dVar, f6, f7) || !M1.a.s(dVar, f8, f9)) {
                            i9 |= 2;
                        }
                        if (i2.a(b7) == hVar) {
                            i9 |= 4;
                        }
                        builder.addCharacterBounds(e6, f6, f7, f8, f9, i9);
                        e6++;
                        d6 = i7;
                        b5 = i8;
                    }
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33 && z6) {
                AbstractC0238b.a(builder, dVar2);
            }
            if (i10 >= 34 && z7) {
                AbstractC0239c.a(builder, i2, dVar);
            }
            ((InputMethodManager) interfaceC1335j.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f3043e = false;
        }
    }
}
