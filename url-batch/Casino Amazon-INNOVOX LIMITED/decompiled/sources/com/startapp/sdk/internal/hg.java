package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class hg extends a6 {
    public final af e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(Context context, af afVar, n3 n3Var) {
        super(context, 86400000L);
        context.getClass();
        this.e = afVar;
    }

    @Override // com.startapp.sdk.internal.a6
    public final Object a(boolean z) {
        gg ggVar = new gg();
        String string = z ? null : this.e.getString("a83b59c2138cbf65", null);
        if (string == null) {
            Context context = this.f165a;
            context.getPackageName();
            string = zh.b(context);
            ze edit = this.e.edit();
            edit.a("a83b59c2138cbf65", string);
            edit.f526a.putString("a83b59c2138cbf65", string);
            edit.apply();
        }
        ggVar.f253a = string;
        return ggVar;
    }

    @Override // com.startapp.sdk.internal.a6
    public final Object c() {
        return new gg();
    }
}
