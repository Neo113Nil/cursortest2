package ru.rustore.sdk.pay.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.AmountLabel;

/* loaded from: classes3.dex */
public interface ha {

    public static final class a implements ha {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<qm> f44225a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final s9 f44226b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final AmountLabel f44227c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public final ml f44228d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends qm> paymentMethods, @NotNull s9 activeMethod, @NotNull AmountLabel amountLabel, @Nullable ml mlVar) {
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            Intrinsics.checkNotNullParameter(activeMethod, "activeMethod");
            Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
            this.f44225a = paymentMethods;
            this.f44226b = activeMethod;
            this.f44227c = amountLabel;
            this.f44228d = mlVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44225a, aVar.f44225a) && Intrinsics.areEqual(this.f44226b, aVar.f44226b) && Intrinsics.areEqual(this.f44227c, aVar.f44227c) && Intrinsics.areEqual(this.f44228d, aVar.f44228d);
        }

        public final int hashCode() {
            int hashCode = (this.f44227c.hashCode() + ((this.f44226b.hashCode() + (this.f44225a.hashCode() * 31)) * 31)) * 31;
            ml mlVar = this.f44228d;
            return hashCode + (mlVar == null ? 0 : mlVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Content(paymentMethods=" + this.f44225a + ", activeMethod=" + this.f44226b + ", amountLabel=" + this.f44227c + ", subscriptionTariff=" + this.f44228d + ')';
        }
    }

    public static final class b implements ha {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f44229a = new b();
    }

    public static final class c implements ha {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f44230a = new c();
    }
}
