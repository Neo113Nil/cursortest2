package D0;

import C0.C0025a;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;
import k2.C0570b;
import k2.C0572d;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final w f797a = new w();

    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int i3, int i4) {
        int i5 = i3;
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
                        v.a(textPaint2, charSequence, i5, nextSpanTransition, rect2);
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
            v.a(textPaint, charSequence, i5, i4, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i5, i4, rect3);
        }
        return rect3;
    }

    public static final float b(int i3, int i4, float[] fArr) {
        return fArr[((i3 - i4) * 2) + 1];
    }

    public static final int c(Layout layout, int i3, boolean z3) {
        if (i3 <= 0) {
            return 0;
        }
        if (i3 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i3);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i3 || layout.getLineEnd(lineForOffset) == i3) ? lineStart == i3 ? z3 ? lineForOffset - 1 : lineForOffset : z3 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }

    public static final int d(G g3, Layout layout, C0.q qVar, int i3, RectF rectF, E0.e eVar, C0025a c0025a, boolean z3) {
        s[] sVarArr;
        int i4;
        s[] sVarArr2;
        int i5;
        int i6;
        int w2;
        int i7;
        int v3;
        Bidi createLineBidi;
        boolean z4;
        float a3;
        float a4;
        int lineTop = layout.getLineTop(i3);
        int lineBottom = layout.getLineBottom(i3);
        int lineStart = layout.getLineStart(i3);
        int lineEnd = layout.getLineEnd(i3);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i8 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i8];
        Layout layout2 = g3.f827f;
        int lineStart2 = layout2.getLineStart(i3);
        int f3 = g3.f(i3);
        if (i8 < (f3 - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        q qVar2 = new q(g3);
        boolean z5 = false;
        boolean z6 = layout2.getParagraphDirection(i3) == 1;
        int i9 = 0;
        while (lineStart2 < f3) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z6 && !isRtlCharAt) {
                a3 = qVar2.a(lineStart2, z5, z5, true);
                a4 = qVar2.a(lineStart2 + 1, true, true, true);
                z4 = z6;
            } else if (z6 && isRtlCharAt) {
                z4 = z6;
                a4 = qVar2.a(lineStart2, false, false, false);
                a3 = qVar2.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z6;
                if (isRtlCharAt) {
                    float a5 = qVar2.a(lineStart2, false, false, true);
                    a3 = qVar2.a(lineStart2 + 1, true, true, true);
                    a4 = a5;
                } else {
                    a3 = qVar2.a(lineStart2, false, false, false);
                    a4 = qVar2.a(lineStart2 + 1, true, true, false);
                }
            }
            fArr[i9] = a3;
            fArr[i9 + 1] = a4;
            i9 += 2;
            lineStart2++;
            z6 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) qVar.f630c;
        int lineStart3 = layout3.getLineStart(i3);
        int lineEnd2 = layout3.getLineEnd(i3);
        int g4 = qVar.g(lineStart3, false);
        int h3 = qVar.h(g4);
        int i10 = lineStart3 - h3;
        int i11 = lineEnd2 - h3;
        Bidi d3 = qVar.d(g4);
        if (d3 == null || (createLineBidi = d3.createLineBidi(i10, i11)) == null) {
            sVarArr = new s[]{new s(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            sVarArr = new s[runCount];
            int i12 = 0;
            while (i12 < runCount) {
                int i13 = runCount;
                sVarArr[i12] = new s(createLineBidi.getRunStart(i12) + lineStart3, createLineBidi.getRunLimit(i12) + lineStart3, createLineBidi.getRunLevel(i12) % 2 == 1);
                i12++;
                runCount = i13;
            }
        }
        C0570b c0572d = z3 ? new C0572d(0, sVarArr.length - 1, 1) : new C0570b(sVarArr.length - 1, 0, -1);
        int i14 = c0572d.f6419d;
        int i15 = c0572d.f6420e;
        int i16 = c0572d.f6421f;
        if ((i16 <= 0 || i14 > i15) && (i16 >= 0 || i15 > i14)) {
            return -1;
        }
        while (true) {
            s sVar = sVarArr[i14];
            boolean z7 = sVar.f857c;
            int i17 = sVar.f855a;
            int i18 = sVar.f856b;
            float f4 = z7 ? fArr[((i18 - 1) - lineStart) * 2] : fArr[(i17 - lineStart) * 2];
            float b3 = z7 ? b(i17, lineStart, fArr) : b(i18 - 1, lineStart, fArr);
            boolean z8 = sVar.f857c;
            if (z3) {
                float f5 = rectF.left;
                if (b3 >= f5) {
                    sVarArr2 = sVarArr;
                    float f6 = rectF.right;
                    if (f4 <= f6) {
                        if ((z8 || f5 > f4) && (!z8 || f6 < b3)) {
                            int i19 = i17;
                            i7 = i18;
                            while (true) {
                                i4 = i16;
                                if (i7 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i7 + i19) / 2;
                                float f7 = fArr[(i20 - lineStart) * 2];
                                if ((z8 || f7 <= rectF.left) && (!z8 || f7 >= rectF.right)) {
                                    i19 = i20;
                                } else {
                                    i7 = i20;
                                }
                                i16 = i4;
                            }
                            if (!z8) {
                                i7 = i19;
                            }
                        } else {
                            i4 = i16;
                            i7 = i17;
                        }
                        int w3 = eVar.w(i7);
                        if (w3 != -1 && (v3 = eVar.v(w3)) < i18) {
                            if (v3 >= i17) {
                                i17 = v3;
                            }
                            if (w3 > i18) {
                                w3 = i18;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i21 = w3;
                            while (true) {
                                rectF2.left = z8 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i17 - lineStart) * 2];
                                rectF2.right = z8 ? b(i17, lineStart, fArr) : b(i21 - 1, lineStart, fArr);
                                if (!((Boolean) c0025a.h(rectF2, rectF)).booleanValue()) {
                                    i17 = eVar.B(i17);
                                    if (i17 == -1 || i17 >= i18) {
                                        break;
                                    }
                                    i21 = eVar.w(i17);
                                    if (i21 > i18) {
                                        i21 = i18;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    } else {
                        i4 = i16;
                    }
                } else {
                    i4 = i16;
                    sVarArr2 = sVarArr;
                }
                i17 = -1;
            } else {
                i4 = i16;
                sVarArr2 = sVarArr;
                float f8 = rectF.left;
                if (b3 >= f8) {
                    float f9 = rectF.right;
                    if (f4 <= f9) {
                        if ((z8 || f9 < b3) && (!z8 || f8 > f4)) {
                            int i22 = i17;
                            int i23 = i18;
                            while (i23 - i22 > 1) {
                                int i24 = (i23 + i22) / 2;
                                float f10 = fArr[(i24 - lineStart) * 2];
                                int i25 = i23;
                                if ((z8 || f10 <= rectF.right) && (!z8 || f10 >= rectF.left)) {
                                    i23 = i25;
                                    i22 = i24;
                                } else {
                                    i23 = i24;
                                }
                            }
                            i6 = z8 ? i23 : i22;
                        } else {
                            i6 = i18 - 1;
                        }
                        int v4 = eVar.v(i6 + 1);
                        if (v4 != -1 && (w2 = eVar.w(v4)) > i17) {
                            if (v4 < i17) {
                                v4 = i17;
                            }
                            if (w2 <= i18) {
                                i18 = w2;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i26 = v4;
                            while (true) {
                                rectF3.left = z8 ? fArr[((i18 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF3.right = z8 ? b(i26, lineStart, fArr) : b(i18 - 1, lineStart, fArr);
                                if (!((Boolean) c0025a.h(rectF3, rectF)).booleanValue()) {
                                    i18 = eVar.D(i18);
                                    if (i18 == -1 || i18 <= i17) {
                                        break;
                                    }
                                    i26 = eVar.v(i18);
                                    if (i26 < i17) {
                                        i26 = i17;
                                    }
                                } else {
                                    i5 = i18;
                                    break;
                                }
                            }
                        }
                    }
                }
                i5 = -1;
                i17 = i5;
            }
            if (i17 >= 0) {
                return i17;
            }
            if (i14 == i15) {
                return -1;
            }
            i14 += i4;
            sVarArr = sVarArr2;
            i16 = i4;
        }
    }

    public static final boolean e(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
