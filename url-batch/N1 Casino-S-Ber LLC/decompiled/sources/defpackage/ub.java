package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ub {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        v1 v1Var = (v1) this.e.get(str);
        if ((v1Var != null ? v1Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                v1Var.a.a(v1Var.b.R(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new s1(intent, i2));
        return true;
    }

    public final q4 b(String str, jw jwVar, tk tkVar) {
        Object parcelable;
        LinkedHashMap linkedHashMap = this.b;
        int i = 1;
        if (((Integer) linkedHashMap.get(str)) == null) {
            u1 u1Var = new u1(0);
            for (Number number : new kc(new ef(u1Var, new l40(5, u1Var), 1))) {
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new v1(tkVar, jwVar));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            tkVar.a(obj);
        }
        int i2 = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i2 >= 34) {
            parcelable = e0.b(bundle, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!s1.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        s1 s1Var = (s1) parcelable;
        if (s1Var != null) {
            bundle.remove(str);
            tkVar.a(jwVar.R(s1Var.g, s1Var.f));
        }
        return new q4(this, str, i);
    }
}
