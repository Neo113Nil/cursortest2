package m8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final k f6608d;

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f6609e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f6610i;

    static {
        k kVar = new k("INSTANCE", 0);
        f6608d = kVar;
        f6610i = new k[]{kVar};
        f6609e = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f6610i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f6609e.post(runnable);
    }
}
