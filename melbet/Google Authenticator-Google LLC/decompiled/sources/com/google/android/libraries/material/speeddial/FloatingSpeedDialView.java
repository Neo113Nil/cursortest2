package com.google.android.libraries.material.speeddial;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.dmk;
import defpackage.dnk;
import defpackage.dnm;
import defpackage.dnr;
import defpackage.fhq;
import defpackage.tv;
import defpackage.tw;
import defpackage.tz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FloatingSpeedDialView extends FrameLayout implements tv {
    public final RecyclerView a;
    public final int b;
    public boolean c;
    public Animator d;
    private final String e;
    private final String f;
    private final AccessibilityManager g;

    public FloatingSpeedDialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dnr.b, i, R.style.InternalSpeedDialViewStyle);
        setElevation(obtainStyledAttributes.getDimension(0, 0.0f));
        obtainStyledAttributes.recycle();
        Resources resources = getResources();
        this.e = resources.getString(R.string.floatingspeeddialview_expand_menu_announcement);
        this.f = resources.getString(R.string.floatingspeeddialview_collapse_menu_announcement);
        float dimension = resources.getDimension(R.dimen.mtrl_internal_floating_speed_dial_mini_fab_elevation) + resources.getDimension(R.dimen.mtrl_internal_floating_speed_dial_mini_fab_pressed_translation_z);
        this.b = (int) (dimension + dimension + resources.getDimension(R.dimen.design_fab_size_mini));
        RecyclerView recyclerView = new RecyclerView(context);
        this.a = recyclerView;
        recyclerView.setClipChildren(false);
        recyclerView.setOverScrollMode(2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.ac(true);
        linearLayoutManager.s(true);
        recyclerView.Y(linearLayoutManager);
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        this.g = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    @Override // defpackage.tv
    public final tw a() {
        return new Behavior();
    }

    public final Animator b(boolean z) {
        Interpolator interpolator;
        int i;
        Interpolator interpolator2;
        int i2;
        int i3;
        Interpolator interpolator3 = dnk.a;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        RecyclerView recyclerView = (RecyclerView) getChildAt(0);
        int i5 = 0;
        int i6 = 0;
        while (i5 < recyclerView.getChildCount()) {
            View childAt = recyclerView.getChildAt(i5);
            View findViewById = childAt.findViewById(R.id.mtrl_internal_speed_dial_item_label);
            float f = true != z ? 0.0f : 1.0f;
            float f2 = true == z ? 0.0f : 1.0f;
            findViewById.setAlpha(f2);
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            fArr[i4] = f2;
            fArr[1] = f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) property, fArr);
            if (z) {
                interpolator = dnk.a;
                i = 1;
            } else {
                interpolator = dnk.b;
                i = i4;
            }
            ofFloat.setInterpolator(interpolator);
            int i7 = i4;
            RecyclerView recyclerView2 = recyclerView;
            ofFloat.setDuration(150L);
            ofFloat.setStartDelay((1 != i ? i7 : 50) + i6);
            arrayList.add(ofFloat);
            View findViewById2 = childAt.findViewById(R.id.mtrl_internal_speed_dial_item_fab);
            findViewById2.setAlpha(f2);
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[2];
            fArr2[i7] = f2;
            fArr2[1] = f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, (Property<View, Float>) property2, fArr2);
            if (z) {
                interpolator2 = dnk.a;
                i2 = 1;
            } else {
                interpolator2 = dnk.b;
                i2 = i7;
            }
            ofFloat2.setInterpolator(interpolator2);
            ofFloat2.setDuration(1 != i2 ? 150L : 200L);
            long j = i6;
            ofFloat2.setStartDelay(j);
            arrayList.add(ofFloat2);
            if (z) {
                float dimension = childAt.getResources().getDimension(R.dimen.mtrl_internal_floating_speed_dial_item_vertical_translation_distance);
                childAt.setTranslationY(dimension);
                Property property3 = View.TRANSLATION_Y;
                float[] fArr3 = new float[2];
                fArr3[i7] = dimension;
                fArr3[1] = 0.0f;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property3, fArr3);
                ofFloat3.setInterpolator(dmk.c);
                ofFloat3.setDuration(200L);
                ofFloat3.setStartDelay(j);
                arrayList.add(ofFloat3);
                findViewById2.setScaleX(0.1f);
                findViewById2.setScaleY(0.1f);
                PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.1f, 1.0f);
                PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.1f, 1.0f);
                PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
                propertyValuesHolderArr[i7] = ofFloat4;
                propertyValuesHolderArr[1] = ofFloat5;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById2, propertyValuesHolderArr);
                ofPropertyValuesHolder.setInterpolator(dnk.a);
                ofPropertyValuesHolder.setDuration(200L);
                ofPropertyValuesHolder.setStartDelay(j);
                arrayList.add(ofPropertyValuesHolder);
                i3 = 20;
            } else {
                i3 = i7;
            }
            i6 += i3;
            i5++;
            i4 = i7;
            recyclerView = recyclerView2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        fhq.h(animatorSet, arrayList);
        animatorSet.addListener(new dnm(this, z));
        return animatorSet;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(i == 0 ? this.e : this.f);
        requestSendAccessibilityEvent(this, obtain);
    }

    /* compiled from: PG */
    public class Behavior extends tw {
        public Behavior() {
        }

        public void J(CoordinatorLayout coordinatorLayout, FloatingSpeedDialView floatingSpeedDialView, int i) {
            coordinatorLayout.j(floatingSpeedDialView, i);
            int i2 = ((tz) floatingSpeedDialView.getLayoutParams()).f;
            FloatingActionButton floatingActionButton = null;
            if (i2 != -1) {
                List a = coordinatorLayout.a(floatingSpeedDialView);
                int size = a.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    View view = (View) a.get(i3);
                    if (view.getId() == i2 && (view instanceof FloatingActionButton)) {
                        floatingActionButton = (FloatingActionButton) view;
                        break;
                    }
                    i3++;
                }
            }
            if (floatingActionButton != null) {
                int absoluteGravity = Gravity.getAbsoluteGravity(((tz) floatingSpeedDialView.getLayoutParams()).d, i) & 7;
                int width = (floatingActionButton.getWidth() - floatingSpeedDialView.b) / 2;
                if (absoluteGravity == 5) {
                    floatingSpeedDialView.setTranslationX(-width);
                } else if (absoluteGravity == 3) {
                    floatingSpeedDialView.setTranslationX(width);
                }
            }
        }

        @Override // defpackage.tw
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            J(coordinatorLayout, (FloatingSpeedDialView) view, i);
            return true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingSpeedDialView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingSpeedDialStyle);
    }

    public FloatingSpeedDialView(Context context) {
        this(context, null);
    }
}
