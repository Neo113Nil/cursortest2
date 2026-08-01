package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2704s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d7 f2705t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(d7 d7Var, Exception exc) {
        super(d7Var, false);
        this.f2704s = 3;
        this.f2706u = exc;
        this.f2705t = d7Var;
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        switch (this.f2704s) {
            case 0:
                d6 d6Var = this.f2705t.f2229e;
                c7.c0.g(d6Var);
                d6Var.setUserProperty("fcm", "_ln", new j7.b(this.f2706u), true, this.f2137d);
                break;
            case 1:
                d6 d6Var2 = this.f2705t.f2229e;
                c7.c0.g(d6Var2);
                d6Var2.setConditionalUserProperty((Bundle) this.f2706u, this.f2137d);
                break;
            case 2:
                d6 d6Var3 = this.f2705t.f2229e;
                c7.c0.g(d6Var3);
                d6Var3.retrieveAndUploadBatches(new v6(this, (f8.j0) this.f2706u));
                break;
            default:
                d6 d6Var4 = this.f2705t.f2229e;
                c7.c0.g(d6Var4);
                d6Var4.logHealthData(5, "Error with data collection. Data lost.", new j7.b((Exception) this.f2706u), new j7.b(null), new j7.b(null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(d7 d7Var, Object obj, int i3) {
        super(d7Var, true);
        this.f2704s = i3;
        this.f2706u = obj;
        this.f2705t = d7Var;
    }
}
