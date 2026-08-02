package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iby implements ibj {
    public boolean a = false;
    public boolean b = false;
    public ibf c;
    private final ibw d;

    public iby(ibw ibwVar) {
        this.d = ibwVar;
    }

    private final void a() {
        if (this.a) {
            throw new ibe("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    @Override // defpackage.ibj
    public final void c(String str) {
        a();
        this.d.e(this.c, str, this.b);
    }

    @Override // defpackage.ibj
    public final void d(boolean z) {
        a();
        this.d.c(this.c, z ? 1 : 0, this.b);
    }
}
