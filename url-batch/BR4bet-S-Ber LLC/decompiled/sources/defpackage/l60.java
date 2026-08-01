package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class l60 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ m60 g;
    public final /* synthetic */ ug h;

    public /* synthetic */ l60(ug ugVar, m60 m60Var, int i) {
        this.f = i;
        this.h = ugVar;
        this.g = m60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        m60 m60Var = this.g;
        ug ugVar = this.h;
        switch (i) {
            case 0:
                if (ugVar.b.contains(m60Var)) {
                    f60.a(m60Var.c.J, m60Var.a);
                    break;
                }
                break;
            default:
                ugVar.b.remove(m60Var);
                ugVar.c.remove(m60Var);
                break;
        }
    }
}
