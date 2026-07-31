package com.margelo.nitro.iap;

import com.margelo.nitro.core.NullType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestPurchaseResult.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0005\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0013\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013Jm\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00150\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u00150\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H\u00150\u00172\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u0002H\u00150\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0004!\"#$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"Lcom/margelo/nitro/iap/RequestPurchaseResult;", "", "<init>", "()V", "isFirst", "", "()Z", "isSecond", "isThird", "isFourth", "asFirstOrNull", "Lcom/margelo/nitro/core/NullType;", "asSecondOrNull", "Lcom/margelo/nitro/iap/PurchaseAndroid;", "asThirdOrNull", "Lcom/margelo/nitro/iap/PurchaseIOS;", "asFourthOrNull", "", "Lcom/margelo/nitro/iap/Purchase;", "()[Lcom/margelo/nitro/iap/Purchase;", "match", "R", "first", "Lkotlin/Function1;", "second", "third", "fourth", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "First", "Second", "Third", "Fourth", "Companion", "Lcom/margelo/nitro/iap/RequestPurchaseResult$First;", "Lcom/margelo/nitro/iap/RequestPurchaseResult$Fourth;", "Lcom/margelo/nitro/iap/RequestPurchaseResult$Second;", "Lcom/margelo/nitro/iap/RequestPurchaseResult$Third;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RequestPurchaseResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ RequestPurchaseResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final RequestPurchaseResult create(NullType nullType) {
        return INSTANCE.create(nullType);
    }

    @JvmStatic
    public static final RequestPurchaseResult create(PurchaseAndroid purchaseAndroid) {
        return INSTANCE.create(purchaseAndroid);
    }

    @JvmStatic
    public static final RequestPurchaseResult create(PurchaseIOS purchaseIOS) {
        return INSTANCE.create(purchaseIOS);
    }

    @JvmStatic
    public static final RequestPurchaseResult create(Purchase[] purchaseArr) {
        return INSTANCE.create(purchaseArr);
    }

    private RequestPurchaseResult() {
    }

    /* compiled from: RequestPurchaseResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/iap/RequestPurchaseResult$First;", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "value", "Lcom/margelo/nitro/core/NullType;", "<init>", "(Lcom/margelo/nitro/core/NullType;)V", "getValue", "()Lcom/margelo/nitro/core/NullType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class First extends RequestPurchaseResult {
        private final NullType value;

        public static /* synthetic */ First copy$default(First first, NullType nullType, int i, Object obj) {
            if ((i & 1) != 0) {
                nullType = first.value;
            }
            return first.copy(nullType);
        }

        /* renamed from: component1, reason: from getter */
        public final NullType getValue() {
            return this.value;
        }

        public final First copy(NullType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new First(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof First) && Intrinsics.areEqual(this.value, ((First) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "First(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public First(NullType value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final NullType getValue() {
            return this.value;
        }
    }

    /* compiled from: RequestPurchaseResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/iap/RequestPurchaseResult$Second;", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "value", "Lcom/margelo/nitro/iap/PurchaseAndroid;", "<init>", "(Lcom/margelo/nitro/iap/PurchaseAndroid;)V", "getValue", "()Lcom/margelo/nitro/iap/PurchaseAndroid;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Second extends RequestPurchaseResult {
        private final PurchaseAndroid value;

        public static /* synthetic */ Second copy$default(Second second, PurchaseAndroid purchaseAndroid, int i, Object obj) {
            if ((i & 1) != 0) {
                purchaseAndroid = second.value;
            }
            return second.copy(purchaseAndroid);
        }

        /* renamed from: component1, reason: from getter */
        public final PurchaseAndroid getValue() {
            return this.value;
        }

        public final Second copy(PurchaseAndroid value) {
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
        public Second(PurchaseAndroid value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final PurchaseAndroid getValue() {
            return this.value;
        }
    }

    /* compiled from: RequestPurchaseResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/iap/RequestPurchaseResult$Third;", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "value", "Lcom/margelo/nitro/iap/PurchaseIOS;", "<init>", "(Lcom/margelo/nitro/iap/PurchaseIOS;)V", "getValue", "()Lcom/margelo/nitro/iap/PurchaseIOS;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Third extends RequestPurchaseResult {
        private final PurchaseIOS value;

        public static /* synthetic */ Third copy$default(Third third, PurchaseIOS purchaseIOS, int i, Object obj) {
            if ((i & 1) != 0) {
                purchaseIOS = third.value;
            }
            return third.copy(purchaseIOS);
        }

        /* renamed from: component1, reason: from getter */
        public final PurchaseIOS getValue() {
            return this.value;
        }

        public final Third copy(PurchaseIOS value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Third(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Third) && Intrinsics.areEqual(this.value, ((Third) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Third(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Third(PurchaseIOS value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final PurchaseIOS getValue() {
            return this.value;
        }
    }

    /* compiled from: RequestPurchaseResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/RequestPurchaseResult$Fourth;", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "value", "", "Lcom/margelo/nitro/iap/Purchase;", "<init>", "([Lcom/margelo/nitro/iap/Purchase;)V", "getValue", "()[Lcom/margelo/nitro/iap/Purchase;", "[Lcom/margelo/nitro/iap/Purchase;", "component1", "copy", "([Lcom/margelo/nitro/iap/Purchase;)Lcom/margelo/nitro/iap/RequestPurchaseResult$Fourth;", "equals", "", "other", "", "hashCode", "", "toString", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fourth extends RequestPurchaseResult {
        private final Purchase[] value;

        public static /* synthetic */ Fourth copy$default(Fourth fourth, Purchase[] purchaseArr, int i, Object obj) {
            if ((i & 1) != 0) {
                purchaseArr = fourth.value;
            }
            return fourth.copy(purchaseArr);
        }

        /* renamed from: component1, reason: from getter */
        public final Purchase[] getValue() {
            return this.value;
        }

        public final Fourth copy(Purchase[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Fourth(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fourth) && Intrinsics.areEqual(this.value, ((Fourth) other).value);
        }

        public int hashCode() {
            return Arrays.hashCode(this.value);
        }

        public String toString() {
            return "Fourth(value=" + Arrays.toString(this.value) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fourth(Purchase[] value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final Purchase[] getValue() {
            return this.value;
        }
    }

    public final boolean isFirst() {
        return this instanceof First;
    }

    public final boolean isSecond() {
        return this instanceof Second;
    }

    public final boolean isThird() {
        return this instanceof Third;
    }

    public final boolean isFourth() {
        return this instanceof Fourth;
    }

    public final NullType asFirstOrNull() {
        NullType value;
        First first = this instanceof First ? (First) this : null;
        if (first == null || (value = first.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final PurchaseAndroid asSecondOrNull() {
        PurchaseAndroid value;
        Second second = this instanceof Second ? (Second) this : null;
        if (second == null || (value = second.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final PurchaseIOS asThirdOrNull() {
        PurchaseIOS value;
        Third third = this instanceof Third ? (Third) this : null;
        if (third == null || (value = third.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final Purchase[] asFourthOrNull() {
        Purchase[] value;
        Fourth fourth = this instanceof Fourth ? (Fourth) this : null;
        if (fourth == null || (value = fourth.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final <R> R match(Function1<? super NullType, ? extends R> first, Function1<? super PurchaseAndroid, ? extends R> second, Function1<? super PurchaseIOS, ? extends R> third, Function1<? super Purchase[], ? extends R> fourth) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(third, "third");
        Intrinsics.checkNotNullParameter(fourth, "fourth");
        if (this instanceof First) {
            return first.invoke(((First) this).getValue());
        }
        if (this instanceof Second) {
            return second.invoke(((Second) this).getValue());
        }
        if (this instanceof Third) {
            return third.invoke(((Third) this).getValue());
        }
        if (this instanceof Fourth) {
            return fourth.invoke(((Fourth) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: RequestPurchaseResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007J\u001b\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/RequestPurchaseResult$Companion;", "", "<init>", "()V", "create", "Lcom/margelo/nitro/iap/RequestPurchaseResult;", "value", "Lcom/margelo/nitro/core/NullType;", "Lcom/margelo/nitro/iap/PurchaseAndroid;", "Lcom/margelo/nitro/iap/PurchaseIOS;", "", "Lcom/margelo/nitro/iap/Purchase;", "([Lcom/margelo/nitro/iap/Purchase;)Lcom/margelo/nitro/iap/RequestPurchaseResult;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RequestPurchaseResult create(NullType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new First(value);
        }

        @JvmStatic
        public final RequestPurchaseResult create(PurchaseAndroid value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Second(value);
        }

        @JvmStatic
        public final RequestPurchaseResult create(PurchaseIOS value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Third(value);
        }

        @JvmStatic
        public final RequestPurchaseResult create(Purchase[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Fourth(value);
        }
    }
}
