package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f00 extends f02 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r3s1LDPKFs1S = AtomicIntegerFieldUpdater.newUpdater(f00.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.f02, defpackage.et0
    public final void EcgxDIVH5in8(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = r3s1LDPKFs1S;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    bs0.rZjpSjn4zoMv(ng0.IAToe7bXGz4N(this.cpQdD2nAriOS), hq0.ryVscX7ZL4Ux(obj));
                    return;
                } else {
                    u9.rtx2ld2ELZv4("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // defpackage.f02, defpackage.et0
    public final void gPXPFXrUH4XX(Object obj) {
        EcgxDIVH5in8(obj);
    }
}
