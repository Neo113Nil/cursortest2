package com.onesignal.notifications.internal.display.impl;

import F2.q;
import T1.f;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.e;
import com.onesignal.notifications.internal.display.impl.b;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import t.C0639F;
import t.p;
import u.AbstractC0667b;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class c implements S2.b {
    private final f _applicationService;
    private final S2.a _notificationDisplayBuilder;
    private final V2.b _notificationLimitManager;
    private final S2.c _summaryNotificationDisplayer;

    public static final class a extends AbstractC0607c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showNotification(null, this);
        }
    }

    public c(f _applicationService, V2.b _notificationLimitManager, S2.c _summaryNotificationDisplayer, S2.a _notificationDisplayBuilder) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationLimitManager, "_notificationLimitManager");
        i.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        i.e(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._notificationLimitManager = _notificationLimitManager;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final void addBackgroundImage(JSONObject jSONObject, p pVar) {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String str;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            com.onesignal.debug.internal.logging.b.verbose$default("Cannot use background images in notifications for device on version: " + i7, null, 2, null);
            return;
        }
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            JSONObject jSONObject3 = new JSONObject(optString);
            bitmap = getBitmap(jSONObject3.optString("img", null));
            jSONObject2 = jSONObject3;
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            Context currentContext = getCurrentContext();
            i.b(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(F2.p.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(F2.p.os_bgimage_notif_body, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, F2.p.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, F2.p.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                i.b(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    i.b(contextResources2);
                    str = contextResources2.getString(identifier);
                } else {
                    str = null;
                }
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(F2.p.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(F2.p.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(F2.p.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(F2.p.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(F2.p.os_bgimage_notif_bgimage, bitmap);
            }
            i.b(pVar);
            pVar.f5938v.contentView = remoteViews;
            pVar.g(null);
        }
    }

    private final void applyNotificationExtender(Q2.d dVar, p pVar) {
        if (dVar.hasExtender()) {
            try {
                Field declaredField = p.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(pVar);
                i.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                i.b(pVar);
                com.onesignal.notifications.internal.c notification2 = dVar.getNotification();
                i.b(notification2);
                notification2.getNotificationExtender();
                i.b(null);
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(p pVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, int i7) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i7).putExtra("onesignalData", jSONObject.toString());
        i.d(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        i.b(pVar);
        pVar.f5923g = newActionPendingIntent;
        pVar.f5938v.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i7));
        Notification a7 = pVar.a();
        i.d(a7, "build(...)");
        return a7;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean z6 = i.g(str.charAt(!z5 ? i7 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length--;
            } else if (z6) {
                i7++;
            } else {
                z5 = true;
            }
        }
        String obj = str.subSequence(i7, length + 1).toString();
        return (F5.q.I(obj, "http://") || F5.q.I(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            i.b(currentContext);
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    i.b(currentContext2);
                    bitmap = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        i.b(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean z6 = i.g(str.charAt(!z5 ? i7 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length--;
            } else if (z6) {
                i7++;
            } else {
                z5 = true;
            }
        }
        String obj = str.subSequence(i7, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(obj)) {
            return 0;
        }
        int drawableId = getDrawableId(obj);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i7, String str, String str2) {
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            remoteViews.setTextColor(i7, safeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        i.b(contextResources);
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i7, AbstractC0667b.a(getCurrentContext(), identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0168, code lost:
    
        if (r4.createGrouplessSummaryNotification(r15, r18, r7, r8, r9) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016b, code lost:
    
        r4 = r0;
        r5 = r2;
        r2 = r12;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0193, code lost:
    
        if (r4.createSummaryNotification(r15, r0, r7, r9) == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(Q2.d dVar, InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        ArrayList<StatusBarNotification> activeGrouplessNotifications;
        String str;
        b.a baseOneSignalNotificationBuilder;
        JSONObject jSONObject;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        Q2.d dVar2;
        int i8;
        p pVar;
        c cVar;
        b.a aVar3;
        String str2;
        int i9;
        Notification createGenericPendingIntentsForNotif;
        String channelId;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
                a aVar4 = aVar;
                Object obj = aVar4.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar4.label;
                boolean z5 = true;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    int androidId = dVar.getAndroidId();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    i.b(jsonPayload);
                    String safeString = e.safeString(jsonPayload, "grp");
                    com.onesignal.notifications.internal.display.impl.a aVar5 = new com.onesignal.notifications.internal.display.impl.a(getCurrentContext());
                    new ArrayList();
                    Q2.e eVar = Q2.e.INSTANCE;
                    activeGrouplessNotifications = eVar.getActiveGrouplessNotifications(getCurrentContext());
                    if (safeString != null || activeGrouplessNotifications.size() < 3) {
                        str = safeString;
                    } else {
                        eVar.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                        str = Q2.e.GROUPLESS_SUMMARY_KEY;
                    }
                    baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar);
                    p compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
                    this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, aVar5, compatBuilder, androidId, null);
                    jSONObject = jsonPayload;
                    aVar2 = aVar5;
                    try {
                        addBackgroundImage(jSONObject, compatBuilder);
                    } catch (Throwable th) {
                        com.onesignal.debug.internal.logging.b.error("Could not set background notification image!", th);
                    }
                    applyNotificationExtender(dVar, compatBuilder);
                    if (dVar.isRestoring()) {
                        this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
                    }
                    int i11 = str == null ? 1 : 2;
                    V2.b bVar = this._notificationLimitManager;
                    aVar4.L$0 = this;
                    aVar4.L$1 = dVar;
                    aVar4.L$2 = jSONObject;
                    aVar4.L$3 = str;
                    aVar4.L$4 = aVar2;
                    aVar4.L$5 = activeGrouplessNotifications;
                    aVar4.L$6 = baseOneSignalNotificationBuilder;
                    aVar4.L$7 = compatBuilder;
                    aVar4.I$0 = androidId;
                    aVar4.label = 1;
                    if (bVar.clearOldestOverLimit(i11, aVar4) != enumC0580a) {
                        dVar2 = dVar;
                        i8 = androidId;
                        pVar = compatBuilder;
                        cVar = this;
                    }
                    return enumC0580a;
                }
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = aVar4.I$0;
                    createGenericPendingIntentsForNotif = (Notification) aVar4.L$2;
                    b.a aVar6 = (b.a) aVar4.L$1;
                    c cVar2 = (c) aVar4.L$0;
                    AbstractC0676f.w(obj);
                    i9 = i12;
                    aVar3 = aVar6;
                    cVar = cVar2;
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                    Context currentContext = cVar.getCurrentContext();
                    i.b(currentContext);
                    new C0639F(currentContext).a(i9, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                        Q2.e eVar2 = Q2.e.INSTANCE;
                        Context currentContext2 = cVar.getCurrentContext();
                        i.b(currentContext2);
                        channelId = createGenericPendingIntentsForNotif.getChannelId();
                        z5 = eVar2.areNotificationsEnabled(currentContext2, channelId);
                    }
                    return Boolean.valueOf(z5);
                }
                int i13 = aVar4.I$0;
                p pVar2 = (p) aVar4.L$7;
                baseOneSignalNotificationBuilder = (b.a) aVar4.L$6;
                activeGrouplessNotifications = (ArrayList) aVar4.L$5;
                aVar2 = (com.onesignal.notifications.internal.display.impl.a) aVar4.L$4;
                str = (String) aVar4.L$3;
                jSONObject = (JSONObject) aVar4.L$2;
                dVar2 = (Q2.d) aVar4.L$1;
                c cVar3 = (c) aVar4.L$0;
                AbstractC0676f.w(obj);
                i8 = i13;
                pVar = pVar2;
                cVar = cVar3;
                aVar3 = baseOneSignalNotificationBuilder;
                com.onesignal.notifications.internal.display.impl.a aVar7 = aVar2;
                str2 = str;
                JSONObject jSONObject2 = jSONObject;
                if (str2 != null) {
                    i9 = i8;
                    createGenericPendingIntentsForNotif = cVar.createGenericPendingIntentsForNotif(pVar, aVar7, jSONObject2, i9);
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                    Context currentContext3 = cVar.getCurrentContext();
                    i.b(currentContext3);
                    new C0639F(currentContext3).a(i9, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    return Boolean.valueOf(z5);
                }
                cVar._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(pVar, aVar7, jSONObject2, str2, i8);
                int i14 = i8;
                Notification createSingleNotificationBeforeSummaryBuilder = cVar._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(dVar2, pVar);
                if (str2.equals(Q2.e.GROUPLESS_SUMMARY_KEY)) {
                    S2.c cVar4 = cVar._summaryNotificationDisplayer;
                    int size = activeGrouplessNotifications.size() + 1;
                    int groupAlertBehavior = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                    aVar4.L$0 = cVar;
                    aVar4.L$1 = aVar3;
                    aVar4.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    aVar4.L$3 = null;
                    aVar4.L$4 = null;
                    aVar4.L$5 = null;
                    aVar4.L$6 = null;
                    aVar4.L$7 = null;
                    aVar4.I$0 = i14;
                    aVar4.label = 2;
                } else {
                    S2.c cVar5 = cVar._summaryNotificationDisplayer;
                    int groupAlertBehavior2 = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                    aVar4.L$0 = cVar;
                    aVar4.L$1 = aVar3;
                    aVar4.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    aVar4.L$3 = null;
                    aVar4.L$4 = null;
                    aVar4.L$5 = null;
                    aVar4.L$6 = null;
                    aVar4.L$7 = null;
                    aVar4.I$0 = i14;
                    aVar4.label = 3;
                }
                i9 = i12;
                aVar3 = aVar6;
                cVar = cVar2;
                cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                Context currentContext32 = cVar.getCurrentContext();
                i.b(currentContext32);
                new C0639F(currentContext32).a(i9, createGenericPendingIntentsForNotif);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                return Boolean.valueOf(z5);
            }
        }
        aVar = new a(interfaceC0564d);
        a aVar42 = aVar;
        Object obj2 = aVar42.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar42.label;
        boolean z52 = true;
        if (i7 != 0) {
        }
        aVar3 = baseOneSignalNotificationBuilder;
        com.onesignal.notifications.internal.display.impl.a aVar72 = aVar2;
        str2 = str;
        JSONObject jSONObject22 = jSONObject;
        if (str2 != null) {
        }
    }

    @Override // S2.b
    public Object displayNotification(Q2.d dVar, InterfaceC0564d interfaceC0564d) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, interfaceC0564d);
    }

    public final v isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new P1.b("Process for showing a notification should never been done on Main Thread!");
        }
        return v.f5219a;
    }
}
