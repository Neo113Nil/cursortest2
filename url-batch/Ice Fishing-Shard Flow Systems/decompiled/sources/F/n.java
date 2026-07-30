package F;

import G0.s;
import K1.p;
import R5.q;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import n2.AbstractC0755f;
import p1.C0818a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f752d;

    /* renamed from: e, reason: collision with root package name */
    public Object f753e;

    /* renamed from: i, reason: collision with root package name */
    public Object f754i;

    /* renamed from: l, reason: collision with root package name */
    public Object f755l;

    public /* synthetic */ n(int i2) {
        this.f752d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        p c7;
        boolean z7 = true;
        char c8 = 1;
        Object obj = null;
        switch (this.f752d) {
            case 0:
                try {
                    obj = ((g) this.f753e).call();
                } catch (Exception unused) {
                }
                ((Handler) this.f755l).post(new a((h) this.f754i, c8 == true ? 1 : 0, obj));
                return;
            case 1:
                try {
                    z7 = ((Boolean) ((O1.a) this.f755l).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((H0.f) this.f753e).c((P0.j) this.f754i, z7);
                return;
            case 2:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f755l;
                Context context = (Context) this.f754i;
                Intent intent = (Intent) this.f753e;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    s.d().a(ConstraintProxyUpdateReceiver.f4107a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    Q0.k.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    Q0.k.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    Q0.k.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    Q0.k.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 3:
                ((M2.a) this.f755l).f1730e.a((String) this.f753e, (HashMap) this.f754i, null);
                return;
            case 4:
                M2.c cVar = (M2.c) this.f755l;
                s4.n nVar = (s4.n) this.f753e;
                r4.l lVar = (r4.l) this.f754i;
                String str = nVar.f7767a;
                Object obj2 = nVar.f7768b;
                if (str.contentEquals("OneSignal#addTrigger")) {
                    M2.c.i(nVar, lVar);
                    return;
                }
                if (str.contentEquals("OneSignal#addTriggers")) {
                    M2.c.i(nVar, lVar);
                    return;
                }
                if (str.contentEquals("OneSignal#removeTrigger")) {
                    AbstractC0755f.a().mo18removeTrigger((String) obj2);
                    M2.a.f(null, lVar);
                    return;
                }
                if (str.contentEquals("OneSignal#removeTriggers")) {
                    try {
                        AbstractC0755f.a().mo19removeTriggers((Collection) obj2);
                        M2.a.f(null, lVar);
                        return;
                    } catch (ClassCastException e7) {
                        M2.a.d("Remove triggers for keys failed with error: " + e7.getMessage() + "\n" + e7.getStackTrace(), lVar);
                        return;
                    }
                }
                if (str.contentEquals("OneSignal#clearTriggers")) {
                    AbstractC0755f.a().mo15clearTriggers();
                    M2.a.f(null, lVar);
                    return;
                }
                if (str.contentEquals("OneSignal#arePaused")) {
                    M2.a.f(Boolean.valueOf(AbstractC0755f.a().getPaused()), lVar);
                    return;
                }
                if (str.contentEquals("OneSignal#paused")) {
                    AbstractC0755f.a().setPaused(((Boolean) obj2).booleanValue());
                    M2.a.f(null, lVar);
                    return;
                } else {
                    if (!str.contentEquals("OneSignal#lifecycleInit")) {
                        M2.a.e(lVar);
                        return;
                    }
                    AbstractC0755f.a().mo17removeLifecycleListener(cVar);
                    AbstractC0755f.a().mo12addLifecycleListener(cVar);
                    AbstractC0755f.a().mo16removeClickListener(cVar);
                    AbstractC0755f.a().mo11addClickListener(cVar);
                    M2.a.f(null, lVar);
                    return;
                }
            case 5:
                OneSignalNotifications oneSignalNotifications = (OneSignalNotifications) this.f755l;
                s4.n nVar2 = (s4.n) this.f753e;
                r4.l lVar2 = (r4.l) this.f754i;
                OneSignalNotifications oneSignalNotifications2 = OneSignalNotifications.f4547p;
                if (nVar2.f7767a.contentEquals("OneSignal#permission")) {
                    M2.a.f(Boolean.valueOf(AbstractC0755f.b().mo25getPermission()), lVar2);
                    return;
                }
                if (nVar2.f7767a.contentEquals("OneSignal#canRequest")) {
                    M2.a.f(Boolean.valueOf(AbstractC0755f.b().mo24getCanRequestPermission()), lVar2);
                    return;
                }
                if (nVar2.f7767a.contentEquals("OneSignal#requestPermission")) {
                    boolean booleanValue = ((Boolean) nVar2.a("fallbackToSettings")).booleanValue();
                    if (AbstractC0755f.b().mo25getPermission()) {
                        M2.a.f(Boolean.TRUE, lVar2);
                        return;
                    } else {
                        AbstractC0755f.b().requestPermission(booleanValue, new M2.e(oneSignalNotifications, lVar2));
                        return;
                    }
                }
                if (nVar2.f7767a.contentEquals("OneSignal#removeNotification")) {
                    AbstractC0755f.b().mo29removeNotification(((Integer) nVar2.a("notificationId")).intValue());
                    M2.a.f(null, lVar2);
                    return;
                }
                if (nVar2.f7767a.contentEquals("OneSignal#removeGroupedNotifications")) {
                    AbstractC0755f.b().mo28removeGroupedNotifications((String) nVar2.a("notificationGroup"));
                    M2.a.f(null, lVar2);
                    return;
                }
                if (nVar2.f7767a.contentEquals("OneSignal#clearAll")) {
                    AbstractC0755f.b().mo23clearAllNotifications();
                    M2.a.f(null, lVar2);
                    return;
                }
                if (!nVar2.f7767a.contentEquals("OneSignal#lifecycleInit")) {
                    if (!nVar2.f7767a.contentEquals("OneSignal#addNativeClickListener")) {
                        M2.a.e(lVar2);
                        return;
                    }
                    oneSignalNotifications.f4550o = true;
                    AbstractC0755f.b().mo26removeClickListener(oneSignalNotifications);
                    AbstractC0755f.b().mo20addClickListener(oneSignalNotifications);
                    return;
                }
                AbstractC0755f.b().mo27removeForegroundLifecycleListener(oneSignalNotifications);
                AbstractC0755f.b().mo21addForegroundLifecycleListener(oneSignalNotifications);
                AbstractC0755f.b().mo30removePermissionObserver(oneSignalNotifications);
                AbstractC0755f.b().mo22addPermissionObserver(oneSignalNotifications);
                oneSignalNotifications.f4548m.clear();
                oneSignalNotifications.f4549n.clear();
                M2.a.f(null, lVar2);
                return;
            case 6:
                M2.f fVar = (M2.f) this.f755l;
                s4.n nVar3 = (s4.n) this.f753e;
                r4.l lVar3 = (r4.l) this.f754i;
                int i5 = M2.f.f1741m;
                String str2 = nVar3.f7767a;
                if (str2.contentEquals("OneSignal#initialize")) {
                    String appId = (String) nVar3.a("appId");
                    Context context2 = fVar.f1729d;
                    q qVar = AbstractC0755f.f6978a;
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(appId, "appId");
                    AbstractC0755f.c().initWithContext(context2, appId);
                    M2.a.f(null, lVar3);
                    return;
                }
                if (str2.contentEquals("OneSignal#consentRequired")) {
                    AbstractC0755f.c().setConsentRequired(((Boolean) nVar3.a("required")).booleanValue());
                    M2.a.f(null, lVar3);
                    return;
                }
                if (str2.contentEquals("OneSignal#consentGiven")) {
                    AbstractC0755f.c().setConsentGiven(((Boolean) nVar3.a("granted")).booleanValue());
                    M2.a.f(null, lVar3);
                    return;
                }
                if (str2.contentEquals("OneSignal#login")) {
                    String externalId = (String) nVar3.a("externalId");
                    q qVar2 = AbstractC0755f.f6978a;
                    Intrinsics.checkNotNullParameter(externalId, "externalId");
                    AbstractC0755f.c().login(externalId);
                    M2.a.f(null, lVar3);
                    return;
                }
                if (!str2.contentEquals("OneSignal#loginWithJWT")) {
                    if (!str2.contentEquals("OneSignal#logout")) {
                        M2.a.e(lVar3);
                        return;
                    } else {
                        AbstractC0755f.c().logout();
                        M2.a.f(null, lVar3);
                        return;
                    }
                }
                String externalId2 = (String) nVar3.a("externalId");
                String str3 = (String) nVar3.a("jwt");
                q qVar3 = AbstractC0755f.f6978a;
                Intrinsics.checkNotNullParameter(externalId2, "externalId");
                AbstractC0755f.c().login(externalId2, str3);
                M2.a.f(null, lVar3);
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                OneSignalPushSubscription oneSignalPushSubscription = (OneSignalPushSubscription) this.f755l;
                s4.n nVar4 = (s4.n) this.f753e;
                r4.l lVar4 = (r4.l) this.f754i;
                OneSignalPushSubscription oneSignalPushSubscription2 = OneSignalPushSubscription.f4551m;
                String str4 = nVar4.f7767a;
                if (str4.contentEquals("OneSignal#optIn")) {
                    AbstractC0755f.e().getPushSubscription().optIn();
                    M2.a.f(null, lVar4);
                    return;
                }
                if (str4.contentEquals("OneSignal#optOut")) {
                    AbstractC0755f.e().getPushSubscription().optOut();
                    M2.a.f(null, lVar4);
                    return;
                }
                if (str4.contentEquals("OneSignal#pushSubscriptionId")) {
                    M2.a.f(AbstractC0755f.e().getPushSubscription().getId(), lVar4);
                    return;
                }
                if (str4.contentEquals("OneSignal#pushSubscriptionToken")) {
                    M2.a.f(AbstractC0755f.e().getPushSubscription().getToken(), lVar4);
                    return;
                }
                if (str4.contentEquals("OneSignal#pushSubscriptionOptedIn")) {
                    M2.a.f(Boolean.valueOf(AbstractC0755f.e().getPushSubscription().getOptedIn()), lVar4);
                    return;
                } else {
                    if (!str4.contentEquals("OneSignal#lifecycleInit")) {
                        M2.a.e(lVar4);
                        return;
                    }
                    AbstractC0755f.e().getPushSubscription().removeObserver(oneSignalPushSubscription);
                    AbstractC0755f.e().getPushSubscription().addObserver(oneSignalPushSubscription);
                    M2.a.f(null, lVar4);
                    return;
                }
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                OneSignalUser oneSignalUser = (OneSignalUser) this.f755l;
                s4.n nVar5 = (s4.n) this.f753e;
                r4.l lVar5 = (r4.l) this.f754i;
                OneSignalUser oneSignalUser2 = OneSignalUser.f4552m;
                String str5 = nVar5.f7767a;
                Object obj3 = nVar5.f7768b;
                if (str5.contentEquals("OneSignal#setLanguage")) {
                    String str6 = (String) nVar5.a("language");
                    if (str6 != null && str6.length() == 0) {
                        str6 = null;
                    }
                    AbstractC0755f.e().setLanguage(str6);
                    M2.a.f(null, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#getOnesignalId")) {
                    String onesignalId = AbstractC0755f.e().getOnesignalId();
                    M2.a.f(onesignalId.isEmpty() ? null : onesignalId, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#getExternalId")) {
                    String externalId3 = AbstractC0755f.e().getExternalId();
                    M2.a.f(externalId3.isEmpty() ? null : externalId3, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#addAliases")) {
                    try {
                        AbstractC0755f.e().addAliases((Map) obj3);
                        M2.a.f(null, lVar5);
                        return;
                    } catch (ClassCastException e8) {
                        M2.a.d("addAliases failed with error: " + e8.getMessage() + "\n" + e8.getStackTrace(), lVar5);
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#removeAliases")) {
                    try {
                        AbstractC0755f.e().removeAliases((List) obj3);
                        M2.a.f(null, lVar5);
                        return;
                    } catch (ClassCastException e9) {
                        M2.a.d("removeAliases failed with error: " + e9.getMessage() + "\n" + e9.getStackTrace(), lVar5);
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#addEmail")) {
                    AbstractC0755f.e().addEmail((String) obj3);
                    M2.a.f(null, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#removeEmail")) {
                    AbstractC0755f.e().removeEmail((String) obj3);
                    M2.a.f(null, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#addSms")) {
                    AbstractC0755f.e().addSms((String) obj3);
                    M2.a.f(null, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#removeSms")) {
                    AbstractC0755f.e().removeSms((String) obj3);
                    M2.a.f(null, lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#addTags")) {
                    try {
                        AbstractC0755f.e().addTags((Map) obj3);
                        M2.a.f(null, lVar5);
                        return;
                    } catch (ClassCastException e10) {
                        M2.a.d("addTags failed with error: " + e10.getMessage() + "\n" + e10.getStackTrace(), lVar5);
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#removeTags")) {
                    try {
                        AbstractC0755f.e().removeTags((List) obj3);
                        M2.a.f(null, lVar5);
                        return;
                    } catch (ClassCastException e11) {
                        M2.a.d("deleteTags failed with error: " + e11.getMessage() + "\n" + e11.getStackTrace(), lVar5);
                        return;
                    }
                }
                if (str5.contentEquals("OneSignal#getTags")) {
                    M2.a.f(AbstractC0755f.e().getTags(), lVar5);
                    return;
                }
                if (str5.contentEquals("OneSignal#lifecycleInit")) {
                    AbstractC0755f.e().removeObserver(oneSignalUser);
                    AbstractC0755f.e().addObserver(oneSignalUser);
                    M2.a.f(null, lVar5);
                    return;
                } else if (!str5.contentEquals("OneSignal#trackEvent")) {
                    M2.a.e(lVar5);
                    return;
                } else {
                    AbstractC0755f.e().trackEvent((String) nVar5.a("name"), (Map) nVar5.a("properties"));
                    M2.a.f(null, lVar5);
                    return;
                }
            case 9:
                ((H0.p) this.f753e).f923f.h((H0.j) this.f754i, (D0.j) this.f755l);
                return;
            default:
                C0818a c0818a = (C0818a) this.f754i;
                Intent intent2 = c0818a.f7152d;
                String stringExtra = intent2.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    c7 = AbstractC1053a.w(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent3 = c0818a.f7152d;
                    String stringExtra2 = intent3.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent3.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent4 = c0818a.f7152d;
                    Integer valueOf = intent4.hasExtra("google.product_id") ? Integer.valueOf(intent4.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context3 = (Context) this.f753e;
                    bundle.putBoolean("supports_message_handled", true);
                    p1.l b7 = p1.l.b(context3);
                    synchronized (b7) {
                        i2 = b7.f7191a;
                        b7.f7191a = i2 + 1;
                    }
                    c7 = b7.c(new p1.k(i2, 2, bundle, 0));
                }
                c7.b(K1.n.f1443i, new l4.b(5, (CountDownLatch) this.f755l));
                return;
        }
    }

    public /* synthetic */ n(M2.a aVar, Object obj, Object obj2, int i2) {
        this.f752d = i2;
        this.f755l = aVar;
        this.f753e = obj;
        this.f754i = obj2;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2) {
        this.f752d = i2;
        this.f753e = obj;
        this.f754i = obj2;
        this.f755l = obj3;
    }
}
