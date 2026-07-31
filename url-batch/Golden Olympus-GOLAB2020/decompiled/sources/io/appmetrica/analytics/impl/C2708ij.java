package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ij, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2708ij extends AbstractC2601eh {
    public C2708ij(@NonNull C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        String str = c2773l6.f39383h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f38930a.f39767c.j(str).b();
        return false;
    }
}
