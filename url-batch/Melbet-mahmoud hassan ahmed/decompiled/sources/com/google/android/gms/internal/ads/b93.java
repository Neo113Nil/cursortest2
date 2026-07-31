package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class b93<T> extends s83<T> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final s83<? super T> f3289f;

    b93(s83<? super T> s83Var) {
        this.f3289f = s83Var;
    }

    @Override // com.google.android.gms.internal.ads.s83
    public final <S extends T> s83<S> a() {
        return this.f3289f;
    }

    @Override // com.google.android.gms.internal.ads.s83, java.util.Comparator
    public final int compare(T t6, T t7) {
        return this.f3289f.compare(t7, t6);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b93) {
            return this.f3289f.equals(((b93) obj).f3289f);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f3289f.hashCode();
    }

    public final String toString() {
        return this.f3289f.toString().concat(".reverse()");
    }
}
