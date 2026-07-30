package k5;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f5359a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.b f5360b;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f5366h;

    /* renamed from: i, reason: collision with root package name */
    public long f5367i;

    /* renamed from: g, reason: collision with root package name */
    public final Random f5365g = new Random();

    /* renamed from: j, reason: collision with root package name */
    public boolean f5368j = true;

    /* renamed from: c, reason: collision with root package name */
    public final long f5361c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public final long f5362d = 30000;

    /* renamed from: f, reason: collision with root package name */
    public final double f5364f = 1.3d;

    /* renamed from: e, reason: collision with root package name */
    public final double f5363e = 0.7d;

    public a(ScheduledExecutorService scheduledExecutorService, b1.b bVar) {
        this.f5359a = scheduledExecutorService;
        this.f5360b = bVar;
    }
}
