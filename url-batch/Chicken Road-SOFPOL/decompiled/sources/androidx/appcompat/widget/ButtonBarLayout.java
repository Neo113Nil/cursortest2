package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.snovikpovik.vuevnxsj.R;
import h.a;
import java.lang.reflect.Field;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f408d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f409e;

    /* renamed from: f, reason: collision with root package name */
    public int f410f;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f410f = -1;
        int[] iArr = a.i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        k0.j(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f408d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f408d);
        }
    }

    private void setStacked(boolean z3) {
        if (this.f409e != z3) {
            if (!z3 || this.f408d) {
                this.f409e = z3;
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
    public final void onMeasure(int i, int i8) {
        int i9;
        boolean z3;
        int i10;
        int size = View.MeasureSpec.getSize(i);
        int i11 = 0;
        if (this.f408d) {
            if (size > this.f410f && this.f409e) {
                setStacked(false);
            }
            this.f410f = size;
        }
        if (this.f409e || View.MeasureSpec.getMode(i) != 1073741824) {
            i9 = i;
            z3 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i9, i8);
        if (this.f408d && !this.f409e && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i, i8);
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
            if (this.f409e) {
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
        Field field = k0.f6120a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i8 == 0) {
                super.onMeasure(i, i8);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f408d != z3) {
            this.f408d = z3;
            if (!z3 && this.f409e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
