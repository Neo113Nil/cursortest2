package com.onesignal.notifications.internal;

import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.BackgroundImageLayout;
import com.onesignal.notifications.IActionButton;
import com.onesignal.notifications.IDisplayableMutableNotification;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.q;

/* loaded from: classes.dex */
public final class Notification implements IDisplayableMutableNotification {
    private List<? extends IActionButton> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private BackgroundImageLayout backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final WaiterWithValue<Boolean> displayWaiter;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<Notification> groupedNotifications;
    private String largeIcon;
    private String launchURL;
    private String ledColor;
    private int lockScreenVisibility;
    private q notificationExtender;
    private String notificationId;
    private int priority;
    private String rawPayload;
    private long sentTime;
    private String smallIcon;
    private String smallIconAccentColor;
    private String sound;
    private String templateId;
    private String templateName;
    private String title;
    private int ttl;

    public static final class ActionButton implements IActionButton {
        private final String icon;
        private final String id;
        private final String text;

        public ActionButton() {
            this(null, null, null, 7, null);
        }

        @Override // com.onesignal.notifications.IActionButton
        public String getIcon() {
            return this.icon;
        }

        @Override // com.onesignal.notifications.IActionButton
        public String getId() {
            return this.id;
        }

        @Override // com.onesignal.notifications.IActionButton
        public String getText() {
            return this.text;
        }

        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(OutcomeConstants.OUTCOME_ID, getId());
                jSONObject.put("text", getText());
                jSONObject.put("icon", getIcon());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        public ActionButton(String str, String str2, String str3) {
            this.id = str;
            this.text = str2;
            this.icon = str3;
        }

