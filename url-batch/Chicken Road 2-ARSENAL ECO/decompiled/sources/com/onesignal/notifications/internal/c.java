package com.onesignal.notifications.internal;

import g2.InterfaceC0391a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.q;

/* loaded from: classes.dex */
public final class c implements F2.c {
    private List<? extends F2.b> actionButtons;
    private JSONObject additionalData;
    private int androidNotificationId;
    private F2.a backgroundImageLayout;
    private String bigPicture;
    private String body;
    private String collapseId;
    private final com.onesignal.common.threading.d displayWaiter;
    private String fromProjectNumber;
    private String groupKey;
    private String groupMessage;
    private List<c> groupedNotifications;
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

    public static final class a implements F2.b {
        private final String icon;
        private final String id;
        private final String text;

        public a() {
            this(null, null, null, 7, null);
        }

        @Override // F2.b
        public String getIcon() {
            return this.icon;
        }

        @Override // F2.b
        public String getId() {
            return this.id;
        }

        @Override // F2.b
        public String getText() {
            return this.text;
        }

        public final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", getId());
                jSONObject.put("text", getText());
                jSONObject.put("icon", getIcon());
                return jSONObject;
            } catch (Throwable th) {
                th.printStackTrace();
                return jSONObject;
            }
        }

        public a(String str, String str2, String str3) {
            this.id = str;
            this.text = str2;
            this.icon = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i7, kotlin.jvm.internal.e eVar) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(JSONObject payload, InterfaceC0391a time) {
        this(null, payload, 0, time);
        i.e(payload, "payload");
        i.e(time, "time");
    }

    private final void initPayloadData(JSONObject jSONObject, InterfaceC0391a interfaceC0391a) {
        try {
            JSONObject customJSONObject = Q2.e.INSTANCE.getCustomJSONObject(jSONObject);
            long currentTimeMillis = interfaceC0391a.getCurrentTimeMillis();
            if (jSONObject.has("google.ttl")) {
                setSentTime(jSONObject.optLong("google.sent_time", currentTimeMillis) / 1000);
                setTtl(jSONObject.optInt("google.ttl", 259200));
            } else if (jSONObject.has(com.onesignal.notifications.bridges.a.HMS_TTL_KEY)) {
                setSentTime(jSONObject.optLong(com.onesignal.notifications.bridges.a.HMS_SENT_TIME_KEY, currentTimeMillis) / 1000);
                setTtl(jSONObject.optInt(com.onesignal.notifications.bridges.a.HMS_TTL_KEY, 259200));
            } else {
                setSentTime(currentTimeMillis / 1000);
                setTtl(259200);
            }
            setNotificationId(com.onesignal.common.e.safeString(customJSONObject, "i"));
            setTemplateId(com.onesignal.common.e.safeString(customJSONObject, "ti"));
            setTemplateName(com.onesignal.common.e.safeString(customJSONObject, "tn"));
            String jSONObject2 = jSONObject.toString();
            i.d(jSONObject2, "toString(...)");
            setRawPayload(jSONObject2);
            setAdditionalData(com.onesignal.common.e.safeJSONObject(customJSONObject, N2.a.PUSH_ADDITIONAL_DATA_KEY));
            setLaunchURL(com.onesignal.common.e.safeString(customJSONObject, "u"));
            setBody(com.onesignal.common.e.safeString(jSONObject, "alert"));
            setTitle(com.onesignal.common.e.safeString(jSONObject, "title"));
            setSmallIcon(com.onesignal.common.e.safeString(jSONObject, "sicon"));
            setBigPicture(com.onesignal.common.e.safeString(jSONObject, "bicon"));
            setLargeIcon(com.onesignal.common.e.safeString(jSONObject, "licon"));
            setSound(com.onesignal.common.e.safeString(jSONObject, "sound"));
            setGroupKey(com.onesignal.common.e.safeString(jSONObject, "grp"));
            setGroupMessage(com.onesignal.common.e.safeString(jSONObject, "grp_msg"));
            setSmallIconAccentColor(com.onesignal.common.e.safeString(jSONObject, "bgac"));
            setLedColor(com.onesignal.common.e.safeString(jSONObject, "ledc"));
            String safeString = com.onesignal.common.e.safeString(jSONObject, "vis");
            if (safeString != null) {
                setLockScreenVisibility(Integer.parseInt(safeString));
            }
            setFromProjectNumber(com.onesignal.common.e.safeString(jSONObject, "from"));
            setPriority(jSONObject.optInt("pri", 0));
            String safeString2 = com.onesignal.common.e.safeString(jSONObject, "collapse_key");
            if (!"do_not_collapse".equals(safeString2)) {
                setCollapseId(safeString2);
            }
            try {
                setActionButtonsFromData();
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayoutFromData(jSONObject);
            } catch (Throwable th2) {
                com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            com.onesignal.debug.internal.logging.b.error("Error assigning OSNotificationReceivedEvent payload values!", th3);
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
                for (int i7 = 0; i7 < length; i7++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i7);
                    i.b(jSONObject);
                    arrayList.add(new a(com.onesignal.common.e.safeString(jSONObject, "id"), com.onesignal.common.e.safeString(jSONObject, "text"), com.onesignal.common.e.safeString(jSONObject, "icon")));
                }
                setActionButtons(arrayList);
                JSONObject additionalData3 = getAdditionalData();
                i.b(additionalData3);
                additionalData3.remove("actionId");
                JSONObject additionalData4 = getAdditionalData();
                i.b(additionalData4);
                additionalData4.remove("actionButtons");
            }
        }
    }

    private final void setBackgroundImageLayoutFromData(JSONObject jSONObject) {
        String safeString = com.onesignal.common.e.safeString(jSONObject, "bg_img");
        if (safeString != null) {
            JSONObject jSONObject2 = new JSONObject(safeString);
            setBackgroundImageLayout(new F2.a(com.onesignal.common.e.safeString(jSONObject2, "img"), com.onesignal.common.e.safeString(jSONObject2, "tc"), com.onesignal.common.e.safeString(jSONObject2, "bc")));
        }
    }

    @Override // F2.c, F2.d
    public void display() {
        this.displayWaiter.wake(Boolean.TRUE);
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public List<F2.b> getActionButtons() {
        return this.actionButtons;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public JSONObject getAdditionalData() {
        return this.additionalData;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public int getAndroidNotificationId() {
        return this.androidNotificationId;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public F2.a getBackgroundImageLayout() {
        return this.backgroundImageLayout;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getBigPicture() {
        return this.bigPicture;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getBody() {
        return this.body;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getCollapseId() {
        return this.collapseId;
    }

    public final com.onesignal.common.threading.d getDisplayWaiter() {
        return this.displayWaiter;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getFromProjectNumber() {
        return this.fromProjectNumber;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getGroupKey() {
        return this.groupKey;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getGroupMessage() {
        return this.groupMessage;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public List<c> getGroupedNotifications() {
        return this.groupedNotifications;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getLargeIcon() {
        return this.largeIcon;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getLaunchURL() {
        return this.launchURL;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getLedColor() {
        return this.ledColor;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public int getLockScreenVisibility() {
        return this.lockScreenVisibility;
    }

    public final q getNotificationExtender() {
        return null;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public int getPriority() {
        return this.priority;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getRawPayload() {
        return this.rawPayload;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public long getSentTime() {
        return this.sentTime;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getSmallIcon() {
        return this.smallIcon;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getSmallIconAccentColor() {
        return this.smallIconAccentColor;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getSound() {
        return this.sound;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getTemplateId() {
        return this.templateId;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getTemplateName() {
        return this.templateName;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public String getTitle() {
        return this.title;
    }

    @Override // F2.c, F2.e, F2.f, F2.d
    public int getTtl() {
        return this.ttl;
    }

    public final boolean hasNotificationId() {
        return getAndroidNotificationId() != 0;
    }

    public void setActionButtons(List<? extends F2.b> list) {
        this.actionButtons = list;
    }

    public void setAdditionalData(JSONObject jSONObject) {
        this.additionalData = jSONObject;
    }

    public void setAndroidNotificationId(int i7) {
        this.androidNotificationId = i7;
    }

    public void setBackgroundImageLayout(F2.a aVar) {
        this.backgroundImageLayout = aVar;
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

    public void setGroupedNotifications(List<c> list) {
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

    public void setLockScreenVisibility(int i7) {
        this.lockScreenVisibility = i7;
    }

    public void setNotificationId(String str) {
        this.notificationId = str;
    }

    public void setPriority(int i7) {
        this.priority = i7;
    }

    public void setRawPayload(String str) {
        i.e(str, "<set-?>");
        this.rawPayload = str;
    }

    public void setSentTime(long j4) {
        this.sentTime = j4;
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

    public void setTtl(int i7) {
        this.ttl = i7;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", getAndroidNotificationId());
            JSONArray jSONArray = new JSONArray();
            if (getGroupedNotifications() != null) {
                List<c> groupedNotifications = getGroupedNotifications();
                i.b(groupedNotifications);
                Iterator<c> it = groupedNotifications.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJSONObject());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", getNotificationId());
            jSONObject.put("templateName", getTemplateName());
            jSONObject.put("templateId", getTemplateId());
            jSONObject.put("title", getTitle());
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
                List<F2.b> actionButtons = getActionButtons();
                i.b(actionButtons);
                for (F2.b bVar : actionButtons) {
                    i.c(bVar, "null cannot be cast to non-null type com.onesignal.notifications.internal.Notification.ActionButton");
                    jSONArray2.put(((a) bVar).toJSONObject());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", getRawPayload());
            return jSONObject;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSNotification{notificationExtender=null, groupedNotifications=" + getGroupedNotifications() + ", androidNotificationId=" + getAndroidNotificationId() + ", notificationId='" + getNotificationId() + "', templateName='" + getTemplateName() + "', templateId='" + getTemplateId() + "', title='" + getTitle() + "', body='" + getBody() + "', additionalData=" + getAdditionalData() + ", smallIcon='" + getSmallIcon() + "', largeIcon='" + getLargeIcon() + "', bigPicture='" + getBigPicture() + "', smallIconAccentColor='" + getSmallIconAccentColor() + "', launchURL='" + getLaunchURL() + "', sound='" + getSound() + "', ledColor='" + getLedColor() + "', lockScreenVisibility=" + getLockScreenVisibility() + ", groupKey='" + getGroupKey() + "', groupMessage='" + getGroupMessage() + "', actionButtons=" + getActionButtons() + ", fromProjectNumber='" + getFromProjectNumber() + "', backgroundImageLayout=" + getBackgroundImageLayout() + ", collapseId='" + getCollapseId() + "', priority=" + getPriority() + ", rawPayload='" + getRawPayload() + "'}";
    }

    public c(List<c> list, JSONObject jsonPayload, int i7, InterfaceC0391a time) {
        i.e(jsonPayload, "jsonPayload");
        i.e(time, "time");
        this.displayWaiter = new com.onesignal.common.threading.d();
        this.lockScreenVisibility = 1;
        this.rawPayload = "";
        initPayloadData(jsonPayload, time);
        setGroupedNotifications(list);
        setAndroidNotificationId(i7);
    }

    @Override // F2.c, F2.e
    public void setExtender(q qVar) {
    }

    public final void setNotificationExtender(q qVar) {
    }
}
