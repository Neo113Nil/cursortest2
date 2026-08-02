package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554d5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11650a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11651b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f11652c;

    public C0554d5(Context context) {
        this.f11652c = context.getApplicationContext();
    }

    public final Ga a(Q4 q4, C0863p4 c0863p4, O7 o7, HashMap hashMap) {
        Ga ga = (Ga) hashMap.get(q4.toString());
        if (ga != null) {
            ga.a(c0863p4);
            return ga;
        }
        Ga a3 = o7.a(this.f11652c, q4, c0863p4);
        hashMap.put(q4.toString(), a3);
        return a3;
    }
}
