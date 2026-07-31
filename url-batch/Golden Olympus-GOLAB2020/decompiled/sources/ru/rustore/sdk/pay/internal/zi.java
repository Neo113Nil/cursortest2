package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public interface zi {

    public static final class a implements zi {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final Url f45366a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final f0 f45367b;

        public a(@Nullable Url url, @NotNull f0 purchase) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f45366a = url;
            this.f45367b = purchase;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f45366a, aVar.f45366a) && Intrinsics.areEqual(this.f45367b, aVar.f45367b);
        }

        public final int hashCode() {
            Url url = this.f45366a;
            return this.f45367b.hashCode() + ((url == null ? 0 : url.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "Application(url=" + this.f45366a + ", purchase=" + this.f45367b + ')';
        }
    }

    public static final class b implements zi {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f45368a = new b();
    }

    public static final class c implements zi {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final Url f45369a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final qb f45370b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public final dn f45371c;

        public c(@Nullable Url url, @NotNull qb purchase, @Nullable dn dnVar) {
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.f45369a = url;
            this.f45370b = purchase;
            this.f45371c = dnVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f45369a, cVar.f45369a) && Intrinsics.areEqual(this.f45370b, cVar.f45370b) && Intrinsics.areEqual(this.f45371c, cVar.f45371c);
        }

        public final int hashCode() {
            Url url = this.f45369a;
            int hashCode = (this.f45370b.hashCode() + ((url == null ? 0 : url.hashCode()) * 31)) * 31;
            dn dnVar = this.f45371c;
            return hashCode + (dnVar != null ? dnVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Product(url=" + this.f45369a + ", purchase=" + this.f45370b + ", user=" + this.f45371c + ')';
        }
    }
}
