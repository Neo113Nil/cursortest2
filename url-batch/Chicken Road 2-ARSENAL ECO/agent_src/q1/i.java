package q1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final i f5781f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f5782g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f5783h;

    static {
        i iVar = new i("INSTANCE", 0);
        f5781f = iVar;
        f5783h = new i[]{iVar};
        f5782g = new Handler(Looper.getMainLooper());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f5783h.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f5782g.post(runnable);
    }
}
