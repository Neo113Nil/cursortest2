package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk f6633b;

    public /* synthetic */ L(yk ykVar, int i4) {
        this.f6632a = i4;
        this.f6633b = ykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6632a) {
            case 0:
                yk.a(this.f6633b);
                break;
            case 1:
                this.f6633b.f();
                break;
            case 2:
                yk.d(this.f6633b);
                break;
            case 3:
                this.f6633b.f();
                break;
            case 4:
                yk.g(this.f6633b);
                break;
            default:
                this.f6633b.d();
                break;
        }
    }
}
