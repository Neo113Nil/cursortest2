package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import com.startapp.sdk.adsbase.remoteconfig.TimeoutConfig;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HttpClientConfig implements Serializable {
    private static final long serialVersionUID = -8600520052388289445L;
    private String headersFormat;

    @TypeInfo(complex = true, parser = MapIntTimeoutParser.class)
    private Map<Integer, TimeoutConfig> timeout;
    private boolean compressionEnabled = false;
    private boolean disableSendAdvertisingId = false;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    @TypeInfo(type = HashSet.class)
    private Set<String> traceHeaders = Collections.unmodifiableSet(new HashSet(Arrays.asList("server-timing", "siosid")));

    public static class MapIntTimeoutParser implements TypeParser<Map<Integer, TimeoutConfig>> {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0016 A[SYNTHETIC] */
        @Override // com.startapp.json.TypeParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Map<Integer, TimeoutConfig> parse(Class<Map<Integer, TimeoutConfig>> cls, Object obj) {
            int parseInt;
            TimeoutConfig.Parser parser = new TimeoutConfig.Parser();
            if (!(obj instanceof JSONObject)) {
                TimeoutConfig parse = parser.parse(TimeoutConfig.class, obj);
                if (parse != null) {
                    return Collections.singletonMap(-1, parse);
                }
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                TimeoutConfig parse2 = parser.parse(TimeoutConfig.class, jSONObject.opt(next));
                if (parse2 != null) {
                    WeakHashMap weakHashMap = si.f7575a;
                    if (next != null) {
                        try {
                            parseInt = Integer.parseInt(next);
                        } catch (NumberFormatException unused) {
                        }
                        if (parseInt == 0) {
                            linkedHashMap.put(Integer.valueOf(parseInt), parse2);
                        }
                    }
                    parseInt = 0;
                    if (parseInt == 0) {
                    }
                }
            }
            return linkedHashMap;
        }
    }

    public final void a(boolean z) {
        this.compressionEnabled = z;
    }

    public final void b(boolean z) {
        this.disableSendAdvertisingId = z;
    }

    public final TimeoutConfig c() {
        Map<Integer, TimeoutConfig> map = this.timeout;
        if (map != null) {
            return map.get(-1);
        }
        return null;
    }

    public final Set d() {
        return this.traceHeaders;
    }

    public final boolean e() {
        return this.compressionEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpClientConfig httpClientConfig = (HttpClientConfig) obj;
            if (this.compressionEnabled == httpClientConfig.compressionEnabled && this.disableSendAdvertisingId == httpClientConfig.disableSendAdvertisingId && si.a(this.timeout, httpClientConfig.timeout) && si.a((Object) this.infoEvents, (Object) httpClientConfig.infoEvents) && si.a(this.traceHeaders, httpClientConfig.traceHeaders) && si.a((Object) this.headersFormat, (Object) httpClientConfig.headersFormat)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.disableSendAdvertisingId;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.disableSendAdvertisingId), this.timeout, this.infoEvents, this.traceHeaders, this.headersFormat};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public final TimeoutConfig a(int i4) {
        Map<Integer, TimeoutConfig> map;
        if (i4 != 0 && (map = this.timeout) != null) {
            for (Map.Entry<Integer, TimeoutConfig> entry : map.entrySet()) {
                if (((entry.getKey() != null ? entry.getKey().intValue() : 0) & i4) == i4) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final String a() {
        return this.headersFormat;
    }
}
