package com.iab.omid.library.startio.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class k {
    private static k d = new k();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f40a;
    private boolean b = false;
    private boolean c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k kVar;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                kVar = k.this;
                z = kVar.c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                kVar = k.this;
                z = kVar.c;
                z2 = false;
            }
            kVar.a(z2, z);
            k.this.b = z2;
        }
    }

    public static k b() {
        return d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f40a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.b, isDeviceLocked);
        this.c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f40a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = c.c().b().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.startio.adsession.a) it.next()).d().b(z2 || z);
        }
    }
}
