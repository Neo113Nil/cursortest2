package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import i.AbstractActivityC0525l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements LayoutInflater.Factory2 {

    /* renamed from: d, reason: collision with root package name */
    public final Q f3579d;

    public D(Q q4) {
        this.f3579d = q4;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        ComponentCallbacksC0228t componentCallbacksC0228t;
        int i2;
        Y g7;
        boolean equals = B.class.getName().equals(str);
        Q q4 = this.f3579d;
        if (equals) {
            return new B(context, attributeSet, q4);
        }
        ComponentCallbacksC0228t componentCallbacksC0228t2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f2893a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int i5 = 2;
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z7 = ComponentCallbacksC0228t.class.isAssignableFrom(J.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z7 = false;
                }
                if (z7) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    ComponentCallbacksC0228t fragment = resourceId != -1 ? q4.C(resourceId) : null;
                    if (fragment == null && string != null) {
                        P0.i iVar = q4.f3615c;
                        ArrayList arrayList = (ArrayList) iVar.f2200a;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                componentCallbacksC0228t = componentCallbacksC0228t2;
                                i2 = i5;
                                Iterator it = ((HashMap) iVar.f2201b).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        fragment = componentCallbacksC0228t;
                                        break;
                                    }
                                    Y y7 = (Y) it.next();
                                    if (y7 != null) {
                                        fragment = y7.f3670c;
                                        if (string.equals(fragment.f3781G)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                componentCallbacksC0228t = componentCallbacksC0228t2;
                                ComponentCallbacksC0228t componentCallbacksC0228t3 = (ComponentCallbacksC0228t) arrayList.get(size);
                                i2 = i5;
                                if (componentCallbacksC0228t3 != null && string.equals(componentCallbacksC0228t3.f3781G)) {
                                    fragment = componentCallbacksC0228t3;
                                    break;
                                }
                                size--;
                                componentCallbacksC0228t2 = componentCallbacksC0228t;
                                i5 = i2;
                            }
                        }
                    } else {
                        componentCallbacksC0228t = null;
                        i2 = 2;
                    }
                    if (fragment == null && id != -1) {
                        fragment = q4.C(id);
                    }
                    if (fragment == null) {
                        J G4 = q4.G();
                        context.getClassLoader();
                        fragment = G4.a(attributeValue);
                        fragment.f3812v = true;
                        fragment.f3779E = resourceId != 0 ? resourceId : id;
                        fragment.f3780F = id;
                        fragment.f3781G = string;
                        fragment.f3813w = true;
                        fragment.f3775A = q4;
                        C0232x c0232x = q4.f3633v;
                        fragment.f3776B = c0232x;
                        AbstractActivityC0525l abstractActivityC0525l = c0232x.f3823e;
                        fragment.f3786L = true;
                        if ((c0232x == null ? componentCallbacksC0228t : c0232x.f3822d) != null) {
                            fragment.f3786L = true;
                        }
                        g7 = q4.a(fragment);
                        if (Q.J(i2)) {
                            Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragment.f3813w) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragment.f3813w = true;
                        fragment.f3775A = q4;
                        C0232x c0232x2 = q4.f3633v;
                        fragment.f3776B = c0232x2;
                        AbstractActivityC0525l abstractActivityC0525l2 = c0232x2.f3823e;
                        fragment.f3786L = true;
                        if ((c0232x2 == null ? componentCallbacksC0228t : c0232x2.f3822d) != null) {
                            fragment.f3786L = true;
                        }
                        g7 = q4.g(fragment);
                        if (Q.J(i2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    Z.c cVar = Z.d.f2934a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Z.e eVar = new Z.e(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
                    Z.d.c(eVar);
                    Z.c a7 = Z.d.a(fragment);
                    if (a7.f2932a.contains(Z.b.f2928l) && Z.d.e(a7, fragment.getClass(), Z.e.class)) {
                        Z.d.b(a7, eVar);
                    }
                    fragment.f3787M = viewGroup;
                    g7.j();
                    g7.i();
                    throw new IllegalStateException(r4.f.d("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
