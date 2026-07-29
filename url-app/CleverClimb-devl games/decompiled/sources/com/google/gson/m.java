package com.google.gson;

import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* loaded from: classes2.dex */
public final class m extends j {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.f<String, j> f6666a = new com.google.gson.internal.f<>();

    public void a(String str, j jVar) {
        if (jVar == null) {
            jVar = l.f6665a;
        }
        this.f6666a.put(str, jVar);
    }

    public void a(String str, String str2) {
        a(str, a((Object) str2));
    }

    public void a(String str, Number number) {
        a(str, a(number));
    }

    public void a(String str, Boolean bool) {
        a(str, a(bool));
    }

    private j a(Object obj) {
        return obj == null ? l.f6665a : new o(obj);
    }

    public Set<Map.Entry<String, j>> a() {
        return this.f6666a.entrySet();
    }

    public boolean a(String str) {
        return this.f6666a.containsKey(str);
    }

    public j b(String str) {
        return this.f6666a.get(str);
    }

    public g c(String str) {
        return (g) this.f6666a.get(str);
    }

    public m d(String str) {
        return (m) this.f6666a.get(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f6666a.equals(this.f6666a));
    }

    public int hashCode() {
        return this.f6666a.hashCode();
    }
}
