package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.CompanionAd;
import com.chartboost.sdk.impl.VideoExt;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002\b\u001aBI\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010*¢\u0006\u0004\b1\u00102B]\b\u0011\u0012\u0006\u00103\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010*\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b1\u00106J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010!\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R(\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010'R\"\u00100\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0018\u001a\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/chartboost/sdk/impl/gk;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/gk;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getW", "()Ljava/lang/Integer;", "getW$annotations", "()V", "w", "b", "getH", "getH$annotations", "h", "c", "getPlacement", "getPlacement$annotations", "placement", "", "Lcom/chartboost/sdk/impl/x4;", "d", "Ljava/util/List;", "getCompanionAd", "()Ljava/util/List;", "getCompanionAd$annotations", "companionAd", "Lcom/chartboost/sdk/impl/ok;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/chartboost/sdk/impl/ok;", "getExt", "()Lcom/chartboost/sdk/impl/ok;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/impl/ok;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/chartboost/sdk/impl/ok;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.gk, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Video {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer[] f = {null, null, null, new ArrayListSerializer(CompanionAd.a.a), null};

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Integer w;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Integer h;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final Integer placement;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final List companionAd;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final VideoExt ext;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Video)) {
            return false;
        }
        Video video = (Video) other;
        return Intrinsics.areEqual(this.w, video.w) && Intrinsics.areEqual(this.h, video.h) && Intrinsics.areEqual(this.placement, video.placement) && Intrinsics.areEqual(this.companionAd, video.companionAd) && Intrinsics.areEqual(this.ext, video.ext);
    }

    public int hashCode() {
        Integer num = this.w;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.h;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.placement;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.companionAd;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        VideoExt videoExt = this.ext;
        return hashCode4 + (videoExt != null ? videoExt.hashCode() : 0);
    }

    public String toString() {
        return "Video(w=" + this.w + ", h=" + this.h + ", placement=" + this.placement + ", companionAd=" + this.companionAd + ", ext=" + this.ext + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.gk$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Video", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            pluginGeneratedSerialDescriptor.addElement("placement", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_VIDEO_COMPANION_AD, true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Video deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            Integer num3;
            List list;
            VideoExt videoExt;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArr = Video.f;
            Integer num4 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                Integer num6 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, intSerializer, null);
                Integer num7 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 2, intSerializer, null);
                list = (List) beginStructure.decodeNullableSerializableElement(descriptor, 3, kSerializerArr[3], null);
                num3 = num7;
                videoExt = (VideoExt) beginStructure.decodeNullableSerializableElement(descriptor, 4, VideoExt.a.a, null);
                i = 31;
                num2 = num6;
                num = num5;
            } else {
                boolean z = true;
                int i2 = 0;
                Integer num8 = null;
                Integer num9 = null;
                List list2 = null;
                VideoExt videoExt2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num4);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        num8 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num8);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        num9 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, num9);
                        i2 |= 4;
                    } else if (decodeElementIndex == 3) {
                        list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor, 3, kSerializerArr[3], list2);
                        i2 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        videoExt2 = (VideoExt) beginStructure.decodeNullableSerializableElement(descriptor, 4, VideoExt.a.a, videoExt2);
                        i2 |= 16;
                    }
                }
                i = i2;
                num = num4;
                num2 = num8;
                num3 = num9;
                list = list2;
                videoExt = videoExt2;
            }
            beginStructure.endStructure(descriptor);
            return new Video(i, num, num2, num3, list, videoExt, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = Video.f;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(VideoExt.a.a)};
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
        public void serialize(Encoder encoder, Video value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Video.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.gk$b, reason: from kotlin metadata */
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

    public /* synthetic */ Video(int i, Integer num, Integer num2, Integer num3, List list, VideoExt videoExt, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 4) == 0) {
            this.placement = null;
        } else {
            this.placement = num3;
        }
        if ((i & 8) == 0) {
            this.companionAd = null;
        } else {
            this.companionAd = list;
        }
        if ((i & 16) == 0) {
            this.ext = null;
        } else {
            this.ext = videoExt;
        }
    }

    public static final /* synthetic */ void a(Video self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = f;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.placement != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.placement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.companionAd != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.companionAd);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, VideoExt.a.a, self.ext);
    }

    public Video(Integer num, Integer num2, Integer num3, List list, VideoExt videoExt) {
        this.w = num;
        this.h = num2;
        this.placement = num3;
        this.companionAd = list;
        this.ext = videoExt;
    }
}
