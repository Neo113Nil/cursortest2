package com.yandex.div.core.view2.spannable;

import W1.m;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import j2.AbstractC3185a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ImageSpan extends PositionAwareReplacementSpan {

    @Nullable
    private final Accessibility accessibility;

    @NotNull
    private final TextVerticalAlignment alignment;

    @NotNull
    private final RectF boundsInText;
    private final int height;

    @Nullable
    private Drawable image;
    private final int lineHeight;
    private final int width;

    @Metadata
    public static final class Accessibility {

        @Nullable
        private final String accessibilityType;

        @Nullable
        private final String contentDescription;

        @Nullable
        private final OnAccessibilityClickAction onClickAction;

        public Accessibility(@Nullable String str, @Nullable String str2, @Nullable OnAccessibilityClickAction onAccessibilityClickAction) {
            this.accessibilityType = str;
            this.contentDescription = str2;
            this.onClickAction = onAccessibilityClickAction;
        }

        @Nullable
        public final String getAccessibilityType() {
            return this.accessibilityType;
        }

        @Nullable
        public final String getContentDescription() {
            return this.contentDescription;
        }

        @Nullable
        public final OnAccessibilityClickAction getOnClickAction() {
            return this.onClickAction;
        }
    }

    @Metadata
    public interface OnAccessibilityClickAction {
        void perform();
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageSpan(@Nullable Drawable drawable, int i4, int i5, int i6, @NotNull TextVerticalAlignment alignment, @Nullable Accessibility accessibility) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.width = i4;
        this.height = i5;
        this.lineHeight = i6;
        this.alignment = alignment;
        this.accessibility = accessibility;
        this.image = drawable;
        this.boundsInText = new RectF();
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(@NotNull Paint paint, @NotNull CharSequence text, int i4, int i5, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (fontMetricsInt == null || this.lineHeight > 0) {
            return this.width;
        }
        int c4 = AbstractC3185a.c(paint.ascent());
        int c5 = AbstractC3185a.c(paint.descent());
        Drawable drawable = this.image;
        int height = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i6 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i6 == 1) {
            c5 = c4 + height;
        } else if (i6 == 2) {
            c5 = ((c4 + c5) + height) / 2;
        } else if (i6 == 3) {
            c5 = 0;
        } else if (i6 != 4) {
            throw new m();
        }
        int i7 = c5 - height;
        int i8 = fontMetricsInt.top;
        int i9 = fontMetricsInt.ascent;
        int i10 = fontMetricsInt.bottom - fontMetricsInt.descent;
        fontMetricsInt.ascent = Math.min(i7, i9);
        int max = Math.max(c5, fontMetricsInt.descent);
        fontMetricsInt.descent = max;
        fontMetricsInt.top = fontMetricsInt.ascent + (i8 - i9);
        fontMetricsInt.bottom = max + i10;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int i4, int i5, float f4, int i6, int i7, int i8, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int height = drawable.getBounds().height();
        int i9 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i9 == 1) {
            i7 = i6 + height;
        } else if (i9 == 2) {
            i7 = ((i6 + i8) + height) / 2;
        } else if (i9 != 3) {
            if (i9 != 4) {
                throw new m();
            }
            i7 = i8;
        }
        float f5 = i7 - height;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(f4, f5);
        canvas.translate(f4, f5);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Nullable
    public final Accessibility getAccessibility$div_release() {
        return this.accessibility;
    }

    @NotNull
    public final Rect getBoundsInText(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        rect.set(AbstractC3185a.c(this.boundsInText.left), AbstractC3185a.c(this.boundsInText.top), AbstractC3185a.c(this.boundsInText.right), AbstractC3185a.c(this.boundsInText.bottom));
        return rect;
    }

    public final void setImage(@Nullable Drawable drawable) {
        if (Intrinsics.areEqual(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }

    @NotNull
    public final RectF getBoundsInText(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        rect.set(this.boundsInText);
        return rect;
    }
}
