package com.onesignal.inAppMessages.internal;

import com.onesignal.common.DateUtils;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.inAppMessages.IInAppMessage;
import g4.AbstractC0465j;
import g4.C0471p;
import g4.C0472q;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppMessage implements IInAppMessage {
    public static final Companion Companion = new Companion(null);
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private Date endTime;
    private boolean hasLiquid;
    private boolean isDisplayedInSession;
    private boolean isPreview;
    private boolean isTriggerChanged;
    private final String messageId;
    private InAppMessageRedisplayStats redisplayStats;
    private List<? extends List<Trigger>> triggers;
    private Map<String, ? extends Map<String, String>> variants;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppMessage(String messageId, ITime time) {
        i.e(messageId, "messageId");
        i.e(time, "time");
        this.messageId = messageId;
        this.variants = C0472q.f5751a;
        this.triggers = C0471p.f5750a;
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new InAppMessageRedisplayStats(time);
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(END_TIME);
            i.b(string);
            if (string.equals("null")) {
                return null;
            }
            try {
                return DateUtils.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e3) {
                e3.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private final ArrayList<ArrayList<Trigger>> parseTriggerJson(JSONArray jSONArray) {
        ArrayList<ArrayList<Trigger>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            ArrayList<Trigger> arrayList2 = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i3);
                i.d(jSONObject, "getJSONObject(...)");
                arrayList2.add(new Trigger(jSONObject));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap<String, String> hashMap2 = new HashMap<>();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                i.b(next2);
                String string = jSONObject2.getString(next2);
                i.d(string, "getString(...)");
                hashMap2.put(next2, string);
            }
            i.b(next);
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    public final void addClickId(String clickId) {
        i.e(clickId, "clickId");
        this.clickedClickIds.add(clickId);
    }

    public final void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !InAppMessage.class.equals(obj.getClass())) {
            return false;
        }
        return i.a(getMessageId(), ((InAppMessage) obj).getMessageId());
    }

    public final Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    public final double getDisplayDuration() {
        return this.displayDuration;
    }

    public final boolean getHasLiquid() {
        return this.hasLiquid;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessage
    public String getMessageId() {
        return this.messageId;
    }

    public final InAppMessageRedisplayStats getRedisplayStats() {
        return this.redisplayStats;
    }

    public final List<List<Trigger>> getTriggers() {
        return this.triggers;
    }

    public final Map<String, Map<String, String>> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return getMessageId().hashCode();
    }

    public final boolean isClickAvailable(String clickId) {
        i.e(clickId, "clickId");
        return !this.clickedClickIds.contains(clickId);
    }

    public final boolean isDisplayedInSession() {
        return this.isDisplayedInSession;
    }

    public final boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        Date date2 = this.endTime;
        i.b(date2);
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String clickId) {
        i.e(clickId, "clickId");
        this.clickedClickIds.remove(clickId);
    }

    public final void setDisplayDuration(double d6) {
        this.displayDuration = d6;
    }

    public final void setDisplayedInSession(boolean z) {
        this.isDisplayedInSession = z;
    }

    public final void setTriggerChanged(boolean z) {
        this.isTriggerChanged = z;
    }

    public final boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, getMessageId());
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.variants.keySet()) {
                Map<String, String> map = this.variants.get(str);
                i.b(map);
                Map<String, String> map2 = map;
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : map2.keySet()) {
                    jSONObject3.put(str2, map2.get(str2));
                }
                jSONObject2.put(str, jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            for (List<Trigger> list : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<Trigger> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, DateUtils.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessage(boolean z, ITime time) {
        this("", time);
        i.e(time, "time");
        this.isPreview = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessage(String messageId, Set<String> clickIds, boolean z, InAppMessageRedisplayStats redisplayStats, ITime time) {
        this(messageId, time);
        i.e(messageId, "messageId");
        i.e(clickIds, "clickIds");
        i.e(redisplayStats, "redisplayStats");
        i.e(time, "time");
        this.clickedClickIds = AbstractC0465j.W0(clickIds);
        this.isDisplayedInSession = z;
        this.redisplayStats = redisplayStats;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InAppMessage(JSONObject json, ITime time) {
        this(r0, time);
        i.e(json, "json");
        i.e(time, "time");
        String string = json.getString("id");
        i.d(string, "getString(...)");
        JSONObject jSONObject = json.getJSONObject(IAM_VARIANTS);
        i.d(jSONObject, "getJSONObject(...)");
        this.variants = parseVariants(jSONObject);
        JSONArray jSONArray = json.getJSONArray(IAM_TRIGGERS);
        i.d(jSONArray, "getJSONArray(...)");
        this.triggers = parseTriggerJson(jSONArray);
        this.endTime = parseEndTimeJson(json);
        if (json.has(HAS_LIQUID)) {
            this.hasLiquid = json.getBoolean(HAS_LIQUID);
        }
        if (json.has(IAM_REDISPLAY_STATS)) {
            JSONObject jSONObject2 = json.getJSONObject(IAM_REDISPLAY_STATS);
            i.d(jSONObject2, "getJSONObject(...)");
            this.redisplayStats = new InAppMessageRedisplayStats(jSONObject2, time);
        }
    }
}
