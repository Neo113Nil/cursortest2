package com.squareup.cash.treehouse.biometrics;

import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
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

@Serializable
/* loaded from: classes7.dex */
public interface BiometricsWriteResult {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.biometrics.BiometricsWriteResult", reflectionFactory.getOrCreateKotlinClass(BiometricsWriteResult.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(SecureStoreUnavailable.class), reflectionFactory.getOrCreateKotlinClass(Unspecified.class), reflectionFactory.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{new EnumSerializer("SecureStoreUnavailable", SecureStoreUnavailable.INSTANCE, new Annotation[0]), BiometricsWriteResult$Unspecified$$serializer.INSTANCE, new EnumSerializer("Success", Success.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    @Serializable
    public interface Failure extends BiometricsWriteResult {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Failure$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Failure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            public final KSerializer serializer() {
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.squareup.cash.treehouse.biometrics.BiometricsWriteResult.Failure", reflectionFactory.getOrCreateKotlinClass(Failure.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(SecureStoreUnavailable.class), reflectionFactory.getOrCreateKotlinClass(Unspecified.class)}, new KSerializer[]{new EnumSerializer("SecureStoreUnavailable", SecureStoreUnavailable.INSTANCE, new Annotation[0]), BiometricsWriteResult$Unspecified$$serializer.INSTANCE}, new Annotation[0]);
            }
        }
    }

    @SerialName("SecureStoreUnavailable")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsWriteResult$SecureStoreUnavailable", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Failure;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult$SecureStoreUnavailable;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class SecureStoreUnavailable implements Failure {
        public static final SecureStoreUnavailable INSTANCE = new SecureStoreUnavailable();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(26));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecureStoreUnavailable);
        }

        public final int hashCode() {
            return 102093928;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "SecureStoreUnavailable";
        }
    }

    @SerialName("Success")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Success", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Success implements BiometricsWriteResult {
        public static final Success INSTANCE = new Success();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(27));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -1998365151;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Success";
        }
    }

    @SerialName("Unspecified")
    @Serializable
    public final class Unspecified implements Failure {
        public static final Companion Companion = new Companion();
        public final String message;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Unspecified$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsWriteResult$Unspecified;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BiometricsWriteResult$Unspecified$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Unspecified(int i, String str) {
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
            return (obj instanceof Unspecified) && Intrinsics.areEqual(this.message, ((Unspecified) obj).message);
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unspecified(message=", this.message, ")");
        }

        public Unspecified(String str) {
            this.message = str;
        }
    }
}
