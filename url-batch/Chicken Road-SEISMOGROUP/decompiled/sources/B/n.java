package B;

import E.AbstractActivityC0004e;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;

/* loaded from: classes.dex */
public final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    public final int f52a;

    /* renamed from: b, reason: collision with root package name */
    public Object f53b;

    /* renamed from: c, reason: collision with root package name */
    public Object f54c;

    public n(int i2, AbstractActivityC0004e abstractActivityC0004e, k kVar) {
        this.f53b = abstractActivityC0004e;
        this.f52a = i2;
        this.f54c = kVar;
        kVar.f44c = this;
    }

    @Override // B.l
    public void a(h hVar) {
        ((Handler) this.f54c).post(hVar.f33b);
    }

    @Override // B.l
    public void b() {
        HandlerThread handlerThread = (HandlerThread) this.f53b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f53b = null;
            this.f54c = null;
        }
    }

    @Override // B.l
    public void c() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f52a);
        this.f53b = handlerThread;
        handlerThread.start();
        this.f54c = new Handler(((HandlerThread) this.f53b).getLooper());
    }

    public int e() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0004e abstractActivityC0004e = (AbstractActivityC0004e) this.f53b;
        int i2 = this.f52a;
        View findViewById = abstractActivityC0004e.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public void f(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC0004e abstractActivityC0004e = (AbstractActivityC0004e) this.f53b;
        int i3 = this.f52a;
        View findViewById = abstractActivityC0004e.findViewById(i3);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }

    public n(int i2) {
        this.f52a = i2;
    }
}
