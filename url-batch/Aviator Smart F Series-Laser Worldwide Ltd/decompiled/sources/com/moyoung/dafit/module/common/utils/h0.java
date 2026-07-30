package com.moyoung.dafit.module.common.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class h0 {

    public static class b {
        private Layout.Alignment align;

        @ColorInt
        private int backgroundColor;
        private Bitmap bitmap;
        private int bulletColor;
        private ClickableSpan clickSpan;
        private int defaultValue;
        private Drawable drawable;
        private int first;
        private int flag;
        private String fontFamily;

        @ColorInt
        private int foregroundColor;
        private int gapWidth;
        private boolean imageIsBitmap;
        private boolean imageIsDrawable;
        private boolean imageIsResourceId;
        private boolean imageIsUri;
        private boolean isBlur;
        private boolean isBold;
        private boolean isBoldItalic;
        private boolean isBullet;
        private boolean isItalic;
        private boolean isLeadingMargin;
        private boolean isStrikethrough;
        private boolean isSubscript;
        private boolean isSuperscript;
        private boolean isUnderline;
        private SpannableStringBuilder mBuilder;
        private float proportion;

        @ColorInt
        private int quoteColor;
        private float radius;

        @DrawableRes
        private int resourceId;
        private int rest;
        private BlurMaskFilter.Blur style;
        private CharSequence text;
        private Uri uri;
        private String url;
        private float xProportion;

        private void setSpan() {
            int length = this.mBuilder.length();
            this.mBuilder.append(this.text);
            int length2 = this.mBuilder.length();
            if (this.foregroundColor != this.defaultValue) {
                this.mBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
                this.foregroundColor = this.defaultValue;
            }
            if (this.backgroundColor != this.defaultValue) {
                this.mBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
                this.backgroundColor = this.defaultValue;
            }
            if (this.isLeadingMargin) {
                this.mBuilder.setSpan(new LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
                this.isLeadingMargin = false;
            }
            if (this.quoteColor != this.defaultValue) {
                this.mBuilder.setSpan(new QuoteSpan(this.quoteColor), length, length2, 0);
                this.quoteColor = this.defaultValue;
            }
            if (this.isBullet) {
                this.mBuilder.setSpan(new BulletSpan(this.gapWidth, this.bulletColor), length, length2, 0);
                this.isBullet = false;
            }
            if (this.proportion != -1.0f) {
                this.mBuilder.setSpan(new RelativeSizeSpan(this.proportion), length, length2, this.flag);
                this.proportion = -1.0f;
            }
            if (this.xProportion != -1.0f) {
                this.mBuilder.setSpan(new ScaleXSpan(this.xProportion), length, length2, this.flag);
                this.xProportion = -1.0f;
            }
            if (this.isStrikethrough) {
                this.mBuilder.setSpan(new StrikethroughSpan(), length, length2, this.flag);
                this.isStrikethrough = false;
            }
            if (this.isUnderline) {
                this.mBuilder.setSpan(new UnderlineSpan(), length, length2, this.flag);
                this.isUnderline = false;
            }
            if (this.isSuperscript) {
                this.mBuilder.setSpan(new SuperscriptSpan(), length, length2, this.flag);
                this.isSuperscript = false;
            }
            if (this.isSubscript) {
                this.mBuilder.setSpan(new SubscriptSpan(), length, length2, this.flag);
                this.isSubscript = false;
            }
            if (this.isBold) {
                this.mBuilder.setSpan(new StyleSpan(1), length, length2, this.flag);
                this.isBold = false;
            }
            if (this.isItalic) {
                this.mBuilder.setSpan(new StyleSpan(2), length, length2, this.flag);
                this.isItalic = false;
            }
            if (this.isBoldItalic) {
                this.mBuilder.setSpan(new StyleSpan(3), length, length2, this.flag);
                this.isBoldItalic = false;
            }
            if (this.fontFamily != null) {
                this.mBuilder.setSpan(new TypefaceSpan(this.fontFamily), length, length2, this.flag);
                this.fontFamily = null;
            }
            if (this.align != null) {
                this.mBuilder.setSpan(new AlignmentSpan.Standard(this.align), length, length2, this.flag);
                this.align = null;
            }
            boolean z7 = this.imageIsBitmap;
            if (z7 || this.imageIsDrawable || this.imageIsUri || this.imageIsResourceId) {
                if (z7) {
                    this.mBuilder.setSpan(new ImageSpan(d.get(), this.bitmap), length, length2, this.flag);
                    this.bitmap = null;
                    this.imageIsBitmap = false;
                } else if (this.imageIsDrawable) {
                    this.mBuilder.setSpan(new ImageSpan(this.drawable), length, length2, this.flag);
                    this.drawable = null;
                    this.imageIsDrawable = false;
                } else if (this.imageIsUri) {
                    this.mBuilder.setSpan(new ImageSpan(d.get(), this.uri), length, length2, this.flag);
                    this.uri = null;
                    this.imageIsUri = false;
                } else {
                    this.mBuilder.setSpan(new ImageSpan(d.get(), this.resourceId), length, length2, this.flag);
                    this.resourceId = 0;
                    this.imageIsResourceId = false;
                }
            }
            ClickableSpan clickableSpan = this.clickSpan;
            if (clickableSpan != null) {
                this.mBuilder.setSpan(clickableSpan, length, length2, this.flag);
                this.clickSpan = null;
            }
            if (this.url != null) {
                this.mBuilder.setSpan(new URLSpan(this.url), length, length2, this.flag);
                this.url = null;
            }
            if (this.isBlur) {
                this.mBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.radius, this.style)), length, length2, this.flag);
                this.isBlur = false;
            }
            this.flag = 33;
        }

        public b append(@NonNull CharSequence charSequence) {
            setSpan();
            this.text = charSequence;
            return this;
        }

        public SpannableStringBuilder create() {
            setSpan();
            return this.mBuilder;
        }

        public b setAlign(@Nullable Layout.Alignment alignment) {
            this.align = alignment;
            return this;
        }

        public b setBackgroundColor(@ColorInt int i8) {
            this.backgroundColor = i8;
            return this;
        }

        public b setBitmap(@NonNull Bitmap bitmap) {
            this.bitmap = bitmap;
            this.imageIsBitmap = true;
            return this;
        }

        public b setBlur(float f8, BlurMaskFilter.Blur blur) {
            this.radius = f8;
            this.style = blur;
            this.isBlur = true;
            return this;
        }

        public b setBold() {
            this.isBold = true;
            return this;
        }

        public b setBoldItalic() {
            this.isBoldItalic = true;
            return this;
        }

        public b setBullet(int i8, int i9) {
            this.gapWidth = i8;
            this.bulletColor = i9;
            this.isBullet = true;
            return this;
        }

        public b setClickSpan(@NonNull ClickableSpan clickableSpan) {
            this.clickSpan = clickableSpan;
            return this;
        }

        public b setDrawable(@NonNull Drawable drawable) {
            this.drawable = drawable;
            this.imageIsDrawable = true;
            return this;
        }

        public b setFlag(int i8) {
            this.flag = i8;
            return this;
        }

        public b setFontFamily(@Nullable String str) {
            this.fontFamily = str;
            return this;
        }

        public b setForegroundColor(@ColorInt int i8) {
            this.foregroundColor = i8;
            return this;
        }

        public b setItalic() {
            this.isItalic = true;
            return this;
        }

        public b setLeadingMargin(int i8, int i9) {
            this.first = i8;
            this.rest = i9;
            this.isLeadingMargin = true;
            return this;
        }

        public b setProportion(float f8) {
            this.proportion = f8;
            return this;
        }

        public b setQuoteColor(@ColorInt int i8) {
            this.quoteColor = i8;
            return this;
        }

        public b setResourceId(@DrawableRes int i8) {
            this.resourceId = i8;
            this.imageIsResourceId = true;
            return this;
        }

        public b setStrikethrough() {
            this.isStrikethrough = true;
            return this;
        }

        public b setSubscript() {
            this.isSubscript = true;
            return this;
        }

        public b setSuperscript() {
            this.isSuperscript = true;
            return this;
        }

        public b setUnderline() {
            this.isUnderline = true;
            return this;
        }

        public b setUri(@NonNull Uri uri) {
            this.uri = uri;
            this.imageIsUri = true;
            return this;
        }

        public b setUrl(@NonNull String str) {
            this.url = str;
            return this;
        }

        public b setXProportion(float f8) {
            this.xProportion = f8;
            return this;
        }

        private b(@NonNull CharSequence charSequence) {
            this.defaultValue = 301989888;
            this.text = charSequence;
            this.flag = 33;
            this.foregroundColor = 301989888;
            this.backgroundColor = 301989888;
            this.quoteColor = 301989888;
            this.proportion = -1.0f;
            this.xProportion = -1.0f;
            this.mBuilder = new SpannableStringBuilder();
        }
    }

    private h0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static b getBuilder(@NonNull CharSequence charSequence) {
        return new b(charSequence);
    }
}
