package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.InterfaceC0254u;
import c6.n;
import g.AbstractC0407a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import l6.C0671a;

/* renamed from: f.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0391j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4751a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4752b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4753c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4754d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f4755e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4756f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4757g = new Bundle();

    public final boolean a(int i2, int i5, Intent intent) {
        String str = (String) this.f4751a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0386e c0386e = (C0386e) this.f4755e.get(str);
        if ((c0386e != null ? c0386e.f4743a : null) != null) {
            ArrayList arrayList = this.f4754d;
            if (arrayList.contains(str)) {
                c0386e.f4743a.c(c0386e.f4744b.c(i5, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f4756f.remove(str);
        this.f4757g.putParcelable(str, new C0382a(i5, intent));
        return true;
    }

    public abstract void b(int i2, AbstractC0407a abstractC0407a, Object obj);

    public final C0390i c(String key, AbstractC0407a contract, InterfaceC0383b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        d(key);
        this.f4755e.put(key, new C0386e(contract, callback));
        LinkedHashMap linkedHashMap = this.f4756f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.c(obj);
        }
        Bundle bundle = this.f4757g;
        C0382a c0382a = (C0382a) V6.b.C(key, bundle);
        if (c0382a != null) {
            bundle.remove(key);
            callback.c(contract.c(c0382a.f4737d, c0382a.f4738e));
        }
        return new C0390i(this, key, contract);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f4752b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        C0388g nextFunction = C0388g.f4747d;
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        n nVar = new n(new c2.i(1));
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Iterator it = new C0671a(nVar).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f4751a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f4754d.contains(key) && (num = (Integer) this.f4752b.remove(key)) != null) {
            this.f4751a.remove(num);
        }
        this.f4755e.remove(key);
        LinkedHashMap linkedHashMap = this.f4756f;
        if (linkedHashMap.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f4757g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C0382a) V6.b.C(key, bundle)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f4753c;
        C0387f c0387f = (C0387f) linkedHashMap2.get(key);
        if (c0387f != null) {
            ArrayList arrayList = c0387f.f4746b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                c0387f.f4745a.b((InterfaceC0254u) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
