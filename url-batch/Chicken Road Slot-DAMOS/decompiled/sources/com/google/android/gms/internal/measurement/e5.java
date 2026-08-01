package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e5 extends e4 {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2255i;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2256r;

    /* renamed from: s, reason: collision with root package name */
    public final e7 f2257s;

    public e5(String str, ArrayList arrayList, List list, e7 e7Var) {
        super(str);
        this.f2255i = new ArrayList();
        this.f2257s = e7Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                this.f2255i.add(((f5) obj).f());
            }
        }
        this.f2256r = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.e4
    public final f5 a(e7 e7Var, List list) {
        j5 j5Var;
        e7 d10 = this.f2257s.d();
        l5 l5Var = (l5) d10.f2260i;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2255i;
            int size = arrayList.size();
            j5Var = f5.f2280b;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                d10.g((String) arrayList.get(i10), ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(i10)));
            } else {
                d10.g((String) arrayList.get(i10), j5Var);
            }
            i10++;
        }
        ArrayList arrayList2 = this.f2256r;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj = arrayList2.get(i3);
            i3++;
            f5 f5Var = (f5) obj;
            f5 e2 = l5Var.e(d10, f5Var);
            if (e2 instanceof g5) {
                e2 = l5Var.e(d10, f5Var);
            }
            if (e2 instanceof t2) {
                return ((t2) e2).f2805d;
            }
        }
        return j5Var;
    }

    @Override // com.google.android.gms.internal.measurement.e4, com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return new e5(this);
    }

    public e5(e5 e5Var) {
        super(e5Var.f2253d);
        ArrayList arrayList = new ArrayList(e5Var.f2255i.size());
        this.f2255i = arrayList;
        arrayList.addAll(e5Var.f2255i);
        ArrayList arrayList2 = new ArrayList(e5Var.f2256r.size());
        this.f2256r = arrayList2;
        arrayList2.addAll(e5Var.f2256r);
        this.f2257s = e5Var.f2257s;
    }
}
