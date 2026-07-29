package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes2.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f6518a = new ArrayList();

    public void a(String str) {
        this.f6518a.add(str == null ? l.f6665a : new o(str));
    }

    public void a(j jVar) {
        if (jVar == null) {
            jVar = l.f6665a;
        }
        this.f6518a.add(jVar);
    }

    public int a() {
        return this.f6518a.size();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f6518a.iterator();
    }

    public j a(int i) {
        return this.f6518a.get(i);
    }

    @Override // com.google.gson.j
    public Number b() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public String c() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public double d() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public float e() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public long f() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public int g() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).g();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.j
    public boolean h() {
        if (this.f6518a.size() == 1) {
            return this.f6518a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f6518a.equals(this.f6518a));
    }

    public int hashCode() {
        return this.f6518a.hashCode();
    }
}
