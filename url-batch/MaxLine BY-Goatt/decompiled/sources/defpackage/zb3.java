package defpackage;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zb3 implements kc3, cc3 {
    public final String m;
    public final HashMap n = new HashMap();

    public zb3(String str) {
        this.m = str;
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // defpackage.cc3
    public final void b(String str, kc3 kc3Var) {
        HashMap hashMap = this.n;
        if (kc3Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, kc3Var);
        }
    }

    @Override // defpackage.cc3
    public final kc3 c(String str) {
        HashMap hashMap = this.n;
        return hashMap.containsKey(str) ? (kc3) hashMap.get(str) : kc3.e;
    }

    @Override // defpackage.cc3
    public final boolean d(String str) {
        return this.n.containsKey(str);
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return new ac3(this.n.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb3)) {
            return false;
        }
        zb3 zb3Var = (zb3) obj;
        String str = this.m;
        if (str != null) {
            return str.equals(zb3Var.m);
        }
        return false;
    }

    @Override // defpackage.kc3
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    public abstract kc3 h(js0 js0Var, List list);

    public final int hashCode() {
        String str = this.m;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        return InAppPurchaseConstants.METHOD_TO_STRING.equals(str) ? new pc3(this.m) : cc3.g(this, new pc3(str), js0Var, arrayList);
    }

    @Override // defpackage.kc3
    public final String zzc() {
        return this.m;
    }

    @Override // defpackage.kc3
    public kc3 k() {
        return this;
    }
}
