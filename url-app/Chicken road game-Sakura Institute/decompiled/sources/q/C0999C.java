package q;

import i.C0673h;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import l0.C0805c;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import y2.C1338m;

/* renamed from: q.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999C {

    /* renamed from: a, reason: collision with root package name */
    public final int f9141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9143c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9144d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9145e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9146f;

    public C0999C(int i2, C1005I c1005i, long j4, int i4, int i5, int i6) {
        this.f9141a = i2;
        this.f9146f = c1005i;
        this.f9145e = j4;
        this.f9142b = i4;
        this.f9143c = i5;
        this.f9144d = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0998B a(C0805c c0805c, boolean z4, int i2, int i4, int i5, int i6) {
        C0998B c0998b;
        InterfaceC0944E interfaceC0944E;
        C0673h c0673h;
        AbstractC0954O abstractC0954O;
        if (!c0805c.f7887b) {
            return null;
        }
        C1005I c1005i = (C1005I) this.f9146f;
        c1005i.getClass();
        int d4 = AbstractC0784j.d(2);
        boolean z5 = true;
        if (d4 != 0 && d4 != 1) {
            if (d4 != 2 && d4 != 3) {
                throw new C1338m();
            }
            if (z4) {
                interfaceC0944E = c1005i.f9165c;
                c0673h = c1005i.f9169g;
                abstractC0954O = c1005i.f9166d;
            } else {
                interfaceC0944E = (i2 < c1005i.f9163a - 1 || i4 < c1005i.f9164b) ? null : c1005i.f9167e;
                c0673h = c1005i.f9170h;
                abstractC0954O = c1005i.f9168f;
            }
            if (interfaceC0944E != null) {
                Intrinsics.c(c0673h);
                c0998b = new C0998B(interfaceC0944E, abstractC0954O, c0673h.f6920a);
                if (c0998b != null) {
                    return null;
                }
                if (i2 < 0 || (i6 != 0 && (i5 - ((int) (c0998b.f9139c >> 32)) < 0 || i6 >= this.f9141a))) {
                    z5 = false;
                }
                c0998b.f9140d = z5;
                return c0998b;
            }
        }
        c0998b = null;
        if (c0998b != null) {
        }
    }

    public C0805c b(boolean z4, int i2, long j4, C0673h c0673h, int i4, int i5, int i6, boolean z5, boolean z6) {
        long j5;
        long j6;
        int i7 = i5 + i6;
        if (c0673h == null) {
            return new C0805c(true, true);
        }
        C1005I c1005i = (C1005I) this.f9146f;
        c1005i.getClass();
        if (i4 < this.f9142b) {
            long j7 = c0673h.f6920a;
            if (((int) (j4 & 4294967295L)) - ((int) (j7 & 4294967295L)) >= 0) {
                int i8 = this.f9143c;
                int i9 = this.f9144d;
                long j8 = this.f9145e;
                int i10 = this.f9141a;
                if (i2 != 0) {
                    if (i2 >= i10) {
                        j5 = j8;
                    } else {
                        j5 = j8;
                        j6 = ((int) (j4 >> 32)) - ((int) (j7 >> 32)) >= 0 ? 4294967295L : 4294967295L;
                    }
                    return z5 ? new C0805c(true, true) : new C0805c(true, b(z4, 0, C0673h.a(M0.a.i(j5), (((int) (j4 & 4294967295L)) - i9) - i6), new C0673h(C0673h.a(((int) (j7 >> 32)) - i8, (int) (4294967295L & j7))), i4 + 1, i7, 0, true, false).f7887b);
                }
                j5 = j8;
                int i11 = (int) (j7 & j6);
                int max = Math.max(i6, i11) + i5;
                C0673h a4 = z6 ? null : c1005i.a(i4, max, z4);
                if (a4 == null || (i2 + 1 < i10 && ((((int) (j4 >> 32)) - ((int) (j7 >> 32))) - i8) - ((int) (a4.f6920a >> 32)) >= 0)) {
                    return new C0805c(false, false);
                }
                if (z6) {
                    return new C0805c(true, true);
                }
                boolean z7 = b(false, 0, C0673h.a(M0.a.i(j5), (((int) (j4 & 4294967295L)) - i9) - Math.max(i6, i11)), a4, i4 + 1, max, 0, true, true).f7887b;
                return new C0805c(z7, z7);
            }
        }
        return new C0805c(true, true);
    }

    public C0999C(y0.n nVar, int i2, int i4, int i5, int i6, long j4) {
        this.f9146f = nVar;
        this.f9141a = i2;
        this.f9142b = i4;
        this.f9143c = i5;
        this.f9144d = i6;
        this.f9145e = j4;
    }
}
