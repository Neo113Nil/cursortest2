package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0712o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f7986c;

    public RunnableC0712o1(C0815s1 c0815s1, String str, List list) {
        this.f7986c = c0815s1;
        this.f7984a = str;
        this.f7985b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f7986c).reportEvent(this.f7984a, CollectionUtils.getMapFromList(this.f7985b));
    }
}
