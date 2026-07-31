package com.onesignal.notifications.internal.channels.impl;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationChannelCompat;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.channels.INotificationChannelManager;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.common.NotificationPriorityMapper;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationChannelManager.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/onesignal/notifications/internal/channels/impl/NotificationChannelManager;", "Lcom/onesignal/notifications/internal/channels/INotificationChannelManager;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_languageContext", "Lcom/onesignal/core/internal/language/ILanguageContext;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/language/ILanguageContext;)V", "hexPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createChannel", "", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "payload", "Lorg/json/JSONObject;", "createDefaultChannel", "createNotificationChannel", "notificationJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "createRestoreChannel", "priorityToImportance", "", "priority", "processChannelList", "", "list", "Lorg/json/JSONArray;", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationChannelManager implements INotificationChannelManager {
    private static final String CHANNEL_PREFIX = "OS_";
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final IApplicationService _applicationService;
    private final ILanguageContext _languageContext;
    private final Pattern hexPattern;

    public NotificationChannelManager(IApplicationService _applicationService, ILanguageContext _languageContext) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._applicationService = _applicationService;
        this._languageContext = _languageContext;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    @Override // com.onesignal.notifications.internal.channels.INotificationChannelManager
    public String createNotificationChannel(NotificationGenerationJob notificationJob) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        Intrinsics.checkNotNull(jsonPayload);
        NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(appContext);
        if (notificationJob.getIsRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String optString = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(optString) != null) {
                Intrinsics.checkNotNull(optString);
                return optString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e) {
            Logging.error("Could not create notification channel due to JSON payload error!", e);
            return "fcm_fallback_notification_channel";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:3)(1:65)|4|(1:6)|7|(2:9|(22:11|12|(1:14)|15|(4:17|(1:19)|20|21)|25|(1:27)(1:63)|28|(1:32)|33|(1:35)(1:62)|36|(2:38|(1:40)(2:41|(1:45)))|46|(1:48)(1:61)|49|(1:51)|52|53|54|55|56))|64|12|(0)|15|(0)|25|(0)(0)|28|(2:30|32)|33|(0)(0)|36|(0)|46|(0)(0)|49|(0)|52|53|54|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject payload) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        NotificationChannel notificationChannel;
        long[] parseVibrationPattern;
        Object opt = payload.opt("chnl");
        if (opt instanceof String) {
            jSONObject = new JSONObject((String) opt);
        } else {
            Intrinsics.checkNotNull(opt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) opt;
        }
        String optString = jSONObject.optString("id", "fcm_fallback_notification_channel");
        String str = Intrinsics.areEqual(optString, NotificationChannelCompat.DEFAULT_CHANNEL_ID) ? "fcm_fallback_notification_channel" : optString;
        if (jSONObject.has("langs")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject3.has(language)) {
                jSONObject2 = jSONObject3.optJSONObject(language);
                Intrinsics.checkNotNull(jSONObject2);
                notificationChannel = new NotificationChannel(str, jSONObject2.optString("nm", "Miscellaneous"), priorityToImportance(payload.optInt("pri", 6)));
                notificationChannel.setDescription(jSONObject2.optString("dscr", null));
                if (jSONObject.has("grp_id")) {
                    String optString2 = jSONObject.optString("grp_id");
                    String optString3 = jSONObject2.optString("grp_nm");
                    Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                    notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(optString2, optString3));
                    notificationChannel.setGroup(optString2);
                }
                if (payload.has("ledc")) {
                    String optString4 = payload.optString("ledc");
                    if (!this.hexPattern.matcher(optString4).matches()) {
                        Logging.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                        optString4 = "FFFFFFFF";
                    }
                    try {
                        notificationChannel.setLightColor(new BigInteger(optString4, 16).intValue());
                    } catch (Throwable th) {
                        Logging.warn("Couldn't convert ARGB Hex value to BigInteger:", th);
                    }
                }
                notificationChannel.enableLights(payload.optInt("led", 1) != 1);
                if (payload.has("vib_pt") && (parseVibrationPattern = NotificationHelper.INSTANCE.parseVibrationPattern(payload)) != null) {
                    notificationChannel.setVibrationPattern(parseVibrationPattern);
                }
                notificationChannel.enableVibration(payload.optInt("vib", 1) != 1);
                if (payload.has("sound")) {
                    String optString5 = payload.optString("sound", null);
                    Uri soundUri = NotificationHelper.INSTANCE.getSoundUri(context, optString5);
                    if (soundUri != null) {
                        notificationChannel.setSound(soundUri, null);
                    } else if (Intrinsics.areEqual(AbstractJsonLexerKt.NULL, optString5) || Intrinsics.areEqual("nil", optString5)) {
                        notificationChannel.setSound(null, null);
                    }
                }
                notificationChannel.setLockscreenVisibility(payload.optInt("vis", 0));
                notificationChannel.setShowBadge(payload.optInt("bdg", 1) != 1);
                notificationChannel.setBypassDnd(payload.optInt("bdnd", 0) == 1);
                Logging.verbose$default("Creating notification channel with channel:\n" + notificationChannel, null, 2, null);
                notificationManager.createNotificationChannel(notificationChannel);
                Intrinsics.checkNotNull(str);
                return str;
            }
        }
        jSONObject2 = jSONObject;
        Intrinsics.checkNotNull(jSONObject2);
        notificationChannel = new NotificationChannel(str, jSONObject2.optString("nm", "Miscellaneous"), priorityToImportance(payload.optInt("pri", 6)));
        notificationChannel.setDescription(jSONObject2.optString("dscr", null));
        if (jSONObject.has("grp_id")) {
        }
        if (payload.has("ledc")) {
        }
        notificationChannel.enableLights(payload.optInt("led", 1) != 1);
        if (payload.has("vib_pt")) {
            notificationChannel.setVibrationPattern(parseVibrationPattern);
        }
        notificationChannel.enableVibration(payload.optInt("vib", 1) != 1);
        if (payload.has("sound")) {
        }
        notificationChannel.setLockscreenVisibility(payload.optInt("vis", 0));
        notificationChannel.setShowBadge(payload.optInt("bdg", 1) != 1);
        notificationChannel.setBypassDnd(payload.optInt("bdnd", 0) == 1);
        Logging.verbose$default("Creating notification channel with channel:\n" + notificationChannel, null, 2, null);
        notificationManager.createNotificationChannel(notificationChannel);
        Intrinsics.checkNotNull(str);
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return "fcm_fallback_notification_channel";
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(RESTORE_CHANNEL_ID, "Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    @Override // com.onesignal.notifications.internal.channels.INotificationChannelManager
    public void processChannelList(JSONArray list) {
        if (Build.VERSION.SDK_INT < 26 || list == null || list.length() == 0) {
            return;
        }
        NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = list.length();
        for (int i = 0; i < length; i++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = list.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e) {
                Logging.error("Could not create notification channel due to JSON payload error!", e);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
            arrayList = notificationChannels;
        } catch (NullPointerException e2) {
            Logging.warn$default("Error when trying to delete notification channel: " + e2.getMessage(), null, 2, null);
        }
        Iterator<NotificationChannel> it = arrayList.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            Intrinsics.checkNotNull(id);
            if (StringsKt.startsWith$default(id, CHANNEL_PREFIX, false, 2, (Object) null) && !hashSet.contains(id)) {
                notificationManager.deleteNotificationChannel(id);
            }
        }
    }

    private final int priorityToImportance(int priority) {
        return NotificationPriorityMapper.INSTANCE.toAndroidImportance(priority);
    }
}
