package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.g9;
import defpackage.z00;
import defpackage.zc0;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int f;
    public int g;
    public WeakReference h;
    public LayoutInflater i;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.z, 0, 0);
        this.g = obtainStyledAttributes.getResourceId(2, -1);
        this.f = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            g9.s("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f == 0) {
            g9.i("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.i;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        int i = this.g;
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
        this.h = new WeakReference(inflate);
        return inflate;
    }

    public int getInflatedId() {
        return this.g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.i;
    }

    public int getLayoutResource() {
        return this.f;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.g = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.i = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                g9.s("setVisibility called on un-referenced view");
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

    public void setOnInflateListener(zc0 zc0Var) {
    }
}
