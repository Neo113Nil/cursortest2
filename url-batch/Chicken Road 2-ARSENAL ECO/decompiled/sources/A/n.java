package A;

import Q0.o;
import a.AbstractC0219a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.onesignal.flutter.OneSignalNotifications;
import com.onesignal.flutter.OneSignalPushSubscription;
import com.onesignal.flutter.OneSignalUser;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import k2.AbstractC0467a;
import k2.C0469c;
import k5.C0481k;
import l0.q;
import l1.InterfaceFutureC0490a;
import u0.C0675e;
import u0.C0680j;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f35f;

    /* renamed from: g, reason: collision with root package name */
    public Object f36g;

    /* renamed from: h, reason: collision with root package name */
    public Object f37h;

    /* renamed from: i, reason: collision with root package name */
    public Object f38i;

    public /* synthetic */ n(int i7) {
        this.f35f = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        k1.n c7;
        boolean z5 = true;
        char c8 = 1;
        Object obj = null;
        switch (this.f35f) {
            case 0:
                try {
                    obj = ((f) this.f36g).call();
                } catch (Exception unused) {
                }
                ((Handler) this.f38i).post(new a((g) this.f37h, c8 == true ? 1 : 0, obj));
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Q0.a aVar = (Q0.a) this.f37h;
                Intent intent = aVar.f1962f;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    c7 = AbstractC0219a.p(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar.f1962f;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f1962f;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.f36g;
                    bundle.putBoolean("supports_message_handled", true);
                    o b7 = o.b(context);
                    synchronized (b7) {
                        i7 = b7.f2004a;
                        b7.f2004a = i7 + 1;
                    }
                    c7 = b7.c(new Q0.n(i7, 2, bundle, 0));
                }
                c7.a(Q0.h.f1980g, new Q0.i((CountDownLatch) this.f38i));
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((AbstractC0467a) this.f38i).f5177g.q((String) this.f36g, (HashMap) this.f37h, null);
                return;
            case 3:
                C0469c c0469c = (C0469c) this.f38i;
                C0675e c0675e = (C0675e) this.f36g;
                N3.j jVar = (N3.j) this.f37h;
                String str = (String) c0675e.f5975b;
                Object obj2 = c0675e.f5976c;
                if (str.contentEquals("OneSignal#addTrigger")) {
                    C0469c.j(c0675e, jVar);
                    return;
                }
                if (str.contentEquals("OneSignal#addTriggers")) {
                    C0469c.j(c0675e, jVar);
                    return;
                }
                if (str.contentEquals("OneSignal#removeTrigger")) {
                    L1.f.a().mo16removeTrigger((String) obj2);
                    AbstractC0467a.f(jVar, null);
                    return;
                }
                if (str.contentEquals("OneSignal#removeTriggers")) {
                    try {
                        L1.f.a().mo17removeTriggers((Collection) obj2);
                        AbstractC0467a.f(jVar, null);
                        return;
                    } catch (ClassCastException e4) {
                        AbstractC0467a.d(jVar, "Remove triggers for keys failed with error: " + e4.getMessage() + "\n" + e4.getStackTrace());
                        return;
                    }
                }
                if (str.contentEquals("OneSignal#clearTriggers")) {
                    L1.f.a().mo13clearTriggers();
                    AbstractC0467a.f(jVar, null);
                    return;
                }
                if (str.contentEquals("OneSignal#arePaused")) {
                    AbstractC0467a.f(jVar, Boolean.valueOf(L1.f.a().getPaused()));
                    return;
                }
                if (str.contentEquals("OneSignal#paused")) {
                    L1.f.a().setPaused(((Boolean) obj2).booleanValue());
                    AbstractC0467a.f(jVar, null);
                    return;
                } else {
                    if (!str.contentEquals("OneSignal#lifecycleInit")) {
                        AbstractC0467a.e(jVar);
                        return;
                    }
                    L1.f.a().mo15removeLifecycleListener(c0469c);
                    L1.f.a().mo10addLifecycleListener(c0469c);
                    L1.f.a().mo14removeClickListener(c0469c);
                    L1.f.a().mo9addClickListener(c0469c);
                    AbstractC0467a.f(jVar, null);
                    return;
                }
            case 4:
                OneSignalNotifications oneSignalNotifications = (OneSignalNotifications) this.f38i;
                C0675e c0675e2 = (C0675e) this.f36g;
                N3.j jVar2 = (N3.j) this.f37h;
                OneSignalNotifications oneSignalNotifications2 = OneSignalNotifications.f3920m;
                if (((String) c0675e2.f5975b).contentEquals("OneSignal#permission")) {
                    AbstractC0467a.f(jVar2, Boolean.valueOf(L1.f.b().mo23getPermission()));
                    return;
                }
                if (((String) c0675e2.f5975b).contentEquals("OneSignal#canRequest")) {
                    AbstractC0467a.f(jVar2, Boolean.valueOf(L1.f.b().mo22getCanRequestPermission()));
                    return;
                }
                if (((String) c0675e2.f5975b).contentEquals("OneSignal#requestPermission")) {
                    boolean booleanValue = ((Boolean) c0675e2.c("fallbackToSettings")).booleanValue();
                    if (L1.f.b().mo23getPermission()) {
                        AbstractC0467a.f(jVar2, Boolean.TRUE);
                        return;
                    } else {
                        L1.f.b().requestPermission(booleanValue, new k2.e(oneSignalNotifications, jVar2));
                        return;
                    }
                }
                if (((String) c0675e2.f5975b).contentEquals("OneSignal#removeNotification")) {
                    L1.f.b().mo27removeNotification(((Integer) c0675e2.c("notificationId")).intValue());
                    AbstractC0467a.f(jVar2, null);
                    return;
                }
                if (((String) c0675e2.f5975b).contentEquals("OneSignal#removeGroupedNotifications")) {
                    L1.f.b().mo26removeGroupedNotifications((String) c0675e2.c("notificationGroup"));
                    AbstractC0467a.f(jVar2, null);
                    return;
                }
                if (((String) c0675e2.f5975b).contentEquals("OneSignal#clearAll")) {
                    L1.f.b().mo21clearAllNotifications();
                    AbstractC0467a.f(jVar2, null);
                    return;
                }
                if (!((String) c0675e2.f5975b).contentEquals("OneSignal#lifecycleInit")) {
                    if (!((String) c0675e2.f5975b).contentEquals("OneSignal#addNativeClickListener")) {
                        AbstractC0467a.e(jVar2);
                        return;
                    }
                    oneSignalNotifications.f3923l = true;
                    L1.f.b().mo24removeClickListener(oneSignalNotifications);
                    L1.f.b().mo18addClickListener(oneSignalNotifications);
                    return;
                }
                L1.f.b().mo25removeForegroundLifecycleListener(oneSignalNotifications);
                L1.f.b().mo19addForegroundLifecycleListener(oneSignalNotifications);
                L1.f.b().mo28removePermissionObserver(oneSignalNotifications);
                L1.f.b().mo20addPermissionObserver(oneSignalNotifications);
                oneSignalNotifications.f3921j.clear();
                oneSignalNotifications.f3922k.clear();
                AbstractC0467a.f(jVar2, null);
                return;
            case 5:
                k2.f fVar = (k2.f) this.f38i;
                C0675e c0675e3 = (C0675e) this.f36g;
                N3.j jVar3 = (N3.j) this.f37h;
                int i8 = k2.f.f5188j;
                String str2 = (String) c0675e3.f5975b;
                if (str2.contentEquals("OneSignal#initialize")) {
                    String appId = (String) c0675e3.c("appId");
                    Context context2 = fVar.f5176f;
                    C0481k c0481k = L1.f.f1441a;
                    kotlin.jvm.internal.i.e(context2, "context");
                    kotlin.jvm.internal.i.e(appId, "appId");
                    L1.f.c().initWithContext(context2, appId);
                    AbstractC0467a.f(jVar3, null);
                    return;
                }
                if (str2.contentEquals("OneSignal#consentRequired")) {
                    L1.f.c().setConsentRequired(((Boolean) c0675e3.c("required")).booleanValue());
                    AbstractC0467a.f(jVar3, null);
                    return;
                }
                if (str2.contentEquals("OneSignal#consentGiven")) {
                    L1.f.c().setConsentGiven(((Boolean) c0675e3.c("granted")).booleanValue());
                    AbstractC0467a.f(jVar3, null);
                    return;
                }
                if (str2.contentEquals("OneSignal#login")) {
                    String externalId = (String) c0675e3.c("externalId");
                    C0481k c0481k2 = L1.f.f1441a;
                    kotlin.jvm.internal.i.e(externalId, "externalId");
                    L1.f.c().login(externalId);
                    AbstractC0467a.f(jVar3, null);
                    return;
                }
                if (!str2.contentEquals("OneSignal#loginWithJWT")) {
                    if (!str2.contentEquals("OneSignal#logout")) {
                        AbstractC0467a.e(jVar3);
                        return;
                    } else {
                        L1.f.c().logout();
                        AbstractC0467a.f(jVar3, null);
                        return;
                    }
                }
                String externalId2 = (String) c0675e3.c("externalId");
                String str3 = (String) c0675e3.c("jwt");
                C0481k c0481k3 = L1.f.f1441a;
                kotlin.jvm.internal.i.e(externalId2, "externalId");
                L1.f.c().login(externalId2, str3);
                AbstractC0467a.f(jVar3, null);
                return;
            case 6:
                OneSignalPushSubscription oneSignalPushSubscription = (OneSignalPushSubscription) this.f38i;
                C0675e c0675e4 = (C0675e) this.f36g;
                N3.j jVar4 = (N3.j) this.f37h;
                OneSignalPushSubscription oneSignalPushSubscription2 = OneSignalPushSubscription.f3924j;
                String str4 = (String) c0675e4.f5975b;
                if (str4.contentEquals("OneSignal#optIn")) {
                    L1.f.e().getPushSubscription().optIn();
                    AbstractC0467a.f(jVar4, null);
                    return;
                }
                if (str4.contentEquals("OneSignal#optOut")) {
                    L1.f.e().getPushSubscription().optOut();
                    AbstractC0467a.f(jVar4, null);
                    return;
                }
                if (str4.contentEquals("OneSignal#pushSubscriptionId")) {
                    AbstractC0467a.f(jVar4, L1.f.e().getPushSubscription().getId());
                    return;
                }
                if (str4.contentEquals("OneSignal#pushSubscriptionToken")) {
                    AbstractC0467a.f(jVar4, L1.f.e().getPushSubscription().getToken());
                    return;
                }
                if (str4.contentEquals("OneSignal#pushSubscriptionOptedIn")) {
                    AbstractC0467a.f(jVar4, Boolean.valueOf(L1.f.e().getPushSubscription().getOptedIn()));
                    return;
                } else {
                    if (!str4.contentEquals("OneSignal#lifecycleInit")) {
                        AbstractC0467a.e(jVar4);
                        return;
                    }
                    L1.f.e().getPushSubscription().removeObserver(oneSignalPushSubscription);
                    L1.f.e().getPushSubscription().addObserver(oneSignalPushSubscription);
                    AbstractC0467a.f(jVar4, null);
                    return;
                }
            case 7:
                OneSignalUser oneSignalUser = (OneSignalUser) this.f38i;
                C0675e c0675e5 = (C0675e) this.f36g;
                N3.j jVar5 = (N3.j) this.f37h;
                OneSignalUser oneSignalUser2 = OneSignalUser.f3925j;
                String str5 = (String) c0675e5.f5975b;
                Object obj3 = c0675e5.f5976c;
                if (str5.contentEquals("OneSignal#setLanguage")) {
                    String str6 = (String) c0675e5.c("language");
                    if (str6 != null && str6.length() == 0) {
                        str6 = null;
                    }
                    L1.f.e().setLanguage(str6);
                    AbstractC0467a.f(jVar5, null);
                    return;
                }
                if (str5.contentEquals("OneSignal#getOnesignalId")) {
                    String onesignalId = L1.f.e().getOnesignalId();
                    AbstractC0467a.f(jVar5, onesignalId.isEmpty() ? null : onesignalId);
                    return;
                }
                if (str5.contentEquals("OneSignal#getExternalId")) {
                    String externalId3 = L1.f.e().getExternalId();
                    AbstractC0467a.f(jVar5, externalId3.isEmpty() ? null : externalId3);
                    return;
                }
                if (str5.contentEquals("OneSignal#addAliases")) {
                    try {
                        L1.f.e().addAliases((Map) obj3);
                        AbstractC0467a.f(jVar5, null);
                        return;
                    } catch (ClassCastException e7) {
                        AbstractC0467a.d(jVar5, "addAliases failed with error: " + e7.getMessage() + "\n" + e7.getStackTrace());
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#removeAliases")) {
                    try {
                        L1.f.e().removeAliases((List) obj3);
                        AbstractC0467a.f(jVar5, null);
                        return;
                    } catch (ClassCastException e8) {
                        AbstractC0467a.d(jVar5, "removeAliases failed with error: " + e8.getMessage() + "\n" + e8.getStackTrace());
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#addEmail")) {
                    L1.f.e().addEmail((String) obj3);
                    AbstractC0467a.f(jVar5, null);
                    return;
                }
                if (str5.contentEquals("OneSignal#removeEmail")) {
                    L1.f.e().removeEmail((String) obj3);
                    AbstractC0467a.f(jVar5, null);
                    return;
                }
                if (str5.contentEquals("OneSignal#addSms")) {
                    L1.f.e().addSms((String) obj3);
                    AbstractC0467a.f(jVar5, null);
                    return;
                }
                if (str5.contentEquals("OneSignal#removeSms")) {
                    L1.f.e().removeSms((String) obj3);
                    AbstractC0467a.f(jVar5, null);
                    return;
                }
                if (str5.contentEquals("OneSignal#addTags")) {
                    try {
                        L1.f.e().addTags((Map) obj3);
                        AbstractC0467a.f(jVar5, null);
                        return;
                    } catch (ClassCastException e9) {
                        AbstractC0467a.d(jVar5, "addTags failed with error: " + e9.getMessage() + "\n" + e9.getStackTrace());
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#removeTags")) {
                    try {
                        L1.f.e().removeTags((List) obj3);
                        AbstractC0467a.f(jVar5, null);
                        return;
                    } catch (ClassCastException e10) {
                        AbstractC0467a.d(jVar5, "deleteTags failed with error: " + e10.getMessage() + "\n" + e10.getStackTrace());
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#getTags")) {
                    AbstractC0467a.f(jVar5, L1.f.e().getTags());
                    return;
                }
                if (str5.contentEquals("OneSignal#lifecycleInit")) {
                    L1.f.e().removeObserver(oneSignalUser);
                    L1.f.e().addObserver(oneSignalUser);
                    AbstractC0467a.f(jVar5, null);
                    return;
                } else if (!str5.contentEquals("OneSignal#trackEvent")) {
                    AbstractC0467a.e(jVar5);
                    return;
                } else {
                    L1.f.e().trackEvent((String) c0675e5.c("name"), (Map) c0675e5.c("properties"));
                    AbstractC0467a.f(jVar5, null);
                    return;
                }
            case 8:
                try {
                    z5 = ((Boolean) ((InterfaceFutureC0490a) this.f38i).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((m0.f) this.f36g).f((C0680j) this.f37h, z5);
                return;
            case 9:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f38i;
                Context context3 = (Context) this.f37h;
                Intent intent4 = (Intent) this.f36g;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    q.d().a(ConstraintProxyUpdateReceiver.f3578a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    v0.i.a(context3, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    v0.i.a(context3, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    v0.i.a(context3, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    v0.i.a(context3, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            default:
                ((m0.o) this.f36g).f5378f.h((m0.j) this.f37h, (B0.c) this.f38i);
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i7) {
        this.f35f = i7;
        this.f36g = obj;
        this.f37h = obj2;
        this.f38i = obj3;
    }

    public /* synthetic */ n(AbstractC0467a abstractC0467a, Object obj, Object obj2, int i7) {
        this.f35f = i7;
        this.f38i = abstractC0467a;
        this.f36g = obj;
        this.f37h = obj2;
    }
}
