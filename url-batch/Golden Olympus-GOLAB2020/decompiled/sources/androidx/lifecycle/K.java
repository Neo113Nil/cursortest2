package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import h0.C2435d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12578f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class[] f12579g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f12580a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12581b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12582c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f12583d;

    /* renamed from: e, reason: collision with root package name */
    private final C2435d.c f12584e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final K a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new K();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new K(hashMap);
            }
            ClassLoader classLoader = K.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = parcelableArrayList.get(i4);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i4));
            }
            return new K(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : K.f12579g) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public K(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12580a = linkedHashMap;
        this.f12581b = new LinkedHashMap();
        this.f12582c = new LinkedHashMap();
        this.f12583d = new LinkedHashMap();
        this.f12584e = new C2435d.c() { // from class: androidx.lifecycle.J
            @Override // h0.C2435d.c
            public final Bundle a() {
                Bundle d4;
                d4 = K.d(K.this);
                return d4;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(K this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : MapsKt.toMap(this$0.f12581b).entrySet()) {
            this$0.e((String) entry.getKey(), ((C2435d.c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f12580a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f12580a.get(str));
        }
        return androidx.core.os.d.a(TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2));
    }

    public final C2435d.c c() {
        return this.f12584e;
    }

    public final void e(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f12578f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.checkNotNull(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f12582c.get(key);
        B b4 = obj2 instanceof B ? (B) obj2 : null;
        if (b4 != null) {
            b4.o(obj);
        } else {
            this.f12580a.put(key, obj);
        }
        r2.u uVar = (r2.u) this.f12583d.get(key);
        if (uVar == null) {
            return;
        }
        uVar.setValue(obj);
    }

    public K() {
        this.f12580a = new LinkedHashMap();
        this.f12581b = new LinkedHashMap();
        this.f12582c = new LinkedHashMap();
        this.f12583d = new LinkedHashMap();
        this.f12584e = new C2435d.c() { // from class: androidx.lifecycle.J
            @Override // h0.C2435d.c
            public final Bundle a() {
                Bundle d4;
                d4 = K.d(K.this);
                return d4;
            }
        };
    }
}
