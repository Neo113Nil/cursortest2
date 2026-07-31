package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Wn extends V4 {

    /* renamed from: b, reason: collision with root package name */
    public final Z6 f38503b;

    public Wn(@NonNull S4 s4, @NonNull Z6 z6) {
        super(s4);
        this.f38503b = z6;
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(@NonNull C2773l6 c2773l6, @NonNull P4 p4) {
        J4 j4 = p4.f38114b.f38230d.f37978a;
        this.f38503b.a(j4.f37797i);
        InterfaceC2623fc l4 = Ia.f37730F.l();
        if (Boolean.TRUE.equals(j4.f37790b)) {
            l4.a(true);
        } else {
            if (Boolean.FALSE.equals(j4.f37790b)) {
                l4.a(false);
            }
        }
        l4.a(j4.f37791c);
        Boolean bool = j4.f37802n;
        Ia.f37730F.b().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
