package com.anythink.core.common.c;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private String f12438a;

    /* renamed from: b, reason: collision with root package name */
    private long f12439b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12440c;

    /* renamed from: d, reason: collision with root package name */
    private String f12441d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12442e;

    /* renamed from: f, reason: collision with root package name */
    private String f12443f;

    public c(String str, String str2, boolean z8, long j9, boolean z9) {
        this(str, str2, z8, j9, z9, null);
    }

    private String f() {
        return this.f12438a;
    }

    public final long a() {
        return this.f12439b;
    }

    public final boolean b() {
        return this.f12440c;
    }

    public final String c() {
        return this.f12441d;
    }

    public final boolean d() {
        return this.f12442e;
    }

    public final String e() {
        return this.f12443f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkInspectResult{pkgName='");
        sb.append(this.f12438a);
        sb.append("', inspectTime=");
        sb.append(this.f12439b);
        sb.append(", inspectResult=");
        sb.append(this.f12440c);
        sb.append(", appVersion='");
        sb.append(this.f12441d);
        sb.append("', isRealTimeInspect=");
        sb.append(this.f12442e);
        sb.append(", uploadKey='");
        return AbstractC5051n.g(sb, this.f12443f, "'}");
    }

    public c(String str, String str2, boolean z8, long j9, boolean z9, String str3) {
        this.f12438a = str;
        this.f12443f = str2;
        this.f12442e = z8;
        this.f12439b = j9;
        this.f12440c = z9;
        this.f12441d = str3;
    }
}
