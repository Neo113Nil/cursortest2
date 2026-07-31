package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f38323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38324c;

    public Th(C2992ti c2992ti, String str, List list) {
        this.f38324c = c2992ti;
        this.f38322a = str;
        this.f38323b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38324c;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportEvent(this.f38322a, CollectionUtils.getMapFromList(this.f38323b));
    }
}
