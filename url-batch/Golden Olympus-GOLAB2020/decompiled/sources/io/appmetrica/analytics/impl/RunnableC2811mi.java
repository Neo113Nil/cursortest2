package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2811mi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f39454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39455b;

    public RunnableC2811mi(C2992ti c2992ti, List list) {
        this.f39455b = c2992ti;
        this.f39454a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39455b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportAnr(CollectionUtils.getMapFromList(this.f39454a));
    }
}
