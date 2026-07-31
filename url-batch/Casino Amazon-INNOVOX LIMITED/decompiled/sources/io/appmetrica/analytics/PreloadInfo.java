package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f549a;
    private final Map b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f550a;
        private final HashMap b;

        /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f550a = str;
            this.b = new HashMap();
        }
    }

    /* synthetic */ PreloadInfo(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.b;
    }

    public String getTrackingId() {
        return this.f549a;
    }

    private PreloadInfo(Builder builder) {
        this.f549a = builder.f550a;
        this.b = CollectionUtils.unmodifiableMapCopy(builder.b);
    }
}
