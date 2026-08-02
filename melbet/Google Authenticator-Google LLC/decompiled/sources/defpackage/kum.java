package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kum extends kxb implements kwu, kqj, kvm {
    public final kqn a;

    public kum(kqn kqnVar, boolean z) {
        super(z);
        H((kwu) kqnVar.get(kwu.d));
        this.a = kqnVar.plus(this);
    }

    @Override // defpackage.kxb
    protected final String a() {
        return String.valueOf(kvp.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return this.a;
    }

    @Override // defpackage.kvm
    public final kqn bV() {
        return this.a;
    }

    protected void bX(Object obj) {
        n(obj);
    }

    @Override // defpackage.kxb
    public final void bY(Throwable th) {
        kvp.i(this.a, th);
    }

    @Override // defpackage.kxb
    public String c() {
        String str = null;
        if (kvo.a) {
            kqn kqnVar = this.a;
            kvk kvkVar = (kvk) kqnVar.get(kvk.b);
            if (kvkVar != null) {
                kvl kvlVar = (kvl) kqnVar.get(kvl.b);
                str = (kvlVar != null ? kvlVar.a : "coroutine") + "#" + kvkVar.a;
            }
        }
        if (str == null) {
            return kvp.a(this);
        }
        return "\"" + str + "\":" + kvp.a(this);
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        Object C = C(ixg.b(obj));
        if (C == kxc.c) {
            return;
        }
        bX(C);
    }

    @Override // defpackage.kxb
    protected final void l(Object obj) {
        if (!(obj instanceof kve)) {
            k(obj);
        } else {
            kve kveVar = (kve) obj;
            bZ(kveVar.b, kveVar.c.a());
        }
    }

    protected void k(Object obj) {
    }

    protected void bZ(Throwable th, boolean z) {
    }
}
