package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ur0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1804ad {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private static volatile C2365yc f23235a;

    @NotNull
    public static final InterfaceC1805ae a() {
        Object obj;
        C2365yc c2365yc;
        C2365yc c2365yc2 = f23235a;
        if (c2365yc2 != null) {
            return c2365yc2;
        }
        obj = C2365yc.f35051b;
        synchronized (obj) {
            c2365yc = f23235a;
            if (c2365yc == null) {
                int i4 = ur0.f33232f;
                c2365yc = new C2365yc(ur0.a.a().c());
                f23235a = c2365yc;
            }
        }
        return c2365yc;
    }
}
