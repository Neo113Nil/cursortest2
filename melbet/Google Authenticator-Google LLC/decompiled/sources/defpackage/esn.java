package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class esn implements eso {
    private final /* synthetic */ int a;

    public esn(int i) {
        this.a = i;
    }

    @Override // defpackage.eso
    public final /* synthetic */ String a(jlk jlkVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((lfi) ((jkl) jlkVar).b).c : ((lgv) ((jkj) jlkVar).b).e : ((lej) ((jkj) jlkVar).b).f;
    }

    @Override // defpackage.eso
    public final /* synthetic */ String b(jlk jlkVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((lfi) ((jkl) jlkVar).b).e : ((lgv) ((jkj) jlkVar).b).d : ((lej) ((jkj) jlkVar).b).e;
    }

    @Override // defpackage.eso
    public final /* synthetic */ void c(jlk jlkVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                jkj jkjVar = (jkj) jlkVar;
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                lej lejVar = (lej) jkjVar.b;
                lej lejVar2 = lej.a;
                lejVar.b &= -3;
                lejVar.d = 0L;
                return;
            }
            long longValue = l.longValue();
            jkj jkjVar2 = (jkj) jlkVar;
            if (!jkjVar2.b.M()) {
                jkjVar2.t();
            }
            lej lejVar3 = (lej) jkjVar2.b;
            lej lejVar4 = lej.a;
            lejVar3.b |= 2;
            lejVar3.d = longValue;
            return;
        }
        if (i != 1) {
            jkl jklVar = (jkl) jlkVar;
            if (l == null) {
                if (!jklVar.b.M()) {
                    jklVar.t();
                }
                lfi lfiVar = (lfi) jklVar.b;
                lfi lfiVar2 = lfi.a;
                lfiVar.b &= -3;
                lfiVar.d = 0L;
                return;
            }
            long longValue2 = l.longValue();
            if (!jklVar.b.M()) {
                jklVar.t();
            }
            lfi lfiVar3 = (lfi) jklVar.b;
            lfi lfiVar4 = lfi.a;
            lfiVar3.b |= 2;
            lfiVar3.d = longValue2;
            return;
        }
        if (l == null) {
            jkj jkjVar3 = (jkj) jlkVar;
            if (!jkjVar3.b.M()) {
                jkjVar3.t();
            }
            lgv lgvVar = (lgv) jkjVar3.b;
            lgv lgvVar2 = lgv.a;
            lgvVar.b &= -2;
            lgvVar.c = 0L;
            return;
        }
        long longValue3 = l.longValue();
        jkj jkjVar4 = (jkj) jlkVar;
        if (!jkjVar4.b.M()) {
            jkjVar4.t();
        }
        lgv lgvVar3 = (lgv) jkjVar4.b;
        lgv lgvVar4 = lgv.a;
        lgvVar3.b |= 1;
        lgvVar3.c = longValue3;
    }

    @Override // defpackage.eso
    public final /* synthetic */ void d(jlk jlkVar) {
        int i = this.a;
        if (i == 0) {
            jkj jkjVar = (jkj) jlkVar;
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lej lejVar = (lej) jkjVar.b;
            lej lejVar2 = lej.a;
            lejVar.b &= -5;
            lejVar.e = lej.a.e;
            return;
        }
        if (i != 1) {
            jkl jklVar = (jkl) jlkVar;
            if (!jklVar.b.M()) {
                jklVar.t();
            }
            lfi lfiVar = (lfi) jklVar.b;
            lfi lfiVar2 = lfi.a;
            lfiVar.b &= -5;
            lfiVar.e = lfi.a.e;
            return;
        }
        jkj jkjVar2 = (jkj) jlkVar;
        if (!jkjVar2.b.M()) {
            jkjVar2.t();
        }
        lgv lgvVar = (lgv) jkjVar2.b;
        lgv lgvVar2 = lgv.a;
        lgvVar.b &= -3;
        lgvVar.d = lgv.a.d;
    }
}
