package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public final String f7707a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7708b;

    public Xj(String str, String str2) {
        this.f7707a = str;
        this.f7708b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.f7707a);
        sb.append("', eventValue='");
        return AbstractC0279e.h(sb, this.f7708b, "')");
    }
}
