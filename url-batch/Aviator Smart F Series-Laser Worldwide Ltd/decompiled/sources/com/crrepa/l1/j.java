package com.crrepa.l1;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class j extends h {

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.n1.j<String, h> f13254a = new com.crrepa.n1.j<>();

    public g b(String str) {
        return (g) this.f13254a.get(str);
    }

    public j c(String str) {
        return (j) this.f13254a.get(str);
    }

    public k d(String str) {
        return (k) this.f13254a.get(str);
    }

    public boolean e(String str) {
        return this.f13254a.containsKey(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f13254a.equals(this.f13254a));
    }

    public h f(String str) {
        return this.f13254a.remove(str);
    }

    public int hashCode() {
        return this.f13254a.hashCode();
    }

    public int size() {
        return this.f13254a.size();
    }

    @Override // com.crrepa.l1.h
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j a() {
        j jVar = new j();
        for (Map.Entry<String, h> entry : this.f13254a.entrySet()) {
            jVar.a(entry.getKey(), entry.getValue().a());
        }
        return jVar;
    }

    public Set<Map.Entry<String, h>> w() {
        return this.f13254a.entrySet();
    }

    public Set<String> x() {
        return this.f13254a.keySet();
    }

    public h a(String str) {
        return this.f13254a.get(str);
    }

    public void a(String str, h hVar) {
        com.crrepa.n1.j<String, h> jVar = this.f13254a;
        if (hVar == null) {
            hVar = i.f13253a;
        }
        jVar.put(str, hVar);
    }

    public void a(String str, Boolean bool) {
        a(str, bool == null ? i.f13253a : new k(bool));
    }

    public void a(String str, Character ch) {
        a(str, ch == null ? i.f13253a : new k(ch));
    }

    public void a(String str, Number number) {
        a(str, number == null ? i.f13253a : new k(number));
    }

    public void a(String str, String str2) {
        a(str, str2 == null ? i.f13253a : new k(str2));
    }
}
