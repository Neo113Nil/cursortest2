package n0;

import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* renamed from: n0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f9996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f9997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1130J f9998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9999d;

    public C1126F(C1130J c1130j, int i3, Consumer consumer, Runnable runnable) {
        this.f9999d = i3;
        this.f9996a = consumer;
        this.f9997b = runnable;
        this.f9998c = c1130j;
    }

    public final void a(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C1130J c1130j = this.f9998c;
        if (z) {
            c1130j.Q(114, 28, AbstractC1135O.f10016E);
            AbstractC0248o0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            c1130j.Q(107, 28, AbstractC1135O.f10016E);
            AbstractC0248o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f9997b.run();
    }
}
