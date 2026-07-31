package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface j4 {

    public static final class a implements j4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f44358a = new a();
    }

    public static final class b implements j4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final t3 f44359a;

        public b(@NotNull t3 resolution) {
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            this.f44359a = resolution;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f44359a == ((b) obj).f44359a;
        }

        public final int hashCode() {
            return this.f44359a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Closed(resolution=" + this.f44359a + ')';
        }
    }

    public static final class c implements j4 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f44360a = new c();
    }
}
