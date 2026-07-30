package defpackage;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class fc3 implements kc3, cc3 {
    public final HashMap m = new HashMap();

    @Override // defpackage.kc3
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.cc3
    public final void b(String str, kc3 kc3Var) {
        HashMap hashMap = this.m;
        if (kc3Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, kc3Var);
        }
    }

    @Override // defpackage.cc3
    public final kc3 c(String str) {
        HashMap hashMap = this.m;
        return hashMap.containsKey(str) ? (kc3) hashMap.get(str) : kc3.e;
    }

    @Override // defpackage.cc3
    public final boolean d(String str) {
        return this.m.containsKey(str);
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return new ac3(this.m.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fc3) {
            return this.m.equals(((fc3) obj).m);
        }
        return false;
    }

    @Override // defpackage.kc3
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // defpackage.kc3
    public kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        return InAppPurchaseConstants.METHOD_TO_STRING.equals(str) ? new pc3(toString()) : cc3.g(this, new pc3(str), js0Var, arrayList);
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        fc3 fc3Var = new fc3();
        for (Map.Entry entry : this.m.entrySet()) {
            boolean z = entry.getValue() instanceof cc3;
            HashMap hashMap = fc3Var.m;
            if (z) {
                hashMap.put((String) entry.getKey(), (kc3) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((kc3) entry.getValue()).k());
            }
        }
        return fc3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.m;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.kc3
    public final String zzc() {
        return "[object Object]";
    }
}
