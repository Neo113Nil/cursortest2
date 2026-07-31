package io.opentelemetry.sdk.internal;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class IncludeExcludePredicate implements Predicate<String> {

    @Nullable
    private final Set<String> excluded;
    private final boolean globMatchingEnabled;

    @Nullable
    private final Set<String> included;
    private final Predicate<String> predicate;

    static /* synthetic */ boolean lambda$excludedPredicate$1(String str) {
        return true;
    }

    static /* synthetic */ boolean lambda$includedPredicate$0(String str) {
        return false;
    }

    private IncludeExcludePredicate(@Nullable Collection<String> collection, @Nullable Collection<String> collection2, boolean z) {
        this.globMatchingEnabled = z;
        LinkedHashSet linkedHashSet = collection == null ? null : new LinkedHashSet(collection);
        this.included = linkedHashSet;
        LinkedHashSet linkedHashSet2 = collection2 != null ? new LinkedHashSet(collection2) : null;
        this.excluded = linkedHashSet2;
        if (linkedHashSet != null && linkedHashSet2 != null) {
            this.predicate = includedPredicate(linkedHashSet, z).and(excludedPredicate(linkedHashSet2, z));
            return;
        }
        if (linkedHashSet == null && linkedHashSet2 != null) {
            this.predicate = excludedPredicate(linkedHashSet2, z);
        } else {
            if (linkedHashSet2 == null && linkedHashSet != null) {
                this.predicate = includedPredicate(linkedHashSet, z);
                return;
            }
            throw new IllegalArgumentException("At least one of includedPatterns or excludedPatterns must not be null");
        }
    }

    public static Predicate<String> createExactMatching(@Nullable Collection<String> collection, @Nullable Collection<String> collection2) {
        return new IncludeExcludePredicate(collection, collection2, false);
    }

    public static Predicate<String> createPatternMatching(@Nullable Collection<String> collection, @Nullable Collection<String> collection2) {
        return new IncludeExcludePredicate(collection, collection2, true);
    }

    @Override // java.util.function.Predicate
    public boolean test(String str) {
        return this.predicate.test(str);
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "IncludeExcludePredicate{", "}");
        stringJoiner.add("globMatchingEnabled=" + this.globMatchingEnabled);
        if (this.included != null) {
            stringJoiner.add("included=" + ((String) this.included.stream().collect(Collectors.joining(", ", "[", "]"))));
        }
        if (this.excluded != null) {
            stringJoiner.add("excluded=" + ((String) this.excluded.stream().collect(Collectors.joining(", ", "[", "]"))));
        }
        return stringJoiner.toString();
    }

    private static Predicate<String> includedPredicate(Set<String> set, boolean z) {
        Predicate<String> predicate = new Predicate() { // from class: io.opentelemetry.sdk.internal.IncludeExcludePredicate$$ExternalSyntheticLambda2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IncludeExcludePredicate.lambda$includedPredicate$0((String) obj);
            }
        };
        for (final String str : set) {
            if (z) {
                predicate = predicate.or(GlobUtil.createGlobPatternPredicate(str));
            } else {
                Objects.requireNonNull(str);
                predicate = predicate.or(new Predicate() { // from class: io.opentelemetry.sdk.internal.IncludeExcludePredicate$$ExternalSyntheticLambda3
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean equalsIgnoreCase;
                        equalsIgnoreCase = str.equalsIgnoreCase((String) obj);
                        return equalsIgnoreCase;
                    }
                });
            }
        }
        return predicate;
    }

    private static Predicate<String> excludedPredicate(Set<String> set, boolean z) {
        Predicate<String> predicate = new Predicate() { // from class: io.opentelemetry.sdk.internal.IncludeExcludePredicate$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return IncludeExcludePredicate.lambda$excludedPredicate$1((String) obj);
            }
        };
        for (final String str : set) {
            if (z) {
                predicate = predicate.and(GlobUtil.createGlobPatternPredicate(str).negate());
            } else {
                predicate = predicate.and(new Predicate() { // from class: io.opentelemetry.sdk.internal.IncludeExcludePredicate$$ExternalSyntheticLambda1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return IncludeExcludePredicate.lambda$excludedPredicate$2(str, (String) obj);
                    }
                });
            }
        }
        return predicate;
    }

    static /* synthetic */ boolean lambda$excludedPredicate$2(String str, String str2) {
        return !str.equalsIgnoreCase(str2);
    }
}
