package com.applovin.impl.sdk;

import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f3315a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f3316b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3317c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3318d;

    public l(String str, Map<String, String> map, long j, String str2) {
        this.f3315a = str;
        this.f3316b = map;
        this.f3317c = j;
        this.f3318d = str2;
    }

    public String a() {
        return this.f3315a;
    }

    public Map<String, String> b() {
        return this.f3316b;
    }

    public long c() {
        return this.f3317c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3317c != lVar.f3317c) {
            return false;
        }
        if (this.f3315a == null ? lVar.f3315a != null : !this.f3315a.equals(lVar.f3315a)) {
            return false;
        }
        if (this.f3316b == null ? lVar.f3316b != null : !this.f3316b.equals(lVar.f3316b)) {
            return false;
        }
        if (this.f3318d != null) {
            if (this.f3318d.equals(lVar.f3318d)) {
                return true;
            }
        } else if (lVar.f3318d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f3315a != null ? this.f3315a.hashCode() : 0) * 31) + (this.f3316b != null ? this.f3316b.hashCode() : 0)) * 31) + ((int) (this.f3317c ^ (this.f3317c >>> 32)))) * 31) + (this.f3318d != null ? this.f3318d.hashCode() : 0);
    }

    public String toString() {
        return "Event{eventType='" + this.f3315a + "', parameters=" + this.f3316b + ", creationTsMillis=" + this.f3317c + ", uniqueIdentifier='" + this.f3318d + "'}";
    }
}
