package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w8 {
    public final u8 a;
    public final qt0 b;
    public final v8 c;
    public final int d;
    public final int e;
    public final jo f;
    public final List g;
    public final List h;
    public final e40 i;
    public final boolean j;
    public final boolean k;

    public w8(u8 u8Var, qt0 qt0Var, v8 v8Var, int i, int i2, jo joVar, List list, List list2, e40 e40Var, boolean z, boolean z2) {
        u8Var.getClass();
        qt0Var.getClass();
        list.getClass();
        list2.getClass();
        this.a = u8Var;
        this.b = qt0Var;
        this.c = v8Var;
        this.d = i;
        this.e = i2;
        this.f = joVar;
        this.g = list;
        this.h = list2;
        this.i = e40Var;
        this.j = z;
        this.k = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    public static w8 a(w8 w8Var, u8 u8Var, qt0 qt0Var, v8 v8Var, int i, int i2, jo joVar, List list, ArrayList arrayList, e40 e40Var, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            u8Var = w8Var.a;
        }
        u8 u8Var2 = u8Var;
        if ((i3 & 2) != 0) {
            qt0Var = w8Var.b;
        }
        qt0 qt0Var2 = qt0Var;
        if ((i3 & 4) != 0) {
            v8Var = w8Var.c;
        }
        v8 v8Var2 = v8Var;
        int i4 = (i3 & 8) != 0 ? w8Var.d : i;
        int i5 = (i3 & 16) != 0 ? w8Var.e : i2;
        jo joVar2 = (i3 & 32) != 0 ? w8Var.f : joVar;
        List list2 = (i3 & 64) != 0 ? w8Var.g : list;
        ArrayList arrayList2 = (i3 & 128) != 0 ? w8Var.h : arrayList;
        e40 e40Var2 = (i3 & 256) != 0 ? w8Var.i : e40Var;
        boolean z2 = (i3 & 512) != 0 ? w8Var.j : true;
        boolean z3 = (i3 & 1024) != 0 ? w8Var.k : z;
        w8Var.getClass();
        u8Var2.getClass();
        qt0Var2.getClass();
        list2.getClass();
        arrayList2.getClass();
        return new w8(u8Var2, qt0Var2, v8Var2, i4, i5, joVar2, list2, arrayList2, e40Var2, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return Intrinsics.a(this.a, w8Var.a) && Intrinsics.a(this.b, w8Var.b) && this.c.equals(w8Var.c) && this.d == w8Var.d && this.e == w8Var.e && this.f.equals(w8Var.f) && Intrinsics.a(this.g, w8Var.g) && Intrinsics.a(this.h, w8Var.h) && Intrinsics.a(this.i, w8Var.i) && this.j == w8Var.j && this.k == w8Var.k;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + qy0.c(this.e, qy0.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31;
        e40 e40Var = this.i;
        return Boolean.hashCode(this.k) + qy0.d((hashCode + (e40Var == null ? 0 : e40Var.hashCode())) * 31, 31, this.j);
    }

    public final String toString() {
        return "AppUiState(screen=" + this.a + ", overlay=" + this.b + ", settings=" + this.c + ", goldenFeathers=" + this.d + ", bestCompletedDistance=" + this.e + ", dailyRewardState=" + this.f + ", history=" + this.g + ", achievements=" + this.h + ", gameSession=" + this.i + ", loadingComplete=" + this.j + ", appInForeground=" + this.k + ")";
    }
}
