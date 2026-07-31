package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f36818a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36819b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36820c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36821d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f36822e;

    /* renamed from: f, reason: collision with root package name */
    private final List f36823f;

    /* renamed from: g, reason: collision with root package name */
    private final List f36824g;

    /* renamed from: h, reason: collision with root package name */
    private final List f36825h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f36826a;

        /* renamed from: b, reason: collision with root package name */
        private String f36827b;

        /* renamed from: c, reason: collision with root package name */
        private String f36828c;

        /* renamed from: d, reason: collision with root package name */
        private int f36829d;

        /* renamed from: e, reason: collision with root package name */
        private Category f36830e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f36831f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f36832g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f36833h;

        /* synthetic */ Builder(int i4, int i5) {
            this(i4);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f36833h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f36830e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f36831f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f36832g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f36827b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i4) {
            this.f36829d = i4;
            return this;
        }

        public Builder withValue(String str) {
            this.f36828c = str;
            return this;
        }

        private Builder(int i4) {
            this.f36829d = 1;
            this.f36830e = Category.GENERAL;
            this.f36826a = i4;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    /* synthetic */ ModuleEvent(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newBuilder(int i4) {
        return new Builder(i4, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f36825h);
    }

    public Category getCategory() {
        return this.f36822e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f36823f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f36824g);
    }

    public String getName() {
        return this.f36819b;
    }

    public int getServiceDataReporterType() {
        return this.f36821d;
    }

    public int getType() {
        return this.f36818a;
    }

    public String getValue() {
        return this.f36820c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f36818a + ", name='" + this.f36819b + "', value='" + this.f36820c + "', serviceDataReporterType=" + this.f36821d + ", category=" + this.f36822e + ", environment=" + this.f36823f + ", extras=" + this.f36824g + ", attributes=" + this.f36825h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f36818a = builder.f36826a;
        this.f36819b = builder.f36827b;
        this.f36820c = builder.f36828c;
        this.f36821d = builder.f36829d;
        this.f36822e = builder.f36830e;
        this.f36823f = CollectionUtils.getListFromMap(builder.f36831f);
        this.f36824g = CollectionUtils.getListFromMap(builder.f36832g);
        this.f36825h = CollectionUtils.getListFromMap(builder.f36833h);
    }
}
