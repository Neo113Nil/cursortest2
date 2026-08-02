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
    private final int f13208a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13209b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13210c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f13211d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f13212e;

    /* renamed from: f, reason: collision with root package name */
    private final List f13213f;

    /* renamed from: g, reason: collision with root package name */
    private final List f13214g;

    /* renamed from: h, reason: collision with root package name */
    private final List f13215h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f13216a;

        /* renamed from: b, reason: collision with root package name */
        private String f13217b;

        /* renamed from: c, reason: collision with root package name */
        private String f13218c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f13219d;

        /* renamed from: e, reason: collision with root package name */
        private Category f13220e;

        /* renamed from: f, reason: collision with root package name */
        private Map f13221f;

        /* renamed from: g, reason: collision with root package name */
        private Map f13222g;

        /* renamed from: h, reason: collision with root package name */
        private Map f13223h;

        public Builder(int i4) {
            this.f13216a = i4;
        }

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.f13223h;
        }

        public final Category getCategory() {
            return this.f13220e;
        }

        public final Map<String, Object> getEnvironment() {
            return this.f13221f;
        }

        public final Map<String, byte[]> getExtras() {
            return this.f13222g;
        }

        public final String getName() {
            return this.f13217b;
        }

        public final Integer getServiceDataReporterType() {
            return this.f13219d;
        }

        public final int getType$modules_api_release() {
            return this.f13216a;
        }

        public final String getValue() {
            return this.f13218c;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.f13223h = map;
        }

        public final void setCategory(Category category) {
            this.f13220e = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.f13221f = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.f13222g = map;
        }

        public final void setName(String str) {
            this.f13217b = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.f13219d = num;
        }

        public final void setValue(String str) {
            this.f13218c = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f13223h = new HashMap(map);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.f13220e = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f13221f = new HashMap(map);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f13222g = new HashMap(map);
            }
            return this;
        }

        public final Builder withName(String str) {
            this.f13217b = str;
            return this;
        }

        public final Builder withServiceDataReporterType(int i4) {
            this.f13219d = Integer.valueOf(i4);
            return this;
        }

        public final Builder withValue(String str) {
            this.f13218c = str;
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

        public final Builder newBuilder(int i4) {
            return new Builder(i4);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, e eVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i4) {
        return Companion.newBuilder(i4);
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f13215h);
    }

    public final Category getCategory() {
        return this.f13212e;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f13213f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f13214g);
    }

    public final String getName() {
        return this.f13209b;
    }

    public final Integer getServiceDataReporterType() {
        return this.f13211d;
    }

    public final int getType() {
        return this.f13208a;
    }

    public final String getValue() {
        return this.f13210c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f13208a + ", name='" + this.f13209b + "', value='" + this.f13210c + "', serviceDataReporterType=" + this.f13211d + ", category=" + this.f13212e + ", environment=" + this.f13213f + ", extras=" + this.f13214g + ", attributes=" + this.f13215h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f13208a = builder.getType$modules_api_release();
        this.f13209b = builder.getName();
        this.f13210c = builder.getValue();
        this.f13211d = builder.getServiceDataReporterType();
        this.f13212e = builder.getCategory();
        this.f13213f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f13214g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f13215h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
