package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gd extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5559i;

    public gd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "yRC8yDQzUDrmroLbdHZh1cdlZfd8ub/FsIslAHpddfKGkTWa/jUYdNJ0tT+5diCM", "HM4qeDzacgZSWStWAwQJTi2Amm6uvEB2WlZumyUY0B8=", j8Var, i7, 61);
        this.f5559i = gcVar.s();
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        long longValue = ((Long) this.f10654f.invoke(null, this.f10650b.b(), Boolean.valueOf(this.f5559i))).longValue();
        synchronized (this.f10653e) {
            this.f10653e.r(longValue);
        }
    }
}
