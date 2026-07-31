package com.onesignal.flutter;

import A.n;
import F2.g;
import F2.h;
import F2.j;
import F2.m;
import F2.o;
import O3.i;
import a1.AbstractC0223a;
import com.onesignal.debug.internal.logging.b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import k2.AbstractC0467a;
import org.json.JSONException;
import u0.C0675e;

/* loaded from: classes.dex */
public class OneSignalNotifications extends AbstractC0467a implements i, h, j, o {

    /* renamed from: m, reason: collision with root package name */
    public static OneSignalNotifications f3920m;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f3921j = new ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f3922k = new ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f3923l = false;

    public static OneSignalNotifications j() {
        if (f3920m == null) {
            f3920m = new OneSignalNotifications();
        }
        return f3920m;
    }

    @Override // O3.i
    public final void g(C0675e c0675e, N3.j jVar) {
        String str = (String) c0675e.f5975b;
        boolean contentEquals = str.contentEquals("OneSignal#displayNotification");
        ConcurrentHashMap concurrentHashMap = this.f3921j;
        if (contentEquals) {
            String str2 = (String) c0675e.c("notificationId");
            m mVar = (m) concurrentHashMap.get(str2);
            if (mVar != null) {
                mVar.getNotification().display();
                AbstractC0467a.f(jVar, null);
                return;
            } else {
                b.error("Could not find onWillDisplayNotification event for notification with id: " + str2, null);
                return;
            }
        }
        boolean contentEquals2 = str.contentEquals("OneSignal#preventDefault");
        ConcurrentHashMap concurrentHashMap2 = this.f3922k;
        if (contentEquals2) {
            String str3 = (String) c0675e.c("notificationId");
            m mVar2 = (m) concurrentHashMap.get(str3);
            if (mVar2 == null) {
                b.error("Could not find onWillDisplayNotification event for notification with id: " + str3, null);
                return;
            } else {
                mVar2.preventDefault();
                concurrentHashMap2.put(str3, mVar2);
                AbstractC0467a.f(jVar, null);
                return;
            }
        }
        if (!str.contentEquals("OneSignal#proceedWithWillDisplay")) {
            h(jVar, new n((AbstractC0467a) this, (Object) c0675e, (Object) jVar, 4));
            return;
        }
        String str4 = (String) c0675e.c("notificationId");
        m mVar3 = (m) concurrentHashMap.get(str4);
        if (mVar3 == null) {
            b.error("Could not find onWillDisplayNotification event for notification with id: " + str4, null);
        } else if (concurrentHashMap2.containsKey(str4)) {
            AbstractC0467a.f(jVar, null);
        } else {
            mVar3.getNotification().display();
            AbstractC0467a.f(jVar, null);
        }
    }

    @Override // F2.h
    public final void onClick(g gVar) {
        try {
            b("OneSignal#onClickNotification", AbstractC0223a.k(gVar));
        } catch (JSONException e4) {
            e4.getStackTrace();
            b.error("Encountered an error attempting to convert INotificationClickEvent object to hash map:" + e4.toString(), null);
        }
    }

    @Override // F2.o
    public final void onNotificationPermissionChange(boolean z5) {
        HashMap hashMap = new HashMap();
        hashMap.put("permission", Boolean.valueOf(z5));
        b("OneSignal#onNotificationPermissionDidChange", hashMap);
    }

    @Override // F2.j
    public final void onWillDisplay(m mVar) {
        this.f3921j.put(mVar.getNotification().getNotificationId(), mVar);
        mVar.preventDefault();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("notification", AbstractC0223a.l(mVar.getNotification()));
            b("OneSignal#onWillDisplayNotification", hashMap);
        } catch (JSONException e4) {
            e4.getStackTrace();
            b.error("Encountered an error attempting to convert INotificationWillDisplayEvent object to hash map:" + e4.toString(), null);
        }
    }
}
