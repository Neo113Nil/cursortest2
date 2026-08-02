package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjs {
    public final jzh a;
    public jxi b;
    public boolean c = false;
    public jxj d = jxj.a(jxi.d);

    public kjs(jzh jzhVar, jxi jxiVar) {
        this.a = jzhVar;
        this.b = jxiVar;
    }

    public final jxi a() {
        return this.d.a;
    }

    public final void b(jxi jxiVar) {
        boolean z;
        this.b = jxiVar;
        if (jxiVar == jxi.b || jxiVar == jxi.c) {
            z = true;
        } else if (jxiVar != jxi.d) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
