package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class wq3 extends yq3 {
    /* synthetic */ wq3(vq3 vq3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.yq3
    final <L> List<L> a(Object obj, long j7) {
        jq3 jq3Var = (jq3) gt3.p(obj, j7);
        if (jq3Var.c()) {
            return jq3Var;
        }
        int size = jq3Var.size();
        jq3 e7 = jq3Var.e(size == 0 ? 10 : size + size);
        gt3.D(obj, j7, e7);
        return e7;
    }

    @Override // com.google.android.gms.internal.ads.yq3
    final void b(Object obj, long j7) {
        ((jq3) gt3.p(obj, j7)).a();
    }

    @Override // com.google.android.gms.internal.ads.yq3
    final <E> void c(Object obj, Object obj2, long j7) {
        jq3 jq3Var = (jq3) gt3.p(obj, j7);
        jq3 jq3Var2 = (jq3) gt3.p(obj2, j7);
        int size = jq3Var.size();
        int size2 = jq3Var2.size();
        if (size > 0 && size2 > 0) {
            if (!jq3Var.c()) {
                jq3Var = jq3Var.e(size2 + size);
            }
            jq3Var.addAll(jq3Var2);
        }
        if (size > 0) {
            jq3Var2 = jq3Var;
        }
        gt3.D(obj, j7, jq3Var2);
    }
}
