package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2774s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2775t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2776u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d7 f2777v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2778w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(d7 d7Var, p6 p6Var, String str, String str2) {
        super(d7Var, true);
        this.f2778w = p6Var;
        this.f2775t = str;
        this.f2776u = str2;
        Objects.requireNonNull(d7Var);
        this.f2777v = d7Var;
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        switch (this.f2774s) {
            case 0:
                d6 d6Var = this.f2777v.f2229e;
                c7.c0.g(d6Var);
                d6Var.getConditionalUserProperties(this.f2775t, this.f2776u, (a6) this.f2778w);
                break;
            default:
                d6 d6Var2 = this.f2777v.f2229e;
                c7.c0.g(d6Var2);
                d6Var2.setCurrentScreenByScionActivityInfo((p6) this.f2778w, this.f2775t, this.f2776u, this.f2137d);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public void b() {
        switch (this.f2774s) {
            case 0:
                ((a6) this.f2778w).j(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(d7 d7Var, String str, String str2, a6 a6Var) {
        super(d7Var, true);
        this.f2775t = str;
        this.f2776u = str2;
        this.f2778w = a6Var;
        this.f2777v = d7Var;
    }
}
