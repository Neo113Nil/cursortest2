package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikq implements Executor {
    public static final ikq a;
    private static final /* synthetic */ ikq[] b;

    static {
        ikq ikqVar = new ikq();
        a = ikqVar;
        b = new ikq[]{ikqVar};
    }

    private ikq() {
    }

    public static ikq[] values() {
        return (ikq[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ikr.b().a.post(runnable);
    }
}
