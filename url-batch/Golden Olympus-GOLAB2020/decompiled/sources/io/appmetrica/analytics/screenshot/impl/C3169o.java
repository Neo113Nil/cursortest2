package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.collections.AbstractC3219i;

/* renamed from: io.appmetrica.analytics.screenshot.impl.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3169o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40776a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40777b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40778c;

    public C3169o(boolean z4, List list, long j4) {
        this.f40776a = z4;
        this.f40777b = list;
        this.f40778c = j4;
    }

    public final long a() {
        return this.f40778c;
    }

    public final boolean b() {
        return this.f40776a;
    }

    public final List c() {
        return this.f40777b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f40776a + ", mediaStoreColumnNames='" + this.f40777b + "', detectWindowSeconds=" + this.f40778c + ')';
    }

    public C3169o() {
        this(new L().f40706a, AbstractC3219i.G0(new L().f40708c), new L().f40707b);
    }
}
