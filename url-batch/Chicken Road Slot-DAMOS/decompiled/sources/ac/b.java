package ac;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import bc.d;
import bc.e;
import ea.f;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements zb.a {
    private static final String CHANNEL_PREFIX = "OS_";
    public static final a Companion = new a(null);
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final f _applicationService;
    private final la.a _languageContext;
    private final Pattern hexPattern;

    public b(f fVar, la.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._languageContext = aVar;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:3)(1:65)|4|(1:6)|7|(2:9|(22:11|12|(1:14)|15|(4:17|(1:19)|20|21)|25|(1:27)(1:63)|28|(1:32)|33|(1:35)(1:62)|36|(2:38|(1:40)(2:41|(1:45)))|46|(1:48)(1:61)|49|(1:51)|52|53|54|55|56))|64|12|(0)|15|(0)|25|(0)(0)|28|(2:30|32)|33|(0)(0)|36|(0)|46|(0)(0)|49|(0)|52|53|54|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0158, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        NotificationChannel c10;
        long[] parseVibrationPattern;
        Object opt = jSONObject.opt("chnl");
        if (opt instanceof String) {
            jSONObject2 = new JSONObject((String) opt);
        } else {
            opt.getClass();
            jSONObject2 = (JSONObject) opt;
        }
        String str = DEFAULT_CHANNEL_ID;
        String optString = jSONObject2.optString("id", DEFAULT_CHANNEL_ID);
        if (!Intrinsics.a(optString, "miscellaneous")) {
            str = optString;
        }
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject4.has(language)) {
                jSONObject3 = jSONObject4.optJSONObject(language);
                jSONObject3.getClass();
                String optString2 = jSONObject3.optString("nm", "Miscellaneous");
                int priorityToImportance = priorityToImportance(jSONObject.optInt("pri", 6));
                ac.a.k();
                c10 = ac.a.c(priorityToImportance, str, optString2);
                c10.setDescription(jSONObject3.optString("dscr", null));
                if (jSONObject2.has("grp_id")) {
                    String optString3 = jSONObject2.optString("grp_id");
                    String optString4 = jSONObject3.optString("grp_nm");
                    optString4.getClass();
                    notificationManager.createNotificationChannelGroup(ac.a.h(optString3, optString4));
                    c10.setGroup(optString3);
                }
                if (jSONObject.has("ledc")) {
                    String optString5 = jSONObject.optString("ledc");
                    if (!this.hexPattern.matcher(optString5).matches()) {
                        com.onesignal.debug.internal.logging.b.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                        optString5 = "FFFFFFFF";
                    }
                    try {
                        c10.setLightColor(new BigInteger(optString5, 16).intValue());
                    } catch (Throwable th) {
                        com.onesignal.debug.internal.logging.b.error("Couldn't convert ARGB Hex value to BigInteger:", th);
                    }
                }
                c10.enableLights(jSONObject.optInt("led", 1) != 1);
                if (jSONObject.has("vib_pt") && (parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject)) != null) {
                    c10.setVibrationPattern(parseVibrationPattern);
                }
                c10.enableVibration(jSONObject.optInt("vib", 1) != 1);
                if (jSONObject.has("sound")) {
                    String optString6 = jSONObject.optString("sound", null);
                    Uri soundUri = e.INSTANCE.getSoundUri(context, optString6);
                    if (soundUri != null) {
                        c10.setSound(soundUri, null);
                    } else if ("null".equals(optString6) || "nil".equals(optString6)) {
                        c10.setSound(null, null);
                    }
                }
                c10.setLockscreenVisibility(jSONObject.optInt("vis", 0));
                c10.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
                c10.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
                com.onesignal.debug.internal.logging.b.verbose$default("Creating notification channel with channel:\n" + c10, null, 2, null);
                notificationManager.createNotificationChannel(c10);
                str.getClass();
                return str;
            }
        }
        jSONObject3 = jSONObject2;
        jSONObject3.getClass();
        String optString22 = jSONObject3.optString("nm", "Miscellaneous");
        int priorityToImportance2 = priorityToImportance(jSONObject.optInt("pri", 6));
        ac.a.k();
        c10 = ac.a.c(priorityToImportance2, str, optString22);
        c10.setDescription(jSONObject3.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
        }
        if (jSONObject.has("ledc")) {
        }
        c10.enableLights(jSONObject.optInt("led", 1) != 1);
        if (jSONObject.has("vib_pt")) {
            c10.setVibrationPattern(parseVibrationPattern);
        }
        c10.enableVibration(jSONObject.optInt("vib", 1) != 1);
        if (jSONObject.has("sound")) {
        }
        c10.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        c10.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
        c10.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        com.onesignal.debug.internal.logging.b.verbose$default("Creating notification channel with channel:\n" + c10, null, 2, null);
        notificationManager.createNotificationChannel(c10);
        str.getClass();
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        ac.a.k();
        NotificationChannel w6 = ac.a.w();
        w6.enableLights(true);
        w6.enableVibration(true);
        notificationManager.createNotificationChannel(w6);
        return DEFAULT_CHANNEL_ID;
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        ac.a.k();
        notificationManager.createNotificationChannel(ac.a.b());
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int i3) {
        if (i3 > 9) {
            return 5;
        }
        if (i3 > 7) {
            return 4;
        }
        if (i3 > 5) {
            return 3;
        }
        if (i3 > 3) {
            return 2;
        }
        return i3 > 1 ? 1 : 0;
    }

    @Override // zb.a
    public String createNotificationChannel(d dVar) {
        NotificationChannel notificationChannel;
        dVar.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = dVar.getJsonPayload();
        jsonPayload.getClass();
        NotificationManager notificationManager = e.INSTANCE.getNotificationManager(appContext);
        if (dVar.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String optString = jsonPayload.optString("oth_chnl");
            notificationChannel = notificationManager.getNotificationChannel(optString);
            if (notificationChannel != null) {
                optString.getClass();
                return optString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e2) {
            com.onesignal.debug.internal.logging.b.error("Could not create notification channel due to JSON payload error!", e2);
            return DEFAULT_CHANNEL_ID;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    @Override // zb.a
    public void processChannelList(JSONArray jSONArray) {
        String id2;
        ?? notificationChannels;
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                jSONObject.getClass();
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e2) {
                com.onesignal.debug.internal.logging.b.error("Could not create notification channel due to JSON payload error!", e2);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            notificationChannels = notificationManager.getNotificationChannels();
            notificationChannels.getClass();
            arrayList = notificationChannels;
        } catch (NullPointerException e9) {
            com.onesignal.debug.internal.logging.b.error$default("Error when trying to delete notification channel: " + e9.getMessage(), null, 2, null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            id2 = ac.a.f(it.next()).getId();
            id2.getClass();
            if (id2.startsWith(CHANNEL_PREFIX) && !hashSet.contains(id2)) {
                notificationManager.deleteNotificationChannel(id2);
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
