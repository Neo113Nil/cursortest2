package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.gglhk.bofio.fortunetiger.R;
import e.a;
import java.util.WeakHashMap;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f226f;
    public boolean g;
    public int h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        int[] iArr = a.f1502k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        j0.l(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f226f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f226f);
        }
    }

    private void setStacked(boolean z3) {
        if (this.g != z3) {
            if (!z3 || this.f226f) {
                this.g = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z3;
        int i7;
        int size = View.MeasureSpec.getSize(i4);
        int i8 = 0;
        if (this.f226f) {
            if (size > this.h && this.g) {
                setStacked(false);
            }
            this.h = size;
        }
        if (this.g || View.MeasureSpec.getMode(i4) != 1073741824) {
            i6 = i4;
            z3 = false;
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i6, i5);
        if (this.f226f && !this.g && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i4, i5);
        }
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            i7 = -1;
            if (i9 >= childCount) {
                i9 = -1;
                break;
            } else if (getChildAt(i9).getVisibility() == 0) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            View childAt = getChildAt(i9);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.g) {
                int i10 = i9 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i10 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i10).getVisibility() == 0) {
                        i7 = i10;
                        break;
                    }
                    i10++;
                }
                i8 = i7 >= 0 ? getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i8 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = j0.f2752a;
        if (getMinimumHeight() != i8) {
            setMinimumHeight(i8);
            if (i5 == 0) {
                super.onMeasure(i4, i5);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f226f != z3) {
            this.f226f = z3;
            if (!z3 && this.g) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
