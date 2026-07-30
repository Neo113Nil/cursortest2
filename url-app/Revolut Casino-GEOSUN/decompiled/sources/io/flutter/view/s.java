package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f2635e;

    /* renamed from: f, reason: collision with root package name */
    public static q f2636f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2638b;

    /* renamed from: a, reason: collision with root package name */
    public long f2637a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f2639c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final b f2640d = new b(this);

    public s(FlutterJNI flutterJNI) {
        this.f2638b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2635e == null) {
            f2635e = new s(flutterJNI);
        }
        if (f2636f == null) {
            s sVar = f2635e;
            Objects.requireNonNull(sVar);
            q qVar = new q(sVar, displayManager);
            f2636f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f2635e.f2637a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2635e.f2637a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2635e;
    }
}
