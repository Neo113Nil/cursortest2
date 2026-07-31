package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f4735e;

    /* renamed from: f, reason: collision with root package name */
    public static r f4736f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f4738b;

    /* renamed from: a, reason: collision with root package name */
    public long f4737a = -1;

    /* renamed from: c, reason: collision with root package name */
    public s f4739c = new s(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f4740d = new c(this);

    public t(FlutterJNI flutterJNI) {
        this.f4738b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f4735e == null) {
            f4735e = new t(flutterJNI);
        }
        if (f4736f == null) {
            t tVar = f4735e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager);
            f4736f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f4735e.f4737a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f4735e.f4737a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f4735e;
    }
}
