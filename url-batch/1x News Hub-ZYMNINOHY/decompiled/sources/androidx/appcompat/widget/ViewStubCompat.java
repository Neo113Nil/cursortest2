package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.AbstractC0328a;
import java.lang.ref.WeakReference;
import l.v0;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f2159a;

    /* renamed from: b, reason: collision with root package name */
    public int f2160b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2161c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f2162d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2159a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.v, 0, 0);
        this.f2160b = obtainStyledAttributes.getResourceId(2, -1);
        this.f2159a = obtainStyledAttributes.getResourceId(1, 0);
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
        return this.f2160b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2162d;
    }

    public int getLayoutResource() {
        return this.f2159a;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f2160b = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2162d = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f2159a = i3;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f2161c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f2159a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2162d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2159a, viewGroup, false);
            int i4 = this.f2160b;
            if (i4 != -1) {
                inflate.setId(i4);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2161c = new WeakReference(inflate);
        }
    }

    public void setOnInflateListener(v0 v0Var) {
    }
}
