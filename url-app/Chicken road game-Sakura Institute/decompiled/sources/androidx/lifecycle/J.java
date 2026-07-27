package androidx.lifecycle;

import A.AbstractC0017m;
import a.AbstractC0345a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import g.C0633a;
import h.C0643d;
import h.C0645f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import v1.InterfaceC1247d;
import z2.C1412P;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f5433f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5434a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5435b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5436c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5437d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1247d f5438e;

    public J(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5434a = linkedHashMap;
        this.f5435b = new LinkedHashMap();
        this.f5436c = new LinkedHashMap();
        this.f5437d = new LinkedHashMap();
        this.f5438e = new I(0, this);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(J this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : C1412P.i(this$0.f5435b).entrySet()) {
            this$0.b(((InterfaceC1247d) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = this$0.f5434a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return AbstractC0345a.i(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    public final void b(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            Class[] clsArr = f5433f;
            for (int i2 = 0; i2 < 29; i2++) {
                Class cls = clsArr[i2];
                Intrinsics.c(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f5436c.get(key);
        A a4 = obj2 instanceof A ? (A) obj2 : null;
        if (a4 != null) {
            C0633a.u0().f6664j.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0017m.j("Cannot invoke ", "setValue", " on a background thread"));
            }
            a4.f5417e++;
            a4.f5415c = obj;
            if (a4.f5418f) {
                a4.f5419g = true;
            } else {
                a4.f5418f = true;
                do {
                    a4.f5419g = false;
                    C0645f c0645f = a4.f5414b;
                    c0645f.getClass();
                    C0643d c0643d = new C0643d(c0645f);
                    c0645f.f6824i.put(c0643d, Boolean.FALSE);
                    while (c0643d.hasNext()) {
                        a4.a((AbstractC0485z) ((Map.Entry) c0643d.next()).getValue());
                        if (a4.f5419g) {
                            break;
                        }
                    }
                } while (a4.f5419g);
                a4.f5418f = false;
            }
        } else {
            this.f5434a.put(key, obj);
        }
        Z2.z zVar = (Z2.z) this.f5437d.get(key);
        if (zVar == null) {
            return;
        }
        ((Z2.S) zVar).k(obj);
    }

    public J() {
        this.f5434a = new LinkedHashMap();
        this.f5435b = new LinkedHashMap();
        this.f5436c = new LinkedHashMap();
        this.f5437d = new LinkedHashMap();
        this.f5438e = new I(0, this);
    }
}
