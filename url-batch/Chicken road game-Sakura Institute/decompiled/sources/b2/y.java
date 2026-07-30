package b2;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.Bidi;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1304a = new u();

    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int i7, int i8) {
        int i9 = i7;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i9 - 1, i8, MetricAffectingSpan.class) != i8) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i9 < i8) {
                    int nextSpanTransition = spanned.nextSpanTransition(i9, i8, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i9, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        t.a(textPaint2, charSequence, i9, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i9, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i9 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            t.a(textPaint, charSequence, i9, i8, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i9, i8, rect3);
        return rect3;
    }

    public static final float b(int i7, int i8, float[] fArr) {
        return fArr[((i7 - i8) * 2) + 1];
    }

    public static final int c(Layout layout, int i7, boolean z8) {
        if (i7 <= 0) {
            return 0;
        }
        if (i7 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i7);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i7 || lineEnd == i7) {
            if (lineStart == i7) {
                if (z8) {
                    return lineForOffset - 1;
                }
            } else if (!z8) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int d(d0 d0Var, Layout layout, a2.q qVar, int i7, RectF rectF, c2.e eVar, a2.a aVar, boolean z8) {
        q[] qVarArr;
        int i8;
        q[] qVarArr2;
        int i9;
        int d8;
        int i10;
        int i11;
        int c4;
        Bidi createLineBidi;
        boolean z9;
        float a3;
        float a9;
        float f9;
        int lineTop = layout.getLineTop(i7);
        int lineBottom = layout.getLineBottom(i7);
        int lineStart = layout.getLineStart(i7);
        int lineEnd = layout.getLineEnd(i7);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i12 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i12];
        Layout layout2 = d0Var.f1267e;
        int lineStart2 = layout2.getLineStart(i7);
        int f10 = d0Var.f(i7);
        if (i12 < (f10 - lineStart2) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        o oVar = new o(d0Var);
        boolean z10 = false;
        boolean z11 = layout2.getParagraphDirection(i7) == 1;
        int i13 = 0;
        while (lineStart2 < f10) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z11 && !isRtlCharAt) {
                a3 = oVar.a(lineStart2, z10, z10, true);
                f9 = oVar.a(lineStart2 + 1, true, true, true);
                z9 = z11;
            } else if (z11 && isRtlCharAt) {
                z9 = z11;
                f9 = oVar.a(lineStart2, false, false, false);
                a3 = oVar.a(lineStart2 + 1, true, true, false);
            } else {
                z9 = z11;
                if (isRtlCharAt) {
                    a9 = oVar.a(lineStart2, false, false, true);
                    a3 = oVar.a(lineStart2 + 1, true, true, true);
                } else {
                    a3 = oVar.a(lineStart2, false, false, false);
                    a9 = oVar.a(lineStart2 + 1, true, true, false);
                }
                f9 = a9;
            }
            fArr[i13] = a3;
            fArr[i13 + 1] = f9;
            i13 += 2;
            lineStart2++;
            z11 = z9;
            z10 = false;
        }
        Layout layout3 = (Layout) qVar.f436c;
        int lineStart3 = layout3.getLineStart(i7);
        int lineEnd2 = layout3.getLineEnd(i7);
        int g9 = qVar.g(lineStart3, false);
        int h3 = qVar.h(g9);
        int i14 = lineStart3 - h3;
        int i15 = lineEnd2 - h3;
        Bidi d9 = qVar.d(g9);
        if (d9 == null || (createLineBidi = d9.createLineBidi(i14, i15)) == null) {
            qVarArr = new q[]{new q(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            qVarArr = new q[runCount];
            int i16 = 0;
            while (i16 < runCount) {
                int i17 = runCount;
                qVarArr[i16] = new q(createLineBidi.getRunStart(i16) + lineStart3, createLineBidi.getRunLimit(i16) + lineStart3, createLineBidi.getRunLevel(i16) % 2 == 1);
                i16++;
                runCount = i17;
            }
        }
        w6.b dVar = z8 ? new w6.d(0, qVarArr.length - 1, 1) : new w6.b(qVarArr.length - 1, 0, -1);
        int i18 = dVar.f9521f;
        int i19 = dVar.f9522g;
        int i20 = dVar.f9523h;
        if ((i20 <= 0 || i18 > i19) && (i20 >= 0 || i19 > i18)) {
            return -1;
        }
        while (true) {
            q qVar2 = qVarArr[i18];
            boolean z12 = qVar2.f1295c;
            int i21 = qVar2.f1293a;
            int i22 = qVar2.f1294b;
            float f11 = z12 ? fArr[((i22 - 1) - lineStart) * 2] : fArr[(i21 - lineStart) * 2];
            float b9 = z12 ? b(i21, lineStart, fArr) : b(i22 - 1, lineStart, fArr);
            if (z8) {
                float f12 = rectF.left;
                if (b9 >= f12) {
                    i8 = i20;
                    float f13 = rectF.right;
                    if (f11 <= f13) {
                        if ((z12 || f12 > f11) && (!z12 || f13 < b9)) {
                            int i23 = i22;
                            int i24 = i21;
                            while (true) {
                                i10 = i23;
                                if (i23 - i24 <= 1) {
                                    break;
                                }
                                int i25 = (i10 + i24) / 2;
                                float f14 = fArr[(i25 - lineStart) * 2];
                                if ((z12 || f14 <= rectF.left) && (!z12 || f14 >= rectF.right)) {
                                    i23 = i10;
                                    i24 = i25;
                                } else {
                                    i23 = i25;
                                }
                            }
                            i11 = z12 ? i10 : i24;
                        } else {
                            i11 = i21;
                        }
                        int d10 = eVar.d(i11);
                        if (d10 != -1 && (c4 = eVar.c(d10)) < i22) {
                            if (c4 >= i21) {
                                i21 = c4;
                            }
                            if (d10 > i22) {
                                d10 = i22;
                            }
                            qVarArr2 = qVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i26 = d10;
                            while (true) {
                                rectF2.left = z12 ? fArr[((i26 - 1) - lineStart) * 2] : fArr[(i21 - lineStart) * 2];
                                rectF2.right = z12 ? b(i21, lineStart, fArr) : b(i26 - 1, lineStart, fArr);
                                if (!((Boolean) aVar.d(rectF2, rectF)).booleanValue()) {
                                    i21 = eVar.g(i21);
                                    if (i21 == -1 || i21 >= i22) {
                                        break;
                                    }
                                    i26 = eVar.d(i21);
                                    if (i26 > i22) {
                                        i26 = i22;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i21 = -1;
                        }
                    }
                } else {
                    i8 = i20;
                }
                qVarArr2 = qVarArr;
                i21 = -1;
            } else {
                i8 = i20;
                qVarArr2 = qVarArr;
                float f15 = rectF.left;
                if (b9 >= f15) {
                    float f16 = rectF.right;
                    if (f11 <= f16) {
                        if ((z12 || f16 < b9) && (!z12 || f15 > f11)) {
                            int i27 = i22;
                            int i28 = i21;
                            while (i27 - i28 > 1) {
                                int i29 = (i27 + i28) / 2;
                                float f17 = fArr[(i29 - lineStart) * 2];
                                int i30 = i27;
                                if ((z12 || f17 <= rectF.right) && (!z12 || f17 >= rectF.left)) {
                                    i27 = i30;
                                    i28 = i29;
                                } else {
                                    i27 = i29;
                                }
                            }
                            i9 = z12 ? i27 : i28;
                        } else {
                            i9 = i22 - 1;
                        }
                        int c6 = eVar.c(i9 + 1);
                        if (c6 != -1 && (d8 = eVar.d(c6)) > i21) {
                            if (c6 < i21) {
                                c6 = i21;
                            }
                            if (d8 <= i22) {
                                i22 = d8;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i31 = c6;
                            while (true) {
                                rectF3.left = z12 ? fArr[((i22 - 1) - lineStart) * 2] : fArr[(i31 - lineStart) * 2];
                                rectF3.right = z12 ? b(i31, lineStart, fArr) : b(i22 - 1, lineStart, fArr);
                                if (!((Boolean) aVar.d(rectF3, rectF)).booleanValue()) {
                                    i22 = eVar.j(i22);
                                    if (i22 == -1 || i22 <= i21) {
                                        break;
                                    }
                                    i31 = eVar.c(i22);
                                    if (i31 < i21) {
                                        i31 = i21;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i22 = -1;
                i21 = i22;
            }
            if (i21 >= 0) {
                return i21;
            }
            if (i18 == i19) {
                return -1;
            }
            i18 += i8;
            i20 = i8;
            qVarArr = qVarArr2;
        }
    }
}
