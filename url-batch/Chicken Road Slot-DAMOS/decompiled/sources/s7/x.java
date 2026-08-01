package s7;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9092d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f9093e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f9094i;

    public x(z zVar, long j) {
        this.f9093e = j;
        Objects.requireNonNull(zVar);
        this.f9094i = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9092d) {
            case 0:
                ((z) this.f9094i).y(this.f9093e);
                break;
            default:
                b3 b3Var = (b3) this.f9094i;
                z zVar = ((q1) b3Var.f1478d).B;
                q1.i(zVar);
                zVar.v(this.f9093e);
                b3Var.f8524s = null;
                break;
        }
    }

    public x(b3 b3Var, long j) {
        this.f9093e = j;
        Objects.requireNonNull(b3Var);
        this.f9094i = b3Var;
    }
}
