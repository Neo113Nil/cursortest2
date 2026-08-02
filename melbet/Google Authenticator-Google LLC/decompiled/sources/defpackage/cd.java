package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cd {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ca d;

    public final Bundle a(String str, Bundle bundle) {
        HashMap hashMap = this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public final bd b(String str) {
        gam gamVar = (gam) this.b.get(str);
        if (gamVar != null) {
            return (bd) gamVar.e;
        }
        return null;
    }

    final bd c(String str) {
        for (gam gamVar : this.b.values()) {
            if (gamVar != null) {
                Object obj = gamVar.e;
                bd bdVar = (bd) obj;
                if (!str.equals(bdVar.m)) {
                    obj = bdVar.E.b.c(str);
                }
                if (obj != null) {
                    return (bd) obj;
                }
            }
        }
        return null;
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        for (gam gamVar : this.b.values()) {
            if (gamVar != null) {
                arrayList.add(gamVar);
            }
        }
        return arrayList;
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (gam gamVar : this.b.values()) {
            if (gamVar != null) {
                arrayList.add(gamVar.e);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.a;
        if (arrayList2.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    final void g(bd bdVar) {
        ArrayList arrayList = this.a;
        if (arrayList.contains(bdVar)) {
            Objects.toString(bdVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(bdVar)));
        }
        synchronized (arrayList) {
            arrayList.add(bdVar);
        }
        bdVar.s = true;
    }

    final void h() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void i(bd bdVar) {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            arrayList.remove(bdVar);
        }
        bdVar.s = false;
    }

    final boolean j(String str) {
        return this.b.get(str) != null;
    }

    public final gam k(String str) {
        return (gam) this.b.get(str);
    }

    final void l(gam gamVar) {
        Object obj = gamVar.e;
        bd bdVar = (bd) obj;
        if (j(bdVar.m)) {
            return;
        }
        this.b.put(bdVar.m, gamVar);
        boolean z = bdVar.M;
        if (by.U(2)) {
            Objects.toString(obj);
        }
    }

    public final void m(gam gamVar) {
        Object obj = gamVar.e;
        bd bdVar = (bd) obj;
        if (bdVar.L) {
            this.d.d(bdVar);
        }
        HashMap hashMap = this.b;
        if (hashMap.get(bdVar.m) == gamVar && ((gam) hashMap.put(bdVar.m, null)) != null && by.U(2)) {
            Objects.toString(obj);
        }
    }
}
