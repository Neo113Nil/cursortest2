package com.tapjoy.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class cz extends cs {

    /* renamed from: a, reason: collision with root package name */
    public final ct f7915a;

    /* renamed from: c, reason: collision with root package name */
    public dt f7917c;
    boolean g;
    private final cu h;
    private dr i;

    /* renamed from: b, reason: collision with root package name */
    public final List f7916b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f7918d = false;
    public boolean e = false;
    public String f = UUID.randomUUID().toString();

    private void b(View view) {
        this.i = new dr(view);
    }

    public final View c() {
        return (View) this.i.get();
    }

    public final boolean d() {
        return this.f7918d && !this.e;
    }

    cz(ct ctVar, cu cuVar) {
        this.f7915a = ctVar;
        this.h = cuVar;
        b(null);
        if (cuVar.f == cv.HTML) {
            this.f7917c = new du(cuVar.f7899b);
        } else {
            this.f7917c = new dv(Collections.unmodifiableList(cuVar.f7900c), cuVar.f7901d);
        }
        this.f7917c.a();
        dd.a().f7929a.add(this);
        dt dtVar = this.f7917c;
        dg a2 = dg.a();
        WebView c2 = dtVar.c();
        JSONObject jSONObject = new JSONObject();
        dm.a(jSONObject, "impressionOwner", ctVar.f7895a);
        dm.a(jSONObject, "videoEventsOwner", ctVar.f7896b);
        dm.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(ctVar.f7897c));
        a2.a(c2, "init", jSONObject);
    }

    @Override // com.tapjoy.internal.cs
    public final void a() {
        if (this.f7918d) {
            return;
        }
        this.f7918d = true;
        dd a2 = dd.a();
        boolean b2 = a2.b();
        a2.f7930b.add(this);
        if (!b2) {
            dh a3 = dh.a();
            de.a().e = a3;
            final de a4 = de.a();
            a4.f7932b = new BroadcastReceiver() { // from class: com.tapjoy.internal.de.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    KeyguardManager keyguardManager;
                    if (intent == null) {
                        return;
                    }
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        de.a(de.this, true);
                        return;
                    }
                    if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        de.a(de.this, false);
                    } else {
                        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                            return;
                        }
                        de.a(de.this, false);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            a4.f7931a.registerReceiver(a4.f7932b, intentFilter);
            a4.f7933c = true;
            a4.c();
            if (de.a().b()) {
                dw.a();
                dw.b();
            }
            cp cpVar = a3.f7944b;
            cpVar.f7891b = cpVar.a();
            cpVar.b();
            cpVar.f7890a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cpVar);
        }
        this.f7917c.a(dh.a().f7943a);
        this.f7917c.a(this, this.h);
    }

    @Override // com.tapjoy.internal.cs
    public final void a(View view) {
        if (this.e) {
            return;
        }
        dp.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        this.f7917c.d();
        Collection<cz> unmodifiableCollection = Collections.unmodifiableCollection(dd.a().f7929a);
        if (unmodifiableCollection == null || unmodifiableCollection.size() <= 0) {
            return;
        }
        for (cz czVar : unmodifiableCollection) {
            if (czVar != this && czVar.c() == view) {
                czVar.i.clear();
            }
        }
    }

    @Override // com.tapjoy.internal.cs
    public final void b() {
        if (this.e) {
            return;
        }
        this.i.clear();
        if (!this.e) {
            this.f7916b.clear();
        }
        this.e = true;
        dg.a().a(this.f7917c.c(), "finishSession", new Object[0]);
        dd a2 = dd.a();
        boolean b2 = a2.b();
        a2.f7929a.remove(this);
        a2.f7930b.remove(this);
        if (b2 && !a2.b()) {
            dh a3 = dh.a();
            final dw a4 = dw.a();
            dw.c();
            a4.f7967b.clear();
            dw.f7964a.post(new Runnable() { // from class: com.tapjoy.internal.dw.1
                @Override // java.lang.Runnable
                public final void run() {
                    dw.this.h.b();
                }
            });
            de a5 = de.a();
            if (a5.f7931a != null && a5.f7932b != null) {
                a5.f7931a.unregisterReceiver(a5.f7932b);
                a5.f7932b = null;
            }
            a5.f7933c = false;
            a5.f7934d = false;
            a5.e = null;
            cp cpVar = a3.f7944b;
            cpVar.f7890a.getContentResolver().unregisterContentObserver(cpVar);
        }
        this.f7917c.b();
        this.f7917c = null;
    }
}
