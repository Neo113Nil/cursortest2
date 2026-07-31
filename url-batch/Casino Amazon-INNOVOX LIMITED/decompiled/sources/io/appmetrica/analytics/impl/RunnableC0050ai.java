package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0050ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1168a;
    public final /* synthetic */ C0231hi b;

    public RunnableC0050ai(C0231hi c0231hi, List list) {
        this.b = c0231hi;
        this.f1168a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportAnr(CollectionUtils.getMapFromList(this.f1168a));
    }
}
