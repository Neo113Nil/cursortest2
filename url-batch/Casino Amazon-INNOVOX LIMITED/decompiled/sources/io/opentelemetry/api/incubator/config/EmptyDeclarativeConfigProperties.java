package io.opentelemetry.api.incubator.config;

import io.opentelemetry.common.ComponentLoader;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class EmptyDeclarativeConfigProperties implements DeclarativeConfigProperties {
    private static final EmptyDeclarativeConfigProperties INSTANCE = new EmptyDeclarativeConfigProperties();
    private static final ComponentLoader COMPONENT_LOADER = ComponentLoader.forClassLoader(EmptyDeclarativeConfigProperties.class.getClassLoader());

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public Boolean getBoolean(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public Double getDouble(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public Integer getInt(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public Long getLong(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public <T> List<T> getScalarList(String str, Class<T> cls) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public String getString(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public DeclarativeConfigProperties getStructured(String str) {
        return null;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    @Nullable
    public List<DeclarativeConfigProperties> getStructuredList(String str) {
        return null;
    }

    private EmptyDeclarativeConfigProperties() {
    }

    static EmptyDeclarativeConfigProperties getInstance() {
        return INSTANCE;
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    public Set<String> getPropertyKeys() {
        return Collections.emptySet();
    }

    @Override // io.opentelemetry.api.incubator.config.DeclarativeConfigProperties
    public ComponentLoader getComponentLoader() {
        return COMPONENT_LOADER;
    }
}
