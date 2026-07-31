package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class an2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ee1 f23389a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f23390b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f23391c;

    public an2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23389a = ee1.f25268g.a(context);
        this.f23390b = new Object();
        this.f23391c = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.qa2
    public final void a() {
        List list;
        synchronized (this.f23390b) {
            list = CollectionsKt.toList(this.f23391c);
            this.f23391c.clear();
            Unit unit = Unit.f41027a;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f23389a.a((ra2) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.qa2
    public final void a(@NotNull ra2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f23390b) {
            this.f23391c.add(listener);
            this.f23389a.b(listener);
            Unit unit = Unit.f41027a;
        }
    }
}
