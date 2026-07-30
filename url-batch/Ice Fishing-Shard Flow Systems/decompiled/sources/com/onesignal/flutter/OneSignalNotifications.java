package com.onesignal.flutter;

import M2.a;
import V6.b;
import h3.g;
import h3.h;
import h3.j;
import h3.m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import r4.l;
import s4.n;
import s4.o;
import s4.p;

/* loaded from: classes.dex */
public class OneSignalNotifications extends a implements o, h, j, h3.o {

    /* renamed from: p, reason: collision with root package name */
    public static OneSignalNotifications f4547p;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap f4548m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f4549n = new ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f4550o = false;

    public static OneSignalNotifications i() {
        if (f4547p == null) {
            f4547p = new OneSignalNotifications();
        }
        return f4547p;
    }

    @Override // h3.h
    public final void onClick(g gVar) {
        try {
            b("OneSignal#onClickNotification", b.g(gVar));
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert INotificationClickEvent object to hash map:" + e7.toString(), null);
        }
    }

    @Override // s4.o
    public final void onMethodCall(n nVar, p pVar) {
        String str = nVar.f7767a;
        boolean contentEquals = str.contentEquals("OneSignal#displayNotification");
        ConcurrentHashMap concurrentHashMap = this.f4548m;
        if (contentEquals) {
            String str2 = (String) nVar.a("notificationId");
            m mVar = (m) concurrentHashMap.get(str2);
            if (mVar != null) {
                mVar.getNotification().display();
                a.f(null, pVar);
                return;
            } else {
                com.onesignal.debug.internal.logging.b.error("Could not find onWillDisplayNotification event for notification with id: " + str2, null);
                return;
            }
        }
        boolean contentEquals2 = str.contentEquals("OneSignal#preventDefault");
        ConcurrentHashMap concurrentHashMap2 = this.f4549n;
        if (contentEquals2) {
            String str3 = (String) nVar.a("notificationId");
            m mVar2 = (m) concurrentHashMap.get(str3);
            if (mVar2 == null) {
                com.onesignal.debug.internal.logging.b.error("Could not find onWillDisplayNotification event for notification with id: " + str3, null);
                return;
            } else {
                mVar2.preventDefault();
                concurrentHashMap2.put(str3, mVar2);
                a.f(null, pVar);
                return;
            }
        }
        if (!str.contentEquals("OneSignal#proceedWithWillDisplay")) {
            l lVar = (l) pVar;
            g(lVar, new F.n((a) this, (Object) nVar, (Object) lVar, 5));
            return;
        }
        String str4 = (String) nVar.a("notificationId");
        m mVar3 = (m) concurrentHashMap.get(str4);
        if (mVar3 == null) {
            com.onesignal.debug.internal.logging.b.error("Could not find onWillDisplayNotification event for notification with id: " + str4, null);
        } else if (concurrentHashMap2.containsKey(str4)) {
            a.f(null, pVar);
        } else {
            mVar3.getNotification().display();
            a.f(null, pVar);
        }
    }

    @Override // h3.o
    public final void onNotificationPermissionChange(boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("permission", Boolean.valueOf(z7));
        b("OneSignal#onNotificationPermissionDidChange", hashMap);
    }

    @Override // h3.j
    public final void onWillDisplay(m mVar) {
        this.f4548m.put(mVar.getNotification().getNotificationId(), mVar);
        mVar.preventDefault();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("notification", b.h(mVar.getNotification()));
            b("OneSignal#onWillDisplayNotification", hashMap);
        } catch (JSONException e7) {
            e7.getStackTrace();
            com.onesignal.debug.internal.logging.b.error("Encountered an error attempting to convert INotificationWillDisplayEvent object to hash map:" + e7.toString(), null);
        }
    }
}
