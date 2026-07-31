package com.onesignal.notifications.internal.open.impl;

import Q2.e;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.common.f;
import java.util.Iterator;
import java.util.List;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import t.C0639F;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class b implements W2.a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final R2.d _dataController;
    private final U2.b _lifecycleService;
    private final b3.a _summaryManager;

    public static final class a extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.addChildNotifications(null, null, this);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b, reason: collision with other inner class name */
    public static final class C0065b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0065b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processIntent(null, null, this);
        }
    }

    public static final class d extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processToOpenIntent(null, null, null, this);
        }
    }

    public b(b3.a _summaryManager, R2.d _dataController, com.onesignal.core.internal.config.c _configModelStore, U2.b _lifecycleService) {
        i.e(_summaryManager, "_summaryManager");
        i.e(_dataController, "_dataController");
        i.e(_configModelStore, "_configModelStore");
        i.e(_lifecycleService, "_lifecycleService");
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
    public final Object addChildNotifications(JSONArray jSONArray, String str, InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        Iterator it;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    R2.d dVar = this._dataController;
                    aVar.L$0 = jSONArray;
                    aVar.label = 1;
                    obj = dVar.listNotificationsForGroup(str, aVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) aVar.L$0;
                    AbstractC0676f.w(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((R2.c) it.next()).getFullData()));
                }
                return v.f5219a;
            }
        }
        aVar = new a(interfaceC0564d);
        Object obj2 = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        if (i7 != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f5219a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, InterfaceC0564d interfaceC0564d) {
        v vVar = v.f5219a;
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, interfaceC0564d);
            return clearNotificationOnSummaryClick == EnumC0580a.f5697f ? clearNotificationOnSummaryClick : vVar;
        }
        e eVar = e.INSTANCE;
        if (eVar.getGrouplessNotifsCount(context) < 1) {
            eVar.getNotificationManager(context).cancel(e.GROUPLESS_SUMMARY_ID);
        }
        return vVar;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            i.b(context);
            C0639F c0639f = new C0639F(context);
            c0639f.f5902b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
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
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z5, InterfaceC0564d interfaceC0564d) {
        C0065b c0065b;
        int i7;
        b bVar;
        String str;
        if (interfaceC0564d instanceof C0065b) {
            c0065b = (C0065b) interfaceC0564d;
            int i8 = c0065b.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0065b.label = i8 - Integer.MIN_VALUE;
                C0065b c0065b2 = c0065b;
                Object obj = c0065b2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0065b2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    c0065b2.L$0 = this;
                    c0065b2.L$1 = intent;
                    c0065b2.L$2 = stringExtra;
                    c0065b2.Z$0 = z5;
                    c0065b2.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, c0065b2) != enumC0580a) {
                        bVar = this;
                        str = stringExtra;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return v.f5219a;
                }
                z5 = c0065b2.Z$0;
                String str2 = (String) c0065b2.L$2;
                intent = (Intent) c0065b2.L$1;
                bVar = (b) c0065b2.L$0;
                AbstractC0676f.w(obj);
                str = str2;
                boolean z6 = z5;
                R2.d dVar = bVar._dataController;
                int intExtra = intent.getIntExtra("androidNotificationId", 0);
                boolean clearGroupOnSummaryClick = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
                c0065b2.L$0 = null;
                c0065b2.L$1 = null;
                c0065b2.L$2 = null;
                c0065b2.label = 2;
            }
        }
        c0065b = new C0065b(interfaceC0564d);
        C0065b c0065b22 = c0065b;
        Object obj2 = c0065b22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0065b22.label;
        if (i7 != 0) {
        }
        boolean z62 = z5;
        R2.d dVar2 = bVar._dataController;
        int intExtra2 = intent.getIntExtra("androidNotificationId", 0);
        boolean clearGroupOnSummaryClick2 = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getClearGroupOnSummaryClick();
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
    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, InterfaceC0564d interfaceC0564d) {
        c cVar;
        EnumC0580a enumC0580a;
        int i7;
        String stringExtra;
        boolean booleanExtra;
        b bVar;
        com.onesignal.notifications.internal.open.impl.a aVar;
        Object processToOpenIntent;
        Intent intent2;
        com.onesignal.notifications.internal.open.impl.a aVar2;
        b bVar2;
        Context context2;
        boolean z5;
        String str;
        String stringExtra2;
        b3.a aVar3;
        Intent intent3;
        Context context3;
        b bVar3;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                v vVar = v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
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
                        if (processToOpenIntent != enumC0580a) {
                            bVar = this;
                        }
                        return enumC0580a;
                    }
                    bVar = this;
                    aVar = null;
                    cVar.L$0 = bVar;
                    cVar.L$1 = context;
                    cVar.L$2 = intent;
                    cVar.L$3 = stringExtra;
                    cVar.L$4 = aVar;
                    cVar.Z$0 = booleanExtra;
                    cVar.label = 2;
                    if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != enumC0580a) {
                        com.onesignal.notifications.internal.open.impl.a aVar4 = aVar;
                        intent2 = intent;
                        aVar2 = aVar4;
                        bVar2 = bVar;
                        context2 = context;
                        z5 = booleanExtra;
                        str = stringExtra;
                        if (str == null) {
                            aVar3 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar2;
                            cVar.L$4 = null;
                            cVar.Z$0 = z5;
                            cVar.label = 3;
                            if (aVar3.updateSummaryNotificationAfterChildRemoved(stringExtra2, z5, cVar) != enumC0580a) {
                            }
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z5) {
                        }
                        return vVar;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        z5 = cVar.Z$0;
                        aVar2 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$4;
                        str = (String) cVar.L$3;
                        intent2 = (Intent) cVar.L$2;
                        context2 = (Context) cVar.L$1;
                        bVar2 = (b) cVar.L$0;
                        AbstractC0676f.w(obj);
                        if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                            aVar3 = bVar2._summaryManager;
                            cVar.L$0 = bVar2;
                            cVar.L$1 = context2;
                            cVar.L$2 = intent2;
                            cVar.L$3 = aVar2;
                            cVar.L$4 = null;
                            cVar.Z$0 = z5;
                            cVar.label = 3;
                            if (aVar3.updateSummaryNotificationAfterChildRemoved(stringExtra2, z5, cVar) != enumC0580a) {
                                intent3 = intent2;
                                context3 = context2;
                                bVar3 = bVar2;
                                context2 = context3;
                                bVar2 = bVar3;
                                intent2 = intent3;
                            }
                            return enumC0580a;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z5) {
                        }
                        return vVar;
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return vVar;
                    }
                    z5 = cVar.Z$0;
                    aVar2 = (com.onesignal.notifications.internal.open.impl.a) cVar.L$3;
                    intent3 = (Intent) cVar.L$2;
                    context3 = (Context) cVar.L$1;
                    bVar3 = (b) cVar.L$0;
                    AbstractC0676f.w(obj);
                    context2 = context3;
                    bVar2 = bVar3;
                    intent2 = intent3;
                    com.onesignal.debug.internal.logging.b.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                    if (intent2.getExtras() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                    }
                    if (!z5) {
                        if (context2 instanceof Activity) {
                            i.b(aVar2);
                            JSONArray dataArray = aVar2.getDataArray();
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.L$3 = null;
                            cVar.L$4 = null;
                            cVar.label = 4;
                            if (bVar2._lifecycleService.notificationOpened((Activity) context2, dataArray, cVar) == enumC0580a) {
                                return enumC0580a;
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                        }
                    }
                    return vVar;
                }
                boolean z6 = cVar.Z$0;
                String str2 = (String) cVar.L$3;
                Intent intent4 = (Intent) cVar.L$2;
                Context context4 = (Context) cVar.L$1;
                bVar = (b) cVar.L$0;
                AbstractC0676f.w(obj);
                booleanExtra = z6;
                context = context4;
                processToOpenIntent = obj;
                stringExtra = str2;
                intent = intent4;
                aVar = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
                if (aVar == null) {
                    return vVar;
                }
                cVar.L$0 = bVar;
                cVar.L$1 = context;
                cVar.L$2 = intent;
                cVar.L$3 = stringExtra;
                cVar.L$4 = aVar;
                cVar.Z$0 = booleanExtra;
                cVar.label = 2;
                if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != enumC0580a) {
                }
                return enumC0580a;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        enumC0580a = EnumC0580a.f5697f;
        i7 = cVar.label;
        v vVar2 = v.f5219a;
        if (i7 != 0) {
        }
        aVar = (com.onesignal.notifications.internal.open.impl.a) processToOpenIntent;
        if (aVar == null) {
        }
        cVar.L$0 = bVar;
        cVar.L$1 = context;
        cVar.L$2 = intent;
        cVar.L$3 = stringExtra;
        cVar.L$4 = aVar;
        cVar.Z$0 = booleanExtra;
        cVar.label = 2;
        if (bVar.markNotificationsConsumed(context, intent, booleanExtra, cVar) != enumC0580a) {
        }
        return enumC0580a;
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
    public final Object processToOpenIntent(Context context, Intent intent, String str, InterfaceC0564d interfaceC0564d) {
        d dVar;
        Object obj;
        int i7;
        b bVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (interfaceC0564d instanceof d) {
            dVar = (d) interfaceC0564d;
            int i8 = dVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.label = i8 - Integer.MIN_VALUE;
                obj = dVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = dVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra("onesignalData"));
                    } catch (JSONException e4) {
                        e = e4;
                        bVar = this;
                        jSONObject = null;
                    }
                    try {
                    } catch (JSONException e7) {
                        e = e7;
                        bVar = this;
                        jSONObject = jSONObject2;
                        e.printStackTrace();
                        jSONArray = null;
                        if (str != null) {
                        }
                        i.b(jSONArray);
                        i.b(jSONObject);
                        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                    }
                    if (context instanceof Activity) {
                        dVar.L$0 = this;
                        dVar.L$1 = intent;
                        dVar.L$2 = str;
                        dVar.L$3 = jSONObject2;
                        dVar.label = 1;
                        Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, dVar);
                        if (canOpenNotification != enumC0580a) {
                            obj = canOpenNotification;
                            jSONObject = jSONObject2;
                            bVar = this;
                        }
                        return enumC0580a;
                    }
                    com.onesignal.debug.internal.logging.b.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                    bVar = this;
                    jSONObject = jSONObject2;
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    if (str != null) {
                        i.b(jSONArray);
                        dVar.L$0 = jSONArray;
                        dVar.L$1 = jSONObject;
                        dVar.L$2 = null;
                        dVar.L$3 = null;
                        dVar.label = 2;
                    }
                    i.b(jSONArray);
                    i.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONObject = (JSONObject) dVar.L$1;
                    jSONArray = (JSONArray) dVar.L$0;
                    AbstractC0676f.w(obj);
                    i.b(jSONArray);
                    i.b(jSONObject);
                    return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
                }
                jSONObject = (JSONObject) dVar.L$3;
                str = (String) dVar.L$2;
                intent = (Intent) dVar.L$1;
                bVar = (b) dVar.L$0;
                try {
                    AbstractC0676f.w(obj);
                } catch (JSONException e8) {
                    e = e8;
                    e.printStackTrace();
                    jSONArray = null;
                    if (str != null) {
                    }
                    i.b(jSONArray);
                    i.b(jSONObject);
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
                i.b(jSONArray);
                i.b(jSONObject);
                return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
            }
        }
        dVar = new d(interfaceC0564d);
        obj = dVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = dVar.label;
        if (i7 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
        intent.putExtra("onesignalData", jSONObject.toString());
        jSONArray = f.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
        if (str != null) {
        }
        i.b(jSONArray);
        i.b(jSONObject);
        return new com.onesignal.notifications.internal.open.impl.a(jSONArray, jSONObject);
    }

    @Override // W2.a
    public Object processFromContext(Context context, Intent intent, InterfaceC0564d interfaceC0564d) {
        boolean isOneSignalIntent = isOneSignalIntent(intent);
        v vVar = v.f5219a;
        if (!isOneSignalIntent) {
            return vVar;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, interfaceC0564d);
        return processIntent == EnumC0580a.f5697f ? processIntent : vVar;
    }
}
