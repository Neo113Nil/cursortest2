package com.unity3d.player.a;

import android.widget.FrameLayout;
import com.unity3d.player.P0;

/* loaded from: classes2.dex */
public final class V implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Z h;

    public V(Z z, String str, int i, int i2, int i3, boolean z2, long j, long j2) {
        this.h = z;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z2;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z z = this.h;
        if (z.f != null) {
            AbstractC0126t.Log(5, "Video already playing");
            Z z2 = this.h;
            z2.g = 2;
            z2.d.release();
            return;
        }
        Z z3 = this.h;
        z.f = new P0(z3.b, z3.a, this.a, this.b, this.c, this.d, this.e, this.f, this.g, new U(this));
        Z z4 = this.h;
        if (z4.f != null) {
            FrameLayout frameLayout = z4.a.getFrameLayout();
            frameLayout.bringToFront();
            frameLayout.addView(this.h.f);
        }
    }
}
