package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckv extends cjg {
    private final jox b;
    private final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ckv(int i, cjk cjkVar) {
        super(r0);
        Random random = new Random();
        jkl jklVar = (jkl) jox.a.k();
        double d = cjkVar.c;
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        jox joxVar = (jox) jklVar.b;
        joxVar.b |= 1;
        joxVar.c = d;
        jox joxVar2 = (jox) jklVar.q();
        this.c = i;
        this.b = joxVar2;
    }

    @Override // defpackage.cjg
    public final hvi a(cjw cjwVar) {
        cjx a;
        jox joxVar = this.b;
        double d = joxVar.c;
        if (d <= 0.0d) {
            a = cjx.a;
        } else if (d == 1.0d && (joxVar.b & 2) == 0) {
            a = cjx.d;
        } else {
            double nextDouble = this.a.nextDouble();
            double d2 = joxVar.c;
            boolean z = nextDouble < d2;
            if ((joxVar.b & 2) != 0) {
                d2 = joxVar.d;
            }
            a = cjx.a(z, d2);
        }
        return hnu.aJ(a);
    }

    @Override // defpackage.cjg
    public final jok b() {
        jkj k = jok.a.k();
        if (!k.b.M()) {
            k.t();
        }
        int i = this.c;
        jok jokVar = (jok) k.b;
        jokVar.c = imo.a(i);
        jokVar.b |= 1;
        jkj k2 = joj.a.k();
        float f = (float) this.b.c;
        if (!k2.b.M()) {
            k2.t();
        }
        joj jojVar = (joj) k2.b;
        jojVar.b |= 1;
        jojVar.c = f;
        if (!k.b.M()) {
            k.t();
        }
        jok jokVar2 = (jok) k.b;
        joj jojVar2 = (joj) k2.q();
        jojVar2.getClass();
        jokVar2.e = jojVar2;
        jokVar2.b |= 4;
        return (jok) k.q();
    }
}
