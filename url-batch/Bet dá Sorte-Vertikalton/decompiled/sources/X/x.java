package X;

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
    public final I f1092a;

    public x(I i) {
        this.f1092a = i;
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
        I i = this.f1092a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W.a.f870a);
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
                    T.u uVar = i.f899c;
                    ArrayList arrayList = (ArrayList) uVar.f816a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = (AbstractComponentCallbacksC0047q) arrayList.get(size);
                            if (abstractComponentCallbacksC0047q != null && string.equals(abstractComponentCallbacksC0047q.f1074x)) {
                                A2 = abstractComponentCallbacksC0047q;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) uVar.f817b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    A2 = null;
                                    break;
                                }
                                O o2 = (O) it.next();
                                if (o2 != null) {
                                    A2 = o2.f944c;
                                    if (string.equals(A2.f1074x)) {
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
                    A2.f1063m = true;
                    A2.f1072v = resourceId != 0 ? resourceId : id;
                    A2.f1073w = id;
                    A2.f1074x = string;
                    A2.f1064n = true;
                    A2.f1068r = i;
                    C0050u c0050u = i.f913t;
                    A2.f1069s = c0050u;
                    AbstractActivityC0128i abstractActivityC0128i = c0050u.f1084f;
                    A2.f1039C = true;
                    if ((c0050u == null ? null : c0050u.f1083e) != null) {
                        A2.f1039C = true;
                    }
                    f2 = i.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1064n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1064n = true;
                    A2.f1068r = i;
                    C0050u c0050u2 = i.f913t;
                    A2.f1069s = c0050u2;
                    AbstractActivityC0128i abstractActivityC0128i2 = c0050u2.f1084f;
                    A2.f1039C = true;
                    if ((c0050u2 == null ? null : c0050u2.f1083e) != null) {
                        A2.f1039C = true;
                    }
                    f2 = i.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Y.c cVar = Y.d.f1103a;
                Y.d.b(new Y.a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                Y.d.a(A2).getClass();
                A2.f1040D = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1041E;
                if (view2 == null) {
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1041E.getTag() == null) {
                    A2.f1041E.setTag(string);
                }
                A2.f1041E.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0052w(this, f2));
                return A2.f1041E;
            }
        }
        return null;
    }
}
