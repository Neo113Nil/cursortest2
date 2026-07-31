package androidx.lifecycle;

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
import t2.C1045P;
import t2.InterfaceC1072y;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5178f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5180b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5181c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5182d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.d f5183e;

    public M(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5179a = linkedHashMap;
        this.f5180b = new LinkedHashMap();
        this.f5181c = new LinkedHashMap();
        this.f5182d = new LinkedHashMap();
        this.f5183e = new L(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(M m3) {
        f2.j.f(m3, "this$0");
        for (Map.Entry entry : S1.B.M(m3.f5180b).entrySet()) {
            m3.b(((y1.d) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = m3.f5179a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return l0.c.j(new R1.i("keys", arrayList), new R1.i("values", arrayList2));
    }

    public final void b(Object obj, String str) {
        f2.j.f(str, "key");
        if (obj != null) {
            Class[] clsArr = f5178f;
            for (int i3 = 0; i3 < 29; i3++) {
                Class cls = clsArr[i3];
                f2.j.c(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        this.f5181c.get(str);
        this.f5179a.put(str, obj);
        InterfaceC1072y interfaceC1072y = (InterfaceC1072y) this.f5182d.get(str);
        if (interfaceC1072y == null) {
            return;
        }
        ((C1045P) interfaceC1072y).k(obj);
    }

    public M() {
        this.f5179a = new LinkedHashMap();
        this.f5180b = new LinkedHashMap();
        this.f5181c = new LinkedHashMap();
        this.f5182d = new LinkedHashMap();
        this.f5183e = new L(0, this);
    }
}
