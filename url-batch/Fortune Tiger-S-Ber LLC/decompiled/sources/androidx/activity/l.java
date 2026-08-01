package androidx.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f118a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f119b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f120d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f121e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f122f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i4, int i5, Intent intent) {
        String str = (String) this.f118a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        b.b bVar = (b.b) this.f121e.get(str);
        if ((bVar != null ? bVar.f685a : null) != null) {
            ArrayList arrayList = this.f120d;
            if (arrayList.contains(str)) {
                bVar.f685a.a(bVar.f686b.V(intent, i5));
                arrayList.remove(str);
                return true;
            }
        }
        this.f122f.remove(str);
        this.g.putParcelable(str, new b.a(intent, i5));
        return true;
    }

    public final a2.s b(String str, k3.d dVar, androidx.fragment.app.b0 b0Var) {
        Object parcelable;
        u2.c.e(str, "key");
        LinkedHashMap linkedHashMap = this.f119b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            for (Number number : new a3.a(new a3.e(0, new a3.g()))) {
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.f118a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f121e.put(str, new b.b(b0Var, dVar));
        LinkedHashMap linkedHashMap3 = this.f122f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            b0Var.a(obj);
        }
        int i4 = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i4 >= 34) {
            parcelable = i.b(bundle, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!b.a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        b.a aVar = (b.a) parcelable;
        if (aVar != null) {
            bundle.remove(str);
            b0Var.a(dVar.V(aVar.g, aVar.f684f));
        }
        return new a2.s(this, str, 5);
    }
}
