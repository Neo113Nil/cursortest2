package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22126c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f22129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f22130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1733c1 f22131h;

    public Y0(C1733c1 c1733c1, String str, int i4, int i5, int i6, boolean z4, long j4, long j5) {
        this.f22131h = c1733c1;
        this.f22124a = str;
        this.f22125b = i4;
        this.f22126c = i5;
        this.f22127d = i6;
        this.f22128e = z4;
        this.f22129f = j4;
        this.f22130g = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1733c1 c1733c1 = this.f22131h;
        if (c1733c1.f22155f != null) {
            h1.T.a(5, "Video already playing");
            C1733c1 c1733c12 = this.f22131h;
            c1733c12.f22156g = 2;
            c1733c12.f22153d.release();
            return;
        }
        C1733c1 c1733c13 = this.f22131h;
        c1733c1.f22155f = new VideoPlayer(c1733c13.f22151b, c1733c13.f22150a, this.f22124a, this.f22125b, this.f22126c, this.f22127d, this.f22128e, this.f22129f, this.f22130g, new X0(this));
        C1733c1 c1733c14 = this.f22131h;
        if (c1733c14.f22155f != null) {
            FrameLayout frameLayout = c1733c14.f22150a.getFrameLayout();
            frameLayout.bringToFront();
            frameLayout.addView(this.f22131h.f22155f);
        }
    }
}
