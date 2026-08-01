package f8;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f4128d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d0[] f4129e;

    static {
        d0 d0Var = new d0("INSTANCE", 0);
        f4128d = d0Var;
        f4129e = new d0[]{d0Var};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f4129e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
