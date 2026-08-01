package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {
    public static final a Companion = new a(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final sa.a _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(JSONObject jSONObject, sa.a aVar) {
        this(aVar);
        jSONObject.getClass();
        aVar.getClass();
        this.isRedisplayEnabled = true;
        Object obj = jSONObject.get(DISPLAY_LIMIT);
        Object obj2 = jSONObject.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = ((Number) obj2).intValue();
        }
    }

    public final long getDisplayDelay() {
        return this.displayDelay;
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public final void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    public final boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        long j = currentTimeMillis - this.lastDisplayTime;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j + " displayDelay: " + this.displayDelay, null, 2, null);
        return j >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j) {
        this.displayDelay = j;
    }

    public final void setDisplayLimit(int i3) {
        this.displayLimit = i3;
    }

    public final void setDisplayQuantity(int i3) {
        this.displayQuantity = i3;
    }

    public final void setDisplayStats(h hVar) {
        hVar.getClass();
        this.lastDisplayTime = hVar.lastDisplayTime;
        this.displayQuantity = hVar.displayQuantity;
    }

    public final void setLastDisplayTime(long j) {
        this.lastDisplayTime = j;
    }

    public final boolean shouldDisplayAgain() {
        boolean z10 = this.displayQuantity < this.displayLimit;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage shouldDisplayAgain: " + z10, null, 2, null);
        return z10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i3, long j, sa.a aVar) {
        this(aVar);
        aVar.getClass();
        this.displayQuantity = i3;
        this.lastDisplayTime = j;
    }

    public h(sa.a aVar) {
        aVar.getClass();
        this._time = aVar;
        this.lastDisplayTime = -1L;
        this.displayLimit = 1;
    }
}
