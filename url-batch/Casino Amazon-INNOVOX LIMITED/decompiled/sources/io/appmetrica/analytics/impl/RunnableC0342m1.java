package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0342m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1366a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0342m1(C0541u1 c0541u1, List list) {
        this.b = c0541u1;
        this.f1366a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportAnr(CollectionUtils.getMapFromList(this.f1366a));
    }
}
