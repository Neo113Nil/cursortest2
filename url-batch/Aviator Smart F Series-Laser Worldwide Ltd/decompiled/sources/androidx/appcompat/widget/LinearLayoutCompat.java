package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<LinearLayoutCompat> {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped = false;
        private int mShowDividersId;
        private int mWeightSumId;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            int mapBoolean;
            int mapInt;
            int mapGravity;
            int mapIntEnum;
            int mapFloat;
            int mapObject;
            int mapInt2;
            int mapBoolean2;
            int mapIntFlag;
            mapBoolean = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.mBaselineAlignedId = mapBoolean;
            mapInt = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.mBaselineAlignedChildIndexId = mapInt;
            mapGravity = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.mGravityId = mapGravity;
            mapIntEnum = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new IntFunction<String>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                public String apply(int i8) {
                    return i8 != 0 ? i8 != 1 ? String.valueOf(i8) : "vertical" : "horizontal";
                }
            });
            this.mOrientationId = mapIntEnum;
            mapFloat = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.mWeightSumId = mapFloat;
            mapObject = propertyMapper.mapObject("divider", androidx.appcompat.R.attr.divider);
            this.mDividerId = mapObject;
            mapInt2 = propertyMapper.mapInt("dividerPadding", androidx.appcompat.R.attr.dividerPadding);
            this.mDividerPaddingId = mapInt2;
            mapBoolean2 = propertyMapper.mapBoolean("measureWithLargestChild", androidx.appcompat.R.attr.measureWithLargestChild);
            this.mMeasureWithLargestChildId = mapBoolean2;
            mapIntFlag = propertyMapper.mapIntFlag("showDividers", androidx.appcompat.R.attr.showDividers, new IntFunction<Set<String>>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                public Set<String> apply(int i8) {
                    HashSet hashSet = new HashSet();
                    if (i8 == 0) {
                        hashSet.add("none");
                    }
                    if (i8 == 1) {
                        hashSet.add("beginning");
                    }
                    if (i8 == 2) {
                        hashSet.add("middle");
                    }
                    if (i8 == 4) {
                        hashSet.add("end");
                    }
                    return hashSet;
                }
            });
            this.mShowDividersId = mapIntFlag;
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw e.a();
            }
            propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.mDividerId, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
        }

        public LayoutParams(int i8, int i9, float f8) {
            super(i8, i9, f8);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i8, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i11 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i9, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i11;
                }
            }
        }
    }

    private void forceUniformWidth(int i8, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i10 = 0; i10 < i8; i10++) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i11 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i9, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i11;
                }
            }
        }
    }

    private void setChildFrame(View view, int i8, int i9, int i10, int i11) {
        view.layout(i8, i9, i10 + i8, i11 + i9);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i8;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i9 = 0; i9 < virtualChildCount; i9++) {
            View virtualChildAt = getVirtualChildAt(i9);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i9)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, isLayoutRtl ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i8 = this.mDividerWidth;
                    right = left - i8;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i8 = this.mDividerWidth;
                right = left - i8;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View virtualChildAt = getVirtualChildAt(i8);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i8)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i8) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i8, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i8);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i8) {
        this.mDivider.setBounds(i8, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i8, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i8;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.mBaselineAlignedChildIndex;
        if (childCount <= i9) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i9);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i10 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i8 = this.mGravity & 112) != 48) {
            if (i8 == 16) {
                i10 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i8 == 80) {
                i10 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i10 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i8) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i8) {
        return getChildAt(i8);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean hasDividerBeforeChildAt(int i8) {
        if (i8 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i8 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (getChildAt(i9).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutHorizontal(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i21 = i11 - i9;
        int paddingBottom = i21 - getPaddingBottom();
        int paddingBottom2 = (i21 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i22 = this.mGravity;
        int i23 = i22 & 112;
        boolean z7 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i22, getLayoutDirection());
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i10) - i8) - this.mTotalLength : getPaddingLeft() + (((i10 - i8) - this.mTotalLength) / 2);
        if (isLayoutRtl) {
            i12 = virtualChildCount - 1;
            i13 = -1;
        } else {
            i12 = 0;
            i13 = 1;
        }
        int i24 = 0;
        while (i24 < virtualChildCount) {
            int i25 = i12 + (i13 * i24);
            View virtualChildAt = getVirtualChildAt(i25);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i25);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i26 = i24;
                if (z7) {
                    i14 = virtualChildCount;
                    if (((LinearLayout.LayoutParams) layoutParams).height != -1) {
                        i15 = virtualChildAt.getBaseline();
                        i16 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i16 < 0) {
                            i16 = i23;
                        }
                        i17 = i16 & 112;
                        i18 = i23;
                        if (i17 != 16) {
                            i19 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        } else if (i17 == 48) {
                            i19 = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                            if (i15 != -1) {
                                i19 += iArr[1] - i15;
                            }
                        } else if (i17 != 80) {
                            i19 = paddingTop;
                        } else {
                            i19 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (i15 != -1) {
                                i19 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - i15);
                            }
                        }
                        if (hasDividerBeforeChildAt(i25)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i27 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        i20 = paddingTop;
                        setChildFrame(virtualChildAt, i27 + getLocationOffset(virtualChildAt), i19, measuredWidth, measuredHeight);
                        int nextLocationOffset = i27 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(virtualChildAt);
                        i24 = i26 + getChildrenSkipCount(virtualChildAt, i25);
                        paddingLeft = nextLocationOffset;
                        i24++;
                        virtualChildCount = i14;
                        i23 = i18;
                        paddingTop = i20;
                    }
                } else {
                    i14 = virtualChildCount;
                }
                i15 = -1;
                i16 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i16 < 0) {
                }
                i17 = i16 & 112;
                i18 = i23;
                if (i17 != 16) {
                }
                if (hasDividerBeforeChildAt(i25)) {
                }
                int i272 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                i20 = paddingTop;
                setChildFrame(virtualChildAt, i272 + getLocationOffset(virtualChildAt), i19, measuredWidth, measuredHeight);
                int nextLocationOffset2 = i272 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(virtualChildAt);
                i24 = i26 + getChildrenSkipCount(virtualChildAt, i25);
                paddingLeft = nextLocationOffset2;
                i24++;
                virtualChildCount = i14;
                i23 = i18;
                paddingTop = i20;
            }
            i20 = paddingTop;
            i14 = virtualChildCount;
            i18 = i23;
            i24++;
            virtualChildCount = i14;
            i23 = i18;
            paddingTop = i20;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutVertical(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i10 - i8;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        int i18 = i16 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int paddingTop = i17 != 16 ? i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i11) - i9) - this.mTotalLength : getPaddingTop() + (((i11 - i9) - this.mTotalLength) / 2);
        int i19 = 0;
        while (i19 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(i19);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i20 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i20 < 0) {
                    i20 = i18;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i13 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else if (absoluteGravity != 5) {
                    i14 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    int i21 = i14;
                    if (hasDividerBeforeChildAt(i19)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(virtualChildAt, i21, i22 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    int nextLocationOffset = i22 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt);
                    i19 += getChildrenSkipCount(virtualChildAt, i19);
                    paddingTop = nextLocationOffset;
                } else {
                    i12 = paddingRight - measuredWidth;
                    i13 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i14 = i12 - i13;
                int i212 = i14;
                if (hasDividerBeforeChildAt(i19)) {
                }
                int i222 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                setChildFrame(virtualChildAt, i212, i222 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                int nextLocationOffset2 = i222 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt);
                i19 += getChildrenSkipCount(virtualChildAt, i19);
                paddingTop = nextLocationOffset2;
            }
            i19++;
        }
    }

    void measureChildBeforeLayout(View view, int i8, int i9, int i10, int i11, int i12) {
        measureChildWithMargins(view, i9, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureHorizontal(int i8, int i9) {
        int[] iArr;
        int i10;
        int max;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f8;
        int i17;
        boolean z7;
        int baseline;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z8;
        boolean z9;
        View view;
        int i23;
        boolean z10;
        int measuredHeight;
        int childrenSkipCount;
        int baseline2;
        int i24;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z11 = this.mBaselineAligned;
        boolean z12 = this.mUseLargestChild;
        int i25 = 1073741824;
        boolean z13 = mode == 1073741824;
        float f9 = 0.0f;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        boolean z14 = false;
        int i31 = 0;
        boolean z15 = true;
        boolean z16 = false;
        while (true) {
            iArr = iArr3;
            if (i26 >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(i26);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i26);
            } else if (virtualChildAt.getVisibility() == 8) {
                i26 += getChildrenSkipCount(virtualChildAt, i26);
            } else {
                if (hasDividerBeforeChildAt(i26)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                float f10 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f11 = f9 + f10;
                if (mode == i25 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f10 > 0.0f) {
                    if (z13) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else {
                        int i32 = this.mTotalLength;
                        this.mTotalLength = Math.max(i32, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i32 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z11) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i22 = i26;
                        z8 = z12;
                        z9 = z11;
                        view = virtualChildAt;
                    } else {
                        i22 = i26;
                        z8 = z12;
                        z9 = z11;
                        view = virtualChildAt;
                        i23 = 1073741824;
                        z14 = true;
                        if (mode2 == i23 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z10 = true;
                            z16 = true;
                        } else {
                            z10 = false;
                        }
                        int i33 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i33;
                        i31 = View.combineMeasuredStates(i31, view.getMeasuredState());
                        if (z9 && (baseline2 = view.getBaseline()) != -1) {
                            i24 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i24 < 0) {
                                i24 = this.mGravity;
                            }
                            int i34 = (((i24 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i34] = Math.max(iArr2[i34], baseline2);
                            iArr[i34] = Math.max(iArr[i34], measuredHeight - baseline2);
                        }
                        i28 = Math.max(i28, measuredHeight);
                        z15 = !z15 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                        if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                            if (!z10) {
                                i33 = measuredHeight;
                            }
                            i30 = Math.max(i30, i33);
                        } else {
                            int i35 = i30;
                            if (!z10) {
                                i33 = measuredHeight;
                            }
                            i29 = Math.max(i29, i33);
                            i30 = i35;
                        }
                        int i36 = i22;
                        childrenSkipCount = getChildrenSkipCount(view, i36) + i36;
                        f9 = f11;
                        i26 = childrenSkipCount + 1;
                        iArr3 = iArr;
                        z12 = z8;
                        z11 = z9;
                        i25 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f10 <= 0.0f) {
                        i21 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i21 = 0;
                    }
                    i22 = i26;
                    int i37 = i21;
                    z8 = z12;
                    z9 = z11;
                    measureChildBeforeLayout(virtualChildAt, i22, i8, f11 == 0.0f ? this.mTotalLength : 0, i9, 0);
                    if (i37 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i37;
                    }
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    if (z13) {
                        view = virtualChildAt;
                        this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(view);
                    } else {
                        view = virtualChildAt;
                        int i38 = this.mTotalLength;
                        this.mTotalLength = Math.max(i38, i38 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(view));
                    }
                    if (z8) {
                        i27 = Math.max(measuredWidth, i27);
                    }
                }
                i23 = 1073741824;
                if (mode2 == i23) {
                }
                z10 = false;
                int i332 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i332;
                i31 = View.combineMeasuredStates(i31, view.getMeasuredState());
                if (z9) {
                    i24 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i24 < 0) {
                    }
                    int i342 = (((i24 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i342] = Math.max(iArr2[i342], baseline2);
                    iArr[i342] = Math.max(iArr[i342], measuredHeight - baseline2);
                }
                i28 = Math.max(i28, measuredHeight);
                if (z15) {
                }
                if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                }
                int i362 = i22;
                childrenSkipCount = getChildrenSkipCount(view, i362) + i362;
                f9 = f11;
                i26 = childrenSkipCount + 1;
                iArr3 = iArr;
                z12 = z8;
                z11 = z9;
                i25 = 1073741824;
            }
            childrenSkipCount = i26;
            z8 = z12;
            z9 = z11;
            i26 = childrenSkipCount + 1;
            iArr3 = iArr;
            z12 = z8;
            z11 = z9;
            i25 = 1073741824;
        }
        boolean z17 = z12;
        boolean z18 = z11;
        int i39 = i28;
        int i40 = i29;
        int i41 = i30;
        int i42 = i31;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i43 = iArr2[1];
        if (i43 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            max = i39;
            i10 = i42;
        } else {
            i10 = i42;
            max = Math.max(i39, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i43, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z17 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int i44 = 0;
            while (i44 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(i44);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i44);
                } else if (virtualChildAt2.getVisibility() == 8) {
                    i44 += getChildrenSkipCount(virtualChildAt2, i44);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    if (z13) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams2).leftMargin + i27 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + getNextLocationOffset(virtualChildAt2);
                    } else {
                        int i45 = this.mTotalLength;
                        i20 = max;
                        this.mTotalLength = Math.max(i45, i45 + i27 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + getNextLocationOffset(virtualChildAt2));
                        i44++;
                        max = i20;
                    }
                }
                i20 = max;
                i44++;
                max = i20;
            }
        }
        int i46 = max;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, 0);
        int i47 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z14 || (i47 != 0 && f9 > 0.0f)) {
            float f12 = this.mWeightSum;
            if (f12 > 0.0f) {
                f9 = f12;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            int i48 = i40;
            i11 = i10;
            int i49 = -1;
            int i50 = 0;
            while (i50 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i50);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i15 = i47;
                    i16 = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f13 > 0.0f) {
                        int i51 = (int) ((i47 * f13) / f9);
                        float f14 = f9 - f13;
                        int i52 = i47 - i51;
                        i16 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i19 = 1073741824;
                            if (mode == 1073741824) {
                                if (i51 <= 0) {
                                    i51 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i51, 1073741824), childMeasureSpec);
                                i11 = View.combineMeasuredStates(i11, virtualChildAt3.getMeasuredState() & (-16777216));
                                f9 = f14;
                                i15 = i52;
                            }
                        } else {
                            i19 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i51;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i19), childMeasureSpec);
                        i11 = View.combineMeasuredStates(i11, virtualChildAt3.getMeasuredState() & (-16777216));
                        f9 = f14;
                        i15 = i52;
                    } else {
                        i15 = i47;
                        i16 = virtualChildCount;
                    }
                    if (z13) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + getNextLocationOffset(virtualChildAt3);
                        f8 = f9;
                    } else {
                        int i53 = this.mTotalLength;
                        f8 = f9;
                        this.mTotalLength = Math.max(i53, virtualChildAt3.getMeasuredWidth() + i53 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z19 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i54 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i54;
                    i49 = Math.max(i49, measuredHeight2);
                    if (!z19) {
                        i54 = measuredHeight2;
                    }
                    int max2 = Math.max(i48, i54);
                    if (z15) {
                        i17 = -1;
                        if (((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z7 = true;
                            if (z18 && (baseline = virtualChildAt3.getBaseline()) != i17) {
                                i18 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                                if (i18 < 0) {
                                    i18 = this.mGravity;
                                }
                                int i55 = (((i18 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i55] = Math.max(iArr2[i55], baseline);
                                iArr[i55] = Math.max(iArr[i55], measuredHeight2 - baseline);
                            }
                            z15 = z7;
                            i48 = max2;
                            f9 = f8;
                        }
                    } else {
                        i17 = -1;
                    }
                    z7 = false;
                    if (z18) {
                        i18 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i18 < 0) {
                        }
                        int i552 = (((i18 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i552] = Math.max(iArr2[i552], baseline);
                        iArr[i552] = Math.max(iArr[i552], measuredHeight2 - baseline);
                    }
                    z15 = z7;
                    i48 = max2;
                    f9 = f8;
                }
                i50++;
                i47 = i15;
                virtualChildCount = i16;
            }
            i12 = i9;
            i13 = virtualChildCount;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i56 = iArr2[1];
            i46 = (i56 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i49 : Math.max(i49, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i56, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            i14 = i48;
        } else {
            i14 = Math.max(i40, i41);
            if (z17 && mode != 1073741824) {
                for (int i57 = 0; i57 < virtualChildCount; i57++) {
                    View virtualChildAt4 = getVirtualChildAt(i57);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = i9;
            i13 = virtualChildCount;
            i11 = i10;
        }
        if (z15 || mode2 == 1073741824) {
            i14 = i46;
        }
        setMeasuredDimension(resolveSizeAndState | ((-16777216) & i11), View.resolveSizeAndState(Math.max(i14 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, i11 << 16));
        if (z16) {
            forceUniformHeight(i13, i8);
        }
    }

    int measureNullChild(int i8) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x031b, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r14).width == (-1)) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureVertical(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        View view;
        int max;
        boolean z7;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int i26 = this.mBaselineAlignedChildIndex;
        boolean z8 = this.mUseLargestChild;
        float f8 = 0.0f;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        boolean z9 = false;
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            int i33 = 8;
            int i34 = i30;
            if (i32 >= virtualChildCount) {
                int i35 = i27;
                int i36 = i29;
                int i37 = i31;
                int i38 = mode2;
                int i39 = i28;
                int i40 = virtualChildCount;
                if (this.mTotalLength > 0) {
                    i10 = i40;
                    if (hasDividerBeforeChildAt(i10)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i10 = i40;
                }
                if (z8 && (i38 == Integer.MIN_VALUE || i38 == 0)) {
                    this.mTotalLength = 0;
                    int i41 = 0;
                    while (i41 < i10) {
                        View virtualChildAt = getVirtualChildAt(i41);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(i41);
                        } else if (virtualChildAt.getVisibility() == i33) {
                            i41 += getChildrenSkipCount(virtualChildAt, i41);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i42 = this.mTotalLength;
                            this.mTotalLength = Math.max(i42, i42 + i36 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        i41++;
                        i33 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, 0);
                int i43 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z9 || (i43 != 0 && f8 > 0.0f)) {
                    float f9 = this.mWeightSum;
                    if (f9 > 0.0f) {
                        f8 = f9;
                    }
                    this.mTotalLength = 0;
                    int i44 = i43;
                    int i45 = i37;
                    i11 = i35;
                    int i46 = 0;
                    while (i46 < i10) {
                        View virtualChildAt2 = getVirtualChildAt(i46);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i14 = i44;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f10 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f10 > 0.0f) {
                                int i47 = (int) ((i44 * f10) / f8);
                                float f11 = f8 - f10;
                                i14 = i44 - i47;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i17 = 1073741824;
                                    if (i38 == 1073741824) {
                                        if (i47 <= 0) {
                                            i47 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i47, 1073741824));
                                        i11 = View.combineMeasuredStates(i11, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                        f8 = f11;
                                    }
                                } else {
                                    i17 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i47;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i17));
                                i11 = View.combineMeasuredStates(i11, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                f8 = f11;
                            } else {
                                i14 = i44;
                            }
                            int i48 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i48;
                            i39 = Math.max(i39, measuredWidth);
                            float f12 = f8;
                            if (mode != 1073741824) {
                                i15 = i11;
                                i16 = -1;
                            } else {
                                i15 = i11;
                                i16 = -1;
                            }
                            i48 = measuredWidth;
                            int max2 = Math.max(i45, i48);
                            boolean z12 = z10 && ((LinearLayout.LayoutParams) layoutParams2).width == i16;
                            int i49 = this.mTotalLength;
                            this.mTotalLength = Math.max(i49, virtualChildAt2.getMeasuredHeight() + i49 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            z10 = z12;
                            i11 = i15;
                            i45 = max2;
                            f8 = f12;
                        }
                        i46++;
                        i44 = i14;
                    }
                    i12 = i8;
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    i13 = i45;
                } else {
                    i13 = Math.max(i37, i34);
                    if (z8 && i38 != 1073741824) {
                        for (int i50 = 0; i50 < i10; i50++) {
                            View virtualChildAt3 = getVirtualChildAt(i50);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                            }
                        }
                    }
                    i12 = i8;
                    i11 = i35;
                }
                if (z10 || mode == 1073741824) {
                    i13 = i39;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i13 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i12, i11), resolveSizeAndState);
                if (z11) {
                    forceUniformWidth(i10, i9);
                    return;
                }
                return;
            }
            View virtualChildAt4 = getVirtualChildAt(i32);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(i32);
                i21 = mode2;
                i30 = i34;
                i23 = virtualChildCount;
            } else {
                int i51 = i27;
                if (virtualChildAt4.getVisibility() == 8) {
                    i32 += getChildrenSkipCount(virtualChildAt4, i32);
                    i30 = i34;
                    i27 = i51;
                    i23 = virtualChildCount;
                    i21 = mode2;
                } else {
                    if (hasDividerBeforeChildAt(i32)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    float f14 = f8 + f13;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f13 > 0.0f) {
                        int i52 = this.mTotalLength;
                        this.mTotalLength = Math.max(i52, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i52 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        max = i29;
                        view = virtualChildAt4;
                        i24 = i31;
                        i19 = i51;
                        i20 = i28;
                        z9 = true;
                        i21 = mode2;
                        i22 = i34;
                        i23 = virtualChildCount;
                        i25 = i32;
                    } else {
                        int i53 = i28;
                        if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f13 <= 0.0f) {
                            i18 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                            i18 = 0;
                        }
                        i19 = i51;
                        int i54 = i18;
                        i20 = i53;
                        int i55 = i29;
                        i21 = mode2;
                        i22 = i34;
                        i23 = virtualChildCount;
                        i24 = i31;
                        i25 = i32;
                        measureChildBeforeLayout(virtualChildAt4, i32, i8, 0, i9, f14 == 0.0f ? this.mTotalLength : 0);
                        if (i54 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams3).height = i54;
                        }
                        int measuredHeight2 = virtualChildAt4.getMeasuredHeight();
                        int i56 = this.mTotalLength;
                        view = virtualChildAt4;
                        this.mTotalLength = Math.max(i56, i56 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin + getNextLocationOffset(view));
                        max = z8 ? Math.max(measuredHeight2, i55) : i55;
                    }
                    if (i26 >= 0 && i26 == i25 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i25 < i26 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i57 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i57;
                    int max3 = Math.max(i20, measuredWidth2);
                    int combineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    z10 = z10 && ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (!z7) {
                            i57 = measuredWidth2;
                        }
                        i30 = Math.max(i22, i57);
                    } else {
                        if (!z7) {
                            i57 = measuredWidth2;
                        }
                        i24 = Math.max(i24, i57);
                        i30 = i22;
                    }
                    int childrenSkipCount = getChildrenSkipCount(view, i25) + i25;
                    i29 = max;
                    i28 = max3;
                    f8 = f14;
                    i31 = i24;
                    i32 = childrenSkipCount;
                    i27 = combineMeasuredStates;
                }
            }
            i32++;
            virtualChildCount = i23;
            mode2 = i21;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        if (this.mOrientation == 1) {
            layoutVertical(i8, i9, i10, i11);
        } else {
            layoutHorizontal(i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.mOrientation == 1) {
            measureVertical(i8, i9);
        } else {
            measureHorizontal(i8, i9);
        }
    }

    public void setBaselineAligned(boolean z7) {
        this.mBaselineAligned = z7;
    }

    public void setBaselineAlignedChildIndex(int i8) {
        if (i8 >= 0 && i8 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i8;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i8) {
        this.mDividerPadding = i8;
    }

    public void setGravity(@GravityInt int i8) {
        if (this.mGravity != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= GravityCompat.START;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.mGravity = i8;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i8) {
        int i9 = i8 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i10 = this.mGravity;
        if ((8388615 & i10) != i9) {
            this.mGravity = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.mUseLargestChild = z7;
    }

    public void setOrientation(int i8) {
        if (this.mOrientation != i8) {
            this.mOrientation = i8;
            requestLayout();
        }
    }

    public void setShowDividers(int i8) {
        if (i8 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i8;
    }

    public void setVerticalGravity(int i8) {
        int i9 = i8 & 112;
        int i10 = this.mGravity;
        if ((i10 & 112) != i9) {
            this.mGravity = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.mWeightSum = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i8 = this.mOrientation;
        if (i8 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i8 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = androidx.appcompat.R.styleable.LinearLayoutCompat;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i8, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i8, 0);
        int i9 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i9 >= 0) {
            setOrientation(i9);
        }
        int i10 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z7 = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z7) {
            setBaselineAligned(z7);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
