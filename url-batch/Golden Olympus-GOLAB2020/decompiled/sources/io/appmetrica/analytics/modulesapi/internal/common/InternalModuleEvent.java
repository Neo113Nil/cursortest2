package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class InternalModuleEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f40510a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40511b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40512c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f40513d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f40514e;

    /* renamed from: f, reason: collision with root package name */
    private final List f40515f;

    /* renamed from: g, reason: collision with root package name */
    private final List f40516g;

    /* renamed from: h, reason: collision with root package name */
    private final List f40517h;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f40518a;

        /* renamed from: b, reason: collision with root package name */
        private String f40519b;

        /* renamed from: c, reason: collision with root package name */
        private String f40520c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f40521d;

        /* renamed from: e, reason: collision with root package name */
        private Category f40522e;

        /* renamed from: f, reason: collision with root package name */
        private Map f40523f;

        /* renamed from: g, reason: collision with root package name */
        private Map f40524g;

        /* renamed from: h, reason: collision with root package name */
        private Map f40525h;

        public Builder(int i4) {
            this.f40518a = i4;
        }

        @NotNull
        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        @Nullable
        public final Map<String, Object> getAttributes() {
            return this.f40525h;
        }

        @Nullable
        public final Category getCategory() {
            return this.f40522e;
        }

        @Nullable
        public final Map<String, Object> getEnvironment() {
            return this.f40523f;
        }

        @Nullable
        public final Map<String, byte[]> getExtras() {
            return this.f40524g;
        }

        @Nullable
        public final String getName() {
            return this.f40519b;
        }

        @Nullable
        public final Integer getServiceDataReporterType() {
            return this.f40521d;
        }

        public final int getType$modules_api_release() {
            return this.f40518a;
        }

        @Nullable
        public final String getValue() {
            return this.f40520c;
        }

        public final void setAttributes(@Nullable Map<String, ? extends Object> map) {
            this.f40525h = map;
        }

        public final void setCategory(@Nullable Category category) {
            this.f40522e = category;
        }

        public final void setEnvironment(@Nullable Map<String, ? extends Object> map) {
            this.f40523f = map;
        }

        public final void setExtras(@Nullable Map<String, byte[]> map) {
            this.f40524g = map;
        }

        public final void setName(@Nullable String str) {
            this.f40519b = str;
        }

        public final void setServiceDataReporterType(@Nullable Integer num) {
            this.f40521d = num;
        }

        public final void setValue(@Nullable String str) {
            this.f40520c = str;
        }

        @NotNull
        public final Builder withAttributes(@Nullable Map<String, ? extends Object> map) {
            if (map != null) {
                this.f40525h = new HashMap(map);
            }
            return this;
        }

        @NotNull
        public final Builder withCategory(@NotNull Category category) {
            this.f40522e = category;
            return this;
        }

        @NotNull
        public final Builder withEnvironment(@Nullable Map<String, ? extends Object> map) {
            if (map != null) {
                this.f40523f = new HashMap(map);
            }
            return this;
        }

        @NotNull
        public final Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f40524g = new HashMap(map);
            }
            return this;
        }

        @NotNull
        public final Builder withName(@Nullable String str) {
            this.f40519b = str;
            return this;
        }

        @NotNull
        public final Builder withServiceDataReporterType(int i4) {
            this.f40521d = Integer.valueOf(i4);
            return this;
        }

        @NotNull
        public final Builder withValue(@Nullable String str) {
            this.f40520c = str;
            return this;
        }
    }

    @Metadata
    public enum Category {
        GENERAL,
        SYSTEM
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder(int i4) {
            return new Builder(i4);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public static final Builder newBuilder(int i4) {
        return Companion.newBuilder(i4);
    }

    @Nullable
    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f40517h);
    }

    @Nullable
    public final Category getCategory() {
        return this.f40514e;
    }

    @Nullable
    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f40515f);
    }

    @Nullable
    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f40516g);
    }

    @Nullable
    public final String getName() {
        return this.f40511b;
    }

    @Nullable
    public final Integer getServiceDataReporterType() {
        return this.f40513d;
    }

    public final int getType() {
        return this.f40510a;
    }

    @Nullable
    public final String getValue() {
        return this.f40512c;
    }

    @NotNull
    public String toString() {
        return "ModuleEvent{type=" + this.f40510a + ", name='" + this.f40511b + "', value='" + this.f40512c + "', serviceDataReporterType=" + this.f40513d + ", category=" + this.f40514e + ", environment=" + this.f40515f + ", extras=" + this.f40516g + ", attributes=" + this.f40517h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f40510a = builder.getType$modules_api_release();
        this.f40511b = builder.getName();
        this.f40512c = builder.getValue();
        this.f40513d = builder.getServiceDataReporterType();
        this.f40514e = builder.getCategory();
        this.f40515f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f40516g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f40517h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
