package com.ironsource.mediationsdk.demandOnly;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface p {

    @Metadata
    public static class a implements p {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f17541a;

        public a(@NotNull String plumbus) {
            Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.f17541a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @NotNull
        public String value() {
            return this.f17541a;
        }
    }

    @Metadata
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @NotNull
    String value();
}
