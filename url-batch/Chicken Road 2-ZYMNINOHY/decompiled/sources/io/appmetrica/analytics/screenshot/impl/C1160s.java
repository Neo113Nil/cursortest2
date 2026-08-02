package io.appmetrica.analytics.screenshot.impl;

import c3.C0297i;
import o3.InterfaceC1328a;

/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160s extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1163v f13500a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160s(C1163v c1163v) {
        super(0);
        this.f13500a = c1163v;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        ((C1165x) this.f13500a.f13504b).a("ContentObserverScreenshotCaptor");
        return C0297i.f5732a;
    }
}
