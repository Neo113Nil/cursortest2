package com.iab.omid.library.ironsrc.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    private static j f14560d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f14561a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14562b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14563c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z4;
            boolean z5;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z4 = jVar.f14563c;
                z5 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z4 = jVar.f14563c;
                z5 = false;
            }
            jVar.a(z5, z4);
            j.this.f14562b = z5;
        }
    }

    public static j b() {
        return f14560d;
    }

    public void a() {
        Context context = this.f14561a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f14562b, isDeviceLocked);
        this.f14563c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f14561a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z4, boolean z5) {
        if ((z5 || z4) == (this.f14563c || this.f14562b)) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z5 || z4);
        }
    }
}
