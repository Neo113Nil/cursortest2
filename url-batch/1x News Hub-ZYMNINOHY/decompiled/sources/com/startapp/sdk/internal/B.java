package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i7 f3521b;

    public /* synthetic */ B(i7 i7Var, int i3) {
        this.f3520a = i3;
        this.f3521b = i7Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f3520a) {
            case 0:
                return hb.a(this.f3521b);
            default:
                return vk.a(this.f3521b);
        }
    }
}
