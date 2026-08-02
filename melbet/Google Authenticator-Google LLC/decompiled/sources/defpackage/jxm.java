package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class jxm implements Executor {
    public static final jxm a;
    private static final /* synthetic */ jxm[] b;

    static {
        jxm jxmVar = new jxm();
        a = jxmVar;
        b = new jxm[]{jxmVar};
    }

    private jxm() {
    }

    public static jxm[] values() {
        return (jxm[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
