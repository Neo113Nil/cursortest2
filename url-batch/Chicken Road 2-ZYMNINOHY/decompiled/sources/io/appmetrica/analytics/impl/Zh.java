package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11395b;

    public Zh(C0644gi c0644gi, List list) {
        this.f11395b = c0644gi;
        this.f11394a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11395b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportAnr(CollectionUtils.getMapFromList(this.f11394a));
    }
}
