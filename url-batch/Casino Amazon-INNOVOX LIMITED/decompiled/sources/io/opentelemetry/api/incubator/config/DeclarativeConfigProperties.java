package io.opentelemetry.api.incubator.config;

import io.opentelemetry.api.internal.ConfigUtil;
import io.opentelemetry.common.ComponentLoader;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface DeclarativeConfigProperties {
    @Nullable
    Boolean getBoolean(String str);

    ComponentLoader getComponentLoader();

    @Nullable
    Double getDouble(String str);

    @Nullable
    Integer getInt(String str);

    @Nullable
    Long getLong(String str);

    Set<String> getPropertyKeys();

    @Nullable
    <T> List<T> getScalarList(String str, Class<T> cls);

    @Nullable
    String getString(String str);

    @Nullable
    DeclarativeConfigProperties getStructured(String str);

    @Nullable
    List<DeclarativeConfigProperties> getStructuredList(String str);

    static DeclarativeConfigProperties empty() {
        return EmptyDeclarativeConfigProperties.getInstance();
    }

    static Map<String, Object> toMap(DeclarativeConfigProperties declarativeConfigProperties) {
        return DeclarativeConfigPropertyUtil.toMap(declarativeConfigProperties);
    }

    default String getString(String str, String str2) {
        return (String) ConfigUtil.defaultIfNull(getString(str), str2);
    }

    default boolean getBoolean(String str, boolean z) {
        return ((Boolean) ConfigUtil.defaultIfNull(getBoolean(str), Boolean.valueOf(z))).booleanValue();
    }

    default int getInt(String str, int i) {
        return ((Integer) ConfigUtil.defaultIfNull(getInt(str), Integer.valueOf(i))).intValue();
    }

    default long getLong(String str, long j) {
        return ((Long) ConfigUtil.defaultIfNull(getLong(str), Long.valueOf(j))).longValue();
    }

    default double getDouble(String str, double d) {
        return ((Double) ConfigUtil.defaultIfNull(getDouble(str), Double.valueOf(d))).doubleValue();
    }

    default <T> List<T> getScalarList(String str, Class<T> cls, List<T> list) {
        return (List) ConfigUtil.defaultIfNull(getScalarList(str, cls), list);
    }

    default DeclarativeConfigProperties getStructured(String str, DeclarativeConfigProperties declarativeConfigProperties) {
        return (DeclarativeConfigProperties) ConfigUtil.defaultIfNull(getStructured(str), declarativeConfigProperties);
    }

    default List<DeclarativeConfigProperties> getStructuredList(String str, List<DeclarativeConfigProperties> list) {
        return (List) ConfigUtil.defaultIfNull(getStructuredList(str), list);
    }
}
