package b1;

import w0.m;
import w0.w;

/* loaded from: classes.dex */
final class c extends w {

    /* renamed from: b, reason: collision with root package name */
    private final long f1621b;

    public c(m mVar, long j7) {
        super(mVar);
        o2.a.a(mVar.p() >= j7);
        this.f1621b = j7;
    }

    @Override // w0.w, w0.m
    public long a() {
        return super.a() - this.f1621b;
    }

    @Override // w0.w, w0.m
    public long m() {
        return super.m() - this.f1621b;
    }

    @Override // w0.w, w0.m
    public long p() {
        return super.p() - this.f1621b;
    }
}
