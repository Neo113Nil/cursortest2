package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class S implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final S f5908a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ S[] f5909b;

    static {
        S s4 = new S("INSTANCE", 0);
        f5908a = s4;
        f5909b = new S[]{s4};
    }

    public static S[] values() {
        return (S[]) f5909b.clone();
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
