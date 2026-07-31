package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class rq3 extends co3<String> implements RandomAccess, sq3 {

    /* renamed from: h, reason: collision with root package name */
    private static final rq3 f11350h;

    /* renamed from: i, reason: collision with root package name */
    public static final sq3 f11351i;

    /* renamed from: g, reason: collision with root package name */
    private final List<Object> f11352g;

    static {
        rq3 rq3Var = new rq3(10);
        f11350h = rq3Var;
        rq3Var.a();
        f11351i = rq3Var;
    }

    public rq3() {
        this(10);
    }

    public rq3(int i7) {
        this.f11352g = new ArrayList(i7);
    }

    private rq3(ArrayList<Object> arrayList) {
        this.f11352g = arrayList;
    }

    private static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof uo3 ? ((uo3) obj).i(kq3.f7586b) : kq3.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final Object E(int i7) {
        return this.f11352g.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        i();
        this.f11352g.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection<? extends String> collection) {
        i();
        if (collection instanceof sq3) {
            collection = ((sq3) collection).f();
        }
        boolean addAll = this.f11352g.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final sq3 b() {
        return c() ? new bt3(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.f11352g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.jq3
    public final /* bridge */ /* synthetic */ jq3 e(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f11352g);
        return new rq3((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final List<?> f() {
        return Collections.unmodifiableList(this.f11352g);
    }

    @Override // com.google.android.gms.internal.ads.sq3
    public final void h(uo3 uo3Var) {
        i();
        this.f11352g.add(uo3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String get(int i7) {
        Object obj = this.f11352g.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof uo3) {
            uo3 uo3Var = (uo3) obj;
            String i8 = uo3Var.i(kq3.f7586b);
            if (uo3Var.C()) {
                this.f11352g.set(i7, i8);
            }
            return i8;
        }
        byte[] bArr = (byte[]) obj;
        String h7 = kq3.h(bArr);
        if (kq3.i(bArr)) {
            this.f11352g.set(i7, h7);
        }
        return h7;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        i();
        Object remove = this.f11352g.remove(i7);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        i();
        return k(this.f11352g.set(i7, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11352g.size();
    }
}
