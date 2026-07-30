package r;

import java.util.List;
import java.util.Map;
import o.j0;
import p1.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f7629a;

    /* renamed from: b, reason: collision with root package name */
    public int f7630b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7631c;

    /* renamed from: d, reason: collision with root package name */
    public float f7632d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7633e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7634f;

    /* renamed from: g, reason: collision with root package name */
    public final h7.c f7635g;

    /* renamed from: h, reason: collision with root package name */
    public final m2.b f7636h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7637i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7638j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7639k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7640l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7641m;

    /* renamed from: n, reason: collision with root package name */
    public final j0 f7642n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7643o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7644p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g0 f7645q;

    public l(m mVar, int i7, boolean z8, float f9, g0 g0Var, float f10, boolean z9, h7.c cVar, m2.b bVar, long j8, List list, int i8, int i9, int i10, j0 j0Var, int i11, int i12) {
        this.f7629a = mVar;
        this.f7630b = i7;
        this.f7631c = z8;
        this.f7632d = f9;
        this.f7633e = f10;
        this.f7634f = z9;
        this.f7635g = cVar;
        this.f7636h = bVar;
        this.f7637i = j8;
        this.f7638j = list;
        this.f7639k = i8;
        this.f7640l = i9;
        this.f7641m = i10;
        this.f7642n = j0Var;
        this.f7643o = i11;
        this.f7644p = i12;
        this.f7645q = g0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean a(int i7, boolean z8) {
        m mVar;
        if (!this.f7634f) {
            ?? r02 = this.f7638j;
            if (!r02.isEmpty() && (mVar = this.f7629a) != null) {
                int i8 = mVar.f7657l;
                int i9 = this.f7630b - i7;
                if (i9 >= 0 && i9 < i8) {
                    m mVar2 = (m) e6.l.h0(r02);
                    m mVar3 = (m) e6.l.n0(r02);
                    mVar2.getClass();
                    mVar3.getClass();
                    int i10 = this.f7640l;
                    int i11 = this.f7639k;
                    if (i7 >= 0 ? Math.min(i11 - mVar2.f7655j, i10 - mVar3.f7655j) > i7 : Math.min((mVar2.f7655j + mVar2.f7657l) - i11, (mVar3.f7655j + mVar3.f7657l) - i10) > (-i7)) {
                        this.f7630b -= i7;
                        int size = r02.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            m mVar4 = (m) r02.get(i12);
                            int[] iArr = mVar4.f7660o;
                            mVar4.f7655j += i7;
                            int length = iArr.length;
                            for (int i13 = 0; i13 < length; i13++) {
                                if (i13 % 2 == 1) {
                                    iArr[i13] = iArr[i13] + i7;
                                }
                            }
                            if (z8) {
                                int size2 = mVar4.f7647b.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    r6.i.e(mVar4.f7654i.f651a.e(mVar4.f7652g));
                                }
                            }
                        }
                        this.f7632d = i7;
                        if (!this.f7631c && i7 > 0) {
                            this.f7631c = true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p1.g0
    public final int f() {
        return this.f7645q.f();
    }

    @Override // p1.g0
    public final int n() {
        return this.f7645q.n();
    }

    @Override // p1.g0
    public final Map o() {
        return this.f7645q.o();
    }

    @Override // p1.g0
    public final void p() {
        this.f7645q.p();
    }

    @Override // p1.g0
    public final q6.c q() {
        return this.f7645q.q();
    }
}
