package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import g.AbstractActivityC0125i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1006a;

    public x(I i) {
        this.f1006a = i;
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
        I i = this.f1006a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W.a.f785a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0048q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0048q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    T.t tVar = i.f813c;
                    ArrayList arrayList = (ArrayList) tVar.f747a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = (AbstractComponentCallbacksC0048q) arrayList.get(size);
                            if (abstractComponentCallbacksC0048q != null && string.equals(abstractComponentCallbacksC0048q.f988x)) {
                                A2 = abstractComponentCallbacksC0048q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) tVar.f748b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f858c;
                                    if (string.equals(A2.f988x)) {
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
                    A2.f977m = true;
                    A2.f986v = resourceId != 0 ? resourceId : id;
                    A2.f987w = id;
                    A2.f988x = string;
                    A2.f978n = true;
                    A2.f982r = i;
                    C0051u c0051u = i.f827t;
                    A2.f983s = c0051u;
                    AbstractActivityC0125i abstractActivityC0125i = c0051u.f998f;
                    A2.f953C = true;
                    if ((c0051u == null ? null : c0051u.f997e) != null) {
                        A2.f953C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f978n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f978n = true;
                    A2.f982r = i;
                    C0051u c0051u2 = i.f827t;
                    A2.f983s = c0051u2;
                    AbstractActivityC0125i abstractActivityC0125i2 = c0051u2.f998f;
                    A2.f953C = true;
                    if ((c0051u2 == null ? null : c0051u2.f997e) != null) {
                        A2.f953C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Y.c cVar = Y.d.f1024a;
                Y.d.b(new Y.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                Y.d.a(A2).getClass();
                A2.f954D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f955E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f955E.getTag() == null) {
                    A2.f955E.setTag(string);
                }
                A2.f955E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0053w(this, f2));
                return A2.f955E;
            }
        }
        return null;
    }
}
