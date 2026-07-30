package a2;

import android.text.Layout;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f419g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f422j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f423k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j8, float[] fArr, r6.t tVar, r6.s sVar) {
        super(1);
        this.f420h = j8;
        this.f421i = fArr;
        this.f422j = tVar;
        this.f423k = sVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        float[] fArr;
        int i7;
        boolean z8;
        float a3;
        float a9;
        switch (this.f419g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = (r) obj;
                float[] fArr2 = (float[]) this.f421i;
                r6.t tVar = (r6.t) this.f422j;
                r6.s sVar = (r6.s) this.f423k;
                int i8 = rVar.f441b;
                b bVar = rVar.f440a;
                int i9 = rVar.f442c;
                long j8 = this.f420h;
                int e9 = i8 > j0.e(j8) ? rVar.f441b : j0.e(j8);
                if (i9 >= j0.d(j8)) {
                    i9 = j0.d(j8);
                }
                long h3 = r4.a.h(rVar.b(e9), rVar.b(i9));
                int i10 = tVar.f7966f;
                b2.d0 d0Var = bVar.f314d;
                int e10 = j0.e(h3);
                int d8 = j0.d(h3);
                Layout layout = d0Var.f1267e;
                int length = layout.getText().length();
                if (e10 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0");
                }
                if (e10 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length");
                }
                if (d8 <= e10) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (d8 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i10 < (d8 - e10) * 4) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(e10);
                int lineForOffset2 = layout.getLineForOffset(d8 - 1);
                b2.o oVar = new b2.o(d0Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int i11 = i10;
                        int f9 = d0Var.f(lineForOffset);
                        int max = Math.max(e10, lineStart);
                        int min = Math.min(d8, f9);
                        float g9 = d0Var.g(lineForOffset);
                        float e11 = d0Var.e(lineForOffset);
                        fArr = fArr2;
                        b2.d0 d0Var2 = d0Var;
                        boolean z9 = false;
                        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i12 = max;
                        int i13 = i11;
                        while (i12 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i12);
                            if (!z10 || isRtlCharAt) {
                                i7 = min;
                                if (z10 && isRtlCharAt) {
                                    z9 = false;
                                    float a10 = oVar.a(i12, false, false, false);
                                    z8 = z10;
                                    a3 = oVar.a(i12 + 1, true, true, false);
                                    a9 = a10;
                                } else {
                                    z8 = z10;
                                    z9 = false;
                                    if (z8 || !isRtlCharAt) {
                                        a3 = oVar.a(i12, false, false, false);
                                        a9 = oVar.a(i12 + 1, true, true, false);
                                    } else {
                                        a9 = oVar.a(i12, false, false, true);
                                        a3 = oVar.a(i12 + 1, true, true, true);
                                    }
                                }
                                fArr[i13] = a3;
                                fArr[i13 + 1] = g9;
                                fArr[i13 + 2] = a9;
                                fArr[i13 + 3] = e11;
                                i13 += 4;
                                i12++;
                                z10 = z8;
                                min = i7;
                            } else {
                                i7 = min;
                                a3 = oVar.a(i12, z9, z9, true);
                                z8 = z10;
                                a9 = oVar.a(i12 + 1, true, true, true);
                            }
                            z9 = false;
                            fArr[i13] = a3;
                            fArr[i13 + 1] = g9;
                            fArr[i13 + 2] = a9;
                            fArr[i13 + 3] = e11;
                            i13 += 4;
                            i12++;
                            z10 = z8;
                            min = i7;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i10 = i13;
                            fArr2 = fArr;
                            d0Var = d0Var2;
                        }
                    }
                } else {
                    fArr = fArr2;
                }
                int c4 = (j0.c(h3) * 4) + tVar.f7966f;
                for (int i14 = tVar.f7966f; i14 < c4; i14 += 4) {
                    int i15 = i14 + 1;
                    float f10 = fArr[i15];
                    float f11 = sVar.f7965f;
                    fArr[i15] = f10 + f11;
                    int i16 = i14 + 3;
                    fArr[i16] = fArr[i16] + f11;
                }
                tVar.f7966f = c4;
                sVar.f7965f = bVar.b() + sVar.f7965f;
                return d6.z.f2639a;
            default:
                r1.f0 f0Var = (r1.f0) obj;
                f0Var.b();
                y0.d dVar = (y0.d) this.f421i;
                float f12 = dVar.f9780a;
                float f13 = dVar.f9781b;
                r6.v vVar = (r6.v) this.f422j;
                long j9 = this.f420h;
                z0.m mVar = (z0.m) this.f423k;
                b1.c cVar = f0Var.f7767f;
                ((b6.c) cVar.f1234g.f1230g).B(f12, f13);
                try {
                    b1.e.c0(f0Var, (z0.h) vVar.f7968f, j9, 0L, 0.0f, mVar, 0, 890);
                    ((b6.c) cVar.f1234g.f1230g).B(-f12, -f13);
                    return d6.z.f2639a;
                } catch (Throwable th) {
                    ((b6.c) cVar.f1234g.f1230g).B(-f12, -f13);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y0.d dVar, r6.v vVar, long j8, z0.m mVar) {
        super(1);
        this.f421i = dVar;
        this.f422j = vVar;
        this.f420h = j8;
        this.f423k = mVar;
    }
}
