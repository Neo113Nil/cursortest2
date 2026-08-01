package b1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1047b;

    public /* synthetic */ z(int i3, Object obj) {
        this.f1046a = i3;
        this.f1047b = obj;
    }

    public final void a() {
        switch (this.f1046a) {
            case 0:
                a0 a0Var = (a0) this.f1047b;
                a0Var.f940k--;
                break;
            default:
                n0.i0 i0Var = (n0.i0) this.f1047b;
                i0Var.A--;
                break;
        }
    }

    public final void b() {
        switch (this.f1046a) {
            case 0:
                ((a0) this.f1047b).f940k++;
                break;
            default:
                ((n0.i0) this.f1047b).A++;
                break;
        }
    }
}
