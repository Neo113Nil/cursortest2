package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.Banner;
import com.chartboost.sdk.impl.Video;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002\b\u001cB[\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b9\u0010:Bo\b\u0011\u0012\u0006\u0010;\u001a\u00020\r\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\r\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\fR\"\u0010*\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010\fR\"\u00100\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0019\u001a\u0004\b-\u0010.R\"\u00104\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010#\u0012\u0004\b3\u0010\u0019\u001a\u0004\b2\u0010\fR\"\u00108\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010,\u0012\u0004\b7\u0010\u0019\u001a\u0004\b6\u0010.¨\u0006@"}, d2 = {"Lcom/chartboost/sdk/impl/w9;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/w9;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/impl/e2;", "Lcom/chartboost/sdk/impl/e2;", "getBanner", "()Lcom/chartboost/sdk/impl/e2;", "getBanner$annotations", "()V", "banner", "Lcom/chartboost/sdk/impl/gk;", "b", "Lcom/chartboost/sdk/impl/gk;", "getVideo", "()Lcom/chartboost/sdk/impl/gk;", "getVideo$annotations", "video", "c", "Ljava/lang/String;", "getDisplayManager", "getDisplayManager$annotations", "displayManager", "d", "getDisplayManagerVer", "getDisplayManagerVer$annotations", "displayManagerVer", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Integer;", "getInstl", "()Ljava/lang/Integer;", "getInstl$annotations", POBConstants.KEY_INTERSTITIAL, InneractiveMediationDefs.GENDER_FEMALE, "getTagId", "getTagId$annotations", "tagId", "g", "getSecure", "getSecure$annotations", POBConstants.KEY_SECURE, "<init>", "(Lcom/chartboost/sdk/impl/e2;Lcom/chartboost/sdk/impl/gk;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/chartboost/sdk/impl/e2;Lcom/chartboost/sdk/impl/gk;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.w9, reason: from toString */
/* loaded from: classes15.dex */
public final /* data */ class Imp {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Banner banner;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Video video;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final String displayManager;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final String displayManagerVer;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final Integer instl;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final String tagId;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    public final Integer secure;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Imp)) {
            return false;
        }
        Imp imp = (Imp) other;
        return Intrinsics.areEqual(this.banner, imp.banner) && Intrinsics.areEqual(this.video, imp.video) && Intrinsics.areEqual(this.displayManager, imp.displayManager) && Intrinsics.areEqual(this.displayManagerVer, imp.displayManagerVer) && Intrinsics.areEqual(this.instl, imp.instl) && Intrinsics.areEqual(this.tagId, imp.tagId) && Intrinsics.areEqual(this.secure, imp.secure);
    }

    public int hashCode() {
        Banner banner = this.banner;
        int hashCode = (banner == null ? 0 : banner.hashCode()) * 31;
        Video video = this.video;
        int hashCode2 = (hashCode + (video == null ? 0 : video.hashCode())) * 31;
        String str = this.displayManager;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayManagerVer;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.instl;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.tagId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.secure;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Imp(banner=" + this.banner + ", video=" + this.video + ", displayManager=" + this.displayManager + ", displayManagerVer=" + this.displayManagerVer + ", instl=" + this.instl + ", tagId=" + this.tagId + ", secure=" + this.secure + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.w9$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Imp", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("banner", true);
            pluginGeneratedSerialDescriptor.addElement("video", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_DISPLAY_MANAGER, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_DISPLAY_MANAGER_VERSION, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_INTERSTITIAL, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_TAG_ID, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_SECURE, true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Imp deserialize(Decoder decoder) {
            int i;
            Integer num;
            Banner banner;
            Video video;
            String str;
            String str2;
            Integer num2;
            String str3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            int i2 = 6;
            Banner banner2 = null;
            if (beginStructure.decodeSequentially()) {
                Banner banner3 = (Banner) beginStructure.decodeNullableSerializableElement(descriptor, 0, Banner.a.a, null);
                Video video2 = (Video) beginStructure.decodeNullableSerializableElement(descriptor, 1, Video.a.a, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 4, intSerializer, null);
                String str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
                banner = banner3;
                num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 6, intSerializer, null);
                str3 = str6;
                str2 = str5;
                num2 = num3;
                str = str4;
                video = video2;
                i = 127;
            } else {
                boolean z = true;
                int i3 = 0;
                Integer num4 = null;
                Video video3 = null;
                String str7 = null;
                String str8 = null;
                Integer num5 = null;
                String str9 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                        case 0:
                            banner2 = (Banner) beginStructure.decodeNullableSerializableElement(descriptor, 0, Banner.a.a, banner2);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            video3 = (Video) beginStructure.decodeNullableSerializableElement(descriptor, 1, Video.a.a, video3);
                            i3 |= 2;
                            i2 = 6;
                        case 2:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str7);
                            i3 |= 4;
                        case 3:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str8);
                            i3 |= 8;
                        case 4:
                            num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num5);
                            i3 |= 16;
                        case 5:
                            str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str9);
                            i3 |= 32;
                        case 6:
                            num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, i2, IntSerializer.INSTANCE, num4);
                            i3 |= 64;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                num = num4;
                banner = banner2;
                video = video3;
                str = str7;
                str2 = str8;
                num2 = num5;
                str3 = str9;
            }
            beginStructure.endStructure(descriptor);
            return new Imp(i, banner, video, str, str2, num2, str3, num, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            KSerializer nullable = BuiltinSerializersKt.getNullable(Banner.a.a);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(Video.a.a);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
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
        public void serialize(Encoder encoder, Imp value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Imp.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w9$b, reason: from kotlin metadata */
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

    public /* synthetic */ Imp(int i, Banner banner, Video video, String str, String str2, Integer num, String str3, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.banner = null;
        } else {
            this.banner = banner;
        }
        if ((i & 2) == 0) {
            this.video = null;
        } else {
            this.video = video;
        }
        if ((i & 4) == 0) {
            this.displayManager = null;
        } else {
            this.displayManager = str;
        }
        if ((i & 8) == 0) {
            this.displayManagerVer = null;
        } else {
            this.displayManagerVer = str2;
        }
        if ((i & 16) == 0) {
            this.instl = null;
        } else {
            this.instl = num;
        }
        if ((i & 32) == 0) {
            this.tagId = null;
        } else {
            this.tagId = str3;
        }
        if ((i & 64) == 0) {
            this.secure = null;
        } else {
            this.secure = num2;
        }
    }

    public static final /* synthetic */ void a(Imp self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.banner != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Banner.a.a, self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.video != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Video.a.a, self.video);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.displayManager != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.displayManager);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.displayManagerVer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.displayManagerVer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.instl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.instl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.tagId != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.tagId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.secure == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.secure);
    }

    public Imp(Banner banner, Video video, String str, String str2, Integer num, String str3, Integer num2) {
        this.banner = banner;
        this.video = video;
        this.displayManager = str;
        this.displayManagerVer = str2;
        this.instl = num;
        this.tagId = str3;
        this.secure = num2;
    }
}
