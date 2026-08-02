package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S1 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10911a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile C1099y7 f10912b = null;

    public final void a(C1099y7 c1099y7) {
        ArrayList a3;
        synchronized (this) {
            this.f10912b = c1099y7;
            a3 = a();
        }
        int size = a3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a3.get(i4);
            i4++;
            ((InterfaceC0485ae) obj).consume(c1099y7);
        }
    }

    public final void b() {
        C0501b4.l().f11459e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C0501b4.l().f11459e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Q1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        R1 r12 = new R1(dataString);
        synchronized (this) {
            try {
                C1099y7 c1099y7 = this.f10912b;
                if (c1099y7 == null) {
                    this.f10911a.add(r12);
                } else {
                    ((C1127z9) C0501b4.l().f11457c.a()).f13097b.post(new P1(r12, c1099y7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f10911a);
        this.f10911a.clear();
        return arrayList;
    }
}
