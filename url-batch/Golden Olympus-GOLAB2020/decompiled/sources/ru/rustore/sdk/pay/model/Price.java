package ru.rustore.sdk.pay.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class Price implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final int value;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Price(int i4) {
        this.value = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Price) && this.value == ((Price) obj).value;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "Price(value='" + this.value + "')";
    }
}
