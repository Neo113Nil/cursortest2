package l2;

import java.util.HashMap;
import o2.C0924c;
import o2.l;
import o2.s;
import o2.t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final h f7978f = new h();

    /* renamed from: a, reason: collision with root package name */
    public final s f7979a = null;

    /* renamed from: b, reason: collision with root package name */
    public final C0924c f7980b = null;

    /* renamed from: c, reason: collision with root package name */
    public final s f7981c = null;

    /* renamed from: d, reason: collision with root package name */
    public final C0924c f7982d = null;

    /* renamed from: e, reason: collision with root package name */
    public final l f7983e = t.f8953a;

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        if (b()) {
            hashMap.put("sp", this.f7979a.getValue());
            C0924c c0924c = this.f7980b;
            if (c0924c != null) {
                hashMap.put("sn", c0924c.f8920d);
            }
        }
        s sVar = this.f7981c;
        if (sVar != null) {
            hashMap.put("ep", sVar.getValue());
            C0924c c0924c2 = this.f7982d;
            if (c0924c2 != null) {
                hashMap.put("en", c0924c2.f8920d);
            }
        }
        if (!this.f7983e.equals(t.f8953a)) {
            hashMap.put("i", this.f7983e.a());
        }
        return hashMap;
    }

    public final boolean b() {
        return this.f7979a != null;
    }

    public final boolean c() {
        return b();
    }

    public final boolean d() {
        return !b() && this.f7981c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f7983e.equals(hVar.f7983e)) {
            return false;
        }
        C0924c c0924c = this.f7982d;
        if (c0924c == null ? hVar.f7982d != null : !c0924c.equals(hVar.f7982d)) {
            return false;
        }
        s sVar = this.f7981c;
        if (sVar == null ? hVar.f7981c != null : !sVar.equals(hVar.f7981c)) {
            return false;
        }
        C0924c c0924c2 = this.f7980b;
        if (c0924c2 == null ? hVar.f7980b != null : !c0924c2.equals(hVar.f7980b)) {
            return false;
        }
        s sVar2 = this.f7979a;
        if (sVar2 == null ? hVar.f7979a == null : sVar2.equals(hVar.f7979a)) {
            return c() == hVar.c();
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((0 * 31) + (c() ? 1231 : 1237)) * 31;
        s sVar = this.f7979a;
        int hashCode = (i2 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        C0924c c0924c = this.f7980b;
        int hashCode2 = (hashCode + (c0924c != null ? c0924c.f8920d.hashCode() : 0)) * 31;
        s sVar2 = this.f7981c;
        int hashCode3 = (hashCode2 + (sVar2 != null ? sVar2.hashCode() : 0)) * 31;
        C0924c c0924c2 = this.f7982d;
        return ((hashCode3 + (c0924c2 != null ? c0924c2.f8920d.hashCode() : 0)) * 31) + this.f7983e.hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
