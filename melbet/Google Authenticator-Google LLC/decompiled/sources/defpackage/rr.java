package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rr implements Executor {
    public static final rr a;
    private static final /* synthetic */ rr[] b;

    static {
        rr rrVar = new rr();
        a = rrVar;
        b = new rr[]{rrVar};
    }

    private rr() {
    }

    public static rr[] values() {
        return (rr[]) b.clone();
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
