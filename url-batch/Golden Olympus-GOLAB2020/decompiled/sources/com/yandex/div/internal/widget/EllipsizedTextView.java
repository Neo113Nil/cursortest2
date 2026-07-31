package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.div.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class EllipsizedTextView extends SuperLineHeightTextView {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean autoEllipsize;

    @NotNull
    private final AutoEllipsizeHelper autoEllipsizeHelper;
    private float cachedEllipsisWidth;

    @Nullable
    private CharSequence displayText;

    @NotNull
    private CharSequence ellipsis;

    @Nullable
    private TextUtils.TruncateAt ellipsisLocation;

    @Nullable
    private CharSequence ellipsizedText;
    private boolean isEllipsizeRequested;
    private boolean isInternalTextChange;
    private boolean isRemeasureNeeded;
    private int lastMeasuredHeight;
    private int lastMeasuredWidth;

    @Nullable
    private CharSequence originalText;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EllipsizedTextView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    private final int calculateFittedSymbols(CharSequence charSequence, CharSequence charSequence2) {
        int availableWidth;
        if (charSequence.length() == 0 || getMaxLines() == 0 || (availableWidth = availableWidth()) <= 0) {
            return 0;
        }
        Layout layoutTextWithHyphenation = TextViewsKt.isHyphenationEnabled(this) ? layoutTextWithHyphenation(charSequence, availableWidth) : layoutText(charSequence, availableWidth);
        int lineCount = layoutTextWithHyphenation.getLineCount();
        float lineWidth = layoutTextWithHyphenation.getLineWidth(lineCount - 1);
        if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= availableWidth)) {
            this.isRemeasureNeeded = true;
            return charSequence.length();
        }
        if (this.cachedEllipsisWidth == -1.0f) {
            this.cachedEllipsisWidth = layoutText$default(this, charSequence2, 0, 2, null).getLineWidth(0);
        }
        this.isRemeasureNeeded = true;
        float f4 = availableWidth - this.cachedEllipsisWidth;
        int offsetForHorizontal = layoutTextWithHyphenation.getOffsetForHorizontal(getMaxLines() - 1, f4);
        while (layoutTextWithHyphenation.getPrimaryHorizontal(offsetForHorizontal) > f4 && offsetForHorizontal > 0) {
            offsetForHorizontal--;
        }
        return (offsetForHorizontal <= 0 || !Character.isHighSurrogate(charSequence.charAt(offsetForHorizontal + (-1)))) ? offsetForHorizontal : offsetForHorizontal - 1;
    }

    private final CharSequence ellipsize(CharSequence charSequence) {
        CharSequence charSequence2;
        int calculateFittedSymbols;
        if (charSequence == null || charSequence.length() == 0 || (calculateFittedSymbols = calculateFittedSymbols(charSequence, (charSequence2 = this.ellipsis))) <= 0) {
            return null;
        }
        if (calculateFittedSymbols == charSequence.length()) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, calculateFittedSymbols);
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }

    private final void ellipsizeIfNeeded() {
        CharSequence charSequence = this.ellipsizedText;
        boolean z4 = noMaxLines() || Intrinsics.areEqual(this.ellipsis, "…");
        if (this.ellipsizedText != null || !z4) {
            if (z4) {
                CharSequence charSequence2 = this.originalText;
                if (charSequence2 != null) {
                    this.isRemeasureNeeded = !Intrinsics.areEqual(charSequence2, charSequence);
                } else {
                    charSequence2 = null;
                }
                setEllipsizedText(charSequence2);
            } else {
                setEllipsizedText(ellipsize(this.originalText));
            }
        }
        this.isEllipsizeRequested = false;
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    private final void invalidateEllipsis() {
        this.cachedEllipsisWidth = -1.0f;
        this.isRemeasureNeeded = false;
    }

    private final Layout layoutText(CharSequence charSequence, int i4) {
        return new StaticLayout(charSequence, getPaint(), i4, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    static /* synthetic */ Layout layoutText$default(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layoutText");
        }
        if ((i5 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return ellipsizedTextView.layoutText(charSequence, i4);
    }

    private final Layout layoutTextWithHyphenation(CharSequence charSequence, int i4) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i4);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(text, 0, text.length, paint, textWidth)");
        StaticLayout build = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder\n            .set…ncy)\n            .build()");
        return build;
    }

    private final boolean noMaxLines() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    private final void onEllipsisChanged(CharSequence charSequence) {
        if (noMaxLines()) {
            super.setEllipsize(null);
        } else if (Intrinsics.areEqual(charSequence, "…")) {
            super.setEllipsize(this.ellipsisLocation);
        } else {
            super.setEllipsize(null);
            requestEllipsize();
            invalidateEllipsis();
        }
        requestLayout();
    }

    private final void requestEllipsize() {
        this.isEllipsizeRequested = true;
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence charSequence) {
        this.isInternalTextChange = true;
        super.setText(charSequence);
        this.isInternalTextChange = false;
    }

    private final void sizeChangeInternal(int i4, int i5, int i6, int i7) {
        if (i4 == i6 && i5 == i7) {
            return;
        }
        requestEllipsize();
    }

    protected final int availableWidth() {
        return (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    @Nullable
    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    @NotNull
    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    @Nullable
    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.ellipsisLocation;
    }

    @Nullable
    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    protected final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @NotNull
    public CharSequence getText() {
        CharSequence charSequence = this.originalText;
        return charSequence == null ? "" : charSequence;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.autoEllipsizeHelper.onViewAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.autoEllipsizeHelper.onViewDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        sizeChangeInternal(getMeasuredWidth(), getMeasuredHeight(), this.lastMeasuredWidth, this.lastMeasuredHeight);
        if (this.isEllipsizeRequested) {
            ellipsizeIfNeeded();
            CharSequence charSequence = this.ellipsizedText;
            if (charSequence != null) {
                if (!this.isRemeasureNeeded) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    super.onMeasure(i4, i5);
                }
            }
        }
        this.lastMeasuredWidth = getMeasuredWidth();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        sizeChangeInternal(i4, i5, i6, i7);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    protected void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        if (this.isInternalTextChange) {
            return;
        }
        this.originalText = charSequence;
        requestLayout();
        requestEllipsize();
    }

    public final void setAutoEllipsize(boolean z4) {
        this.autoEllipsize = z4;
        this.autoEllipsizeHelper.setEnabled(z4);
    }

    public final void setEllipsis(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        onEllipsisChanged(value);
        this.ellipsis = value;
    }

    public final void setEllipsisLocation(@Nullable TextUtils.TruncateAt truncateAt) {
        this.ellipsisLocation = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        onEllipsisChanged(this.ellipsis);
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
    }

    protected final void setInternalTextChange(boolean z4) {
        this.isInternalTextChange = z4;
    }

    protected final void setLastMeasuredHeight(int i4) {
        this.lastMeasuredHeight = i4;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 == getMaxLines()) {
            return;
        }
        super.setMaxLines(i4);
        onEllipsisChanged(this.ellipsis);
        requestEllipsize();
        invalidateEllipsis();
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        this.displayText = charSequence;
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = "…";
        this.ellipsis = "…";
        this.ellipsisLocation = TextUtils.TruncateAt.END;
        this.lastMeasuredWidth = -1;
        this.lastMeasuredHeight = -1;
        this.cachedEllipsisWidth = -1.0f;
        this.autoEllipsizeHelper = new AutoEllipsizeHelper(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EllipsizedTextView, i4, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…extView, defStyleAttr, 0)");
            try {
                CharSequence text = obtainStyledAttributes.getText(R$styleable.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        onEllipsisChanged(this.ellipsis);
    }
}
