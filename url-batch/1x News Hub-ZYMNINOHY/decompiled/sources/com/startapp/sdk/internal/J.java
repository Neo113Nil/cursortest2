package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk f3533b;

    public /* synthetic */ J(yk ykVar, int i3) {
        this.f3532a = i3;
        this.f3533b = ykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3532a) {
            case 0:
                yk.a(this.f3533b);
                break;
            case 1:
                this.f3533b.f();
                break;
            case 2:
                yk.d(this.f3533b);
                break;
            case 3:
                this.f3533b.f();
                break;
            case 4:
                yk.g(this.f3533b);
                break;
            default:
                this.f3533b.d();
                break;
        }
    }
}
