package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2161pe {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f30421a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f30422b = new ArrayList();

    public final void a(@NotNull C2138oe appMetricaIdentifiers) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (this.f30421a) {
            arrayList = new ArrayList(this.f30422b);
            this.f30422b.clear();
            Unit unit = Unit.f41027a;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((gi0) obj).a(appMetricaIdentifiers);
        }
    }

    public final void a() {
        synchronized (this.f30421a) {
            this.f30422b.clear();
            Unit unit = Unit.f41027a;
        }
    }

    public final void a(@NotNull gi0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f30421a) {
            this.f30422b.add(observer);
        }
    }
}
