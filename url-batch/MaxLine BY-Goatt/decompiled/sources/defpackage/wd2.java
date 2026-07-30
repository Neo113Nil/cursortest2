package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wd2 {
    public final yd2 a;
    public pe b;

    public wd2(yd2 yd2Var) {
        this.a = yd2Var;
    }

    public final Bundle a(String str) {
        yd2 yd2Var = this.a;
        if (!yd2Var.g) {
            lh.g("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = yd2Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle A = bundle.containsKey(str) ? zm3.A(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            yd2Var.f = null;
        }
        return A;
    }

    public final vd2 b() {
        vd2 vd2Var;
        yd2 yd2Var = this.a;
        synchronized (yd2Var.c) {
            Iterator it = yd2Var.d.entrySet().iterator();
            do {
                vd2Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                vd2 vd2Var2 = (vd2) entry.getValue();
                if (Intrinsics.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    vd2Var = vd2Var2;
                }
            } while (vd2Var == null);
        }
        return vd2Var;
    }

    public final void c(String str, vd2 vd2Var) {
        vd2Var.getClass();
        yd2 yd2Var = this.a;
        synchronized (yd2Var.c) {
            if (yd2Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            yd2Var.d.put(str, vd2Var);
            Unit unit = Unit.a;
        }
    }

    public final void d() {
        if (!this.a.h) {
            lh.g("Can not perform this action after onSaveInstanceState");
            return;
        }
        pe peVar = this.b;
        if (peVar == null) {
            peVar = new pe(this);
        }
        this.b = peVar;
        try {
            rc1.class.getDeclaredConstructor(null);
            pe peVar2 = this.b;
            if (peVar2 != null) {
                ((LinkedHashSet) peVar2.b).add(rc1.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + rc1.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
