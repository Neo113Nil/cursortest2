package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class sm {
    public static final /* synthetic */ AtomicIntegerFieldUpdater lS5Rgt96tfkO = AtomicIntegerFieldUpdater.newUpdater(sm.class, "_handled$volatile");
    public final Throwable PxuCJdSBwIXG;
    private volatile /* synthetic */ int _handled$volatile;

    public sm(Throwable th, boolean z) {
        this.PxuCJdSBwIXG = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.PxuCJdSBwIXG + ']';
    }
}
