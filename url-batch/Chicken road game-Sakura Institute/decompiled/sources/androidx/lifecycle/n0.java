package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1001f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1003b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1004c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1005d;

    /* renamed from: e, reason: collision with root package name */
    public final x3.d f1006e;

    public n0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1002a = linkedHashMap;
        this.f1003b = new LinkedHashMap();
        this.f1004c = new LinkedHashMap();
        this.f1005d = new LinkedHashMap();
        this.f1006e = new m0(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(n0 n0Var) {
        LinkedHashMap linkedHashMap = n0Var.f1002a;
        for (Map.Entry entry : e6.c0.m0(n0Var.f1003b).entrySet()) {
            n0Var.b(((x3.d) entry.getValue()).a(), (String) entry.getKey());
        }
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return u3.t.e(new d6.j("keys", arrayList), new d6.j("values", arrayList2));
    }

    public final void b(Object obj, String str) {
        r6.k.f(str, "key");
        if (obj != null) {
            Class[] clsArr = f1001f;
            for (int i7 = 0; i7 < 29; i7++) {
                Class cls = clsArr[i7];
                r6.k.c(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f1004c.get(str);
        a0 a0Var = obj2 instanceof a0 ? (a0) obj2 : null;
        if (a0Var != null) {
            g.b.p0().f3655d.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a0.m.j("Cannot invoke ", "setValue", " on a background thread"));
            }
            a0Var.f944e++;
            a0Var.f942c = obj;
            if (a0Var.f945f) {
                a0Var.f946g = true;
            } else {
                a0Var.f945f = true;
                do {
                    a0Var.f946g = false;
                    h.f fVar = a0Var.f941b;
                    fVar.getClass();
                    h.d dVar = new h.d(fVar);
                    fVar.f4585h.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext()) {
                        a0Var.a((z) ((Map.Entry) dVar.next()).getValue());
                        if (a0Var.f946g) {
                            break;
                        }
                    }
                } while (a0Var.f946g);
                a0Var.f945f = false;
            }
        } else {
            this.f1002a.put(str, obj);
        }
        f7.x xVar = (f7.x) this.f1005d.get(str);
        if (xVar == null) {
            return;
        }
        ((f7.q0) xVar).j(obj);
    }

    public n0() {
        this.f1002a = new LinkedHashMap();
        this.f1003b = new LinkedHashMap();
        this.f1004c = new LinkedHashMap();
        this.f1005d = new LinkedHashMap();
        this.f1006e = new m0(0, this);
    }
}
