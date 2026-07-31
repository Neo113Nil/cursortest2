package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2665h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f39118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39119b;

    public RunnableC2665h1(C2872p1 c2872p1, List list) {
        this.f39119b = c2872p1;
        this.f39118a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39119b).reportAnr(CollectionUtils.getMapFromList(this.f39118a));
    }
}
