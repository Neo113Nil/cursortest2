package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class os0 extends at0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater gPXPFXrUH4XX = AtomicIntegerFieldUpdater.newUpdater(os0.class, "_invoked$volatile");
    public final RAsUl2FVSrh6 QrzZRwfaDlRX;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public os0(RAsUl2FVSrh6 rAsUl2FVSrh6) {
        this.QrzZRwfaDlRX = rAsUl2FVSrh6;
    }

    @Override // defpackage.at0
    public final void RfyTYNmI9Srp(Throwable th) {
        if (gPXPFXrUH4XX.compareAndSet(this, 0, 1)) {
            this.QrzZRwfaDlRX.OPXfSBeufaJ8(th);
        }
    }

    @Override // defpackage.at0
    public final boolean XL4ISE6Oc65B() {
        return true;
    }
}
