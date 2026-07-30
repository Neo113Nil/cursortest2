package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.common.f;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;
import t3.C0928c;
import y.t;
import y3.InterfaceC1028a;

/* loaded from: classes.dex */
public final class b implements InterfaceC1028a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final t3.d _dataController;
    private final w3.b _lifecycleService;
    private final D3.a _summaryManager;

    public static final class a extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0065b extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0065b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    public static final class d extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(D3.a _summaryManager, t3.d _dataController, com.onesignal.core.internal.config.c _configModelStore, w3.b _lifecycleService) {
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._summaryManager = _summaryManager;
        this._dataController = _dataController;
        this._configModelStore = _configModelStore;
        this._lifecycleService = _lifecycleService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[LOOP:0: B:11:0x0049->B:13:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, V5.b bVar) {
        a aVar;
        int i2;
        Iterator it;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    t3.d dVar = this._dataController;
                    aVar.L$0 = jSONArray;
                    aVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) aVar.L$0;
                    V6.b.P(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((C0928c) it.next()).getFullData()));
                }
                return Unit.f6114a;
            }
        }
        aVar = new a(bVar);
        Object obj2 = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, V5.b bVar) {
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, bVar);
            return clearNotificationOnSummaryClick == W5.a.f2787d ? clearNotificationOnSummaryClick : Unit.f6114a;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return Unit.f6114a;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            Intrinsics.b(context);
            t tVar = new t(context);
            tVar.f8521b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z7, V5.b bVar) {
        C0065b c0065b;
        int i2;
        b bVar2;
        String str;
        if (bVar instanceof C0065b) {
            c0065b = (C0065b) bVar;
            int i5 = c0065b.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0065b.label = i5 - Integer.MIN_VALUE;
                C0065b c0065b2 = c0065b;
                Object obj = c0065b2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0065b2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    c0065b2.L$0 = this;
                    c0065b2.L$1 = intent;
                    c0065b2.L$2 = stringExtra;
                    c0065b2.Z$0 = z7;
                    c0065b2.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, c0065b2) != aVar) {
                        bVar2 = this;
                        str = stringExtra;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                z7 = c0065b2.Z$0;
                String str2 = (String) c0065b2.L$2;
                intent = (Intent) c0065b2.L$1;
                bVar2 = (b) c0065b2.L$0;
                V6.b.P(obj);
                str = str2;
                boolean z8 = z7;
                t3.d dVar = bVar2._dataController;
                int intExtra = intent.getIntExtra("androidNotificationId", 0);
                boolean clearGroupOnSummaryClick = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getClearGroupOnSummaryClick();
                c0065b2.L$0 = null;
                c0065b2.L$1 = null;
                c0065b2.L$2 = null;
                c0065b2.label = 2;
            }
        }
        c0065b = new C0065b(bVar);
        C0065b c0065b22 = c0065b;
        Object obj2 = c0065b22.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0065b22.label;
        if (i2 != 0) {
        }
        boolean z82 = z7;
        t3.d dVar2 = bVar2._dataController;
        int intExtra2 = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick2 = ((com.onesignal.core.internal.config.b) bVar2._configModelStore.getModel()).getClearGroupOnSummaryClick();
        c0065b22.L$0 = null;
        c0065b22.L$1 = null;
        c0065b22.L$2 = null;
        c0065b22.label = 2;
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
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0164, code lost:
    
        if (r9._lifecycleService.notificationOpened((android.app.Activity) r8, r13, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, V5.b bVar) {
        c cVar;
        W5.a aVar;
        int i2;
        String stringExtra;
        boolean booleanExtra;
        b bVar2;
        com.onesignal.notifications.internal.open.impl.a aVar2;
        Object processToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar3;
        b bVar3;
        Context context2;
        boolean z7;
        String str;
        String stringExtra2;
        D3.a aVar4;
        Intent intent3;
        Context context3;
        b bVar4;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                aVar = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
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
                        if (processToOpenIntent != aVar) {
                            bVar2 = this;
                        }
                        return aVar;
                    }
                    bVar2 = this;
                    aVar2 = null;
                    cVar.L$0 = bVar2;
                    cVar.L$1 = context;
                    cVar.L$2 = intent;
                    cVar.L$3 = stringExtra;
                    cVar.L$4 = aVar2;
                    cVar.Z$0 = booleanExtra;
                    cVar.label = 2;
                    if (bVar2.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar) {
                        com.onesignal.notifications.internal.open.impl.a aVar5 = aVar2;
                        intent2 = intent;
                        aVar3 = aVar5;
                        bVar3 = bVar2;
                        context2 = context;
                        z7 = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            aVar4 = bVar3._summaryManager;
                            cVar.L$0 = bVar3;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar3;
                            cVar.L$4 = null;
                            cVar.Z$0 = z7;
                            cVar.label = 3;
                            if (aVar4.updateSummaryNotificationAfterChildRemoved(stringExtra2, z7, cVar) != aVar) {
                            }
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z7) {
                        }
                        return Unit.f6114a;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        z7 = cVar.Z$0;
                        aVar3 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                        str = (String) cVar.L$3;
                        intent2 = (Intent) cVar.L$2;
                        context2 = (Context) cVar.L$1;
                        bVar3 = (b) cVar.L$0;
                        V6.b.P(obj);
                        if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                            aVar4 = bVar3._summaryManager;
                            cVar.L$0 = bVar3;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar3;
                            cVar.L$4 = null;
                            cVar.Z$0 = z7;
                            cVar.label = 3;
                            if (aVar4.updateSummaryNotificationAfterChildRemoved(stringExtra2, z7, cVar) != aVar) {
                                intent3 = intent2;
                                context3 = context2;
                                bVar4 = bVar3;
                                context2 = context3;
                                bVar3 = bVar4;
                                intent2 = intent3;
                            }
                            return aVar;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z7) {
                        }
                        return Unit.f6114a;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    z7 = cVar.Z$0;
                    aVar3 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                    intent3 = (Intent) cVar.L$2;
                    context3 = (Context) cVar.L$1;
                    bVar4 = (b) cVar.L$0;
                    V6.b.P(obj);
                    context2 = context3;
                    bVar3 = bVar4;
                    intent2 = intent3;
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z7) {
                        if (context2 instanceof Activity) {
                            Intrinsics.b(aVar3);
                            JSONArray dataArray = aVar3.getDataArray();
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
                    return Unit.f6114a;
                }
                boolean z8 = cVar.Z$0;
                String str2 = (String) cVar.L$3;
                Intent intent4 = (Intent) cVar.L$2;
                Context context4 = (Context) cVar.L$1;
                bVar2 = (b) cVar.L$0;
                V6.b.P(obj);
                booleanExtra = z8;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                aVar2 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
                if (aVar2 == null) {
                    return Unit.f6114a;
                }
                cVar.L$0 = bVar2;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar2;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar2.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar) {
                }
                return aVar;
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        aVar = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 != 0) {
        }
        aVar2 = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
        if (aVar2 == null) {
        }
        cVar.L$0 = bVar2;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar2;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar2.markNotificationsConsumed(context, intent, booleanExtra, cVar) != aVar) {
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, V5.b bVar) {
        d dVar;
        Object obj;
        int i2;
        b bVar2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i5 = dVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.label = i5 - Integer.MIN_VALUE;
                obj = dVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = dVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
                    } catch (JSONException e7) {
                        e = e7;
                        bVar2 = this;
                        jSONObject = null;
                    }
                    try {
                    } catch (JSONException e8) {
                        e = e8;
                        bVar2 = this;
                        jSONObject = jSONObject2;
                        e.printStackTrace();
                        jSONArray = null;
                        if (str != null) {
                        }
                        Intrinsics.b(jSONArray);
                        Intrinsics.b(jSONObject);
                        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                    }
                    if (context instanceof Activity) {
                        dVar.L$0 = this;
                        dVar.L$1 = intent;
                        dVar.L$2 = str;
                        dVar.L$3 = jSONObject2;
                        dVar.label = 1;
                        Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, dVar);
                        if (canOpenNotification != aVar) {
                            obj = canOpenNotification;
                            jSONObject = jSONObject2;
                            bVar2 = this;
                        }
                        return aVar;
                    }
                    com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                    bVar2 = this;
                    jSONObject = jSONObject2;
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    if (str != null) {
                        Intrinsics.b(jSONArray);
                        dVar.L$0 = jSONArray;
                        dVar.L$1 = jSONObject;
                        dVar.L$2 = null;
                        dVar.L$3 = null;
                        dVar.label = 2;
                    }
                    Intrinsics.b(jSONArray);
                    Intrinsics.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) dVar.L$1;
                    jSONArray = (JSONArray) dVar.L$0;
                    V6.b.P(obj);
                    Intrinsics.b(jSONArray);
                    Intrinsics.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) dVar.L$3;
                str = (String) dVar.L$2;
                intent = (Intent) dVar.L$1;
                bVar2 = (b) dVar.L$0;
                try {
                    V6.b.P(obj);
                } catch (JSONException e9) {
                    e = e9;
                    e.printStackTrace();
                    jSONArray = null;
                    if (str != null) {
                    }
                    Intrinsics.b(jSONArray);
                    Intrinsics.b(jSONObject);
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
                Intrinsics.b(jSONArray);
                Intrinsics.b(jSONObject);
                return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
            }
        }
        dVar = new d(bVar);
        obj = dVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = dVar.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
        }
        Intrinsics.b(jSONArray);
        Intrinsics.b(jSONObject);
        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
    }

    @Override // y3.InterfaceC1028a
    public Object processFromContext(Context context, Intent intent, V5.b bVar) {
        if (!isOneSignalIntent(intent)) {
            return Unit.f6114a;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, bVar);
        return processIntent == W5.a.f2787d ? processIntent : Unit.f6114a;
    }
}
