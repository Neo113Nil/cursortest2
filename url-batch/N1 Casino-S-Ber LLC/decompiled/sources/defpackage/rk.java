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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class rk implements LayoutInflater.Factory2 {
    public final bl f;

    public rk(bl blVar) {
        this.f = blVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        a f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        bl blVar = this.f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, blVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = mk.class.isAssignableFrom(wk.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    mk A = resourceId != -1 ? blVar.A(resourceId) : null;
                    if (A == null && string != null) {
                        A = blVar.B(string);
                    }
                    if (A == null && id != -1) {
                        A = blVar.A(id);
                    }
                    if (A == null) {
                        wk D = blVar.D();
                        context.getClassLoader();
                        A = D.a(attributeValue);
                        A.r = true;
                        A.A = resourceId != 0 ? resourceId : id;
                        A.B = id;
                        A.C = string;
                        A.s = true;
                        A.w = blVar;
                        ok okVar = blVar.t;
                        A.x = okVar;
                        c3 c3Var = okVar.p;
                        A.H = true;
                        if ((okVar == null ? null : okVar.o) != null) {
                            A.H = true;
                        }
                        f = blVar.a(A);
                        if (bl.G(2)) {
                            Log.v("FragmentManager", "Fragment " + A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (A.s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        A.s = true;
                        A.w = blVar;
                        ok okVar2 = blVar.t;
                        A.x = okVar2;
                        c3 c3Var2 = okVar2.p;
                        A.H = true;
                        if ((okVar2 == null ? null : okVar2.o) != null) {
                            A.H = true;
                        }
                        f = blVar.f(A);
                        if (bl.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    hl hlVar = il.a;
                    il.b(new fl(A, "Attempting to use <fragment> tag to add fragment " + A + " to container " + viewGroup));
                    il.a(A).getClass();
                    A.I = viewGroup;
                    f.k();
                    f.j();
                    View view2 = A.J;
                    if (view2 == null) {
                        t8.h(attributeValue, " did not create a view.", "Fragment ");
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (A.J.getTag() == null) {
                        A.J.setTag(string);
                    }
                    A.J.addOnAttachStateChangeListener(new qk(this, f));
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
