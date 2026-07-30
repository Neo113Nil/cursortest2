package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class j61 extends xf1 implements ec0, v11 {
    public n61 s;

    @Override // defpackage.ec0
    public final void a() {
        q().d0(this);
    }

    @Override // defpackage.v11
    public final boolean b() {
        return true;
    }

    @Override // defpackage.v11
    public final ms1 d() {
        return null;
    }

    public g61 getParent() {
        return q();
    }

    public final n61 q() {
        n61 n61Var = this.s;
        if (n61Var != null) {
            return n61Var;
        }
        Intrinsics.f("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.xf1
    public final String toString() {
        return getClass().getSimpleName() + '@' + o70.x(this) + "[job@" + o70.x(q()) + ']';
    }
}
