package com.crrepa.l1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class g extends h implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final List<h> f13252a;

    public g() {
        this.f13252a = new ArrayList();
    }

    public h b(int i8) {
        return this.f13252a.remove(i8);
    }

    @Override // com.crrepa.l1.h
    public BigInteger c() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public boolean d() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public byte e() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f13252a.equals(this.f13252a));
    }

    @Override // com.crrepa.l1.h
    public char f() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public double g() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).g();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public float h() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f13252a.hashCode();
    }

    @Override // com.crrepa.l1.h
    public int i() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).i();
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return this.f13252a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<h> iterator() {
        return this.f13252a.iterator();
    }

    @Override // com.crrepa.l1.h
    public long n() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).n();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public Number o() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).o();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public short p() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).p();
        }
        throw new IllegalStateException();
    }

    @Override // com.crrepa.l1.h
    public String q() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).q();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.f13252a.size();
    }

    @Override // com.crrepa.l1.h
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public g a() {
        if (this.f13252a.isEmpty()) {
            return new g();
        }
        g gVar = new g(this.f13252a.size());
        Iterator<h> it = this.f13252a.iterator();
        while (it.hasNext()) {
            gVar.a(it.next().a());
        }
        return gVar;
    }

    public g(int i8) {
        this.f13252a = new ArrayList(i8);
    }

    public h a(int i8) {
        return this.f13252a.get(i8);
    }

    @Override // com.crrepa.l1.h
    public BigDecimal b() {
        if (this.f13252a.size() == 1) {
            return this.f13252a.get(0).b();
        }
        throw new IllegalStateException();
    }

    public boolean c(h hVar) {
        return this.f13252a.remove(hVar);
    }

    public h a(int i8, h hVar) {
        return this.f13252a.set(i8, hVar);
    }

    public boolean b(h hVar) {
        return this.f13252a.contains(hVar);
    }

    public void a(g gVar) {
        this.f13252a.addAll(gVar.f13252a);
    }

    public void a(h hVar) {
        if (hVar == null) {
            hVar = i.f13253a;
        }
        this.f13252a.add(hVar);
    }

    public void a(Boolean bool) {
        this.f13252a.add(bool == null ? i.f13253a : new k(bool));
    }

    public void a(Character ch) {
        this.f13252a.add(ch == null ? i.f13253a : new k(ch));
    }

    public void a(Number number) {
        this.f13252a.add(number == null ? i.f13253a : new k(number));
    }

    public void a(String str) {
        this.f13252a.add(str == null ? i.f13253a : new k(str));
    }
}
