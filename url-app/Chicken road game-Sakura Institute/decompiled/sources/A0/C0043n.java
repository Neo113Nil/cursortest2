package A0;

import Z.C0310g;
import Z.C0316m;
import android.text.Layout;
import b0.C0494b;
import b0.InterfaceC0496d;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w2.C1294c;

/* renamed from: A0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043n extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f345d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f347i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f348j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f349k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043n(long j4, float[] fArr, M2.C c4, M2.B b4) {
        super(1);
        this.f346e = j4;
        this.f347i = fArr;
        this.f348j = c4;
        this.f349k = b4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B0.F f4;
        Layout layout;
        float a4;
        float a5;
        float f5;
        switch (this.f345d) {
            case 0:
                r rVar = (r) obj;
                int i2 = rVar.f367b;
                long j4 = this.f346e;
                int e4 = i2 > K.e(j4) ? rVar.f367b : K.e(j4);
                int d4 = K.d(j4);
                int i4 = rVar.f368c;
                if (i4 >= d4) {
                    i4 = K.d(j4);
                }
                long j5 = M1.a.j(rVar.b(e4), rVar.b(i4));
                M2.C c4 = (M2.C) this.f348j;
                int i5 = c4.f3578d;
                C0031b c0031b = rVar.f366a;
                int e5 = K.e(j5);
                int d5 = K.d(j5);
                B0.F f6 = c0031b.f313d;
                Layout layout2 = f6.f905f;
                int length = layout2.getText().length();
                if (e5 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0");
                }
                if (e5 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length");
                }
                if (d5 <= e5) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (d5 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                int i6 = (d5 - e5) * 4;
                float[] fArr = (float[]) this.f347i;
                if (fArr.length - i5 < i6) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout2.getLineForOffset(e5);
                int lineForOffset2 = layout2.getLineForOffset(d5 - 1);
                B0.p pVar = new B0.p(f6);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout2.getLineStart(lineForOffset);
                        int f7 = f6.f(lineForOffset);
                        int max = Math.max(e5, lineStart);
                        int min = Math.min(d5, f7);
                        float g4 = f6.g(lineForOffset);
                        float e6 = f6.e(lineForOffset);
                        int i7 = i5;
                        int i8 = e5;
                        int i9 = d5;
                        boolean z4 = false;
                        boolean z5 = layout2.getParagraphDirection(lineForOffset) == 1;
                        int i10 = max;
                        int i11 = i7;
                        while (i10 < min) {
                            boolean isRtlCharAt = layout2.isRtlCharAt(i10);
                            if (!z5 || isRtlCharAt) {
                                f4 = f6;
                                if (z5 && isRtlCharAt) {
                                    z4 = false;
                                    float a6 = pVar.a(i10, false, false, false);
                                    layout = layout2;
                                    a4 = pVar.a(i10 + 1, true, true, false);
                                    a5 = a6;
                                } else {
                                    layout = layout2;
                                    z4 = false;
                                    if (z5 || !isRtlCharAt) {
                                        a4 = pVar.a(i10, false, false, false);
                                        a5 = pVar.a(i10 + 1, true, true, false);
                                    } else {
                                        a5 = pVar.a(i10, false, false, true);
                                        a4 = pVar.a(i10 + 1, true, true, true);
                                        z4 = false;
                                    }
                                }
                            } else {
                                f4 = f6;
                                a4 = pVar.a(i10, z4, z4, true);
                                a5 = pVar.a(i10 + 1, true, true, true);
                                layout = layout2;
                                z4 = false;
                            }
                            fArr[i11] = a4;
                            fArr[i11 + 1] = g4;
                            fArr[i11 + 2] = a5;
                            fArr[i11 + 3] = e6;
                            i11 += 4;
                            i10++;
                            f6 = f4;
                            layout2 = layout;
                        }
                        B0.F f8 = f6;
                        Layout layout3 = layout2;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i5 = i11;
                            e5 = i8;
                            d5 = i9;
                            f6 = f8;
                            layout2 = layout3;
                        }
                    }
                }
                int c5 = (K.c(j5) * 4) + c4.f3578d;
                int i12 = c4.f3578d;
                while (true) {
                    M2.B b4 = (M2.B) this.f349k;
                    if (i12 >= c5) {
                        c4.f3578d = c5;
                        b4.f3577d = c0031b.b() + b4.f3577d;
                        return Unit.f7487a;
                    }
                    int i13 = i12 + 1;
                    float f9 = fArr[i13];
                    float f10 = b4.f3577d;
                    fArr[i13] = f9 + f10;
                    int i14 = i12 + 3;
                    fArr[i14] = fArr[i14] + f10;
                    i12 += 4;
                }
            default:
                r0.G g5 = (r0.G) obj;
                g5.a();
                Y.d dVar = (Y.d) this.f347i;
                M2.E e7 = (M2.E) this.f348j;
                long j6 = this.f346e;
                C0316m c0316m = (C0316m) this.f349k;
                C0494b c0494b = g5.f9624d;
                C1294c c1294c = (C1294c) c0494b.f5603e.f987e;
                float f11 = dVar.f4374a;
                float f12 = dVar.f4375b;
                c1294c.r(f11, f12);
                try {
                    f5 = f12;
                    try {
                        InterfaceC0496d.s(g5, (C0310g) e7.f3580d, 0L, j6, 0L, 0.0f, c0316m, 0, 890);
                        ((C1294c) c0494b.f5603e.f987e).r(-f11, -f5);
                        return Unit.f7487a;
                    } catch (Throwable th) {
                        th = th;
                        ((C1294c) c0494b.f5603e.f987e).r(-f11, -f5);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f5 = f12;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0043n(Y.d dVar, M2.E e4, long j4, C0316m c0316m) {
        super(1);
        this.f347i = dVar;
        this.f348j = e4;
        this.f346e = j4;
        this.f349k = c0316m;
    }
}
