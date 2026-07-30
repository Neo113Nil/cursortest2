package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class vv2 implements Executor {
    public final /* synthetic */ Choreographer m;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.m.postFrameCallback(new g52(runnable));
    }
}
