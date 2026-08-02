package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asf implements Executor {
    public static final asf a;
    private static final /* synthetic */ asf[] b;

    static {
        asf asfVar = new asf();
        a = asfVar;
        asf[] asfVarArr = {asfVar};
        b = asfVarArr;
        ixf.k(asfVarArr);
    }

    private asf() {
    }

    public static asf[] values() {
        return (asf[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
