package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f10396e;

    /* renamed from: f, reason: collision with root package name */
    public static p f10397f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f10399b;

    /* renamed from: a, reason: collision with root package name */
    public long f10398a = -1;

    /* renamed from: c, reason: collision with root package name */
    public q f10400c = new q(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final a f10401d = new a(this);

    public r(FlutterJNI flutterJNI) {
        this.f10399b = flutterJNI;
    }

    public static r a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f10396e == null) {
            f10396e = new r(flutterJNI);
        }
        if (f10397f == null) {
            r rVar = f10396e;
            Objects.requireNonNull(rVar);
            p pVar = new p(rVar, displayManager);
            f10397f = pVar;
            displayManager.registerDisplayListener(pVar, null);
        }
        if (f10396e.f10398a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f10396e.f10398a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f10396e;
    }
}
