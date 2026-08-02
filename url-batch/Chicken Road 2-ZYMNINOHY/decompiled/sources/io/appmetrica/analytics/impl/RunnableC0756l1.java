package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0756l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f12256b;

    public RunnableC0756l1(C0963t1 c0963t1, List list) {
        this.f12256b = c0963t1;
        this.f12255a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f12256b).reportAnr(CollectionUtils.getMapFromList(this.f12255a));
    }
}
