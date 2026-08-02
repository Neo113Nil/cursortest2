package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huf implements Executor {
    public static final huf a;
    private static final /* synthetic */ huf[] b;

    static {
        huf hufVar = new huf();
        a = hufVar;
        b = new huf[]{hufVar};
    }

    private huf() {
    }

    public static huf[] values() {
        return (huf[]) b.clone();
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
