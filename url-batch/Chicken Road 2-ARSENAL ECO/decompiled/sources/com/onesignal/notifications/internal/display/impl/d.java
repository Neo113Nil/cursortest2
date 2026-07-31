package com.onesignal.notifications.internal.display.impl;

import F5.q;
import Q2.e;
import T1.f;
import W4.o;
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
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import t.C0639F;
import t.n;
import t.p;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class d implements S2.c {
    private final f _applicationService;
    private final R2.d _dataController;
    private final S2.a _notificationDisplayBuilder;

    public static final class a extends AbstractC0607c {
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

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    public static final class b extends AbstractC0607c {
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

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f _applicationService, R2.d _dataController, S2.a _notificationDisplayBuilder) {
        i.e(_applicationService, "_applicationService");
        i.e(_dataController, "_dataController");
        i.e(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int i7, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str) {
        Intent putExtra = aVar.getNewBaseIntent(i7).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        i.d(putExtra, "putExtra(...)");
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // S2.c
    public void createGenericPendingIntentsForGroup(p pVar, com.onesignal.notifications.internal.display.impl.a intentGenerator, JSONObject gcmBundle, String group, int i7) {
        i.e(intentGenerator, "intentGenerator");
        i.e(gcmBundle, "gcmBundle");
        i.e(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGenerator.getNewBaseIntent(i7).putExtra("onesignalData", gcmBundle.toString()).putExtra("grp", group);
        i.d(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(nextInt, putExtra);
        i.b(pVar);
        pVar.f5923g = newActionPendingIntent;
        S2.a aVar = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i7).putExtra("grp", group);
        i.d(putExtra2, "putExtra(...)");
        pVar.f5938v.deleteIntent = aVar.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        pVar.f5929m = group;
        try {
            pVar.f5936t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(Q2.d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i7, int i8, InterfaceC0564d interfaceC0564d) {
        a aVar2;
        int i9;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        d dVar2;
        String str2;
        Q2.d dVar3;
        int i10;
        if (interfaceC0564d instanceof a) {
            aVar2 = (a) interfaceC0564d;
            int i11 = aVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i9 = aVar2.label;
                if (i9 != 0) {
                    AbstractC0676f.w(obj);
                    jsonPayload = dVar.getJsonPayload();
                    i.b(jsonPayload);
                    secureRandom = new SecureRandom();
                    str = i7 + " new messages";
                    R2.d dVar4 = this._dataController;
                    aVar2.L$0 = this;
                    aVar2.L$1 = dVar;
                    aVar2.L$2 = aVar;
                    aVar2.L$3 = jsonPayload;
                    aVar2.L$4 = secureRandom;
                    aVar2.L$5 = e.GROUPLESS_SUMMARY_KEY;
                    aVar2.L$6 = str;
                    aVar2.I$0 = i7;
                    aVar2.I$1 = i8;
                    aVar2.I$2 = e.GROUPLESS_SUMMARY_ID;
                    aVar2.label = 1;
                    if (dVar4.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar2) == enumC0580a) {
                        return enumC0580a;
                    }
                    dVar2 = this;
                    str2 = e.GROUPLESS_SUMMARY_KEY;
                    dVar3 = dVar;
                    i10 = -718463522;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = aVar2.I$2;
                    i8 = aVar2.I$1;
                    i7 = aVar2.I$0;
                    String str3 = (String) aVar2.L$6;
                    str2 = (String) aVar2.L$5;
                    secureRandom = (SecureRandom) aVar2.L$4;
                    jsonPayload = (JSONObject) aVar2.L$3;
                    com.onesignal.notifications.internal.display.impl.a aVar3 = (com.onesignal.notifications.internal.display.impl.a) aVar2.L$2;
                    dVar3 = (Q2.d) aVar2.L$1;
                    dVar2 = (d) aVar2.L$0;
                    AbstractC0676f.w(obj);
                    str = str3;
                    aVar = aVar3;
                }
                PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i10, aVar, jsonPayload, str2));
                S2.a aVar4 = dVar2._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                i.d(putExtra, "putExtra(...)");
                PendingIntent newDismissActionPendingIntent = aVar4.getNewDismissActionPendingIntent(nextInt, putExtra);
                p compatBuilder = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
                if (dVar3.getOverriddenSound() != null) {
                    i.b(compatBuilder);
                    compatBuilder.f(dVar3.getOverriddenSound());
                }
                if (dVar3.getOverriddenFlags() != null) {
                    i.b(compatBuilder);
                    Integer overriddenFlags = dVar3.getOverriddenFlags();
                    i.b(overriddenFlags);
                    compatBuilder.c(overriddenFlags.intValue());
                }
                i.b(compatBuilder);
                compatBuilder.f5923g = newActionPendingIntent;
                compatBuilder.f5938v.deleteIntent = newDismissActionPendingIntent;
                Context currentContext = dVar2.getCurrentContext();
                i.b(currentContext);
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = dVar2.getCurrentContext();
                i.b(currentContext2);
                compatBuilder.f5921e = p.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
                compatBuilder.f5922f = p.b(str);
                compatBuilder.f5925i = i7;
                compatBuilder.f5938v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
                compatBuilder.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
                compatBuilder.d(8, true);
                compatBuilder.d(16, false);
                compatBuilder.f5929m = str2;
                compatBuilder.f5930n = true;
                compatBuilder.f5936t = i8;
                n nVar = new n(1);
                nVar.f5941b = p.b(str);
                compatBuilder.g(nVar);
                Notification a7 = compatBuilder.a();
                i.d(a7, "build(...)");
                Context currentContext3 = dVar2.getCurrentContext();
                i.b(currentContext3);
                new C0639F(currentContext3).a(i10, a7);
                return v.f5219a;
            }
        }
        aVar2 = new a(interfaceC0564d);
        Object obj2 = aVar2.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i9 = aVar2.label;
        if (i9 != 0) {
        }
        PendingIntent newActionPendingIntent2 = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i10, aVar, jsonPayload, str2));
        S2.a aVar42 = dVar2._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        i.d(putExtra2, "putExtra(...)");
        PendingIntent newDismissActionPendingIntent2 = aVar42.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        p compatBuilder2 = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
        if (dVar3.getOverriddenSound() != null) {
        }
        if (dVar3.getOverriddenFlags() != null) {
        }
        i.b(compatBuilder2);
        compatBuilder2.f5923g = newActionPendingIntent2;
        compatBuilder2.f5938v.deleteIntent = newDismissActionPendingIntent2;
        Context currentContext4 = dVar2.getCurrentContext();
        i.b(currentContext4);
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = dVar2.getCurrentContext();
        i.b(currentContext22);
        compatBuilder2.f5921e = p.b(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo()));
        compatBuilder2.f5922f = p.b(str);
        compatBuilder2.f5925i = i7;
        compatBuilder2.f5938v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder2.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder2.d(8, true);
        compatBuilder2.d(16, false);
        compatBuilder2.f5929m = str2;
        compatBuilder2.f5930n = true;
        compatBuilder2.f5936t = i8;
        n nVar2 = new n(1);
        nVar2.f5941b = p.b(str);
        compatBuilder2.g(nVar2);
        Notification a72 = compatBuilder2.a();
        i.d(a72, "build(...)");
        Context currentContext32 = dVar2.getCurrentContext();
        i.b(currentContext32);
        new C0639F(currentContext32).a(i10, a72);
        return v.f5219a;
    }

    @Override // S2.c
    public Notification createSingleNotificationBeforeSummaryBuilder(Q2.d notificationJob, p pVar) {
        i.e(notificationJob, "notificationJob");
        i.b(pVar);
        Notification a7 = pVar.a();
        i.d(a7, "build(...)");
        return a7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0229 A[EDGE_INSN: B:36:0x0229->B:37:0x0229 BREAK  A[LOOP:0: B:13:0x01b8->B:30:0x01b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // S2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(Q2.d dVar, b.a aVar, int i7, InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i8;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        SecureRandom secureRandom;
        Q2.d dVar2;
        b.a aVar3;
        int i9;
        JSONObject jSONObject;
        boolean z5;
        PendingIntent pendingIntent;
        String str;
        d dVar3;
        Integer num;
        PendingIntent pendingIntent2;
        b.a aVar4;
        JSONObject jSONObject2;
        String str2;
        Q2.d dVar4;
        com.onesignal.notifications.internal.display.impl.a aVar5;
        SecureRandom secureRandom2;
        Integer num2;
        SecureRandom secureRandom3;
        Q2.d dVar5;
        int i10;
        com.onesignal.notifications.internal.display.impl.a aVar6;
        b.a aVar7;
        String str3;
        Integer num3;
        boolean z6;
        d dVar6;
        int i11;
        b.a aVar8;
        Iterator it;
        boolean hasNext;
        String str4;
        PendingIntent newActionPendingIntent;
        Notification a7;
        String str5;
        String obj;
        String str6;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = bVar.label;
                if (i8 != 0) {
                    AbstractC0676f.w(obj2);
                    boolean isRestoring = dVar.isRestoring();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    i.b(jsonPayload);
                    Context currentContext = getCurrentContext();
                    i.b(currentContext);
                    aVar2 = new com.onesignal.notifications.internal.display.impl.a(currentContext);
                    String optString = jsonPayload.optString("grp", null);
                    secureRandom = new SecureRandom();
                    S2.a aVar9 = this._notificationDisplayBuilder;
                    int nextInt = secureRandom.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    i.d(putExtra, "putExtra(...)");
                    PendingIntent newDismissActionPendingIntent = aVar9.getNewDismissActionPendingIntent(nextInt, putExtra);
                    R2.d dVar7 = this._dataController;
                    i.b(optString);
                    bVar.L$0 = this;
                    dVar2 = dVar;
                    bVar.L$1 = dVar2;
                    aVar3 = aVar;
                    bVar.L$2 = aVar3;
                    bVar.L$3 = jsonPayload;
                    bVar.L$4 = aVar2;
                    bVar.L$5 = optString;
                    bVar.L$6 = secureRandom;
                    bVar.L$7 = newDismissActionPendingIntent;
                    i9 = i7;
                    bVar.I$0 = i9;
                    bVar.Z$0 = isRestoring;
                    bVar.label = 1;
                    Object androidIdForGroup = dVar7.getAndroidIdForGroup(optString, true, bVar);
                    if (androidIdForGroup != enumC0580a) {
                        jSONObject = jsonPayload;
                        z5 = isRestoring;
                        obj2 = androidIdForGroup;
                        pendingIntent = newDismissActionPendingIntent;
                        str = optString;
                        dVar3 = this;
                    }
                    return enumC0580a;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        z5 = bVar.Z$0;
                        i10 = bVar.I$0;
                        num3 = (Integer) bVar.L$8;
                        pendingIntent = (PendingIntent) bVar.L$7;
                        secureRandom3 = (SecureRandom) bVar.L$6;
                        str3 = (String) bVar.L$5;
                        aVar6 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                        jSONObject = (JSONObject) bVar.L$3;
                        aVar7 = (b.a) bVar.L$2;
                        dVar5 = (Q2.d) bVar.L$1;
                        dVar3 = (d) bVar.L$0;
                        AbstractC0676f.w(obj2);
                        aVar4 = aVar7;
                        num2 = num3;
                        secureRandom2 = secureRandom3;
                        aVar5 = aVar6;
                        i9 = i10;
                        pendingIntent2 = pendingIntent;
                        str2 = str3;
                        jSONObject2 = jSONObject;
                        dVar4 = dVar5;
                        R2.d dVar8 = dVar3._dataController;
                        i.b(str2);
                        bVar.L$0 = dVar3;
                        bVar.L$1 = dVar4;
                        bVar.L$2 = aVar4;
                        bVar.L$3 = jSONObject2;
                        bVar.L$4 = aVar5;
                        bVar.L$5 = str2;
                        bVar.L$6 = secureRandom2;
                        bVar.L$7 = pendingIntent2;
                        bVar.L$8 = num2;
                        bVar.I$0 = i9;
                        bVar.Z$0 = z5;
                        bVar.label = 3;
                        obj2 = dVar8.listNotificationsForGroup(str2, bVar);
                        if (obj2 != enumC0580a) {
                            z6 = z5;
                            dVar6 = dVar3;
                            i11 = i9;
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
                            i.b(num4);
                            int intValue = num4.intValue();
                            i.b(str2);
                            newActionPendingIntent = aVar5.getNewActionPendingIntent(nextInt2, dVar6.createBaseSummaryIntent(intValue, aVar5, jSONObject2, str2));
                            if (z6 != 0) {
                            }
                            i.b(aVar8);
                            p compatBuilder = aVar8.getCompatBuilder();
                            i.b(compatBuilder);
                            compatBuilder.f5918b.clear();
                            dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar5, compatBuilder, num4.intValue(), str2);
                            compatBuilder.f5923g = newActionPendingIntent;
                            compatBuilder.f5938v.deleteIntent = pendingIntent2;
                            compatBuilder.d(8, z6);
                            compatBuilder.d(16, false);
                            compatBuilder.f5929m = str2;
                            compatBuilder.f5930n = true;
                            compatBuilder.f5936t = i11;
                            a7 = compatBuilder.a();
                            i.d(a7, "build(...)");
                            dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar8, a7);
                            Context currentContext2 = dVar6.getCurrentContext();
                            i.b(currentContext2);
                            new C0639F(currentContext2).a(num4.intValue(), a7);
                            return v.f5219a;
                        }
                        return enumC0580a;
                    }
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z7 = bVar.Z$0;
                    i11 = bVar.I$0;
                    num2 = (Integer) bVar.L$8;
                    pendingIntent2 = (PendingIntent) bVar.L$7;
                    secureRandom2 = (SecureRandom) bVar.L$6;
                    str2 = (String) bVar.L$5;
                    aVar5 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                    jSONObject2 = (JSONObject) bVar.L$3;
                    aVar8 = (b.a) bVar.L$2;
                    dVar4 = (Q2.d) bVar.L$1;
                    dVar6 = (d) bVar.L$0;
                    AbstractC0676f.w(obj2);
                    z6 = z7;
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
                        R2.c cVar = (R2.c) it22.next();
                        Integer num5 = num2;
                        if (z6 == 0) {
                            str6 = str72;
                            if (cVar.getAndroidId() == dVar4.getAndroidId()) {
                                it = it22;
                                num2 = num5;
                                str72 = str6;
                            }
                        } else {
                            str6 = str72;
                        }
                        String title = cVar.getTitle();
                        str4 = title != null ? title.concat(" ") : "";
                        SpannableString spannableString = new SpannableString(str4 + cVar.getMessage());
                        if (str4.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                        }
                        arrayList2.add(spannableString);
                        if (str6 == null) {
                            str72 = cVar.getFullData();
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
                    i.b(num42);
                    int intValue2 = num42.intValue();
                    i.b(str2);
                    newActionPendingIntent = aVar5.getNewActionPendingIntent(nextInt22, dVar6.createBaseSummaryIntent(intValue2, aVar5, jSONObject2, str2));
                    if ((z6 != 0 || arrayList2.size() <= 1) && (z6 != 0 || arrayList2.size() <= 0)) {
                        i.b(aVar8);
                        p compatBuilder2 = aVar8.getCompatBuilder();
                        i.b(compatBuilder2);
                        compatBuilder2.f5918b.clear();
                        dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar5, compatBuilder2, num42.intValue(), str2);
                        compatBuilder2.f5923g = newActionPendingIntent;
                        compatBuilder2.f5938v.deleteIntent = pendingIntent2;
                        compatBuilder2.d(8, z6);
                        compatBuilder2.d(16, false);
                        compatBuilder2.f5929m = str2;
                        compatBuilder2.f5930n = true;
                        try {
                            compatBuilder2.f5936t = i11;
                        } catch (Throwable unused) {
                        }
                        a7 = compatBuilder2.a();
                        i.d(a7, "build(...)");
                        dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar8, a7);
                    } else {
                        int size = arrayList2.size() + (!z6);
                        String safeString = com.onesignal.common.e.safeString(jSONObject2, "grp_msg");
                        if (safeString != null) {
                            str5 = q.G(safeString, "$[notif_count]", "" + size);
                        } else {
                            str5 = size + " new messages";
                        }
                        p compatBuilder3 = dVar6._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar4).getCompatBuilder();
                        if (z6 != 0) {
                            dVar6._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                        } else {
                            if (dVar4.getOverriddenSound() != null) {
                                i.b(compatBuilder3);
                                compatBuilder3.f(dVar4.getOverriddenSound());
                            }
                            if (dVar4.getOverriddenFlags() != null) {
                                i.b(compatBuilder3);
                                Integer overriddenFlags = dVar4.getOverriddenFlags();
                                i.b(overriddenFlags);
                                compatBuilder3.c(overriddenFlags.intValue());
                            }
                        }
                        i.b(compatBuilder3);
                        compatBuilder3.f5923g = newActionPendingIntent;
                        compatBuilder3.f5938v.deleteIntent = pendingIntent2;
                        Context currentContext3 = dVar6.getCurrentContext();
                        i.b(currentContext3);
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = dVar6.getCurrentContext();
                        i.b(currentContext4);
                        compatBuilder3.f5921e = p.b(packageManager.getApplicationLabel(currentContext4.getApplicationInfo()));
                        compatBuilder3.f5922f = p.b(str5);
                        compatBuilder3.f5925i = size;
                        compatBuilder3.f5938v.icon = dVar6._notificationDisplayBuilder.getDefaultSmallIconId();
                        compatBuilder3.e(dVar6._notificationDisplayBuilder.getDefaultLargeIcon());
                        compatBuilder3.d(8, z6);
                        compatBuilder3.d(16, false);
                        compatBuilder3.f5929m = str2;
                        compatBuilder3.f5930n = true;
                        try {
                            compatBuilder3.f5936t = i11;
                        } catch (Throwable unused2) {
                        }
                        if (z6 == 0) {
                            compatBuilder3.f5938v.tickerText = p.b(str5);
                        }
                        n nVar = new n(1);
                        if (z6 == 0) {
                            String valueOf = dVar4.getTitle() != null ? String.valueOf(dVar4.getTitle()) : null;
                            String concat = valueOf == null ? "" : valueOf.concat(" ");
                            CharSequence body = dVar4.getBody();
                            if (body != null && (obj = body.toString()) != null) {
                                str4 = obj;
                            }
                            SpannableString spannableString2 = new SpannableString(o.d(concat, str4));
                            if (concat.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, concat.length(), 0);
                            }
                            ((ArrayList) nVar.f5916f).add(p.b(spannableString2));
                        }
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj3 = arrayList2.get(i13);
                            i13++;
                            SpannableString spannableString3 = (SpannableString) obj3;
                            if (spannableString3 != null) {
                                ((ArrayList) nVar.f5916f).add(p.b(spannableString3));
                            }
                        }
                        nVar.f5941b = p.b(str5);
                        compatBuilder3.g(nVar);
                        a7 = compatBuilder3.a();
                        i.d(a7, "build(...)");
                    }
                    Context currentContext22 = dVar6.getCurrentContext();
                    i.b(currentContext22);
                    new C0639F(currentContext22).a(num42.intValue(), a7);
                    return v.f5219a;
                }
                z5 = bVar.Z$0;
                int i14 = bVar.I$0;
                PendingIntent pendingIntent3 = (PendingIntent) bVar.L$7;
                secureRandom = (SecureRandom) bVar.L$6;
                str = (String) bVar.L$5;
                com.onesignal.notifications.internal.display.impl.a aVar10 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                JSONObject jSONObject3 = (JSONObject) bVar.L$3;
                aVar3 = (b.a) bVar.L$2;
                Q2.d dVar9 = (Q2.d) bVar.L$1;
                d dVar10 = (d) bVar.L$0;
                AbstractC0676f.w(obj2);
                i9 = i14;
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
                    R2.d dVar82 = dVar3._dataController;
                    i.b(str2);
                    bVar.L$0 = dVar3;
                    bVar.L$1 = dVar4;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar5;
                    bVar.L$5 = str2;
                    bVar.L$6 = secureRandom2;
                    bVar.L$7 = pendingIntent2;
                    bVar.L$8 = num2;
                    bVar.I$0 = i9;
                    bVar.Z$0 = z5;
                    bVar.label = 3;
                    obj2 = dVar82.listNotificationsForGroup(str2, bVar);
                    if (obj2 != enumC0580a) {
                    }
                    return enumC0580a;
                }
                Integer num6 = new Integer(secureRandom.nextInt());
                R2.d dVar11 = dVar3._dataController;
                int intValue3 = num6.intValue();
                i.b(str);
                bVar.L$0 = dVar3;
                bVar.L$1 = dVar2;
                bVar.L$2 = aVar3;
                bVar.L$3 = jSONObject;
                bVar.L$4 = aVar2;
                bVar.L$5 = str;
                bVar.L$6 = secureRandom;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num6;
                bVar.I$0 = i9;
                bVar.Z$0 = z5;
                bVar.label = 2;
                if (dVar11.createSummaryNotification(intValue3, str, bVar) != enumC0580a) {
                    Q2.d dVar12 = dVar2;
                    secureRandom3 = secureRandom;
                    dVar5 = dVar12;
                    i10 = i9;
                    aVar6 = aVar2;
                    aVar7 = aVar3;
                    str3 = str;
                    num3 = num6;
                    aVar4 = aVar7;
                    num2 = num3;
                    secureRandom2 = secureRandom3;
                    aVar5 = aVar6;
                    i9 = i10;
                    pendingIntent2 = pendingIntent;
                    str2 = str3;
                    jSONObject2 = jSONObject;
                    dVar4 = dVar5;
                    R2.d dVar822 = dVar3._dataController;
                    i.b(str2);
                    bVar.L$0 = dVar3;
                    bVar.L$1 = dVar4;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar5;
                    bVar.L$5 = str2;
                    bVar.L$6 = secureRandom2;
                    bVar.L$7 = pendingIntent2;
                    bVar.L$8 = num2;
                    bVar.I$0 = i9;
                    bVar.Z$0 = z5;
                    bVar.label = 3;
                    obj2 = dVar822.listNotificationsForGroup(str2, bVar);
                    if (obj2 != enumC0580a) {
                    }
                }
                return enumC0580a;
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj22 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = bVar.label;
        if (i8 != 0) {
        }
        num = (Integer) obj22;
        if (num == null) {
        }
    }

    @Override // S2.c
    public Object updateSummaryNotification(Q2.d dVar, InterfaceC0564d interfaceC0564d) {
        Object createSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), interfaceC0564d);
        return createSummaryNotification == EnumC0580a.f5697f ? createSummaryNotification : v.f5219a;
    }
}
