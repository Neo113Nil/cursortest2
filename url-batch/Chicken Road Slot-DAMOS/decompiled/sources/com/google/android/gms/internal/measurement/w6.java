package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2933s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a6 f2934t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d7 f2935u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(d7 d7Var, a6 a6Var, int i3) {
        super(d7Var, true);
        this.f2933s = i3;
        switch (i3) {
            case 1:
                this.f2934t = a6Var;
                Objects.requireNonNull(d7Var);
                this.f2935u = d7Var;
                super(d7Var, true);
                break;
            case 2:
                this.f2934t = a6Var;
                Objects.requireNonNull(d7Var);
                this.f2935u = d7Var;
                super(d7Var, true);
                break;
            default:
                this.f2934t = a6Var;
                Objects.requireNonNull(d7Var);
                this.f2935u = d7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        switch (this.f2933s) {
            case 0:
                d6 d6Var = this.f2935u.f2229e;
                c7.c0.g(d6Var);
                d6Var.getGmpAppId(this.f2934t);
                break;
            case 1:
                d6 d6Var2 = this.f2935u.f2229e;
                c7.c0.g(d6Var2);
                d6Var2.getCachedAppInstanceId(this.f2934t);
                break;
            case 2:
                d6 d6Var3 = this.f2935u.f2229e;
                c7.c0.g(d6Var3);
                d6Var3.generateEventId(this.f2934t);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                d6 d6Var4 = this.f2935u.f2229e;
                c7.c0.g(d6Var4);
                d6Var4.getCurrentScreenName(this.f2934t);
                break;
            default:
                d6 d6Var5 = this.f2935u.f2229e;
                c7.c0.g(d6Var5);
                d6Var5.getCurrentScreenClass(this.f2934t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void b() {
        switch (this.f2933s) {
            case 0:
                this.f2934t.j(null);
                break;
            case 1:
                this.f2934t.j(null);
                break;
            case 2:
                this.f2934t.j(null);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f2934t.j(null);
                break;
            default:
                this.f2934t.j(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(d7 d7Var, a6 a6Var, int i3, boolean z10) {
        super(d7Var, true);
        this.f2933s = i3;
        this.f2934t = a6Var;
        this.f2935u = d7Var;
    }
}
