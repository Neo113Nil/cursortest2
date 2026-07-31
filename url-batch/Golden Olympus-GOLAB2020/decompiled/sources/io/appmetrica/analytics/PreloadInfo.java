package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f36836a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f36837b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f36838a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f36839b;

        /* synthetic */ Builder(String str, int i4) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f36839b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f36838a = str;
            this.f36839b = new HashMap();
        }
    }

    /* synthetic */ PreloadInfo(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f36837b;
    }

    public String getTrackingId() {
        return this.f36836a;
    }

    private PreloadInfo(Builder builder) {
        this.f36836a = builder.f36838a;
        this.f36837b = CollectionUtils.unmodifiableMapCopy(builder.f36839b);
    }
}
