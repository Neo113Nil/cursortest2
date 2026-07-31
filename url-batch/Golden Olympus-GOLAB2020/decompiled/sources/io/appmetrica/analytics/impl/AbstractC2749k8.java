package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2749k8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yc f39329a;

    public AbstractC2749k8() {
        Yc yc = new Yc(0);
        yc.a(EnumC2775l8.f39392b, 0);
        yc.a(EnumC2775l8.f39393c, 1);
        yc.a(EnumC2775l8.f39394d, 2);
        yc.a(EnumC2775l8.f39395e, 3);
        this.f39329a = yc;
    }

    @NotNull
    public final Yc a() {
        return this.f39329a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
