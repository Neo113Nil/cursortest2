package a;

import Y.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0083a;
import c.C0084b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import u0.C0365d;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1570a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1571b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1572c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1573e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1574f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1575g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1570a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0084b c0084b = (C0084b) this.f1573e.get(str);
        if ((c0084b != null ? c0084b.f2053a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0084b.f2053a.a(c0084b.f2054b.w(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1574f.remove(str);
        this.f1575g.putParcelable(str, new C0083a(intent, i2));
        return true;
    }

    public final C0365d b(String str, b1.g gVar, z zVar) {
        Object parcelable;
        k1.e.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1571b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new q1.a(new Y0.q(1, new q1.h(1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1570a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1573e.put(str, new C0084b(zVar, gVar));
        LinkedHashMap linkedHashMap3 = this.f1574f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1575g;
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
            zVar.a(gVar.w(c0083a.f2052b, c0083a.f2051a));
        }
        return new C0365d(this, 6, str);
    }
}
