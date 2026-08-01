package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2732s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2733t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f2735v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d7 f2736w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(d7 d7Var, String str, String str2, Bundle bundle, int i3) {
        super(d7Var, true);
        this.f2732s = i3;
        switch (i3) {
            case 1:
                this.f2733t = str;
                this.f2734u = str2;
                this.f2735v = bundle;
                Objects.requireNonNull(d7Var);
                this.f2736w = d7Var;
                super(d7Var, true);
                break;
            default:
                this.f2733t = str;
                this.f2734u = str2;
                this.f2735v = bundle;
                this.f2736w = d7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        switch (this.f2732s) {
            case 0:
                d6 d6Var = this.f2736w.f2229e;
                c7.c0.g(d6Var);
                d6Var.clearConditionalUserProperty(this.f2733t, this.f2734u, this.f2735v);
                break;
            default:
                long j = this.f2137d;
                long j3 = this.f2138e;
                d6 d6Var2 = this.f2736w.f2229e;
                c7.c0.g(d6Var2);
                d6Var2.logEventWithElapsedTime(this.f2733t, this.f2734u, this.f2735v, true, true, j, j3);
                break;
        }
    }
}
