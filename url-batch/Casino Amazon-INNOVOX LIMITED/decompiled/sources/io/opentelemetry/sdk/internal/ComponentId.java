package io.opentelemetry.sdk.internal;

import io.opentelemetry.sdk.internal.ComponentId;
import io.opentelemetry.sdk.internal.StandardComponentId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class ComponentId {
    public abstract String getComponentName();

    public abstract String getTypeName();

    private ComponentId() {
    }

    static class Lazy extends ComponentId {
        private static final Map<String, AtomicInteger> nextIdCounters = new ConcurrentHashMap();

        @Nullable
        private volatile String componentName;
        private final String componentType;

        Lazy(String str) {
            super();
            this.componentName = null;
            this.componentType = str;
        }

        @Override // io.opentelemetry.sdk.internal.ComponentId
        public String getTypeName() {
            return this.componentType;
        }

        @Override // io.opentelemetry.sdk.internal.ComponentId
        public String getComponentName() {
            if (this.componentName == null) {
                synchronized (this) {
                    if (this.componentName == null) {
                        this.componentName = this.componentType + "/" + nextIdCounters.computeIfAbsent(this.componentType, new Function() { // from class: io.opentelemetry.sdk.internal.ComponentId$Lazy$$ExternalSyntheticLambda0
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ComponentId.Lazy.lambda$getComponentName$0((String) obj);
                            }
                        }).getAndIncrement();
                    }
                }
            }
            return this.componentName;
        }

        static /* synthetic */ AtomicInteger lambda$getComponentName$0(String str) {
            return new AtomicInteger(0);
        }
    }

    public static ComponentId generateLazy(String str) {
        return new Lazy(str);
    }

    public static StandardComponentId generateLazy(StandardComponentId.ExporterType exporterType) {
        return new StandardComponentId(exporterType);
    }
}
