package com.gates.olympus.miruv;

import A2.g;
import android.app.Application;

/* loaded from: classes.dex */
public class MiruvApp extends Application {

    /* renamed from: d, reason: collision with root package name */
    public g f4421d;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        this.f4421d = new g(this);
    }
}
