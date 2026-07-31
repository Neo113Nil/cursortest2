package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2566d8 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f38843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38844b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38845c;

    public C2566d8(String str, HashMap hashMap, String str2) {
        this.f38844b = str;
        this.f38843a = hashMap;
        this.f38845c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f38843a + ", mDeeplink='" + this.f38844b + "', mUnparsedReferrer='" + this.f38845c + "'}";
    }
}
