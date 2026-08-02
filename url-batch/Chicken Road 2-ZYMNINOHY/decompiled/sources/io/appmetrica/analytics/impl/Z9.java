package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Z9 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Z9 f11362c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11363a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11364b = new HashMap();

    public Z9(Context context) {
        this.f11363a = context;
    }

    public static final Z9 a(Context context) {
        if (f11362c == null) {
            synchronized (kotlin.jvm.internal.q.a(Z9.class)) {
                if (f11362c == null) {
                    f11362c = new Z9(context);
                }
            }
        }
        Z9 z9 = f11362c;
        if (z9 != null) {
            return z9;
        }
        kotlin.jvm.internal.i.i("INSTANCE");
        throw null;
    }

    public final synchronized C1075x9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f11364b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new C1075x9(this.f11363a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1075x9) obj;
    }

    public final synchronized void a(String str) {
        this.f11364b.remove(str);
    }
}
