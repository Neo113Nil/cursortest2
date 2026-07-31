package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0442q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1444a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C0541u1 c;

    public RunnableC0442q1(C0541u1 c0541u1, String str, List list) {
        this.c = c0541u1;
        this.f1444a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.c).reportEvent(this.f1444a, CollectionUtils.getMapFromList(this.b));
    }
}
