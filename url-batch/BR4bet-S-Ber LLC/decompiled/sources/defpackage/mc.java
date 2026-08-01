package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ m3 g;

    public /* synthetic */ mc(m3 m3Var, int i) {
        this.f = i;
        this.g = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        m3 m3Var = this.g;
        switch (i) {
            case 0:
                wc.f(m3Var);
                break;
            default:
                m3Var.invalidateOptionsMenu();
                break;
        }
    }
}
