package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
final class a93 extends s83<Comparable<?>> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final a93 f2689f = new a93();

    private a93() {
    }

    @Override // com.google.android.gms.internal.ads.s83
    public final <S extends Comparable> s83<S> a() {
        return q83.f10616f;
    }

    @Override // com.google.android.gms.internal.ads.s83, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
