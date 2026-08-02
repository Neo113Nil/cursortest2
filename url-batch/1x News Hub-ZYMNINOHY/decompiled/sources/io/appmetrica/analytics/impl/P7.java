package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6453a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6454b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6455c;

    public P7(String str, HashMap hashMap, String str2) {
        this.f6454b = str;
        this.f6453a = hashMap;
        this.f6455c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f6453a);
        sb.append(", mDeeplink='");
        sb.append(this.f6454b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC0033i.m(sb, this.f6455c, "'}");
    }
}
