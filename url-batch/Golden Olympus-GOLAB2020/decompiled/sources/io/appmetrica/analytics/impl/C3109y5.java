package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3109y5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f40253a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f40254b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f40255c;

    public C3109y5(Context context) {
        this.f40255c = context.getApplicationContext();
    }

    public final InterfaceC2515bb a(C2772l5 c2772l5, K4 k4, InterfaceC2672h8 interfaceC2672h8, HashMap hashMap) {
        InterfaceC2515bb interfaceC2515bb = (InterfaceC2515bb) hashMap.get(c2772l5.toString());
        if (interfaceC2515bb != null) {
            interfaceC2515bb.a(k4);
            return interfaceC2515bb;
        }
        InterfaceC2515bb a4 = interfaceC2672h8.a(this.f40255c, c2772l5, k4);
        hashMap.put(c2772l5.toString(), a4);
        return a4;
    }
}
