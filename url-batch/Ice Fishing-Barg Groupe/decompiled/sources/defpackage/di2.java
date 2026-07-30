package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class di2 implements Executor {
    public final /* synthetic */ Choreographer rtx2ld2ELZv4;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.rtx2ld2ELZv4.postFrameCallback(new sq1(runnable));
    }
}
