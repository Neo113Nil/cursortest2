package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class InternalModuleEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f9777a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9778b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9779c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f9780d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f9781e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9782f;

    /* renamed from: g, reason: collision with root package name */
    private final List f9783g;

    /* renamed from: h, reason: collision with root package name */
    private final List f9784h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f9785a;

        /* renamed from: b, reason: collision with root package name */
        private String f9786b;

        /* renamed from: c, reason: collision with root package name */
        private String f9787c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f9788d;

        /* renamed from: e, reason: collision with root package name */
        private Category f9789e;

        /* renamed from: f, reason: collision with root package name */
        private Map f9790f;

        /* renamed from: g, reason: collision with root package name */
        private Map f9791g;

        /* renamed from: h, reason: collision with root package name */
        private Map f9792h;

        public Builder(int i2) {
            this.f9785a = i2;
        }

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.f9792h;
        }

        public final Category getCategory() {
            return this.f9789e;
        }

        public final Map<String, Object> getEnvironment() {
            return this.f9790f;
        }

        public final Map<String, byte[]> getExtras() {
            return this.f9791g;
        }

        public final String getName() {
            return this.f9786b;
        }

        public final Integer getServiceDataReporterType() {
            return this.f9788d;
        }

        public final int getType$modules_api_release() {
            return this.f9785a;
        }

        public final String getValue() {
            return this.f9787c;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.f9792h = map;
        }

        public final void setCategory(Category category) {
            this.f9789e = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.f9790f = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.f9791g = map;
        }

        public final void setName(String str) {
            this.f9786b = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.f9788d = num;
        }

        public final void setValue(String str) {
            this.f9787c = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f9792h = new HashMap(map);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.f9789e = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f9790f = new HashMap(map);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f9791g = new HashMap(map);
            }
            return this;
        }

        public final Builder withName(String str) {
            this.f9786b = str;
            return this;
        }

        public final Builder withServiceDataReporterType(int i2) {
            this.f9788d = Integer.valueOf(i2);
            return this;
        }

        public final Builder withValue(String str) {
            this.f9787c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Builder newBuilder(int i2) {
            return new Builder(i2);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, e eVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i2) {
        return Companion.newBuilder(i2);
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f9784h);
    }

    public final Category getCategory() {
        return this.f9781e;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f9782f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f9783g);
    }

    public final String getName() {
        return this.f9778b;
    }

    public final Integer getServiceDataReporterType() {
        return this.f9780d;
    }

    public final int getType() {
        return this.f9777a;
    }

    public final String getValue() {
        return this.f9779c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f9777a + ", name='" + this.f9778b + "', value='" + this.f9779c + "', serviceDataReporterType=" + this.f9780d + ", category=" + this.f9781e + ", environment=" + this.f9782f + ", extras=" + this.f9783g + ", attributes=" + this.f9784h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f9777a = builder.getType$modules_api_release();
        this.f9778b = builder.getName();
        this.f9779c = builder.getValue();
        this.f9780d = builder.getServiceDataReporterType();
        this.f9781e = builder.getCategory();
        this.f9782f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f9783g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f9784h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
