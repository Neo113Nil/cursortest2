package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
final class q83 extends s83<Comparable<?>> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final q83 f10616f = new q83();

    private q83() {
    }

    @Override // com.google.android.gms.internal.ads.s83
    public final <S extends Comparable> s83<S> a() {
        return a93.f2689f;
    }

    @Override // com.google.android.gms.internal.ads.s83, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
