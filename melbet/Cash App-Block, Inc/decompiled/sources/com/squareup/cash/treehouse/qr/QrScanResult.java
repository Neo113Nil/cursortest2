package com.squareup.cash.treehouse.qr;

import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public interface QrScanResult {
    public static final Companion Companion = Companion.$$INSTANCE;

    @SerialName("CameraPermissionDenied")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/qr/QrScanResult$CameraPermissionDenied", "Lcom/squareup/cash/treehouse/qr/QrScanResult$Failure;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/qr/QrScanResult$CameraPermissionDenied;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class CameraPermissionDenied implements Failure {
        public static final CameraPermissionDenied INSTANCE = new CameraPermissionDenied();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(9));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraPermissionDenied);
        }

        public final int hashCode() {
            return -448518349;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "CameraPermissionDenied";
        }
    }

    @SerialName("Canceled")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/qr/QrScanResult$Canceled", "Lcom/squareup/cash/treehouse/qr/QrScanResult;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/qr/QrScanResult$Canceled;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Canceled implements QrScanResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(10));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -1712937155;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/qr/QrScanResult$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/qr/QrScanResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.qr.QrScanResult", reflectionFactory.getOrCreateKotlinClass(QrScanResult.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Canceled.class), reflectionFactory.getOrCreateKotlinClass(CameraPermissionDenied.class), reflectionFactory.getOrCreateKotlinClass(UnspecifiedFailure.class), reflectionFactory.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{new EnumSerializer("Canceled", Canceled.INSTANCE, new Annotation[0]), new EnumSerializer("CameraPermissionDenied", CameraPermissionDenied.INSTANCE, new Annotation[0]), QrScanResult$UnspecifiedFailure$$serializer.INSTANCE, QrScanResult$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Serializable
    public interface Failure extends QrScanResult {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/qr/QrScanResult$Failure$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/qr/QrScanResult$Failure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            public final KSerializer serializer() {
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.squareup.cash.treehouse.qr.QrScanResult.Failure", reflectionFactory.getOrCreateKotlinClass(Failure.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(CameraPermissionDenied.class), reflectionFactory.getOrCreateKotlinClass(UnspecifiedFailure.class)}, new KSerializer[]{new EnumSerializer("CameraPermissionDenied", CameraPermissionDenied.INSTANCE, new Annotation[0]), QrScanResult$UnspecifiedFailure$$serializer.INSTANCE}, new Annotation[0]);
            }
        }
    }

    @SerialName("UnspecifiedFailure")
    @Serializable
    public final class UnspecifiedFailure implements Failure {
        public static final Companion Companion = new Companion();
        public final String message;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/qr/QrScanResult$UnspecifiedFailure$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/qr/QrScanResult$UnspecifiedFailure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return QrScanResult$UnspecifiedFailure$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UnspecifiedFailure(int i, String str) {
            if ((i & 1) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnspecifiedFailure) && Intrinsics.areEqual(this.message, ((UnspecifiedFailure) obj).message);
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnspecifiedFailure(message=", this.message, ")");
        }

        public UnspecifiedFailure() {
            this.message = null;
        }
    }

    @SerialName("Success")
    @Serializable
    public final class Success implements QrScanResult {
        public static final Companion Companion = new Companion();
        public final String value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/qr/QrScanResult$Success$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/qr/QrScanResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return QrScanResult$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, String str) {
            if (1 == (i & 1)) {
                this.value = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, QrScanResult$Success$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.value, ((Success) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", this.value, ")");
        }

        public Success(String str) {
            str.getClass();
            this.value = str;
        }
    }
}
