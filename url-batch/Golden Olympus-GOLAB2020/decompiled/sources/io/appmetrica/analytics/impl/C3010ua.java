package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3010ua {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3010ua f39931c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f39932a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39933b = new HashMap();

    public C3010ua(Context context) {
        this.f39932a = context;
    }

    public static final C3010ua a(Context context) {
        if (f39931c == null) {
            synchronized (kotlin.jvm.internal.H.b(C3010ua.class)) {
                try {
                    if (f39931c == null) {
                        f39931c = new C3010ua(context);
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3010ua c3010ua = f39931c;
        if (c3010ua != null) {
            return c3010ua;
        }
        Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
        return null;
    }

    public final synchronized S9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f39933b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new S9(this.f39932a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (S9) obj;
    }

    public final synchronized void a(String str) {
        this.f39933b.remove(str);
    }
}
