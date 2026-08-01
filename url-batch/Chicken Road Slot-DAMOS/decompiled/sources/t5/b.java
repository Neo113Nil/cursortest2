package t5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f9283a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f9284b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final v f9285c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f9286d;

    /* renamed from: e, reason: collision with root package name */
    public final l.d f9287e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9288f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9289h;

    public b(c0 c0Var) {
        String str = w.f9321a;
        this.f9285c = new v();
        this.f9286d = new c0(18);
        this.f9287e = new l.d(28);
        this.f9288f = 4;
        this.g = Integer.MAX_VALUE;
        this.f9289h = 20;
    }
}
