package androidx.lifecycle;

import a0.InterfaceC0174e;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import f4.C0430g;
import g4.AbstractC0476u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f4531f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4532a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4533b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4534c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4535d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0174e f4536e;

    public J(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4532a = linkedHashMap;
        this.f4533b = new LinkedHashMap();
        this.f4534c = new LinkedHashMap();
        this.f4535d = new LinkedHashMap();
        this.f4536e = new androidx.activity.c(1, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(J this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        Iterator it = AbstractC0476u.d0(this$0.f4533b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.f4532a;
            if (!hasNext) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return B0.f.c(new C0430g("keys", arrayList), new C0430g("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Object a6 = ((InterfaceC0174e) entry.getValue()).a();
            kotlin.jvm.internal.i.e(key, "key");
            if (a6 != null) {
                Class[] clsArr = f4531f;
                for (int i2 = 0; i2 < 29; i2++) {
                    Class cls = clsArr[i2];
                    kotlin.jvm.internal.i.b(cls);
                    if (!cls.isInstance(a6)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + a6.getClass() + " into saved state");
            }
            Object obj = this$0.f4534c.get(key);
            A a7 = obj instanceof A ? (A) obj : null;
            if (a7 != null) {
                a7.b(a6);
            } else {
                linkedHashMap.put(key, a6);
            }
            G4.s sVar = (G4.s) this$0.f4535d.get(key);
            if (sVar != null) {
                G4.w wVar = (G4.w) sVar;
                if (a6 == null) {
                    a6 = H4.t.f1201a;
                }
                wVar.c(null, a6);
            }
        }
    }

    public J() {
        this.f4532a = new LinkedHashMap();
        this.f4533b = new LinkedHashMap();
        this.f4534c = new LinkedHashMap();
        this.f4535d = new LinkedHashMap();
        this.f4536e = new androidx.activity.c(1, this);
    }
}
