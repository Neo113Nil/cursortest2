package androidx.appcompat.widget;

import E.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.rockchicken.pump.up.road.R;
import f.AbstractC0410a;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4373a;

    /* renamed from: b, reason: collision with root package name */
    public int f4374b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4374b = -1;
        int[] iArr = AbstractC0410a.f8477h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f4373a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z;
        int i7;
        int size = View.MeasureSpec.getSize(i4);
        if (this.f4373a) {
            if (size > this.f4374b && getOrientation() == 1) {
                setStacked(false);
            }
            this.f4374b = size;
        }
        if (getOrientation() != 1 && View.MeasureSpec.getMode(i4) == 1073741824) {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i6 = i4;
            z = false;
        }
        super.onMeasure(i6, i5);
        if (this.f4373a && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i4, i5);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i7 = -1;
            if (i8 >= childCount) {
                i8 = -1;
                break;
            } else if (getChildAt(i8).getVisibility() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
                r3 = i7 >= 0 ? getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = H.f375a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f4373a != z) {
            this.f4373a = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
