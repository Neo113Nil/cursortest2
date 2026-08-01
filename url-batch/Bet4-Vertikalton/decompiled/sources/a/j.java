package a;

import Y.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c.C0081a;
import c.C0082b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1166a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1167b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1168c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1169e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1170f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1171g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1166a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0082b c0082b = (C0082b) this.f1169e.get(str);
        if ((c0082b != null ? c0082b.f1635a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0082b.f1635a.a(c0082b.f1636b.Q(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1170f.remove(str);
        this.f1171g.putParcelable(str, new C0081a(intent, i2));
        return true;
    }

    public final B.j b(String str, w1.l lVar, z zVar) {
        Object parcelable;
        d1.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f1167b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new j1.a(new S0.n(1, new j1.f(1)))) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f1166a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f1169e.put(str, new C0082b(zVar, lVar));
        LinkedHashMap linkedHashMap3 = this.f1170f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1171g;
        if (i >= 34) {
            parcelable = G.a.a(bundle, str, C0081a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0081a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0081a c0081a = (C0081a) parcelable;
        if (c0081a != null) {
            bundle.remove(str);
            zVar.a(lVar.Q(c0081a.f1634b, c0081a.f1633a));
        }
        return new B.j(this, 10, str);
    }
}
