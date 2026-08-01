package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kc {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(kc.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile = 0;
    public final Throwable a;

    public kc(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return kc.class.getSimpleName() + '[' + this.a + ']';
    }
}
