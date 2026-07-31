package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2524bk implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f38738b;

    public C2524bk(String str, Map map) {
        this.f38737a = str;
        this.f38738b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportEvent(this.f38737a, this.f38738b);
    }
}
