package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class z implements LayoutInflater.Factory2 {

    /* renamed from: f, reason: collision with root package name */
    public final k0 f578f;

    public z(k0 k0Var) {
        this.f578f = k0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        u uVar;
        q0 f2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        k0 k0Var = this.f578f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, k0Var);
        }
        u uVar2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.a.f3612a);
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
                    u z4 = resourceId != -1 ? k0Var.z(resourceId) : null;
                    if (z4 == null && string != null) {
                        a0.j jVar = k0Var.f443c;
                        ArrayList arrayList = (ArrayList) jVar.f102h;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                uVar = uVar2;
                                Iterator it = ((HashMap) jVar.f100f).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z4 = uVar;
                                        break;
                                    }
                                    q0 q0Var = (q0) it.next();
                                    if (q0Var != null) {
                                        z4 = q0Var.f511c;
                                        if (string.equals(z4.C)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                u uVar3 = (u) arrayList.get(size);
                                uVar = uVar2;
                                if (uVar3 != null && string.equals(uVar3.C)) {
                                    z4 = uVar3;
                                    break;
                                }
                                size--;
                                uVar2 = uVar;
                            }
                        }
                    } else {
                        uVar = null;
                    }
                    if (z4 == null && id != -1) {
                        z4 = k0Var.z(id);
                    }
                    if (z4 == null) {
                        e0 B = k0Var.B();
                        context.getClassLoader();
                        z4 = B.a(attributeValue);
                        z4.f546r = true;
                        z4.A = resourceId != 0 ? resourceId : id;
                        z4.B = id;
                        z4.C = string;
                        z4.f547s = true;
                        z4.f551w = k0Var;
                        w wVar = k0Var.f458t;
                        z4.f552x = wVar;
                        g.j jVar2 = wVar.f568o;
                        z4.H = true;
                        if ((wVar == null ? uVar : wVar.f567n) != null) {
                            z4.H = true;
                        }
                        f2 = k0Var.a(z4);
                        if (k0.E(2)) {
                            Log.v("FragmentManager", "Fragment " + z4 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (z4.f547s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        z4.f547s = true;
                        z4.f551w = k0Var;
                        w wVar2 = k0Var.f458t;
                        z4.f552x = wVar2;
                        g.j jVar3 = wVar2.f568o;
                        z4.H = true;
                        if ((wVar2 == null ? uVar : wVar2.f567n) != null) {
                            z4.H = true;
                        }
                        f2 = k0Var.f(z4);
                        if (k0.E(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + z4 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    y0.b bVar = y0.c.f3779a;
                    y0.c.b(new y0.a(z4, "Attempting to use <fragment> tag to add fragment " + z4 + " to container " + viewGroup));
                    y0.c.a(z4).getClass();
                    z4.I = viewGroup;
                    f2.k();
                    f2.j();
                    View view2 = z4.J;
                    if (view2 == null) {
                        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (z4.J.getTag() == null) {
                        z4.J.setTag(string);
                    }
                    z4.J.addOnAttachStateChangeListener(new y(this, f2));
                    return z4.J;
                }
            }
        }
        return null;
    }
}
