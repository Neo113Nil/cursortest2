package Z;

import a0.AbstractC0062d;
import a0.C0059a;
import a0.C0061c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import h.AbstractActivityC0132i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1647a;

    public x(I i) {
        this.f1647a = i;
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
        I i = this.f1647a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f1388a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0053q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0053q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    V.v vVar = i.f1447c;
                    ArrayList arrayList = (ArrayList) vVar.f1305a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = (AbstractComponentCallbacksC0053q) arrayList.get(size);
                            if (abstractComponentCallbacksC0053q != null && string.equals(abstractComponentCallbacksC0053q.f1628x)) {
                                A2 = abstractComponentCallbacksC0053q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) vVar.f1306b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f1494c;
                                    if (string.equals(A2.f1628x)) {
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
                    A2.f1617m = true;
                    A2.f1626v = resourceId != 0 ? resourceId : id;
                    A2.f1627w = id;
                    A2.f1628x = string;
                    A2.f1618n = true;
                    A2.f1622r = i;
                    C0056u c0056u = i.f1461t;
                    A2.f1623s = c0056u;
                    AbstractActivityC0132i abstractActivityC0132i = c0056u.f1638c;
                    A2.f1593C = true;
                    if ((c0056u == null ? null : c0056u.f1637b) != null) {
                        A2.f1593C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1618n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1618n = true;
                    A2.f1622r = i;
                    C0056u c0056u2 = i.f1461t;
                    A2.f1623s = c0056u2;
                    AbstractActivityC0132i abstractActivityC0132i2 = c0056u2.f1638c;
                    A2.f1593C = true;
                    if ((c0056u2 == null ? null : c0056u2.f1637b) != null) {
                        A2.f1593C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0061c c0061c = AbstractC0062d.f1665a;
                AbstractC0062d.b(new C0059a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                AbstractC0062d.a(A2).getClass();
                A2.f1594D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1595E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1595E.getTag() == null) {
                    A2.f1595E.setTag(string);
                }
                A2.f1595E.addOnAttachStateChangeListener(new w(this, f2));
                return A2.f1595E;
            }
        }
        return null;
    }
}
