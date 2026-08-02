package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class InternalModuleEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8811a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8812b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8813c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8814d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f8815e;
    private final List f;

    /* renamed from: g, reason: collision with root package name */
    private final List f8816g;

    /* renamed from: h, reason: collision with root package name */
    private final List f8817h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f8818a;

        /* renamed from: b, reason: collision with root package name */
        private String f8819b;

        /* renamed from: c, reason: collision with root package name */
        private String f8820c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f8821d;

        /* renamed from: e, reason: collision with root package name */
        private Category f8822e;
        private Map f;

        /* renamed from: g, reason: collision with root package name */
        private Map f8823g;

        /* renamed from: h, reason: collision with root package name */
        private Map f8824h;

        public Builder(int i3) {
            this.f8818a = i3;
        }

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.f8824h;
        }

        public final Category getCategory() {
            return this.f8822e;
        }

        public final Map<String, Object> getEnvironment() {
            return this.f;
        }

        public final Map<String, byte[]> getExtras() {
            return this.f8823g;
        }

        public final String getName() {
            return this.f8819b;
        }

        public final Integer getServiceDataReporterType() {
            return this.f8821d;
        }

        public final int getType$modules_api_release() {
            return this.f8818a;
        }

        public final String getValue() {
            return this.f8820c;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.f8824h = map;
        }

        public final void setCategory(Category category) {
            this.f8822e = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.f = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.f8823g = map;
        }

        public final void setName(String str) {
            this.f8819b = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.f8821d = num;
        }

        public final void setValue(String str) {
            this.f8820c = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f8824h = new HashMap(map);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.f8822e = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f = new HashMap(map);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f8823g = new HashMap(map);
            }
            return this;
        }

        public final Builder withName(String str) {
            this.f8819b = str;
            return this;
        }

        public final Builder withServiceDataReporterType(int i3) {
            this.f8821d = Integer.valueOf(i3);
            return this;
        }

        public final Builder withValue(String str) {
            this.f8820c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Builder newBuilder(int i3) {
            return new Builder(i3);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, f fVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i3) {
        return Companion.newBuilder(i3);
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f8817h);
    }

    public final Category getCategory() {
        return this.f8815e;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f8816g);
    }

    public final String getName() {
        return this.f8812b;
    }

    public final Integer getServiceDataReporterType() {
        return this.f8814d;
    }

    public final int getType() {
        return this.f8811a;
    }

    public final String getValue() {
        return this.f8813c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f8811a + ", name='" + this.f8812b + "', value='" + this.f8813c + "', serviceDataReporterType=" + this.f8814d + ", category=" + this.f8815e + ", environment=" + this.f + ", extras=" + this.f8816g + ", attributes=" + this.f8817h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f8811a = builder.getType$modules_api_release();
        this.f8812b = builder.getName();
        this.f8813c = builder.getValue();
        this.f8814d = builder.getServiceDataReporterType();
        this.f8815e = builder.getCategory();
        this.f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f8816g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f8817h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
