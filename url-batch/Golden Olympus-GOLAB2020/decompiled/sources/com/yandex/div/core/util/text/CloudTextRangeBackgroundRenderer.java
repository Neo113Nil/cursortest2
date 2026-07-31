package com.yandex.div.core.util.text;

import O1.AbstractC0853he;
import O1.C0754c5;
import O1.C0942me;
import O1.D3;
import O1.EnumC0779dc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import c2.AbstractC1380c;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import j2.AbstractC3185a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class CloudTextRangeBackgroundRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CloudTextRangeBackgroundRenderer(@NotNull Context context, @NotNull ExpressionResolver expressionResolver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        this.context = context;
        this.expressionResolver = expressionResolver;
        this.path = new Path();
        this.paint = new Paint();
    }

    private final int[] buildLeftSegments(Rect[] rectArr, int i4, int i5) {
        int i6 = (i4 + i5) - 1;
        if (i5 == 1) {
            return new int[]{rectArr[i6].width(), -rectArr[i6].height()};
        }
        Rect rect = rectArr[i6];
        int i7 = rect.left;
        int i8 = rect.bottom;
        int[] iArr = new int[i5 * 2];
        int i9 = 0;
        if (i4 <= i6) {
            int i10 = 0;
            while (true) {
                Rect rect2 = rectArr[i6];
                int i11 = rect2.left;
                if (i11 != i7) {
                    iArr[i10 * 2] = i11 - i7;
                    i10++;
                    i7 = i11;
                }
                int i12 = rect2.top - i8;
                int i13 = i6 - 1;
                while (true) {
                    if (i13 < i4) {
                        break;
                    }
                    Rect rect3 = rectArr[i13];
                    int i14 = rect3.bottom;
                    int i15 = rect2.top;
                    if (i14 <= i15) {
                        break;
                    }
                    if (rect3.left <= rect2.left) {
                        i12 -= i15 - i14;
                        break;
                    }
                    i13--;
                }
                int g4 = g.g(i12, 0);
                int i16 = (i10 * 2) + 1;
                iArr[i16] = iArr[i16] + g4;
                i8 += g4;
                if (i6 == i4) {
                    break;
                }
                i6--;
            }
            i9 = i10;
        }
        iArr[i9 * 2] = rectArr[i4].width();
        int[] copyOf = Arrays.copyOf(iArr, (i9 + 1) * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    private final Rect[] buildLines(Layout layout, int i4, int i5, int i6, int i7, int i8, Rect rect) {
        int i9 = i5 - i4;
        int i10 = i9 + 1;
        if (i10 == 0) {
            return new Rect[0];
        }
        Rect[] rectArr = new Rect[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i4 + i11;
            rectArr[i11] = new Rect((i11 == 0 ? i6 : AbstractC3185a.c(layout.getLineLeft(i4 + i11))) - rect.left, layout.getLineTop(i12) - rect.top, (i11 == i9 ? i7 : AbstractC3185a.c(layout.getLineRight(i12))) + rect.right, layout.getLineBottom(i12) + rect.bottom);
            i11++;
        }
        coalesceInvisibleLeftBounds(rectArr);
        coalesceInvisibleRightBounds(rectArr);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            Rect rect2 = rectArr[i13];
            iArr[i13] = -rect2.left;
            iArr2[i13] = rect2.right;
        }
        int i14 = i8 * 2;
        coalesceCloseBounds(iArr, i14);
        coalesceCloseBounds(iArr2, i14);
        for (int i15 = 0; i15 < i10; i15++) {
            Rect rect3 = rectArr[i15];
            rect3.left = -iArr[i15];
            rect3.right = iArr2[i15];
        }
        return rectArr;
    }

    private final int[] buildRightSegments(Rect[] rectArr, int i4, int i5) {
        int i6 = i4;
        int i7 = (i6 + i5) - 1;
        if (i5 == 1) {
            return new int[]{-rectArr[i6].width(), rectArr[i6].height()};
        }
        Rect rect = rectArr[i6];
        int i8 = rect.right;
        int i9 = rect.top;
        int[] iArr = new int[i5 * 2];
        int i10 = 0;
        if (i6 <= i7) {
            int i11 = 0;
            while (true) {
                Rect rect2 = rectArr[i6];
                int i12 = rect2.right;
                if (i12 != i8) {
                    iArr[i11 * 2] = i12 - i8;
                    i11++;
                    i8 = i12;
                }
                int i13 = rect2.bottom - i9;
                int i14 = i6 + 1;
                int i15 = i14;
                while (true) {
                    if (i15 > i7) {
                        break;
                    }
                    Rect rect3 = rectArr[i15];
                    int i16 = rect3.top;
                    int i17 = rect2.bottom;
                    if (i16 >= i17) {
                        break;
                    }
                    if (rect3.right >= rect2.right) {
                        i13 -= i17 - i16;
                        break;
                    }
                    i15++;
                }
                int d4 = g.d(i13, 0);
                int i18 = (i11 * 2) + 1;
                iArr[i18] = iArr[i18] + d4;
                i9 += d4;
                if (i6 == i7) {
                    break;
                }
                i6 = i14;
            }
            i10 = i11;
        }
        iArr[i10 * 2] = -rectArr[i7].width();
        int[] copyOf = Arrays.copyOf(iArr, (i10 + 1) * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    private final void coalesceCloseBounds(int[] iArr, int i4) {
        boolean z4;
        int i5 = 0;
        do {
            d I3 = i5 % 2 == 0 ? AbstractC3219i.I(iArr) : g.n(AbstractC3219i.I(iArr));
            int b4 = I3.b();
            int d4 = I3.d();
            int e4 = I3.e();
            if ((e4 > 0 && b4 <= d4) || (e4 < 0 && d4 <= b4)) {
                z4 = false;
                while (true) {
                    int i6 = b4 == 0 ? 0 : iArr[b4 - 1] - iArr[b4];
                    int i7 = b4 == AbstractC3219i.K(iArr) ? 0 : iArr[b4 + 1] - iArr[b4];
                    if ((i6 <= 0 || i6 >= i4) && (i7 <= 0 || i7 >= i4)) {
                        if (b4 != 0 && i6 < 0 && Math.abs(i6) < i4) {
                            iArr[b4 - 1] = iArr[b4];
                            z4 = true;
                        }
                        if (b4 != AbstractC3219i.K(iArr) && i7 < 0 && Math.abs(i7) < i4) {
                            iArr[b4 + 1] = iArr[b4];
                            z4 = true;
                        }
                    }
                    if (b4 == d4) {
                        break;
                    } else {
                        b4 += e4;
                    }
                }
            } else {
                z4 = false;
            }
            i5++;
        } while (z4);
    }

    private final void coalesceInvisibleLeftBounds(Rect[] rectArr) {
        int i4;
        int length = rectArr.length;
        int i5 = ((Rect) AbstractC3219i.G(rectArr)).left;
        int i6 = ((Rect) AbstractC3219i.G(rectArr)).top;
        int length2 = rectArr.length;
        int i7 = 0;
        while (i7 < length2) {
            Rect rect = rectArr[i7];
            int i8 = rect.bottom - i6;
            i7++;
            for (int i9 = i7; i9 < length; i9++) {
                Rect rect2 = rectArr[i9];
                int i10 = rect2.top;
                int i11 = rect.bottom;
                if (i10 >= i11) {
                    break;
                }
                i4 = rect2.left;
                if (i4 <= rect.left) {
                    i8 -= i11 - i10;
                    break;
                }
            }
            i4 = Integer.MIN_VALUE;
            if (i8 <= 0) {
                rect.left = Math.max(i5, i4);
                i8 = 0;
            } else {
                i5 = rect.left;
            }
            i6 += i8;
        }
    }

    private final void coalesceInvisibleRightBounds(Rect[] rectArr) {
        int i4;
        int length = rectArr.length;
        int i5 = ((Rect) AbstractC3219i.G(rectArr)).right;
        int i6 = ((Rect) AbstractC3219i.G(rectArr)).top;
        int length2 = rectArr.length;
        int i7 = 0;
        while (i7 < length2) {
            Rect rect = rectArr[i7];
            int i8 = rect.bottom - i6;
            i7++;
            for (int i9 = i7; i9 < length; i9++) {
                Rect rect2 = rectArr[i9];
                int i10 = rect2.top;
                int i11 = rect.bottom;
                if (i10 >= i11) {
                    break;
                }
                i4 = rect2.right;
                if (i4 >= rect.right) {
                    i8 -= i11 - i10;
                    break;
                }
            }
            i4 = Integer.MAX_VALUE;
            if (i8 <= 0) {
                rect.right = Math.min(i5, i4);
                i8 = 0;
            } else {
                i5 = rect.right;
            }
            i6 += i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    private final void drawLines(Canvas canvas, Rect[] rectArr, int i4, int i5, int i6, int i7) {
        ?? r16;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z4;
        float f8;
        boolean z5 = true;
        if (i5 < 1) {
            return;
        }
        Rect rect = rectArr[i4];
        Rect rect2 = rectArr[(i4 + i5) - 1];
        int[] buildLeftSegments = buildLeftSegments(rectArr, i4, i5);
        int[] buildRightSegments = buildRightSegments(rectArr, i4, i5);
        this.path.reset();
        float f9 = i6;
        float f10 = 2.0f;
        float min = Math.min(f9, Math.min(rect.width() / 2.0f, buildRightSegments[1] / 2.0f));
        this.path.moveTo(rect.right - min, rect.top);
        float f11 = 0.9f;
        float f12 = 0.1f;
        this.path.rQuadTo(min * 0.9f, min * 0.1f, min, min);
        boolean z6 = false;
        int i8 = 2;
        int c4 = AbstractC1380c.c(0, buildRightSegments.length - 1, 2);
        float f13 = 0.0f;
        if (c4 >= 0) {
            int i9 = 0;
            while (true) {
                if (i9 >= buildRightSegments.length - i8) {
                    z4 = z5;
                    r16 = z4;
                } else {
                    r16 = z5;
                    z4 = z6;
                }
                float f14 = buildRightSegments[i9];
                f4 = f10;
                float f15 = buildRightSegments[i9 + 1];
                if (z4) {
                    f5 = f11;
                    f8 = f13;
                } else {
                    f5 = f11;
                    f8 = buildRightSegments[i9 + 3];
                }
                f6 = f12;
                f7 = Math.min(f9, Math.min(Math.abs(f14) / f4, f15 / f4));
                this.path.rLineTo(f13, (f15 - min) - f7);
                this.path.rQuadTo(min * f6 * Math.signum(f14), f7 * f5, f7 * Math.signum(f14), f7);
                if (!z4) {
                    min = Math.min(f9, Math.min(Math.abs(f14) / f4, f8 / f4));
                    this.path.rLineTo(f14 - ((min + f7) * Math.signum(f14)), 0.0f);
                    this.path.rQuadTo(min * f5 * Math.signum(f14), min * f6, Math.signum(f14) * min, min);
                }
                if (i9 == c4) {
                    break;
                }
                i9 += 2;
                f10 = f4;
                f11 = f5;
                f12 = f6;
                z5 = r16 == true ? 1 : 0;
                z6 = false;
                i8 = 2;
                f13 = 0.0f;
            }
        } else {
            r16 = 1;
            f4 = 2.0f;
            f5 = 0.9f;
            f6 = 0.1f;
            f7 = 0.0f;
        }
        float min2 = Math.min(f9, Math.min(rect2.width() / f4, (-buildLeftSegments[r16]) / f4));
        this.path.rLineTo((-rect2.width()) + f7 + min2, 0.0f);
        float f16 = -0.9f;
        float f17 = -0.1f;
        float f18 = -min2;
        this.path.rQuadTo(min2 * (-0.9f), min2 * (-0.1f), f18, f18);
        boolean z7 = false;
        int c5 = AbstractC1380c.c(0, buildLeftSegments.length - 1, 2);
        if (c5 >= 0) {
            int i10 = 0;
            while (true) {
                boolean z8 = i10 >= buildLeftSegments.length - 2 ? r16 : z7;
                float f19 = buildLeftSegments[i10];
                float f20 = buildLeftSegments[i10 + 1];
                float f21 = z8 ? 0.0f : buildLeftSegments[i10 + 3];
                float min3 = Math.min(f9, Math.min(Math.abs(f19) / f4, (-f20) / f4));
                float f22 = f16;
                this.path.rLineTo(0.0f, f20 + min2 + min3);
                float f23 = f17;
                this.path.rQuadTo(min3 * f6 * Math.signum(f19), min3 * f22, min3 * Math.signum(f19), -min3);
                if (!z8) {
                    min2 = Math.min(f9, Math.min(Math.abs(f19) / f4, (-f21) / f4));
                    this.path.rLineTo(f19 - ((min3 + min2) * Math.signum(f19)), 0.0f);
                    this.path.rQuadTo(min2 * f5 * Math.signum(f19), min2 * f23, Math.signum(f19) * min2, -min2);
                }
                if (i10 == c5) {
                    break;
                }
                i10 += 2;
                f16 = f22;
                f17 = f23;
                z7 = false;
            }
        }
        this.path.close();
        this.paint.setColor(i7);
        canvas.drawPath(this.path, this.paint);
    }

    private final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
        return displayMetrics;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i4, int i5, int i6, int i7, @Nullable C0942me c0942me, @Nullable AbstractC0853he abstractC0853he) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Object b4 = abstractC0853he != null ? abstractC0853he.b() : null;
        D3 d32 = b4 instanceof D3 ? (D3) b4 : null;
        if (d32 == null) {
            return;
        }
        draw(canvas, layout, i4, i5, i6, i7, d32);
    }

    private final void draw(Canvas canvas, Layout layout, int i4, int i5, int i6, int i7, D3 d32) {
        EnumC0779dc enumC0779dc;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        int intValue = ((Number) d32.f2451a.evaluate(this.expressionResolver)).intValue();
        int dpToPx = BaseDivViewExtensionsKt.dpToPx((Long) d32.f2452b.evaluate(this.expressionResolver), displayMetrics);
        C0754c5 c0754c5 = d32.f2453c;
        if (c0754c5 == null || (expression5 = c0754c5.f5856g) == null || (enumC0779dc = (EnumC0779dc) expression5.evaluate(this.expressionResolver)) == null) {
            enumC0779dc = EnumC0779dc.DP;
        }
        C0754c5 c0754c52 = d32.f2453c;
        int unitToPx = (c0754c52 == null || (expression4 = c0754c52.f5852c) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression4.evaluate(this.expressionResolver)).longValue()), displayMetrics, enumC0779dc);
        C0754c5 c0754c53 = d32.f2453c;
        int unitToPx2 = (c0754c53 == null || (expression3 = c0754c53.f5855f) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression3.evaluate(this.expressionResolver)).longValue()), displayMetrics, enumC0779dc);
        C0754c5 c0754c54 = d32.f2453c;
        int unitToPx3 = (c0754c54 == null || (expression2 = c0754c54.f5853d) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression2.evaluate(this.expressionResolver)).longValue()), displayMetrics, enumC0779dc);
        C0754c5 c0754c55 = d32.f2453c;
        Rect[] buildLines = buildLines(layout, i4, i5, i6, i7, dpToPx, new Rect(unitToPx, unitToPx2, unitToPx3, (c0754c55 == null || (expression = c0754c55.f5850a) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression.evaluate(this.expressionResolver)).longValue()), displayMetrics, enumC0779dc)));
        if (buildLines.length < 2) {
            drawLines(canvas, buildLines, 0, buildLines.length, dpToPx, intValue);
            return;
        }
        int length = buildLines.length - 1;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = i9 + 1;
            if (buildLines[i9].left > buildLines[i11].right) {
                drawLines(canvas, buildLines, i10, i8, dpToPx, intValue);
                i8 = 0;
                i10 = i11;
            }
            i8++;
            i9 = i11;
        }
        drawLines(canvas, buildLines, i10, i8, dpToPx, intValue);
    }
}
