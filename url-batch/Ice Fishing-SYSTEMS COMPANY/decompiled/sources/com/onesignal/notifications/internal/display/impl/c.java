package com.onesignal.notifications.internal.display.impl;

import D.N;
import D.v;
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
import com.anythink.expressad.foundation.h.k;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.e;
import com.onesignal.notifications.internal.display.impl.b;
import e5.p;
import e5.q;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import p4.C4861b;
import r5.InterfaceC4965a;
import r5.InterfaceC4966b;
import r5.InterfaceC4967c;
import t4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class c implements InterfaceC4966b {
    private final f _applicationService;
    private final InterfaceC4965a _notificationDisplayBuilder;
    private final u5.b _notificationLimitManager;
    private final InterfaceC4967c _summaryNotificationDisplayer;

    public static final class a extends AbstractC5219c {
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

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showNotification(null, this);
        }
    }

    public c(f _applicationService, u5.b _notificationLimitManager, InterfaceC4967c _summaryNotificationDisplayer, InterfaceC4965a _notificationDisplayBuilder) {
        h.e(_applicationService, "_applicationService");
        h.e(_notificationLimitManager, "_notificationLimitManager");
        h.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        h.e(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._notificationLimitManager = _notificationLimitManager;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final void addBackgroundImage(JSONObject jSONObject, v vVar) {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            com.onesignal.debug.internal.logging.b.verbose$default("Cannot use background images in notifications for device on version: " + i, null, 2, null);
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
            h.b(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(p.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(p.os_bgimage_notif_body, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                h.b(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", k.f19794g, getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    h.b(contextResources2);
                    str = contextResources2.getString(identifier);
                } else {
                    str = null;
                }
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(p.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage, bitmap);
            }
            h.b(vVar);
            vVar.f569v.contentView = remoteViews;
            vVar.g(null);
        }
    }

    private final void applyNotificationExtender(p5.d dVar, v vVar) {
        if (dVar.hasExtender()) {
            try {
                Field declaredField = v.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(vVar);
                h.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                h.b(vVar);
                com.onesignal.notifications.internal.c notification2 = dVar.getNotification();
                h.b(notification2);
                notification2.getNotificationExtender();
                h.b(null);
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(v vVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, int i) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i).putExtra("onesignalData", jSONObject.toString());
        h.d(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        h.b(vVar);
        vVar.f555g = newActionPendingIntent;
        vVar.f569v.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i));
        Notification a9 = vVar.a();
        h.d(a9, "build(...)");
        return a9;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean z9 = h.f(str.charAt(!z8 ? i : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                }
                length--;
            } else if (z9) {
                i++;
            } else {
                z8 = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        return (M7.q.I(obj, "http://") || M7.q.I(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            h.b(currentContext);
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
                    h.b(currentContext2);
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
        h.b(contextResources);
        return contextResources.getIdentifier(str, k.f19790c, getPackageName());
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean z9 = h.f(str.charAt(!z8 ? i : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                }
                length--;
            } else if (z9) {
                i++;
            } else {
                z8 = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
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

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            remoteViews.setTextColor(i, safeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        h.b(contextResources);
        int identifier = contextResources.getIdentifier(str2, k.f19791d, getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i, E.b.a(getCurrentContext(), identifier));
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
    public final Object showNotification(p5.d dVar, InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        ArrayList<StatusBarNotification> activeGrouplessNotifications;
        String str;
        b.a baseOneSignalNotificationBuilder;
        JSONObject jSONObject;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        p5.d dVar2;
        int i4;
        v vVar;
        c cVar;
        b.a aVar3;
        String str2;
        int i9;
        Notification createGenericPendingIntentsForNotif;
        String channelId;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
                a aVar4 = aVar;
                Object obj = aVar4.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar4.label;
                boolean z8 = true;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    int androidId = dVar.getAndroidId();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    h.b(jsonPayload);
                    String safeString = e.safeString(jsonPayload, "grp");
                    com.onesignal.notifications.internal.display.impl.a aVar5 = new com.onesignal.notifications.internal.display.impl.a(getCurrentContext());
                    new ArrayList();
                    p5.e eVar = p5.e.INSTANCE;
                    activeGrouplessNotifications = eVar.getActiveGrouplessNotifications(getCurrentContext());
                    if (safeString != null || activeGrouplessNotifications.size() < 3) {
                        str = safeString;
                    } else {
                        eVar.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                        str = p5.e.GROUPLESS_SUMMARY_KEY;
                    }
                    baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar);
                    v compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
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
                    u5.b bVar = this._notificationLimitManager;
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
                    if (bVar.clearOldestOverLimit(i11, aVar4) != enumC5179a) {
                        dVar2 = dVar;
                        i4 = androidId;
                        vVar = compatBuilder;
                        cVar = this;
                    }
                    return enumC5179a;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = aVar4.I$0;
                    createGenericPendingIntentsForNotif = (Notification) aVar4.L$2;
                    b.a aVar6 = (b.a) aVar4.L$1;
                    c cVar2 = (c) aVar4.L$0;
                    com.bumptech.glide.f.r(obj);
                    i9 = i12;
                    aVar3 = aVar6;
                    cVar = cVar2;
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                    Context currentContext = cVar.getCurrentContext();
                    h.b(currentContext);
                    new N(currentContext).a(i9, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                        p5.e eVar2 = p5.e.INSTANCE;
                        Context currentContext2 = cVar.getCurrentContext();
                        h.b(currentContext2);
                        channelId = createGenericPendingIntentsForNotif.getChannelId();
                        z8 = eVar2.areNotificationsEnabled(currentContext2, channelId);
                    }
                    return Boolean.valueOf(z8);
                }
                int i13 = aVar4.I$0;
                v vVar2 = (v) aVar4.L$7;
                baseOneSignalNotificationBuilder = (b.a) aVar4.L$6;
                activeGrouplessNotifications = (ArrayList) aVar4.L$5;
                aVar2 = (com.onesignal.notifications.internal.display.impl.a) aVar4.L$4;
                str = (String) aVar4.L$3;
                jSONObject = (JSONObject) aVar4.L$2;
                dVar2 = (p5.d) aVar4.L$1;
                c cVar3 = (c) aVar4.L$0;
                com.bumptech.glide.f.r(obj);
                i4 = i13;
                vVar = vVar2;
                cVar = cVar3;
                aVar3 = baseOneSignalNotificationBuilder;
                com.onesignal.notifications.internal.display.impl.a aVar7 = aVar2;
                str2 = str;
                JSONObject jSONObject2 = jSONObject;
                if (str2 != null) {
                    i9 = i4;
                    createGenericPendingIntentsForNotif = cVar.createGenericPendingIntentsForNotif(vVar, aVar7, jSONObject2, i9);
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                    Context currentContext3 = cVar.getCurrentContext();
                    h.b(currentContext3);
                    new N(currentContext3).a(i9, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    return Boolean.valueOf(z8);
                }
                cVar._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(vVar, aVar7, jSONObject2, str2, i4);
                int i14 = i4;
                Notification createSingleNotificationBeforeSummaryBuilder = cVar._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(dVar2, vVar);
                if (str2.equals(p5.e.GROUPLESS_SUMMARY_KEY)) {
                    InterfaceC4967c interfaceC4967c = cVar._summaryNotificationDisplayer;
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
                    InterfaceC4967c interfaceC4967c2 = cVar._summaryNotificationDisplayer;
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
                h.b(currentContext32);
                new N(currentContext32).a(i9, createGenericPendingIntentsForNotif);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                return Boolean.valueOf(z8);
            }
        }
        aVar = new a(interfaceC5133d);
        a aVar42 = aVar;
        Object obj2 = aVar42.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar42.label;
        boolean z82 = true;
        if (i != 0) {
        }
        aVar3 = baseOneSignalNotificationBuilder;
        com.onesignal.notifications.internal.display.impl.a aVar72 = aVar2;
        str2 = str;
        JSONObject jSONObject22 = jSONObject;
        if (str2 != null) {
        }
    }

    @Override // r5.InterfaceC4966b
    public Object displayNotification(p5.d dVar, InterfaceC5133d interfaceC5133d) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, interfaceC5133d);
    }

    public final q7.v isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new C4861b("Process for showing a notification should never been done on Main Thread!");
        }
        return q7.v.f40183a;
    }
}
