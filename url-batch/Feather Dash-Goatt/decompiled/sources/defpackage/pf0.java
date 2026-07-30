package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pf0 {
    public final en0 a;
    public final mf0 b;
    public final ue0 c;
    public final long d;
    public final /* synthetic */ ue0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ id h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ wf0 l;

    public pf0(long j, mf0 mf0Var, ue0 ue0Var, int i, int i2, id idVar, int i3, int i4, long j2, wf0 wf0Var) {
        this.e = ue0Var;
        this.f = i;
        this.g = i2;
        this.h = idVar;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = wf0Var;
        en0 en0Var = r90.a;
        this.a = new en0();
        this.b = mf0Var;
        this.c = ue0Var;
        this.d = nm.b(mm.h(j), Integer.MAX_VALUE, 5);
    }

    public final sf0 a(int i, long j) {
        long j2;
        List list;
        mf0 mf0Var = this.b;
        Object d = mf0Var.d(i);
        Object b = mf0Var.b(i);
        en0 en0Var = this.a;
        List list2 = (List) en0Var.b(i);
        if (list2 != null) {
            j2 = j;
            list = list2;
        } else {
            ue0 ue0Var = this.c;
            mf0 mf0Var2 = ue0Var.g;
            en0 en0Var2 = ue0Var.h;
            List list3 = (List) en0Var2.b(i);
            if (list3 == null) {
                Object d2 = mf0Var2.d(i);
                list3 = ue0Var.e.i(d2, ue0Var.d.a(d2, i, mf0Var2.b(i)));
                en0Var2.h(i, list3);
            }
            int size = list3.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((qk0) list3.get(i2)).c(j));
            }
            j2 = j;
            en0Var.h(i, arrayList);
            list = arrayList;
        }
        return new sf0(i, list, this.h, this.e.e.getLayoutDirection(), this.i, this.j, i != this.f + (-1) ? this.g : 0, this.k, d, b, this.l.n, j2);
    }
}
