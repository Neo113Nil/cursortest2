package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d71 {

    /* renamed from: a, reason: collision with root package name */
    public final List<? extends cc3<? extends v61>> f4100a;

    public d71(v61 v61Var) {
        this.f4100a = Collections.singletonList(rb3.i(v61Var));
    }

    public d71(List<? extends cc3<? extends v61>> list) {
        this.f4100a = list;
    }

    public static a52<d71> a(a52<? extends v61> a52Var) {
        return new b52(a52Var, new e43() { // from class: com.google.android.gms.internal.ads.b71
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return new d71((v61) obj);
            }
        });
    }
}
