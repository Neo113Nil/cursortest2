package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0042aa {
    public static volatile C0042aa c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1161a;
    public final HashMap b = new HashMap();

    public C0042aa(Context context) {
        this.f1161a = context;
    }

    public static final C0042aa a(Context context) {
        if (c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C0042aa.class)) {
                if (c == null) {
                    c = new C0042aa(context);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        C0042aa c0042aa = c;
        if (c0042aa != null) {
            return c0042aa;
        }
        Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
        return null;
    }

    public final synchronized C0649y9 b(String str) {
        Object obj;
        HashMap hashMap = this.b;
        obj = hashMap.get(str);
        if (obj == null) {
            obj = new C0649y9(this.f1161a, str);
            hashMap.put(str, obj);
        }
        return (C0649y9) obj;
    }

    public final synchronized void a(String str) {
        this.b.remove(str);
    }
}
