package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class ny3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9393a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f9394b;

    /* renamed from: c, reason: collision with root package name */
    private final iy3 f9395c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f9396d;

    /* renamed from: e, reason: collision with root package name */
    private ly3 f9397e;

    /* renamed from: f, reason: collision with root package name */
    private int f9398f;

    /* renamed from: g, reason: collision with root package name */
    private int f9399g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9400h;

    public ny3(Context context, Handler handler, iy3 iy3Var) {
        Context applicationContext = context.getApplicationContext();
        this.f9393a = applicationContext;
        this.f9394b = handler;
        this.f9395c = iy3Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        wu1.b(audioManager);
        this.f9396d = audioManager;
        this.f9398f = 3;
        this.f9399g = g(audioManager, 3);
        this.f9400h = i(audioManager, this.f9398f);
        ly3 ly3Var = new ly3(this, null);
        try {
            applicationContext.registerReceiver(ly3Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f9397e = ly3Var;
        } catch (RuntimeException e7) {
            oc2.b("StreamVolumeManager", "Error registering stream volume receiver", e7);
        }
    }

    private static int g(AudioManager audioManager, int i7) {
        try {
            return audioManager.getStreamVolume(i7);
        } catch (RuntimeException e7) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i7);
            oc2.b("StreamVolumeManager", sb.toString(), e7);
            return audioManager.getStreamMaxVolume(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        int g7 = g(this.f9396d, this.f9398f);
        boolean i7 = i(this.f9396d, this.f9398f);
        if (this.f9399g == g7 && this.f9400h == i7) {
            return;
        }
        this.f9399g = g7;
        this.f9400h = i7;
        copyOnWriteArraySet = ((dy3) this.f9395c).f4398f.f5951h;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((r80) it.next()).g(g7, i7);
        }
    }

    private static boolean i(AudioManager audioManager, int i7) {
        return n13.f8865a >= 23 ? audioManager.isStreamMute(i7) : g(audioManager, i7) == 0;
    }

    public final int a() {
        return this.f9396d.getStreamMaxVolume(this.f9398f);
    }

    public final int b() {
        if (n13.f8865a >= 28) {
            return this.f9396d.getStreamMinVolume(this.f9398f);
        }
        return 0;
    }

    public final void e() {
        ly3 ly3Var = this.f9397e;
        if (ly3Var != null) {
            try {
                this.f9393a.unregisterReceiver(ly3Var);
            } catch (RuntimeException e7) {
                oc2.b("StreamVolumeManager", "Error unregistering stream volume receiver", e7);
            }
            this.f9397e = null;
        }
    }

    public final void f(int i7) {
        ny3 ny3Var;
        r34 S;
        r34 r34Var;
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (this.f9398f == 3) {
            return;
        }
        this.f9398f = 3;
        h();
        dy3 dy3Var = (dy3) this.f9395c;
        ny3Var = dy3Var.f4398f.f5955l;
        S = gy3.S(ny3Var);
        r34Var = dy3Var.f4398f.F;
        if (S.equals(r34Var)) {
            return;
        }
        dy3Var.f4398f.F = S;
        copyOnWriteArraySet = dy3Var.f4398f.f5951h;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((r80) it.next()).t(S);
        }
    }
}
