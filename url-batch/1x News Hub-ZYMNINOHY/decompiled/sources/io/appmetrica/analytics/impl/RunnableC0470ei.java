package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0470ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f7288b;

    public RunnableC0470ei(C0651li c0651li, List list) {
        this.f7288b = c0651li;
        this.f7287a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7288b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportAnr(CollectionUtils.getMapFromList(this.f7287a));
    }
}
