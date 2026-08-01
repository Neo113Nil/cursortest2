package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.al;
import defpackage.bl;
import defpackage.cl;
import defpackage.jy;
import defpackage.nk;
import defpackage.o8;
import defpackage.sk;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class m implements LayoutInflater.Factory2 {
    public final n f;

    public m(n nVar) {
        this.f = nVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        q f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        n nVar = this.f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, nVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jy.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = Fragment.class.isAssignableFrom(sk.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment A = resourceId != -1 ? nVar.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = nVar.B(string);
                    }
                    if (A == null && id != -1) {
                        A = nVar.A(id);
                    }
                    if (A == null) {
                        sk D = nVar.D();
                        context.getClassLoader();
                        A = Fragment.instantiate(D.a.t.g, attributeValue, null);
                        A.mFromLayout = true;
                        A.mFragmentId = resourceId != 0 ? resourceId : id;
                        A.mContainerId = id;
                        A.mTag = string;
                        A.mInLayout = true;
                        A.mFragmentManager = nVar;
                        nk nkVar = nVar.t;
                        A.mHost = nkVar;
                        A.onInflate((Context) nkVar.g, attributeSet, A.mSavedFragmentState);
                        f = nVar.a(A);
                        if (n.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.mInLayout = true;
                        A.mFragmentManager = nVar;
                        nk nkVar2 = nVar.t;
                        A.mHost = nkVar2;
                        A.onInflate((Context) nkVar2.g, attributeSet, A.mSavedFragmentState);
                        f = nVar.f(A);
                        if (n.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    bl blVar = cl.a;
                    cl.b(new al(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup));
                    cl.a(A).getClass();
                    A.mContainer = viewGroup;
                    f.j();
                    f.i();
                    View view2 = A.mView;
                    if (view2 == null) {
                        o8.r(attributeValue, " did not create a view.", "Fragment ");
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.mView.getTag() == null) {
                        A.mView.setTag(string);
                    }
                    A.mView.addOnAttachStateChangeListener(new l(this, f));
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
