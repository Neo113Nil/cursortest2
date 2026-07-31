package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public final class L4 extends M4 {
    public L4(@NonNull Ei ei) {
        super(ei);
    }

    public final void a(@NonNull EnumC3063wb enumC3063wb, @NonNull List<AbstractC2601eh> list) {
        if (!R9.f38193h.contains(enumC3063wb)) {
            list.add(this.f37967a.f37470s);
        }
        if (R9.f38187b.contains(enumC3063wb)) {
            return;
        }
        list.add(this.f37967a.f37454c);
    }
}
