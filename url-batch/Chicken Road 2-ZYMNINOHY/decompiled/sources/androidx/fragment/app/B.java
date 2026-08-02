package androidx.fragment.app;

import e.AbstractC0390a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f4718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0390a f4720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.b f4721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f4722e;

    public B(F f4, A a3, AtomicReference atomicReference, AbstractC0390a abstractC0390a, d.b bVar) {
        this.f4722e = f4;
        this.f4718a = a3;
        this.f4719b = atomicReference;
        this.f4720c = abstractC0390a;
        this.f4721d = bVar;
    }

    @Override // androidx.fragment.app.D
    public final void a() {
        d.h activityResultRegistry;
        F f4 = this.f4722e;
        String generateActivityResultKey = f4.generateActivityResultKey();
        A a3 = this.f4718a;
        switch (a3.f4714a) {
            case 0:
                F f5 = (F) a3.f4715b;
                Object obj = f5.mHost;
                if (!(obj instanceof d.i)) {
                    activityResultRegistry = f5.requireActivity().getActivityResultRegistry();
                    break;
                } else {
                    activityResultRegistry = ((d.i) obj).getActivityResultRegistry();
                    break;
                }
            default:
                activityResultRegistry = (d.h) a3.f4715b;
                break;
        }
        this.f4719b.set(activityResultRegistry.c(generateActivityResultKey, f4, this.f4720c, this.f4721d));
    }
}
