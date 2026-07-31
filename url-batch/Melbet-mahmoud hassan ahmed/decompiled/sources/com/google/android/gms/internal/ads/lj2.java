package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lj2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ij2<? extends hj2<T>>> f7996a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7997b;

    public lj2(Executor executor, Set<ij2<? extends hj2<T>>> set) {
        this.f7997b = executor;
        this.f7996a = set;
    }

    public final cc3<T> a(final T t6) {
        final ArrayList arrayList = new ArrayList(this.f7996a.size());
        for (final ij2<? extends hj2<T>> ij2Var : this.f7996a) {
            cc3<? extends hj2<T>> a7 = ij2Var.a();
            if (d30.f4056a.e().booleanValue()) {
                final long a8 = y2.t.a().a();
                a7.b(new Runnable() { // from class: com.google.android.gms.internal.ads.jj2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ij2 ij2Var2 = ij2.this;
                        long j7 = a8;
                        String canonicalName = ij2Var2.getClass().getCanonicalName();
                        long a9 = y2.t.a().a();
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(a9 - j7);
                        a3.r1.k(sb.toString());
                    }
                }, wo0.f13899f);
            }
            arrayList.add(a7);
        }
        return rb3.c(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.kj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj = t6;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hj2 hj2Var = (hj2) ((cc3) it.next()).get();
                    if (hj2Var != null) {
                        hj2Var.c(obj);
                    }
                }
                return obj;
            }
        }, this.f7997b);
    }
}
