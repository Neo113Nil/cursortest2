package Z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import g.AbstractActivityC0106i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1219a;

    public x(I i) {
        this.f1219a = i;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        O f2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        I i = this.f1219a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f986a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0050q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0050q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    S0.g gVar = i.f1015c;
                    ArrayList arrayList = (ArrayList) gVar.f822a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) arrayList.get(size);
                            if (abstractComponentCallbacksC0050q != null && string.equals(abstractComponentCallbacksC0050q.f1200x)) {
                                A2 = abstractComponentCallbacksC0050q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) gVar.f823b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f1064c;
                                    if (string.equals(A2.f1200x)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (A2 == null && id != -1) {
                    A2 = i.A(id);
                }
                if (A2 == null) {
                    C C2 = i.C();
                    context.getClassLoader();
                    A2 = C2.a(attributeValue);
                    A2.f1189m = true;
                    A2.f1198v = resourceId != 0 ? resourceId : id;
                    A2.f1199w = id;
                    A2.f1200x = string;
                    A2.f1190n = true;
                    A2.f1194r = i;
                    C0053u c0053u = i.f1030t;
                    A2.f1195s = c0053u;
                    AbstractActivityC0106i abstractActivityC0106i = c0053u.f1210f;
                    A2.f1164C = true;
                    if ((c0053u == null ? null : c0053u.f1209e) != null) {
                        A2.f1164C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1190n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1190n = true;
                    A2.f1194r = i;
                    C0053u c0053u2 = i.f1030t;
                    A2.f1195s = c0053u2;
                    AbstractActivityC0106i abstractActivityC0106i2 = c0053u2.f1210f;
                    A2.f1164C = true;
                    if ((c0053u2 == null ? null : c0053u2.f1209e) != null) {
                        A2.f1164C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                a0.c cVar = a0.d.f1302a;
                a0.d.b(new a0.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                a0.d.a(A2).getClass();
                A2.f1165D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1166E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1166E.getTag() == null) {
                    A2.f1166E.setTag(string);
                }
                A2.f1166E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0055w(this, f2));
                return A2.f1166E;
            }
        }
        return null;
    }
}
