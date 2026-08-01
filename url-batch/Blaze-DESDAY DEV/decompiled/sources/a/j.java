package a;

import Y.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0083a;
import c.C0084b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1196a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1197b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1198c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1199e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1200f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1201g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1196a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0084b c0084b = (C0084b) this.f1199e.get(str);
        if ((c0084b != null ? c0084b.f1665a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0084b.f1665a.a(c0084b.f1666b.P(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1200f.remove(str);
        this.f1201g.putParcelable(str, new C0083a(intent, i2));
        return true;
    }

    public final B.j b(String str, z1.l lVar, z zVar) {
        Object parcelable;
        g1.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1197b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new m1.a(new V0.n(1, new m1.f(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1196a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1199e.put(str, new C0084b(zVar, lVar));
        LinkedHashMap linkedHashMap3 = this.f1200f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1201g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0083a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0083a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0083a c0083a = (C0083a) parcelable;
        if (c0083a != null) {
            bundle.remove(str);
            zVar.a(lVar.P(c0083a.f1664b, c0083a.f1663a));
        }
        return new B.j(this, 10, str);
    }
}
