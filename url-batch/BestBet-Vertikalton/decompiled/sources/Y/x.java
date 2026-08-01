package Y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import g.AbstractActivityC0128i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1498a;

    public x(I i) {
        this.f1498a = i;
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
        I i = this.f1498a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f1268a);
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
                    T0.m mVar = i.f1304c;
                    ArrayList arrayList = (ArrayList) mVar.f1073a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = (AbstractComponentCallbacksC0050q) arrayList.get(size);
                            if (abstractComponentCallbacksC0050q != null && string.equals(abstractComponentCallbacksC0050q.f1479x)) {
                                A2 = abstractComponentCallbacksC0050q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) mVar.f1074b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f1349c;
                                    if (string.equals(A2.f1479x)) {
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
                    A2.f1468m = true;
                    A2.f1477v = resourceId != 0 ? resourceId : id;
                    A2.f1478w = id;
                    A2.f1479x = string;
                    A2.f1469n = true;
                    A2.f1473r = i;
                    C0053u c0053u = i.f1318t;
                    A2.f1474s = c0053u;
                    AbstractActivityC0128i abstractActivityC0128i = c0053u.f1489b;
                    A2.f1444C = true;
                    if ((c0053u == null ? null : c0053u.f1488a) != null) {
                        A2.f1444C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1469n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1469n = true;
                    A2.f1473r = i;
                    C0053u c0053u2 = i.f1318t;
                    A2.f1474s = c0053u2;
                    AbstractActivityC0128i abstractActivityC0128i2 = c0053u2.f1489b;
                    A2.f1444C = true;
                    if ((c0053u2 == null ? null : c0053u2.f1488a) != null) {
                        A2.f1444C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Z.c cVar = Z.d.f1524a;
                Z.d.b(new Z.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                Z.d.a(A2).getClass();
                A2.f1445D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1446E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1446E.getTag() == null) {
                    A2.f1446E.setTag(string);
                }
                A2.f1446E.addOnAttachStateChangeListener(new w(this, f2));
                return A2.f1446E;
            }
        }
        return null;
    }
}
