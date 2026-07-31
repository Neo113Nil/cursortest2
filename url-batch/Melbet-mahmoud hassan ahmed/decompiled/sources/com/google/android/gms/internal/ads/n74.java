package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class n74<V> {

    /* renamed from: c, reason: collision with root package name */
    private final bz1<V> f8974c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f8973b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f8972a = -1;

    public n74(bz1<V> bz1Var) {
        this.f8974c = bz1Var;
    }

    public final V a(int i7) {
        if (this.f8972a == -1) {
            this.f8972a = 0;
        }
        while (true) {
            int i8 = this.f8972a;
            if (i8 > 0 && i7 < this.f8973b.keyAt(i8)) {
                this.f8972a--;
            }
        }
        while (this.f8972a < this.f8973b.size() - 1 && i7 >= this.f8973b.keyAt(this.f8972a + 1)) {
            this.f8972a++;
        }
        return this.f8973b.valueAt(this.f8972a);
    }

    public final V b() {
        return this.f8973b.valueAt(r0.size() - 1);
    }

    public final void c(int i7, V v6) {
        if (this.f8972a == -1) {
            wu1.f(this.f8973b.size() == 0);
            this.f8972a = 0;
        }
        if (this.f8973b.size() > 0) {
            int keyAt = this.f8973b.keyAt(r0.size() - 1);
            wu1.d(i7 >= keyAt);
            if (keyAt == i7) {
                h74.A((f74) this.f8973b.valueAt(r0.size() - 1));
            }
        }
        this.f8973b.append(i7, v6);
    }

    public final void d() {
        for (int i7 = 0; i7 < this.f8973b.size(); i7++) {
            h74.A((f74) this.f8973b.valueAt(i7));
        }
        this.f8972a = -1;
        this.f8973b.clear();
    }

    public final void e(int i7) {
        int i8 = 0;
        while (i8 < this.f8973b.size() - 1) {
            int i9 = i8 + 1;
            if (i7 < this.f8973b.keyAt(i9)) {
                return;
            }
            h74.A((f74) this.f8973b.valueAt(i8));
            this.f8973b.removeAt(i8);
            int i10 = this.f8972a;
            if (i10 > 0) {
                this.f8972a = i10 - 1;
            }
            i8 = i9;
        }
    }

    public final boolean f() {
        return this.f8973b.size() == 0;
    }
}
