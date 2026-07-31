package l0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y1.C0760d;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5244a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0487a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5245b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0487a(true));

    /* renamed from: c, reason: collision with root package name */
    public final x f5246c;

    /* renamed from: d, reason: collision with root package name */
    public final R0.g f5247d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.i f5248e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5249f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5250g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5251h;

    public C0488b(C0760d c0760d) {
        String str = y.f5290a;
        this.f5246c = new x();
        this.f5247d = new R0.g();
        this.f5248e = new F3.i(1);
        this.f5249f = 4;
        this.f5250g = Integer.MAX_VALUE;
        this.f5251h = 20;
    }
}
