package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class l extends Service implements i {

    /* renamed from: f, reason: collision with root package name */
    private final t f907f = new t(this);

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f907f.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f907f.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f907f.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f907f.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i7) {
        this.f907f.e();
        super.onStart(intent, i7);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, i7, i8);
    }
}
