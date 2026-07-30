package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pp1 {
    public final cr1 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public pp1(cr1 cr1Var, String str) {
        this.a = cr1Var;
        this.b = str;
    }

    public op1 a() {
        op1 b = b();
        b.getClass();
        LinkedHashMap linkedHashMap = b.q;
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            yo1 yo1Var = (yo1) entry.getValue();
            str.getClass();
            yo1Var.getClass();
            linkedHashMap.put(str, yo1Var);
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lp1 lp1Var = (lp1) obj;
            lp1Var.getClass();
            ArrayList F = bd3.F(linkedHashMap, new np1(lp1Var, 0));
            if (!F.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + lp1Var.a + " can't be used to open destination " + b + ".\nFollowing required arguments are missing: " + F).toString());
            }
            b.o.add(lp1Var);
        }
        Iterator it = this.e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            b71.o();
            return null;
        }
        String str2 = this.b;
        if (str2 != null) {
            if (up2.y(str2)) {
                lh.e("Cannot have an empty route");
                return null;
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            ArrayList F2 = bd3.F(linkedHashMap, new np1(new lp1(concat), 1));
            if (!F2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b + ". Following required arguments are missing: " + F2).toString());
            }
            b.t = ya1.b(new u(20, concat));
            b.r = concat.hashCode();
            b.s = str2;
        }
        return b;
    }

    public op1 b() {
        return this.a.a();
    }
}
