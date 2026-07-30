package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f637e;

    /* renamed from: f, reason: collision with root package name */
    public static r f638f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f640b;

    /* renamed from: a, reason: collision with root package name */
    public long f639a = -1;

    /* renamed from: c, reason: collision with root package name */
    public s f641c = new s(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f642d = new c(this);

    public t(FlutterJNI flutterJNI) {
        this.f640b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f637e == null) {
            f637e = new t(flutterJNI);
        }
        if (f638f == null) {
            t tVar = f637e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager);
            f638f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f637e.f639a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f637e.f639a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f637e;
    }
}
