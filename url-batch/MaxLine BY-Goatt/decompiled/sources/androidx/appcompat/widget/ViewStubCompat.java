package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.a63;
import defpackage.b62;
import defpackage.lh;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int m;
    public int n;
    public WeakReference o;
    public LayoutInflater p;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.z, 0, 0);
        this.n = obtainStyledAttributes.getResourceId(2, -1);
        this.m = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            lh.g("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.m == 0) {
            lh.e("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.p;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.m, viewGroup, false);
        int i = this.n;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.o = new WeakReference(inflate);
        return inflate;
    }

    public int getInflatedId() {
        return this.n;
    }

    public LayoutInflater getLayoutInflater() {
        return this.p;
    }

    public int getLayoutResource() {
        return this.m;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.n = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.p = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.m = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                lh.g("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a63 a63Var) {
    }
}
