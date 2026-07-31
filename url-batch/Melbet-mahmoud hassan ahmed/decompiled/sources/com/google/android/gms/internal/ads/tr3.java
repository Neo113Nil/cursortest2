package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class tr3 {

    /* renamed from: c, reason: collision with root package name */
    private static final tr3 f12364c = new tr3();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, es3<?>> f12366b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final fs3 f12365a = new cr3();

    private tr3() {
    }

    public static tr3 a() {
        return f12364c;
    }

    public final <T> es3<T> b(Class<T> cls) {
        kq3.f(cls, "messageType");
        es3<T> es3Var = (es3) this.f12366b.get(cls);
        if (es3Var == null) {
            es3Var = this.f12365a.d(cls);
            kq3.f(cls, "messageType");
            kq3.f(es3Var, "schema");
            es3<T> es3Var2 = (es3) this.f12366b.putIfAbsent(cls, es3Var);
            if (es3Var2 != null) {
                return es3Var2;
            }
        }
        return es3Var;
    }
}
