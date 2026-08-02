package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0651li f6289c;

    public Lh(C0651li c0651li, String str, List list) {
        this.f6289c = c0651li;
        this.f6287a = str;
        this.f6288b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6289c;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportEvent(this.f6287a, CollectionUtils.getMapFromList(this.f6288b));
    }
}
