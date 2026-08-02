package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0608k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7699b;

    public RunnableC0608k1(C0815s1 c0815s1, List list) {
        this.f7699b = c0815s1;
        this.f7698a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7699b).reportAnr(CollectionUtils.getMapFromList(this.f7698a));
    }
}
