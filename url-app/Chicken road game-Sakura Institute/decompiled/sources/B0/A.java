package B0;

import A0.C0030a;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final v f875a = new v();

    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int i2, int i4) {
        int i5 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i5 - 1, i4, MetricAffectingSpan.class) != i4) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i5 < i4) {
                    int nextSpanTransition = spanned.nextSpanTransition(i5, i4, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i5, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        u.a(textPaint2, charSequence, i5, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i5, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i5 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            u.a(textPaint, charSequence, i5, i4, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i5, i4, rect3);
        }
        return rect3;
    }

    public static final float b(int i2, int i4, float[] fArr) {
        return fArr[((i2 - i4) * 2) + 1];
    }

    public static final int c(Layout layout, int i2, boolean z4) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i2 || layout.getLineEnd(lineForOffset) == i2) ? lineStart == i2 ? z4 ? lineForOffset - 1 : lineForOffset : z4 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }

    public static final int d(F f4, Layout layout, A0.q qVar, int i2, RectF rectF, C0.e eVar, C0030a c0030a, boolean z4) {
        r[] rVarArr;
        kotlin.ranges.a aVar;
        int i4;
        r[] rVarArr2;
        int i5;
        int x2;
        int i6;
        int w4;
        Bidi createLineBidi;
        boolean z5;
        float a4;
        float a5;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = f4.f905f;
        int lineStart2 = layout2.getLineStart(i2);
        int f5 = f4.f(i2);
        if (i7 < (f5 - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        p pVar = new p(f4);
        boolean z6 = false;
        boolean z7 = layout2.getParagraphDirection(i2) == 1;
        int i8 = 0;
        while (lineStart2 < f5) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z7 && !isRtlCharAt) {
                a4 = pVar.a(lineStart2, z6, z6, true);
                a5 = pVar.a(lineStart2 + 1, true, true, true);
                z5 = z7;
            } else if (z7 && isRtlCharAt) {
                z5 = z7;
                a5 = pVar.a(lineStart2, false, false, false);
                a4 = pVar.a(lineStart2 + 1, true, true, false);
            } else {
                z5 = z7;
                if (isRtlCharAt) {
                    float a6 = pVar.a(lineStart2, false, false, true);
                    a4 = pVar.a(lineStart2 + 1, true, true, true);
                    a5 = a6;
                } else {
                    a4 = pVar.a(lineStart2, false, false, false);
                    a5 = pVar.a(lineStart2 + 1, true, true, false);
                }
            }
            fArr[i8] = a4;
            fArr[i8 + 1] = a5;
            i8 += 2;
            lineStart2++;
            z7 = z5;
            z6 = false;
        }
        Layout layout3 = (Layout) qVar.f362c;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int g4 = qVar.g(lineStart3, false);
        int h4 = qVar.h(g4);
        int i9 = lineStart3 - h4;
        int i10 = lineEnd2 - h4;
        Bidi d4 = qVar.d(g4);
        if (d4 == null || (createLineBidi = d4.createLineBidi(i9, i10)) == null) {
            rVarArr = new r[]{new r(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            rVarArr = new r[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                rVarArr[i11] = new r(createLineBidi.getRunStart(i11) + lineStart3, createLineBidi.getRunLimit(i11) + lineStart3, createLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        if (z4) {
            Intrinsics.checkNotNullParameter(rVarArr, "<this>");
            Intrinsics.checkNotNullParameter(rVarArr, "<this>");
            aVar = new IntRange(0, rVarArr.length - 1, 1);
        } else {
            Intrinsics.checkNotNullParameter(rVarArr, "<this>");
            int length = rVarArr.length - 1;
            kotlin.ranges.a.f7504j.getClass();
            aVar = new kotlin.ranges.a(length, 0, -1);
        }
        int i13 = aVar.f7505d;
        int i14 = aVar.f7506e;
        int i15 = aVar.f7507i;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            r rVar = rVarArr[i13];
            boolean z8 = rVar.f935c;
            int i16 = rVar.f933a;
            int i17 = rVar.f934b;
            float f6 = z8 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
            float b4 = z8 ? b(i16, lineStart, fArr) : b(i17 - 1, lineStart, fArr);
            boolean z9 = rVar.f935c;
            if (z4) {
                float f7 = rectF.left;
                if (b4 >= f7) {
                    rVarArr2 = rVarArr;
                    float f8 = rectF.right;
                    if (f6 <= f8) {
                        if ((z9 || f7 > f6) && (!z9 || f8 < b4)) {
                            int i18 = i16;
                            i6 = i17;
                            while (true) {
                                i4 = i15;
                                if (i6 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i6 + i18) / 2;
                                float f9 = fArr[(i19 - lineStart) * 2];
                                if ((z9 || f9 <= rectF.left) && (!z9 || f9 >= rectF.right)) {
                                    i18 = i19;
                                } else {
                                    i6 = i19;
                                }
                                i15 = i4;
                            }
                            if (!z9) {
                                i6 = i18;
                            }
                        } else {
                            i4 = i15;
                            i6 = i16;
                        }
                        int x3 = eVar.x(i6);
                        if (x3 != -1 && (w4 = eVar.w(x3)) < i17) {
                            if (w4 >= i16) {
                                i16 = w4;
                            }
                            if (x3 > i17) {
                                x3 = i17;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = x3;
                            while (true) {
                                rectF2.left = z9 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i16 - lineStart) * 2];
                                rectF2.right = z9 ? b(i16, lineStart, fArr) : b(i20 - 1, lineStart, fArr);
                                if (!((Boolean) c0030a.h(rectF2, rectF)).booleanValue()) {
                                    i16 = eVar.C(i16);
                                    if (i16 == -1 || i16 >= i17) {
                                        break;
                                    }
                                    i20 = eVar.x(i16);
                                    if (i20 > i17) {
                                        i20 = i17;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        i4 = i15;
                    }
                } else {
                    i4 = i15;
                    rVarArr2 = rVarArr;
                }
                i16 = -1;
            } else {
                i4 = i15;
                rVarArr2 = rVarArr;
                float f10 = rectF.left;
                if (b4 >= f10) {
                    float f11 = rectF.right;
                    if (f6 <= f11) {
                        if ((z9 || f11 < b4) && (!z9 || f10 > f6)) {
                            int i21 = i16;
                            int i22 = i17;
                            while (i22 - i21 > 1) {
                                int i23 = (i22 + i21) / 2;
                                float f12 = fArr[(i23 - lineStart) * 2];
                                int i24 = i22;
                                if ((z9 || f12 <= rectF.right) && (!z9 || f12 >= rectF.left)) {
                                    i22 = i24;
                                    i21 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            i5 = z9 ? i22 : i21;
                        } else {
                            i5 = i17 - 1;
                        }
                        int w5 = eVar.w(i5 + 1);
                        if (w5 != -1 && (x2 = eVar.x(w5)) > i16) {
                            if (w5 < i16) {
                                w5 = i16;
                            }
                            if (x2 <= i17) {
                                i17 = x2;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = w5;
                            while (true) {
                                rectF3.left = z9 ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z9 ? b(i25, lineStart, fArr) : b(i17 - 1, lineStart, fArr);
                                if (!((Boolean) c0030a.h(rectF3, rectF)).booleanValue()) {
                                    i17 = eVar.E(i17);
                                    if (i17 == -1 || i17 <= i16) {
                                        break;
                                    }
                                    i25 = eVar.w(i17);
                                    if (i25 < i16) {
                                        i25 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i16 = i17;
                        }
                    }
                }
                i17 = -1;
                i16 = i17;
            }
            if (i16 >= 0) {
                return i16;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i4;
            rVarArr = rVarArr2;
            i15 = i4;
        }
    }

    public static final boolean e(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
