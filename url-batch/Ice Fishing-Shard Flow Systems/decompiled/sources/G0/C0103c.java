package G0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: G0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103c {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f783a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0102b(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f784b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0102b(true));

    /* renamed from: c, reason: collision with root package name */
    public final C f785c;

    /* renamed from: d, reason: collision with root package name */
    public final q1.h f786d;

    /* renamed from: e, reason: collision with root package name */
    public final l2.c f787e;

    /* renamed from: f, reason: collision with root package name */
    public final int f788f;

    /* renamed from: g, reason: collision with root package name */
    public final int f789g;

    /* renamed from: h, reason: collision with root package name */
    public final int f790h;

    public C0103c(c2.e eVar) {
        String str = D.f777a;
        this.f785c = new C();
        this.f786d = new q1.h(2);
        this.f787e = new l2.c(5);
        this.f788f = 4;
        this.f789g = Integer.MAX_VALUE;
        this.f790h = 20;
    }
}
