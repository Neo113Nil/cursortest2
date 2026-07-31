package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kr3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ld3<KeyProtoT extends kr3> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyProtoT> f7939a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, kd3<?, KeyProtoT>> f7940b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f7941c;

    @SafeVarargs
    protected ld3(Class<KeyProtoT> cls, kd3<?, KeyProtoT>... kd3VarArr) {
        this.f7939a = cls;
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 <= 0; i7++) {
            kd3<?, KeyProtoT> kd3Var = kd3VarArr[i7];
            if (hashMap.containsKey(kd3Var.a())) {
                String valueOf = String.valueOf(kd3Var.a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(kd3Var.a(), kd3Var);
        }
        this.f7941c = kd3VarArr[0].a();
        this.f7940b = Collections.unmodifiableMap(hashMap);
    }

    public jd3<?, KeyProtoT> a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract KeyProtoT b(uo3 uo3Var);

    final Class<?> c() {
        return this.f7941c;
    }

    public final Class<KeyProtoT> d() {
        return this.f7939a;
    }

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        kd3<?, KeyProtoT> kd3Var = this.f7940b.get(cls);
        if (kd3Var != null) {
            return (P) kd3Var.b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String f();

    public final Set<Class<?>> g() {
        return this.f7940b.keySet();
    }

    public abstract void h(KeyProtoT keyprotot);

    public int i() {
        return 1;
    }

    public abstract int j();
}
