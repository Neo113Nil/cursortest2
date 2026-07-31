package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class qb0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f30722a;

    public final int b(int i4) {
        C2253tf.a(i4, this.f30722a.size());
        return this.f30722a.keyAt(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        if (u82.f32873a >= 24) {
            return this.f30722a.equals(qb0Var.f30722a);
        }
        if (this.f30722a.size() != qb0Var.f30722a.size()) {
            return false;
        }
        for (int i4 = 0; i4 < this.f30722a.size(); i4++) {
            if (b(i4) != qb0Var.b(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (u82.f32873a >= 24) {
            return this.f30722a.hashCode();
        }
        int size = this.f30722a.size();
        for (int i4 = 0; i4 < this.f30722a.size(); i4++) {
            size = (size * 31) + b(i4);
        }
        return size;
    }

    private qb0(SparseBooleanArray sparseBooleanArray) {
        this.f30722a = sparseBooleanArray;
    }

    public final boolean a(int i4) {
        return this.f30722a.get(i4);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f30723a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f30724b;

        public final a a(int i4) {
            if (this.f30724b) {
                throw new IllegalStateException();
            }
            this.f30723a.append(i4, true);
            return this;
        }

        public final void a(qb0 qb0Var) {
            for (int i4 = 0; i4 < qb0Var.f30722a.size(); i4++) {
                a(qb0Var.b(i4));
            }
        }

        public final qb0 a() {
            if (!this.f30724b) {
                this.f30724b = true;
                return new qb0(this.f30723a);
            }
            throw new IllegalStateException();
        }
    }

    public final int a() {
        return this.f30722a.size();
    }
}
