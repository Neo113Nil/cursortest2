package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f9369a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9370b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9371c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9372d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f9373e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9374f;

    /* renamed from: g, reason: collision with root package name */
    private final List f9375g;

    /* renamed from: h, reason: collision with root package name */
    private final List f9376h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f9377a;

        /* renamed from: b, reason: collision with root package name */
        private String f9378b;

        /* renamed from: c, reason: collision with root package name */
        private String f9379c;

        /* renamed from: d, reason: collision with root package name */
        private int f9380d;

        /* renamed from: e, reason: collision with root package name */
        private Category f9381e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f9382f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f9383g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f9384h;

        public /* synthetic */ Builder(int i4, int i5) {
            this(i4);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f9384h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f9381e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f9382f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f9383g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f9378b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i4) {
            this.f9380d = i4;
            return this;
        }

        public Builder withValue(String str) {
            this.f9379c = str;
            return this;
        }

        private Builder(int i4) {
            this.f9380d = 1;
            this.f9381e = Category.GENERAL;
            this.f9377a = i4;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newBuilder(int i4) {
        return new Builder(i4, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f9376h);
    }

    public Category getCategory() {
        return this.f9373e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f9374f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f9375g);
    }

    public String getName() {
        return this.f9370b;
    }

    public int getServiceDataReporterType() {
        return this.f9372d;
    }

    public int getType() {
        return this.f9369a;
    }

    public String getValue() {
        return this.f9371c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f9369a + ", name='" + this.f9370b + "', value='" + this.f9371c + "', serviceDataReporterType=" + this.f9372d + ", category=" + this.f9373e + ", environment=" + this.f9374f + ", extras=" + this.f9375g + ", attributes=" + this.f9376h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f9369a = builder.f9377a;
        this.f9370b = builder.f9378b;
        this.f9371c = builder.f9379c;
        this.f9372d = builder.f9380d;
        this.f9373e = builder.f9381e;
        this.f9374f = CollectionUtils.getListFromMap(builder.f9382f);
        this.f9375g = CollectionUtils.getListFromMap(builder.f9383g);
        this.f9376h = CollectionUtils.getListFromMap(builder.f9384h);
    }
}
