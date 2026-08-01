package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class m10 implements k40 {
    public final ty a;
    public final lz b;
    public int c = -1;

    public m10(ty tyVar, lz lzVar) {
        this.a = tyVar;
        this.b = lzVar;
    }

    @Override // defpackage.k40
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.g(this);
    }
}
