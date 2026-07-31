package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public interface ak {

    public static final class a implements ak {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f43824a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f43825b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f43826c;

        public a(@NotNull String paymentBaseUrl, @NotNull String payToken, boolean z4) {
            Intrinsics.checkNotNullParameter(paymentBaseUrl, "paymentBaseUrl");
            Intrinsics.checkNotNullParameter(payToken, "payToken");
            this.f43824a = paymentBaseUrl;
            this.f43825b = payToken;
            this.f43826c = z4;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        @NotNull
        public final String a() {
            return this.f43824a;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        public final boolean b() {
            return this.f43826c;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        @NotNull
        public final String c() {
            return this.f43825b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f43824a, aVar.f43824a) && Intrinsics.areEqual(this.f43825b, aVar.f43825b) && this.f43826c == aVar.f43826c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f43826c) + j1.a(this.f43825b, this.f43824a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "Anonymous(paymentBaseUrl=" + this.f43824a + ", payToken=" + this.f43825b + ", sandboxEnabled=" + this.f43826c + ')';
        }
    }

    public static final class b implements ak {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f43827a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f43828b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f43829c;

        public b(@NotNull String paymentBaseUrl, @NotNull String payToken, boolean z4) {
            Intrinsics.checkNotNullParameter(paymentBaseUrl, "paymentBaseUrl");
            Intrinsics.checkNotNullParameter(payToken, "payToken");
            this.f43827a = paymentBaseUrl;
            this.f43828b = payToken;
            this.f43829c = z4;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        @NotNull
        public final String a() {
            return this.f43827a;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        public final boolean b() {
            return this.f43829c;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        @NotNull
        public final String c() {
            return this.f43828b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f43827a, bVar.f43827a) && Intrinsics.areEqual(this.f43828b, bVar.f43828b) && this.f43829c == bVar.f43829c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f43829c) + j1.a(this.f43828b, this.f43827a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "Authorized(paymentBaseUrl=" + this.f43827a + ", payToken=" + this.f43828b + ", sandboxEnabled=" + this.f43829c + ')';
        }
    }

    public static final class c implements ak {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f43830a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f43831b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f43832c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final dn f43833d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final Url f43834e;

        public c(@NotNull String paymentBaseUrl, @NotNull String payToken, boolean z4, @NotNull dn user, @NotNull Url authUrl) {
            Intrinsics.checkNotNullParameter(paymentBaseUrl, "paymentBaseUrl");
            Intrinsics.checkNotNullParameter(payToken, "payToken");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            this.f43830a = paymentBaseUrl;
            this.f43831b = payToken;
            this.f43832c = z4;
            this.f43833d = user;
            this.f43834e = authUrl;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        @NotNull
        public final String a() {
            return this.f43830a;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        public final boolean b() {
            return this.f43832c;
        }

        @Override // ru.rustore.sdk.pay.internal.ak
        @NotNull
        public final String c() {
            return this.f43831b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f43830a, cVar.f43830a) && Intrinsics.areEqual(this.f43831b, cVar.f43831b) && this.f43832c == cVar.f43832c && Intrinsics.areEqual(this.f43833d, cVar.f43833d) && Intrinsics.areEqual(this.f43834e, cVar.f43834e);
        }

        public final int hashCode() {
            return this.f43834e.hashCode() + ((this.f43833d.hashCode() + ((Boolean.hashCode(this.f43832c) + j1.a(this.f43831b, this.f43830a.hashCode() * 31, 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Web(paymentBaseUrl=" + this.f43830a + ", payToken=" + this.f43831b + ", sandboxEnabled=" + this.f43832c + ", user=" + this.f43833d + ", authUrl=" + this.f43834e + ')';
        }
    }

    @NotNull
    String a();

    boolean b();

    @NotNull
    String c();
}
