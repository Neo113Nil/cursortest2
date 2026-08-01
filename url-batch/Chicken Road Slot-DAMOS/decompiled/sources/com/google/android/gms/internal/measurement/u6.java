package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2847s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2848t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d7 f2849u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(d7 d7Var, String str, int i3) {
        super(d7Var, true);
        this.f2847s = i3;
        switch (i3) {
            case 1:
                this.f2848t = str;
                Objects.requireNonNull(d7Var);
                this.f2849u = d7Var;
                super(d7Var, true);
                break;
            default:
                this.f2848t = str;
                Objects.requireNonNull(d7Var);
                this.f2849u = d7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        switch (this.f2847s) {
            case 0:
                d6 d6Var = this.f2849u.f2229e;
                c7.c0.g(d6Var);
                d6Var.beginAdUnitExposure(this.f2848t, this.f2138e);
                break;
            default:
                d6 d6Var2 = this.f2849u.f2229e;
                c7.c0.g(d6Var2);
                d6Var2.endAdUnitExposure(this.f2848t, this.f2138e);
                break;
        }
    }
}
