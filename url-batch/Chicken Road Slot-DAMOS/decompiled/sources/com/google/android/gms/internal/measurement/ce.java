package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ce extends e4 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2198i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2199r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ca f2200s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(ca caVar, boolean z10, boolean z11) {
        super("log");
        this.f2200s = caVar;
        this.f2198i = z10;
        this.f2199r = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // com.google.android.gms.internal.measurement.e4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f5 a(e7 e7Var, List list) {
        int i3;
        int i10;
        ia.f("log", list, 1);
        int size = list.size();
        j5 j5Var = f5.f2280b;
        ca caVar = this.f2200s;
        if (size == 1) {
            ((l.d) caVar.f2193r).C(3, ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(0)).f(), Collections.EMPTY_LIST, this.f2198i, this.f2199r);
            return j5Var;
        }
        f5 f5Var = (f5) list.get(0);
        l5 l5Var = (l5) e7Var.f2260i;
        l5 l5Var2 = (l5) e7Var.f2260i;
        int p4 = ia.p(l5Var.e(e7Var, f5Var).g().doubleValue());
        if (p4 != 2) {
            i3 = 3;
            if (p4 == 3) {
                i10 = 1;
            } else if (p4 == 5) {
                i10 = 5;
            } else if (p4 == 6) {
                i10 = 2;
            }
            String f3 = l5Var2.e(e7Var, (f5) list.get(1)).f();
            if (list.size() != 2) {
                ((l.d) caVar.f2193r).C(i10, f3, Collections.EMPTY_LIST, this.f2198i, this.f2199r);
                return j5Var;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
                arrayList.add(l5Var2.e(e7Var, (f5) list.get(i11)).f());
            }
            ((l.d) caVar.f2193r).C(i10, f3, arrayList, this.f2198i, this.f2199r);
            return j5Var;
        }
        i3 = 4;
        i10 = i3;
        String f32 = l5Var2.e(e7Var, (f5) list.get(1)).f();
        if (list.size() != 2) {
        }
    }
}
