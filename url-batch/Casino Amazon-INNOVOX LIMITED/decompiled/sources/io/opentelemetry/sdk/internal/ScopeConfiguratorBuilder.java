package io.opentelemetry.sdk.internal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.ScopeConfiguratorBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ScopeConfiguratorBuilder<T> {

    @Nullable
    private final ScopeConfigurator<T> baseScopeConfigurator;
    private final List<Condition<T>> conditions = new ArrayList();

    @Nullable
    private T defaultScopeConfig;

    ScopeConfiguratorBuilder(@Nullable ScopeConfigurator<T> scopeConfigurator) {
        this.baseScopeConfigurator = scopeConfigurator;
    }

    public ScopeConfiguratorBuilder<T> setDefault(T t) {
        this.defaultScopeConfig = t;
        return this;
    }

    public ScopeConfiguratorBuilder<T> addCondition(Predicate<InstrumentationScopeInfo> predicate, T t) {
        this.conditions.add(new Condition<>(predicate, t));
        return this;
    }

    public static Predicate<InstrumentationScopeInfo> nameMatchesGlob(String str) {
        return new ScopeNameMatcher(GlobUtil.createGlobPatternPredicate(str));
    }

    public static Predicate<InstrumentationScopeInfo> nameEquals(final String str) {
        return new ScopeNameMatcher(new Predicate() { // from class: io.opentelemetry.sdk.internal.ScopeConfiguratorBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = ((String) obj).equals(str);
                return equals;
            }
        });
    }

    public ScopeConfigurator<T> build() {
        return new ScopeConfiguratorImpl(this.baseScopeConfigurator, this.defaultScopeConfig, this.conditions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Condition<T> {
        private final T scopeConfig;
        private final Predicate<InstrumentationScopeInfo> scopeMatcher;

        private Condition(Predicate<InstrumentationScopeInfo> predicate, T t) {
            this.scopeMatcher = predicate;
            this.scopeConfig = t;
        }

        public String toString() {
            StringJoiner stringJoiner = new StringJoiner(", ", "Condition{", "}");
            stringJoiner.add("scopeMatcher=" + this.scopeMatcher);
            stringJoiner.add("scopeConfig=" + this.scopeConfig);
            return stringJoiner.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ScopeConfiguratorImpl<T> implements ScopeConfigurator<T> {

        @Nullable
        private final ScopeConfigurator<T> baseScopeConfigurator;
        private final List<Condition<T>> conditions;

        @Nullable
        private final T defaultScopeConfig;

        private ScopeConfiguratorImpl(@Nullable ScopeConfigurator<T> scopeConfigurator, @Nullable T t, List<Condition<T>> list) {
            this.baseScopeConfigurator = scopeConfigurator;
            this.defaultScopeConfig = t;
            this.conditions = list;
        }

        @Override // java.util.function.Function
        @Nullable
        public T apply(InstrumentationScopeInfo instrumentationScopeInfo) {
            T apply;
            ScopeConfigurator<T> scopeConfigurator = this.baseScopeConfigurator;
            if (scopeConfigurator != null && (apply = scopeConfigurator.apply(instrumentationScopeInfo)) != null) {
                return apply;
            }
            for (Condition<T> condition : this.conditions) {
                if (((Condition) condition).scopeMatcher.test(instrumentationScopeInfo)) {
                    return (T) ((Condition) condition).scopeConfig;
                }
            }
            return this.defaultScopeConfig;
        }

        public String toString() {
            StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
            if (this.baseScopeConfigurator != null) {
                stringJoiner.add("baseScopeConfigurator=" + this.baseScopeConfigurator);
            }
            if (this.defaultScopeConfig != null) {
                stringJoiner.add("defaultScopeConfig=" + this.defaultScopeConfig);
            }
            stringJoiner.add("conditions=" + ((String) this.conditions.stream().map(new Function() { // from class: io.opentelemetry.sdk.internal.ScopeConfiguratorBuilder$ScopeConfiguratorImpl$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String objects;
                    objects = Objects.toString((ScopeConfiguratorBuilder.Condition) obj);
                    return objects;
                }
            }).collect(Collectors.joining(StringUtils.COMMA, "[", "]"))));
            return stringJoiner.toString();
        }
    }

    private static class ScopeNameMatcher implements Predicate<InstrumentationScopeInfo> {
        private final Predicate<String> nameMatcher;

        private ScopeNameMatcher(Predicate<String> predicate) {
            this.nameMatcher = predicate;
        }

        @Override // java.util.function.Predicate
        public boolean test(InstrumentationScopeInfo instrumentationScopeInfo) {
            return this.nameMatcher.test(instrumentationScopeInfo.getName());
        }

        public String toString() {
            return "ScopeNameMatcher{nameMatcher=" + this.nameMatcher + "}";
        }
    }
}
