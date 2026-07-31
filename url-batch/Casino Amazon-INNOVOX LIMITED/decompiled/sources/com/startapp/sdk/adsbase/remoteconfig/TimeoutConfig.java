package com.startapp.sdk.adsbase.remoteconfig;

import androidx.work.PeriodicWorkRequest;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class TimeoutConfig implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeoutConfig f156a = new TimeoutConfig(10000, 10000, 60000);
    private static final long serialVersionUID = -900203708824534865L;
    private final long connect;
    private final long read;
    private final long total;

    /* compiled from: Sta */
    public static class Parser implements TypeParser<TimeoutConfig> {
        private Long parseDuration(Object obj) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (!(obj instanceof String)) {
                return null;
            }
            long e = zh.e((String) obj);
            if (e > 0) {
                return Long.valueOf(e);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public TimeoutConfig parse(Class<TimeoutConfig> cls, Object obj) {
            Long parseDuration = parseDuration(obj);
            if (parseDuration != null) {
                return new TimeoutConfig(parseDuration.longValue());
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Long parseDuration2 = parseDuration(jSONObject.opt("connect"));
            Long parseDuration3 = parseDuration(jSONObject.opt("read"));
            Long parseDuration4 = parseDuration(jSONObject.opt("total"));
            long longValue = parseDuration2 != null ? parseDuration2.longValue() : 0L;
            long longValue2 = parseDuration3 != null ? parseDuration3.longValue() : 0L;
            long longValue3 = parseDuration4 != null ? parseDuration4.longValue() : 0L;
            long min = Math.min(Math.max(1000L, longValue), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            long min2 = Math.min(Math.max(1000L, longValue2), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
            return new TimeoutConfig(min, min2, Math.max(Math.max(min, min2), Math.min(Math.max(1000L, longValue3), PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS)));
        }
    }

    public TimeoutConfig(long j) {
        this.connect = j;
        this.read = j;
        this.total = j;
    }

    public final long a() {
        return this.connect;
    }

    public final long b() {
        return this.read;
    }

    public final long c() {
        return this.total;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeoutConfig timeoutConfig = (TimeoutConfig) obj;
            if (this.connect == timeoutConfig.connect && this.read == timeoutConfig.read && this.total == timeoutConfig.total) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.connect), Long.valueOf(this.read), Long.valueOf(this.total)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public TimeoutConfig(long j, long j2, long j3) {
        this.connect = j;
        this.read = j2;
        this.total = j3;
    }
}
