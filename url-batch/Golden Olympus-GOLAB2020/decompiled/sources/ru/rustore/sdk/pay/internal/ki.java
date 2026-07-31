package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ki {

    public static final class a implements ki {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44483a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f44484b;

        public a(@NotNull String urlEndpoint, @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(urlEndpoint, "urlEndpoint");
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f44483a = urlEndpoint;
            this.f44484b = headers;
        }

        @Override // ru.rustore.sdk.pay.internal.ki
        @NotNull
        public final String a() {
            return this.f44483a;
        }

        @Override // ru.rustore.sdk.pay.internal.ki
        @NotNull
        public final String b() {
            return com.ironsource.jn.f16864a;
        }

        @Override // ru.rustore.sdk.pay.internal.ki
        @NotNull
        public final Map<String, String> c() {
            return this.f44484b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44483a, aVar.f44483a) && Intrinsics.areEqual(this.f44484b, aVar.f44484b);
        }

        public final int hashCode() {
            return this.f44484b.hashCode() + (this.f44483a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Get(urlEndpoint=" + this.f44483a + ", headers=" + this.f44484b + ')';
        }
    }

    public static final class b implements ki {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44485a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f44486b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f44487c;

        public b(@NotNull String urlEndpoint, @NotNull Map<String, String> headers, @Nullable String str) {
            Intrinsics.checkNotNullParameter(urlEndpoint, "urlEndpoint");
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f44485a = urlEndpoint;
            this.f44486b = headers;
            this.f44487c = str;
        }

        @Override // ru.rustore.sdk.pay.internal.ki
        @NotNull
        public final String a() {
            return this.f44485a;
        }

        @Override // ru.rustore.sdk.pay.internal.ki
        @NotNull
        public final String b() {
            return com.ironsource.jn.f16865b;
        }

        @Override // ru.rustore.sdk.pay.internal.ki
        @NotNull
        public final Map<String, String> c() {
            return this.f44486b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f44485a, bVar.f44485a) && Intrinsics.areEqual(this.f44486b, bVar.f44486b) && Intrinsics.areEqual(this.f44487c, bVar.f44487c);
        }

        public final int hashCode() {
            int hashCode = (this.f44486b.hashCode() + (this.f44485a.hashCode() * 31)) * 31;
            String str = this.f44487c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Post(urlEndpoint=");
            sb.append(this.f44485a);
            sb.append(", headers=");
            sb.append(this.f44486b);
            sb.append(", body=");
            return i1.a(sb, this.f44487c, ')');
        }
    }

    @NotNull
    String a();

    @NotNull
    String b();

    @NotNull
    Map<String, String> c();
}
