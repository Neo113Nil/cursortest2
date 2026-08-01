package f0;

import c2.x0;
import d1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m2.h0;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf0/e;", "Lc2/x0;", "Lf0/h;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4025a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f4026b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.h f4027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4028d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4029e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4030f;
    public final int g;

    public e(String str, h0 h0Var, p2.h hVar, int i3, boolean z10, int i10, int i11) {
        this.f4025a = str;
        this.f4026b = h0Var;
        this.f4027c = hVar;
        this.f4028d = i3;
        this.f4029e = z10;
        this.f4030f = i10;
        this.g = i11;
    }

    @Override // c2.x0
    public final k d() {
        h hVar = new h();
        hVar.C = this.f4025a;
        hVar.D = this.f4026b;
        hVar.E = this.f4027c;
        hVar.F = this.f4028d;
        hVar.G = this.f4029e;
        hVar.H = this.f4030f;
        hVar.I = this.g;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // c2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k kVar) {
        boolean z10;
        String str;
        String str2;
        h0 h0Var;
        boolean z11;
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        p2.h hVar;
        p2.h hVar2;
        int i13;
        int i14;
        h hVar3 = (h) kVar;
        hVar3.getClass();
        h0 h0Var2 = hVar3.D;
        boolean z14 = false;
        boolean z15 = true;
        h0 h0Var3 = this.f4026b;
        if (h0Var3 == h0Var2) {
            h0Var3.getClass();
        } else if (!h0Var3.f6481a.b(h0Var2.f6481a)) {
            z10 = true;
            str = hVar3.C;
            str2 = this.f4025a;
            if (!Intrinsics.a(str, str2)) {
                hVar3.C = str2;
                hVar3.N = null;
                z14 = true;
            }
            h0Var = hVar3.D;
            if (h0Var != h0Var3) {
                h0Var.getClass();
            } else if (!Intrinsics.a(h0Var.f6482b, h0Var3.f6482b) || !h0Var.f6481a.a(h0Var3.f6481a)) {
                z11 = false;
                boolean z16 = !z11;
                hVar3.D = h0Var3;
                i3 = hVar3.I;
                i10 = this.g;
                if (i3 != i10) {
                    hVar3.I = i10;
                    z16 = true;
                }
                i11 = hVar3.H;
                i12 = this.f4030f;
                if (i11 != i12) {
                    hVar3.H = i12;
                    z16 = true;
                }
                z12 = hVar3.G;
                z13 = this.f4029e;
                if (z12 != z13) {
                    hVar3.G = z13;
                    z16 = true;
                }
                hVar = hVar3.E;
                hVar2 = this.f4027c;
                if (!Intrinsics.a(hVar, hVar2)) {
                    hVar3.E = hVar2;
                    z16 = true;
                }
                i13 = hVar3.F;
                i14 = this.f4028d;
                if (i13 == i14) {
                    z15 = z16;
                } else {
                    hVar3.F = i14;
                }
                if (!z10 || z14 || z15) {
                    hVar3.L = null;
                }
                if (!z14 || z15) {
                    hVar3.I().d(hVar3.C, hVar3.D, hVar3.E, hVar3.F, hVar3.G, hVar3.H, hVar3.I);
                }
                if (hVar3.B) {
                    if (z14 || (z10 && hVar3.M != null)) {
                        c2.k.n(hVar3);
                    }
                    if (z14 || z15) {
                        c2.k.m(hVar3);
                        c2.k.l(hVar3);
                    }
                    if (z10) {
                        c2.k.l(hVar3);
                        return;
                    }
                    return;
                }
                return;
            }
            z11 = true;
            boolean z162 = !z11;
            hVar3.D = h0Var3;
            i3 = hVar3.I;
            i10 = this.g;
            if (i3 != i10) {
            }
            i11 = hVar3.H;
            i12 = this.f4030f;
            if (i11 != i12) {
            }
            z12 = hVar3.G;
            z13 = this.f4029e;
            if (z12 != z13) {
            }
            hVar = hVar3.E;
            hVar2 = this.f4027c;
            if (!Intrinsics.a(hVar, hVar2)) {
            }
            i13 = hVar3.F;
            i14 = this.f4028d;
            if (i13 == i14) {
            }
            if (!z10) {
            }
            hVar3.L = null;
            if (!z14) {
            }
            hVar3.I().d(hVar3.C, hVar3.D, hVar3.E, hVar3.F, hVar3.G, hVar3.H, hVar3.I);
            if (hVar3.B) {
            }
        }
        z10 = false;
        str = hVar3.C;
        str2 = this.f4025a;
        if (!Intrinsics.a(str, str2)) {
        }
        h0Var = hVar3.D;
        if (h0Var != h0Var3) {
        }
        z11 = true;
        boolean z1622 = !z11;
        hVar3.D = h0Var3;
        i3 = hVar3.I;
        i10 = this.g;
        if (i3 != i10) {
        }
        i11 = hVar3.H;
        i12 = this.f4030f;
        if (i11 != i12) {
        }
        z12 = hVar3.G;
        z13 = this.f4029e;
        if (z12 != z13) {
        }
        hVar = hVar3.E;
        hVar2 = this.f4027c;
        if (!Intrinsics.a(hVar, hVar2)) {
        }
        i13 = hVar3.F;
        i14 = this.f4028d;
        if (i13 == i14) {
        }
        if (!z10) {
        }
        hVar3.L = null;
        if (!z14) {
        }
        hVar3.I().d(hVar3.C, hVar3.D, hVar3.E, hVar3.F, hVar3.G, hVar3.H, hVar3.I);
        if (hVar3.B) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f4025a, eVar.f4025a) && Intrinsics.a(this.f4026b, eVar.f4026b) && Intrinsics.a(this.f4027c, eVar.f4027c) && this.f4028d == eVar.f4028d && this.f4029e == eVar.f4029e && this.f4030f == eVar.f4030f && this.g == eVar.g;
    }

    public final int hashCode() {
        return (((l.d(v4.a.x(this.f4028d, (this.f4027c.hashCode() + v4.a.f(this.f4026b, this.f4025a.hashCode() * 31, 31)) * 31, 31), 31, this.f4029e) + this.f4030f) * 31) + this.g) * 31;
    }
}
