package com.onesignal.inAppMessages.internal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements wa.a {
    public static final C0023a Companion = new C0023a(null);
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
    private h redisplayStats;
    private List<? extends List<m>> triggers;
    private Map<String, ? extends Map<String, String>> variants;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject jSONObject, sa.a aVar) {
        this(r0, aVar);
        jSONObject.getClass();
        aVar.getClass();
        String string = jSONObject.getString(ID);
        string.getClass();
        JSONObject jSONObject2 = jSONObject.getJSONObject(IAM_VARIANTS);
        jSONObject2.getClass();
        this.variants = parseVariants(jSONObject2);
        JSONArray jSONArray = jSONObject.getJSONArray(IAM_TRIGGERS);
        jSONArray.getClass();
        this.triggers = parseTriggerJson(jSONArray);
        this.endTime = parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(IAM_REDISPLAY_STATS);
            jSONObject3.getClass();
            this.redisplayStats = new h(jSONObject3, aVar);
        }
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(END_TIME);
            string.getClass();
            if (string.equals("null")) {
                return null;
            }
            try {
                return com.onesignal.common.b.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private final ArrayList<ArrayList<m>> parseTriggerJson(JSONArray jSONArray) {
        ArrayList<ArrayList<m>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i3);
            ArrayList<m> arrayList2 = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i10 = 0; i10 < length2; i10++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i10);
                jSONObject.getClass();
                arrayList2.add(new m(jSONObject));
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
                next2.getClass();
                String string = jSONObject2.getString(next2);
                string.getClass();
                hashMap2.put(next2, string);
            }
            next.getClass();
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    public final void addClickId(String str) {
        str.getClass();
        this.clickedClickIds.add(str);
    }

    public final void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(getMessageId(), ((a) obj).getMessageId());
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

    @Override // wa.a
    public String getMessageId() {
        return this.messageId;
    }

    public final h getRedisplayStats() {
        return this.redisplayStats;
    }

    public final List<List<m>> getTriggers() {
        return this.triggers;
    }

    public final Map<String, Map<String, String>> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return getMessageId().hashCode();
    }

    public final boolean isClickAvailable(String str) {
        str.getClass();
        return !this.clickedClickIds.contains(str);
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
        date2.getClass();
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String str) {
        str.getClass();
        this.clickedClickIds.remove(str);
    }

    public final void setDisplayDuration(double d10) {
        this.displayDuration = d10;
    }

    public final void setDisplayedInSession(boolean z10) {
        this.isDisplayedInSession = z10;
    }

    public final void setTriggerChanged(boolean z10) {
        this.isTriggerChanged = z10;
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
                map.getClass();
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
            for (List<m> list : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<m> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, com.onesignal.common.b.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.a$a, reason: collision with other inner class name */
    public static final class C0023a {
        public /* synthetic */ C0023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0023a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, sa.a aVar) {
        this("", aVar);
        aVar.getClass();
        this.isPreview = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, Set<String> set, boolean z10, h hVar, sa.a aVar) {
        this(str, aVar);
        str.getClass();
        set.getClass();
        hVar.getClass();
        aVar.getClass();
        this.clickedClickIds = CollectionsKt.S(set);
        this.isDisplayedInSession = z10;
        this.redisplayStats = hVar;
    }

    public a(String str, sa.a aVar) {
        str.getClass();
        aVar.getClass();
        this.messageId = str;
        k0 k0Var = k0.f5575d;
        k0Var.getClass();
        this.variants = k0Var;
        this.triggers = j0.f5574d;
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new h(aVar);
    }
}
