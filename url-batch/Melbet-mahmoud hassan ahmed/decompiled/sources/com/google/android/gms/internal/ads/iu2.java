package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class iu2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<xt2, hu2<?, ?>> f6792a = new HashMap<>();

    public final <R extends ea1<AdT>, AdT extends v61> hu2<R, AdT> a(xt2 xt2Var, Context context, pt2 pt2Var, ou2<R, AdT> ou2Var) {
        hu2<R, AdT> hu2Var = (hu2) this.f6792a.get(xt2Var);
        if (hu2Var != null) {
            return hu2Var;
        }
        ut2 ut2Var = new ut2(au2.c(xt2Var, context));
        hu2<R, AdT> hu2Var2 = new hu2<>(ut2Var, new qu2(ut2Var, pt2Var, ou2Var));
        this.f6792a.put(xt2Var, hu2Var2);
        return hu2Var2;
    }
}
