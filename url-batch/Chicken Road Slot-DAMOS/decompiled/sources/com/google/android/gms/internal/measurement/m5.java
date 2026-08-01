package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m5 implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e4 f2531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e7 f2532e;

    public m5(e4 e4Var, e7 e7Var) {
        this.f2531d = e4Var;
        this.f2532e = e7Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        f5 f5Var = (f5) obj;
        f5 f5Var2 = (f5) obj2;
        if (f5Var instanceof j5) {
            return !(f5Var2 instanceof j5) ? 1 : 0;
        }
        if (f5Var2 instanceof j5) {
            return -1;
        }
        e4 e4Var = this.f2531d;
        return e4Var == null ? f5Var.f().compareTo(f5Var2.f()) : (int) ia.r(e4Var.a(this.f2532e, Arrays.asList(f5Var, f5Var2)).g().doubleValue());
    }
}
