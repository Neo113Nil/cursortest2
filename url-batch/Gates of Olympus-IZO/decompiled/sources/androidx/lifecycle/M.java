package androidx.lifecycle;

import a.AbstractC0157a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n2.C0692Q;
import n2.InterfaceC0719y;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3977f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3978a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3979b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3980c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3981d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.d f3982e;

    public M(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3978a = linkedHashMap;
        this.f3979b = new LinkedHashMap();
        this.f3980c = new LinkedHashMap();
        this.f3981d = new LinkedHashMap();
        this.f3982e = new L(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(M m3) {
        Z1.i.f(m3, "this$0");
        for (Map.Entry entry : M1.B.Q(m3.f3979b).entrySet()) {
            m3.b(((u1.d) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = m3.f3978a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return AbstractC0157a.l(new L1.j("keys", arrayList), new L1.j("values", arrayList2));
    }

    public final void b(Object obj, String str) {
        Z1.i.f(str, "key");
        if (obj != null) {
            Class[] clsArr = f3977f;
            for (int i3 = 0; i3 < 29; i3++) {
                Class cls = clsArr[i3];
                Z1.i.c(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        this.f3980c.get(str);
        this.f3978a.put(str, obj);
        InterfaceC0719y interfaceC0719y = (InterfaceC0719y) this.f3981d.get(str);
        if (interfaceC0719y == null) {
            return;
        }
        ((C0692Q) interfaceC0719y).j(obj);
    }

    public M() {
        this.f3978a = new LinkedHashMap();
        this.f3979b = new LinkedHashMap();
        this.f3980c = new LinkedHashMap();
        this.f3981d = new LinkedHashMap();
        this.f3982e = new L(0, this);
    }
}
