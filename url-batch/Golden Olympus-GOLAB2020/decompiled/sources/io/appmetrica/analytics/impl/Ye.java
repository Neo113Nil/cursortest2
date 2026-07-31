package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Ye implements Pc {

    /* renamed from: a, reason: collision with root package name */
    public final Oc f38560a;

    /* renamed from: b, reason: collision with root package name */
    public final Oc f38561b;

    public Ye(@NotNull final M9 m9, @NotNull C2575dh c2575dh, @NotNull J4 j4, @NotNull C2756kf c2756kf) {
        Oc oc = new Oc(c2575dh, j4, c2756kf);
        this.f38560a = oc;
        this.f38561b = oc;
        if (oc.b()) {
            return;
        }
        Ia.j().a().subscribe(TimeUnit.SECONDS.toMillis(AbstractC2539c8.f38771a.longValue()), Ia.j().w().a(), new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.ep
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                Ye.a(Ye.this, m9);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.Pc
    @NotNull
    public final Y8 a() {
        return this.f38561b;
    }

    public static final void a(Ye ye, M9 m9) {
        ye.f38560a.a();
        ((F5) m9.a()).e();
    }
}
