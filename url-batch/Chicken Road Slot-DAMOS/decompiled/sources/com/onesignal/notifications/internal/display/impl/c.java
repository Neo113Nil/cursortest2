package com.onesignal.notifications.internal.display.impl;

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
import e3.g;
import e3.t;
import ea.f;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import org.json.JSONObject;
import qb.p;
import qb.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements dc.b {
    private final f _applicationService;
    private final dc.a _notificationDisplayBuilder;
    private final gc.b _notificationLimitManager;
    private final dc.c _summaryNotificationDisplayer;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
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

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showNotification(null, this);
        }
    }

    public c(f fVar, gc.b bVar, dc.c cVar, dc.a aVar) {
        fVar.getClass();
        bVar.getClass();
        cVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._notificationLimitManager = bVar;
        this._summaryNotificationDisplayer = cVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final void addBackgroundImage(JSONObject jSONObject, g gVar) {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String str;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            com.onesignal.debug.internal.logging.b.verbose$default("Cannot use background images in notifications for device on version: " + i3, null, 2, null);
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
            currentContext.getClass();
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(p.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(p.os_bgimage_notif_body, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                contextResources.getClass();
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    contextResources2.getClass();
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
            gVar.getClass();
            gVar.f3821v.contentView = remoteViews;
            gVar.g(null);
        }
    }

    private final void applyNotificationExtender(bc.d dVar, g gVar) {
        if (dVar.hasExtender()) {
            try {
                Field declaredField = g.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(gVar);
                obj.getClass();
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                gVar.getClass();
                com.onesignal.notifications.internal.c notification2 = dVar.getNotification();
                notification2.getClass();
                notification2.getNotificationExtender();
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(g gVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, int i3) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i3).putExtra("onesignalData", jSONObject.toString());
        putExtra.getClass();
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        gVar.getClass();
        gVar.g = newActionPendingIntent;
        gVar.f3821v.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i3));
        Notification a9 = gVar.a();
        a9.getClass();
        return a9;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean z11 = Intrinsics.b(str.charAt(!z10 ? i3 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i3++;
            } else {
                z10 = true;
            }
        }
        String obj = str.subSequence(i3, length + 1).toString();
        return (o.h(obj, "http://") || obj.startsWith("https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            currentContext.getClass();
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
                    currentContext2.getClass();
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
        contextResources.getClass();
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
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean z11 = Intrinsics.b(str.charAt(!z10 ? i3 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i3++;
            } else {
                z10 = true;
            }
        }
        String obj = str.subSequence(i3, length + 1).toString();
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

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i3, String str, String str2) {
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            remoteViews.setTextColor(i3, safeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        contextResources.getClass();
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i3, getCurrentContext().getColor(identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0168, code lost:
    
        if (r4.createGrouplessSummaryNotification(r15, r18, r5, r8, r9) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016b, code lost:
    
        r4 = r0;
        r5 = r2;
        r2 = r12;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0192, code lost:
    
        if (r4.createSummaryNotification(r15, r0, r8, r9) == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(bc.d dVar, ld.a aVar) {
        a aVar2;
        int i3;
        ArrayList<StatusBarNotification> activeGrouplessNotifications;
        String str;
        b.a baseOneSignalNotificationBuilder;
        JSONObject jSONObject;
        com.onesignal.notifications.internal.display.impl.a aVar3;
        bc.d dVar2;
        int i10;
        g gVar;
        c cVar;
        b.a aVar4;
        String str2;
        int i11;
        Notification createGenericPendingIntentsForNotif;
        String channelId;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i12 = aVar2.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i12 - Integer.MIN_VALUE;
                a aVar5 = aVar2;
                Object obj = aVar5.result;
                md.a aVar6 = md.a.f6622d;
                i3 = aVar5.label;
                boolean z10 = true;
                if (i3 != 0) {
                    cf.c.M(obj);
                    int androidId = dVar.getAndroidId();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    jsonPayload.getClass();
                    String safeString = e.safeString(jsonPayload, "grp");
                    com.onesignal.notifications.internal.display.impl.a aVar7 = new com.onesignal.notifications.internal.display.impl.a(getCurrentContext());
                    new ArrayList();
                    bc.e eVar = bc.e.INSTANCE;
                    activeGrouplessNotifications = eVar.getActiveGrouplessNotifications(getCurrentContext());
                    if (safeString != null || activeGrouplessNotifications.size() < 3) {
                        str = safeString;
                    } else {
                        eVar.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                        str = bc.e.GROUPLESS_SUMMARY_KEY;
                    }
                    baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar);
                    g compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
                    this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, aVar7, compatBuilder, androidId, null);
                    jSONObject = jsonPayload;
                    aVar3 = aVar7;
                    try {
                        addBackgroundImage(jSONObject, compatBuilder);
                    } catch (Throwable th) {
                        com.onesignal.debug.internal.logging.b.error("Could not set background notification image!", th);
                    }
                    applyNotificationExtender(dVar, compatBuilder);
                    if (dVar.isRestoring()) {
                        this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
                    }
                    int i13 = str == null ? 1 : 2;
                    gc.b bVar = this._notificationLimitManager;
                    aVar5.L$0 = this;
                    aVar5.L$1 = dVar;
                    aVar5.L$2 = jSONObject;
                    aVar5.L$3 = str;
                    aVar5.L$4 = aVar3;
                    aVar5.L$5 = activeGrouplessNotifications;
                    aVar5.L$6 = baseOneSignalNotificationBuilder;
                    aVar5.L$7 = compatBuilder;
                    aVar5.I$0 = androidId;
                    aVar5.label = 1;
                    if (bVar.clearOldestOverLimit(i13, aVar5) != aVar6) {
                        dVar2 = dVar;
                        i10 = androidId;
                        gVar = compatBuilder;
                        cVar = this;
                    }
                    return aVar6;
                }
                if (i3 != 1) {
                    if (i3 != 2 && i3 != 3) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i14 = aVar5.I$0;
                    createGenericPendingIntentsForNotif = (Notification) aVar5.L$2;
                    b.a aVar8 = (b.a) aVar5.L$1;
                    c cVar2 = (c) aVar5.L$0;
                    cf.c.M(obj);
                    i11 = i14;
                    aVar4 = aVar8;
                    cVar = cVar2;
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar4, createGenericPendingIntentsForNotif);
                    Context currentContext = cVar.getCurrentContext();
                    currentContext.getClass();
                    new t(currentContext).a(i11, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                        bc.e eVar2 = bc.e.INSTANCE;
                        Context currentContext2 = cVar.getCurrentContext();
                        currentContext2.getClass();
                        channelId = createGenericPendingIntentsForNotif.getChannelId();
                        z10 = eVar2.areNotificationsEnabled(currentContext2, channelId);
                    }
                    return Boolean.valueOf(z10);
                }
                int i15 = aVar5.I$0;
                g gVar2 = (g) aVar5.L$7;
                baseOneSignalNotificationBuilder = (b.a) aVar5.L$6;
                activeGrouplessNotifications = (ArrayList) aVar5.L$5;
                aVar3 = (com.onesignal.notifications.internal.display.impl.a) aVar5.L$4;
                str = (String) aVar5.L$3;
                jSONObject = (JSONObject) aVar5.L$2;
                dVar2 = (bc.d) aVar5.L$1;
                c cVar3 = (c) aVar5.L$0;
                cf.c.M(obj);
                i10 = i15;
                gVar = gVar2;
                cVar = cVar3;
                aVar4 = baseOneSignalNotificationBuilder;
                com.onesignal.notifications.internal.display.impl.a aVar9 = aVar3;
                str2 = str;
                JSONObject jSONObject2 = jSONObject;
                if (str2 != null) {
                    i11 = i10;
                    createGenericPendingIntentsForNotif = cVar.createGenericPendingIntentsForNotif(gVar, aVar9, jSONObject2, i11);
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar4, createGenericPendingIntentsForNotif);
                    Context currentContext3 = cVar.getCurrentContext();
                    currentContext3.getClass();
                    new t(currentContext3).a(i11, createGenericPendingIntentsForNotif);
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    return Boolean.valueOf(z10);
                }
                cVar._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(gVar, aVar9, jSONObject2, str2, i10);
                int i16 = i10;
                Notification createSingleNotificationBeforeSummaryBuilder = cVar._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(dVar2, gVar);
                boolean equals = str2.equals(bc.e.GROUPLESS_SUMMARY_KEY);
                dc.c cVar4 = cVar._summaryNotificationDisplayer;
                if (equals) {
                    int size = activeGrouplessNotifications.size() + 1;
                    int groupAlertBehavior = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                    aVar5.L$0 = cVar;
                    aVar5.L$1 = aVar4;
                    aVar5.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    aVar5.L$3 = null;
                    aVar5.L$4 = null;
                    aVar5.L$5 = null;
                    aVar5.L$6 = null;
                    aVar5.L$7 = null;
                    aVar5.I$0 = i16;
                    aVar5.label = 2;
                } else {
                    int groupAlertBehavior2 = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                    aVar5.L$0 = cVar;
                    aVar5.L$1 = aVar4;
                    aVar5.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    aVar5.L$3 = null;
                    aVar5.L$4 = null;
                    aVar5.L$5 = null;
                    aVar5.L$6 = null;
                    aVar5.L$7 = null;
                    aVar5.I$0 = i16;
                    aVar5.label = 3;
                }
                i11 = i14;
                aVar4 = aVar8;
                cVar = cVar2;
                cVar._notificationDisplayBuilder.addXiaomiSettings(aVar4, createGenericPendingIntentsForNotif);
                Context currentContext32 = cVar.getCurrentContext();
                currentContext32.getClass();
                new t(currentContext32).a(i11, createGenericPendingIntentsForNotif);
                if (Build.VERSION.SDK_INT >= 26) {
                }
                return Boolean.valueOf(z10);
            }
        }
        aVar2 = new a(aVar);
        a aVar52 = aVar2;
        Object obj2 = aVar52.result;
        md.a aVar62 = md.a.f6622d;
        i3 = aVar52.label;
        boolean z102 = true;
        if (i3 != 0) {
        }
        aVar4 = baseOneSignalNotificationBuilder;
        com.onesignal.notifications.internal.display.impl.a aVar92 = aVar3;
        str2 = str;
        JSONObject jSONObject22 = jSONObject;
        if (str2 != null) {
        }
    }

    @Override // dc.b
    public Object displayNotification(bc.d dVar, ld.a aVar) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, aVar);
    }

    public final Unit isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new z9.b("Process for showing a notification should never been done on Main Thread!");
        }
        return Unit.f5554a;
    }
}
