package a2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0421j implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0421j f4935d;

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f4936e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0421j[] f4937i;

    static {
        EnumC0421j enumC0421j = new EnumC0421j("INSTANCE", 0);
        f4935d = enumC0421j;
        f4937i = new EnumC0421j[]{enumC0421j};
        f4936e = new Handler(Looper.getMainLooper());
    }

    public static EnumC0421j valueOf(String str) {
        return (EnumC0421j) Enum.valueOf(EnumC0421j.class, str);
    }

    public static EnumC0421j[] values() {
        return (EnumC0421j[]) f4937i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f4936e.post(runnable);
    }
}
