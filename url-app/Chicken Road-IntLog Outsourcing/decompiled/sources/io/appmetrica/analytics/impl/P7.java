package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7268b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7269c;

    public P7(String str, HashMap hashMap, String str2) {
        this.f7268b = str;
        this.f7267a = hashMap;
        this.f7269c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f7267a);
        sb.append(", mDeeplink='");
        sb.append(this.f7268b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC0279e.h(sb, this.f7269c, "'}");
    }
}
