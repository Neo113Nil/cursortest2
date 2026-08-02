package com.squareup.cash.treehouse.financialservices;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public interface DirectDepositOnboardingParams {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/financialservices/DirectDepositOnboardingParams$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/financialservices/DirectDepositOnboardingParams;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.financialservices.DirectDepositOnboardingParams", reflectionFactory.getOrCreateKotlinClass(DirectDepositOnboardingParams.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Default.class), reflectionFactory.getOrCreateKotlinClass(PaychecksUpsell.class)}, new KSerializer[]{DirectDepositOnboardingParams$Default$$serializer.INSTANCE, DirectDepositOnboardingParams$PaychecksUpsell$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Default")
    @Serializable
    public final class Default implements DirectDepositOnboardingParams {
        public static final Companion Companion = new Companion();
        public final String exitScreenClientRouteUrl;
        public final String nextScreenClientRouteUrl;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/financialservices/DirectDepositOnboardingParams$Default$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/financialservices/DirectDepositOnboardingParams$Default;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DirectDepositOnboardingParams$Default$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Default(int i, String str, String str2) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, DirectDepositOnboardingParams$Default$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.nextScreenClientRouteUrl = str;
            if ((i & 2) == 0) {
                this.exitScreenClientRouteUrl = null;
            } else {
                this.exitScreenClientRouteUrl = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return Intrinsics.areEqual(this.nextScreenClientRouteUrl, r5.nextScreenClientRouteUrl) && Intrinsics.areEqual(this.exitScreenClientRouteUrl, r5.exitScreenClientRouteUrl);
        }

        public final int hashCode() {
            int hashCode = this.nextScreenClientRouteUrl.hashCode() * 31;
            String str = this.exitScreenClientRouteUrl;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Default(nextScreenClientRouteUrl=", this.nextScreenClientRouteUrl, ", exitScreenClientRouteUrl=", this.exitScreenClientRouteUrl, ")");
        }
    }

    @SerialName("PaychecksUpsell")
    @Serializable
    public final class PaychecksUpsell implements DirectDepositOnboardingParams {
        public static final Companion Companion = new Companion();
        public final String exitScreenClientRouteUrl;
        public final String nextScreenClientRouteUrl;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/financialservices/DirectDepositOnboardingParams$PaychecksUpsell$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/financialservices/DirectDepositOnboardingParams$PaychecksUpsell;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DirectDepositOnboardingParams$PaychecksUpsell$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PaychecksUpsell(int i, String str, String str2) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, DirectDepositOnboardingParams$PaychecksUpsell$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.nextScreenClientRouteUrl = str;
            this.exitScreenClientRouteUrl = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaychecksUpsell)) {
                return false;
            }
            PaychecksUpsell paychecksUpsell = (PaychecksUpsell) obj;
            return Intrinsics.areEqual(this.nextScreenClientRouteUrl, paychecksUpsell.nextScreenClientRouteUrl) && Intrinsics.areEqual(this.exitScreenClientRouteUrl, paychecksUpsell.exitScreenClientRouteUrl);
        }

        public final int hashCode() {
            return this.exitScreenClientRouteUrl.hashCode() + (this.nextScreenClientRouteUrl.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("PaychecksUpsell(nextScreenClientRouteUrl=", this.nextScreenClientRouteUrl, ", exitScreenClientRouteUrl=", this.exitScreenClientRouteUrl, ")");
        }
    }
}
