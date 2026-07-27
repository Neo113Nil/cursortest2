package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763k5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8602a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8603b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f8604c;

    public C0763k5(Context context) {
        this.f8604c = context.getApplicationContext();
    }

    public final Na a(X4 x42, C1073w4 c1073w4, U7 u7, HashMap hashMap) {
        Na na = (Na) hashMap.get(x42.toString());
        if (na != null) {
            na.a(c1073w4);
            return na;
        }
        Na a6 = u7.a(this.f8604c, x42, c1073w4);
        hashMap.put(x42.toString(), a6);
        return a6;
    }
}
