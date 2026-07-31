package C0;

import B.Y;
import a0.C0239d;
import android.text.Layout;
import b0.C0338g;
import b0.C0344m;
import d0.C0401b;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class n extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f613e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Serializable f616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j3, float[] fArr, f2.s sVar, f2.r rVar) {
        super(1);
        this.f614f = j3;
        this.f615g = fArr;
        this.f616h = sVar;
        this.f617i = rVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        D0.G g3;
        Layout layout;
        float a3;
        float a4;
        float f3;
        switch (this.f613e) {
            case 0:
                r rVar = (r) obj;
                int i3 = rVar.f635b;
                long j3 = this.f614f;
                int e3 = i3 > J.e(j3) ? rVar.f635b : J.e(j3);
                int d3 = J.d(j3);
                int i4 = rVar.f636c;
                if (i4 >= d3) {
                    i4 = J.d(j3);
                }
                long J3 = O2.l.J(rVar.b(e3), rVar.b(i4));
                f2.s sVar = (f2.s) this.f616h;
                int i5 = sVar.f5830d;
                C0026b c0026b = rVar.f634a;
                int e4 = J.e(J3);
                int d4 = J.d(J3);
                D0.G g4 = c0026b.f581d;
                Layout layout2 = g4.f827f;
                int length = layout2.getText().length();
                if (e4 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0");
                }
                if (e4 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length");
                }
                if (d4 <= e4) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (d4 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                int i6 = (d4 - e4) * 4;
                float[] fArr = (float[]) this.f615g;
                if (fArr.length - i5 < i6) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout2.getLineForOffset(e4);
                int lineForOffset2 = layout2.getLineForOffset(d4 - 1);
                D0.q qVar = new D0.q(g4);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout2.getLineStart(lineForOffset);
                        int f4 = g4.f(lineForOffset);
                        int max = Math.max(e4, lineStart);
                        int min = Math.min(d4, f4);
                        float g5 = g4.g(lineForOffset);
                        float e5 = g4.e(lineForOffset);
                        int i7 = i5;
                        int i8 = e4;
                        int i9 = d4;
                        boolean z3 = false;
                        boolean z4 = layout2.getParagraphDirection(lineForOffset) == 1;
                        int i10 = max;
                        int i11 = i7;
                        while (i10 < min) {
                            boolean isRtlCharAt = layout2.isRtlCharAt(i10);
                            if (!z4 || isRtlCharAt) {
                                g3 = g4;
                                if (z4 && isRtlCharAt) {
                                    z3 = false;
                                    float a5 = qVar.a(i10, false, false, false);
                                    layout = layout2;
                                    a3 = qVar.a(i10 + 1, true, true, false);
                                    a4 = a5;
                                } else {
                                    layout = layout2;
                                    z3 = false;
                                    if (z4 || !isRtlCharAt) {
                                        a3 = qVar.a(i10, false, false, false);
                                        a4 = qVar.a(i10 + 1, true, true, false);
                                    } else {
                                        a4 = qVar.a(i10, false, false, true);
                                        a3 = qVar.a(i10 + 1, true, true, true);
                                        z3 = false;
                                    }
                                }
                            } else {
                                g3 = g4;
                                a3 = qVar.a(i10, z3, z3, true);
                                a4 = qVar.a(i10 + 1, true, true, true);
                                layout = layout2;
                                z3 = false;
                            }
                            fArr[i11] = a3;
                            fArr[i11 + 1] = g5;
                            fArr[i11 + 2] = a4;
                            fArr[i11 + 3] = e5;
                            i11 += 4;
                            i10++;
                            g4 = g3;
                            layout2 = layout;
                        }
                        D0.G g6 = g4;
                        Layout layout3 = layout2;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i5 = i11;
                            e4 = i8;
                            d4 = i9;
                            g4 = g6;
                            layout2 = layout3;
                        }
                    }
                }
                int c2 = (J.c(J3) * 4) + sVar.f5830d;
                int i12 = sVar.f5830d;
                while (true) {
                    f2.r rVar2 = (f2.r) this.f617i;
                    if (i12 >= c2) {
                        sVar.f5830d = c2;
                        rVar2.f5829d = c0026b.b() + rVar2.f5829d;
                        return R1.y.f4171a;
                    }
                    int i13 = i12 + 1;
                    float f5 = fArr[i13];
                    float f6 = rVar2.f5829d;
                    fArr[i13] = f5 + f6;
                    int i14 = i12 + 3;
                    fArr[i14] = fArr[i14] + f6;
                    i12 += 4;
                }
            default:
                t0.G g7 = (t0.G) obj;
                g7.b();
                C0239d c0239d = (C0239d) this.f615g;
                f2.u uVar = (f2.u) this.f616h;
                long j4 = this.f614f;
                C0344m c0344m = (C0344m) this.f617i;
                C0401b c0401b = g7.f8573d;
                Y y3 = (Y) c0401b.f5649e.f2116b;
                float f7 = c0239d.f4724a;
                float f8 = c0239d.f4725b;
                y3.r(f7, f8);
                try {
                    f3 = f8;
                    try {
                        InterfaceC0403d.p(g7, (C0338g) uVar.f5832d, 0L, j4, 0L, 0.0f, c0344m, 0, 890);
                        ((Y) c0401b.f5649e.f2116b).r(-f7, -f3);
                        return R1.y.f4171a;
                    } catch (Throwable th) {
                        th = th;
                        ((Y) c0401b.f5649e.f2116b).r(-f7, -f3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f3 = f8;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0239d c0239d, f2.u uVar, long j3, C0344m c0344m) {
        super(1);
        this.f615g = c0239d;
        this.f616h = uVar;
        this.f614f = j3;
        this.f617i = c0344m;
    }
}
