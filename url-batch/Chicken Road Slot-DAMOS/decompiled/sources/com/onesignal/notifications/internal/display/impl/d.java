package com.onesignal.notifications.internal.display.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import bc.e;
import com.onesignal.notifications.internal.display.impl.b;
import e3.g;
import e3.t;
import ea.f;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.text.o;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements dc.c {
    private final f _applicationService;
    private final cc.d _dataController;
    private final dc.a _notificationDisplayBuilder;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
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

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
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

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f fVar, cc.d dVar, dc.a aVar) {
        fVar.getClass();
        dVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._dataController = dVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final Intent createBaseSummaryIntent(int i3, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str) {
        Intent putExtra = aVar.getNewBaseIntent(i3).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        putExtra.getClass();
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // dc.c
    public void createGenericPendingIntentsForGroup(g gVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i3) {
        aVar.getClass();
        jSONObject.getClass();
        str.getClass();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i3).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str);
        putExtra.getClass();
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        gVar.getClass();
        gVar.g = newActionPendingIntent;
        dc.a aVar2 = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i3).putExtra("grp", str);
        putExtra2.getClass();
        gVar.f3821v.deleteIntent = aVar2.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        gVar.f3812m = str;
        try {
            gVar.f3819t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // dc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(bc.d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i3, int i10, ld.a aVar2) {
        a aVar3;
        int i11;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        d dVar2;
        String str2;
        bc.d dVar3;
        int i12;
        if (aVar2 instanceof a) {
            aVar3 = (a) aVar2;
            int i13 = aVar3.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar3.label = i13 - Integer.MIN_VALUE;
                Object obj = aVar3.result;
                md.a aVar4 = md.a.f6622d;
                i11 = aVar3.label;
                if (i11 != 0) {
                    cf.c.M(obj);
                    jsonPayload = dVar.getJsonPayload();
                    jsonPayload.getClass();
                    secureRandom = new SecureRandom();
                    str = i3 + " new messages";
                    cc.d dVar4 = this._dataController;
                    aVar3.L$0 = this;
                    aVar3.L$1 = dVar;
                    aVar3.L$2 = aVar;
                    aVar3.L$3 = jsonPayload;
                    aVar3.L$4 = secureRandom;
                    aVar3.L$5 = e.GROUPLESS_SUMMARY_KEY;
                    aVar3.L$6 = str;
                    aVar3.I$0 = i3;
                    aVar3.I$1 = i10;
                    aVar3.I$2 = e.GROUPLESS_SUMMARY_ID;
                    aVar3.label = 1;
                    if (dVar4.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar3) == aVar4) {
                        return aVar4;
                    }
                    dVar2 = this;
                    str2 = e.GROUPLESS_SUMMARY_KEY;
                    dVar3 = dVar;
                    i12 = -718463522;
                } else {
                    if (i11 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i12 = aVar3.I$2;
                    i10 = aVar3.I$1;
                    i3 = aVar3.I$0;
                    String str3 = (String) aVar3.L$6;
                    str2 = (String) aVar3.L$5;
                    secureRandom = (SecureRandom) aVar3.L$4;
                    jsonPayload = (JSONObject) aVar3.L$3;
                    com.onesignal.notifications.internal.display.impl.a aVar5 = (com.onesignal.notifications.internal.display.impl.a) aVar3.L$2;
                    dVar3 = (bc.d) aVar3.L$1;
                    dVar2 = (d) aVar3.L$0;
                    cf.c.M(obj);
                    str = str3;
                    aVar = aVar5;
                }
                PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i12, aVar, jsonPayload, str2));
                dc.a aVar6 = dVar2._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                putExtra.getClass();
                PendingIntent newDismissActionPendingIntent = aVar6.getNewDismissActionPendingIntent(nextInt, putExtra);
                g compatBuilder = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
                if (dVar3.getOverriddenSound() != null) {
                    compatBuilder.getClass();
                    compatBuilder.f(dVar3.getOverriddenSound());
                }
                if (dVar3.getOverriddenFlags() != null) {
                    compatBuilder.getClass();
                    Integer overriddenFlags = dVar3.getOverriddenFlags();
                    overriddenFlags.getClass();
                    compatBuilder.c(overriddenFlags.intValue());
                }
                compatBuilder.getClass();
                compatBuilder.g = newActionPendingIntent;
                compatBuilder.f3821v.deleteIntent = newDismissActionPendingIntent;
                Context currentContext = dVar2.getCurrentContext();
                currentContext.getClass();
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = dVar2.getCurrentContext();
                currentContext2.getClass();
                compatBuilder.f3806e = g.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
                compatBuilder.f3807f = g.b(str);
                compatBuilder.f3809i = i3;
                compatBuilder.f3821v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
                compatBuilder.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
                compatBuilder.d(8, true);
                compatBuilder.d(16, false);
                compatBuilder.f3812m = str2;
                compatBuilder.f3813n = true;
                compatBuilder.f3819t = i10;
                e3.f fVar = new e3.f(1);
                fVar.f3824b = g.b(str);
                compatBuilder.g(fVar);
                Notification a9 = compatBuilder.a();
                a9.getClass();
                Context currentContext3 = dVar2.getCurrentContext();
                currentContext3.getClass();
                new t(currentContext3).a(i12, a9);
                return Unit.f5554a;
            }
        }
        aVar3 = new a(aVar2);
        Object obj2 = aVar3.result;
        md.a aVar42 = md.a.f6622d;
        i11 = aVar3.label;
        if (i11 != 0) {
        }
        PendingIntent newActionPendingIntent2 = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i12, aVar, jsonPayload, str2));
        dc.a aVar62 = dVar2._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        putExtra2.getClass();
        PendingIntent newDismissActionPendingIntent2 = aVar62.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        g compatBuilder2 = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
        if (dVar3.getOverriddenSound() != null) {
        }
        if (dVar3.getOverriddenFlags() != null) {
        }
        compatBuilder2.getClass();
        compatBuilder2.g = newActionPendingIntent2;
        compatBuilder2.f3821v.deleteIntent = newDismissActionPendingIntent2;
        Context currentContext4 = dVar2.getCurrentContext();
        currentContext4.getClass();
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = dVar2.getCurrentContext();
        currentContext22.getClass();
        compatBuilder2.f3806e = g.b(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo()));
        compatBuilder2.f3807f = g.b(str);
        compatBuilder2.f3809i = i3;
        compatBuilder2.f3821v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder2.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder2.d(8, true);
        compatBuilder2.d(16, false);
        compatBuilder2.f3812m = str2;
        compatBuilder2.f3813n = true;
        compatBuilder2.f3819t = i10;
        e3.f fVar2 = new e3.f(1);
        fVar2.f3824b = g.b(str);
        compatBuilder2.g(fVar2);
        Notification a92 = compatBuilder2.a();
        a92.getClass();
        Context currentContext32 = dVar2.getCurrentContext();
        currentContext32.getClass();
        new t(currentContext32).a(i12, a92);
        return Unit.f5554a;
    }

    @Override // dc.c
    public Notification createSingleNotificationBeforeSummaryBuilder(bc.d dVar, g gVar) {
        dVar.getClass();
        gVar.getClass();
        Notification a9 = gVar.a();
        a9.getClass();
        return a9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0226 A[EDGE_INSN: B:36:0x0226->B:37:0x0226 BREAK  A[LOOP:0: B:13:0x01b5->B:30:0x01b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // dc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(bc.d dVar, b.a aVar, int i3, ld.a aVar2) {
        b bVar;
        int i10;
        com.onesignal.notifications.internal.display.impl.a aVar3;
        SecureRandom secureRandom;
        bc.d dVar2;
        b.a aVar4;
        int i11;
        JSONObject jSONObject;
        boolean z10;
        PendingIntent pendingIntent;
        String str;
        d dVar3;
        Integer num;
        PendingIntent pendingIntent2;
        b.a aVar5;
        JSONObject jSONObject2;
        String str2;
        bc.d dVar4;
        com.onesignal.notifications.internal.display.impl.a aVar6;
        SecureRandom secureRandom2;
        Integer num2;
        SecureRandom secureRandom3;
        bc.d dVar5;
        int i12;
        com.onesignal.notifications.internal.display.impl.a aVar7;
        b.a aVar8;
        String str3;
        Integer num3;
        boolean z11;
        d dVar6;
        int i13;
        b.a aVar9;
        Iterator it;
        boolean hasNext;
        String str4;
        PendingIntent newActionPendingIntent;
        Notification a9;
        String str5;
        String obj;
        String str6;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i14 = bVar.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.label = i14 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                md.a aVar10 = md.a.f6622d;
                i10 = bVar.label;
                if (i10 != 0) {
                    cf.c.M(obj2);
                    boolean isRestoring = dVar.isRestoring();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    jsonPayload.getClass();
                    Context currentContext = getCurrentContext();
                    currentContext.getClass();
                    aVar3 = new com.onesignal.notifications.internal.display.impl.a(currentContext);
                    String optString = jsonPayload.optString("grp", null);
                    secureRandom = new SecureRandom();
                    dc.a aVar11 = this._notificationDisplayBuilder;
                    int nextInt = secureRandom.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    putExtra.getClass();
                    PendingIntent newDismissActionPendingIntent = aVar11.getNewDismissActionPendingIntent(nextInt, putExtra);
                    cc.d dVar7 = this._dataController;
                    optString.getClass();
                    bVar.L$0 = this;
                    dVar2 = dVar;
                    bVar.L$1 = dVar2;
                    aVar4 = aVar;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jsonPayload;
                    bVar.L$4 = aVar3;
                    bVar.L$5 = optString;
                    bVar.L$6 = secureRandom;
                    bVar.L$7 = newDismissActionPendingIntent;
                    i11 = i3;
                    bVar.I$0 = i11;
                    bVar.Z$0 = isRestoring;
                    bVar.label = 1;
                    Object androidIdForGroup = dVar7.getAndroidIdForGroup(optString, true, bVar);
                    if (androidIdForGroup != aVar10) {
                        jSONObject = jsonPayload;
                        z10 = isRestoring;
                        obj2 = androidIdForGroup;
                        pendingIntent = newDismissActionPendingIntent;
                        str = optString;
                        dVar3 = this;
                    }
                    return aVar10;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        z10 = bVar.Z$0;
                        i12 = bVar.I$0;
                        num3 = (Integer) bVar.L$8;
                        pendingIntent = (PendingIntent) bVar.L$7;
                        secureRandom3 = (SecureRandom) bVar.L$6;
                        str3 = (String) bVar.L$5;
                        aVar7 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                        jSONObject = (JSONObject) bVar.L$3;
                        aVar8 = (b.a) bVar.L$2;
                        dVar5 = (bc.d) bVar.L$1;
                        dVar3 = (d) bVar.L$0;
                        cf.c.M(obj2);
                        aVar5 = aVar8;
                        num2 = num3;
                        secureRandom2 = secureRandom3;
                        aVar6 = aVar7;
                        i11 = i12;
                        pendingIntent2 = pendingIntent;
                        str2 = str3;
                        jSONObject2 = jSONObject;
                        dVar4 = dVar5;
                        cc.d dVar8 = dVar3._dataController;
                        str2.getClass();
                        bVar.L$0 = dVar3;
                        bVar.L$1 = dVar4;
                        bVar.L$2 = aVar5;
                        bVar.L$3 = jSONObject2;
                        bVar.L$4 = aVar6;
                        bVar.L$5 = str2;
                        bVar.L$6 = secureRandom2;
                        bVar.L$7 = pendingIntent2;
                        bVar.L$8 = num2;
                        bVar.I$0 = i11;
                        bVar.Z$0 = z10;
                        bVar.label = 3;
                        obj2 = dVar8.listNotificationsForGroup(str2, bVar);
                        if (obj2 != aVar10) {
                            z11 = z10;
                            dVar6 = dVar3;
                            i13 = i11;
                            aVar9 = aVar5;
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
                            num4.getClass();
                            int intValue = num4.intValue();
                            str2.getClass();
                            newActionPendingIntent = aVar6.getNewActionPendingIntent(nextInt2, dVar6.createBaseSummaryIntent(intValue, aVar6, jSONObject2, str2));
                            if (z11 != 0) {
                            }
                            aVar9.getClass();
                            g compatBuilder = aVar9.getCompatBuilder();
                            compatBuilder.getClass();
                            compatBuilder.f3803b.clear();
                            dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder, num4.intValue(), str2);
                            compatBuilder.g = newActionPendingIntent;
                            compatBuilder.f3821v.deleteIntent = pendingIntent2;
                            compatBuilder.d(8, z11);
                            compatBuilder.d(16, false);
                            compatBuilder.f3812m = str2;
                            compatBuilder.f3813n = true;
                            compatBuilder.f3819t = i13;
                            a9 = compatBuilder.a();
                            a9.getClass();
                            dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, a9);
                            Context currentContext2 = dVar6.getCurrentContext();
                            currentContext2.getClass();
                            new t(currentContext2).a(num4.intValue(), a9);
                            return Unit.f5554a;
                        }
                        return aVar10;
                    }
                    if (i10 != 3) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z12 = bVar.Z$0;
                    i13 = bVar.I$0;
                    num2 = (Integer) bVar.L$8;
                    pendingIntent2 = (PendingIntent) bVar.L$7;
                    secureRandom2 = (SecureRandom) bVar.L$6;
                    str2 = (String) bVar.L$5;
                    aVar6 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                    jSONObject2 = (JSONObject) bVar.L$3;
                    aVar9 = (b.a) bVar.L$2;
                    dVar4 = (bc.d) bVar.L$1;
                    dVar6 = (d) bVar.L$0;
                    cf.c.M(obj2);
                    z11 = z12;
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
                        cc.c cVar = (cc.c) it22.next();
                        Integer num5 = num2;
                        if (z11 == 0) {
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
                    num42.getClass();
                    int intValue2 = num42.intValue();
                    str2.getClass();
                    newActionPendingIntent = aVar6.getNewActionPendingIntent(nextInt22, dVar6.createBaseSummaryIntent(intValue2, aVar6, jSONObject2, str2));
                    if ((z11 != 0 || arrayList2.size() <= 1) && (z11 != 0 || arrayList2.size() <= 0)) {
                        aVar9.getClass();
                        g compatBuilder2 = aVar9.getCompatBuilder();
                        compatBuilder2.getClass();
                        compatBuilder2.f3803b.clear();
                        dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder2, num42.intValue(), str2);
                        compatBuilder2.g = newActionPendingIntent;
                        compatBuilder2.f3821v.deleteIntent = pendingIntent2;
                        compatBuilder2.d(8, z11);
                        compatBuilder2.d(16, false);
                        compatBuilder2.f3812m = str2;
                        compatBuilder2.f3813n = true;
                        try {
                            compatBuilder2.f3819t = i13;
                        } catch (Throwable unused) {
                        }
                        a9 = compatBuilder2.a();
                        a9.getClass();
                        dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, a9);
                    } else {
                        int size = arrayList2.size() + (!z11);
                        String safeString = com.onesignal.common.e.safeString(jSONObject2, "grp_msg");
                        if (safeString != null) {
                            str5 = o.g(safeString, "$[notif_count]", "" + size);
                        } else {
                            str5 = size + " new messages";
                        }
                        g compatBuilder3 = dVar6._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar4).getCompatBuilder();
                        if (z11 != 0) {
                            dVar6._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                        } else {
                            if (dVar4.getOverriddenSound() != null) {
                                compatBuilder3.getClass();
                                compatBuilder3.f(dVar4.getOverriddenSound());
                            }
                            if (dVar4.getOverriddenFlags() != null) {
                                compatBuilder3.getClass();
                                Integer overriddenFlags = dVar4.getOverriddenFlags();
                                overriddenFlags.getClass();
                                compatBuilder3.c(overriddenFlags.intValue());
                            }
                        }
                        compatBuilder3.getClass();
                        compatBuilder3.g = newActionPendingIntent;
                        compatBuilder3.f3821v.deleteIntent = pendingIntent2;
                        Context currentContext3 = dVar6.getCurrentContext();
                        currentContext3.getClass();
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = dVar6.getCurrentContext();
                        currentContext4.getClass();
                        compatBuilder3.f3806e = g.b(packageManager.getApplicationLabel(currentContext4.getApplicationInfo()));
                        compatBuilder3.f3807f = g.b(str5);
                        compatBuilder3.f3809i = size;
                        compatBuilder3.f3821v.icon = dVar6._notificationDisplayBuilder.getDefaultSmallIconId();
                        compatBuilder3.e(dVar6._notificationDisplayBuilder.getDefaultLargeIcon());
                        compatBuilder3.d(8, z11);
                        compatBuilder3.d(16, false);
                        compatBuilder3.f3812m = str2;
                        compatBuilder3.f3813n = true;
                        try {
                            compatBuilder3.f3819t = i13;
                        } catch (Throwable unused2) {
                        }
                        if (z11 == 0) {
                            compatBuilder3.f3821v.tickerText = g.b(str5);
                        }
                        e3.f fVar = new e3.f(1);
                        if (z11 == 0) {
                            String valueOf = dVar4.getTitle() != null ? String.valueOf(dVar4.getTitle()) : null;
                            String concat = valueOf == null ? "" : valueOf.concat(" ");
                            CharSequence body = dVar4.getBody();
                            if (body != null && (obj = body.toString()) != null) {
                                str4 = obj;
                            }
                            SpannableString spannableString2 = new SpannableString(concat.concat(str4));
                            if (concat.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, concat.length(), 0);
                            }
                            ((ArrayList) fVar.f3801f).add(g.b(spannableString2));
                        }
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj3 = arrayList2.get(i15);
                            i15++;
                            SpannableString spannableString3 = (SpannableString) obj3;
                            if (spannableString3 != null) {
                                ((ArrayList) fVar.f3801f).add(g.b(spannableString3));
                            }
                        }
                        fVar.f3824b = g.b(str5);
                        compatBuilder3.g(fVar);
                        a9 = compatBuilder3.a();
                        a9.getClass();
                    }
                    Context currentContext22 = dVar6.getCurrentContext();
                    currentContext22.getClass();
                    new t(currentContext22).a(num42.intValue(), a9);
                    return Unit.f5554a;
                }
                z10 = bVar.Z$0;
                int i16 = bVar.I$0;
                PendingIntent pendingIntent3 = (PendingIntent) bVar.L$7;
                secureRandom = (SecureRandom) bVar.L$6;
                str = (String) bVar.L$5;
                com.onesignal.notifications.internal.display.impl.a aVar12 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                JSONObject jSONObject3 = (JSONObject) bVar.L$3;
                aVar4 = (b.a) bVar.L$2;
                bc.d dVar9 = (bc.d) bVar.L$1;
                d dVar10 = (d) bVar.L$0;
                cf.c.M(obj2);
                i11 = i16;
                aVar3 = aVar12;
                pendingIntent = pendingIntent3;
                dVar3 = dVar10;
                jSONObject = jSONObject3;
                dVar2 = dVar9;
                num = (Integer) obj2;
                if (num == null) {
                    pendingIntent2 = pendingIntent;
                    aVar5 = aVar4;
                    jSONObject2 = jSONObject;
                    str2 = str;
                    dVar4 = dVar2;
                    aVar6 = aVar3;
                    secureRandom2 = secureRandom;
                    num2 = num;
                    cc.d dVar82 = dVar3._dataController;
                    str2.getClass();
                    bVar.L$0 = dVar3;
                    bVar.L$1 = dVar4;
                    bVar.L$2 = aVar5;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar6;
                    bVar.L$5 = str2;
                    bVar.L$6 = secureRandom2;
                    bVar.L$7 = pendingIntent2;
                    bVar.L$8 = num2;
                    bVar.I$0 = i11;
                    bVar.Z$0 = z10;
                    bVar.label = 3;
                    obj2 = dVar82.listNotificationsForGroup(str2, bVar);
                    if (obj2 != aVar10) {
                    }
                    return aVar10;
                }
                Integer num6 = new Integer(secureRandom.nextInt());
                cc.d dVar11 = dVar3._dataController;
                int intValue3 = num6.intValue();
                str.getClass();
                bVar.L$0 = dVar3;
                bVar.L$1 = dVar2;
                bVar.L$2 = aVar4;
                bVar.L$3 = jSONObject;
                bVar.L$4 = aVar3;
                bVar.L$5 = str;
                bVar.L$6 = secureRandom;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num6;
                bVar.I$0 = i11;
                bVar.Z$0 = z10;
                bVar.label = 2;
                if (dVar11.createSummaryNotification(intValue3, str, bVar) != aVar10) {
                    bc.d dVar12 = dVar2;
                    secureRandom3 = secureRandom;
                    dVar5 = dVar12;
                    i12 = i11;
                    aVar7 = aVar3;
                    aVar8 = aVar4;
                    str3 = str;
                    num3 = num6;
                    aVar5 = aVar8;
                    num2 = num3;
                    secureRandom2 = secureRandom3;
                    aVar6 = aVar7;
                    i11 = i12;
                    pendingIntent2 = pendingIntent;
                    str2 = str3;
                    jSONObject2 = jSONObject;
                    dVar4 = dVar5;
                    cc.d dVar822 = dVar3._dataController;
                    str2.getClass();
                    bVar.L$0 = dVar3;
                    bVar.L$1 = dVar4;
                    bVar.L$2 = aVar5;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar6;
                    bVar.L$5 = str2;
                    bVar.L$6 = secureRandom2;
                    bVar.L$7 = pendingIntent2;
                    bVar.L$8 = num2;
                    bVar.I$0 = i11;
                    bVar.Z$0 = z10;
                    bVar.label = 3;
                    obj2 = dVar822.listNotificationsForGroup(str2, bVar);
                    if (obj2 != aVar10) {
                    }
                }
                return aVar10;
            }
        }
        bVar = new b(aVar2);
        Object obj22 = bVar.result;
        md.a aVar102 = md.a.f6622d;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        num = (Integer) obj22;
        if (num == null) {
        }
    }

    @Override // dc.c
    public Object updateSummaryNotification(bc.d dVar, ld.a aVar) {
        Object createSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), aVar);
        return createSummaryNotification == md.a.f6622d ? createSummaryNotification : Unit.f5554a;
    }
}
