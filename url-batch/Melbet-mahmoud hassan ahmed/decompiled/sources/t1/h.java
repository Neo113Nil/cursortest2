package t1;

/* loaded from: classes.dex */
public class h implements r0 {

    /* renamed from: f, reason: collision with root package name */
    protected final r0[] f22022f;

    public h(r0[] r0VarArr) {
        this.f22022f = r0VarArr;
    }

    @Override // t1.r0
    public boolean a() {
        for (r0 r0Var : this.f22022f) {
            if (r0Var.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // t1.r0
    public final long c() {
        long j7 = Long.MAX_VALUE;
        for (r0 r0Var : this.f22022f) {
            long c7 = r0Var.c();
            if (c7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, c7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // t1.r0
    public final long e() {
        long j7 = Long.MAX_VALUE;
        for (r0 r0Var : this.f22022f) {
            long e7 = r0Var.e();
            if (e7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, e7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // t1.r0
    public boolean g(long j7) {
        boolean z6;
        boolean z7 = false;
        do {
            long c7 = c();
            if (c7 == Long.MIN_VALUE) {
                break;
            }
            z6 = false;
            for (r0 r0Var : this.f22022f) {
                long c8 = r0Var.c();
                boolean z8 = c8 != Long.MIN_VALUE && c8 <= j7;
                if (c8 == c7 || z8) {
                    z6 |= r0Var.g(j7);
                }
            }
            z7 |= z6;
        } while (z6);
        return z7;
    }

    @Override // t1.r0
    public final void h(long j7) {
        for (r0 r0Var : this.f22022f) {
            r0Var.h(j7);
        }
    }
}
