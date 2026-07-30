package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e0.AbstractC4467a;
import f0.AbstractC4489d;
import f0.C4488c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B implements LayoutInflater.Factory2 {

    /* renamed from: n, reason: collision with root package name */
    public final N f4928n;

    public B(N n9) {
        this.f4928n = n9;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.fragment.app.x] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.fragment.app.x] */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z8;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s;
        int i;
        V f6;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = null;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        N n9 = this.f4928n;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, n9);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4467a.f37233a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int i4 = 2;
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z8 = AbstractComponentCallbacksC0485s.class.isAssignableFrom(G.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z8 = false;
                }
                if (z8) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0485s z9 = resourceId != -1 ? n9.z(resourceId) : null;
                    if (z9 == null && string != null) {
                        S0.i iVar = n9.f4964c;
                        ArrayList arrayList = (ArrayList) iVar.f2901u;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0485s = abstractComponentCallbacksC0485s2;
                                i = i4;
                                Iterator it = ((HashMap) iVar.f2902v).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z9 = abstractComponentCallbacksC0485s;
                                        break;
                                    }
                                    V v6 = (V) it.next();
                                    if (v6 != null) {
                                        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s3 = v6.f5019c;
                                        if (string.equals(abstractComponentCallbacksC0485s3.f5155Q)) {
                                            z9 = abstractComponentCallbacksC0485s3;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                abstractComponentCallbacksC0485s = abstractComponentCallbacksC0485s2;
                                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s4 = (AbstractComponentCallbacksC0485s) arrayList.get(size);
                                i = i4;
                                if (abstractComponentCallbacksC0485s4 != null && string.equals(abstractComponentCallbacksC0485s4.f5155Q)) {
                                    z9 = abstractComponentCallbacksC0485s4;
                                    break;
                                }
                                size--;
                                i4 = i;
                                abstractComponentCallbacksC0485s2 = abstractComponentCallbacksC0485s;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0485s = null;
                        i = 2;
                    }
                    if (z9 == null && id != -1) {
                        z9 = n9.z(id);
                    }
                    if (z9 == null) {
                        G B8 = n9.B();
                        context.getClassLoader();
                        z9 = B8.a(attributeValue);
                        z9.f5145F = true;
                        z9.f5153O = resourceId != 0 ? resourceId : id;
                        z9.f5154P = id;
                        z9.f5155Q = string;
                        z9.f5146G = true;
                        z9.f5149K = n9;
                        C0489w c0489w = n9.f4980t;
                        z9.f5150L = c0489w;
                        AbstractActivityC0490x abstractActivityC0490x = c0489w.f5188u;
                        z9.f5160V = true;
                        if (c0489w != null) {
                            abstractComponentCallbacksC0485s = c0489w.f5187n;
                        }
                        if (abstractComponentCallbacksC0485s != null) {
                            z9.f5160V = true;
                        }
                        f6 = n9.a(z9);
                        if (N.E(i)) {
                            Log.v("FragmentManager", "Fragment " + z9 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (z9.f5146G) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        z9.f5146G = true;
                        z9.f5149K = n9;
                        C0489w c0489w2 = n9.f4980t;
                        z9.f5150L = c0489w2;
                        AbstractActivityC0490x abstractActivityC0490x2 = c0489w2.f5188u;
                        z9.f5160V = true;
                        if (c0489w2 != null) {
                            abstractComponentCallbacksC0485s = c0489w2.f5187n;
                        }
                        if (abstractComponentCallbacksC0485s != null) {
                            z9.f5160V = true;
                        }
                        f6 = n9.f(z9);
                        if (N.E(i)) {
                            Log.v("FragmentManager", "Retained Fragment " + z9 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C4488c c4488c = AbstractC4489d.f37549a;
                    AbstractC4489d.b(new f0.e(z9, viewGroup, 0));
                    AbstractC4489d.a(z9).getClass();
                    z9.f5161W = viewGroup;
                    f6.k();
                    f6.j();
                    View view2 = z9.f5162X;
                    if (view2 == null) {
                        throw new IllegalStateException(D.y.k("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (z9.f5162X.getTag() == null) {
                        z9.f5162X.setTag(string);
                    }
                    z9.f5162X.addOnAttachStateChangeListener(new A(this, f6));
                    return z9.f5162X;
                }
            }
        }
        return null;
    }
}
