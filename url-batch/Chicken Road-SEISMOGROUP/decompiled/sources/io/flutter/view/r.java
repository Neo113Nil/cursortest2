package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f869e;

    /* renamed from: f, reason: collision with root package name */
    public static p f870f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f872b;

    /* renamed from: a, reason: collision with root package name */
    public long f871a = -1;

    /* renamed from: c, reason: collision with root package name */
    public q f873c = new q(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final a f874d = new a(this);

    public r(FlutterJNI flutterJNI) {
        this.f872b = flutterJNI;
    }

    public static r a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f869e == null) {
            f869e = new r(flutterJNI);
        }
        if (f870f == null) {
            r rVar = f869e;
            Objects.requireNonNull(rVar);
            p pVar = new p(rVar, displayManager);
            f870f = pVar;
            displayManager.registerDisplayListener(pVar, null);
        }
        if (f869e.f871a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f869e.f871a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f869e;
    }
}
