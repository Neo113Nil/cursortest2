package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.a;
import java.lang.ref.WeakReference;
import kotlin.collections.i0;
import m.i2;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: d, reason: collision with root package name */
    public int f460d;

    /* renamed from: e, reason: collision with root package name */
    public int f461e;

    /* renamed from: i, reason: collision with root package name */
    public WeakReference f462i;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f463r;

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f460d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4557t, i3, 0);
        this.f461e = obtainStyledAttributes.getResourceId(2, -1);
        this.f460d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f461e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f463r;
    }

    public int getLayoutResource() {
        return this.f460d;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f461e = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f463r = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f460d = i3;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f462i;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i3);
                return;
            } else {
                i0.l("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                i0.l("ViewStub must have a non-null ViewGroup viewParent");
                return;
            }
            if (this.f460d == 0) {
                a1.e("ViewStub must have a valid layoutResource");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f463r;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f460d, viewGroup, false);
            int i10 = this.f461e;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f462i = new WeakReference(inflate);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(i2 i2Var) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
