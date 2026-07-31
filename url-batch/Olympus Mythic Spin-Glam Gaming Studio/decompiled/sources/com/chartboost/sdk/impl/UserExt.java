package com.chartboost.sdk.impl;

import com.pubmatic.sdk.openwrap.core.POBConstants;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\b\u001aB+\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010&B?\b\u0011\u0012\u0006\u0010'\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/chartboost/sdk/impl/lj;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/lj;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getConsentFlag", "()Ljava/lang/Integer;", "getConsentFlag$annotations", "()V", "consentFlag", "b", "getImpDepth", "getImpDepth$annotations", "impDepth", "", "c", "Ljava/lang/Long;", "getSessionDuration", "()Ljava/lang/Long;", "getSessionDuration$annotations", "sessionDuration", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.lj, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class UserExt {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Integer consentFlag;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Integer impDepth;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final Long sessionDuration;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserExt)) {
            return false;
        }
        UserExt userExt = (UserExt) other;
        return Intrinsics.areEqual(this.consentFlag, userExt.consentFlag) && Intrinsics.areEqual(this.impDepth, userExt.impDepth) && Intrinsics.areEqual(this.sessionDuration, userExt.sessionDuration);
    }

    public int hashCode() {
        Integer num = this.consentFlag;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.impDepth;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.sessionDuration;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "UserExt(consentFlag=" + this.consentFlag + ", impDepth=" + this.impDepth + ", sessionDuration=" + this.sessionDuration + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.lj$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.UserExt", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("consent", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_IMP_DEPTH, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_SESSION_DURATION, true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserExt deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            Long l;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            Integer num3 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, intSerializer, null);
                l = (Long) beginStructure.decodeNullableSerializableElement(descriptor, 2, LongSerializer.INSTANCE, null);
                i = 7;
                num = num4;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num5 = null;
                Long l2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num3);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num5);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        l2 = (Long) beginStructure.decodeNullableSerializableElement(descriptor, 2, LongSerializer.INSTANCE, l2);
                        i2 |= 4;
                    }
                }
                i = i2;
                num = num3;
                num2 = num5;
                l = l2;
            }
            beginStructure.endStructure(descriptor);
            return new UserExt(i, num, num2, l, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
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
        public void serialize(Encoder encoder, UserExt value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            UserExt.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.lj$b, reason: from kotlin metadata */
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

    public /* synthetic */ UserExt(int i, Integer num, Integer num2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.consentFlag = null;
        } else {
            this.consentFlag = num;
        }
        if ((i & 2) == 0) {
            this.impDepth = null;
        } else {
            this.impDepth = num2;
        }
        if ((i & 4) == 0) {
            this.sessionDuration = null;
        } else {
            this.sessionDuration = l;
        }
    }

    public static final /* synthetic */ void a(UserExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.consentFlag != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.consentFlag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.impDepth != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.impDepth);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.sessionDuration == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.sessionDuration);
    }

    public UserExt(Integer num, Integer num2, Long l) {
        this.consentFlag = num;
        this.impDepth = num2;
        this.sessionDuration = l;
    }
}
