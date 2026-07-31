package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x73 {
    public static <E> ArrayList<E> a(int i7) {
        c63.a(i7, "initialArraySize");
        return new ArrayList<>(i7);
    }

    public static <F, T> List<T> b(List<F> list, e43<? super F, ? extends T> e43Var) {
        return new w73(list, e43Var);
    }
}
