package com.applovin.impl.a;

import com.applovin.impl.sdk.e.m;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private String f2413a;

    /* renamed from: b, reason: collision with root package name */
    private String f2414b;

    private f() {
    }

    public static f a(m mVar, f fVar, com.applovin.impl.sdk.j jVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (fVar == null) {
            try {
                fVar = new f();
            } catch (Throwable th) {
                jVar.u().b("VastSystemInfo", "Error occurred while initializing", th);
                return null;
            }
        }
        if (!com.applovin.impl.sdk.e.i.b(fVar.f2413a)) {
            String c2 = mVar.c();
            if (com.applovin.impl.sdk.e.i.b(c2)) {
                fVar.f2413a = c2;
            }
        }
        if (!com.applovin.impl.sdk.e.i.b(fVar.f2414b)) {
            String str = mVar.b().get("version");
            if (com.applovin.impl.sdk.e.i.b(str)) {
                fVar.f2414b = str;
            }
        }
        return fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2413a == null ? fVar.f2413a == null : this.f2413a.equals(fVar.f2413a)) {
            return this.f2414b != null ? this.f2414b.equals(fVar.f2414b) : fVar.f2414b == null;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2413a != null ? this.f2413a.hashCode() : 0) * 31) + (this.f2414b != null ? this.f2414b.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f2413a + "', version='" + this.f2414b + "'}";
    }
}
