package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.n;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private UnityPlayer f9398a;

    /* renamed from: c, reason: collision with root package name */
    private a f9400c;

    /* renamed from: b, reason: collision with root package name */
    private Context f9399b = null;

    /* renamed from: d, reason: collision with root package name */
    private final Semaphore f9401d = new Semaphore(0);
    private final Lock e = new ReentrantLock();
    private n f = null;
    private int g = 2;
    private boolean h = false;
    private boolean i = false;

    /* renamed from: com.unity3d.player.o$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9402a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9403b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9404c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9405d;
        final /* synthetic */ boolean e;
        final /* synthetic */ long f;
        final /* synthetic */ long g;

        AnonymousClass1(String str, int i, int i2, int i3, boolean z, long j, long j2) {
            this.f9402a = str;
            this.f9403b = i;
            this.f9404c = i2;
            this.f9405d = i3;
            this.e = z;
            this.f = j;
            this.g = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (o.this.f != null) {
                e.Log(5, "Video already playing");
                o.this.g = 2;
                o.this.f9401d.release();
            } else {
                o.this.f = new n(o.this.f9399b, this.f9402a, this.f9403b, this.f9404c, this.f9405d, this.e, this.f, this.g, new n.a() { // from class: com.unity3d.player.o.1.1
                    @Override // com.unity3d.player.n.a
                    public final void a(int i) {
                        o.this.e.lock();
                        o.this.g = i;
                        if (i == 3 && o.this.i) {
                            o.this.runOnUiThread(new Runnable() { // from class: com.unity3d.player.o.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    o.this.d();
                                    o.this.f9398a.resume();
                                }
                            });
                        }
                        if (i != 0) {
                            o.this.f9401d.release();
                        }
                        o.this.e.unlock();
                    }
                });
                if (o.this.f != null) {
                    o.this.f9398a.addView(o.this.f);
                }
            }
        }
    }

    public interface a {
        void a();
    }

    o(UnityPlayer unityPlayer) {
        this.f9398a = null;
        this.f9398a = unityPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f != null) {
            this.f9398a.removeViewFromPlayer(this.f);
            this.i = false;
            this.f.destroyPlayer();
            this.f = null;
            if (this.f9400c != null) {
                this.f9400c.a();
            }
        }
    }

    static /* synthetic */ boolean h(o oVar) {
        oVar.i = true;
        return true;
    }

    public final void a() {
        this.e.lock();
        if (this.f != null) {
            if (this.g == 0) {
                this.f.CancelOnPrepare();
            } else if (this.i) {
                this.h = this.f.a();
                if (!this.h) {
                    this.f.pause();
                }
            }
        }
        this.e.unlock();
    }

    public final boolean a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, a aVar) {
        this.e.lock();
        this.f9400c = aVar;
        this.f9399b = context;
        this.f9401d.drainPermits();
        this.g = 2;
        runOnUiThread(new AnonymousClass1(str, i, i2, i3, z, j, j2));
        boolean z2 = false;
        try {
            this.e.unlock();
            this.f9401d.acquire();
            this.e.lock();
            if (this.g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.o.2
            @Override // java.lang.Runnable
            public final void run() {
                o.this.f9398a.pause();
            }
        });
        runOnUiThread((!z2 || this.g == 3) ? new Runnable() { // from class: com.unity3d.player.o.4
            @Override // java.lang.Runnable
            public final void run() {
                o.this.d();
                o.this.f9398a.resume();
            }
        } : new Runnable() { // from class: com.unity3d.player.o.3
            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.f != null) {
                    o.this.f9398a.addViewToPlayer(o.this.f, true);
                    o.h(o.this);
                    o.this.f.requestFocus();
                }
            }
        });
        this.e.unlock();
        return z2;
    }

    public final void b() {
        this.e.lock();
        if (this.f != null && this.i && !this.h) {
            this.f.start();
        }
        this.e.unlock();
    }

    public final void c() {
        this.e.lock();
        if (this.f != null) {
            this.f.updateVideoLayout();
        }
        this.e.unlock();
    }

    protected final void runOnUiThread(Runnable runnable) {
        if (this.f9399b instanceof Activity) {
            ((Activity) this.f9399b).runOnUiThread(runnable);
        } else {
            e.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
