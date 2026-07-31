package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yandex.div.internal.util.PositiveNumberDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {
    static final /* synthetic */ h[] $$delegatedProperties = {H.d(new v(DivLayoutParams.class, "columnSpan", "getColumnSpan()I", 0)), H.d(new v(DivLayoutParams.class, "rowSpan", "getRowSpan()I", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final PositiveNumberDelegate columnSpan$delegate;
    private int gravity;
    private float horizontalWeight;
    private boolean isBaselineAligned;
    private int maxHeight;
    private int maxWidth;

    @NotNull
    private final PositiveNumberDelegate rowSpan$delegate;
    private float verticalWeight;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DivLayoutParams.class != obj.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) obj;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.gravity == divLayoutParams.gravity && this.isBaselineAligned == divLayoutParams.isBaselineAligned && getColumnSpan() == divLayoutParams.getColumnSpan() && getRowSpan() == divLayoutParams.getRowSpan() && this.verticalWeight == divLayoutParams.verticalWeight && this.horizontalWeight == divLayoutParams.horizontalWeight && this.maxHeight == divLayoutParams.maxHeight && this.maxWidth == divLayoutParams.maxWidth;
    }

    public final int getColumnSpan() {
        return this.columnSpan$delegate.getValue(this, $$delegatedProperties[0]).intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final float getHorizontalWeight() {
        return this.horizontalWeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getRowSpan() {
        return this.rowSpan$delegate.getValue(this, $$delegatedProperties[1]).intValue();
    }

    public final int getVerticalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final float getVerticalWeight() {
        return this.verticalWeight;
    }

    public int hashCode() {
        int hashCode = ((((((((((((super.hashCode() * 31) + this.gravity) * 31) + (this.isBaselineAligned ? 1 : 0)) * 31) + getColumnSpan()) * 31) + getRowSpan()) * 31) + Float.floatToIntBits(this.verticalWeight)) * 31) + Float.floatToIntBits(this.horizontalWeight)) * 31;
        int i4 = this.maxHeight;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        int i5 = (hashCode + i4) * 31;
        int i6 = this.maxWidth;
        return i5 + (i6 != Integer.MAX_VALUE ? i6 : 0);
    }

    public final boolean isBaselineAligned() {
        return this.isBaselineAligned;
    }

    public final void setBaselineAligned(boolean z4) {
        this.isBaselineAligned = z4;
    }

    public final void setColumnSpan(int i4) {
        this.columnSpan$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i4));
    }

    public final void setGravity(int i4) {
        this.gravity = i4;
    }

    public final void setHorizontalWeight(float f4) {
        this.horizontalWeight = f4;
    }

    public final void setMaxHeight(int i4) {
        this.maxHeight = i4;
    }

    public final void setMaxWidth(int i4) {
        this.maxWidth = i4;
    }

    public final void setRowSpan(int i4) {
        this.rowSpan$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i4));
    }

    public final void setVerticalWeight(float f4) {
        this.verticalWeight = f4;
    }

    public DivLayoutParams(int i4, int i5) {
        super(i4, i5);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLayoutParams(@NotNull DivLayoutParams source) {
        super((ViewGroup.MarginLayoutParams) source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
        this.gravity = source.gravity;
        this.isBaselineAligned = source.isBaselineAligned;
        this.verticalWeight = source.verticalWeight;
        this.horizontalWeight = source.horizontalWeight;
        setColumnSpan(source.getColumnSpan());
        setRowSpan(source.getRowSpan());
        this.maxHeight = source.maxHeight;
        this.maxWidth = source.maxWidth;
    }
}
