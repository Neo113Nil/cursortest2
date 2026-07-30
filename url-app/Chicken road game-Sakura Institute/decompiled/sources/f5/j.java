package f5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final j f3393f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f3394g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j[] f3395h;

    static {
        j jVar = new j("INSTANCE", 0);
        f3393f = jVar;
        f3395h = new j[]{jVar};
        f3394g = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f3395h.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f3394g.post(runnable);
    }
}
