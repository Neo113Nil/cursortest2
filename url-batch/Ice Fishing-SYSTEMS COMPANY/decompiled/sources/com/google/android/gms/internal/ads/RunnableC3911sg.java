package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3911sg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34254n;

    /* renamed from: u, reason: collision with root package name */
    public final C3965tg f34255u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34256v;

    public /* synthetic */ RunnableC3911sg(int i, C3965tg c3965tg, boolean z8) {
        this.f34254n = i;
        this.f34256v = z8;
        this.f34255u = c3965tg;
    }

    public void a() {
        this.f34256v = true;
        this.f34255u.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34254n) {
            case 0:
                this.f34255u.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f34256v));
                break;
            case 1:
                C3965tg c3965tg = this.f34255u;
                c3965tg.getClass();
                c3965tg.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f34256v));
                break;
            default:
                if (!this.f34256v) {
                    this.f34255u.b();
                    t2.D d2 = t2.G.f40858l;
                    d2.removeCallbacks(this);
                    d2.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public RunnableC3911sg(C3965tg c3965tg) {
        this.f34254n = 2;
        this.f34256v = false;
        this.f34255u = c3965tg;
    }
}
