package a1;

import o2.a0;
import r0.n2;
import w0.e0;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    protected final e0 f26a;

    public static final class a extends n2 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected e(e0 e0Var) {
        this.f26a = e0Var;
    }

    public final boolean a(a0 a0Var, long j7) {
        return b(a0Var) && c(a0Var, j7);
    }

    protected abstract boolean b(a0 a0Var);

    protected abstract boolean c(a0 a0Var, long j7);
}
