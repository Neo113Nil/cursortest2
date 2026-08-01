package Z;

import a0.AbstractC0056d;
import a0.C0053a;
import a0.C0055c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import g.AbstractActivityC0110i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final I f1228a;

    public x(I i) {
        this.f1228a = i;
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
        I i = this.f1228a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f995a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0047q.class.isAssignableFrom(C.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0047q A2 = resourceId != -1 ? i.A(resourceId) : null;
                if (A2 == null && string != null) {
                    T0.g gVar = i.f1034c;
                    ArrayList arrayList = (ArrayList) gVar.f824a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) arrayList.get(size);
                            if (abstractComponentCallbacksC0047q != null && string.equals(abstractComponentCallbacksC0047q.f1209x)) {
                                A2 = abstractComponentCallbacksC0047q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) gVar.f825b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f1079c;
                                    if (string.equals(A2.f1209x)) {
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
                    A2.f1198m = true;
                    A2.f1207v = resourceId != 0 ? resourceId : id;
                    A2.f1208w = id;
                    A2.f1209x = string;
                    A2.f1199n = true;
                    A2.f1203r = i;
                    C0050u c0050u = i.f1048t;
                    A2.f1204s = c0050u;
                    AbstractActivityC0110i abstractActivityC0110i = c0050u.f1219b;
                    A2.f1174C = true;
                    if ((c0050u == null ? null : c0050u.f1218a) != null) {
                        A2.f1174C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1199n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1199n = true;
                    A2.f1203r = i;
                    C0050u c0050u2 = i.f1048t;
                    A2.f1204s = c0050u2;
                    AbstractActivityC0110i abstractActivityC0110i2 = c0050u2.f1219b;
                    A2.f1174C = true;
                    if ((c0050u2 == null ? null : c0050u2.f1218a) != null) {
                        A2.f1174C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0055c c0055c = AbstractC0056d.f1311a;
                AbstractC0056d.b(new C0053a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                AbstractC0056d.a(A2).getClass();
                A2.f1175D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1176E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1176E.getTag() == null) {
                    A2.f1176E.setTag(string);
                }
                A2.f1176E.addOnAttachStateChangeListener(new w(this, f2));
                return A2.f1176E;
            }
        }
        return null;
    }
}
