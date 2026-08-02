package z2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1582a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1582a f16288a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1582a[] f16289b;

    static {
        EnumC1582a enumC1582a = new EnumC1582a("INSTANCE", 0);
        f16288a = enumC1582a;
        f16289b = new EnumC1582a[]{enumC1582a};
    }

    public static EnumC1582a valueOf(String str) {
        return (EnumC1582a) Enum.valueOf(EnumC1582a.class, str);
    }

    public static EnumC1582a[] values() {
        return (EnumC1582a[]) f16289b.clone();
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
