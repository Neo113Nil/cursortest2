package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f5154a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5155b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f5156a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f5157b;

        public /* synthetic */ Builder(String str, int i3) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f5157b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f5156a = str;
            this.f5157b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f5155b;
    }

    public String getTrackingId() {
        return this.f5154a;
    }

    private PreloadInfo(Builder builder) {
        this.f5154a = builder.f5156a;
        this.f5155b = CollectionUtils.unmodifiableMapCopy(builder.f5157b);
    }
}
