package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivViewGroup extends ViewGroup {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private int gravity;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getChildMeasureSpec(int i4, int i5, int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4) - i5;
            int i9 = 0;
            int max = Math.max(0, size);
            if (mode == Integer.MIN_VALUE) {
                if (i6 < 0 || i6 > Integer.MAX_VALUE) {
                    if (i6 == -1) {
                        i6 = max;
                    } else if (i6 != -2) {
                        if (i6 == -3) {
                            i6 = Math.min(Math.max(max, i7), i8);
                        }
                        i6 = 0;
                    }
                    i9 = Integer.MIN_VALUE;
                }
                i9 = 1073741824;
            } else if (mode != 0) {
                if (mode == 1073741824) {
                    if (i6 < 0 || i6 > Integer.MAX_VALUE) {
                        if (i6 == -1) {
                            i6 = max;
                        } else if (i6 != -2) {
                            if (i6 == -3) {
                                i6 = Math.min(Math.max(max, i7), i8);
                                i9 = Integer.MIN_VALUE;
                            }
                        }
                    }
                    i9 = 1073741824;
                }
                i6 = 0;
            } else {
                if (i6 < 0 || i6 > Integer.MAX_VALUE) {
                    if (i6 != -1) {
                        if (i6 == -2 || i6 == -3) {
                        }
                        i6 = 0;
                    }
                    i6 = max;
                }
                i9 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i6, i9);
        }

        public final float getSpaceAroundPart$div_release(float f4, int i4) {
            return f4 / (i4 * 2);
        }

        public final float getSpaceBetweenPart$div_release(float f4, int i4) {
            if (i4 == 1) {
                return 0.0f;
            }
            return f4 / (i4 - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float f4, int i4) {
            return f4 / (i4 + 1);
        }

        @SuppressLint({"WrongConstant"})
        public final int toHorizontalGravity(int i4) {
            return i4 & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        public final int toVerticalGravity(int i4) {
            return i4 & 1879048304;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new DivLayoutParams(getContext(), attributeSet);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalGravity$div_release() {
        return Companion.toHorizontalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalGravity$div_release() {
        return Companion.toVerticalGravity(this.gravity);
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@NotNull View child, int i4, int i5) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = Companion;
        child.measure(companion.getChildMeasureSpec(i4, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i5, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(@NotNull View child, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = Companion;
        child.measure(companion.getChildMeasureSpec(i4, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release() + i5, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i6, getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release() + i7, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final void setGravity(int i4) {
        if (this.gravity == i4) {
            return;
        }
        Companion companion = Companion;
        if (companion.toHorizontalGravity(i4) == 0) {
            i4 |= 8388611;
        }
        if (companion.toVerticalGravity(i4) == 0) {
            i4 |= 48;
        }
        this.gravity = i4;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gravity = 8388659;
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivLayoutParams(layoutParams);
    }

    @Metadata
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f4, float f5, int i4) {
            this.firstChildOffset = f4;
            this.spaceBetweenChildren = f5;
            this.edgeDividerOffset = i4;
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void update(float f4, int i4, int i5) {
            this.firstChildOffset = 0.0f;
            this.spaceBetweenChildren = 0.0f;
            this.edgeDividerOffset = 0;
            switch (i4) {
                case 1:
                case 16:
                    this.firstChildOffset = f4 / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.firstChildOffset = f4;
                    return;
                case 16777216:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.Companion.getSpaceAroundPart$div_release(f4, i5);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f5 = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f5;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f5);
                    return;
                case 33554432:
                case 536870912:
                    this.spaceBetweenChildren = DivViewGroup.Companion.getSpaceBetweenPart$div_release(f4, i5);
                    return;
                case 67108864:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.Companion.getSpaceEvenlyPart$div_release(f4, i5);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + i4);
            }
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f4, float f5, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0.0f : f4, (i5 & 2) != 0 ? 0.0f : f5, (i5 & 4) != 0 ? 0 : i4);
        }
    }
}
