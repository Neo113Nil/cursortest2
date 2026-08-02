package W;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3331a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f3333c;

    public q(s sVar, u0.f fVar, Executor executor) {
        this.f3333c = sVar;
        this.f3331a = new WeakReference(fVar);
        this.f3332b = executor;
    }
}
