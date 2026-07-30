package T1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final k f2597d;

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f2598e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f2599i;

    static {
        k kVar = new k("INSTANCE", 0);
        f2597d = kVar;
        f2599i = new k[]{kVar};
        f2598e = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2599i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f2598e.post(runnable);
    }
}
