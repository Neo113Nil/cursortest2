package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static e f17965d;

    /* renamed from: e, reason: collision with root package name */
    private static b f17966e;

    /* renamed from: b, reason: collision with root package name */
    private FlutterJNI f17968b;

    /* renamed from: a, reason: collision with root package name */
    private long f17967a = -1;

    /* renamed from: c, reason: collision with root package name */
    private final FlutterJNI.b f17969c = new a();

    class a implements FlutterJNI.b {

        /* renamed from: io.flutter.view.e$a$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0079a implements Choreographer.FrameCallback {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f17971f;

            ChoreographerFrameCallbackC0079a(long j7) {
                this.f17971f = j7;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j7) {
                long nanoTime = System.nanoTime() - j7;
                e.this.f17968b.onVsync(nanoTime < 0 ? 0L : nanoTime, e.this.f17967a, this.f17971f);
            }
        }

        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j7) {
            Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0079a(j7));
        }
    }

    @TargetApi(17)
    class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private DisplayManager f17973a;

        b(DisplayManager displayManager) {
            this.f17973a = displayManager;
        }

        void a() {
            this.f17973a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            if (i7 == 0) {
                float refreshRate = this.f17973a.getDisplay(0).getRefreshRate();
                e eVar = e.this;
                double d7 = refreshRate;
                Double.isNaN(d7);
                eVar.f17967a = (long) (1.0E9d / d7);
                e.this.f17968b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }

    private e(FlutterJNI flutterJNI) {
        this.f17968b = flutterJNI;
    }

    public static e d(float f7, FlutterJNI flutterJNI) {
        if (f17965d == null) {
            f17965d = new e(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f7);
        e eVar = f17965d;
        double d7 = f7;
        Double.isNaN(d7);
        eVar.f17967a = (long) (1.0E9d / d7);
        return eVar;
    }

    @TargetApi(17)
    public static e e(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f17965d == null) {
            f17965d = new e(flutterJNI);
        }
        if (f17966e == null) {
            e eVar = f17965d;
            Objects.requireNonNull(eVar);
            b bVar = eVar.new b(displayManager);
            f17966e = bVar;
            bVar.a();
        }
        if (f17965d.f17967a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e eVar2 = f17965d;
            double d7 = refreshRate;
            Double.isNaN(d7);
            eVar2.f17967a = (long) (1.0E9d / d7);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f17965d;
    }

    public void f() {
        this.f17968b.setAsyncWaitForVsyncDelegate(this.f17969c);
    }
}
