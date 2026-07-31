package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vc extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final long f13293i;

    public vc(gc gcVar, String str, String str2, j8 j8Var, long j7, int i7, int i8) {
        super(gcVar, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", j8Var, i7, 25);
        this.f13293i = j7;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        long longValue = ((Long) this.f10654f.invoke(null, new Object[0])).longValue();
        synchronized (this.f10653e) {
            this.f10653e.j0(longValue);
            long j7 = this.f13293i;
            if (j7 != 0) {
                this.f10653e.F(longValue - j7);
                this.f10653e.G(this.f13293i);
            }
        }
    }
}
