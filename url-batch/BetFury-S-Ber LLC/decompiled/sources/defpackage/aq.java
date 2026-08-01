package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class aq implements LayoutInflater.Factory2 {
    public final c f;

    public aq(c cVar) {
        this.f = cVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        e f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        c cVar = this.f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, cVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a70.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = a.class.isAssignableFrom(fq.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    a A = resourceId != -1 ? cVar.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = cVar.B(string);
                    }
                    if (A == null && id != -1) {
                        A = cVar.A(id);
                    }
                    if (A == null) {
                        fq D = cVar.D();
                        context.getClassLoader();
                        A = D.a(attributeValue);
                        A.r = true;
                        A.A = resourceId != 0 ? resourceId : id;
                        A.B = id;
                        A.C = string;
                        A.s = true;
                        A.w = cVar;
                        xp xpVar = cVar.t;
                        A.x = xpVar;
                        u3 u3Var = xpVar.p;
                        A.H = true;
                        if ((xpVar == null ? null : xpVar.o) != null) {
                            A.H = true;
                        }
                        f = cVar.a(A);
                        if (c.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.s = true;
                        A.w = cVar;
                        xp xpVar2 = cVar.t;
                        A.x = xpVar2;
                        u3 u3Var2 = xpVar2.p;
                        A.H = true;
                        if ((xpVar2 == null ? null : xpVar2.o) != null) {
                            A.H = true;
                        }
                        f = cVar.f(A);
                        if (c.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    sq sqVar = tq.a;
                    tq.b(new oq(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup));
                    tq.a(A).getClass();
                    rq rqVar = rq.PENALTY_LOG;
                    A.I = viewGroup;
                    f.k();
                    f.j();
                    View view2 = A.J;
                    if (view2 == null) {
                        s9.u(r7.c("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.J.getTag() == null) {
                        A.J.setTag(string);
                    }
                    A.J.addOnAttachStateChangeListener(new zp(this, f));
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
