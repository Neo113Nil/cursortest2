package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z implements LayoutInflater.Factory2 {

    /* renamed from: f, reason: collision with root package name */
    public final k0 f556f;

    public z(k0 k0Var) {
        this.f556f = k0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        q0 f4;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        k0 k0Var = this.f556f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, k0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f3398a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z3 = u.class.isAssignableFrom(e0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z3 = false;
                }
                if (z3) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    u A = resourceId != -1 ? k0Var.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = k0Var.B(string);
                    }
                    if (A == null && id != -1) {
                        A = k0Var.A(id);
                    }
                    if (A == null) {
                        e0 D = k0Var.D();
                        context.getClassLoader();
                        A = D.a(attributeValue);
                        A.f530r = true;
                        A.A = resourceId != 0 ? resourceId : id;
                        A.B = id;
                        A.C = string;
                        A.f531s = true;
                        A.f535w = k0Var;
                        w wVar = k0Var.f451t;
                        A.f536x = wVar;
                        f.i iVar = wVar.f548l;
                        A.H = true;
                        if ((wVar != null ? wVar.f547k : null) != null) {
                            A.H = true;
                        }
                        f4 = k0Var.a(A);
                        if (k0.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.f531s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.f531s = true;
                        A.f535w = k0Var;
                        w wVar2 = k0Var.f451t;
                        A.f536x = wVar2;
                        f.i iVar2 = wVar2.f548l;
                        A.H = true;
                        if ((wVar2 != null ? wVar2.f547k : null) != null) {
                            A.H = true;
                        }
                        f4 = k0Var.f(A);
                        if (k0.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    v0.b bVar = v0.c.f3579a;
                    v0.c.b(new v0.a(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup));
                    v0.c.a(A).getClass();
                    A.I = viewGroup;
                    f4.k();
                    f4.j();
                    View view2 = A.J;
                    if (view2 == null) {
                        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.J.getTag() == null) {
                        A.J.setTag(string);
                    }
                    A.J.addOnAttachStateChangeListener(new y(this, f4));
                    return A.J;
                }
            }
        }
        return null;
    }
}
