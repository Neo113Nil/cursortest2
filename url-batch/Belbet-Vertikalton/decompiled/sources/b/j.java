package b;

import Z.z;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import d.C0110a;
import d.C0111b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2168a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2169b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2170c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2171d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2172f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2173g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f2168a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0111b c0111b = (C0111b) this.e.get(str);
        if ((c0111b != null ? c0111b.f2643a : null) != null) {
            ArrayList arrayList = this.f2171d;
            if (arrayList.contains(str)) {
                c0111b.f2643a.a(c0111b.f2644b.a0(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f2172f.remove(str);
        this.f2173g.putParcelable(str, new C0110a(intent, i2));
        return true;
    }

    public final B1.c b(String str, H1.d dVar, z zVar) {
        Object parcelable;
        j1.h.e(str, "key");
        LinkedHashMap linkedHashMap = this.f2169b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new p1.a(new X0.r(1, new p1.g(1))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f2168a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new C0111b(zVar, dVar));
        LinkedHashMap linkedHashMap3 = this.f2172f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            zVar.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f2173g;
        if (i >= 34) {
            parcelable = I.a.a(bundle, str, C0110a.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0110a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0110a c0110a = (C0110a) parcelable;
        if (c0110a != null) {
            bundle.remove(str);
            zVar.a(dVar.a0(c0110a.f2642b, c0110a.f2641a));
        }
        return new B1.c(this, 12, str);
    }
}
