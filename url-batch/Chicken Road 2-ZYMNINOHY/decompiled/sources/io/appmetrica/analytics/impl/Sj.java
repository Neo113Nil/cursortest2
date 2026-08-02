package io.appmetrica.analytics.impl;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class Sj {

    /* renamed from: a, reason: collision with root package name */
    public final String f10951a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10952b;

    public Sj(String str, String str2) {
        this.f10951a = str;
        this.f10952b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.f10951a);
        sb.append("', eventValue='");
        return AbstractC0005f.q(sb, this.f10952b, "')");
    }
}
