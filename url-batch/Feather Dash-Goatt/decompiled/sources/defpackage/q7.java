package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q7 implements yd1 {
    public final c51 d;
    public final av0 e;
    public v7 g;
    public long h;
    public long i;
    public boolean j;

    public q7(c51 c51Var, Object obj, v7 v7Var, long j, long j2, boolean z) {
        v7 v7Var2;
        this.d = c51Var;
        this.e = gb0.F(obj);
        if (v7Var != null) {
            v7Var2 = op.w(v7Var);
        } else {
            v7Var2 = (v7) ((Function1) c51Var.e).invoke(obj);
            v7Var2.d();
        }
        this.g = v7Var2;
        this.h = j;
        this.i = j2;
        this.j = z;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        return this.e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.e.getValue() + ", velocity=" + ((Function1) this.d.g).invoke(this.g) + ", isRunning=" + this.j + ", lastFrameTimeNanos=" + this.h + ", finishedTimeNanos=" + this.i + ')';
    }

    public /* synthetic */ q7(c51 c51Var, Object obj, v7 v7Var, int i) {
        this(c51Var, obj, (i & 4) != 0 ? null : v7Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
