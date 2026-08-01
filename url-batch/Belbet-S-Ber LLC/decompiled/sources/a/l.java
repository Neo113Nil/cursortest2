package a;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f39b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f40c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f41e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f42f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f43g = new Bundle();

    public final boolean a(int i, int i4, Intent intent) {
        String str = (String) this.f38a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        c.b bVar = (c.b) this.f41e.get(str);
        if ((bVar != null ? bVar.f857a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                bVar.f857a.a(bVar.f858b.T(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f42f.remove(str);
        this.f43g.putParcelable(str, new c.a(intent, i4));
        return true;
    }

    public final androidx.emoji2.text.q b(String str, b4.l lVar, androidx.fragment.app.b0 b0Var) {
        Object parcelable;
        i3.d.e(str, "key");
        LinkedHashMap linkedHashMap = this.f39b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            a0 a0Var = new a0(1);
            for (Number number : new o3.a(new o3.d(a0Var, new g0(2, a0Var)))) {
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.f38a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f41e.put(str, new c.b(b0Var, lVar));
        LinkedHashMap linkedHashMap3 = this.f42f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            b0Var.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f43g;
        if (i >= 34) {
            parcelable = j0.c.a(bundle, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!c.a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        c.a aVar = (c.a) parcelable;
        if (aVar != null) {
            bundle.remove(str);
            b0Var.a(lVar.T(aVar.f856g, aVar.f855f));
        }
        return new androidx.emoji2.text.q(this, str, 4);
    }
}
