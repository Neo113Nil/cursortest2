package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002\b\u001aBU\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010.¢\u0006\u0004\b5\u00106Bi\b\u0011\u0012\u0006\u00107\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010.\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\"\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\fR\"\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\fR(\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0018\u001a\u0004\b*\u0010+R\"\u00104\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0018\u001a\u0004\b1\u00102¨\u0006<"}, d2 = {"Lcom/chartboost/sdk/impl/qf;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/qf;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCoppa", "()Ljava/lang/Integer;", "getCoppa$annotations", "()V", "coppa", "b", "getGdpr", "getGdpr$annotations", "gdpr", "c", "Ljava/lang/String;", "getUsPrivacy", "getUsPrivacy$annotations", "usPrivacy", "d", "getGpp", "getGpp$annotations", "gpp", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getGppSid", "()Ljava/util/List;", "getGppSid$annotations", "gppSid", "Lkotlinx/serialization/json/JsonObject;", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlinx/serialization/json/JsonObject;", "getExt", "()Lkotlinx/serialization/json/JsonObject;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.qf, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class Regs {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer[] g = {null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Integer coppa;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final Integer gdpr;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final String usPrivacy;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final String gpp;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final List gppSid;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final JsonObject ext;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Regs)) {
            return false;
        }
        Regs regs = (Regs) other;
        return Intrinsics.areEqual(this.coppa, regs.coppa) && Intrinsics.areEqual(this.gdpr, regs.gdpr) && Intrinsics.areEqual(this.usPrivacy, regs.usPrivacy) && Intrinsics.areEqual(this.gpp, regs.gpp) && Intrinsics.areEqual(this.gppSid, regs.gppSid) && Intrinsics.areEqual(this.ext, regs.ext);
    }

    public int hashCode() {
        Integer num = this.coppa;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.gdpr;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.usPrivacy;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gpp;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.gppSid;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        JsonObject jsonObject = this.ext;
        return hashCode5 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "Regs(coppa=" + this.coppa + ", gdpr=" + this.gdpr + ", usPrivacy=" + this.usPrivacy + ", gpp=" + this.gpp + ", gppSid=" + this.gppSid + ", ext=" + this.ext + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.qf$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Regs", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement("coppa", true);
            pluginGeneratedSerialDescriptor.addElement("gdpr", true);
            pluginGeneratedSerialDescriptor.addElement("us_privacy", true);
            pluginGeneratedSerialDescriptor.addElement("gpp", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_GPP_SID, true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Regs deserialize(Decoder decoder) {
            int i;
            Integer num;
            Integer num2;
            String str;
            String str2;
            List list;
            JsonObject jsonObject;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArr = Regs.g;
            int i2 = 5;
            Integer num3 = null;
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                Integer num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
                String str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
                list = (List) beginStructure.decodeNullableSerializableElement(descriptor, 4, kSerializerArr[4], null);
                num2 = num5;
                jsonObject = (JsonObject) beginStructure.decodeNullableSerializableElement(descriptor, 5, JsonObjectSerializer.INSTANCE, null);
                str2 = str4;
                str = str3;
                i = 63;
                num = num4;
            } else {
                boolean z = true;
                int i3 = 0;
                Integer num6 = null;
                String str5 = null;
                String str6 = null;
                List list2 = null;
                JsonObject jsonObject2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 5;
                        case 0:
                            num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num3);
                            i3 |= 1;
                            i2 = 5;
                        case 1:
                            num6 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num6);
                            i3 |= 2;
                        case 2:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str5);
                            i3 |= 4;
                        case 3:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str6);
                            i3 |= 8;
                        case 4:
                            list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor, 4, kSerializerArr[4], list2);
                            i3 |= 16;
                        case 5:
                            jsonObject2 = (JsonObject) beginStructure.decodeNullableSerializableElement(descriptor, i2, JsonObjectSerializer.INSTANCE, jsonObject2);
                            i3 |= 32;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i3;
                num = num3;
                num2 = num6;
                str = str5;
                str2 = str6;
                list = list2;
                jsonObject = jsonObject2;
            }
            beginStructure.endStructure(descriptor);
            return new Regs(i, num, num2, str, str2, list, jsonObject, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            KSerializer[] kSerializerArr = Regs.g;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE)};
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
        public void serialize(Encoder encoder, Regs value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Regs.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.qf$b, reason: from kotlin metadata */
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

    public /* synthetic */ Regs(int i, Integer num, Integer num2, String str, String str2, List list, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coppa = null;
        } else {
            this.coppa = num;
        }
        if ((i & 2) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = num2;
        }
        if ((i & 4) == 0) {
            this.usPrivacy = null;
        } else {
            this.usPrivacy = str;
        }
        if ((i & 8) == 0) {
            this.gpp = null;
        } else {
            this.gpp = str2;
        }
        if ((i & 16) == 0) {
            this.gppSid = null;
        } else {
            this.gppSid = list;
        }
        if ((i & 32) == 0) {
            this.ext = null;
        } else {
            this.ext = jsonObject;
        }
    }

    public static final /* synthetic */ void a(Regs self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = g;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.coppa != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.coppa);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gdpr != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.gdpr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.usPrivacy != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.usPrivacy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.gpp != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.gpp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.gppSid != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, kSerializerArr[4], self.gppSid);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, JsonObjectSerializer.INSTANCE, self.ext);
    }

    public Regs(Integer num, Integer num2, String str, String str2, List list, JsonObject jsonObject) {
        this.coppa = num;
        this.gdpr = num2;
        this.usPrivacy = str;
        this.gpp = str2;
        this.gppSid = list;
        this.ext = jsonObject;
    }
}
