package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.authenticator2.R;
import defpackage.em;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {
    private final boolean a;
    private boolean b;
    private int c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        int[] iArr = em.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        yq.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        this.a = z;
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            b(z);
        }
    }

    private final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void b(boolean z) {
        if (this.b != z) {
            if (!z || this.a) {
                this.b = z;
                setOrientation(z ? 1 : 0);
                setGravity(true != z ? 80 : 8388613);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(true != z ? 4 : 8);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0045, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        boolean z2 = this.a;
        if (z2) {
            if (size > this.c && this.b) {
                b(false);
            }
            this.c = size;
        }
        if (this.b || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (z2 && !this.b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            b(true);
        }
        super.onMeasure(i, i2);
        int a = a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i4 = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.b) {
                int a2 = a(a + 1);
                if (a2 >= 0) {
                    paddingBottom = getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i4 += paddingBottom;
        } else {
            i4 = 0;
        }
        int i5 = yq.a;
        if (getMinimumHeight() != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, 0);
            }
        }
    }
}
