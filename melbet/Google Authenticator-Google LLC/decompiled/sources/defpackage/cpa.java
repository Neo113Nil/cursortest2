package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpa {
    public cox a;
    public cli[] b;
    private boolean d = false;
    private boolean e = false;
    public int c = 0;

    public final cpb a() {
        oy.am(this.a != null, "execute parameter required");
        if (!this.e) {
            cli[] cliVarArr = this.b;
            this.d = (cliVarArr == null || cliVarArr.length == 0 || !cliVarArr[0].c) ? false : true;
        }
        return new cpb(this, this.b, this.d, this.c);
    }

    public final void b(boolean z) {
        this.e = true;
        this.d = z;
    }
}
