package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kvj extends kqe implements kqk {
    public static final kqf c = new kqf(kqk.b, new ghz(13));

    public kvj() {
        super(kqk.b);
    }

    public abstract void a(kqn kqnVar, Runnable runnable);

    public boolean b(kqn kqnVar) {
        return true;
    }

    @Override // defpackage.kqk
    public final kqj bS(kqj kqjVar) {
        return new lcc(this, kqjVar);
    }

    @Override // defpackage.kqk
    public final void d(kqj kqjVar) {
        kuk kukVar = ((lcc) kqjVar).f;
        while (kukVar.a == lcd.b) {
        }
        Object obj = kukVar.a;
        kuw kuwVar = obj instanceof kuw ? (kuw) obj : null;
        if (kuwVar != null) {
            kuwVar.w();
        }
    }

    public void f(kqn kqnVar, Runnable runnable) {
        lcd.b(this, kqnVar, runnable);
    }

    public kvj g(int i) {
        ixl.a(i);
        return new lco(this, i);
    }

    @Override // defpackage.kqe, defpackage.kql, defpackage.kqn
    public final /* bridge */ kql get(kqm kqmVar) {
        kqmVar.getClass();
        if (!(kqmVar instanceof kqf)) {
            if (kqk.b == kqmVar) {
                return this;
            }
            return null;
        }
        kqf kqfVar = (kqf) kqmVar;
        if (!kqfVar.b(getKey())) {
            return null;
        }
        kql a = kqfVar.a(this);
        if (a instanceof kql) {
            return a;
        }
        return null;
    }

    @Override // defpackage.kqe, defpackage.kqn
    public final /* bridge */ kqn minusKey(kqm kqmVar) {
        kqmVar.getClass();
        if (kqmVar instanceof kqf) {
            kqf kqfVar = (kqf) kqmVar;
            if (!kqfVar.b(getKey()) || kqfVar.a(this) == null) {
                return this;
            }
        } else if (kqk.b != kqmVar) {
            return this;
        }
        return kqo.a;
    }

    public String toString() {
        return kvp.a(this) + "@" + kvp.b(this);
    }
}
