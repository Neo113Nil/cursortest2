package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514ga {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0514ga f7390c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7391a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7392b = new HashMap();

    public C0514ga(Context context) {
        this.f7391a = context;
    }

    public static final C0514ga a(Context context) {
        if (f7390c == null) {
            synchronized (kotlin.jvm.internal.r.a(C0514ga.class)) {
                if (f7390c == null) {
                    f7390c = new C0514ga(context);
                }
            }
        }
        C0514ga c0514ga = f7390c;
        if (c0514ga != null) {
            return c0514ga;
        }
        kotlin.jvm.internal.j.g("INSTANCE");
        throw null;
    }

    public final synchronized E9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f7392b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new E9(this.f7391a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (E9) obj;
    }

    public final synchronized void a(String str) {
        this.f7392b.remove(str);
    }
}
