package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0140e5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1231a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public C0140e5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final Ha a(R4 r4, C0445q4 c0445q4, P7 p7, HashMap hashMap) {
        Ha ha = (Ha) hashMap.get(r4.toString());
        if (ha != null) {
            ha.a(c0445q4);
            return ha;
        }
        Ha a2 = p7.a(this.c, r4, c0445q4);
        hashMap.put(r4.toString(), a2);
        return a2;
    }
}
