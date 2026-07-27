package com.onesignal.inAppMessages.internal;

import b2.AbstractC0279e;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppMessageRedisplayStats {
    public static final Companion Companion = new Companion(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final ITime _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppMessageRedisplayStats(ITime _time) {
        i.e(_time, "_time");
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
        long currentTimeMillis = this._time.getCurrentTimeMillis() / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        long j2 = currentTimeMillis - this.lastDisplayTime;
        Logging.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j2 + " displayDelay: " + this.displayDelay, null, 2, null);
        return j2 >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j2) {
        this.displayDelay = j2;
    }

    public final void setDisplayLimit(int i2) {
        this.displayLimit = i2;
    }

    public final void setDisplayQuantity(int i2) {
        this.displayQuantity = i2;
    }

    public final void setDisplayStats(InAppMessageRedisplayStats displayStats) {
        i.e(displayStats, "displayStats");
        this.lastDisplayTime = displayStats.lastDisplayTime;
        this.displayQuantity = displayStats.displayQuantity;
    }

    public final void setLastDisplayTime(long j2) {
        this.lastDisplayTime = j2;
    }

    public final boolean shouldDisplayAgain() {
        boolean z = this.displayQuantity < this.displayLimit;
        Logging.debug$default("OSInAppMessage shouldDisplayAgain: " + z, null, 2, null);
        return z;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OSInAppMessageDisplayStats{lastDisplayTime=");
        sb.append(this.lastDisplayTime);
        sb.append(", displayQuantity=");
        sb.append(this.displayQuantity);
        sb.append(", displayLimit=");
        sb.append(this.displayLimit);
        sb.append(", displayDelay=");
        return AbstractC0279e.g(sb, this.displayDelay, '}');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageRedisplayStats(int i2, long j2, ITime time) {
        this(time);
        i.e(time, "time");
        this.displayQuantity = i2;
        this.lastDisplayTime = j2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageRedisplayStats(JSONObject json, ITime time) {
        this(time);
        i.e(json, "json");
        i.e(time, "time");
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
