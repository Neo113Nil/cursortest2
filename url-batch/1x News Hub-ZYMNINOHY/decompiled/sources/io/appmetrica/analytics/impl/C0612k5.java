package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612k5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7702a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7703b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f7704c;

    public C0612k5(Context context) {
        this.f7704c = context.getApplicationContext();
    }

    public final Na a(X4 x4, C0922w4 c0922w4, U7 u7, HashMap hashMap) {
        Na na = (Na) hashMap.get(x4.toString());
        if (na != null) {
            na.a(c0922w4);
            return na;
        }
        Na a3 = u7.a(this.f7704c, x4, c0922w4);
        hashMap.put(x4.toString(), a3);
        return a3;
    }
}
