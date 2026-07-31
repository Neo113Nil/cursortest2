package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class e12<V> {

    /* renamed from: c, reason: collision with root package name */
    private final lr<V> f25060c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f25059b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f25058a = -1;

    public e12(lr<V> lrVar) {
        this.f25060c = lrVar;
    }

    public final void a(int i4, V v4) {
        if (this.f25058a == -1) {
            if (this.f25059b.size() != 0) {
                throw new IllegalStateException();
            }
            this.f25058a = 0;
        }
        if (this.f25059b.size() > 0) {
            int keyAt = this.f25059b.keyAt(r0.size() - 1);
            if (i4 < keyAt) {
                throw new IllegalArgumentException();
            }
            if (keyAt == i4) {
                this.f25060c.accept(this.f25059b.valueAt(r1.size() - 1));
            }
        }
        this.f25059b.append(i4, v4);
    }

    public final V b(int i4) {
        if (this.f25058a == -1) {
            this.f25058a = 0;
        }
        while (true) {
            int i5 = this.f25058a;
            if (i5 <= 0 || i4 >= this.f25059b.keyAt(i5)) {
                break;
            }
            this.f25058a--;
        }
        while (this.f25058a < this.f25059b.size() - 1 && i4 >= this.f25059b.keyAt(this.f25058a + 1)) {
            this.f25058a++;
        }
        return this.f25059b.valueAt(this.f25058a);
    }

    public final boolean c() {
        return this.f25059b.size() == 0;
    }

    public final V b() {
        return this.f25059b.valueAt(r0.size() - 1);
    }

    public final void a() {
        for (int i4 = 0; i4 < this.f25059b.size(); i4++) {
            this.f25060c.accept(this.f25059b.valueAt(i4));
        }
        this.f25058a = -1;
        this.f25059b.clear();
    }

    public final void a(int i4) {
        int i5 = 0;
        while (i5 < this.f25059b.size() - 1) {
            int i6 = i5 + 1;
            if (i4 < this.f25059b.keyAt(i6)) {
                return;
            }
            this.f25060c.accept(this.f25059b.valueAt(i5));
            this.f25059b.removeAt(i5);
            int i7 = this.f25058a;
            if (i7 > 0) {
                this.f25058a = i7 - 1;
            }
            i5 = i6;
        }
    }
}
