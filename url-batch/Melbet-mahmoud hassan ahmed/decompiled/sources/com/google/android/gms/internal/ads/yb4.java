package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class yb4 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f14604a;

    public final int a(int i7) {
        wu1.a(i7, 0, this.f14604a.size());
        return this.f14604a.keyAt(i7);
    }

    public final int b() {
        return this.f14604a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb4)) {
            return false;
        }
        yb4 yb4Var = (yb4) obj;
        if (n13.f8865a >= 24) {
            return this.f14604a.equals(yb4Var.f14604a);
        }
        if (this.f14604a.size() != yb4Var.f14604a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f14604a.size(); i7++) {
            if (a(i7) != yb4Var.a(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (n13.f8865a >= 24) {
            return this.f14604a.hashCode();
        }
        int size = this.f14604a.size();
        for (int i7 = 0; i7 < this.f14604a.size(); i7++) {
            size = (size * 31) + a(i7);
        }
        return size;
    }
}
