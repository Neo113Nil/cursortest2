package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ib0 implements Executor {
    public static final ib0 m;
    public static final /* synthetic */ ib0[] n;

    static {
        ib0 ib0Var = new ib0("INSTANCE", 0);
        m = ib0Var;
        n = new ib0[]{ib0Var};
    }

    public static ib0 valueOf(String str) {
        return (ib0) Enum.valueOf(ib0.class, str);
    }

    public static ib0[] values() {
        return (ib0[]) n.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