        public /* synthetic */ ActionButton(String str, String str2, String str3, int i2, e eVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Notification(JSONObject payload, ITime time) {
        this(null, payload, 0, time);
        i.e(payload, "payload");
        i.e(time, "time");
    }

    private final void initPayloadData(JSONObject jSONObject, ITime iTime) {
        try {
            JSONObject customJSONObject = NotificationHelper.INSTANCE.getCustomJSONObject(jSONObject);
            long currentTimeMillis = iTime.getCurrentTimeMillis();
            if (jSONObject.has(NotificationConstants.GOOGLE_TTL_KEY)) {
                setSentTime(jSONObject.optLong(NotificationConstants.GOOGLE_SENT_TIME_KEY, currentTimeMillis) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                setTtl(jSONObject.optInt(NotificationConstants.GOOGLE_TTL_KEY, 259200));
            } else if (jSONObject.has("hms.ttl")) {
                setSentTime(jSONObject.optLong("hms.sent_time", currentTimeMillis) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                setTtl(jSONObject.optInt("hms.ttl", 259200));
            } else {
                setSentTime(currentTimeMillis / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                setTtl(259200);
            }
            setNotificationId(JSONObjectExtensionsKt.safeString(customJSONObject, "i"));
            setTemplateId(JSONObjectExtensionsKt.safeString(customJSONObject, "ti"));
            setTemplateName(JSONObjectExtensionsKt.safeString(customJSONObject, "tn"));
            String jSONObject2 = jSONObject.toString();
            i.d(jSONObject2, "toString(...)");
            setRawPayload(jSONObject2);
            setAdditionalData(JSONObjectExtensionsKt.safeJSONObject(customJSONObject, "a"));
            setLaunchURL(JSONObjectExtensionsKt.safeString(customJSONObject, "u"));
            setBody(JSONObjectExtensionsKt.safeString(jSONObject, "alert"));
            setTitle(JSONObjectExtensionsKt.safeString(jSONObject, OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE));
            setSmallIcon(JSONObjectExtensionsKt.safeString(jSONObject, "sicon"));
            setBigPicture(JSONObjectExtensionsKt.safeString(jSONObject, "bicon"));
            setLargeIcon(JSONObjectExtensionsKt.safeString(jSONObject, "licon"));
            setSound(JSONObjectExtensionsKt.safeString(jSONObject, "sound"));
            setGroupKey(JSONObjectExtensionsKt.safeString(jSONObject, "grp"));
            setGroupMessage(JSONObjectExtensionsKt.safeString(jSONObject, "grp_msg"));
            setSmallIconAccentColor(JSONObjectExtensionsKt.safeString(jSONObject, "bgac"));
            setLedColor(JSONObjectExtensionsKt.safeString(jSONObject, "ledc"));
            String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "vis");
            if (safeString != null) {
                setLockScreenVisibility(Integer.parseInt(safeString));
            }
            setFromProjectNumber(JSONObjectExtensionsKt.safeString(jSONObject, "from"));
            setPriority(jSONObject.optInt("pri", 0));
            String safeString2 = JSONObjectExtensionsKt.safeString(jSONObject, "collapse_key");
            if (!"do_not_collapse".equals(safeString2)) {
                setCollapseId(safeString2);
            }
            try {
                setActionButtonsFromData();
            } catch (Throwable th) {
                Logging.error("Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayoutFromData(jSONObject);
            } catch (Throwable th2) {
                Logging.error("Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            Logging.error("Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private final void setActionButtonsFromData() {
        if (getAdditionalData() != null) {
            JSONObject additionalData = getAdditionalData();
            i.b(additionalData);
            if (additionalData.has("actionButtons")) {
                JSONObject additionalData2 = getAdditionalData();
                i.b(additionalData2);
                JSONArray jSONArray = additionalData2.getJSONArray("actionButtons");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    i.b(jSONObject);
                    arrayList.add(new ActionButton(JSONObjectExtensionsKt.safeString(jSONObject, OutcomeConstants.OUTCOME_ID), JSONObjectExtensionsKt.safeString(jSONObject, "text"), JSONObjectExtensionsKt.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                i.b(additionalData3);
                additionalData3.remove(NotificationConstants.GENERATE_NOTIFICATION_BUNDLE_KEY_ACTION_ID);
                JSONObject additionalData4 = getAdditionalData();
                i.b(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) {
        String safeString = JSONObjectExtensionsKt.safeString(jSONObject, "bg_img");
        if (safeString != null) {
            JSONObject jSONObject2 = new JSONObject(safeString);
            setBackgroundImageLayout(new BackgroundImageLayout(JSONObjectExtensionsKt.safeString(jSONObject2, "img"), JSONObjectExtensionsKt.safeString(jSONObject2, "tc"), JSONObjectExtensionsKt.safeString(jSONObject2, "bc")));
        }
    }

    @Override // com.onesignal.notifications.IDisplayableNotification
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // com.onesignal.notifications.INotification
    public List<IActionButton> getActionButtons() {
        return this.actionButtons;
    }

    @Override // com.onesignal.notifications.INotification
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // com.onesignal.notifications.INotification
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // com.onesignal.notifications.INotification
    public BackgroundImageLayout getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // com.onesignal.notifications.INotification
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // com.onesignal.notifications.INotification
    public String getBody() {
        return this.body;
    }

    @Override // com.onesignal.notifications.INotification
    public String getCollapseId() {
        return this.collapseId;
    }

    public final WaiterWithValue<Boolean> getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // com.onesignal.notifications.INotification
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // com.onesignal.notifications.INotification
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // com.onesignal.notifications.INotification
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // com.onesignal.notifications.INotification
    public List<Notification> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // com.onesignal.notifications.INotification
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // com.onesignal.notifications.INotification
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // com.onesignal.notifications.INotification
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // com.onesignal.notifications.INotification
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final q getNotificationExtender() {
        return null;
    }

    @Override // com.onesignal.notifications.INotification
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // com.onesignal.notifications.INotification
    public int getPriority() {
        return this.priority;
    }

    @Override // com.onesignal.notifications.INotification
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // com.onesignal.notifications.INotification
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // com.onesignal.notifications.INotification
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // com.onesignal.notifications.INotification
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // com.onesignal.notifications.INotification
    public String getSound() {
        return this.sound;
    }

    @Override // com.onesignal.notifications.INotification
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // com.onesignal.notifications.INotification
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // com.onesignal.notifications.INotification
    public String getTitle() {
        return this.title;
    }

    @Override // com.onesignal.notifications.INotification
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends IActionButton> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i2) {
        this.androidNotificationId = i2;
    }

    public void setBackgroundImageLayout(BackgroundImageLayout backgroundImageLayout) {
        this.backgroundImageLayout = backgroundImageLayout;
    }

    public void setBigPicture(String str) {
        this.bigPicture = str;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCollapseId(String str) {
        this.collapseId = str;
    }

    public void setFromProjectNumber(String str) {
        this.fromProjectNumber = str;
    }

    public void setGroupKey(String str) {
        this.groupKey = str;
    }

    public void setGroupMessage(String str) {
        this.groupMessage = str;
    }

    public void setGroupedNotifications(List<Notification> list) {
        this.groupedNotifications = list;
    }

    public void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public void setLaunchURL(String str) {
        this.launchURL = str;
    }

    public void setLedColor(String str) {
        this.ledColor = str;
    }

    public void setLockScreenVisibility(int i2) {
        this.lockScreenVisibility = i2;
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setPriority(int i2) {
        this.priority = i2;
    }

    public void setRawPayload(String str) {
        i.e(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j2) {
        this.sentTime = j2;
    }

    public void setSmallIcon(String str) {
        this.smallIcon = str;
    }

    public void setSmallIconAccentColor(String str) {
        this.smallIconAccentColor = str;
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTtl(int i2) {
        this.ttl = i2;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<Notification> groupedNotifications = getGroupedNotifications();
                i.b(groupedNotifications);
                Iterator<Notification> it = groupedNotifications.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", getNotificationId());
            jSONObject.put("templateName", getTemplateName());
            jSONObject.put("templateId", getTemplateId());
            jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, getTitle());
            jSONObject.put("body", getBody());
            jSONObject.put("smallIcon", getSmallIcon());
            jSONObject.put("largeIcon", getLargeIcon());
            jSONObject.put("bigPicture", getBigPicture());
            jSONObject.put("smallIconAccentColor", getSmallIconAccentColor());
            jSONObject.put("launchURL", getLaunchURL());
            jSONObject.put("sound", getSound());
            jSONObject.put("ledColor", getLedColor());
            jSONObject.put("lockScreenVisibility", getLockScreenVisibility());
            jSONObject.put("groupKey", getGroupKey());
            jSONObject.put("groupMessage", getGroupMessage());
            jSONObject.put("fromProjectNumber", getFromProjectNumber());
            jSONObject.put("collapseId", getCollapseId());
            jSONObject.put("priority", getPriority());
            if (getAdditionalData() != null) {
                jSONObject.put("additionalData", getAdditionalData());
            }
            if (getActionButtons() != null) {
                JSONArray jSONArray2 = new JSONArray();
                List<IActionButton> actionButtons = getActionButtons();
                i.b(actionButtons);
                for (IActionButton iActionButton : actionButtons) {
                    i.c(iActionButton, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((ActionButton) iActionButton).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public Notification(List<Notification> list, JSONObject jsonPayload, int i2, ITime time) {
        i.e(jsonPayload, "jsonPayload");
        i.e(time, "time");
        this.displayWaiter = new WaiterWithValue<>();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jsonPayload, time);
        setGroupedNotifications(list);
        setAndroidNotificationId(i2);
    }

    @Override // com.onesignal.notifications.IMutableNotification
    public void setExtender(q qVar) {
    }

    public final void setNotificationExtender(q qVar) {
    }
}
