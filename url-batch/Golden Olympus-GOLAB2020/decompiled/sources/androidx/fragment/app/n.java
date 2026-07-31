package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class n implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final FragmentManager f12501a;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f12502a;

        a(x xVar) {
            this.f12502a = xVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k4 = this.f12502a.k();
            this.f12502a.m();
            G.n((ViewGroup) k4.mView.getParent(), n.this.f12501a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    n(FragmentManager fragmentManager) {
        this.f12501a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x v4;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f12501a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W.c.f9594a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(W.c.f9595b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(W.c.f9596c, -1);
        String string = obtainStyledAttributes.getString(W.c.f9597d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !l.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment g02 = resourceId != -1 ? this.f12501a.g0(resourceId) : null;
        if (g02 == null && string != null) {
            g02 = this.f12501a.h0(string);
        }
        if (g02 == null && id != -1) {
            g02 = this.f12501a.g0(id);
        }
        if (g02 == null) {
            g02 = this.f12501a.r0().a(context.getClassLoader(), attributeValue);
            g02.mFromLayout = true;
            g02.mFragmentId = resourceId != 0 ? resourceId : id;
            g02.mContainerId = id;
            g02.mTag = string;
            g02.mInLayout = true;
            FragmentManager fragmentManager = this.f12501a;
            g02.mFragmentManager = fragmentManager;
            g02.mHost = fragmentManager.t0();
            g02.onInflate(this.f12501a.t0().f(), attributeSet, g02.mSavedFragmentState);
            v4 = this.f12501a.h(g02);
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Fragment " + g02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (g02.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            g02.mInLayout = true;
            FragmentManager fragmentManager2 = this.f12501a;
            g02.mFragmentManager = fragmentManager2;
            g02.mHost = fragmentManager2.t0();
            g02.onInflate(this.f12501a.t0().f(), attributeSet, g02.mSavedFragmentState);
            v4 = this.f12501a.v(g02);
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + g02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        X.c.g(g02, viewGroup);
        g02.mContainer = viewGroup;
        v4.m();
        v4.j();
        View view2 = g02.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (g02.mView.getTag() == null) {
            g02.mView.setTag(string);
        }
        g02.mView.addOnAttachStateChangeListener(new a(v4));
        return g02.mView;
    }
}
