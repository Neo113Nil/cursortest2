package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.gdmhkmf.belbet.R;
import f.a;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f334f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f335g;
    public int h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        int[] iArr = a.f1397k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        p0.l(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f334f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f334f);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f335g != z4) {
            if (!z4 || this.f334f) {
                this.f335g = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        boolean z4;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int i7 = 0;
        if (this.f334f) {
            if (size > this.h && this.f335g) {
                setStacked(false);
            }
            this.h = size;
        }
        if (this.f335g || View.MeasureSpec.getMode(i) != 1073741824) {
            i5 = i;
            z4 = false;
        } else {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(i5, i4);
        if (this.f334f && !this.f335g && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i, i4);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i6 = -1;
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
            if (this.f335g) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i9).getVisibility() == 0) {
                        i6 = i9;
                        break;
                    }
                    i9++;
                }
                i7 = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = p0.f2816a;
        if (getMinimumHeight() != i7) {
            setMinimumHeight(i7);
            if (i4 == 0) {
                super.onMeasure(i, i4);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f334f != z4) {
            this.f334f = z4;
            if (!z4 && this.f335g) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
