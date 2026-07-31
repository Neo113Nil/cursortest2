package com.chartboost.sdk.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\b\u001aB\u001f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001e\u0010\u001fB3\b\u0011\u0012\u0006\u0010 \u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/impl/x4;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/x4;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getW", "()Ljava/lang/Integer;", "getW$annotations", "()V", "w", "b", "getH", "getH$annotations", "h", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.x4, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class CompanionAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Integer w;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Integer h;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanionAd)) {
            return false;
        }
        CompanionAd companionAd = (CompanionAd) other;
        return Intrinsics.areEqual(this.w, companionAd.w) && Intrinsics.areEqual(this.h, companionAd.h);
    }

    public int hashCode() {
        Integer num = this.w;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.h;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "CompanionAd(w=" + this.w + ", h=" + this.h + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.x4$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.CompanionAd", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompanionAd deserialize(Decoder decoder) {
            Integer num;
            int i;
            Integer num2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, intSerializer, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                num = null;
                Integer num3 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num3);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num);
                        i2 |= 2;
                    }
                }
                i = i2;
                num2 = num3;
            }
            beginStructure.endStructure(descriptor);
            return new CompanionAd(i, num2, num, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, CompanionAd value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            CompanionAd.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.x4$b, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return a.a;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CompanionAd(int i, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.w = null;
        } else {
            this.w = num;
        }
        if ((i & 2) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
    }

    public static final /* synthetic */ void a(CompanionAd self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.w);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.h == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.h);
    }

    public CompanionAd(Integer num, Integer num2) {
        this.w = num;
        this.h = num2;
    }
}
