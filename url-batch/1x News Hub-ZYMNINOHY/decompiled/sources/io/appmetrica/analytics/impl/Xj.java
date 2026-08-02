package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;

/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public final String f6870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6871b;

    public Xj(String str, String str2) {
        this.f6870a = str;
        this.f6871b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.f6870a);
        sb.append("', eventValue='");
        return AbstractC0033i.m(sb, this.f6871b, "')");
    }
}
