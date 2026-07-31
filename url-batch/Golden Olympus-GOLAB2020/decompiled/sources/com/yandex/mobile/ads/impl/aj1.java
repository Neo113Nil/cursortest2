package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class aj1 extends AbstractC1862d {

    /* renamed from: f, reason: collision with root package name */
    private final int f23291f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23292g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f23293h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f23294i;

    /* renamed from: j, reason: collision with root package name */
    private final x42[] f23295j;

    /* renamed from: k, reason: collision with root package name */
    private final Object[] f23296k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<Object, Integer> f23297l;

    public aj1(List list, xx1 xx1Var) {
        super(xx1Var);
        int size = list.size();
        this.f23293h = new int[size];
        this.f23294i = new int[size];
        this.f23295j = new x42[size];
        this.f23296k = new Object[size];
        this.f23297l = new HashMap<>();
        Iterator it = list.iterator();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            fw0 fw0Var = (fw0) it.next();
            this.f23295j[i6] = fw0Var.b();
            this.f23294i[i6] = i4;
            this.f23293h[i6] = i5;
            i4 += this.f23295j[i6].b();
            i5 += this.f23295j[i6].a();
            this.f23296k[i6] = fw0Var.a();
            this.f23297l.put(this.f23296k[i6], Integer.valueOf(i6));
            i6++;
        }
        this.f23291f = i4;
        this.f23292g = i5;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final int a() {
        return this.f23292g;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final int b(Object obj) {
        Integer num = this.f23297l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final int c(int i4) {
        return u82.a(this.f23294i, i4 + 1, false, false);
    }

    final List<x42> d() {
        return Arrays.asList(this.f23295j);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final int e(int i4) {
        return this.f23293h[i4];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final int f(int i4) {
        return this.f23294i[i4];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final x42 g(int i4) {
        return this.f23295j[i4];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final Object d(int i4) {
        return this.f23296k[i4];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1862d
    protected final int b(int i4) {
        return u82.a(this.f23293h, i4 + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final int b() {
        return this.f23291f;
    }
}
