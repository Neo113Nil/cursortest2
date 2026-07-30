package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f5918e;

    /* renamed from: f, reason: collision with root package name */
    public static q f5919f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f5921b;

    /* renamed from: a, reason: collision with root package name */
    public long f5920a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f5922c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final a f5923d = new a(this);

    public s(FlutterJNI flutterJNI) {
        this.f5921b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f5918e == null) {
            f5918e = new s(flutterJNI);
        }
        if (f5919f == null) {
            s sVar = f5918e;
            Objects.requireNonNull(sVar);
            q qVar = new q(sVar, displayManager);
            f5919f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f5918e.f5920a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f5918e.f5920a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f5918e;
    }
}
