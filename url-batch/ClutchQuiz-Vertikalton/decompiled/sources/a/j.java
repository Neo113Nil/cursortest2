package a;

import X.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0083a;
import c.C0084b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1190a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1191b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1192c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1193e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1194f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1195g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1190a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0084b c0084b = (C0084b) this.f1193e.get(str);
        if ((c0084b != null ? c0084b.f1705a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0084b.f1705a.a(c0084b.f1706b.F(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1194f.remove(str);
        this.f1195g.putParcelable(str, new C0083a(intent, i2));
        return true;
    }

    public final B.j b(String str, T.d dVar, z zVar) {
        Object parcelable;
        g1.f.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1191b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new m1.a(new m1.c(0, new m1.g(1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1190a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1193e.put(str, new C0084b(zVar, dVar));
        LinkedHashMap linkedHashMap3 = this.f1194f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1195g;
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
            zVar.a(dVar.F(c0083a.f1704b, c0083a.f1703a));
        }
        return new B.j(this, 9, str);
    }
}
