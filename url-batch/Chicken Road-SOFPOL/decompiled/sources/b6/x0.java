package b6;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1499a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1500b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1501c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1502d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1503e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1504f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1505g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1506h;
    public final int i;

    public x0(int i, List list, List list2, List list3, List list4, List list5, boolean z3, int i8, int i9) {
        this.f1499a = i;
        this.f1500b = list;
        this.f1501c = list2;
        this.f1502d = list3;
        this.f1503e = list4;
        this.f1504f = list5;
        this.f1505g = z3;
        this.f1506h = i8;
        this.i = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    public static x0 a(x0 x0Var, ArrayList arrayList, List list, List list2, List list3, int i, int i8, int i9) {
        int i10 = x0Var.f1499a;
        List list4 = x0Var.f1500b;
        ArrayList arrayList2 = arrayList;
        if ((i9 & 4) != 0) {
            arrayList2 = x0Var.f1501c;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i9 & 8) != 0) {
            list = x0Var.f1502d;
        }
        List list5 = list;
        if ((i9 & 16) != 0) {
            list2 = x0Var.f1503e;
        }
        List list6 = list2;
        if ((i9 & 32) != 0) {
            list3 = x0Var.f1504f;
        }
        List list7 = list3;
        boolean z3 = (i9 & 64) != 0 ? x0Var.f1505g : true;
        int i11 = (i9 & 128) != 0 ? x0Var.f1506h : i;
        int i12 = (i9 & 256) != 0 ? x0Var.i : i8;
        x0Var.getClass();
        q6.i.e(list5, "bucket1");
        q6.i.e(list6, "bucket2");
        q6.i.e(list7, "bucket3");
        return new x0(i10, list4, arrayList3, list5, list6, list7, z3, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f1499a == x0Var.f1499a && q6.i.a(this.f1500b, x0Var.f1500b) && q6.i.a(this.f1501c, x0Var.f1501c) && q6.i.a(this.f1502d, x0Var.f1502d) && q6.i.a(this.f1503e, x0Var.f1503e) && q6.i.a(this.f1504f, x0Var.f1504f) && this.f1505g == x0Var.f1505g && this.f1506h == x0Var.f1506h && this.i == x0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + a0.q.b(this.f1506h, a0.q.d((this.f1504f.hashCode() + ((this.f1503e.hashCode() + ((this.f1502d.hashCode() + ((this.f1501c.hashCode() + ((this.f1500b.hashCode() + (Integer.hashCode(this.f1499a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f1505g), 31);
    }

    public final String toString() {
        return "GameState(level=" + this.f1499a + ", items=" + this.f1500b + ", itemsToSort=" + this.f1501c + ", bucket1=" + this.f1502d + ", bucket2=" + this.f1503e + ", bucket3=" + this.f1504f + ", isCompleted=" + this.f1505g + ", mistakes=" + this.f1506h + ", correctSorts=" + this.i + ")";
    }
}
