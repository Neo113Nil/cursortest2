package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Ba extends V4 {
    public Ba(@NotNull S4 s4) {
        super(s4);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(@NotNull C2773l6 c2773l6, @NotNull P4 p4) {
        Bundle bundle = c2773l6.f39388m;
        C2959sb c2959sb = bundle != null ? (C2959sb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c2959sb != null) {
            if (c2959sb.f39794d) {
                J4 j4 = p4.f38114b.f38230d.f37978a;
                Boolean bool = j4.f37802n;
                Boolean bool2 = j4.f37797i;
                Ia.f37730F.b().c(bool != null ? bool.booleanValue() : true);
                Ia.f37730F.g().b(bool2);
            }
        }
        this.f38404a.a(c2959sb);
        return false;
    }
}
