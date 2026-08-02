package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvt {
    public final List a;
    public final List b;
    public final Map c;
    public final dvl d;

    public dvt(List list, List list2, Map map, dvl dvlVar) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = dvlVar;
    }

    public final boolean a() {
        List list = this.a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((jhy) it.next()).f == 109340) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvt)) {
            return false;
        }
        dvt dvtVar = (dvt) obj;
        return ksp.b(this.a, dvtVar.a) && ksp.b(this.b, dvtVar.b) && ksp.b(this.c, dvtVar.c) && ksp.b(this.d, dvtVar.d);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dvl dvlVar = this.d;
        return (hashCode * 31) + (dvlVar == null ? 0 : dvlVar.hashCode());
    }

    public final String toString() {
        return "InAppReachCards(cardsAboveAccountSwitcher=" + this.a + ", cardsBelowAccountSwitcher=" + this.b + ", nonSelectedAccountCriticalAlerts=" + this.c + ", g1AccountData=" + this.d + ")";
    }
}
