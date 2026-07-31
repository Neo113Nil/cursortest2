package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface qm {

    public static final class a implements qm {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final s9 f44855a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44856b;

        public a(@NotNull s9 method, boolean z4) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.f44855a = method;
            this.f44856b = z4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44855a, aVar.f44855a) && this.f44856b == aVar.f44856b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44856b) + (this.f44855a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "MethodWithSelection(method=" + this.f44855a + ", selected=" + this.f44856b + ')';
        }
    }

    public static final class b implements qm {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f44857a = new b();
    }
}
