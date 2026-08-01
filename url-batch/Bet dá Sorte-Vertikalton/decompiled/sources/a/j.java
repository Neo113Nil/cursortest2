package a;

import X.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0080a;
import c.C0081b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1123a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1124b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1125c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1126e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1127f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1128g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1123a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0081b c0081b = (C0081b) this.f1126e.get(str);
        if ((c0081b != null ? c0081b.f1591a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0081b.f1591a.a(c0081b.f1592b.b0(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1127f.remove(str);
        this.f1128g.putParcelable(str, new C0080a(intent, i2));
        return true;
    }

    public final B.j b(String str, u1.l lVar, z zVar) {
        Object parcelable;
        b1.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1124b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new h1.a(new T0.o(1, new h1.e(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1123a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1126e.put(str, new C0081b(zVar, lVar));
        LinkedHashMap linkedHashMap3 = this.f1127f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1128g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0080a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0080a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0080a c0080a = (C0080a) parcelable;
        if (c0080a != null) {
            bundle.remove(str);
            zVar.a(lVar.b0(c0080a.f1590b, c0080a.f1589a));
        }
        return new B.j(this, 9, str);
    }
}
