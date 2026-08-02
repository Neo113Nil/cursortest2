package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Gh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10328c;

    public Gh(C0644gi c0644gi, String str, List list) {
        this.f10328c = c0644gi;
        this.f10326a = str;
        this.f10327b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10328c;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportEvent(this.f10326a, CollectionUtils.getMapFromList(this.f10327b));
    }
}
