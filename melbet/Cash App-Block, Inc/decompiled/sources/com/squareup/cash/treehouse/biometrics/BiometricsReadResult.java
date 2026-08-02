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
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public interface BiometricsReadResult {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.biometrics.BiometricsReadResult", reflectionFactory.getOrCreateKotlinClass(BiometricsReadResult.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(DecryptionFailure.class), reflectionFactory.getOrCreateKotlinClass(LockedOut.class), reflectionFactory.getOrCreateKotlinClass(Unspecified.class), reflectionFactory.getOrCreateKotlinClass(UserCancelled.class), reflectionFactory.getOrCreateKotlinClass(NoValue.class), reflectionFactory.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{new EnumSerializer("DecryptionFailure", DecryptionFailure.INSTANCE, new Annotation[0]), new EnumSerializer("LockedOut", LockedOut.INSTANCE, new Annotation[0]), BiometricsReadResult$Unspecified$$serializer.INSTANCE, new EnumSerializer("UserCancelled", UserCancelled.INSTANCE, new Annotation[0]), new EnumSerializer("NoValue", NoValue.INSTANCE, new Annotation[0]), BiometricsReadResult$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("DecryptionFailure")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$DecryptionFailure", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$Failure;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$DecryptionFailure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class DecryptionFailure implements Failure {
        public static final DecryptionFailure INSTANCE = new DecryptionFailure();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(22));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DecryptionFailure);
        }

        public final int hashCode() {
            return -1182380444;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "DecryptionFailure";
        }
    }

    @Serializable
    public interface Failure extends BiometricsReadResult {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$Failure$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$Failure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            public final KSerializer serializer() {
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.squareup.cash.treehouse.biometrics.BiometricsReadResult.Failure", reflectionFactory.getOrCreateKotlinClass(Failure.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(DecryptionFailure.class), reflectionFactory.getOrCreateKotlinClass(LockedOut.class), reflectionFactory.getOrCreateKotlinClass(Unspecified.class), reflectionFactory.getOrCreateKotlinClass(UserCancelled.class)}, new KSerializer[]{new EnumSerializer("DecryptionFailure", DecryptionFailure.INSTANCE, new Annotation[0]), new EnumSerializer("LockedOut", LockedOut.INSTANCE, new Annotation[0]), BiometricsReadResult$Unspecified$$serializer.INSTANCE, new EnumSerializer("UserCancelled", UserCancelled.INSTANCE, new Annotation[0])}, new Annotation[0]);
            }
        }
    }

    @SerialName("LockedOut")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$LockedOut", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$Failure;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$LockedOut;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class LockedOut implements Failure {
        public static final LockedOut INSTANCE = new LockedOut();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(23));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LockedOut);
        }

        public final int hashCode() {
            return 959536537;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "LockedOut";
        }
    }

    @SerialName("NoValue")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$NoValue", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$NoValue;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class NoValue implements BiometricsReadResult {
        public static final NoValue INSTANCE = new NoValue();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoValue);
        }

        public final int hashCode() {
            return -1034052827;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "NoValue";
        }
    }

    @SerialName("UserCancelled")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$UserCancelled", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$Failure;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$UserCancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class UserCancelled implements Failure {
        public static final UserCancelled INSTANCE = new UserCancelled();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(25));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserCancelled);
        }

        public final int hashCode() {
            return 413351163;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "UserCancelled";
        }
    }

    @SerialName("Unspecified")
    @Serializable
    public final class Unspecified implements Failure {
        public static final Companion Companion = new Companion();
        public final String message;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$Unspecified$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$Unspecified;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BiometricsReadResult$Unspecified$$serializer.INSTANCE;
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

    @SerialName("Success")
    @Serializable
    public final class Success implements BiometricsReadResult {
        public static final Companion Companion = new Companion();
        public final String value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/biometrics/BiometricsReadResult$Success$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/biometrics/BiometricsReadResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BiometricsReadResult$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, String str) {
            if (1 == (i & 1)) {
                this.value = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, BiometricsReadResult$Success$$serializer.INSTANCE.getDescriptor());
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
            this.value = str;
        }
    }
}
