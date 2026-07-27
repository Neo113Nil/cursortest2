package com.yandex.varioqub.config.model;

import b2.AbstractC0279e;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ConfigValue {
    public static final boolean BOOLEAN_DEFAULT_VALUE = false;
    public static final double DOUBLE_DEFAULT_VALUE = 0.0d;
    public static final long LONG_DEFAULT_VALUE = 0;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_INAPP_DEFAULT = 1;
    public static final int SOURCE_SERVER = 2;
    public static final String STRING_DEFAULT_VALUE = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f5468a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5469b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5470c;
    public static final Companion Companion = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f5467d = Pattern.compile("^(true|false)$", 2);

    public static final class Companion {
        private Companion() {
        }

        public final ConfigValue createDefault$config_release() {
            return new ConfigValue("", 0, 0L, 4, null);
        }

        public final ConfigValue createInappDefault$config_release(String str) {
            return new ConfigValue(str, 1, 0L, 4, null);
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public ConfigValue(String str, int i2, long j2) {
        this.f5468a = str;
        this.f5469b = i2;
        this.f5470c = j2;
    }

    public final boolean asBoolean() {
        if (this.f5469b == 0) {
            return false;
        }
        Pattern pattern = f5467d;
        String str = this.f5468a;
        if (str == null) {
            str = "";
        }
        if (pattern.matcher(str).matches()) {
            return Boolean.parseBoolean(this.f5468a);
        }
        if (this.f5469b == 1) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0279e.h(new StringBuilder("Value "), this.f5468a, " cannot be converted to type Boolean"));
    }

    public final double asDouble() {
        if (this.f5469b == 0) {
            return DOUBLE_DEFAULT_VALUE;
        }
        try {
            String str = this.f5468a;
            return str != null ? Double.parseDouble(str) : DOUBLE_DEFAULT_VALUE;
        } catch (NumberFormatException unused) {
            if (this.f5469b == 1) {
                return DOUBLE_DEFAULT_VALUE;
            }
            throw new IllegalArgumentException(AbstractC0279e.h(new StringBuilder("Value "), this.f5468a, " cannot be converted to type Double"));
        }
    }

    public final long asLong() {
        if (this.f5469b == 0) {
            return 0L;
        }
        try {
            String str = this.f5468a;
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        } catch (NumberFormatException unused) {
            if (this.f5469b == 1) {
                return 0L;
            }
            throw new IllegalArgumentException(AbstractC0279e.h(new StringBuilder("Value "), this.f5468a, " cannot be converted to type Long"));
        }
    }

    public final String asString() {
        String str;
        return (this.f5469b == 0 || (str = this.f5468a) == null) ? "" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ConfigValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
        }
        ConfigValue configValue = (ConfigValue) obj;
        return i.a(this.f5468a, configValue.f5468a) && this.f5469b == configValue.f5469b && this.f5470c == configValue.f5470c;
    }

    public final int getSourceType() {
        return this.f5469b;
    }

    public final long getTestId() {
        return this.f5470c;
    }

    public final String getValue() {
        return this.f5468a;
    }

    public int hashCode() {
        String str = this.f5468a;
        return Long.hashCode(this.f5470c) + ((((str != null ? str.hashCode() : 0) * 31) + this.f5469b) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue(value='");
        sb.append(this.f5468a);
        sb.append("', sourceType=");
        sb.append(this.f5469b);
        sb.append(", testId=");
        return AbstractC0279e.g(sb, this.f5470c, ')');
    }

    public /* synthetic */ ConfigValue(String str, int i2, long j2, int i3, e eVar) {
        this(str, i2, (i3 & 4) != 0 ? -1L : j2);
    }
}
