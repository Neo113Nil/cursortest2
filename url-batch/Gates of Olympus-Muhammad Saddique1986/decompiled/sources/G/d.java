package G;

import F.B0;
import F.C0113p;
import R0.D;
import e2.InterfaceC0426e;
import java.util.List;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class d implements D {

    /* renamed from: a, reason: collision with root package name */
    public final long f1977a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.b f1978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1979c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0426e f1980d;

    /* renamed from: e, reason: collision with root package name */
    public final C0134a f1981e;

    /* renamed from: f, reason: collision with root package name */
    public final C0134a f1982f;

    /* renamed from: g, reason: collision with root package name */
    public final B f1983g;

    /* renamed from: h, reason: collision with root package name */
    public final B f1984h;

    /* renamed from: i, reason: collision with root package name */
    public final C0135b f1985i;

    /* renamed from: j, reason: collision with root package name */
    public final C0135b f1986j;

    /* renamed from: k, reason: collision with root package name */
    public final C0135b f1987k;

    /* renamed from: l, reason: collision with root package name */
    public final C f1988l;

    /* renamed from: m, reason: collision with root package name */
    public final C f1989m;

    public d(long j3, O0.b bVar, C0113p c0113p) {
        int l3 = bVar.l(B0.f1118a);
        this.f1977a = j3;
        this.f1978b = bVar;
        this.f1979c = l3;
        this.f1980d = c0113p;
        int l4 = bVar.l(Float.intBitsToFloat((int) (j3 >> 32)));
        U.g gVar = U.b.f4473p;
        this.f1981e = new C0134a(gVar, gVar, l4);
        U.g gVar2 = U.b.f4475r;
        this.f1982f = new C0134a(gVar2, gVar2, l4);
        this.f1983g = new B(U.a.f4458c);
        this.f1984h = new B(U.a.f4459d);
        int l5 = bVar.l(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        U.h hVar = U.b.f4470m;
        U.h hVar2 = U.b.f4472o;
        this.f1985i = new C0135b(hVar, hVar2, l5);
        this.f1986j = new C0135b(hVar2, hVar, l5);
        this.f1987k = new C0135b(U.b.f4471n, hVar, l5);
        this.f1988l = new C(hVar, l3);
        this.f1989m = new C(hVar2, l3);
    }

    @Override // R0.D
    public final long a(O0.i iVar, long j3, O0.k kVar, long j4) {
        int i3;
        int i4;
        int i5 = iVar.f3738c;
        int i6 = iVar.f3736a;
        int a3 = iVar.a() / 2;
        int i7 = iVar.f3737b;
        int i8 = (int) (j3 >> 32);
        List A02 = S1.m.A0(this.f1981e, this.f1982f, ((int) (l0.c.c(((i5 - i6) / 2) + i6, a3 + i7) >> 32)) < i8 / 2 ? this.f1983g : this.f1984h);
        int size = A02.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i3 = 0;
                break;
            }
            int i10 = (int) (j4 >> 32);
            int i11 = size;
            int i12 = i9;
            List list = A02;
            int i13 = i8;
            i3 = ((j) A02.get(i9)).a(iVar, j3, i10, kVar);
            if (i12 == S1.m.z0(list) || (i3 >= 0 && i10 + i3 <= i13)) {
                break;
            }
            i9 = i12 + 1;
            size = i11;
            i8 = i13;
            A02 = list;
        }
        int i14 = (int) (j3 & 4294967295L);
        int i15 = 0;
        List A03 = S1.m.A0(this.f1985i, this.f1986j, this.f1987k, ((int) (l0.c.c(((iVar.f3738c - i6) / 2) + i6, (iVar.a() / 2) + i7) & 4294967295L)) < i14 / 2 ? this.f1988l : this.f1989m);
        int size2 = A03.size();
        for (int i16 = 0; i16 < size2; i16++) {
            int i17 = (int) (j4 & 4294967295L);
            int a4 = ((k) A03.get(i16)).a(iVar, j3, i17);
            if (i16 == S1.m.z0(A03) || (a4 >= (i4 = this.f1979c) && i17 + a4 <= i14 - i4)) {
                i15 = a4;
                break;
            }
        }
        long c2 = l0.c.c(i3, i15);
        int i18 = (int) (c2 >> 32);
        int i19 = (int) (c2 & 4294967295L);
        this.f1980d.h(iVar, new O0.i(i18, i19, ((int) (j4 >> 32)) + i18, ((int) (j4 & 4294967295L)) + i19));
        return c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1977a == dVar.f1977a && f2.j.a(this.f1978b, dVar.f1978b) && this.f1979c == dVar.f1979c && f2.j.a(this.f1980d, dVar.f1980d);
    }

    public final int hashCode() {
        return this.f1980d.hashCode() + AbstractC0625j.a(this.f1979c, (this.f1978b.hashCode() + (Long.hashCode(this.f1977a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) O0.f.a(this.f1977a)) + ", density=" + this.f1978b + ", verticalMargin=" + this.f1979c + ", onPositionCalculated=" + this.f1980d + ')';
    }
}
