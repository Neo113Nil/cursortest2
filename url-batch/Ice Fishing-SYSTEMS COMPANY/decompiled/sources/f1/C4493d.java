package f1;

import B2.N;
import S0.s;
import d1.C4455a;
import d1.C4456b;
import g1.C4524d;
import java.util.List;
import java.util.Locale;
import u.AbstractC5088e;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4493d {

    /* renamed from: a, reason: collision with root package name */
    public final List f37598a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.i f37599b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37600c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37601d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37602e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37603f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37604g;

    /* renamed from: h, reason: collision with root package name */
    public final List f37605h;
    public final d1.d i;

    /* renamed from: j, reason: collision with root package name */
    public final int f37606j;

    /* renamed from: k, reason: collision with root package name */
    public final int f37607k;

    /* renamed from: l, reason: collision with root package name */
    public final int f37608l;

    /* renamed from: m, reason: collision with root package name */
    public final float f37609m;

    /* renamed from: n, reason: collision with root package name */
    public final float f37610n;

    /* renamed from: o, reason: collision with root package name */
    public final float f37611o;

    /* renamed from: p, reason: collision with root package name */
    public final float f37612p;

    /* renamed from: q, reason: collision with root package name */
    public final C4455a f37613q;

    /* renamed from: r, reason: collision with root package name */
    public final s f37614r;

    /* renamed from: s, reason: collision with root package name */
    public final C4456b f37615s;

    /* renamed from: t, reason: collision with root package name */
    public final List f37616t;

    /* renamed from: u, reason: collision with root package name */
    public final int f37617u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f37618v;

    /* renamed from: w, reason: collision with root package name */
    public final C4524d f37619w;

    /* renamed from: x, reason: collision with root package name */
    public final N f37620x;

    /* renamed from: y, reason: collision with root package name */
    public final int f37621y;

    public C4493d(List list, X0.i iVar, String str, long j9, int i, long j10, String str2, List list2, d1.d dVar, int i4, int i9, int i10, float f6, float f9, float f10, float f11, C4455a c4455a, s sVar, List list3, int i11, C4456b c4456b, boolean z8, C4524d c4524d, N n9, int i12) {
        this.f37598a = list;
        this.f37599b = iVar;
        this.f37600c = str;
        this.f37601d = j9;
        this.f37602e = i;
        this.f37603f = j10;
        this.f37604g = str2;
        this.f37605h = list2;
        this.i = dVar;
        this.f37606j = i4;
        this.f37607k = i9;
        this.f37608l = i10;
        this.f37609m = f6;
        this.f37610n = f9;
        this.f37611o = f10;
        this.f37612p = f11;
        this.f37613q = c4455a;
        this.f37614r = sVar;
        this.f37616t = list3;
        this.f37617u = i11;
        this.f37615s = c4456b;
        this.f37618v = z8;
        this.f37619w = c4524d;
        this.f37620x = n9;
        this.f37621y = i12;
    }

    public final String a(String str) {
        int i;
        StringBuilder b9 = AbstractC5088e.b(str);
        b9.append(this.f37600c);
        b9.append("\n");
        X0.i iVar = this.f37599b;
        C4493d c4493d = (C4493d) iVar.i.j(this.f37603f, null);
        if (c4493d != null) {
            b9.append("\t\tParents: ");
            b9.append(c4493d.f37600c);
            for (C4493d c4493d2 = (C4493d) iVar.i.j(c4493d.f37603f, null); c4493d2 != null; c4493d2 = (C4493d) iVar.i.j(c4493d2.f37603f, null)) {
                b9.append("->");
                b9.append(c4493d2.f37600c);
            }
            b9.append(str);
            b9.append("\n");
        }
        List list = this.f37605h;
        if (!list.isEmpty()) {
            b9.append(str);
            b9.append("\tMasks: ");
            b9.append(list.size());
            b9.append("\n");
        }
        int i4 = this.f37606j;
        if (i4 != 0 && (i = this.f37607k) != 0) {
            b9.append(str);
            b9.append("\tBackground: ");
            b9.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(this.f37608l)));
        }
        List list2 = this.f37598a;
        if (!list2.isEmpty()) {
            b9.append(str);
            b9.append("\tShapes:\n");
            for (Object obj : list2) {
                b9.append(str);
                b9.append("\t\t");
                b9.append(obj);
                b9.append("\n");
            }
        }
        return b9.toString();
    }

    public final String toString() {
        return a("");
    }
}
