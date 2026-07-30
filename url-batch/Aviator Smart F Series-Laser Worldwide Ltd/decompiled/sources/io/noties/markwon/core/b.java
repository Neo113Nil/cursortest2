package io.noties.markwon.core;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.Size;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public class b {
    protected static final int BLOCK_QUOTE_DEF_COLOR_ALPHA = 25;
    protected static final int CODE_DEF_BACKGROUND_COLOR_ALPHA = 25;
    protected static final float CODE_DEF_TEXT_SIZE_RATIO = 0.87f;
    protected static final int HEADING_DEF_BREAK_COLOR_ALPHA = 75;
    private static final float[] HEADING_SIZES = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    protected static final int THEMATIC_BREAK_DEF_ALPHA = 25;
    protected final int blockMargin;
    protected final int blockQuoteColor;
    protected final int blockQuoteWidth;
    protected final int bulletListItemStrokeWidth;
    protected final int bulletWidth;
    protected final int codeBackgroundColor;
    protected final int codeBlockBackgroundColor;
    protected final int codeBlockMargin;
    protected final int codeBlockTextColor;
    protected final int codeBlockTextSize;
    protected final Typeface codeBlockTypeface;
    protected final int codeTextColor;
    protected final int codeTextSize;
    protected final Typeface codeTypeface;
    protected final int headingBreakColor;
    protected final int headingBreakHeight;
    protected final float[] headingTextSizeMultipliers;
    protected final Typeface headingTypeface;
    protected final boolean isLinkedUnderlined;
    protected final int linkColor;
    protected final int listItemColor;
    protected final int thematicBreakColor;
    protected final int thematicBreakHeight;

    public static class a {
        private int blockMargin;
        private int blockQuoteColor;
        private int blockQuoteWidth;
        private int bulletListItemStrokeWidth;
        private int bulletWidth;
        private int codeBackgroundColor;
        private int codeBlockBackgroundColor;
        private int codeBlockMargin;
        private int codeBlockTextColor;
        private int codeBlockTextSize;
        private Typeface codeBlockTypeface;
        private int codeTextColor;
        private int codeTextSize;
        private Typeface codeTypeface;
        private int headingBreakColor;
        private int headingBreakHeight;
        private float[] headingTextSizeMultipliers;
        private Typeface headingTypeface;
        private boolean isLinkUnderlined;
        private int linkColor;
        private int listItemColor;
        private int thematicBreakColor;
        private int thematicBreakHeight;

        a() {
            this.isLinkUnderlined = true;
            this.headingBreakHeight = -1;
            this.thematicBreakHeight = -1;
        }

        @NonNull
        public a blockMargin(@Px int i8) {
            this.blockMargin = i8;
            return this;
        }

        @NonNull
        public a blockQuoteColor(@ColorInt int i8) {
            this.blockQuoteColor = i8;
            return this;
        }

        @NonNull
        public a blockQuoteWidth(@Px int i8) {
            this.blockQuoteWidth = i8;
            return this;
        }

        @NonNull
        public b build() {
            return new b(this);
        }

        @NonNull
        public a bulletListItemStrokeWidth(@Px int i8) {
            this.bulletListItemStrokeWidth = i8;
            return this;
        }

        @NonNull
        public a bulletWidth(@Px int i8) {
            this.bulletWidth = i8;
            return this;
        }

        @NonNull
        public a codeBackgroundColor(@ColorInt int i8) {
            this.codeBackgroundColor = i8;
            return this;
        }

        @NonNull
        public a codeBlockBackgroundColor(@ColorInt int i8) {
            this.codeBlockBackgroundColor = i8;
            return this;
        }

        @NonNull
        public a codeBlockMargin(@Px int i8) {
            this.codeBlockMargin = i8;
            return this;
        }

        @NonNull
        public a codeBlockTextColor(@ColorInt int i8) {
            this.codeBlockTextColor = i8;
            return this;
        }

        @NonNull
        public a codeBlockTextSize(@Px int i8) {
            this.codeBlockTextSize = i8;
            return this;
        }

        @NonNull
        public a codeBlockTypeface(@NonNull Typeface typeface) {
            this.codeBlockTypeface = typeface;
            return this;
        }

        @NonNull
        public a codeTextColor(@ColorInt int i8) {
            this.codeTextColor = i8;
            return this;
        }

        @NonNull
        public a codeTextSize(@Px int i8) {
            this.codeTextSize = i8;
            return this;
        }

        @NonNull
        public a codeTypeface(@NonNull Typeface typeface) {
            this.codeTypeface = typeface;
            return this;
        }

        @NonNull
        public a headingBreakColor(@ColorInt int i8) {
            this.headingBreakColor = i8;
            return this;
        }

        @NonNull
        public a headingBreakHeight(@Px int i8) {
            this.headingBreakHeight = i8;
            return this;
        }

        @NonNull
        public a headingTextSizeMultipliers(@NonNull @Size(6) float[] fArr) {
            this.headingTextSizeMultipliers = fArr;
            return this;
        }

        @NonNull
        public a headingTypeface(@NonNull Typeface typeface) {
            this.headingTypeface = typeface;
            return this;
        }

        @NonNull
        public a isLinkUnderlined(boolean z7) {
            this.isLinkUnderlined = z7;
            return this;
        }

        @NonNull
        public a linkColor(@ColorInt int i8) {
            this.linkColor = i8;
            return this;
        }

        @NonNull
        public a listItemColor(@ColorInt int i8) {
            this.listItemColor = i8;
            return this;
        }

        @NonNull
        public a thematicBreakColor(@ColorInt int i8) {
            this.thematicBreakColor = i8;
            return this;
        }

        @NonNull
        public a thematicBreakHeight(@Px int i8) {
            this.thematicBreakHeight = i8;
            return this;
        }

        a(@NonNull b bVar) {
            this.isLinkUnderlined = true;
            this.headingBreakHeight = -1;
            this.thematicBreakHeight = -1;
            this.linkColor = bVar.linkColor;
            this.isLinkUnderlined = bVar.isLinkedUnderlined;
            this.blockMargin = bVar.blockMargin;
            this.blockQuoteWidth = bVar.blockQuoteWidth;
            this.blockQuoteColor = bVar.blockQuoteColor;
            this.listItemColor = bVar.listItemColor;
            this.bulletListItemStrokeWidth = bVar.bulletListItemStrokeWidth;
            this.bulletWidth = bVar.bulletWidth;
            this.codeTextColor = bVar.codeTextColor;
            this.codeBlockTextColor = bVar.codeBlockTextColor;
            this.codeBackgroundColor = bVar.codeBackgroundColor;
            this.codeBlockBackgroundColor = bVar.codeBlockBackgroundColor;
            this.codeBlockMargin = bVar.codeBlockMargin;
            this.codeTypeface = bVar.codeTypeface;
            this.codeTextSize = bVar.codeTextSize;
            this.headingBreakHeight = bVar.headingBreakHeight;
            this.headingBreakColor = bVar.headingBreakColor;
            this.headingTypeface = bVar.headingTypeface;
            this.headingTextSizeMultipliers = bVar.headingTextSizeMultipliers;
            this.thematicBreakColor = bVar.thematicBreakColor;
            this.thematicBreakHeight = bVar.thematicBreakHeight;
        }
    }

    protected b(@NonNull a aVar) {
        this.linkColor = aVar.linkColor;
        this.isLinkedUnderlined = aVar.isLinkUnderlined;
        this.blockMargin = aVar.blockMargin;
        this.blockQuoteWidth = aVar.blockQuoteWidth;
        this.blockQuoteColor = aVar.blockQuoteColor;
        this.listItemColor = aVar.listItemColor;
        this.bulletListItemStrokeWidth = aVar.bulletListItemStrokeWidth;
        this.bulletWidth = aVar.bulletWidth;
        this.codeTextColor = aVar.codeTextColor;
        this.codeBlockTextColor = aVar.codeBlockTextColor;
        this.codeBackgroundColor = aVar.codeBackgroundColor;
        this.codeBlockBackgroundColor = aVar.codeBlockBackgroundColor;
        this.codeBlockMargin = aVar.codeBlockMargin;
        this.codeTypeface = aVar.codeTypeface;
        this.codeBlockTypeface = aVar.codeBlockTypeface;
        this.codeTextSize = aVar.codeTextSize;
        this.codeBlockTextSize = aVar.codeBlockTextSize;
        this.headingBreakHeight = aVar.headingBreakHeight;
        this.headingBreakColor = aVar.headingBreakColor;
        this.headingTypeface = aVar.headingTypeface;
        this.headingTextSizeMultipliers = aVar.headingTextSizeMultipliers;
        this.thematicBreakColor = aVar.thematicBreakColor;
        this.thematicBreakHeight = aVar.thematicBreakHeight;
    }

    @NonNull
    public static a builder(@NonNull b bVar) {
        return new a(bVar);
    }

    @NonNull
    public static a builderWithDefaults(@NonNull Context context) {
        x5.b create = x5.b.create(context);
        return new a().codeBlockMargin(create.toPx(8)).blockMargin(create.toPx(24)).blockQuoteWidth(create.toPx(4)).bulletListItemStrokeWidth(create.toPx(1)).headingBreakHeight(create.toPx(1)).thematicBreakHeight(create.toPx(4));
    }

    @NonNull
    public static b create(@NonNull Context context) {
        return builderWithDefaults(context).build();
    }

    @NonNull
    public static a emptyBuilder() {
        return new a();
    }

    public void applyBlockQuoteStyle(@NonNull Paint paint) {
        int i8 = this.blockQuoteColor;
        if (i8 == 0) {
            i8 = x5.a.applyAlpha(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i8);
    }

    public void applyCodeBlockTextStyle(@NonNull Paint paint) {
        int i8 = this.codeBlockTextColor;
        if (i8 == 0) {
            i8 = this.codeTextColor;
        }
        if (i8 != 0) {
            paint.setColor(i8);
        }
        Typeface typeface = this.codeBlockTypeface;
        if (typeface == null) {
            typeface = this.codeTypeface;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i9 = this.codeBlockTextSize;
            if (i9 <= 0) {
                i9 = this.codeTextSize;
            }
            if (i9 > 0) {
                paint.setTextSize(i9);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i10 = this.codeBlockTextSize;
        if (i10 <= 0) {
            i10 = this.codeTextSize;
        }
        if (i10 > 0) {
            paint.setTextSize(i10);
        } else {
            paint.setTextSize(paint.getTextSize() * CODE_DEF_TEXT_SIZE_RATIO);
        }
    }

    public void applyCodeTextStyle(@NonNull Paint paint) {
        int i8 = this.codeTextColor;
        if (i8 != 0) {
            paint.setColor(i8);
        }
        Typeface typeface = this.codeTypeface;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i9 = this.codeTextSize;
            if (i9 > 0) {
                paint.setTextSize(i9);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i10 = this.codeTextSize;
        if (i10 > 0) {
            paint.setTextSize(i10);
        } else {
            paint.setTextSize(paint.getTextSize() * CODE_DEF_TEXT_SIZE_RATIO);
        }
    }

    public void applyHeadingBreakStyle(@NonNull Paint paint) {
        int i8 = this.headingBreakColor;
        if (i8 == 0) {
            i8 = x5.a.applyAlpha(paint.getColor(), 75);
        }
        paint.setColor(i8);
        paint.setStyle(Paint.Style.FILL);
        int i9 = this.headingBreakHeight;
        if (i9 >= 0) {
            paint.setStrokeWidth(i9);
        }
    }

    public void applyHeadingTextStyle(@NonNull Paint paint, @IntRange(from = 1, to = 6) int i8) {
        Typeface typeface = this.headingTypeface;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.headingTextSizeMultipliers;
        if (fArr == null) {
            fArr = HEADING_SIZES;
        }
        if (fArr == null || fArr.length < i8) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i8), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i8 - 1]);
    }

    public void applyLinkStyle(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.isLinkedUnderlined);
        int i8 = this.linkColor;
        if (i8 != 0) {
            textPaint.setColor(i8);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void applyListItemStyle(@NonNull Paint paint) {
        int i8 = this.listItemColor;
        if (i8 == 0) {
            i8 = paint.getColor();
        }
        paint.setColor(i8);
        int i9 = this.bulletListItemStrokeWidth;
        if (i9 != 0) {
            paint.setStrokeWidth(i9);
        }
    }

    public void applyThematicBreakStyle(@NonNull Paint paint) {
        int i8 = this.thematicBreakColor;
        if (i8 == 0) {
            i8 = x5.a.applyAlpha(paint.getColor(), 25);
        }
        paint.setColor(i8);
        paint.setStyle(Paint.Style.FILL);
        int i9 = this.thematicBreakHeight;
        if (i9 >= 0) {
            paint.setStrokeWidth(i9);
        }
    }

    public int getBlockMargin() {
        return this.blockMargin;
    }

    public int getBlockQuoteWidth() {
        int i8 = this.blockQuoteWidth;
        return i8 == 0 ? (int) ((this.blockMargin * 0.25f) + 0.5f) : i8;
    }

    public int getBulletWidth(int i8) {
        int min = Math.min(this.blockMargin, i8) / 2;
        int i9 = this.bulletWidth;
        return (i9 == 0 || i9 > min) ? min : i9;
    }

    public int getCodeBackgroundColor(@NonNull Paint paint) {
        int i8 = this.codeBackgroundColor;
        return i8 != 0 ? i8 : x5.a.applyAlpha(paint.getColor(), 25);
    }

    public int getCodeBlockBackgroundColor(@NonNull Paint paint) {
        int i8 = this.codeBlockBackgroundColor;
        if (i8 == 0) {
            i8 = this.codeBackgroundColor;
        }
        return i8 != 0 ? i8 : x5.a.applyAlpha(paint.getColor(), 25);
    }

    public int getCodeBlockMargin() {
        return this.codeBlockMargin;
    }

    public void applyLinkStyle(@NonNull Paint paint) {
        paint.setUnderlineText(this.isLinkedUnderlined);
        int i8 = this.linkColor;
        if (i8 != 0) {
            paint.setColor(i8);
        } else if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }
}
