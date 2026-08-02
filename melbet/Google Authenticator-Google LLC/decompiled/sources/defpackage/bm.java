package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bm implements LayoutInflater.Factory2 {
    public final by a;

    public bm(by byVar) {
        this.a = byVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        gam ai;
        if (bj.class.getName().equals(str)) {
            return new bj(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = bk.a;
                try {
                    if (bd.class.isAssignableFrom(bk.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.ad(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        bd c = resourceId != -1 ? this.a.c(resourceId) : null;
                        if (c == null && string != null) {
                            c = this.a.d(string);
                        }
                        if (c == null && id != -1) {
                            c = this.a.c(id);
                        }
                        if (c == null) {
                            by byVar = this.a;
                            bk g = byVar.g();
                            context.getClassLoader();
                            c = g.b(attributeValue);
                            c.w = true;
                            c.G = resourceId != 0 ? resourceId : id;
                            c.H = id;
                            c.I = string;
                            c.x = true;
                            c.C = byVar;
                            c.D = byVar.l;
                            Context context2 = byVar.l.c;
                            Bundle bundle = c.i;
                            c.av();
                            ai = byVar.ah(c);
                            if (by.U(2)) {
                                Objects.toString(c);
                                Integer.toHexString(resourceId);
                            }
                        } else {
                            if (c.x) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            c.x = true;
                            by byVar2 = this.a;
                            c.C = byVar2;
                            c.D = byVar2.l;
                            Context context3 = byVar2.l.c;
                            c.av();
                            ai = byVar2.ai(c);
                            if (by.U(2)) {
                                Objects.toString(c);
                                Integer.toHexString(resourceId);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = ado.a;
                        c.getClass();
                        adp adpVar = new adp(c, viewGroup);
                        ado.d(adpVar);
                        adn b = ado.b(c);
                        if (b.b.contains(adm.d) && ado.e(b, c.getClass(), adpVar.getClass())) {
                            ado.c(b, adpVar);
                        }
                        c.Q = viewGroup;
                        ai.l();
                        ai.k();
                        View view2 = c.R;
                        if (view2 == null) {
                            throw new IllegalStateException(a.Z(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (c.R.getTag() == null) {
                            c.R.setTag(string);
                        }
                        c.R.addOnAttachStateChangeListener(new abb(this, ai, 1));
                        return c.R;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
