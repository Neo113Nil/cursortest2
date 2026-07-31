package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Xn extends AbstractC2601eh {
    public Xn(C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        String i4 = this.f38930a.f39767c.i();
        String str = c2773l6.f39383h;
        this.f38930a.f39767c.j(str).b();
        if (TextUtils.equals(i4, str)) {
            return false;
        }
        this.f38930a.a(C2694i4.o());
        return false;
    }
}
