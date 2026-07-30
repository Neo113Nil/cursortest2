package com.anythink.core.common.h;

import java.util.concurrent.ConcurrentHashMap;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    public int f13877a;

    /* renamed from: b, reason: collision with root package name */
    public String f13878b;

    /* renamed from: c, reason: collision with root package name */
    public int f13879c;

    /* renamed from: d, reason: collision with root package name */
    public int f13880d;

    /* renamed from: e, reason: collision with root package name */
    public long f13881e;

    /* renamed from: f, reason: collision with root package name */
    public String f13882f;

    /* renamed from: g, reason: collision with root package name */
    public String f13883g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap<String, a> f13884h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f13885a;

        /* renamed from: b, reason: collision with root package name */
        public String f13886b;

        /* renamed from: c, reason: collision with root package name */
        public String f13887c;

        /* renamed from: d, reason: collision with root package name */
        public int f13888d;

        /* renamed from: e, reason: collision with root package name */
        public int f13889e;

        /* renamed from: f, reason: collision with root package name */
        public long f13890f;

        public final String toString() {
            return "AdSourceImpressionInfo{unitId='" + this.f13885a + "', hourTimeFormat='" + this.f13886b + "', dateTimeFormat='" + this.f13887c + "', dayShowCount=" + this.f13888d + ", hourShowCount=" + this.f13889e + ", showTime=" + this.f13890f + '}';
        }
    }

    public final a a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f13884h;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementImpressionInfo{format=");
        sb.append(this.f13877a);
        sb.append(", placementId='");
        sb.append(this.f13878b);
        sb.append("', dayShowCount=");
        sb.append(this.f13879c);
        sb.append(", hourShowCount=");
        sb.append(this.f13880d);
        sb.append(", showTime=");
        sb.append(this.f13881e);
        sb.append(", hourTimeFormat='");
        sb.append(this.f13882f);
        sb.append("', dateTimeFormat='");
        return AbstractC5051n.g(sb, this.f13883g, "'}");
    }

    private synchronized void a(String str, a aVar) {
        try {
            if (this.f13884h == null) {
                this.f13884h = new ConcurrentHashMap<>(3);
            }
            this.f13884h.put(str, aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
