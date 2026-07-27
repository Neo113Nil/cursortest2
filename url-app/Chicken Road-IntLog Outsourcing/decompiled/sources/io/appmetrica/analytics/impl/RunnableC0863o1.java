package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0863o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f8906c;

    public RunnableC0863o1(C0966s1 c0966s1, String str, List list) {
        this.f8906c = c0966s1;
        this.f8904a = str;
        this.f8905b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f8906c).reportEvent(this.f8904a, CollectionUtils.getMapFromList(this.f8905b));
    }
}
