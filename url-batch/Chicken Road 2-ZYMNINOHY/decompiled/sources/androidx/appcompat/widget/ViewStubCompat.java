package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.AbstractC0410a;
import java.lang.ref.WeakReference;
import k.s0;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f4492a;

    /* renamed from: b, reason: collision with root package name */
    public int f4493b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f4494c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f4495d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4492a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.v, 0, 0);
        this.f4493b = obtainStyledAttributes.getResourceId(2, -1);
        this.f4492a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4493b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4495d;
    }

    public int getLayoutResource() {
        return this.f4492a;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f4493b = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4495d = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f4492a = i4;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.f4494c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f4492a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f4495d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f4492a, viewGroup, false);
            int i5 = this.f4493b;
            if (i5 != -1) {
                inflate.setId(i5);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f4494c = new WeakReference(inflate);
        }
    }

    public void setOnInflateListener(s0 s0Var) {
    }
}
