package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.a;
import java.lang.ref.WeakReference;
import l.f1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f1770a;

    /* renamed from: b, reason: collision with root package name */
    public int f1771b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f1772c;
    public LayoutInflater d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1770a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2536z, 0, 0);
        this.f1771b = obtainStyledAttributes.getResourceId(2, -1);
        this.f1770a = obtainStyledAttributes.getResourceId(1, 0);
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
        if (this.f1770a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1770a, viewGroup, false);
        int i = this.f1771b;
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
        this.f1772c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1771b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public int getLayoutResource() {
        return this.f1770a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1771b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1770a = i;
    }

    public void setOnInflateListener(f1 f1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f1772c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }
}
