package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ d1 h;

    public Z0(d1 d1Var, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = d1Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = this.h;
        if (d1Var.f != null) {
            com.unity3d.player.a.t.Log(5, "Video already playing");
            d1 d1Var2 = this.h;
            d1Var2.g = 2;
            d1Var2.d.release();
            return;
        }
        d1 d1Var3 = this.h;
        d1Var.f = new VideoPlayer(d1Var3.b, d1Var3.a, this.a, this.b, this.c, this.d, this.e, this.f, this.g, new Y0(this));
        d1 d1Var4 = this.h;
        if (d1Var4.f != null) {
            FrameLayout frameLayout = d1Var4.a.getFrameLayout();
            frameLayout.bringToFront();
            frameLayout.addView(this.h.f);
        }
    }
}
