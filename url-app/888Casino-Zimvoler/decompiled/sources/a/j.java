package a;

import X.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0077a;
import c.C0078b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1046a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1047b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1048c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1049e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1050f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1051g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1046a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0078b c0078b = (C0078b) this.f1049e.get(str);
        if ((c0078b != null ? c0078b.f1510a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0078b.f1510a.a(c0078b.f1511b.N(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1050f.remove(str);
        this.f1051g.putParcelable(str, new C0077a(intent, i2));
        return true;
    }

    public final B.j b(String str, q1.l lVar, z zVar) {
        Object parcelable;
        X0.e.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1047b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new d1.a(new Q0.k(1, new d1.e(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1046a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1049e.put(str, new C0078b(zVar, lVar));
        LinkedHashMap linkedHashMap3 = this.f1050f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1051g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0077a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0077a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0077a c0077a = (C0077a) parcelable;
        if (c0077a != null) {
            bundle.remove(str);
            zVar.a(lVar.N(c0077a.f1509b, c0077a.f1508a));
        }
        return new B.j(this, 9, str);
    }
}
