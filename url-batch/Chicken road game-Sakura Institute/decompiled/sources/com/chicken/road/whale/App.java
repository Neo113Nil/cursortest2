package com.chicken.road.whale;

import a5.f;
import android.app.Application;
import d6.a;
import e4.b;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class App extends Application {

    /* renamed from: f, reason: collision with root package name */
    public b f1764f;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            f.e(this);
        } catch (Throwable th) {
            a.b(th);
        }
        this.f1764f = new b(this);
    }
}
