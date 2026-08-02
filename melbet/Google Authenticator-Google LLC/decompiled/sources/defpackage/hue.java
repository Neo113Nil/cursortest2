package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hue extends htl {
    private hud b;

    public hue(heb hebVar, boolean z, Executor executor, htq htqVar) {
        super(hebVar, z, false);
        this.b = new hub(this, htqVar, executor);
        v();
    }

    @Override // defpackage.htl
    public final void g() {
        hud hudVar = this.b;
        if (hudVar != null) {
            hudVar.f();
        }
    }

    @Override // defpackage.hsw
    protected final void l() {
        hud hudVar = this.b;
        if (hudVar != null) {
            hudVar.h();
        }
    }

    @Override // defpackage.htl
    public final void x(int i) {
        super.x(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public hue(heb hebVar, boolean z, Executor executor, Callable callable) {
        super(hebVar, z, false);
        this.b = new huc(this, callable, executor);
        v();
    }

    @Override // defpackage.htl
    public final void e(int i, Object obj) {
    }
}
