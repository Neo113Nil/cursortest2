package r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class m3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20801a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f20802b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20803c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f20804d;

    /* renamed from: e, reason: collision with root package name */
    private c f20805e;

    /* renamed from: f, reason: collision with root package name */
    private int f20806f;

    /* renamed from: g, reason: collision with root package name */
    private int f20807g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20808h;

    public interface b {
        void A(int i7);

        void z(int i7, boolean z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = m3.this.f20802b;
            final m3 m3Var = m3.this;
            handler.post(new Runnable() { // from class: r0.n3
                @Override // java.lang.Runnable
                public final void run() {
                    m3.b(m3.this);
                }
            });
        }
    }

    public m3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20801a = applicationContext;
        this.f20802b = handler;
        this.f20803c = bVar;
        AudioManager audioManager = (AudioManager) o2.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f20804d = audioManager;
        this.f20806f = 3;
        this.f20807g = f(audioManager, 3);
        this.f20808h = e(audioManager, this.f20806f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f20805e = cVar;
        } catch (RuntimeException e7) {
            o2.r.j("StreamVolumeManager", "Error registering stream volume receiver", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(m3 m3Var) {
        m3Var.i();
    }

    private static boolean e(AudioManager audioManager, int i7) {
        return o2.m0.f19752a >= 23 ? audioManager.isStreamMute(i7) : f(audioManager, i7) == 0;
    }

    private static int f(AudioManager audioManager, int i7) {
        try {
            return audioManager.getStreamVolume(i7);
        } catch (RuntimeException e7) {
            o2.r.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i7, e7);
            return audioManager.getStreamMaxVolume(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int f7 = f(this.f20804d, this.f20806f);
        boolean e7 = e(this.f20804d, this.f20806f);
        if (this.f20807g == f7 && this.f20808h == e7) {
            return;
        }
        this.f20807g = f7;
        this.f20808h = e7;
        this.f20803c.z(f7, e7);
    }

    public int c() {
        return this.f20804d.getStreamMaxVolume(this.f20806f);
    }

    public int d() {
        if (o2.m0.f19752a >= 28) {
            return this.f20804d.getStreamMinVolume(this.f20806f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f20805e;
        if (cVar != null) {
            try {
                this.f20801a.unregisterReceiver(cVar);
            } catch (RuntimeException e7) {
                o2.r.j("StreamVolumeManager", "Error unregistering stream volume receiver", e7);
            }
            this.f20805e = null;
        }
    }

    public void h(int i7) {
        if (this.f20806f == i7) {
            return;
        }
        this.f20806f = i7;
        i();
        this.f20803c.A(i7);
    }
}
