package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class T implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f4778a;

    public T(f0 f0Var) {
        this.f4778a = f0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        m0 g4;
        boolean equals = O.class.getName().equals(str);
        f0 f0Var = this.f4778a;
        if (equals) {
            return new O(context, attributeSet, f0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P.a.f2083a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = F.class.isAssignableFrom(Y.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    F B4 = resourceId != -1 ? f0Var.B(resourceId) : null;
                    if (B4 == null && string != null) {
                        B4 = f0Var.C(string);
                    }
                    if (B4 == null && id != -1) {
                        B4 = f0Var.B(id);
                    }
                    if (B4 == null) {
                        Y G4 = f0Var.G();
                        context.getClassLoader();
                        B4 = F.instantiate(G4.f4786a.v.f4773b, attributeValue, null);
                        B4.mFromLayout = true;
                        B4.mFragmentId = resourceId != 0 ? resourceId : id;
                        B4.mContainerId = id;
                        B4.mTag = string;
                        B4.mInLayout = true;
                        B4.mFragmentManager = f0Var;
                        Q q4 = f0Var.v;
                        B4.mHost = q4;
                        B4.onInflate((Context) q4.f4773b, attributeSet, B4.mSavedFragmentState);
                        g4 = f0Var.a(B4);
                        if (f0.J(2)) {
                            Log.v("FragmentManager", "Fragment " + B4 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (B4.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        B4.mInLayout = true;
                        B4.mFragmentManager = f0Var;
                        Q q5 = f0Var.v;
                        B4.mHost = q5;
                        B4.onInflate((Context) q5.f4773b, attributeSet, B4.mSavedFragmentState);
                        g4 = f0Var.g(B4);
                        if (f0.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + B4 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    Q.c cVar = Q.d.f2120a;
                    Q.d.b(new Q.e(B4, viewGroup, 0));
                    Q.d.a(B4).getClass();
                    B4.mContainer = viewGroup;
                    g4.k();
                    g4.j();
                    View view2 = B4.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC1514c.a("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B4.mView.getTag() == null) {
                        B4.mView.setTag(string);
                    }
                    B4.mView.addOnAttachStateChangeListener(new S(this, g4));
                    return B4.mView;
                }
            }
        }
        return null;
    }
}
