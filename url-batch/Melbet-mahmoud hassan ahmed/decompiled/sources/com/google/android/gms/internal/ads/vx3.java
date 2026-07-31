package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class vx3 extends i33 {

    /* renamed from: e, reason: collision with root package name */
    private final int f13636e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13637f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f13638g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f13639h;

    /* renamed from: i, reason: collision with root package name */
    private final ei0[] f13640i;

    /* renamed from: j, reason: collision with root package name */
    private final Object[] f13641j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<Object, Integer> f13642k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vx3(Collection collection, Collection<? extends jx3> collection2, l74 l74Var) {
        super(false, collection2, null);
        int i7 = 0;
        int size = collection.size();
        this.f13638g = new int[size];
        this.f13639h = new int[size];
        this.f13640i = new ei0[size];
        this.f13641j = new Object[size];
        this.f13642k = new HashMap<>();
        Iterator it = collection.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            jx3 jx3Var = (jx3) it.next();
            this.f13640i[i9] = jx3Var.zza();
            this.f13639h[i9] = i7;
            this.f13638g[i9] = i8;
            i7 += this.f13640i[i9].c();
            i8 += this.f13640i[i9].b();
            this.f13641j[i9] = jx3Var.a();
            this.f13642k.put(this.f13641j[i9], Integer.valueOf(i9));
            i9++;
        }
        this.f13636e = i7;
        this.f13637f = i8;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int b() {
        return this.f13637f;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int c() {
        return this.f13636e;
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final int p(Object obj) {
        Integer num = this.f13642k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final int q(int i7) {
        return n13.I(this.f13638g, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final int r(int i7) {
        return n13.I(this.f13639h, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final int s(int i7) {
        return this.f13638g[i7];
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final int t(int i7) {
        return this.f13639h[i7];
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final ei0 u(int i7) {
        return this.f13640i[i7];
    }

    @Override // com.google.android.gms.internal.ads.i33
    protected final Object v(int i7) {
        return this.f13641j[i7];
    }

    final List<ei0> y() {
        return Arrays.asList(this.f13640i);
    }
}
