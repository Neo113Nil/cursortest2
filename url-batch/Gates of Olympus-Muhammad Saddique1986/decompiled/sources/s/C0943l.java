package s;

import e2.InterfaceC0424c;
import java.util.List;
import java.util.Map;
import p.P;
import r0.InterfaceC0886H;

/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943l implements InterfaceC0886H {

    /* renamed from: a, reason: collision with root package name */
    public final C0944m f8268a;

    /* renamed from: b, reason: collision with root package name */
    public int f8269b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8270c;

    /* renamed from: d, reason: collision with root package name */
    public float f8271d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8272e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8273f;

    /* renamed from: g, reason: collision with root package name */
    public final v2.c f8274g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.b f8275h;

    /* renamed from: i, reason: collision with root package name */
    public final long f8276i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8277j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8278k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8279l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8280m;

    /* renamed from: n, reason: collision with root package name */
    public final P f8281n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8282o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8283p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0886H f8284q;

    public C0943l(C0944m c0944m, int i3, boolean z3, float f3, InterfaceC0886H interfaceC0886H, float f4, boolean z4, v2.c cVar, O0.b bVar, long j3, List list, int i4, int i5, int i6, P p3, int i7, int i8) {
        this.f8268a = c0944m;
        this.f8269b = i3;
        this.f8270c = z3;
        this.f8271d = f3;
        this.f8272e = f4;
        this.f8273f = z4;
        this.f8274g = cVar;
        this.f8275h = bVar;
        this.f8276i = j3;
        this.f8277j = list;
        this.f8278k = i4;
        this.f8279l = i5;
        this.f8280m = i6;
        this.f8281n = p3;
        this.f8282o = i7;
        this.f8283p = i8;
        this.f8284q = interfaceC0886H;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean a(int i3, boolean z3) {
        C0944m c0944m;
        int i4;
        if (this.f8273f) {
            return false;
        }
        ?? r02 = this.f8277j;
        if (r02.isEmpty() || (c0944m = this.f8268a) == null || (i4 = this.f8269b - i3) < 0 || i4 >= c0944m.f8297m) {
            return false;
        }
        C0944m c0944m2 = (C0944m) S1.l.K0(r02);
        C0944m c0944m3 = (C0944m) S1.l.Q0(r02);
        c0944m2.getClass();
        c0944m3.getClass();
        int i5 = this.f8279l;
        int i6 = this.f8278k;
        if (i3 < 0) {
            if (Math.min((c0944m2.f8295k + c0944m2.f8297m) - i6, (c0944m3.f8295k + c0944m3.f8297m) - i5) <= (-i3)) {
                return false;
            }
        } else if (Math.min(i6 - c0944m2.f8295k, i5 - c0944m3.f8295k) <= i3) {
            return false;
        }
        this.f8269b -= i3;
        int size = r02.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0944m c0944m4 = (C0944m) r02.get(i7);
            c0944m4.getClass();
            c0944m4.f8295k += i3;
            int[] iArr = c0944m4.f8300p;
            int length = iArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (i8 % 2 == 1) {
                    iArr[i8] = iArr[i8] + i3;
                }
            }
            if (z3) {
                int size2 = c0944m4.f8286b.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    A.k.r(c0944m4.f8294j.f4839a.e(c0944m4.f8292h));
                }
            }
        }
        this.f8271d = i3;
        if (!this.f8270c && i3 > 0) {
            this.f8270c = true;
        }
        return true;
    }

    @Override // r0.InterfaceC0886H
    public final int f() {
        return this.f8284q.f();
    }

    @Override // r0.InterfaceC0886H
    public final int h() {
        return this.f8284q.h();
    }

    @Override // r0.InterfaceC0886H
    public final Map i() {
        return this.f8284q.i();
    }

    @Override // r0.InterfaceC0886H
    public final void j() {
        this.f8284q.j();
    }

    @Override // r0.InterfaceC0886H
    public final InterfaceC0424c k() {
        return this.f8284q.k();
    }
}
