package s7;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f8503e;

    public a3(b3 b3Var, int i3) {
        this.f8502d = i3;
        switch (i3) {
            case 1:
                Objects.requireNonNull(b3Var);
                this.f8503e = b3Var;
                break;
            default:
                Objects.requireNonNull(b3Var);
                this.f8503e = b3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8502d) {
            case 0:
                b3 b3Var = this.f8503e;
                b3Var.f8524s = b3Var.f8529x;
                break;
            default:
                this.f8503e.f8529x = null;
                break;
        }
    }
}
