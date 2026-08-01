package a;

import Z.z;
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
    public final LinkedHashMap f1251a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1252b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1253c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1254e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1255f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1256g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1251a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0078b c0078b = (C0078b) this.f1254e.get(str);
        if ((c0078b != null ? c0078b.f1715a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0078b.f1715a.a(c0078b.f1716b.P(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1255f.remove(str);
        this.f1256g.putParcelable(str, new C0077a(intent, i2));
        return true;
    }

    public final D.j b(String str, z1.d dVar, z zVar) {
        Object parcelable;
        g1.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1252b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new m1.a(new X0.q(1, new m1.e(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1251a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1254e.put(str, new C0078b(zVar, dVar));
        LinkedHashMap linkedHashMap3 = this.f1255f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1256g;
        if (i >= 34) {
            parcelable = I.a.a(bundle, str, C0077a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0077a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0077a c0077a = (C0077a) parcelable;
        if (c0077a != null) {
            bundle.remove(str);
            zVar.a(dVar.P(c0077a.f1714b, c0077a.f1713a));
        }
        return new D.j(this, 10, str);
    }
}
