package com.squareup.cash.treehouse.activity;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public interface FormattingResult {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/FormattingResult$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/FormattingResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.activity.FormattingResult", reflectionFactory.getOrCreateKotlinClass(FormattingResult.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Failure.class), reflectionFactory.getOrCreateKotlinClass(Success.class)}, new KSerializer[]{FormattingResult$Failure$$serializer.INSTANCE, FormattingResult$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Failure")
    @Serializable
    public final class Failure implements FormattingResult {
        public static final Companion Companion = new Companion();
        public final String exceptionName;
        public final String reason;
        public final String stacktrace;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/FormattingResult$Failure$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/FormattingResult$Failure;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FormattingResult$Failure$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Failure(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                TuplesKt.throwMissingFieldException(i, 7, FormattingResult$Failure$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.reason = str;
            this.exceptionName = str2;
            this.stacktrace = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.reason, failure.reason) && Intrinsics.areEqual(this.exceptionName, failure.exceptionName) && Intrinsics.areEqual(this.stacktrace, failure.stacktrace);
        }

        public final String getExceptionName() {
            return this.exceptionName;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStacktrace() {
            return this.stacktrace;
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.exceptionName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.stacktrace;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(reason=", this.reason, ", exceptionName=", this.exceptionName, ", stacktrace="), this.stacktrace, ")");
        }
    }

    @SerialName("Success")
    @Serializable
    public final class Success implements FormattingResult {
        public static final Companion Companion = new Companion();
        public final SerializableRenderedActivityItem renderedActivityItem;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/FormattingResult$Success$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/FormattingResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FormattingResult$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, SerializableRenderedActivityItem serializableRenderedActivityItem) {
            if (1 == (i & 1)) {
                this.renderedActivityItem = serializableRenderedActivityItem;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, FormattingResult$Success$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.renderedActivityItem, ((Success) obj).renderedActivityItem);
        }

        public final SerializableRenderedActivityItem getRenderedActivityItem() {
            return this.renderedActivityItem;
        }

        public final int hashCode() {
            return this.renderedActivityItem.hashCode();
        }

        public final String toString() {
            return "Success(renderedActivityItem=" + this.renderedActivityItem + ")";
        }
    }
}
