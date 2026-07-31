package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final hf f43943a;

        public a(@NotNull hf purchaseResult) {
            Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
            this.f43943a = purchaseResult;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f43943a, ((a) obj).f43943a);
        }

        public final int hashCode() {
            return this.f43943a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "PaymentFinished(purchaseResult=" + this.f43943a + ')';
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f43944a = new b();
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f43945a = new c();
    }
}
