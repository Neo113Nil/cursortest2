package com.chartboost.sdk.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\b\u0016B%\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bB9\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\b\u0010\fR\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\f¨\u0006!"}, d2 = {"Lcom/chartboost/sdk/impl/d7;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/d7;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "banner", "b", "interstitial", "c", "rewarded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.d7, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class EndpointConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String banner;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String interstitial;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final String rewarded;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointConfig)) {
            return false;
        }
        EndpointConfig endpointConfig = (EndpointConfig) other;
        return Intrinsics.areEqual(this.banner, endpointConfig.banner) && Intrinsics.areEqual(this.interstitial, endpointConfig.interstitial) && Intrinsics.areEqual(this.rewarded, endpointConfig.rewarded);
    }

    public int hashCode() {
        return (((this.banner.hashCode() * 31) + this.interstitial.hashCode()) * 31) + this.rewarded.hashCode();
    }

    public String toString() {
        return "EndpointConfig(banner=" + this.banner + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.d7$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.EndpointConfig", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("banner", true);
            pluginGeneratedSerialDescriptor.addElement("interstitial", true);
            pluginGeneratedSerialDescriptor.addElement("rewarded", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EndpointConfig deserialize(Decoder decoder) {
            String str;
            String str2;
            String str3;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(descriptor, 0);
                String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 1);
                str = decodeStringElement;
                str2 = beginStructure.decodeStringElement(descriptor, 2);
                str3 = decodeStringElement2;
                i = 7;
            } else {
                String str4 = null;
                String str5 = null;
                String str6 = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str4 = beginStructure.decodeStringElement(descriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str6 = beginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str5 = beginStructure.decodeStringElement(descriptor, 2);
                        i2 |= 4;
                    }
                }
                str = str4;
                str2 = str5;
                str3 = str6;
                i = i2;
            }
            beginStructure.endStructure(descriptor);
            return new EndpointConfig(i, str, str3, str2, null);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, EndpointConfig value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            EndpointConfig.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    public /* synthetic */ EndpointConfig(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.banner = "";
        } else {
            this.banner = str;
        }
        if ((i & 2) == 0) {
            this.interstitial = "";
        } else {
            this.interstitial = str2;
        }
        if ((i & 4) == 0) {
            this.rewarded = "";
        } else {
            this.rewarded = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: b, reason: from getter */
    public final String getInterstitial() {
        return this.interstitial;
    }

    public EndpointConfig(String banner, String interstitial, String rewarded) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.banner = banner;
        this.interstitial = interstitial;
        this.rewarded = rewarded;
    }

    /* renamed from: c, reason: from getter */
    public final String getRewarded() {
        return this.rewarded;
    }

    /* renamed from: com.chartboost.sdk.impl.d7$b, reason: from kotlin metadata */
    public static final class Companion {
        public final EndpointConfig a() {
            return new EndpointConfig("https://tracking.da.chartboost.com/unified/v1/sdk/banner", "https://tracking.da.chartboost.com/unified/v1/sdk/interstitial", "https://tracking.da.chartboost.com/unified/v1/sdk/rewarded");
        }

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

    public static final /* synthetic */ void a(EndpointConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.banner, "")) {
            output.encodeStringElement(serialDesc, 0, self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.interstitial, "")) {
            output.encodeStringElement(serialDesc, 1, self.interstitial);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.rewarded, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.rewarded);
    }
}
