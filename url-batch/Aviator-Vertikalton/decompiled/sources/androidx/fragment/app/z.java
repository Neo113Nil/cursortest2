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

/* loaded from: classes.dex */
public final class z implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final K f1434a;

    public z(K k2) {
        this.f1434a = k2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        S f2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        K k2 = this.f1434a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, k2);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W.a.f859a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0060q.class.isAssignableFrom(E.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0060q A2 = resourceId != -1 ? k2.A(resourceId) : null;
                if (A2 == null && string != null) {
                    T.v vVar = k2.f1225c;
                    ArrayList arrayList = (ArrayList) vVar.f823a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = (AbstractComponentCallbacksC0060q) arrayList.get(size);
                            if (abstractComponentCallbacksC0060q != null && string.equals(abstractComponentCallbacksC0060q.f1415x)) {
                                A2 = abstractComponentCallbacksC0060q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) vVar.f824b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                S s2 = (S) it.next();
                                if (s2 != null) {
                                    A2 = s2.f1274c;
                                    if (string.equals(A2.f1415x)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (A2 == null && id != -1) {
                    A2 = k2.A(id);
                }
                if (A2 == null) {
                    E C2 = k2.C();
                    context.getClassLoader();
                    A2 = C2.a(attributeValue);
                    A2.f1404m = true;
                    A2.f1413v = resourceId != 0 ? resourceId : id;
                    A2.f1414w = id;
                    A2.f1415x = string;
                    A2.f1405n = true;
                    A2.f1409r = k2;
                    C0063u c0063u = k2.f1240t;
                    A2.f1410s = c0063u;
                    AbstractActivityC0064v abstractActivityC0064v = c0063u.h;
                    A2.f1379C = true;
                    if ((c0063u == null ? null : c0063u.f1423g) != null) {
                        A2.f1379C = true;
                    }
                    f2 = k2.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1405n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1405n = true;
                    A2.f1409r = k2;
                    C0063u c0063u2 = k2.f1240t;
                    A2.f1410s = c0063u2;
                    AbstractActivityC0064v abstractActivityC0064v2 = c0063u2.h;
                    A2.f1379C = true;
                    if ((c0063u2 == null ? null : c0063u2.f1423g) != null) {
                        A2.f1379C = true;
                    }
                    f2 = k2.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                X.c cVar = X.d.f867a;
                X.d.b(new X.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                X.d.a(A2).getClass();
                A2.f1380D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1381E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1381E.getTag() == null) {
                    A2.f1381E.setTag(string);
                }
                A2.f1381E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0067y(this, f2));
                return A2.f1381E;
            }
        }
        return null;
    }
}
