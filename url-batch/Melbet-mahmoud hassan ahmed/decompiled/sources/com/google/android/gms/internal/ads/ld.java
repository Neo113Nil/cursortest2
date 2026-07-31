package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ld extends qd {
    public ld(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "uUtXgghNropSfe2KUSoP0Efn1EgB4X6maOF+tPLLzG1rSS0RqDSE3s9EWbbdwRaZ", "iu0TCa9uEtKUas610luihENZAQIiF7MRaL5XfmToU24=", j8Var, i7, 48);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        this.f10653e.S(3);
        boolean booleanValue = ((Boolean) this.f10654f.invoke(null, this.f10650b.b())).booleanValue();
        synchronized (this.f10653e) {
            if (booleanValue) {
                this.f10653e.S(2);
            } else {
                this.f10653e.S(1);
            }
        }
    }
}
