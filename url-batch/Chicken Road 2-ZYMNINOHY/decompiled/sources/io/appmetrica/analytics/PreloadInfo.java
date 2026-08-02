package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f9387a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9388b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f9389a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f9390b;

        public /* synthetic */ Builder(String str, int i4) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f9390b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f9389a = str;
            this.f9390b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f9388b;
    }

    public String getTrackingId() {
        return this.f9387a;
    }

    private PreloadInfo(Builder builder) {
        this.f9387a = builder.f9389a;
        this.f9388b = CollectionUtils.unmodifiableMapCopy(builder.f9390b);
    }
}
