package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oy2 implements ek0 {
    public Object m = new AtomicBoolean();
    public Object n = null;
    public Object o = new HashMap(16, 1.0f);
    public Object p = new HashMap(16, 1.0f);
    public Object q = new HashMap(16, 1.0f);
    public Object r = new HashMap(16, 1.0f);
    public Object s = null;

    @Override // defpackage.w52
    public Object get() {
        return new f33((Context) ((w52) this.m).get(), (jl1) ((w52) this.n).get(), (tc2) ((w52) this.o).get(), (mh) ((mh) this.p).get(), (Executor) ((w52) this.q).get(), (tc2) ((w52) this.r).get(), new dq2(15), new dq2(9), (tc2) ((w52) this.s).get());
    }
}
