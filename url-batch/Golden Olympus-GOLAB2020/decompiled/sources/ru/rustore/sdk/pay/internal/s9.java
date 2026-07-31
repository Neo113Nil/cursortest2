package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public interface s9 {

    public static final class a implements s9 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f44973a = new a();
    }

    public static final class b implements s9 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f44974a = new b();
    }

    public static final class c implements s9 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44975a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final Url f44976b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f44977c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final Url f44978d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f44979e;

        public c(String cardBindingId, Url bankIcon, String number, Url paymentSystemIcon, String paymentSystem) {
            Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
            Intrinsics.checkNotNullParameter(bankIcon, "bankIcon");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(paymentSystemIcon, "paymentSystemIcon");
            Intrinsics.checkNotNullParameter(paymentSystem, "paymentSystem");
            this.f44975a = cardBindingId;
            this.f44976b = bankIcon;
            this.f44977c = number;
            this.f44978d = paymentSystemIcon;
            this.f44979e = paymentSystem;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f44975a, cVar.f44975a) && Intrinsics.areEqual(this.f44976b, cVar.f44976b) && Intrinsics.areEqual(this.f44977c, cVar.f44977c) && Intrinsics.areEqual(this.f44978d, cVar.f44978d) && Intrinsics.areEqual(this.f44979e, cVar.f44979e);
        }

        public final int hashCode() {
            return this.f44979e.hashCode() + ((this.f44978d.hashCode() + j1.a(this.f44977c, (this.f44976b.hashCode() + (this.f44975a.hashCode() * 31)) * 31, 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedCard(cardBindingId=");
            sb.append((Object) ("CardBindingId(value=" + this.f44975a + ')'));
            sb.append(", bankIcon=");
            sb.append(this.f44976b);
            sb.append(", number=");
            sb.append((Object) ("CardMaskedNumber(value=" + this.f44977c + ')'));
            sb.append(", paymentSystemIcon=");
            sb.append(this.f44978d);
            sb.append(", paymentSystem=");
            sb.append((Object) ("CardPaymentSystem(value=" + this.f44979e + ')'));
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class d implements s9 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f44980a = new d();
    }

    public static final class e implements s9 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f44981a = new e();
    }

    public static final class f implements s9 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f44982a;

        public f(@NotNull String methodName) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.f44982a = methodName;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f44982a, ((f) obj).f44982a);
        }

        public final int hashCode() {
            return this.f44982a.hashCode();
        }

        @NotNull
        public final String toString() {
            return i1.a(new StringBuilder("Unsupported(methodName="), this.f44982a, ')');
        }
    }
}
