package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0860p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12552c;

    public RunnableC0860p1(C0963t1 c0963t1, String str, List list) {
        this.f12552c = c0963t1;
        this.f12550a = str;
        this.f12551b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12552c).reportEvent(this.f12550a, CollectionUtils.getMapFromList(this.f12551b));
    }
}
