package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class knr extends knq {
    final /* synthetic */ kns a;

    protected knr(kns knsVar) {
        this.a = knsVar;
    }

    @Override // defpackage.knq, defpackage.jzc
    public void f(jxi jxiVar, jzi jziVar) {
        kns knsVar = this.a;
        if (knsVar.c == jxi.e) {
            return;
        }
        knsVar.c = jxiVar;
        knsVar.d = jziVar;
        knu knuVar = knsVar.e;
        if (knuVar.i) {
            return;
        }
        knuVar.f();
    }

    @Override // defpackage.knq
    protected final jzc g() {
        return this.a.e.h;
    }
}
