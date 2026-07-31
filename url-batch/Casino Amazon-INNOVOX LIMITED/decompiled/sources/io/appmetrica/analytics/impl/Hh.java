package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Hh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f875a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C0231hi c;

    public Hh(C0231hi c0231hi, String str, List list) {
        this.c = c0231hi;
        this.f875a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.c;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportEvent(this.f875a, CollectionUtils.getMapFromList(this.b));
    }
}
