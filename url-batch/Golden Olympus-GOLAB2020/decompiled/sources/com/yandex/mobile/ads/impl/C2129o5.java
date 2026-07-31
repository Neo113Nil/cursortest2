package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2129o5 implements InterfaceC2285v1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f29900a;

    public C2129o5(@NotNull List<C2243t5> adPodItems) {
        Intrinsics.checkNotNullParameter(adPodItems, "adPodItems");
        Iterator<T> it = adPodItems.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C2243t5) it.next()).a();
        }
        this.f29900a = j4;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2285v1
    public final long a() {
        return this.f29900a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2285v1
    public final long a(long j4) {
        return this.f29900a;
    }
}
