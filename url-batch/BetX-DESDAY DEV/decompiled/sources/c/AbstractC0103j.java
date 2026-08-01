package c;

import O0.o;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.r;
import d.AbstractC0105a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0103j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1660a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1661b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1662c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1663d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1664e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1665f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1666g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1660a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0098e c0098e = (C0098e) this.f1664e.get(str);
        if ((c0098e != null ? c0098e.f1652a : null) != null) {
            ArrayList arrayList = this.f1663d;
            if (arrayList.contains(str)) {
                c0098e.f1652a.a(c0098e.f1653b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1665f.remove(str);
        this.f1666g.putParcelable(str, new C0094a(intent, i2));
        return true;
    }

    public abstract void b(int i, AbstractC0105a abstractC0105a, Parcelable parcelable);

    public final C0102i c(String str, AbstractC0105a abstractC0105a, InterfaceC0095b interfaceC0095b) {
        X0.f.e(str, "key");
        d(str);
        this.f1664e.put(str, new C0098e(abstractC0105a, interfaceC0095b));
        LinkedHashMap linkedHashMap = this.f1665f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC0095b.a(obj);
        }
        Bundle bundle = this.f1666g;
        C0094a c0094a = (C0094a) q1.d.E(bundle, str);
        if (c0094a != null) {
            bundle.remove(str);
            interfaceC0095b.a(abstractC0105a.c(c0094a.f1647b, c0094a.f1646a));
        }
        return new C0102i(this, str, abstractC0105a);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f1661b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new d1.a(new o(1, new d1.e(1)))) {
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f1660a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        X0.f.e(str, "key");
        if (!this.f1663d.contains(str) && (num = (Integer) this.f1661b.remove(str)) != null) {
            this.f1660a.remove(num);
        }
        this.f1664e.remove(str);
        LinkedHashMap linkedHashMap = this.f1665f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1666g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0094a) q1.d.E(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1662c;
        C0099f c0099f = (C0099f) linkedHashMap2.get(str);
        if (c0099f != null) {
            ArrayList arrayList = c0099f.f1655b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0099f.f1654a.b((r) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
