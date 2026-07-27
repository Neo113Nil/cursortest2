package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802li f7096c;

    public Lh(C0802li c0802li, String str, List list) {
        this.f7096c = c0802li;
        this.f7094a = str;
        this.f7095b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7096c;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportEvent(this.f7094a, CollectionUtils.getMapFromList(this.f7095b));
    }
}
