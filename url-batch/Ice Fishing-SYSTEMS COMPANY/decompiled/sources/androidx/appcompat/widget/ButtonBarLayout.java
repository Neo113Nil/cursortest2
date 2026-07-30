package androidx.appcompat.widget;

import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public boolean f4686n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4687u;

    /* renamed from: v, reason: collision with root package name */
    public int f4688v;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4688v = -1;
        int[] iArr = AbstractC4518a.f37827k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        X.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f4686n = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4686n);
        }
    }

    private void setStacked(boolean z8) {
        if (this.f4687u != z8) {
            if (!z8 || this.f4686n) {
                this.f4687u = z8;
                setOrientation(z8 ? 1 : 0);
                setGravity(z8 ? 8388613 : 80);
                View findViewById = findViewById(C5284R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z8 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i9;
        boolean z8;
        int i10;
        int size = View.MeasureSpec.getSize(i);
        int i11 = 0;
        if (this.f4686n) {
            if (size > this.f4688v && this.f4687u) {
                setStacked(false);
            }
            this.f4688v = size;
        }
        if (this.f4687u || View.MeasureSpec.getMode(i) != 1073741824) {
            i9 = i;
            z8 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        }
        super.onMeasure(i9, i4);
        if (this.f4686n && !this.f4687u && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i, i4);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4687u) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                i11 = i10 >= 0 ? getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i11 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = X.f2240a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i4 == 0) {
                super.onMeasure(i, i4);
            }
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.f4686n != z8) {
            this.f4686n = z8;
            if (!z8 && this.f4687u) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
