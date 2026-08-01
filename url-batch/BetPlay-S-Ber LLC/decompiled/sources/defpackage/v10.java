package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v10 {
    public boolean b;
    public Bundle c;
    public boolean d;
    public p3 e;
    public final p10 a = new p10();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.d) {
            o8.t("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final u10 b() {
        String str;
        u10 u10Var;
        Iterator it = this.a.iterator();
        do {
            l10 l10Var = (l10) it;
            if (!l10Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) l10Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            u10Var = (u10) entry.getValue();
        } while (!op.d(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return u10Var;
    }

    public final void c(String str, u10 u10Var) {
        Object obj;
        u10Var.getClass();
        p10 p10Var = this.a;
        m10 a = p10Var.a(str);
        if (a != null) {
            obj = a.g;
        } else {
            m10 m10Var = new m10(str, u10Var);
            p10Var.i++;
            m10 m10Var2 = p10Var.g;
            if (m10Var2 == null) {
                p10Var.f = m10Var;
                p10Var.g = m10Var;
            } else {
                m10Var2.h = m10Var;
                m10Var.i = m10Var2;
                p10Var.g = m10Var;
            }
            obj = null;
        }
        if (((u10) obj) == null) {
            return;
        }
        o8.j("SavedStateProvider with the given key is already registered");
    }

    public final void d() {
        if (!this.f) {
            o8.t("Can not perform this action after onSaveInstanceState");
            return;
        }
        p3 p3Var = this.e;
        if (p3Var == null) {
            p3Var = new p3(this);
        }
        this.e = p3Var;
        try {
            dq.class.getDeclaredConstructor(null);
            p3 p3Var2 = this.e;
            if (p3Var2 != null) {
                ((LinkedHashSet) p3Var2.b).add(dq.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + dq.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
