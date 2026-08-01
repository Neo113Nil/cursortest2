package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class um implements LayoutInflater.Factory2 {
    public final en f;

    public um(en enVar) {
        this.f = enVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        ln f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        en enVar = this.f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, enVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w00.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = pm.class.isAssignableFrom(zm.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    pm A = resourceId != -1 ? enVar.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = enVar.B(string);
                    }
                    if (A == null && id != -1) {
                        A = enVar.A(id);
                    }
                    if (A == null) {
                        zm D = enVar.D();
                        context.getClassLoader();
                        A = D.a(attributeValue);
                        A.r = true;
                        A.A = resourceId != 0 ? resourceId : id;
                        A.B = id;
                        A.C = string;
                        A.s = true;
                        A.w = enVar;
                        rm rmVar = enVar.t;
                        A.x = rmVar;
                        m3 m3Var = rmVar.s;
                        A.H = true;
                        if ((rmVar == null ? null : rmVar.r) != null) {
                            A.H = true;
                        }
                        f = enVar.a(A);
                        if (en.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.s = true;
                        A.w = enVar;
                        rm rmVar2 = enVar.t;
                        A.x = rmVar2;
                        m3 m3Var2 = rmVar2.s;
                        A.H = true;
                        if ((rmVar2 == null ? null : rmVar2.r) != null) {
                            A.H = true;
                        }
                        f = enVar.f(A);
                        if (en.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    mn mnVar = nn.a;
                    nn.b(new jn(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup));
                    nn.a(A).getClass();
                    A.I = viewGroup;
                    f.k();
                    f.j();
                    View view2 = A.J;
                    if (view2 == null) {
                        g9.s(f60.f("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.J.getTag() == null) {
                        A.J.setTag(string);
                    }
                    A.J.addOnAttachStateChangeListener(new tm(this, f));
                    return A.J;
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
