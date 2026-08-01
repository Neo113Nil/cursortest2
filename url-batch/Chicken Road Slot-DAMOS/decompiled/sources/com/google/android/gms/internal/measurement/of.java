package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class of extends e4 {

    /* renamed from: i, reason: collision with root package name */
    public final v5 f2648i;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f2649r;

    public of(v5 v5Var) {
        super("require");
        this.f2649r = new HashMap();
        this.f2648i = v5Var;
    }

    @Override // com.google.android.gms.internal.measurement.e4
    public final f5 a(e7 e7Var, List list) {
        f5 f5Var;
        ia.c("require", list, 1);
        String f3 = ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(0)).f();
        HashMap hashMap = this.f2649r;
        if (hashMap.containsKey(f3)) {
            return (f5) hashMap.get(f3);
        }
        HashMap hashMap2 = (HashMap) this.f2648i.f2870e;
        if (hashMap2.containsKey(f3)) {
            try {
                f5Var = (f5) ((Callable) hashMap2.get(f3)).call();
            } catch (Exception unused) {
                kotlin.collections.i0.l("Failed to create API implementation: ".concat(String.valueOf(f3)));
                return null;
            }
        } else {
            f5Var = f5.f2280b;
        }
        if (f5Var instanceof e4) {
            hashMap.put(f3, (e4) f5Var);
        }
        return f5Var;
    }
}
