package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
final class p63<T> extends s83<T> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final Comparator<T> f10112f;

    p63(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f10112f = comparator;
    }

    @Override // com.google.android.gms.internal.ads.s83, java.util.Comparator
    public final int compare(T t6, T t7) {
        return this.f10112f.compare(t6, t7);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p63) {
            return this.f10112f.equals(((p63) obj).f10112f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10112f.hashCode();
    }

    public final String toString() {
        return this.f10112f.toString();
    }
}
