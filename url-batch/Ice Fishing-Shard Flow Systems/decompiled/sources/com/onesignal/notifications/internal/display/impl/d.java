package com.onesignal.notifications.internal.display.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.onesignal.notifications.internal.display.impl.b;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.json.JSONObject;
import s3.e;
import t3.C0928c;
import u3.InterfaceC0945a;
import u3.InterfaceC0947c;
import v2.f;
import y.k;
import y.l;
import y.t;

/* loaded from: classes.dex */
public final class d implements InterfaceC0947c {
    private final f _applicationService;
    private final t3.d _dataController;
    private final InterfaceC0945a _notificationDisplayBuilder;

    public static final class a extends X5.c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    public static final class b extends X5.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f _applicationService, t3.d _dataController, InterfaceC0945a _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int i2, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str) {
        Intent putExtra = aVar.getNewBaseIntent(i2).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // u3.InterfaceC0947c
    public void createGenericPendingIntentsForGroup(l lVar, com.onesignal.notifications.internal.display.impl.a intentGenerator, JSONObject gcmBundle, String group, int i2) {
        Intrinsics.checkNotNullParameter(intentGenerator, "intentGenerator");
        Intrinsics.checkNotNullParameter(gcmBundle, "gcmBundle");
        Intrinsics.checkNotNullParameter(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGenerator.getNewBaseIntent(i2).putExtra("onesignalData", gcmBundle.toString()).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(nextInt, putExtra);
        Intrinsics.b(lVar);
        lVar.f8481g = newActionPendingIntent;
        InterfaceC0945a interfaceC0945a = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i2).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
        lVar.f8495v.deleteIntent = interfaceC0945a.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        lVar.f8486m = group;
        try {
            lVar.f8493t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u3.InterfaceC0947c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(s3.d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i2, int i5, V5.b bVar) {
        a aVar2;
        int i7;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        d dVar2;
        String str2;
        s3.d dVar3;
        int i8;
        if (bVar instanceof a) {
            aVar2 = (a) bVar;
            int i9 = aVar2.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i9 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i7 = aVar2.label;
                if (i7 != 0) {
                    V6.b.P(obj);
                    jsonPayload = dVar.getJsonPayload();
                    Intrinsics.b(jsonPayload);
                    secureRandom = new SecureRandom();
                    str = i2 + " new messages";
                    t3.d dVar4 = this._dataController;
                    aVar2.L$0 = this;
                    aVar2.L$1 = dVar;
                    aVar2.L$2 = aVar;
                    aVar2.L$3 = jsonPayload;
                    aVar2.L$4 = secureRandom;
                    aVar2.L$5 = e.GROUPLESS_SUMMARY_KEY;
                    aVar2.L$6 = str;
                    aVar2.I$0 = i2;
                    aVar2.I$1 = i5;
                    aVar2.I$2 = e.GROUPLESS_SUMMARY_ID;
                    aVar2.label = 1;
                    if (dVar4.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar2) == aVar3) {
                        return aVar3;
                    }
                    dVar2 = this;
                    str2 = e.GROUPLESS_SUMMARY_KEY;
                    dVar3 = dVar;
                    i8 = -718463522;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = aVar2.I$2;
                    i5 = aVar2.I$1;
                    i2 = aVar2.I$0;
                    String str3 = (String) aVar2.L$6;
                    str2 = (String) aVar2.L$5;
                    secureRandom = (SecureRandom) aVar2.L$4;
                    jsonPayload = (JSONObject) aVar2.L$3;
                    com.onesignal.notifications.internal.display.impl.a aVar4 = (com.onesignal.notifications.internal.display.impl.a) aVar2.L$2;
                    dVar3 = (s3.d) aVar2.L$1;
                    dVar2 = (d) aVar2.L$0;
                    V6.b.P(obj);
                    str = str3;
                    aVar = aVar4;
                }
                PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i8, aVar, jsonPayload, str2));
                InterfaceC0945a interfaceC0945a = dVar2._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                PendingIntent newDismissActionPendingIntent = interfaceC0945a.getNewDismissActionPendingIntent(nextInt, putExtra);
                l compatBuilder = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
                if (dVar3.getOverriddenSound() != null) {
                    Intrinsics.b(compatBuilder);
                    compatBuilder.f(dVar3.getOverriddenSound());
                }
                if (dVar3.getOverriddenFlags() != null) {
                    Intrinsics.b(compatBuilder);
                    Integer overriddenFlags = dVar3.getOverriddenFlags();
                    Intrinsics.b(overriddenFlags);
                    compatBuilder.c(overriddenFlags.intValue());
                }
                Intrinsics.b(compatBuilder);
                compatBuilder.f8481g = newActionPendingIntent;
                compatBuilder.f8495v.deleteIntent = newDismissActionPendingIntent;
                Context currentContext = dVar2.getCurrentContext();
                Intrinsics.b(currentContext);
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = dVar2.getCurrentContext();
                Intrinsics.b(currentContext2);
                compatBuilder.f8479e = l.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
                compatBuilder.f8480f = l.b(str);
                compatBuilder.f8483i = i2;
                compatBuilder.f8495v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
                compatBuilder.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
                compatBuilder.d(8, true);
                compatBuilder.d(16, false);
                compatBuilder.f8486m = str2;
                compatBuilder.f8487n = true;
                compatBuilder.f8493t = i5;
                k kVar = new k(1);
                kVar.f8498b = l.b(str);
                compatBuilder.g(kVar);
                Notification a7 = compatBuilder.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
                Context currentContext3 = dVar2.getCurrentContext();
                Intrinsics.b(currentContext3);
                new t(currentContext3).a(i8, a7);
                return Unit.f6114a;
            }
        }
        aVar2 = new a(bVar);
        Object obj2 = aVar2.result;
        W5.a aVar32 = W5.a.f2787d;
        i7 = aVar2.label;
        if (i7 != 0) {
        }
        PendingIntent newActionPendingIntent2 = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i8, aVar, jsonPayload, str2));
        InterfaceC0945a interfaceC0945a2 = dVar2._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
        PendingIntent newDismissActionPendingIntent2 = interfaceC0945a2.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        l compatBuilder2 = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
        if (dVar3.getOverriddenSound() != null) {
        }
        if (dVar3.getOverriddenFlags() != null) {
        }
        Intrinsics.b(compatBuilder2);
        compatBuilder2.f8481g = newActionPendingIntent2;
        compatBuilder2.f8495v.deleteIntent = newDismissActionPendingIntent2;
        Context currentContext4 = dVar2.getCurrentContext();
        Intrinsics.b(currentContext4);
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = dVar2.getCurrentContext();
        Intrinsics.b(currentContext22);
        compatBuilder2.f8479e = l.b(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo()));
        compatBuilder2.f8480f = l.b(str);
        compatBuilder2.f8483i = i2;
        compatBuilder2.f8495v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder2.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder2.d(8, true);
        compatBuilder2.d(16, false);
        compatBuilder2.f8486m = str2;
        compatBuilder2.f8487n = true;
        compatBuilder2.f8493t = i5;
        k kVar2 = new k(1);
        kVar2.f8498b = l.b(str);
        compatBuilder2.g(kVar2);
        Notification a72 = compatBuilder2.a();
        Intrinsics.checkNotNullExpressionValue(a72, "build(...)");
        Context currentContext32 = dVar2.getCurrentContext();
        Intrinsics.b(currentContext32);
        new t(currentContext32).a(i8, a72);
        return Unit.f6114a;
    }

    @Override // u3.InterfaceC0947c
    public Notification createSingleNotificationBeforeSummaryBuilder(s3.d notificationJob, l lVar) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        Intrinsics.b(lVar);
        Notification a7 = lVar.a();
        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
        return a7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0275, code lost:
    
        if (r10 == null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0229 A[EDGE_INSN: B:36:0x0229->B:37:0x0229 BREAK  A[LOOP:0: B:13:0x01b8->B:30:0x01b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // u3.InterfaceC0947c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(s3.d dVar, b.a aVar, int i2, V5.b bVar) {
        b bVar2;
        int i5;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        SecureRandom secureRandom;
        s3.d dVar2;
        b.a aVar3;
        int i7;
        JSONObject jSONObject;
        boolean z7;
        PendingIntent pendingIntent;
        String str;
        d dVar3;
        Integer num;
        PendingIntent pendingIntent2;
        b.a aVar4;
        JSONObject jSONObject2;
        String str2;
        s3.d dVar4;
        com.onesignal.notifications.internal.display.impl.a aVar5;
        SecureRandom secureRandom2;
        Integer num2;
        SecureRandom secureRandom3;
        s3.d dVar5;
        int i8;
        com.onesignal.notifications.internal.display.impl.a aVar6;
        b.a aVar7;
        String str3;
        Integer num3;
        boolean z8;
        d dVar6;
        int i9;
        b.a aVar8;
        Iterator it;
        boolean hasNext;
        String str4;
        PendingIntent newActionPendingIntent;
        Notification a7;
        String str5;
        String obj;
        String str6;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i10 - Integer.MIN_VALUE;
                Object obj2 = bVar2.result;
                W5.a aVar9 = W5.a.f2787d;
                i5 = bVar2.label;
                if (i5 != 0) {
                    V6.b.P(obj2);
                    boolean isRestoring = dVar.isRestoring();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    Intrinsics.b(jsonPayload);
                    Context currentContext = getCurrentContext();
                    Intrinsics.b(currentContext);
                    aVar2 = new com.onesignal.notifications.internal.display.impl.a(currentContext);
                    String optString = jsonPayload.optString("grp", null);
                    secureRandom = new SecureRandom();
                    InterfaceC0945a interfaceC0945a = this._notificationDisplayBuilder;
                    int nextInt = secureRandom.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                    PendingIntent newDismissActionPendingIntent = interfaceC0945a.getNewDismissActionPendingIntent(nextInt, putExtra);
                    t3.d dVar7 = this._dataController;
                    Intrinsics.b(optString);
                    bVar2.L$0 = this;
                    dVar2 = dVar;
                    bVar2.L$1 = dVar2;
                    aVar3 = aVar;
                    bVar2.L$2 = aVar3;
                    bVar2.L$3 = jsonPayload;
                    bVar2.L$4 = aVar2;
                    bVar2.L$5 = optString;
                    bVar2.L$6 = secureRandom;
                    bVar2.L$7 = newDismissActionPendingIntent;
                    i7 = i2;
                    bVar2.I$0 = i7;
                    bVar2.Z$0 = isRestoring;
                    bVar2.label = 1;
                    Object androidIdForGroup = dVar7.getAndroidIdForGroup(optString, true, bVar2);
                    if (androidIdForGroup != aVar9) {
                        jSONObject = jsonPayload;
                        z7 = isRestoring;
                        obj2 = androidIdForGroup;
                        pendingIntent = newDismissActionPendingIntent;
                        str = optString;
                        dVar3 = this;
                    }
                    return aVar9;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        z7 = bVar2.Z$0;
                        i8 = bVar2.I$0;
                        num3 = (Integer) bVar2.L$8;
                        pendingIntent = (PendingIntent) bVar2.L$7;
                        secureRandom3 = (SecureRandom) bVar2.L$6;
                        str3 = (String) bVar2.L$5;
                        aVar6 = (com.onesignal.notifications.internal.display.impl.a) bVar2.L$4;
                        jSONObject = (JSONObject) bVar2.L$3;
                        aVar7 = (b.a) bVar2.L$2;
                        dVar5 = (s3.d) bVar2.L$1;
                        dVar3 = (d) bVar2.L$0;
                        V6.b.P(obj2);
                        aVar4 = aVar7;
                        num2 = num3;
                        secureRandom2 = secureRandom3;
                        aVar5 = aVar6;
                        i7 = i8;
                        pendingIntent2 = pendingIntent;
                        str2 = str3;
                        jSONObject2 = jSONObject;
                        dVar4 = dVar5;
                        t3.d dVar8 = dVar3._dataController;
                        Intrinsics.b(str2);
                        bVar2.L$0 = dVar3;
                        bVar2.L$1 = dVar4;
                        bVar2.L$2 = aVar4;
                        bVar2.L$3 = jSONObject2;
                        bVar2.L$4 = aVar5;
                        bVar2.L$5 = str2;
                        bVar2.L$6 = secureRandom2;
                        bVar2.L$7 = pendingIntent2;
                        bVar2.L$8 = num2;
                        bVar2.I$0 = i7;
                        bVar2.Z$0 = z7;
                        bVar2.label = 3;
                        obj2 = dVar8.listNotificationsForGroup(str2, bVar2);
                        if (obj2 != aVar9) {
                            z8 = z7;
                            dVar6 = dVar3;
                            i9 = i7;
                            aVar8 = aVar4;
                            ArrayList arrayList = new ArrayList();
                            it = ((List) obj2).iterator();
                            String str7 = null;
                            while (true) {
                                hasNext = it.hasNext();
                                Iterator it2 = it;
                                str4 = "";
                                if (hasNext) {
                                }
                            }
                            Integer num4 = num2;
                            int nextInt2 = secureRandom2.nextInt();
                            Intrinsics.b(num4);
                            int intValue = num4.intValue();
                            Intrinsics.b(str2);
                            newActionPendingIntent = aVar5.getNewActionPendingIntent(nextInt2, dVar6.createBaseSummaryIntent(intValue, aVar5, jSONObject2, str2));
                            if (z8 != 0) {
                            }
                            Intrinsics.b(aVar8);
                            l compatBuilder = aVar8.getCompatBuilder();
                            Intrinsics.b(compatBuilder);
                            compatBuilder.f8476b.clear();
                            dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar5, compatBuilder, num4.intValue(), str2);
                            compatBuilder.f8481g = newActionPendingIntent;
                            compatBuilder.f8495v.deleteIntent = pendingIntent2;
                            compatBuilder.d(8, z8);
                            compatBuilder.d(16, false);
                            compatBuilder.f8486m = str2;
                            compatBuilder.f8487n = true;
                            compatBuilder.f8493t = i9;
                            a7 = compatBuilder.a();
                            Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
                            dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar8, a7);
                            Context currentContext2 = dVar6.getCurrentContext();
                            Intrinsics.b(currentContext2);
                            new t(currentContext2).a(num4.intValue(), a7);
                            return Unit.f6114a;
                        }
                        return aVar9;
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z9 = bVar2.Z$0;
                    i9 = bVar2.I$0;
                    num2 = (Integer) bVar2.L$8;
                    pendingIntent2 = (PendingIntent) bVar2.L$7;
                    secureRandom2 = (SecureRandom) bVar2.L$6;
                    str2 = (String) bVar2.L$5;
                    aVar5 = (com.onesignal.notifications.internal.display.impl.a) bVar2.L$4;
                    jSONObject2 = (JSONObject) bVar2.L$3;
                    aVar8 = (b.a) bVar2.L$2;
                    dVar4 = (s3.d) bVar2.L$1;
                    dVar6 = (d) bVar2.L$0;
                    V6.b.P(obj2);
                    z8 = z9;
                    ArrayList arrayList2 = new ArrayList();
                    it = ((List) obj2).iterator();
                    String str72 = null;
                    while (true) {
                        hasNext = it.hasNext();
                        Iterator it22 = it;
                        str4 = "";
                        if (hasNext) {
                            break;
                        }
                        C0928c c0928c = (C0928c) it22.next();
                        Integer num5 = num2;
                        if (z8 == 0) {
                            str6 = str72;
                            if (c0928c.getAndroidId() == dVar4.getAndroidId()) {
                                it = it22;
                                num2 = num5;
                                str72 = str6;
                            }
                        } else {
                            str6 = str72;
                        }
                        String title = c0928c.getTitle();
                        str4 = title != null ? title.concat(" ") : "";
                        SpannableString spannableString = new SpannableString(str4 + c0928c.getMessage());
                        if (str4.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                        }
                        arrayList2.add(spannableString);
                        if (str6 == null) {
                            str72 = c0928c.getFullData();
                            it = it22;
                            num2 = num5;
                        } else {
                            it = it22;
                            num2 = num5;
                            str72 = str6;
                        }
                    }
                    Integer num42 = num2;
                    int nextInt22 = secureRandom2.nextInt();
                    Intrinsics.b(num42);
                    int intValue2 = num42.intValue();
                    Intrinsics.b(str2);
                    newActionPendingIntent = aVar5.getNewActionPendingIntent(nextInt22, dVar6.createBaseSummaryIntent(intValue2, aVar5, jSONObject2, str2));
                    if ((z8 != 0 || arrayList2.size() <= 1) && (z8 != 0 || arrayList2.size() <= 0)) {
                        Intrinsics.b(aVar8);
                        l compatBuilder2 = aVar8.getCompatBuilder();
                        Intrinsics.b(compatBuilder2);
                        compatBuilder2.f8476b.clear();
                        dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar5, compatBuilder2, num42.intValue(), str2);
                        compatBuilder2.f8481g = newActionPendingIntent;
                        compatBuilder2.f8495v.deleteIntent = pendingIntent2;
                        compatBuilder2.d(8, z8);
                        compatBuilder2.d(16, false);
                        compatBuilder2.f8486m = str2;
                        compatBuilder2.f8487n = true;
                        try {
                            compatBuilder2.f8493t = i9;
                        } catch (Throwable unused) {
                        }
                        a7 = compatBuilder2.a();
                        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
                        dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar8, a7);
                    } else {
                        int size = arrayList2.size() + (!z8);
                        String safeString = com.onesignal.common.e.safeString(jSONObject2, "grp_msg");
                        if (safeString != null) {
                            str5 = p.j(safeString, "$[notif_count]", "" + size);
                        }
                        str5 = size + " new messages";
                        l compatBuilder3 = dVar6._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar4).getCompatBuilder();
                        if (z8 != 0) {
                            dVar6._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                        } else {
                            if (dVar4.getOverriddenSound() != null) {
                                Intrinsics.b(compatBuilder3);
                                compatBuilder3.f(dVar4.getOverriddenSound());
                            }
                            if (dVar4.getOverriddenFlags() != null) {
                                Intrinsics.b(compatBuilder3);
                                Integer overriddenFlags = dVar4.getOverriddenFlags();
                                Intrinsics.b(overriddenFlags);
                                compatBuilder3.c(overriddenFlags.intValue());
                            }
                        }
                        Intrinsics.b(compatBuilder3);
                        compatBuilder3.f8481g = newActionPendingIntent;
                        compatBuilder3.f8495v.deleteIntent = pendingIntent2;
                        Context currentContext3 = dVar6.getCurrentContext();
                        Intrinsics.b(currentContext3);
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = dVar6.getCurrentContext();
                        Intrinsics.b(currentContext4);
                        compatBuilder3.f8479e = l.b(packageManager.getApplicationLabel(currentContext4.getApplicationInfo()));
                        compatBuilder3.f8480f = l.b(str5);
                        compatBuilder3.f8483i = size;
                        compatBuilder3.f8495v.icon = dVar6._notificationDisplayBuilder.getDefaultSmallIconId();
                        compatBuilder3.e(dVar6._notificationDisplayBuilder.getDefaultLargeIcon());
                        compatBuilder3.d(8, z8);
                        compatBuilder3.d(16, false);
                        compatBuilder3.f8486m = str2;
                        compatBuilder3.f8487n = true;
                        try {
                            compatBuilder3.f8493t = i9;
                        } catch (Throwable unused2) {
                        }
                        if (z8 == 0) {
                            compatBuilder3.f8495v.tickerText = l.b(str5);
                        }
                        k kVar = new k(1);
                        if (z8 == 0) {
                            String valueOf = dVar4.getTitle() != null ? String.valueOf(dVar4.getTitle()) : null;
                            String concat = valueOf == null ? "" : valueOf.concat(" ");
                            CharSequence body = dVar4.getBody();
                            if (body != null && (obj = body.toString()) != null) {
                                str4 = obj;
                            }
                            SpannableString spannableString2 = new SpannableString(r4.f.c(concat, str4));
                            if (concat.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, concat.length(), 0);
                            }
                            ((ArrayList) kVar.f8474f).add(l.b(spannableString2));
                        }
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            SpannableString spannableString3 = (SpannableString) obj3;
                            if (spannableString3 != null) {
                                ((ArrayList) kVar.f8474f).add(l.b(spannableString3));
                            }
                        }
                        kVar.f8498b = l.b(str5);
                        compatBuilder3.g(kVar);
                        a7 = compatBuilder3.a();
                        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
                    }
                    Context currentContext22 = dVar6.getCurrentContext();
                    Intrinsics.b(currentContext22);
                    new t(currentContext22).a(num42.intValue(), a7);
                    return Unit.f6114a;
                }
                z7 = bVar2.Z$0;
                int i12 = bVar2.I$0;
                PendingIntent pendingIntent3 = (PendingIntent) bVar2.L$7;
                secureRandom = (SecureRandom) bVar2.L$6;
                str = (String) bVar2.L$5;
                com.onesignal.notifications.internal.display.impl.a aVar10 = (com.onesignal.notifications.internal.display.impl.a) bVar2.L$4;
                JSONObject jSONObject3 = (JSONObject) bVar2.L$3;
                aVar3 = (b.a) bVar2.L$2;
                s3.d dVar9 = (s3.d) bVar2.L$1;
                d dVar10 = (d) bVar2.L$0;
                V6.b.P(obj2);
                i7 = i12;
                aVar2 = aVar10;
                pendingIntent = pendingIntent3;
                dVar3 = dVar10;
                jSONObject = jSONObject3;
                dVar2 = dVar9;
                num = (Integer) obj2;
                if (num == null) {
                    pendingIntent2 = pendingIntent;
                    aVar4 = aVar3;
                    jSONObject2 = jSONObject;
                    str2 = str;
                    dVar4 = dVar2;
                    aVar5 = aVar2;
                    secureRandom2 = secureRandom;
                    num2 = num;
                    t3.d dVar82 = dVar3._dataController;
                    Intrinsics.b(str2);
                    bVar2.L$0 = dVar3;
                    bVar2.L$1 = dVar4;
                    bVar2.L$2 = aVar4;
                    bVar2.L$3 = jSONObject2;
                    bVar2.L$4 = aVar5;
                    bVar2.L$5 = str2;
                    bVar2.L$6 = secureRandom2;
                    bVar2.L$7 = pendingIntent2;
                    bVar2.L$8 = num2;
                    bVar2.I$0 = i7;
                    bVar2.Z$0 = z7;
                    bVar2.label = 3;
                    obj2 = dVar82.listNotificationsForGroup(str2, bVar2);
                    if (obj2 != aVar9) {
                    }
                    return aVar9;
                }
                Integer num6 = new Integer(secureRandom.nextInt());
                t3.d dVar11 = dVar3._dataController;
                int intValue3 = num6.intValue();
                Intrinsics.b(str);
                bVar2.L$0 = dVar3;
                bVar2.L$1 = dVar2;
                bVar2.L$2 = aVar3;
                bVar2.L$3 = jSONObject;
                bVar2.L$4 = aVar2;
                bVar2.L$5 = str;
                bVar2.L$6 = secureRandom;
                bVar2.L$7 = pendingIntent;
                bVar2.L$8 = num6;
                bVar2.I$0 = i7;
                bVar2.Z$0 = z7;
                bVar2.label = 2;
                if (dVar11.createSummaryNotification(intValue3, str, bVar2) != aVar9) {
                    s3.d dVar12 = dVar2;
                    secureRandom3 = secureRandom;
                    dVar5 = dVar12;
                    i8 = i7;
                    aVar6 = aVar2;
                    aVar7 = aVar3;
                    str3 = str;
                    num3 = num6;
                    aVar4 = aVar7;
                    num2 = num3;
                    secureRandom2 = secureRandom3;
                    aVar5 = aVar6;
                    i7 = i8;
                    pendingIntent2 = pendingIntent;
                    str2 = str3;
                    jSONObject2 = jSONObject;
                    dVar4 = dVar5;
                    t3.d dVar822 = dVar3._dataController;
                    Intrinsics.b(str2);
                    bVar2.L$0 = dVar3;
                    bVar2.L$1 = dVar4;
                    bVar2.L$2 = aVar4;
                    bVar2.L$3 = jSONObject2;
                    bVar2.L$4 = aVar5;
                    bVar2.L$5 = str2;
                    bVar2.L$6 = secureRandom2;
                    bVar2.L$7 = pendingIntent2;
                    bVar2.L$8 = num2;
                    bVar2.I$0 = i7;
                    bVar2.Z$0 = z7;
                    bVar2.label = 3;
                    obj2 = dVar822.listNotificationsForGroup(str2, bVar2);
                    if (obj2 != aVar9) {
                    }
                }
                return aVar9;
            }
        }
        bVar2 = new b(bVar);
        Object obj22 = bVar2.result;
        W5.a aVar92 = W5.a.f2787d;
        i5 = bVar2.label;
        if (i5 != 0) {
        }
        num = (Integer) obj22;
        if (num == null) {
        }
    }

    @Override // u3.InterfaceC0947c
    public Object updateSummaryNotification(s3.d dVar, V5.b bVar) {
        Object createSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), bVar);
        return createSummaryNotification == W5.a.f2787d ? createSummaryNotification : Unit.f6114a;
    }
}
