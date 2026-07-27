package s0;

import Z.C0313j;
import a.AbstractC0345a;
import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177x0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10405a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f10406b;

    /* renamed from: c, reason: collision with root package name */
    public Z.I f10407c;

    /* renamed from: d, reason: collision with root package name */
    public C0313j f10408d;

    /* renamed from: e, reason: collision with root package name */
    public Z.J f10409e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10410f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10411g;

    /* renamed from: h, reason: collision with root package name */
    public Z.J f10412h;

    /* renamed from: i, reason: collision with root package name */
    public Y.e f10413i;

    /* renamed from: j, reason: collision with root package name */
    public float f10414j;

    /* renamed from: k, reason: collision with root package name */
    public long f10415k;

    /* renamed from: l, reason: collision with root package name */
    public long f10416l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10417m;

    public C1177x0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f10406b = outline;
        this.f10415k = 0L;
        this.f10416l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (Y.a.b(r5.f4382e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Z.r rVar) {
        d();
        Z.J j4 = this.f10409e;
        if (j4 != null) {
            rVar.k(j4, 1);
            return;
        }
        float f4 = this.f10414j;
        if (f4 <= 0.0f) {
            rVar.p(Y.c.d(this.f10415k), Y.c.e(this.f10415k), Y.c.d(this.f10415k) + Y.f.d(this.f10416l), Y.c.e(this.f10415k) + Y.f.b(this.f10416l), 1);
            return;
        }
        Z.J j5 = this.f10412h;
        Y.e eVar = this.f10413i;
        if (j5 != null) {
            long j6 = this.f10415k;
            long j7 = this.f10416l;
            if (eVar != null && u3.d.L(eVar)) {
                if (eVar.f4378a == Y.c.d(j6)) {
                    if (eVar.f4379b == Y.c.e(j6)) {
                        if (eVar.f4380c == Y.f.d(j7) + Y.c.d(j6)) {
                            if (eVar.f4381d == Y.f.b(j7) + Y.c.e(j6)) {
                            }
                        }
                    }
                }
            }
        }
        float d4 = Y.c.d(this.f10415k);
        float e4 = Y.c.e(this.f10415k);
        float d5 = Y.f.d(this.f10416l) + Y.c.d(this.f10415k);
        float b4 = Y.f.b(this.f10416l) + Y.c.e(this.f10415k);
        float f5 = this.f10414j;
        long I3 = u3.l.I(f5, f5);
        long I4 = u3.l.I(Y.a.b(I3), Y.a.c(I3));
        Y.e eVar2 = new Y.e(d4, e4, d5, b4, I4, I4, I4, I4);
        if (j5 == null) {
            j5 = Z.K.h();
        } else {
            ((C0313j) j5).e();
        }
        Z.J.a(j5, eVar2);
        this.f10413i = eVar2;
        this.f10412h = j5;
        rVar.k(j5, 1);
    }

    public final Outline b() {
        d();
        if (this.f10417m && this.f10405a) {
            return this.f10406b;
        }
        return null;
    }

    public final boolean c(Z.I i2, float f4, boolean z4, float f5, long j4) {
        this.f10406b.setAlpha(f4);
        boolean a4 = Intrinsics.a(this.f10407c, i2);
        boolean z5 = !a4;
        if (!a4) {
            this.f10407c = i2;
            this.f10410f = true;
        }
        this.f10416l = j4;
        boolean z6 = i2 != null && (z4 || f5 > 0.0f);
        if (this.f10417m != z6) {
            this.f10417m = z6;
            this.f10410f = true;
        }
        return z5;
    }

    public final void d() {
        if (this.f10410f) {
            this.f10415k = 0L;
            this.f10414j = 0.0f;
            this.f10409e = null;
            this.f10410f = false;
            this.f10411g = false;
            Z.I i2 = this.f10407c;
            Outline outline = this.f10406b;
            if (i2 == null || !this.f10417m || Y.f.d(this.f10416l) <= 0.0f || Y.f.b(this.f10416l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f10405a = true;
            if (i2 instanceof Z.G) {
                Y.d dVar = ((Z.G) i2).f4458a;
                float f4 = dVar.f4374a;
                float f5 = dVar.f4375b;
                this.f10415k = AbstractC0345a.c(f4, f5);
                this.f10416l = u3.l.N(dVar.c(), dVar.b());
                outline.setRect(Math.round(f4), Math.round(f5), Math.round(dVar.f4376c), Math.round(dVar.f4377d));
                return;
            }
            if (!(i2 instanceof Z.H)) {
                if (i2 instanceof Z.F) {
                    e(((Z.F) i2).f4457a);
                    return;
                }
                return;
            }
            Y.e eVar = ((Z.H) i2).f4459a;
            float b4 = Y.a.b(eVar.f4382e);
            float f6 = eVar.f4378a;
            float f7 = eVar.f4379b;
            this.f10415k = AbstractC0345a.c(f6, f7);
            this.f10416l = u3.l.N(eVar.b(), eVar.a());
            if (u3.d.L(eVar)) {
                this.f10406b.setRoundRect(Math.round(f6), Math.round(f7), Math.round(eVar.f4380c), Math.round(eVar.f4381d), b4);
                this.f10414j = b4;
                return;
            }
            C0313j c0313j = this.f10408d;
            if (c0313j == null) {
                c0313j = Z.K.h();
                this.f10408d = c0313j;
            }
            c0313j.e();
            Z.J.a(c0313j, eVar);
            e(c0313j);
        }
    }

    public final void e(Z.J j4) {
        int i2 = Build.VERSION.SDK_INT;
        Outline outline = this.f10406b;
        if (i2 <= 28 && !((C0313j) j4).f4530a.isConvex()) {
            this.f10405a = false;
            outline.setEmpty();
            this.f10411g = true;
        } else {
            if (!(j4 instanceof C0313j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C0313j) j4).f4530a);
            this.f10411g = !outline.canClip();
        }
        this.f10409e = j4;
    }
}
