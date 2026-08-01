package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.onesignal.common.AndroidUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qb.k;
import qb.m;
import wd.p;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements fc.b, com.onesignal.notifications.internal.a {
    private final rb.a _analyticsTracker;
    private final ea.f _applicationService;
    private final tb.a _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final ja.c _deviceService;
    private final oc.a _influenceManager;
    private final jc.b _receiveReceiptWorkManager;
    private final dd.b _subscriptionManager;
    private final sa.a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final s unprocessedOpenedNotifs;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.i implements Function2 {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ z $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar, Activity activity, JSONObject jSONObject, ld.a aVar) {
            super(2, aVar);
            this.$canOpen = zVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            c cVar = new c(this.$canOpen, this.$activity, this.$data, aVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fc.a aVar, ld.a aVar2) {
            return ((c) create(aVar, aVar2)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            z zVar;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                fc.a aVar2 = (fc.a) this.L$0;
                z zVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = zVar2;
                this.label = 1;
                obj = aVar2.canOpenNotification(activity, jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                zVar = zVar2;
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (z) this.L$0;
                cf.c.M(obj);
            }
            zVar.f10164d = ((Boolean) obj).booleanValue();
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.i implements Function2 {
        final /* synthetic */ z $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z zVar, JSONObject jSONObject, ld.a aVar) {
            super(2, aVar);
            this.$canReceive = zVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            e eVar = new e(this.$canReceive, this.$jsonPayload, aVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fc.a aVar, ld.a aVar2) {
            return ((e) create(aVar, aVar2)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            z zVar;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                fc.a aVar2 = (fc.a) this.L$0;
                z zVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = zVar2;
                this.label = 1;
                obj = aVar2.canReceiveNotification(jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                zVar = zVar2;
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (z) this.L$0;
                cf.c.M(obj);
            }
            zVar.f10164d = ((Boolean) obj).booleanValue();
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends nd.i implements Function1 {
        final /* synthetic */ String $appId;
        final /* synthetic */ ja.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3, ja.a aVar, ld.a aVar2) {
            super(1, aVar2);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new i(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((i) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    cf.c.M(obj);
                    tb.a aVar2 = a.this._backend;
                    String str = this.$appId;
                    String str2 = this.$notificationId;
                    String str3 = this.$subscriptionId;
                    ja.a aVar3 = this.$deviceType;
                    this.label = 1;
                    if (aVar2.updateNotificationAsOpened(str, str2, str3, aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
            } catch (z9.a e2) {
                com.onesignal.debug.internal.logging.b.error$default("Notification opened confirmation failed with statusCode: " + e2.getStatusCode() + " response: " + e2.getResponse(), null, 2, null);
            }
            return Unit.f5554a;
        }
    }

    public a(ea.f fVar, sa.a aVar, com.onesignal.core.internal.config.b bVar, oc.a aVar2, dd.b bVar2, ja.c cVar, tb.a aVar3, jc.b bVar3, rb.a aVar4) {
        fVar.getClass();
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        bVar3.getClass();
        aVar4.getClass();
        this._applicationService = fVar;
        this._time = aVar;
        this._configModelStore = bVar;
        this._influenceManager = aVar2;
        this._subscriptionManager = bVar2;
        this._deviceService = cVar;
        this._backend = aVar3;
        this._receiveReceiptWorkManager = bVar3;
        this._analyticsTracker = aVar4;
        this.intLifecycleCallback = new com.onesignal.common.events.a();
        this.extRemoteReceivedCallback = new com.onesignal.common.events.a();
        this.extWillShowInForegroundCallback = new com.onesignal.common.events.b();
        this.extOpenedCallback = new com.onesignal.common.events.b();
        this.unprocessedOpenedNotifs = new s();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(fVar.getAppContext());
    }

    private final String getLatestNotificationId(JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            obj.getClass();
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return bc.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return bc.f.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    @Override // fc.b
    public void addExternalClickListener(qb.h hVar) {
        hVar.getClass();
        this.extOpenedCallback.subscribe(hVar);
        if (this.extOpenedCallback.getHasSubscribers()) {
            s sVar = this.unprocessedOpenedNotifs;
            sVar.getClass();
            if (sVar.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new C0055a(bc.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
        }
    }

    @Override // fc.b
    public void addExternalForegroundLifecycleListener(qb.j jVar) {
        jVar.getClass();
        this.extWillShowInForegroundCallback.subscribe(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // fc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, ld.a aVar) {
        b bVar;
        int i3;
        z zVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    z zVar2 = new z();
                    zVar2.f10164d = true;
                    com.onesignal.common.events.a aVar3 = this.intLifecycleCallback;
                    c cVar = new c(zVar2, activity, jSONObject, null);
                    bVar.L$0 = zVar2;
                    bVar.label = 1;
                    if (aVar3.suspendingFire(cVar, bVar) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) bVar.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // fc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, ld.a aVar) {
        d dVar;
        int i3;
        z zVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = dVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    z zVar2 = new z();
                    zVar2.f10164d = true;
                    com.onesignal.common.events.a aVar3 = this.intLifecycleCallback;
                    e eVar = new e(zVar2, jSONObject, null);
                    dVar.L$0 = zVar2;
                    dVar.label = 1;
                    if (aVar3.suspendingFire(eVar, dVar) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) dVar.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        dVar = new d(aVar);
        Object obj2 = dVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = dVar.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    @Override // fc.b
    public void externalNotificationWillShowInForeground(m mVar) {
        mVar.getClass();
        this.extWillShowInForegroundCallback.fire(new f(mVar));
    }

    @Override // fc.b
    public void externalRemoteNotificationReceived(k kVar) {
        kVar.getClass();
        this.extRemoteReceivedCallback.fire(new g(kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // fc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, ld.a aVar) {
        h hVar;
        int i3;
        a aVar2;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = hVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                    ja.a deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String oSNotificationIdFromJson = bc.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i11));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            com.onesignal.common.threading.a.INSTANCE.execute(new i(str, oSNotificationIdFromJson, id2, deviceType, null));
                        }
                    }
                    bc.e eVar = bc.e.INSTANCE;
                    com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    rb.a aVar4 = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    notificationId.getClass();
                    aVar4.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(ea.b.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    hVar.L$0 = this;
                    hVar.L$1 = jSONArray;
                    hVar.label = 1;
                    if (openDestinationActivity(activity, jSONArray, hVar) == aVar3) {
                        return aVar3;
                    }
                    aVar2 = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jSONArray = (JSONArray) hVar.L$1;
                    aVar2 = (a) hVar.L$0;
                    cf.c.M(obj);
                }
                if (aVar2.extOpenedCallback.getHasSubscribers()) {
                    aVar2.unprocessedOpenedNotifs.addLast(jSONArray);
                } else {
                    aVar2.extOpenedCallback.fireOnMain(new j(bc.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, aVar2._time)));
                }
                return Unit.f5554a;
            }
        }
        hVar = new h(aVar);
        Object obj2 = hVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = hVar.label;
        if (i3 != 0) {
        }
        if (aVar2.extOpenedCallback.getHasSubscribers()) {
        }
        return Unit.f5554a;
    }

    @Override // fc.b
    public Object notificationReceived(bc.d dVar, ld.a aVar) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            bc.e eVar = bc.e.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.f.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            rb.a aVar2 = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            notificationId.getClass();
            aVar2.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return Unit.f5554a;
    }

    @Override // com.onesignal.notifications.internal.a
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, ld.a aVar) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            bc.b bVar = bc.b.INSTANCE;
            jSONObject.getClass();
            Intent intentVisible = bVar.create(activity, jSONObject).getIntentVisible();
            if (intentVisible != null) {
                com.onesignal.debug.internal.logging.b.info$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                activity.startActivity(intentVisible);
            } else {
                com.onesignal.debug.internal.logging.b.info$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
            }
        } catch (ActivityNotFoundException e2) {
            com.onesignal.debug.internal.logging.b.error$default("No activity found to handle notification open intent.", null, 2, null);
            e2.printStackTrace();
        } catch (JSONException e9) {
            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON to open notification activity.", null, 2, null);
            e9.printStackTrace();
        } catch (Exception e10) {
            com.onesignal.debug.internal.logging.b.error$default("Could not open notification activity.", null, 2, null);
            e10.printStackTrace();
        }
        return Unit.f5554a;
    }

    @Override // fc.b
    public void removeExternalClickListener(qb.h hVar) {
        hVar.getClass();
        this.extOpenedCallback.unsubscribe(hVar);
    }

    @Override // fc.b
    public void removeExternalForegroundLifecycleListener(qb.j jVar) {
        jVar.getClass();
        this.extWillShowInForegroundCallback.unsubscribe(jVar);
    }

    @Override // fc.b
    public void setInternalNotificationLifecycleCallback(fc.a aVar) {
        this.intLifecycleCallback.set(aVar);
    }

    public final void setupNotificationServiceExtension(Context context) {
        context.getClass();
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(l.g("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (IllegalAccessException e9) {
            e9.printStackTrace();
        } catch (InstantiationException e10) {
            e10.printStackTrace();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0055a extends p implements Function1 {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0055a(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((qb.h) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(qb.h hVar) {
            hVar.getClass();
            hVar.a();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends p implements Function1 {
        final /* synthetic */ m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((qb.j) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(qb.j jVar) {
            jVar.getClass();
            jVar.a();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends p implements Function1 {
        final /* synthetic */ k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((qb.l) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(qb.l lVar) {
            lVar.getClass();
            lVar.a();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends p implements Function1 {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((qb.h) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(qb.h hVar) {
            hVar.getClass();
            hVar.a();
        }
    }
}
