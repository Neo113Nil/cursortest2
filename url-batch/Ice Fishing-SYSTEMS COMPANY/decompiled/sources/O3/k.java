package O3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final k f2522n;

    /* renamed from: u, reason: collision with root package name */
    public static final Handler f2523u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f2524v;

    static {
        k kVar = new k("INSTANCE", 0);
        f2522n = kVar;
        f2524v = new k[]{kVar};
        f2523u = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2524v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f2523u.post(runnable);
    }
}
