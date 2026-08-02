package b0;

import T.S;
import T.T;
import q0.C1353B;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5278a;

    /* renamed from: b, reason: collision with root package name */
    public int f5279b;

    /* renamed from: c, reason: collision with root package name */
    public long f5280c;

    /* renamed from: d, reason: collision with root package name */
    public final C1353B f5281d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5282e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f5284g;

    public e(f fVar, String str, int i4, C1353B c1353b) {
        this.f5284g = fVar;
        this.f5278a = str;
        this.f5279b = i4;
        this.f5280c = c1353b == null ? -1L : c1353b.f14815d;
        if (c1353b == null || !c1353b.b()) {
            return;
        }
        this.f5281d = c1353b;
    }

    public final boolean a(C0255a c0255a) {
        C1353B c1353b = c0255a.f5260d;
        T t4 = c0255a.f5258b;
        if (c1353b == null) {
            return this.f5279b != c0255a.f5259c;
        }
        long j4 = this.f5280c;
        if (j4 == -1) {
            return false;
        }
        if (c1353b.f14815d > j4) {
            return true;
        }
        C1353B c1353b2 = this.f5281d;
        if (c1353b2 == null) {
            return false;
        }
        int i4 = c1353b2.f14813b;
        int b4 = t4.b(c1353b.f14812a);
        int b5 = t4.b(c1353b2.f14812a);
        if (c1353b.f14815d < c1353b2.f14815d || b4 < b5) {
            return false;
        }
        if (b4 > b5) {
            return true;
        }
        if (!c1353b.b()) {
            int i5 = c1353b.f14816e;
            return i5 == -1 || i5 > i4;
        }
        int i6 = c1353b.f14813b;
        int i7 = c1353b.f14814c;
        if (i6 <= i4) {
            return i6 == i4 && i7 > c1353b2.f14814c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(T t4, T t5) {
        C1353B c1353b;
        int i4 = this.f5279b;
        if (i4 < t4.o()) {
            f fVar = this.f5284g;
            S s4 = fVar.f5287a;
            t4.n(i4, s4);
            for (int i5 = s4.n; i5 <= s4.o; i5++) {
                int b4 = t5.b(t4.l(i5));
                if (b4 != -1) {
                    i4 = t5.f(b4, fVar.f5288b, false).f2683c;
                    break;
                }
            }
            i4 = -1;
        }
        this.f5279b = i4;
        return i4 != -1 && ((c1353b = this.f5281d) == null || t5.b(c1353b.f14812a) != -1);
    }
}
