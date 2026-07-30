package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uk1 implements Executor {
    public static final uk1 d;
    public static final Handler e;
    public static final /* synthetic */ uk1[] g;

    static {
        uk1 uk1Var = new uk1("INSTANCE", 0);
        d = uk1Var;
        g = new uk1[]{uk1Var};
        e = new Handler(Looper.getMainLooper());
    }

    public static uk1 valueOf(String str) {
        return (uk1) Enum.valueOf(uk1.class, str);
    }

    public static uk1[] values() {
        return (uk1[]) g.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e.post(runnable);
    }
}
