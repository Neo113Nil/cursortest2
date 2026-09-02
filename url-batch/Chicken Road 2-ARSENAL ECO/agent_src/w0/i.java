package w0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final i f6176f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f6177g;

    static {
        i iVar = new i("INSTANCE", 0);
        f6176f = iVar;
        f6177g = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f6177g.clone();
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
