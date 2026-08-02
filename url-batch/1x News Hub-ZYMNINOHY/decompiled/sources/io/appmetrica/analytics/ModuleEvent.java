package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f5138a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5139b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5140c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5141d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f5142e;
    private final List f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5143g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5144h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f5145a;

        /* renamed from: b, reason: collision with root package name */
        private String f5146b;

        /* renamed from: c, reason: collision with root package name */
        private String f5147c;

        /* renamed from: d, reason: collision with root package name */
        private int f5148d;

        /* renamed from: e, reason: collision with root package name */
        private Category f5149e;
        private HashMap f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f5150g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f5151h;

        public /* synthetic */ Builder(int i3, int i4) {
            this(i3);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f5151h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f5149e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f5150g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f5146b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i3) {
            this.f5148d = i3;
            return this;
        }

        public Builder withValue(String str) {
            this.f5147c = str;
            return this;
        }

        private Builder(int i3) {
            this.f5148d = 1;
            this.f5149e = Category.GENERAL;
            this.f5145a = i3;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newBuilder(int i3) {
        return new Builder(i3, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f5144h);
    }

    public Category getCategory() {
        return this.f5142e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f5143g);
    }

    public String getName() {
        return this.f5139b;
    }

    public int getServiceDataReporterType() {
        return this.f5141d;
    }

    public int getType() {
        return this.f5138a;
    }

    public String getValue() {
        return this.f5140c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f5138a + ", name='" + this.f5139b + "', value='" + this.f5140c + "', serviceDataReporterType=" + this.f5141d + ", category=" + this.f5142e + ", environment=" + this.f + ", extras=" + this.f5143g + ", attributes=" + this.f5144h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f5138a = builder.f5145a;
        this.f5139b = builder.f5146b;
        this.f5140c = builder.f5147c;
        this.f5141d = builder.f5148d;
        this.f5142e = builder.f5149e;
        this.f = CollectionUtils.getListFromMap(builder.f);
        this.f5143g = CollectionUtils.getListFromMap(builder.f5150g);
        this.f5144h = CollectionUtils.getListFromMap(builder.f5151h);
    }
}
