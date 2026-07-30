package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l01 implements fm1 {
    public boolean a = false;
    public boolean b = false;
    public wx c;
    public final k01 d;

    public l01(k01 k01Var) {
        this.d = k01Var;
    }

    @Override // defpackage.fm1
    public final fm1 b(String str) {
        if (this.a) {
            throw new wv("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.f(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.fm1
    public final fm1 c(boolean z) {
        if (this.a) {
            throw new wv("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
