package com.squareup.cash.treehouse.sqldelight;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes7.dex */
public interface SqlType {
    public static final Companion Companion = Companion.$$INSTANCE;

    @SerialName("Boolean")
    @JvmInline
    @Serializable
    public final class Boolean implements SqlType {
        public static final Companion Companion = new Companion();
        public final boolean value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType$Boolean$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Boolean;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return SqlType$Boolean$$serializer.INSTANCE;
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Boolean) {
                return this.value == ((Boolean) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.value);
        }

        public final java.lang.String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Boolean(value=", ")", this.value);
        }
    }

    @SerialName("Bytes")
    @JvmInline
    @Serializable
    public final class Bytes implements SqlType {
        public static final Companion Companion = new Companion();
        public final byte[] value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType$Bytes$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Bytes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return SqlType$Bytes$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Bytes(byte[] bArr) {
            this.value = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Bytes) {
                return Intrinsics.areEqual(this.value, ((Bytes) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.value);
        }

        public final java.lang.String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Bytes(value=", Arrays.toString(this.value), ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.sqldelight.SqlType", reflectionFactory.getOrCreateKotlinClass(SqlType.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Boolean.class), reflectionFactory.getOrCreateKotlinClass(Bytes.class), reflectionFactory.getOrCreateKotlinClass(Double.class), reflectionFactory.getOrCreateKotlinClass(Long.class), reflectionFactory.getOrCreateKotlinClass(String.class)}, new KSerializer[]{SqlType$Boolean$$serializer.INSTANCE, SqlType$Bytes$$serializer.INSTANCE, SqlType$Double$$serializer.INSTANCE, SqlType$Long$$serializer.INSTANCE, SqlType$String$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Double")
    @JvmInline
    @Serializable
    public final class Double implements SqlType {
        public static final Companion Companion = new Companion();
        public final double value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType$Double$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Double;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return SqlType$Double$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Double(double d) {
            this.value = d;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Double) {
                return java.lang.Double.compare(this.value, ((Double) obj).value) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return java.lang.Double.hashCode(this.value);
        }

        public final java.lang.String toString() {
            return "Double(value=" + this.value + ")";
        }
    }

    @SerialName("Long")
    @JvmInline
    @Serializable
    public final class Long implements SqlType {
        public static final Companion Companion = new Companion();
        public final long value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType$Long$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$Long;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return SqlType$Long$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Long(long j) {
            this.value = j;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Long) {
                return this.value == ((Long) obj).value;
            }
            return false;
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.value);
        }

        public final java.lang.String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.value, "Long(value=", ")");
        }
    }

    @SerialName("String")
    @JvmInline
    @Serializable
    public final class String implements SqlType {
        public static final Companion Companion = new Companion();
        public final java.lang.String value;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/sqldelight/SqlType$String$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/sqldelight/SqlType$String;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return SqlType$String$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ String(java.lang.String str) {
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof String) {
                return Intrinsics.areEqual(this.value, ((String) obj).value);
            }
            return false;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final java.lang.String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("String(value=", this.value, ")");
        }
    }
}
