package Y;

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
    public final I f1138a;

    public x(I i) {
        this.f1138a = i;
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
        I i = this.f1138a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f916a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0051q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0051q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    U.u uVar = i.f945c;
                    ArrayList arrayList = (ArrayList) uVar.f874a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = (AbstractComponentCallbacksC0051q) arrayList.get(size);
                            if (abstractComponentCallbacksC0051q != null && string.equals(abstractComponentCallbacksC0051q.f1120x)) {
                                A2 = abstractComponentCallbacksC0051q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) uVar.f875b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f990c;
                                    if (string.equals(A2.f1120x)) {
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
                    A2.f1109m = true;
                    A2.f1118v = resourceId != 0 ? resourceId : id;
                    A2.f1119w = id;
                    A2.f1120x = string;
                    A2.f1110n = true;
                    A2.f1114r = i;
                    C0054u c0054u = i.f959t;
                    A2.f1115s = c0054u;
                    AbstractActivityC0106i abstractActivityC0106i = c0054u.f1130f;
                    A2.f1085C = true;
                    if ((c0054u == null ? null : c0054u.f1129e) != null) {
                        A2.f1085C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1110n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1110n = true;
                    A2.f1114r = i;
                    C0054u c0054u2 = i.f959t;
                    A2.f1115s = c0054u2;
                    AbstractActivityC0106i abstractActivityC0106i2 = c0054u2.f1130f;
                    A2.f1085C = true;
                    if ((c0054u2 == null ? null : c0054u2.f1129e) != null) {
                        A2.f1085C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Z.c cVar = Z.d.f1149a;
                Z.d.b(new Z.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                Z.d.a(A2).getClass();
                A2.f1086D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1087E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1087E.getTag() == null) {
                    A2.f1087E.setTag(string);
                }
                A2.f1087E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0056w(this, f2));
                return A2.f1087E;
            }
        }
        return null;
    }
}
