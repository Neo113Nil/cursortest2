package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2798m5 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f39439a = new CopyOnWriteArrayList();

    public final void a(@NonNull A4 a4) {
        this.f39439a.add(a4);
    }

    public final void b(@NonNull A4 a4) {
        this.f39439a.remove(a4);
    }

    public final List<A4> a() {
        return this.f39439a;
    }
}
