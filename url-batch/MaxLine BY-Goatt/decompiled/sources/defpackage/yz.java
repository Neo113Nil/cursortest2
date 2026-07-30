package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                a00Var.A--;
                break;
            default:
                gn2 gn2Var = (gn2) obj;
                gn2Var.j--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a00) obj).A++;
                break;
            default:
                ((gn2) obj).j++;
                break;
        }
    }
}
