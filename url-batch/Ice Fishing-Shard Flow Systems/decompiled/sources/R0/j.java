package R0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final j f2398d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f2399e;

    static {
        j jVar = new j("INSTANCE", 0);
        f2398d = jVar;
        f2399e = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2399e.clone();
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
