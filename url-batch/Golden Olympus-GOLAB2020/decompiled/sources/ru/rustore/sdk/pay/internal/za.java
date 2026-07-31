package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface za {

    public static final class a implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45324a = new a();
    }

    public static final class b implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f45325a = new b();
    }

    public static final class c implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f45326a = new c();
    }

    public static final class d implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f45327a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f45328b;

        public d(@NotNull String code, @NotNull String description) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f45327a = code;
            this.f45328b = description;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f45327a, dVar.f45327a) && Intrinsics.areEqual(this.f45328b, dVar.f45328b);
        }

        public final int hashCode() {
            return this.f45328b.hashCode() + (this.f45327a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentError(code=");
            sb.append(this.f45327a);
            sb.append(", description=");
            return i1.a(sb, this.f45328b, ')');
        }
    }

    public static final class e implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f45329a = new e();
    }

    public static final class f implements za {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f45330a;

        public f(boolean z4) {
            this.f45330a = z4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f45330a == ((f) obj).f45330a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f45330a);
        }

        @NotNull
        public final String toString() {
            return "SaveCardState(enabled=" + this.f45330a + ')';
        }
    }

    public static final class g implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f45331a = new g();
    }

    public static final class h implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f45332a = new h();
    }

    public static final class i implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f45333a = new i();
    }

    public static final class j implements za {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final mn f45334a;

        public j(@NotNull mn cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f45334a = cause;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f45334a == ((j) obj).f45334a;
        }

        public final int hashCode() {
            return this.f45334a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ValidationError(cause=" + this.f45334a + ')';
        }
    }
}
