package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.AppUserEmail;

/* loaded from: classes3.dex */
public interface nh {

    public static final class a implements nh {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final AppUserEmail f44704a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final ln f44705b;

        public a(@Nullable AppUserEmail appUserEmail, @Nullable ln lnVar) {
            this.f44704a = appUserEmail;
            this.f44705b = lnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44704a, aVar.f44704a) && Intrinsics.areEqual(this.f44705b, aVar.f44705b);
        }

        public final int hashCode() {
            AppUserEmail appUserEmail = this.f44704a;
            int hashCode = (appUserEmail == null ? 0 : appUserEmail.hashCode()) * 31;
            ln lnVar = this.f44705b;
            return hashCode + (lnVar != null ? lnVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Content(email=" + this.f44704a + ", validationError=" + this.f44705b + ')';
        }
    }

    public static final class b implements nh {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final AppUserEmail f44706a;

        public b(@NotNull AppUserEmail email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f44706a = email;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f44706a, ((b) obj).f44706a);
        }

        public final int hashCode() {
            return this.f44706a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(email=" + this.f44706a + ')';
        }
    }

    public static final class c implements nh {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f44707a = new c();
    }
}
