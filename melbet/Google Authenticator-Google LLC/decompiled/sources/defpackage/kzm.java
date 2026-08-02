package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzm extends lar {
    private final kzf d;

    public kzm(kzf kzfVar, kqn kqnVar, int i, int i2) {
        super(kqnVar, i, i2);
        this.d = kzfVar;
        int i3 = kuh.a;
    }

    @Override // defpackage.lar, defpackage.kzq
    public final Object a(kzr kzrVar, kqj kqjVar) {
        return this.b == -3 ? ixj.f(kzrVar, this.d, false, kqjVar) : lar.g(this, kzrVar, kqjVar);
    }

    @Override // defpackage.lar
    public final Object b(kzd kzdVar, kqj kqjVar) {
        return ixj.f(new lbi(kzdVar), this.d, false, kqjVar);
    }

    @Override // defpackage.lar
    protected final lar c(kqn kqnVar, int i, int i2) {
        return new kzm(this.d, kqnVar, 0, 2);
    }

    @Override // defpackage.lar
    protected final String d() {
        kzf kzfVar = this.d;
        Objects.toString(kzfVar);
        return "channel=".concat(kzfVar.toString());
    }

    @Override // defpackage.lar
    public final kzf e(kvm kvmVar) {
        return this.b == -3 ? this.d : super.e(kvmVar);
    }
}
