package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class SpanUtils {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_TOP = 3;
    private static final int COLOR_DEFAULT = -16777217;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private int alignImage;
    private int alignLine;
    private Layout.Alignment alignment;
    private int backgroundColor;
    private float blurRadius;
    private int bulletColor;
    private int bulletGapWidth;
    private int bulletRadius;
    private ClickableSpan clickSpan;
    private int first;
    private int flag;
    private String fontFamily;
    private int fontSize;
    private int foregroundColor;
    private Bitmap imageBitmap;
    private Drawable imageDrawable;
    private int imageResourceId;
    private Uri imageUri;
    private boolean isBold;
    private boolean isBoldItalic;
    private boolean isCreated;
    private boolean isItalic;
    private boolean isStrikethrough;
    private boolean isSubscript;
    private boolean isSuperscript;
    private boolean isUnderline;
    private int lineHeight;
    private SerializableSpannableStringBuilder mBuilder;
    private CharSequence mText;
    private TextView mTextView;
    private int mType;
    private final int mTypeCharSequence;
    private final int mTypeImage;
    private final int mTypeSpace;
    private float proportion;
    private int quoteColor;
    private int quoteGapWidth;
    private int rest;
    private Shader shader;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private int spaceColor;
    private int spaceSize;
    private Object[] spans;
    private int stripeWidth;
    private BlurMaskFilter.Blur style;
    private Typeface typeface;
    private String url;
    private int verticalAlign;
    private float xProportion;

    @SuppressLint({"ParcelCreator"})
    static class CustomTypefaceSpan extends TypefaceSpan {
        private final Typeface newType;

        /* synthetic */ CustomTypefaceSpan(Typeface typeface, a aVar) {
            this(typeface);
        }

        private void apply(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        private CustomTypefaceSpan(Typeface typeface) {
            super("");
            this.newType = typeface;
        }
    }

    private static class SerializableSpannableStringBuilder extends SpannableStringBuilder implements Serializable {
        private static final long serialVersionUID = 4909567650765875771L;

        private SerializableSpannableStringBuilder() {
        }

        /* synthetic */ SerializableSpannableStringBuilder(a aVar) {
            this();
        }
    }

    class a extends ClickableSpan {
        final /* synthetic */ int val$color;
        final /* synthetic */ View.OnClickListener val$listener;
        final /* synthetic */ boolean val$underlineText;

        a(int i8, boolean z7, View.OnClickListener onClickListener) {
            this.val$color = i8;
            this.val$underlineText = z7;
            this.val$listener = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            View.OnClickListener onClickListener = this.val$listener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.val$color);
            textPaint.setUnderlineText(this.val$underlineText);
        }
    }

    static class b implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int radius;
        private Path sBulletPath;

        /* synthetic */ b(int i8, int i9, int i10, a aVar) {
            this(i8, i9, i10);
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i13) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.color);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.sBulletPath == null) {
                        Path path = new Path();
                        this.sBulletPath = path;
                        path.addCircle(0.0f, 0.0f, this.radius, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i8 + (i9 * this.radius), (i10 + i12) / 2.0f);
                    canvas.drawPath(this.sBulletPath, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i8 + (i9 * r10), (i10 + i12) / 2.0f, this.radius, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z7) {
            return (this.radius * 2) + this.gapWidth;
        }

        private b(int i8, int i9, int i10) {
            this.sBulletPath = null;
            this.color = i8;
            this.radius = i9;
            this.gapWidth = i10;
        }
    }

    static abstract class c extends ReplacementSpan {
        static final int ALIGN_BASELINE = 1;
        static final int ALIGN_BOTTOM = 0;
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private WeakReference<Drawable> mDrawableRef;
        final int mVerticalAlignment;

        /* synthetic */ c(int i8, a aVar) {
            this(i8);
        }

        private Drawable getCachedDrawable() {
            WeakReference<Drawable> weakReference = this.mDrawableRef;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = getDrawable();
            this.mDrawableRef = new WeakReference<>(drawable2);
            return drawable2;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, @NonNull Paint paint) {
            int height;
            float height2;
            Drawable cachedDrawable = getCachedDrawable();
            Rect bounds = cachedDrawable.getBounds();
            canvas.save();
            if (bounds.height() < i12 - i10) {
                int i13 = this.mVerticalAlignment;
                if (i13 == 3) {
                    height2 = i10;
                } else {
                    if (i13 == 2) {
                        height = ((i12 + i10) - bounds.height()) / 2;
                    } else if (i13 == 1) {
                        height2 = i11 - bounds.height();
                    } else {
                        height = i12 - bounds.height();
                    }
                    height2 = height;
                }
                canvas.translate(f8, height2);
            } else {
                canvas.translate(f8, i10);
            }
            cachedDrawable.draw(canvas);
            canvas.restore();
        }

        public abstract Drawable getDrawable();

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
            int i10;
            Rect bounds = getCachedDrawable().getBounds();
            if (fontMetricsInt != null && (i10 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i11 = this.mVerticalAlignment;
                if (i11 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else if (i11 == 2) {
                    int i12 = i10 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i12;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i12;
                } else {
                    int i13 = -bounds.height();
                    int i14 = fontMetricsInt.bottom;
                    fontMetricsInt.top = i13 + i14;
                    fontMetricsInt.bottom = i14;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }

        private c() {
            this.mVerticalAlignment = 0;
        }

        private c(int i8) {
            this.mVerticalAlignment = i8;
        }
    }

    static class d extends c {
        private Uri mContentUri;
        private Drawable mDrawable;
        private int mResourceId;

        /* synthetic */ d(int i8, int i9, a aVar) {
            this(i8, i9);
        }

        @Override // com.blankj.utilcode.util.SpanUtils.c
        public Drawable getDrawable() {
            Drawable drawable;
            Drawable drawable2 = this.mDrawable;
            if (drawable2 != null) {
                return drawable2;
            }
            BitmapDrawable bitmapDrawable = null;
            if (this.mContentUri != null) {
                try {
                    InputStream openInputStream = z0.getApp().getContentResolver().openInputStream(this.mContentUri);
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(z0.getApp().getResources(), BitmapFactory.decodeStream(openInputStream));
                    try {
                        bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        return bitmapDrawable2;
                    } catch (Exception e8) {
                        e = e8;
                        bitmapDrawable = bitmapDrawable2;
                        Log.e("sms", "Failed to loaded content " + this.mContentUri, e);
                        return bitmapDrawable;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } else {
                try {
                    drawable = ContextCompat.getDrawable(z0.getApp(), this.mResourceId);
                    try {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        return drawable;
                    } catch (Exception unused) {
                        Log.e("sms", "Unable to find resource: " + this.mResourceId);
                        return drawable;
                    }
                } catch (Exception unused2) {
                    drawable = null;
                }
            }
        }

        /* synthetic */ d(Bitmap bitmap, int i8, a aVar) {
            this(bitmap, i8);
        }

        /* synthetic */ d(Drawable drawable, int i8, a aVar) {
            this(drawable, i8);
        }

        /* synthetic */ d(Uri uri, int i8, a aVar) {
            this(uri, i8);
        }

        private d(Bitmap bitmap, int i8) {
            super(i8, null);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(z0.getApp().getResources(), bitmap);
            this.mDrawable = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private d(Drawable drawable, int i8) {
            super(i8, null);
            this.mDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private d(Uri uri, int i8) {
            super(i8, null);
            this.mContentUri = uri;
        }

        private d(@DrawableRes int i8, int i9) {
            super(i9, null);
            this.mResourceId = i8;
        }
    }

    static class e implements LineHeightSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        static Paint.FontMetricsInt sfm;
        private final int height;
        final int mVerticalAlignment;

        e(int i8, int i9) {
            this.height = i8;
            this.mVerticalAlignment = i9;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i8, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = sfm;
            if (fontMetricsInt2 == null) {
                Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
                sfm = fontMetricsInt3;
                fontMetricsInt3.top = fontMetricsInt.top;
                fontMetricsInt3.ascent = fontMetricsInt.ascent;
                fontMetricsInt3.descent = fontMetricsInt.descent;
                fontMetricsInt3.bottom = fontMetricsInt.bottom;
                fontMetricsInt3.leading = fontMetricsInt.leading;
            } else {
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
                fontMetricsInt.leading = fontMetricsInt2.leading;
            }
            int i12 = this.height;
            int i13 = fontMetricsInt.descent;
            int i14 = fontMetricsInt.ascent;
            int i15 = i12 - (((i11 + i13) - i14) - i10);
            if (i15 > 0) {
                int i16 = this.mVerticalAlignment;
                if (i16 == 3) {
                    fontMetricsInt.descent = i13 + i15;
                } else if (i16 == 2) {
                    int i17 = i15 / 2;
                    fontMetricsInt.descent = i13 + i17;
                    fontMetricsInt.ascent = i14 - i17;
                } else {
                    fontMetricsInt.ascent = i14 - i15;
                }
            }
            int i18 = fontMetricsInt.bottom;
            int i19 = fontMetricsInt.top;
            int i20 = i12 - (((i11 + i18) - i19) - i10);
            if (i20 > 0) {
                int i21 = this.mVerticalAlignment;
                if (i21 == 3) {
                    fontMetricsInt.bottom = i18 + i20;
                } else if (i21 == 2) {
                    int i22 = i20 / 2;
                    fontMetricsInt.bottom = i18 + i22;
                    fontMetricsInt.top = i19 - i22;
                } else {
                    fontMetricsInt.top = i19 - i20;
                }
            }
            if (i9 == ((Spanned) charSequence).getSpanEnd(this)) {
                sfm = null;
            }
        }
    }

    static class f implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int stripeWidth;

        /* synthetic */ f(int i8, int i9, int i10, a aVar) {
            this(i8, i9, i10);
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(i8, i10, i8 + (this.stripeWidth * i9), i12, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z7) {
            return this.stripeWidth + this.gapWidth;
        }

        private f(int i8, int i9, int i10) {
            this.color = i8;
            this.stripeWidth = i9;
            this.gapWidth = i10;
        }
    }

    static class g extends CharacterStyle implements UpdateAppearance {
        private Shader mShader;

        /* synthetic */ g(Shader shader, a aVar) {
            this(shader);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.mShader);
        }

        private g(Shader shader) {
            this.mShader = shader;
        }
    }

    static class h extends CharacterStyle implements UpdateAppearance {
        private float dx;
        private float dy;
        private float radius;
        private int shadowColor;

        /* synthetic */ h(float f8, float f9, float f10, int i8, a aVar) {
            this(f8, f9, f10, i8);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.radius, this.dx, this.dy, this.shadowColor);
        }

        private h(float f8, float f9, float f10, int i8) {
            this.radius = f8;
            this.dx = f9;
            this.dy = f10;
            this.shadowColor = i8;
        }
    }

    static class i extends ReplacementSpan {
        private final Paint paint;
        private final int width;

        /* synthetic */ i(int i8, int i9, a aVar) {
            this(i8, i9);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, float f8, int i10, int i11, int i12, @NonNull Paint paint) {
            canvas.drawRect(f8, i10, f8 + this.width, i12, this.paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }

        private i(int i8) {
            this(i8, 0);
        }

        private i(int i8, int i9) {
            Paint paint = new Paint();
            this.paint = paint;
            this.width = i8;
            paint.setColor(i9);
            paint.setStyle(Paint.Style.FILL);
        }
    }

    static class j extends ReplacementSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        final int mVerticalAlignment;

        j(int i8) {
            this.mVerticalAlignment = i8;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, @NonNull Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i8, i9);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f8, i11 - (((((fontMetricsInt.descent + i11) + i11) + fontMetricsInt.ascent) / 2) - ((i12 + i10) / 2)), paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i8, int i9, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence.subSequence(i8, i9).toString());
        }
    }

    private SpanUtils(TextView textView) {
        this();
        this.mTextView = textView;
    }

    private void apply(int i8) {
        applyLast();
        this.mType = i8;
    }

    private void applyLast() {
        if (this.isCreated) {
            return;
        }
        int i8 = this.mType;
        if (i8 == 0) {
            updateCharCharSequence();
        } else if (i8 == 1) {
            updateImage();
        } else if (i8 == 2) {
            updateSpace();
        }
        setDefault();
    }

    private void setDefault() {
        this.flag = 33;
        this.foregroundColor = COLOR_DEFAULT;
        this.backgroundColor = COLOR_DEFAULT;
        this.lineHeight = -1;
        this.quoteColor = COLOR_DEFAULT;
        this.first = -1;
        this.bulletColor = COLOR_DEFAULT;
        this.fontSize = -1;
        this.proportion = -1.0f;
        this.xProportion = -1.0f;
        this.isStrikethrough = false;
        this.isUnderline = false;
        this.isSuperscript = false;
        this.isSubscript = false;
        this.isBold = false;
        this.isItalic = false;
        this.isBoldItalic = false;
        this.fontFamily = null;
        this.typeface = null;
        this.alignment = null;
        this.verticalAlign = -1;
        this.clickSpan = null;
        this.url = null;
        this.blurRadius = -1.0f;
        this.shader = null;
        this.shadowRadius = -1.0f;
        this.spans = null;
        this.imageBitmap = null;
        this.imageDrawable = null;
        this.imageUri = null;
        this.imageResourceId = -1;
        this.spaceSize = -1;
    }

    private void setMovementMethodIfNeed() {
        TextView textView = this.mTextView;
        if (textView == null || textView.getMovementMethod() != null) {
            return;
        }
        this.mTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void updateCharCharSequence() {
        if (this.mText.length() == 0) {
            return;
        }
        int length = this.mBuilder.length();
        if (length == 0 && this.lineHeight != -1) {
            this.mBuilder.append((CharSequence) Character.toString((char) 2)).append((CharSequence) "\n").setSpan(new AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.mBuilder.append(this.mText);
        int length2 = this.mBuilder.length();
        if (this.verticalAlign != -1) {
            this.mBuilder.setSpan(new j(this.verticalAlign), length, length2, this.flag);
        }
        if (this.foregroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
        }
        if (this.backgroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
        }
        if (this.first != -1) {
            this.mBuilder.setSpan(new LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
        }
        int i8 = this.quoteColor;
        a aVar = null;
        if (i8 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new f(i8, this.stripeWidth, this.quoteGapWidth, aVar), length, length2, this.flag);
        }
        int i9 = this.bulletColor;
        if (i9 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new b(i9, this.bulletRadius, this.bulletGapWidth, aVar), length, length2, this.flag);
        }
        if (this.fontSize != -1) {
            this.mBuilder.setSpan(new AbsoluteSizeSpan(this.fontSize, false), length, length2, this.flag);
        }
        if (this.proportion != -1.0f) {
            this.mBuilder.setSpan(new RelativeSizeSpan(this.proportion), length, length2, this.flag);
        }
        if (this.xProportion != -1.0f) {
            this.mBuilder.setSpan(new ScaleXSpan(this.xProportion), length, length2, this.flag);
        }
        int i10 = this.lineHeight;
        if (i10 != -1) {
            this.mBuilder.setSpan(new e(i10, this.alignLine), length, length2, this.flag);
        }
        if (this.isStrikethrough) {
            this.mBuilder.setSpan(new StrikethroughSpan(), length, length2, this.flag);
        }
        if (this.isUnderline) {
            this.mBuilder.setSpan(new UnderlineSpan(), length, length2, this.flag);
        }
        if (this.isSuperscript) {
            this.mBuilder.setSpan(new SuperscriptSpan(), length, length2, this.flag);
        }
        if (this.isSubscript) {
            this.mBuilder.setSpan(new SubscriptSpan(), length, length2, this.flag);
        }
        if (this.isBold) {
            this.mBuilder.setSpan(new StyleSpan(1), length, length2, this.flag);
        }
        if (this.isItalic) {
            this.mBuilder.setSpan(new StyleSpan(2), length, length2, this.flag);
        }
        if (this.isBoldItalic) {
            this.mBuilder.setSpan(new StyleSpan(3), length, length2, this.flag);
        }
        if (this.fontFamily != null) {
            this.mBuilder.setSpan(new TypefaceSpan(this.fontFamily), length, length2, this.flag);
        }
        if (this.typeface != null) {
            this.mBuilder.setSpan(new CustomTypefaceSpan(this.typeface, aVar), length, length2, this.flag);
        }
        if (this.alignment != null) {
            this.mBuilder.setSpan(new AlignmentSpan.Standard(this.alignment), length, length2, this.flag);
        }
        ClickableSpan clickableSpan = this.clickSpan;
        if (clickableSpan != null) {
            this.mBuilder.setSpan(clickableSpan, length, length2, this.flag);
        }
        if (this.url != null) {
            this.mBuilder.setSpan(new URLSpan(this.url), length, length2, this.flag);
        }
        if (this.blurRadius != -1.0f) {
            this.mBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.blurRadius, this.style)), length, length2, this.flag);
        }
        if (this.shader != null) {
            this.mBuilder.setSpan(new g(this.shader, aVar), length, length2, this.flag);
        }
        if (this.shadowRadius != -1.0f) {
            this.mBuilder.setSpan(new h(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor, null), length, length2, this.flag);
        }
        Object[] objArr = this.spans;
        if (objArr != null) {
            for (Object obj : objArr) {
                this.mBuilder.setSpan(obj, length, length2, this.flag);
            }
        }
    }

    private void updateImage() {
        int length = this.mBuilder.length();
        this.mText = "<img>";
        updateCharCharSequence();
        int length2 = this.mBuilder.length();
        a aVar = null;
        if (this.imageBitmap != null) {
            this.mBuilder.setSpan(new d(this.imageBitmap, this.alignImage, aVar), length, length2, this.flag);
            return;
        }
        if (this.imageDrawable != null) {
            this.mBuilder.setSpan(new d(this.imageDrawable, this.alignImage, aVar), length, length2, this.flag);
        } else if (this.imageUri != null) {
            this.mBuilder.setSpan(new d(this.imageUri, this.alignImage, aVar), length, length2, this.flag);
        } else if (this.imageResourceId != -1) {
            this.mBuilder.setSpan(new d(this.imageResourceId, this.alignImage, aVar), length, length2, this.flag);
        }
    }

    private void updateSpace() {
        int length = this.mBuilder.length();
        this.mText = "< >";
        updateCharCharSequence();
        this.mBuilder.setSpan(new i(this.spaceSize, this.spaceColor, null), length, this.mBuilder.length(), this.flag);
    }

    public static SpanUtils with(TextView textView) {
        return new SpanUtils(textView);
    }

    public SpanUtils append(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = charSequence;
        return this;
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap) {
        return appendImage(bitmap, 0);
    }

    public SpanUtils appendLine() {
        apply(0);
        this.mText = LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i8) {
        return appendSpace(i8, 0);
    }

    public SpannableStringBuilder create() {
        applyLast();
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(this.mBuilder);
        }
        this.isCreated = true;
        return this.mBuilder;
    }

    public SpannableStringBuilder get() {
        return this.mBuilder;
    }

    public SpanUtils setBackgroundColor(@ColorInt int i8) {
        this.backgroundColor = i8;
        return this;
    }

    public SpanUtils setBlur(@FloatRange(from = 0.0d, fromInclusive = false) float f8, BlurMaskFilter.Blur blur) {
        this.blurRadius = f8;
        this.style = blur;
        return this;
    }

    public SpanUtils setBold() {
        this.isBold = true;
        return this;
    }

    public SpanUtils setBoldItalic() {
        this.isBoldItalic = true;
        return this;
    }

    public SpanUtils setBullet(@ColorInt int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10) {
        this.bulletColor = i8;
        this.bulletRadius = i9;
        this.bulletGapWidth = i10;
        return this;
    }

    public SpanUtils setClickSpan(@NonNull ClickableSpan clickableSpan) {
        setMovementMethodIfNeed();
        this.clickSpan = clickableSpan;
        return this;
    }

    public SpanUtils setFlag(int i8) {
        this.flag = i8;
        return this;
    }

    public SpanUtils setFontFamily(@NonNull String str) {
        this.fontFamily = str;
        return this;
    }

    public SpanUtils setFontProportion(float f8) {
        this.proportion = f8;
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i8) {
        return setFontSize(i8, false);
    }

    public SpanUtils setFontXProportion(float f8) {
        this.xProportion = f8;
        return this;
    }

    public SpanUtils setForegroundColor(@ColorInt int i8) {
        this.foregroundColor = i8;
        return this;
    }

    public SpanUtils setHorizontalAlign(@NonNull Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public SpanUtils setItalic() {
        this.isItalic = true;
        return this;
    }

    public SpanUtils setLeadingMargin(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        this.first = i8;
        this.rest = i9;
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i8, int i9) {
        this.lineHeight = i8;
        this.alignLine = i9;
        return this;
    }

    public SpanUtils setQuoteColor(@ColorInt int i8, @IntRange(from = 1) int i9, @IntRange(from = 0) int i10) {
        this.quoteColor = i8;
        this.stripeWidth = i9;
        this.quoteGapWidth = i10;
        return this;
    }

    public SpanUtils setShader(@NonNull Shader shader) {
        this.shader = shader;
        return this;
    }

    public SpanUtils setShadow(@FloatRange(from = 0.0d, fromInclusive = false) float f8, float f9, float f10, int i8) {
        this.shadowRadius = f8;
        this.shadowDx = f9;
        this.shadowDy = f10;
        this.shadowColor = i8;
        return this;
    }

    public SpanUtils setSpans(@NonNull Object... objArr) {
        if (objArr.length > 0) {
            this.spans = objArr;
        }
        return this;
    }

    public SpanUtils setStrikethrough() {
        this.isStrikethrough = true;
        return this;
    }

    public SpanUtils setSubscript() {
        this.isSubscript = true;
        return this;
    }

    public SpanUtils setSuperscript() {
        this.isSuperscript = true;
        return this;
    }

    public SpanUtils setTypeface(@NonNull Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public SpanUtils setUnderline() {
        this.isUnderline = true;
        return this;
    }

    public SpanUtils setUrl(@NonNull String str) {
        setMovementMethodIfNeed();
        this.url = str;
        return this;
    }

    public SpanUtils setVerticalAlign(int i8) {
        this.verticalAlign = i8;
        return this;
    }

    public SpanUtils() {
        this.mTypeCharSequence = 0;
        this.mTypeImage = 1;
        this.mTypeSpace = 2;
        this.mBuilder = new SerializableSpannableStringBuilder(null);
        this.mText = "";
        this.mType = -1;
        setDefault();
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap, int i8) {
        apply(1);
        this.imageBitmap = bitmap;
        this.alignImage = i8;
        return this;
    }

    public SpanUtils appendLine(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = ((Object) charSequence) + LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i8, @ColorInt int i9) {
        apply(2);
        this.spaceSize = i8;
        this.spaceColor = i9;
        return this;
    }

    public SpanUtils setBullet(@IntRange(from = 0) int i8) {
        return setBullet(0, 3, i8);
    }

    public SpanUtils setClickSpan(@ColorInt int i8, boolean z7, View.OnClickListener onClickListener) {
        setMovementMethodIfNeed();
        this.clickSpan = new a(i8, z7, onClickListener);
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i8, boolean z7) {
        if (z7) {
            this.fontSize = (int) ((i8 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
        } else {
            this.fontSize = i8;
        }
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i8) {
        return setLineHeight(i8, 2);
    }

    public SpanUtils setQuoteColor(@ColorInt int i8) {
        return setQuoteColor(i8, 2, 2);
    }

    public SpanUtils appendImage(@NonNull Drawable drawable) {
        return appendImage(drawable, 0);
    }

    public SpanUtils appendImage(@NonNull Drawable drawable, int i8) {
        apply(1);
        this.imageDrawable = drawable;
        this.alignImage = i8;
        return this;
    }

    public SpanUtils appendImage(@NonNull Uri uri) {
        return appendImage(uri, 0);
    }

    public SpanUtils appendImage(@NonNull Uri uri, int i8) {
        apply(1);
        this.imageUri = uri;
        this.alignImage = i8;
        return this;
    }

    public SpanUtils appendImage(@DrawableRes int i8) {
        return appendImage(i8, 0);
    }

    public SpanUtils appendImage(@DrawableRes int i8, int i9) {
        apply(1);
        this.imageResourceId = i8;
        this.alignImage = i9;
        return this;
    }
}
