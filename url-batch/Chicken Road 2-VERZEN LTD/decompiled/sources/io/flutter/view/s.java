package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f816e;

    /* renamed from: f, reason: collision with root package name */
    public static q f817f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f819b;

    /* renamed from: a, reason: collision with root package name */
    public long f818a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f820c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final b f821d = new b(this);

    public s(FlutterJNI flutterJNI) {
        this.f819b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f816e == null) {
            f816e = new s(flutterJNI);
        }
        if (f817f == null) {
            s sVar = f816e;
            Objects.requireNonNull(sVar);
            q qVar = new q(sVar, displayManager);
            f817f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f816e.f818a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f816e.f818a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f816e;
    }
}
