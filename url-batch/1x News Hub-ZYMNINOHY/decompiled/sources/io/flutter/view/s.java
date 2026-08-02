package io.flutter.view;

import Y1.C0118o;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f9456e;
    public static C0118o f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f9458b;

    /* renamed from: a, reason: collision with root package name */
    public long f9457a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f9459c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f9460d = new c(this);

    public s(FlutterJNI flutterJNI) {
        this.f9458b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f9456e == null) {
            f9456e = new s(flutterJNI);
        }
        if (f == null) {
            s sVar = f9456e;
            Objects.requireNonNull(sVar);
            C0118o c0118o = new C0118o(sVar, displayManager, 1);
            f = c0118o;
            displayManager.registerDisplayListener(c0118o, null);
        }
        if (f9456e.f9457a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f9456e.f9457a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f9456e;
    }
}
