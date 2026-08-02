package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class J7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10474c;

    public J7(String str, HashMap hashMap, String str2) {
        this.f10473b = str;
        this.f10472a = hashMap;
        this.f10474c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f10472a);
        sb.append(", mDeeplink='");
        sb.append(this.f10473b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC0005f.q(sb, this.f10474c, "'}");
    }
}
