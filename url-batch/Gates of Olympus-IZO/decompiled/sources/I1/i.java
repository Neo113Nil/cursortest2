package I1;

import H2.AbstractC0080b;
import M1.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f2470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2473d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2474e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2476g;

    public i(List list, int i3, int i4, int i5, boolean z3, boolean z4, int i6) {
        Z1.i.f(list, "cards");
        this.f2470a = list;
        this.f2471b = i3;
        this.f2472c = i4;
        this.f2473d = i5;
        this.f2474e = z3;
        this.f2475f = z4;
        this.f2476g = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    public static i a(i iVar, ArrayList arrayList, int i3, int i4, boolean z3, boolean z4, int i5, int i6) {
        ArrayList arrayList2 = arrayList;
        if ((i6 & 1) != 0) {
            arrayList2 = iVar.f2470a;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i6 & 2) != 0) {
            i3 = iVar.f2471b;
        }
        int i7 = i3;
        if ((i6 & 4) != 0) {
            i4 = iVar.f2472c;
        }
        int i8 = i4;
        int i9 = iVar.f2473d;
        if ((i6 & 16) != 0) {
            z3 = iVar.f2474e;
        }
        boolean z5 = z3;
        if ((i6 & 32) != 0) {
            z4 = iVar.f2475f;
        }
        boolean z6 = z4;
        if ((i6 & 64) != 0) {
            i5 = iVar.f2476g;
        }
        iVar.getClass();
        Z1.i.f(arrayList3, "cards");
        return new i(arrayList3, i7, i8, i9, z5, z6, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Z1.i.a(this.f2470a, iVar.f2470a) && this.f2471b == iVar.f2471b && this.f2472c == iVar.f2472c && this.f2473d == iVar.f2473d && this.f2474e == iVar.f2474e && this.f2475f == iVar.f2475f && this.f2476g == iVar.f2476g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2476g) + AbstractC0080b.f(AbstractC0080b.f(AbstractC0080b.b(this.f2473d, AbstractC0080b.b(this.f2472c, AbstractC0080b.b(this.f2471b, this.f2470a.hashCode() * 31, 31), 31), 31), 31, this.f2474e), 31, this.f2475f);
    }

    public final String toString() {
        return "MatchState(cards=" + this.f2470a + ", moves=" + this.f2471b + ", matchedPairs=" + this.f2472c + ", totalPairs=" + this.f2473d + ", locked=" + this.f2474e + ", finished=" + this.f2475f + ", bestEfficiency=" + this.f2476g + ")";
    }

    public /* synthetic */ i(ArrayList arrayList, int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? u.f2803d : arrayList, 0, 0, (i5 & 8) != 0 ? 0 : i3, false, false, (i5 & 64) != 0 ? 0 : i4);
    }
}
