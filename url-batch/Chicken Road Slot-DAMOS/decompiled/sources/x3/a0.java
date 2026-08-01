package x3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final je.l0 f10339a;

    public a0() {
        this.f10339a = je.b0.b(u0.f10465b);
    }

    public t0 a() {
        return (t0) this.f10339a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r6.f10458a > ((x3.c) r2).f10458a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(t0 t0Var) {
        je.l0 l0Var;
        Object value;
        t0 t0Var2;
        t0Var.getClass();
        do {
            l0Var = this.f10339a;
            value = l0Var.getValue();
            t0Var2 = (t0) value;
            if (!(t0Var2 instanceof o0) && !Intrinsics.a(t0Var2, u0.f10465b)) {
                if (!(t0Var2 instanceof c)) {
                    if (!(t0Var2 instanceof l0)) {
                        if (t0Var2 instanceof n0) {
                            kotlin.collections.i0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return;
                        } else {
                            a2.r.p();
                            return;
                        }
                    }
                }
            }
            t0Var2 = t0Var;
        } while (!l0Var.i(value, t0Var2));
    }

    public a0(int i3) {
        this.f10339a = je.b0.b(new int[i3]);
    }
}
