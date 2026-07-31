package ru.rustore.sdk.pay.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.AmountLabel;
import ru.rustore.sdk.pay.model.Description;
import ru.rustore.sdk.pay.model.Price;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class e0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f43982a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Description f43983b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final AmountLabel f43984c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Price f43985d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Price f43986e;

    public e0(@NotNull Url icon, @NotNull Description description, @NotNull AmountLabel amountLabel, @NotNull Price originalPrice, @NotNull Price totalPrice) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        this.f43982a = icon;
        this.f43983b = description;
        this.f43984c = amountLabel;
        this.f43985d = originalPrice;
        this.f43986e = totalPrice;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f43982a, e0Var.f43982a) && Intrinsics.areEqual(this.f43983b, e0Var.f43983b) && Intrinsics.areEqual(this.f43984c, e0Var.f43984c) && Intrinsics.areEqual(this.f43985d, e0Var.f43985d) && Intrinsics.areEqual(this.f43986e, e0Var.f43986e);
    }

    public final int hashCode() {
        return this.f43986e.hashCode() + ((this.f43985d.hashCode() + ((this.f43984c.hashCode() + ((this.f43983b.hashCode() + (this.f43982a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ApplicationInfo(icon=" + this.f43982a + ", description=" + this.f43983b + ", amountLabel=" + this.f43984c + ", originalPrice=" + this.f43985d + ", totalPrice=" + this.f43986e + ')';
    }
}
