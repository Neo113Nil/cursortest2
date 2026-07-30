package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ew extends ln {
    public static final /* synthetic */ int j = 0;
    public long g;
    public boolean h;
    public m9 i;

    public final void n(boolean z) {
        long j2 = this.g - (z ? 4294967296L : 1L);
        this.g = j2;
        if (j2 <= 0 && this.h) {
            shutdown();
        }
    }

    public final void q(js jsVar) {
        m9 m9Var = this.i;
        if (m9Var == null) {
            m9Var = new m9();
            this.i = m9Var;
        }
        m9Var.addLast(jsVar);
    }

    public final void r(boolean z) {
        this.g = (z ? 4294967296L : 1L) + this.g;
        if (z) {
            return;
        }
        this.h = true;
    }

    public abstract long s();

    public abstract void shutdown();

    public final boolean t() {
        m9 m9Var = this.i;
        if (m9Var == null) {
            return false;
        }
        js jsVar = (js) (m9Var.isEmpty() ? null : m9Var.removeFirst());
        if (jsVar == null) {
            return false;
        }
        jsVar.run();
        return true;
    }
}
