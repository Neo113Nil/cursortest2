package com.unity3d.player;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class y0 implements Runnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public y0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Configuration configuration) {
        this.b = unityPlayerForActivityOrService;
        this.a = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.nativeConfigurationChanged(this.a);
    }
}
