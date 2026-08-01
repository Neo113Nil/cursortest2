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
    public final LinkedHashMap f1153a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1154b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1155c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1156e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1157f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1158g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1153a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0078b c0078b = (C0078b) this.f1156e.get(str);
        if ((c0078b != null ? c0078b.f1612a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0078b.f1612a.a(c0078b.f1613b.X(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1157f.remove(str);
        this.f1158g.putParcelable(str, new C0077a(intent, i2));
        return true;
    }

    public final B.j b(String str, x1.l lVar, z zVar) {
        Object parcelable;
        e1.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1154b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new k1.a(new W0.o(1, new k1.e(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1153a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1156e.put(str, new C0078b(zVar, lVar));
        LinkedHashMap linkedHashMap3 = this.f1157f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1158g;
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
            zVar.a(lVar.X(c0077a.f1611b, c0077a.f1610a));
        }
        return new B.j(this, 10, str);
    }
}
