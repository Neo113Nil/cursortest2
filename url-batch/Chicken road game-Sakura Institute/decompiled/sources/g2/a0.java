package g2;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Choreographer f3998f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3998f.postFrameCallback(new b0(runnable, 0));
    }
}
