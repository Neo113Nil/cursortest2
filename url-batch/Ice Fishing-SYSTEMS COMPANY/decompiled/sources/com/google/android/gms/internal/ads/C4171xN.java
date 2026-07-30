package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4171xN extends AbstractC3955tN {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35143b = 0;

    static {
        C4117wN.a(Collections.EMPTY_MAP);
    }

    public static Mt a(int i) {
        return new Mt(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map d() {
        Map map = this.f34408a;
        LinkedHashMap g9 = YD.g(map.size());
        for (Map.Entry entry : map.entrySet()) {
            g9.put(entry.getKey(), ((InterfaceC4279zN) entry.getValue()).d());
        }
        return Collections.unmodifiableMap(g9);
    }
}
