package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0759k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8599b;

    public RunnableC0759k1(C0966s1 c0966s1, List list) {
        this.f8599b = c0966s1;
        this.f8598a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8599b).reportAnr(CollectionUtils.getMapFromList(this.f8598a));
    }
}
