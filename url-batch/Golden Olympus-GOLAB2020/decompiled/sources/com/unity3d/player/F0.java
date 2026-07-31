package com.unity3d.player;

import android.content.res.Configuration;

/* loaded from: classes2.dex */
public final class F0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f22012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22013b;

    public F0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Configuration configuration) {
        this.f22013b = unityPlayerForActivityOrService;
        this.f22012a = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22013b.nativeConfigurationChanged(this.f22012a);
    }
}
