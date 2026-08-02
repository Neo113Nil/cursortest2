package com.squareup.cash.treehouse.activity;

import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okio.ByteString;

@Serializable
/* loaded from: classes7.dex */
public interface OfflinePendingItem {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/OfflinePendingItem$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/OfflinePendingItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.activity.OfflinePendingItem", reflectionFactory.getOrCreateKotlinClass(OfflinePendingItem.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Payment.class), reflectionFactory.getOrCreateKotlinClass(Transfer.class)}, new KSerializer[]{OfflinePendingItem$Payment$$serializer.INSTANCE, OfflinePendingItem$Transfer$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Payment")
    @Serializable
    public final class Payment implements OfflinePendingItem {
        public final long createdAt;
        public final ByteString initiatePaymentRequest;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(9)), null};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/OfflinePendingItem$Payment$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/OfflinePendingItem$Payment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return OfflinePendingItem$Payment$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Payment(int i, long j, ByteString byteString) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, OfflinePendingItem$Payment$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.initiatePaymentRequest = byteString;
            this.createdAt = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj;
            return Intrinsics.areEqual(this.initiatePaymentRequest, payment.initiatePaymentRequest) && this.createdAt == payment.createdAt;
        }

        public final int hashCode() {
            return Long.hashCode(this.createdAt) + (this.initiatePaymentRequest.hashCode() * 31);
        }

        public final String toString() {
            return "Payment(initiatePaymentRequest=" + this.initiatePaymentRequest + ", createdAt=" + this.createdAt + ")";
        }

        public Payment(long j, ByteString byteString) {
            byteString.getClass();
            this.initiatePaymentRequest = byteString;
            this.createdAt = j;
        }
    }

    @SerialName("Transfer")
    @Serializable
    public final class Transfer implements OfflinePendingItem {
        public final long createdAt;
        public final ByteString transferFundsRequest;
        public static final Companion Companion = new Companion();
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(10)), null};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/OfflinePendingItem$Transfer$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/OfflinePendingItem$Transfer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return OfflinePendingItem$Transfer$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Transfer(int i, long j, ByteString byteString) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, OfflinePendingItem$Transfer$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.transferFundsRequest = byteString;
            this.createdAt = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj;
            return Intrinsics.areEqual(this.transferFundsRequest, transfer.transferFundsRequest) && this.createdAt == transfer.createdAt;
        }

        public final int hashCode() {
            return Long.hashCode(this.createdAt) + (this.transferFundsRequest.hashCode() * 31);
        }

        public final String toString() {
            return "Transfer(transferFundsRequest=" + this.transferFundsRequest + ", createdAt=" + this.createdAt + ")";
        }

        public Transfer(long j, ByteString byteString) {
            byteString.getClass();
            this.transferFundsRequest = byteString;
            this.createdAt = j;
        }
    }
}
