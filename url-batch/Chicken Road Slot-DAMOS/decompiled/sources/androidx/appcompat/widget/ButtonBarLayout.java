package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.appsflyer.R;
import i.a;
import java.lang.reflect.Field;
import o3.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f428d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f429e;

    /* renamed from: i, reason: collision with root package name */
    public int f430i;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f430i = -1;
        int[] iArr = a.f4547i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        c0.c(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f428d = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f428d);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f429e != z10) {
            if (!z10 || this.f428d) {
                this.f429e = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i3);
        int i13 = 0;
        if (this.f428d) {
            if (size > this.f430i && this.f429e) {
                setStacked(false);
            }
            this.f430i = size;
        }
        if (this.f429e || View.MeasureSpec.getMode(i3) != 1073741824) {
            i11 = i3;
            z10 = false;
        } else {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i11, i10);
        if (this.f428d && !this.f429e && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i3, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 >= childCount) {
                i14 = -1;
                break;
            } else if (getChildAt(i14).getVisibility() == 0) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f429e) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                }
                i13 = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = c0.f7378a;
        if (getMinimumHeight() != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i3, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f428d != z10) {
            this.f428d = z10;
            if (!z10 && this.f429e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
