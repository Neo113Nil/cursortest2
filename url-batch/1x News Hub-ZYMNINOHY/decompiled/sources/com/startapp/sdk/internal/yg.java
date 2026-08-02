package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class yg extends j6 {

    /* renamed from: e, reason: collision with root package name */
    public final sf f4816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(Context context, sf prefs, y3 configProvider) {
        super(context, 86400000L);
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(prefs, "prefs");
        kotlin.jvm.internal.j.e(configProvider, "configProvider");
        this.f4816e = prefs;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object a(boolean z) {
        xg xgVar = new xg();
        String string = z ? null : this.f4816e.getString("a83b59c2138cbf65", null);
        if (string == null) {
            Context context = this.f3998a;
            context.getPackageName();
            string = si.b(context);
            rf edit = this.f4816e.edit();
            edit.a("a83b59c2138cbf65", string);
            edit.f4395a.putString("a83b59c2138cbf65", string);
            edit.apply();
        }
        xgVar.f4736a = string;
        return xgVar;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object c() {
        return new xg();
    }
}
