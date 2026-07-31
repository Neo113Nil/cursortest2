package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Variant_Boolean_NitroPurchaseResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ?\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\r0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\u0015\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;", "", "<init>", "()V", "isFirst", "", "()Z", "isSecond", "asFirstOrNull", "()Ljava/lang/Boolean;", "asSecondOrNull", "Lcom/margelo/nitro/iap/NitroPurchaseResult;", "match", "R", "first", "Lkotlin/Function1;", "second", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "First", "Second", "Companion", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult$First;", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult$Second;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Variant_Boolean_NitroPurchaseResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ Variant_Boolean_NitroPurchaseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final Variant_Boolean_NitroPurchaseResult create(NitroPurchaseResult nitroPurchaseResult) {
        return INSTANCE.create(nitroPurchaseResult);
    }

    @JvmStatic
    public static final Variant_Boolean_NitroPurchaseResult create(boolean z) {
        return INSTANCE.create(z);
    }

    private Variant_Boolean_NitroPurchaseResult() {
    }

    /* compiled from: Variant_Boolean_NitroPurchaseResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult$First;", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class First extends Variant_Boolean_NitroPurchaseResult {
        private final boolean value;

        public static /* synthetic */ First copy$default(First first, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = first.value;
            }
            return first.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final First copy(boolean value) {
            return new First(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof First) && this.value == ((First) other).value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public String toString() {
            return "First(value=" + this.value + ")";
        }

        public First(boolean z) {
            super(null);
            this.value = z;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    /* compiled from: Variant_Boolean_NitroPurchaseResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult$Second;", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;", "value", "Lcom/margelo/nitro/iap/NitroPurchaseResult;", "<init>", "(Lcom/margelo/nitro/iap/NitroPurchaseResult;)V", "getValue", "()Lcom/margelo/nitro/iap/NitroPurchaseResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Second extends Variant_Boolean_NitroPurchaseResult {
        private final NitroPurchaseResult value;

        public static /* synthetic */ Second copy$default(Second second, NitroPurchaseResult nitroPurchaseResult, int i, Object obj) {
            if ((i & 1) != 0) {
                nitroPurchaseResult = second.value;
            }
            return second.copy(nitroPurchaseResult);
        }

        /* renamed from: component1, reason: from getter */
        public final NitroPurchaseResult getValue() {
            return this.value;
        }

        public final Second copy(NitroPurchaseResult value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Second(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Second) && Intrinsics.areEqual(this.value, ((Second) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Second(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Second(NitroPurchaseResult value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final NitroPurchaseResult getValue() {
            return this.value;
        }
    }

    public final boolean isFirst() {
        return this instanceof First;
    }

    public final boolean isSecond() {
        return this instanceof Second;
    }

    public final Boolean asFirstOrNull() {
        First first = this instanceof First ? (First) this : null;
        if (first != null) {
            return Boolean.valueOf(first.getValue());
        }
        return null;
    }

    public final NitroPurchaseResult asSecondOrNull() {
        NitroPurchaseResult value;
        Second second = this instanceof Second ? (Second) this : null;
        if (second == null || (value = second.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final <R> R match(Function1<? super Boolean, ? extends R> first, Function1<? super NitroPurchaseResult, ? extends R> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (this instanceof First) {
            return first.invoke(Boolean.valueOf(((First) this).getValue()));
        }
        if (this instanceof Second) {
            return second.invoke(((Second) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: Variant_Boolean_NitroPurchaseResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult$Companion;", "", "<init>", "()V", "create", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;", "value", "", "Lcom/margelo/nitro/iap/NitroPurchaseResult;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Variant_Boolean_NitroPurchaseResult create(boolean value) {
            return new First(value);
        }

        @JvmStatic
        public final Variant_Boolean_NitroPurchaseResult create(NitroPurchaseResult value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Second(value);
        }
    }
}
