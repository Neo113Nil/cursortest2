package j9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5109b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5110c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5111d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5112e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5113f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5114h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5115i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5116k;

    public a(int i3, boolean z10, boolean z11, boolean z12, boolean z13, float f3, float f10, int i10, boolean z14, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f5108a = i3;
        this.f5109b = z10;
        this.f5110c = z11;
        this.f5111d = z12;
        this.f5112e = z13;
        this.f5113f = f3;
        this.g = f10;
        this.f5114h = i10;
        this.f5115i = z14;
        this.j = list;
        this.f5116k = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    public static a a(a aVar, int i3, boolean z10, boolean z11, float f3, float f10, int i10, ArrayList arrayList, ArrayList arrayList2, int i11) {
        if ((i11 & 1) != 0) {
            i3 = aVar.f5108a;
        }
        int i12 = i3;
        boolean z12 = (i11 & 2) != 0 ? aVar.f5109b : z10;
        boolean z13 = (i11 & 4) != 0 ? aVar.f5110c : true;
        boolean z14 = (i11 & 8) != 0 ? aVar.f5111d : true;
        boolean z15 = (i11 & 16) != 0 ? aVar.f5112e : z11;
        float f11 = (i11 & 32) != 0 ? aVar.f5113f : f3;
        float f12 = (i11 & 64) != 0 ? aVar.g : f10;
        int i13 = (i11 & 128) != 0 ? aVar.f5114h : i10;
        boolean z16 = (i11 & 256) != 0 ? aVar.f5115i : true;
        ArrayList arrayList3 = (i11 & 512) != 0 ? aVar.j : arrayList;
        ArrayList arrayList4 = (i11 & 1024) != 0 ? aVar.f5116k : arrayList2;
        aVar.getClass();
        arrayList3.getClass();
        arrayList4.getClass();
        return new a(i12, z12, z13, z14, z15, f11, f12, i13, z16, arrayList3, arrayList4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5108a == aVar.f5108a && this.f5109b == aVar.f5109b && this.f5110c == aVar.f5110c && this.f5111d == aVar.f5111d && this.f5112e == aVar.f5112e && Float.compare(this.f5113f, aVar.f5113f) == 0 && Float.compare(this.g, aVar.g) == 0 && this.f5114h == aVar.f5114h && this.f5115i == aVar.f5115i && Intrinsics.a(this.j, aVar.j) && Intrinsics.a(this.f5116k, aVar.f5116k);
    }

    public final int hashCode() {
        return this.f5116k.hashCode() + ((this.j.hashCode() + l.d(v4.a.x(this.f5114h, l.b(this.g, l.b(this.f5113f, l.d(l.d(l.d(l.d(Integer.hashCode(this.f5108a) * 31, 31, this.f5109b), 31, this.f5110c), 31, this.f5111d), 31, this.f5112e), 31), 31), 31), 31, this.f5115i)) * 31);
    }

    public final String toString() {
        return "BattleBoard(score=" + this.f5108a + ", isPaused=" + this.f5109b + ", isGameOver=" + this.f5110c + ", isDead=" + this.f5111d + ", isMoving=" + this.f5112e + ", moveProgress=" + this.f5113f + ", roadOffset=" + this.g + ", currentLukIndex=" + this.f5114h + ", hasReachedCenter=" + this.f5115i + ", protectedLukIndexes=" + this.j + ", cars=" + this.f5116k + ")";
    }
}
