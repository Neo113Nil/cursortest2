package a;

import Z.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0087a;
import c.C0088b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1241a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1242b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1243c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1244e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1245f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1246g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1241a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0088b c0088b = (C0088b) this.f1244e.get(str);
        if ((c0088b != null ? c0088b.f1730a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0088b.f1730a.a(c0088b.f1731b.V(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1245f.remove(str);
        this.f1246g.putParcelable(str, new C0087a(intent, i2));
        return true;
    }

    public final C.j b(String str, A1.m mVar, z zVar) {
        Object parcelable;
        h1.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1242b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new n1.a(new W0.n(1, new n1.f(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1241a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1244e.put(str, new C0088b(zVar, mVar));
        LinkedHashMap linkedHashMap3 = this.f1245f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1246g;
        if (i >= 34) {
            parcelable = H.a.a(bundle, str, C0087a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0087a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0087a c0087a = (C0087a) parcelable;
        if (c0087a != null) {
            bundle.remove(str);
            zVar.a(mVar.V(c0087a.f1729b, c0087a.f1728a));
        }
        return new C.j(this, 9, str);
    }
}
