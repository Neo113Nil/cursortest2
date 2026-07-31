package r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20495a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20496b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20497c;

    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC0127b f20498f;

        /* renamed from: g, reason: collision with root package name */
        private final Handler f20499g;

        public a(Handler handler, InterfaceC0127b interfaceC0127b) {
            this.f20499g = handler;
            this.f20498f = interfaceC0127b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f20499g.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f20497c) {
                this.f20498f.D();
            }
        }
    }

    /* renamed from: r0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0127b {
        void D();
    }

    public b(Context context, Handler handler, InterfaceC0127b interfaceC0127b) {
        this.f20495a = context.getApplicationContext();
        this.f20496b = new a(handler, interfaceC0127b);
    }

    public void b(boolean z6) {
        boolean z7;
        if (z6 && !this.f20497c) {
            this.f20495a.registerReceiver(this.f20496b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z7 = true;
        } else {
            if (z6 || !this.f20497c) {
                return;
            }
            this.f20495a.unregisterReceiver(this.f20496b);
            z7 = false;
        }
        this.f20497c = z7;
    }
}
