package io.opentelemetry.context;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ThreadLocalContextStorage implements ContextStorage {
    public static final /* synthetic */ ThreadLocalContextStorage[] $VALUES;
    public static final ThreadLocalContextStorage INSTANCE;
    public static final ThreadLocal THREAD_LOCAL_STORAGE;

    static {
        ThreadLocalContextStorage threadLocalContextStorage = new ThreadLocalContextStorage("INSTANCE", 0);
        INSTANCE = threadLocalContextStorage;
        $VALUES = new ThreadLocalContextStorage[]{threadLocalContextStorage};
        Logger.getLogger(ThreadLocalContextStorage.class.getName());
        THREAD_LOCAL_STORAGE = new ThreadLocal();
    }

    public static ThreadLocalContextStorage valueOf(String str) {
        return (ThreadLocalContextStorage) Enum.valueOf(ThreadLocalContextStorage.class, str);
    }

    public static ThreadLocalContextStorage[] values() {
        return (ThreadLocalContextStorage[]) $VALUES.clone();
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final Context current() {
        return (Context) THREAD_LOCAL_STORAGE.get();
    }
}
