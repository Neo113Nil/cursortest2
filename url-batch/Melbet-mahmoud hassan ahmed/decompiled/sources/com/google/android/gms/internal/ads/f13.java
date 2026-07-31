package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class f13 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4944a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f4945b;

    public f13(Context context, Looper looper) {
        this.f4944a = context;
        this.f4945b = looper;
    }

    public final void a(String str) {
        u13 F = w13.F();
        F.r(this.f4944a.getPackageName());
        F.t(2);
        r13 F2 = s13.F();
        F2.r(str);
        F2.s(2);
        F.s(F2);
        new g13(this.f4944a, this.f4945b, F.o()).a();
    }
}
