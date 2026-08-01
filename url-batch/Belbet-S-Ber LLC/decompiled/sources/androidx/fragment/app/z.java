package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z implements LayoutInflater.Factory2 {

    /* renamed from: f, reason: collision with root package name */
    public final k0 f683f;

    public z(k0 k0Var) {
        this.f683f = k0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z4;
        q0 f5;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        k0 k0Var = this.f683f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, k0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4095a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z4 = u.class.isAssignableFrom(e0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z4 = false;
                }
                if (z4) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    u B = resourceId != -1 ? k0Var.B(resourceId) : null;
                    if (B == null && string != null) {
                        B = k0Var.C(string);
                    }
                    if (B == null && id != -1) {
                        B = k0Var.B(id);
                    }
                    if (B == null) {
                        e0 E = k0Var.E();
                        context.getClassLoader();
                        B = E.a(attributeValue);
                        B.f654r = true;
                        B.A = resourceId != 0 ? resourceId : id;
                        B.B = id;
                        B.C = string;
                        B.f655s = true;
                        B.f659w = k0Var;
                        w wVar = k0Var.f570t;
                        B.f660x = wVar;
                        g.i iVar = wVar.f674p;
                        B.H = true;
                        if ((wVar != null ? wVar.f673o : null) != null) {
                            B.H = true;
                        }
                        f5 = k0Var.a(B);
                        if (k0.H(2)) {
                            Log.v("FragmentManager", "Fragment " + B + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (B.f655s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        B.f655s = true;
                        B.f659w = k0Var;
                        w wVar2 = k0Var.f570t;
                        B.f660x = wVar2;
                        g.i iVar2 = wVar2.f674p;
                        B.H = true;
                        if ((wVar2 != null ? wVar2.f673o : null) != null) {
                            B.H = true;
                        }
                        f5 = k0Var.f(B);
                        if (k0.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + B + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    z0.b bVar = z0.c.f4126a;
                    z0.c.b(new z0.a(B, "Attempting to use <fragment> tag to add fragment " + B + " to container " + viewGroup));
                    z0.c.a(B).getClass();
                    B.I = viewGroup;
                    f5.k();
                    f5.j();
                    View view2 = B.J;
                    if (view2 == null) {
                        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B.J.getTag() == null) {
                        B.J.setTag(string);
                    }
                    B.J.addOnAttachStateChangeListener(new y(this, f5));
                    return B.J;
                }
            }
        }
        return null;
    }
}
