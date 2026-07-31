package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ns3 implements Iterator<Map.Entry> {

    /* renamed from: f, reason: collision with root package name */
    private int f9304f = -1;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9305g;

    /* renamed from: h, reason: collision with root package name */
    private Iterator<Map.Entry> f9306h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ss3 f9307i;

    /* synthetic */ ns3(ss3 ss3Var, ms3 ms3Var) {
        this.f9307i = ss3Var;
    }

    private final Iterator<Map.Entry> a() {
        Map map;
        if (this.f9306h == null) {
            map = this.f9307i.f11959h;
            this.f9306h = map.entrySet().iterator();
        }
        return this.f9306h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i7 = this.f9304f + 1;
        list = this.f9307i.f11958g;
        if (i7 < list.size()) {
            return true;
        }
        map = this.f9307i.f11959h;
        return !map.isEmpty() && a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        Object next;
        List list2;
        this.f9305g = true;
        int i7 = this.f9304f + 1;
        this.f9304f = i7;
        list = this.f9307i.f11958g;
        if (i7 < list.size()) {
            list2 = this.f9307i.f11958g;
            next = list2.get(this.f9304f);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f9305g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f9305g = false;
        this.f9307i.n();
        int i7 = this.f9304f;
        list = this.f9307i.f11958g;
        if (i7 >= list.size()) {
            a().remove();
            return;
        }
        ss3 ss3Var = this.f9307i;
        int i8 = this.f9304f;
        this.f9304f = i8 - 1;
        ss3Var.l(i8);
    }
}
