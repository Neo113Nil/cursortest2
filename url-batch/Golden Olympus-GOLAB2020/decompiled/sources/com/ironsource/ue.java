package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface ue {

    @Metadata
    public static final class a implements ue {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final re f19924a;

        public a(@NotNull re failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f19924a = failure;
        }

        @NotNull
        public final re a() {
            return this.f19924a;
        }

        @NotNull
        public final re b() {
            return this.f19924a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f19924a, ((a) obj).f19924a);
        }

        public int hashCode() {
            return this.f19924a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.f19924a + ')';
        }

        @NotNull
        public final a a(@NotNull re failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, re reVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                reVar = aVar.f19924a;
            }
            return aVar.a(reVar);
        }

        @Override // com.ironsource.ue
        public void a(@NotNull ve handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.f19924a);
        }
    }

    default void a(@NotNull ve handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
