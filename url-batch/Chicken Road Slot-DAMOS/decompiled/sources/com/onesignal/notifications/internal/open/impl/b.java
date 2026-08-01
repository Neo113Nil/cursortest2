package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import bc.e;
import com.onesignal.common.f;
import e3.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements hc.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final cc.d _dataController;
    private final fc.b _lifecycleService;
    private final mc.a _summaryManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0057b extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0057b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(mc.a aVar, cc.d dVar, com.onesignal.core.internal.config.b bVar, fc.b bVar2) {
        aVar.getClass();
        dVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._summaryManager = aVar;
        this._dataController = dVar;
        this._configModelStore = bVar;
        this._lifecycleService = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[LOOP:0: B:11:0x0048->B:13:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, ld.a aVar) {
        a aVar2;
        int i3;
        Iterator it;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    cc.d dVar = this._dataController;
                    aVar2.L$0 = jSONArray;
                    aVar2.label = 1;
                    obj = dVar.listNotificationsForGroup(str, aVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jSONArray = (JSONArray) aVar2.L$0;
                    cf.c.M(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((cc.c) it.next()).getFullData()));
                }
                return Unit.f5554a;
            }
        }
        aVar2 = new a(aVar);
        Object obj2 = aVar2.result;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, ld.a aVar) {
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, aVar);
            return clearNotificationOnSummaryClick == md.a.f6622d ? clearNotificationOnSummaryClick : Unit.f5554a;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return Unit.f5554a;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            context.getClass();
            t tVar = new t(context);
            tVar.f3851b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z10, ld.a aVar) {
        C0057b c0057b;
        int i3;
        b bVar;
        String str;
        if (aVar instanceof C0057b) {
            c0057b = (C0057b) aVar;
            int i10 = c0057b.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0057b.label = i10 - Integer.MIN_VALUE;
                C0057b c0057b2 = c0057b;
                Object obj = c0057b2.result;
                md.a aVar2 = md.a.f6622d;
                i3 = c0057b2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    c0057b2.L$0 = this;
                    c0057b2.L$1 = intent;
                    c0057b2.L$2 = stringExtra;
                    c0057b2.Z$0 = z10;
                    c0057b2.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, c0057b2) != aVar2) {
                        bVar = this;
                        str = stringExtra;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z10 = c0057b2.Z$0;
                String str2 = (String) c0057b2.L$2;
                intent = (Intent) c0057b2.L$1;
                bVar = (b) c0057b2.L$0;
                cf.c.M(obj);
                str = str2;
                boolean z11 = z10;
                cc.d dVar = bVar._dataController;
                int intExtra = intent.getIntExtra("androidNotificationId", 0);
                boolean clearGroupOnSummaryClick = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
                c0057b2.L$0 = null;
                c0057b2.L$1 = null;
                c0057b2.L$2 = null;
                c0057b2.label = 2;
            }
        }
        c0057b = new C0057b(aVar);
        C0057b c0057b22 = c0057b;
        Object obj2 = c0057b22.result;
        md.a aVar22 = md.a.f6622d;
        i3 = c0057b22.label;
        if (i3 != 0) {
        }
        boolean z112 = z10;
        cc.d dVar2 = bVar._dataController;
        int intExtra2 = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick2 = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
        c0057b22.L$0 = null;
        c0057b22.L$1 = null;
        c0057b22.L$2 = null;
        c0057b22.label = 2;
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
            return contentValues;
        }
        contentValues.put("opened", (Integer) 1);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0163, code lost:
    
        if (r9._lifecycleService.notificationOpened((android.app.Activity) r8, r13, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, ld.a aVar) {
        c cVar;
        md.a aVar2;
        int i3;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.onesignal.notifications.internal.open.impl.a aVar3;
        Object processToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar4;
        b bVar2;
        Context context2;
        boolean z10;
        String str;
        String stringExtra2;
        mc.a aVar5;
        Intent intent3;
        Context context3;
        b bVar3;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                aVar2 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    stringExtra = intent.getStringExtra("summary");
                    booleanExtra = intent.getBooleanExtra("dismissed", false);
                    if (!booleanExtra) {
                        cVar.L$0 = this;
                        cVar.L$1 = context;
                        cVar.L$2 = intent;
                        cVar.L$3 = stringExtra;
                        cVar.Z$0 = booleanExtra;
                        cVar.label = 1;
                        processToOpenIntent = processToOpenIntent(context, intent, stringExtra, cVar);
                        if (processToOpenIntent != aVar2) {
                            bVar = this;
                        }
                        return aVar2;
                    }
                    bVar = this;
                    aVar3 = null;
                    cVar.L$0 = bVar;
                    cVar.L$1 = context;
                    cVar.L$2 = intent;
                    cVar.L$3 = stringExtra;
                    cVar.L$4 = aVar3;
                    cVar.Z$0 = booleanExtra;
                    cVar.label = 2;
                    if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar2) {
                        com.onesignal.notifications.internal.open.impl.a aVar6 = aVar3;
                        intent2 = intent;
                        aVar4 = aVar6;
                        bVar2 = bVar;
                        context2 = context;
                        z10 = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            aVar5 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar4;
                            cVar.L$4 = null;
                            cVar.Z$0 = z10;
                            cVar.label = 3;
                            if (aVar5.updateSummaryNotificationAfterChildRemoved(stringExtra2, z10, cVar) != aVar2) {
                            }
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z10) {
                        }
                        return Unit.f5554a;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        z10 = cVar.Z$0;
                        aVar4 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                        str = (String) cVar.L$3;
                        intent2 = (Intent) cVar.L$2;
                        context2 = (Context) cVar.L$1;
                        bVar2 = (b) cVar.L$0;
                        cf.c.M(obj);
                        if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                            aVar5 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar4;
                            cVar.L$4 = null;
                            cVar.Z$0 = z10;
                            cVar.label = 3;
                            if (aVar5.updateSummaryNotificationAfterChildRemoved(stringExtra2, z10, cVar) != aVar2) {
                                intent3 = intent2;
                                context3 = context2;
                                bVar3 = bVar2;
                                context2 = context3;
                                bVar2 = bVar3;
                                intent2 = intent3;
                            }
                            return aVar2;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z10) {
                        }
                        return Unit.f5554a;
                    }
                    if (i3 != 3) {
                        if (i3 == 4) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z10 = cVar.Z$0;
                    aVar4 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                    intent3 = (Intent) cVar.L$2;
                    context3 = (Context) cVar.L$1;
                    bVar3 = (b) cVar.L$0;
                    cf.c.M(obj);
                    context2 = context3;
                    bVar2 = bVar3;
                    intent2 = intent3;
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z10) {
                        if (context2 instanceof Activity) {
                            aVar4.getClass();
                            JSONArray dataArray = aVar4.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        }
                    }
                    return Unit.f5554a;
                }
                boolean z11 = cVar.Z$0;
                String str2 = (String) cVar.L$3;
                Intent intent4 = (Intent) cVar.L$2;
                Context context4 = (Context) cVar.L$1;
                bVar = (b) cVar.L$0;
                cf.c.M(obj);
                booleanExtra = z11;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                aVar3 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
                if (aVar3 == null) {
                    return Unit.f5554a;
                }
                cVar.L$0 = bVar;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar3;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar2) {
                }
                return aVar2;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        aVar2 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 != 0) {
        }
        aVar3 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
        if (aVar3 == null) {
        }
        cVar.L$0 = bVar;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar3;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar2) {
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, ld.a aVar) {
        d dVar;
        Object obj;
        int i3;
        b bVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
                obj = dVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = dVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
                        try {
                        } catch (JSONException e2) {
                            e = e2;
                            bVar = this;
                            jSONObject = jSONObject2;
                            e.printStackTrace();
                            jSONArray = null;
                            if (str != null) {
                            }
                            jSONArray.getClass();
                            jSONObject.getClass();
                            return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                        }
                    } catch (JSONException e9) {
                        e = e9;
                        bVar = this;
                        jSONObject = null;
                    }
                    if (context instanceof Activity) {
                        dVar.L$0 = this;
                        dVar.L$1 = intent;
                        dVar.L$2 = str;
                        dVar.L$3 = jSONObject2;
                        dVar.label = 1;
                        Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, dVar);
                        if (canOpenNotification != aVar2) {
                            obj = canOpenNotification;
                            jSONObject = jSONObject2;
                            bVar = this;
                        }
                        return aVar2;
                    }
                    com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                    bVar = this;
                    jSONObject = jSONObject2;
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    if (str != null) {
                        jSONArray.getClass();
                        dVar.L$0 = jSONArray;
                        dVar.L$1 = jSONObject;
                        dVar.L$2 = null;
                        dVar.L$3 = null;
                        dVar.label = 2;
                    }
                    jSONArray.getClass();
                    jSONObject.getClass();
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jSONObject = (JSONObject) dVar.L$1;
                    jSONArray = (JSONArray) dVar.L$0;
                    cf.c.M(obj);
                    jSONArray.getClass();
                    jSONObject.getClass();
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) dVar.L$3;
                str = (String) dVar.L$2;
                intent = (Intent) dVar.L$1;
                bVar = (b) dVar.L$0;
                try {
                    cf.c.M(obj);
                } catch (JSONException e10) {
                    e = e10;
                    e.printStackTrace();
                    jSONArray = null;
                    if (str != null) {
                    }
                    jSONArray.getClass();
                    jSONObject.getClass();
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                intent.putExtra("onesignalData", jSONObject.toString());
                jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                if (str != null) {
                }
                jSONArray.getClass();
                jSONObject.getClass();
                return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
            }
        }
        dVar = new d(aVar);
        obj = dVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = dVar.label;
        if (i3 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
        }
        jSONArray.getClass();
        jSONObject.getClass();
        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
    }

    @Override // hc.a
    public Object processFromContext(Context context, Intent intent, ld.a aVar) {
        if (!isOneSignalIntent(intent)) {
            return Unit.f5554a;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, aVar);
        return processIntent == md.a.f6622d ? processIntent : Unit.f5554a;
    }
}
