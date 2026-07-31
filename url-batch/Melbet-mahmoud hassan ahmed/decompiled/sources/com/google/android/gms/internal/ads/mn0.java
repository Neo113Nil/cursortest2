package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class mn0 {

    /* renamed from: a, reason: collision with root package name */
    private long f8639a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f8640b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nn0 f8641c;

    public mn0(nn0 nn0Var) {
        this.f8641c = nn0Var;
    }

    public final long a() {
        return this.f8640b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f8639a);
        bundle.putLong("tclose", this.f8640b);
        return bundle;
    }

    public final void c() {
        v3.d dVar;
        dVar = this.f8641c.f9180a;
        this.f8640b = dVar.a();
    }

    public final void d() {
        v3.d dVar;
        dVar = this.f8641c.f9180a;
        this.f8639a = dVar.a();
    }
}
