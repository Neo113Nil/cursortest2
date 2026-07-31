package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fb extends eb {
    protected fb(Context context, String str, boolean z6) {
        super(context, str, z6);
    }

    public static fb v(String str, Context context, boolean z6) {
        eb.s(context, false);
        return new fb(context, str, false);
    }

    @Deprecated
    public static fb w(String str, Context context, boolean z6, int i7) {
        eb.s(context, z6);
        return new fb(context, str, z6);
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final List<Callable<Void>> q(gc gcVar, Context context, j8 j8Var, c8 c8Var) {
        if (gcVar.k() == null || !this.f4549z) {
            return super.q(gcVar, context, j8Var, null);
        }
        int a7 = gcVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.q(gcVar, context, j8Var, null));
        arrayList.add(new wc(gcVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", j8Var, a7, 24));
        return arrayList;
    }
}
