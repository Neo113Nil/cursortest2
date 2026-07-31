package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Hc extends AbstractC2610f {
    public Hc(Context context, Og og) {
        super(context, og);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2610f
    public final void b(@NonNull C2773l6 c2773l6, @NonNull K4 k4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(k4.f37862b.f37790b, Boolean.FALSE)).booleanValue();
        InterfaceC2623fc l4 = Ia.f37730F.l();
        l4.a(booleanValue);
        l4.a(k4.f37862b.f37791c);
        Boolean bool = k4.f37862b.f37802n;
        if (bool != null) {
            Ia.f37730F.b().b(bool.booleanValue());
        }
        this.f38948b.a(c2773l6, k4);
    }
}
