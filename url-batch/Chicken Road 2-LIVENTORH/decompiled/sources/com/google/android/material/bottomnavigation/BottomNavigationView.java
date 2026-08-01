package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.emoji2.text.t;
import com.oriondriftchasers.arordrft.R;
import e2.o;
import g2.r;
import l2.f;
import n1.a;
import t1.b;
import t1.c;
import t1.d;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class BottomNavigationView extends r {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t g4 = o.g(getContext(), attributeSet, a.f2811b, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) g4.f356c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        g4.y();
        o.d(this, new f(27));
    }

    @Override // g2.r
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i4) == 1073741824 || suggestedMinimumHeight <= 0) {
            i5 = i4;
        } else {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i4), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i5);
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        b bVar = (b) getMenuView();
        if (bVar.f3310k0 != z3) {
            bVar.setItemHorizontalTranslationEnabled(z3);
            getPresenter().m(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
