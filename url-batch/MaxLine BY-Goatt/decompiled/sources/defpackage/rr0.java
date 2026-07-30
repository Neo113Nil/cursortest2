package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rr0 implements LayoutInflater.Factory2 {
    public final as0 m;

    public rr0(as0 as0Var) {
        this.m = as0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        is0 f;
        boolean equals = nr0.class.getName().equals(str);
        as0 as0Var = this.m;
        if (equals) {
            return new nr0(context, attributeSet, as0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a62.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = fr0.class.isAssignableFrom(vr0.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    fr0 A = resourceId != -1 ? as0Var.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = as0Var.B(string);
                    }
                    if (A == null && id != -1) {
                        A = as0Var.A(id);
                    }
                    if (A == null) {
                        vr0 D = as0Var.D();
                        context.getClassLoader();
                        A = fr0.instantiate(D.a.t.n, attributeValue, null);
                        A.mFromLayout = true;
                        A.mFragmentId = resourceId != 0 ? resourceId : id;
                        A.mContainerId = id;
                        A.mTag = string;
                        A.mInLayout = true;
                        A.mFragmentManager = as0Var;
                        pr0 pr0Var = as0Var.t;
                        A.mHost = pr0Var;
                        A.onInflate((Context) pr0Var.n, attributeSet, A.mSavedFragmentState);
                        f = as0Var.a(A);
                        if (as0.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.mInLayout = true;
                        A.mFragmentManager = as0Var;
                        pr0 pr0Var2 = as0Var.t;
                        A.mHost = pr0Var2;
                        A.onInflate((Context) pr0Var2.n, attributeSet, A.mSavedFragmentState);
                        f = as0Var.f(A);
                        if (as0.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    ls0 ls0Var = ms0.a;
                    ns0 ns0Var = new ns0(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup);
                    ms0.c(ns0Var);
                    ls0 a = ms0.a(A);
                    if (a.a.contains(ks0.p) && ms0.e(a, A.getClass(), ns0.class)) {
                        ms0.b(a, ns0Var);
                    }
                    A.mContainer = viewGroup;
                    f.j();
                    f.i();
                    View view2 = A.mView;
                    if (view2 == null) {
                        lh.g(q40.m("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.mView.getTag() == null) {
                        A.mView.setTag(string);
                    }
                    A.mView.addOnAttachStateChangeListener(new qr0(this, f));
                    return A.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
