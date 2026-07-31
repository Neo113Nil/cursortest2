package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f2634e;

    /* renamed from: f, reason: collision with root package name */
    public static r f2635f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2637b;

    /* renamed from: a, reason: collision with root package name */
    public long f2636a = -1;

    /* renamed from: c, reason: collision with root package name */
    public s f2638c = new s(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f2639d = new c(this);

    public t(FlutterJNI flutterJNI) {
        this.f2637b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2634e == null) {
            f2634e = new t(flutterJNI);
        }
        if (f2635f == null) {
            t tVar = f2634e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager);
            f2635f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f2634e.f2636a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2634e.f2636a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2634e;
    }
}
