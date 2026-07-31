package l0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final h f5272f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f5273g;

    static {
        h hVar = new h("INSTANCE", 0);
        f5272f = hVar;
        f5273g = new h[]{hVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f5273g.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.i.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
