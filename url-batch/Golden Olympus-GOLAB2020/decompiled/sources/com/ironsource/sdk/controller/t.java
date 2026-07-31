package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.ig;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;

/* loaded from: classes2.dex */
class t {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f19360a;

        a(AudioManager audioManager) {
            this.f19360a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f19360a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f19361a;

        b(AudioManager audioManager) {
            this.f19361a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.d(this.f19361a);
        }
    }

    t() {
    }

    public static void a(Activity activity) {
        ig.f16710a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        ig.f16710a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
