package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2768l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f39367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39368c;

    public RunnableC2768l1(C2872p1 c2872p1, String str, List list) {
        this.f39368c = c2872p1;
        this.f39366a = str;
        this.f39367b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39368c).reportEvent(this.f39366a, CollectionUtils.getMapFromList(this.f39367b));
    }
}
