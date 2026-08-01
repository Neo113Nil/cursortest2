package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b7 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2163s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f2164t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c7 f2165u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(c7 c7Var, Activity activity, int i3) {
        super(c7Var.f2191d, true);
        this.f2163s = i3;
        switch (i3) {
            case 1:
                this.f2164t = activity;
                this.f2165u = c7Var;
                super(c7Var.f2191d, true);
                break;
            case 2:
                this.f2164t = activity;
                this.f2165u = c7Var;
                super(c7Var.f2191d, true);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2164t = activity;
                this.f2165u = c7Var;
                super(c7Var.f2191d, true);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                this.f2164t = activity;
                this.f2165u = c7Var;
                super(c7Var.f2191d, true);
                break;
            default:
                this.f2164t = activity;
                this.f2165u = c7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        switch (this.f2163s) {
            case 0:
                d6 d6Var = this.f2165u.f2191d.f2229e;
                c7.c0.g(d6Var);
                d6Var.onActivityStartedByScionActivityInfo(p6.b(this.f2164t), this.f2138e);
                break;
            case 1:
                d6 d6Var2 = this.f2165u.f2191d.f2229e;
                c7.c0.g(d6Var2);
                d6Var2.onActivityResumedByScionActivityInfo(p6.b(this.f2164t), this.f2138e);
                break;
            case 2:
                d6 d6Var3 = this.f2165u.f2191d.f2229e;
                c7.c0.g(d6Var3);
                d6Var3.onActivityPausedByScionActivityInfo(p6.b(this.f2164t), this.f2138e);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                d6 d6Var4 = this.f2165u.f2191d.f2229e;
                c7.c0.g(d6Var4);
                d6Var4.onActivityStoppedByScionActivityInfo(p6.b(this.f2164t), this.f2138e);
                break;
            default:
                d6 d6Var5 = this.f2165u.f2191d.f2229e;
                c7.c0.g(d6Var5);
                d6Var5.onActivityDestroyedByScionActivityInfo(p6.b(this.f2164t), this.f2138e);
                break;
        }
    }
}
