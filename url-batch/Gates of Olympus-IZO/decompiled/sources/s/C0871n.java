package s;

import java.util.List;
import java.util.Map;
import o.J;
import r0.B;

/* renamed from: s.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871n implements B {

    /* renamed from: a, reason: collision with root package name */
    public final C0872o f7418a;

    /* renamed from: b, reason: collision with root package name */
    public int f7419b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7420c;

    /* renamed from: d, reason: collision with root package name */
    public float f7421d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7422e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7423f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.c f7424g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.b f7425h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7426i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7427j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7428k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7429l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7430m;

    /* renamed from: n, reason: collision with root package name */
    public final J f7431n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7432o;
    public final int p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B f7433q;

    public C0871n(C0872o c0872o, int i3, boolean z3, float f3, B b2, float f4, boolean z4, p2.c cVar, M0.b bVar, long j3, List list, int i4, int i5, int i6, J j4, int i7, int i8) {
        this.f7418a = c0872o;
        this.f7419b = i3;
        this.f7420c = z3;
        this.f7421d = f3;
        this.f7422e = f4;
        this.f7423f = z4;
        this.f7424g = cVar;
        this.f7425h = bVar;
        this.f7426i = j3;
        this.f7427j = list;
        this.f7428k = i4;
        this.f7429l = i5;
        this.f7430m = i6;
        this.f7431n = j4;
        this.f7432o = i7;
        this.p = i8;
        this.f7433q = b2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean a(int i3, boolean z3) {
        C0872o c0872o;
        int i4;
        if (this.f7423f) {
            return false;
        }
        ?? r02 = this.f7427j;
        if (r02.isEmpty() || (c0872o = this.f7418a) == null || (i4 = this.f7419b - i3) < 0 || i4 >= c0872o.f7448o) {
            return false;
        }
        C0872o c0872o2 = (C0872o) M1.l.m0(r02);
        C0872o c0872o3 = (C0872o) M1.l.s0(r02);
        c0872o2.getClass();
        c0872o3.getClass();
        int i5 = this.f7429l;
        int i6 = this.f7428k;
        if (i3 < 0) {
            if (Math.min((c0872o2.f7446m + c0872o2.f7448o) - i6, (c0872o3.f7446m + c0872o3.f7448o) - i5) <= (-i3)) {
                return false;
            }
        } else if (Math.min(i6 - c0872o2.f7446m, i5 - c0872o3.f7446m) <= i3) {
            return false;
        }
        this.f7419b -= i3;
        int size = r02.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0872o c0872o4 = (C0872o) r02.get(i7);
            c0872o4.getClass();
            c0872o4.f7446m += i3;
            int[] iArr = c0872o4.f7450r;
            int length = iArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                boolean z4 = c0872o4.f7436c;
                if ((z4 && i8 % 2 == 1) || (!z4 && i8 % 2 == 0)) {
                    iArr[i8] = iArr[i8] + i3;
                }
            }
            if (z3) {
                int size2 = c0872o4.f7435b.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    c0872o4.f7445l.a(i9, c0872o4.f7443j);
                }
            }
        }
        this.f7421d = i3;
        if (!this.f7420c && i3 > 0) {
            this.f7420c = true;
        }
        return true;
    }

    @Override // r0.B
    public final int f() {
        return this.f7433q.f();
    }

    @Override // r0.B
    public final int h() {
        return this.f7433q.h();
    }

    @Override // r0.B
    public final Map i() {
        return this.f7433q.i();
    }

    @Override // r0.B
    public final void j() {
        this.f7433q.j();
    }

    @Override // r0.B
    public final Y1.c k() {
        return this.f7433q.k();
    }
}
