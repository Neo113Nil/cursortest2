package com.dancingbogo.skyrolline.ad.b;

import com.cmplay.a.d;
import com.cmplay.base.util.h;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.ad.a.b;
import com.dancingbogo.skyrolline.util.NativeUtil;

/* compiled from: AdListener.java */
/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private int f4498a;

    /* renamed from: b, reason: collision with root package name */
    private int f4499b;

    public a(int i, int i2) {
        this.f4498a = -1;
        this.f4499b = -1;
        this.f4498a = i;
        this.f4499b = i2;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.b
    public void a() {
        com.cmplay.a.a.a(GameApp.f4485a);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.b
    public void a(boolean z) {
        h.a("internal_push", "onVideoCompleted  视频播放完成  mAdId:" + this.f4498a);
        if (z) {
            NativeUtil.getInstance().callbackAdShowStatues(5, this.f4499b, this.f4498a);
        } else {
            NativeUtil.getInstance().callbackAdShowStatues(4, this.f4499b, this.f4498a);
            NativeUtil.getInstance().reportCheckInfoc(2);
            NativeUtil.getInstance().reportInfoc("rollingsky_games_adsource", "scenes=1&source=" + this.f4498a, true);
        }
        if (11 == this.f4499b) {
            NativeUtil.getInstance().callbackAd(this.f4499b, !z ? 1 : 0);
        }
        new d().a(2, 4, 0, d.a(this.f4498a), 99);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.b
    public void b() {
        NativeUtil.getInstance().callbackAdShowStatues(1, this.f4499b, this.f4498a);
        NativeUtil.getInstance().reportCheckInfoc(3);
        NativeUtil.getInstance().reportInfoc("rollingsky_games_adsource", "scenes=2&source=" + this.f4498a, true);
        com.cmplay.a.a.a(GameApp.f4485a);
        new d().a(1, 4, 0, d.a(this.f4498a), 99);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.b
    public void c() {
        NativeUtil.getInstance().callbackAdShowStatues(6, this.f4499b, this.f4498a);
    }
}
