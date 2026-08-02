package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.EnumC0230i;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;
import com.startapp.sdk.internal.A;
import e.AbstractC0390a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import v3.C1479a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8073a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8074b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8075c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8076d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f8077e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8078f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8079g = new Bundle();

    public final boolean a(int i4, int i5, Intent intent) {
        String str = (String) this.f8073a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f8077e.get(str);
        if ((eVar != null ? eVar.f8065a : null) != null) {
            ArrayList arrayList = this.f8076d;
            if (arrayList.contains(str)) {
                eVar.f8065a.a(eVar.f8066b.c(intent, i5));
                arrayList.remove(str);
                return true;
            }
        }
        this.f8078f.remove(str);
        this.f8079g.putParcelable(str, new C0373a(intent, i5));
        return true;
    }

    public abstract void b(int i4, AbstractC0390a abstractC0390a, Object obj);

    public final g c(final String key, InterfaceC0235n interfaceC0235n, final AbstractC0390a contract, final b callback) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(contract, "contract");
        kotlin.jvm.internal.i.e(callback, "callback");
        AbstractC0231j lifecycle = interfaceC0235n.getLifecycle();
        C0237p c0237p = (C0237p) lifecycle;
        if (c0237p.f5052c.compareTo(EnumC0230i.f5044d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC0235n + " is attempting to register while current state is " + c0237p.f5052c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f8075c;
        f fVar = (f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new f(lifecycle);
        }
        InterfaceC0234m interfaceC0234m = new InterfaceC0234m() { // from class: d.d
            @Override // androidx.lifecycle.InterfaceC0234m
            public final void a(InterfaceC0235n interfaceC0235n2, EnumC0229h enumC0229h) {
                h hVar = h.this;
                Bundle bundle = hVar.f8079g;
                LinkedHashMap linkedHashMap2 = hVar.f8077e;
                LinkedHashMap linkedHashMap3 = hVar.f8078f;
                String key2 = key;
                kotlin.jvm.internal.i.e(key2, "$key");
                b callback2 = callback;
                kotlin.jvm.internal.i.e(callback2, "$callback");
                AbstractC0390a contract2 = contract;
                kotlin.jvm.internal.i.e(contract2, "$contract");
                if (EnumC0229h.ON_START != enumC0229h) {
                    if (EnumC0229h.ON_STOP == enumC0229h) {
                        linkedHashMap2.remove(key2);
                        return;
                    } else {
                        if (EnumC0229h.ON_DESTROY == enumC0229h) {
                            hVar.f(key2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(key2, new e(contract2, callback2));
                if (linkedHashMap3.containsKey(key2)) {
                    Object obj = linkedHashMap3.get(key2);
                    linkedHashMap3.remove(key2);
                    callback2.a(obj);
                }
                C0373a c0373a = (C0373a) O3.d.q(bundle, key2);
                if (c0373a != null) {
                    bundle.remove(key2);
                    callback2.a(contract2.c(c0373a.f8060b, c0373a.f8059a));
                }
            }
        };
        fVar.f8067a.a(interfaceC0234m);
        fVar.f8068b.add(interfaceC0234m);
        linkedHashMap.put(key, fVar);
        return new g(this, key, contract, 0);
    }

    public final g d(String key, AbstractC0390a abstractC0390a, b bVar) {
        kotlin.jvm.internal.i.e(key, "key");
        e(key);
        this.f8077e.put(key, new e(abstractC0390a, bVar));
        LinkedHashMap linkedHashMap = this.f8078f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar.a(obj);
        }
        Bundle bundle = this.f8079g;
        C0373a c0373a = (C0373a) O3.d.q(bundle, key);
        if (c0373a != null) {
            bundle.remove(key);
            bVar.a(abstractC0390a.c(c0373a.f8060b, c0373a.f8059a));
        }
        return new g(this, key, abstractC0390a, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f8074b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new C1479a(new d3.h(2, new A(4))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f8073a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        kotlin.jvm.internal.i.e(key, "key");
        if (!this.f8076d.contains(key) && (num = (Integer) this.f8074b.remove(key)) != null) {
            this.f8073a.remove(num);
        }
        this.f8077e.remove(key);
        LinkedHashMap linkedHashMap = this.f8078f;
        if (linkedHashMap.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f8079g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C0373a) O3.d.q(bundle, key)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f8075c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f8068b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                fVar.f8067a.b((InterfaceC0234m) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
