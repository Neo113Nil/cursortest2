package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.a;
import java.lang.ref.WeakReference;
import l.o2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: d, reason: collision with root package name */
    public int f441d;

    /* renamed from: e, reason: collision with root package name */
    public int f442e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f443f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f444g;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f441d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3068u, 0, 0);
        this.f442e = obtainStyledAttributes.getResourceId(2, -1);
        this.f441d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f442e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f444g;
    }

    public int getLayoutResource() {
        return this.f441d;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f442e = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f444g = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f441d = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f443f;
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
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f441d == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f444g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f441d, viewGroup, false);
            int i8 = this.f442e;
            if (i8 != -1) {
                inflate.setId(i8);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f443f = new WeakReference(inflate);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(o2 o2Var) {
    }
}
