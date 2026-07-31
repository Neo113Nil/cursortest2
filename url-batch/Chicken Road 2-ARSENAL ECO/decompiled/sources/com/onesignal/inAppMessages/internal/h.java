package com.onesignal.inAppMessages.internal;

import g2.InterfaceC0391a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {
    public static final a Companion = new a(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final InterfaceC0391a _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public h(InterfaceC0391a _time) {
        kotlin.jvm.internal.i.e(_time, "_time");
        this._time = _time;
        this.lastDisplayTime = -1L;
        this.displayLimit = 1;
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
        long j4 = currentTimeMillis - this.lastDisplayTime;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j4 + " displayDelay: " + this.displayDelay, null, 2, null);
        return j4 >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j4) {
        this.displayDelay = j4;
    }

    public final void setDisplayLimit(int i7) {
        this.displayLimit = i7;
    }

    public final void setDisplayQuantity(int i7) {
        this.displayQuantity = i7;
    }

    public final void setDisplayStats(h displayStats) {
        kotlin.jvm.internal.i.e(displayStats, "displayStats");
        this.lastDisplayTime = displayStats.lastDisplayTime;
        this.displayQuantity = displayStats.displayQuantity;
    }

    public final void setLastDisplayTime(long j4) {
        this.lastDisplayTime = j4;
    }

    public final boolean shouldDisplayAgain() {
        boolean z5 = this.displayQuantity < this.displayLimit;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage shouldDisplayAgain: " + z5, null, 2, null);
        return z5;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i7, long j4, InterfaceC0391a time) {
        this(time);
        kotlin.jvm.internal.i.e(time, "time");
        this.displayQuantity = i7;
        this.lastDisplayTime = j4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(JSONObject json, InterfaceC0391a time) {
        this(time);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(time, "time");
        this.isRedisplayEnabled = true;
        Object obj = json.get(DISPLAY_LIMIT);
        Object obj2 = json.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = ((Number) obj2).intValue();
        }
    }
}
