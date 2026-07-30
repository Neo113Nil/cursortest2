package androidx.appcompat.widget;

import I.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3208d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3209e;

    /* renamed from: i, reason: collision with root package name */
    public int f3210i;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3210i = -1;
        int[] iArr = AbstractC0454a.f5046k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        T.h(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f3208d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3208d);
        }
    }

    private void setStacked(boolean z7) {
        if (this.f3209e != z7) {
            if (!z7 || this.f3208d) {
                this.f3209e = z7;
                setOrientation(z7 ? 1 : 0);
                setGravity(z7 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z7 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        boolean z7;
        int i8;
        int size = View.MeasureSpec.getSize(i2);
        int i9 = 0;
        if (this.f3208d) {
            if (size > this.f3210i && this.f3209e) {
                setStacked(false);
            }
            this.f3210i = size;
        }
        if (this.f3209e || View.MeasureSpec.getMode(i2) != 1073741824) {
            i7 = i2;
            z7 = false;
        } else {
            i7 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        }
        super.onMeasure(i7, i5);
        if (this.f3208d && !this.f3209e && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z7 = true;
        }
        if (z7) {
            super.onMeasure(i2, i5);
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            i8 = -1;
            if (i10 >= childCount) {
                i10 = -1;
                break;
            } else if (getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f3209e) {
                int i11 = i10 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i11 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i11).getVisibility() == 0) {
                        i8 = i11;
                        break;
                    }
                    i11++;
                }
                i9 = i8 >= 0 ? getChildAt(i8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i9 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = T.f1153a;
        if (getMinimumHeight() != i9) {
            setMinimumHeight(i9);
            if (i5 == 0) {
                super.onMeasure(i2, i5);
            }
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f3208d != z7) {
            this.f3208d = z7;
            if (!z7 && this.f3209e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
