package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vr1 implements Runnable {
    public final ng1 d;

    public vr1() {
        this.d = null;
    }

    public void a(Exception exc) {
        ng1 ng1Var = this.d;
        if (ng1Var != null) {
            ng1Var.b(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public vr1(ng1 ng1Var) {
        this.d = ng1Var;
    }
}
