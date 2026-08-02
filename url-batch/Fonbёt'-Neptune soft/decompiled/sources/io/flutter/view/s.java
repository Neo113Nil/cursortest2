package io.flutter.view;

import D0.C0054n;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f2823e;

    /* renamed from: f, reason: collision with root package name */
    public static C0054n f2824f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f2826b;

    /* renamed from: a, reason: collision with root package name */
    public long f2825a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f2827c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final b f2828d = new b(this);

    public s(FlutterJNI flutterJNI) {
        this.f2826b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f2823e == null) {
            f2823e = new s(flutterJNI);
        }
        if (f2824f == null) {
            s sVar = f2823e;
            Objects.requireNonNull(sVar);
            C0054n c0054n = new C0054n(sVar, displayManager, 1);
            f2824f = c0054n;
            displayManager.registerDisplayListener(c0054n, null);
        }
        if (f2823e.f2825a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f2823e.f2825a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f2823e;
    }
}
