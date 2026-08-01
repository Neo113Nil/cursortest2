package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.a;
import java.lang.ref.WeakReference;
import k.c3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: f, reason: collision with root package name */
    public int f255f;
    public int g;
    public WeakReference h;

    /* renamed from: i, reason: collision with root package name */
    public LayoutInflater f256i;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f255f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1517z, 0, 0);
        this.g = obtainStyledAttributes.getResourceId(2, -1);
        this.f255f = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f255f == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f256i;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f255f, viewGroup, false);
        int i4 = this.g;
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
        this.h = new WeakReference(inflate);
        return inflate;
    }

    public int getInflatedId() {
        return this.g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f256i;
    }

    public int getLayoutResource() {
        return this.f255f;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.g = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f256i = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f255f = i4;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.h;
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
            a();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(c3 c3Var) {
    }
}
