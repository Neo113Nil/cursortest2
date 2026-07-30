package z4;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final u4.e f10107f;

    public h() {
        u4.e eVar = new u4.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f10107f = eVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10107f.post(runnable);
    }
}
