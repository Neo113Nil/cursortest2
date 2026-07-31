package com.yandex.div.internal.core;

import O1.Z;
import W1.m;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivVisitor<T> {
    protected abstract T defaultVisit(@NotNull Z z4, @NotNull ExpressionResolver expressionResolver);

    protected final T visit(@NotNull Z div, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (div instanceof Z.r) {
            return visit((Z.r) div, resolver);
        }
        if (div instanceof Z.h) {
            return visit((Z.h) div, resolver);
        }
        if (div instanceof Z.f) {
            return visit((Z.f) div, resolver);
        }
        if (div instanceof Z.m) {
            return visit((Z.m) div, resolver);
        }
        if (div instanceof Z.c) {
            return visit((Z.c) div, resolver);
        }
        if (div instanceof Z.g) {
            return visit((Z.g) div, resolver);
        }
        if (div instanceof Z.e) {
            return visit((Z.e) div, resolver);
        }
        if (div instanceof Z.k) {
            return visit((Z.k) div, resolver);
        }
        if (div instanceof Z.q) {
            return visit((Z.q) div, resolver);
        }
        if (div instanceof Z.o) {
            return visit((Z.o) div, resolver);
        }
        if (div instanceof Z.d) {
            return visit((Z.d) div, resolver);
        }
        if (div instanceof Z.i) {
            return visit((Z.i) div, resolver);
        }
        if (div instanceof Z.n) {
            return visit((Z.n) div, resolver);
        }
        if (div instanceof Z.j) {
            return visit((Z.j) div, resolver);
        }
        if (div instanceof Z.l) {
            return visit((Z.l) div, resolver);
        }
        if (div instanceof Z.s) {
            return visit((Z.s) div, resolver);
        }
        if (div instanceof Z.p) {
            return visit((Z.p) div, resolver);
        }
        throw new m();
    }

    protected T visit(@NotNull Z.r data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.h data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.f data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.m data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.c data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.g data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.e data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.k data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.q data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.o data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.d data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.i data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.n data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.j data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.l data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.s data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }

    protected T visit(@NotNull Z.p data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return defaultVisit(data, resolver);
    }
}
