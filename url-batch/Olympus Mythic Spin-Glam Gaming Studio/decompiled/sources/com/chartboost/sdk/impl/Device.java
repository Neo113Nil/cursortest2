package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.DeviceExt;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002\b\u001aB»\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bX\u0010YBÏ\u0001\b\u0011\u0012\u0006\u0010Z\u001a\u00020\r\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010:\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010Q\u0012\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bX\u0010]J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\fR\"\u0010\"\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u0012\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u0016R\"\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001b\u0012\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\fR\"\u0010*\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001b\u0012\u0004\b)\u0010\u0018\u001a\u0004\b(\u0010\fR\"\u0010.\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u001b\u0012\u0004\b-\u0010\u0018\u001a\u0004\b,\u0010\fR\"\u00102\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u001b\u0012\u0004\b1\u0010\u0018\u001a\u0004\b0\u0010\fR\"\u00103\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0014\u0012\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010\u0016R\"\u00109\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u0014\u0012\u0004\b8\u0010\u0018\u001a\u0004\b7\u0010\u0016R\"\u0010@\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010\u0018\u001a\u0004\b=\u0010>R\"\u0010D\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010\u001b\u0012\u0004\bC\u0010\u0018\u001a\u0004\bB\u0010\fR\"\u0010H\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010\u001b\u0012\u0004\bG\u0010\u0018\u001a\u0004\bF\u0010\fR\"\u0010L\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010\u0014\u0012\u0004\bK\u0010\u0018\u001a\u0004\bJ\u0010\u0016R\"\u0010P\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010\u001b\u0012\u0004\bO\u0010\u0018\u001a\u0004\bN\u0010\fR\"\u0010W\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010\u0018\u001a\u0004\bT\u0010U¨\u0006_"}, d2 = {"Lcom/chartboost/sdk/impl/k6;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/k6;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getLmt", "()Ljava/lang/Integer;", "getLmt$annotations", "()V", "lmt", "b", "Ljava/lang/String;", "getUa", "getUa$annotations", "ua", "c", "getDeviceType", "getDeviceType$annotations", "deviceType", "d", "getMake", "getMake$annotations", "make", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getModel", "getModel$annotations", "model", InneractiveMediationDefs.GENDER_FEMALE, "getOs", "getOs$annotations", "os", "g", "getOsv", "getOsv$annotations", "osv", "h", "getH", "getH$annotations", "i", "getW", "getW$annotations", "w", "", com.mbridge.msdk.foundation.same.report.j.b, "Ljava/lang/Float;", "getPxRatio", "()Ljava/lang/Float;", "getPxRatio$annotations", "pxRatio", CampaignEx.JSON_KEY_AD_K, "getLanguage", "getLanguage$annotations", POBConstants.KEY_LANGUAGE, "l", "getCarrier", "getCarrier$annotations", "carrier", "m", "getConnectionType", "getConnectionType$annotations", "connectionType", "n", "getIfa", "getIfa$annotations", "ifa", "Lcom/chartboost/sdk/impl/n6;", "o", "Lcom/chartboost/sdk/impl/n6;", "getExt", "()Lcom/chartboost/sdk/impl/n6;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/impl/n6;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/chartboost/sdk/impl/n6;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.k6, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class Device {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final Integer lmt;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final String ua;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final Integer deviceType;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final String make;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final String model;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final String os;

    /* renamed from: g, reason: from kotlin metadata and from toString */
    public final String osv;
    public final Integer h;

    /* renamed from: i, reason: from kotlin metadata and from toString */
    public final Integer w;

    /* renamed from: j, reason: from kotlin metadata and from toString */
    public final Float pxRatio;

    /* renamed from: k, reason: from kotlin metadata and from toString */
    public final String language;

    /* renamed from: l, reason: from kotlin metadata and from toString */
    public final String carrier;

    /* renamed from: m, reason: from kotlin metadata and from toString */
    public final Integer connectionType;

    /* renamed from: n, reason: from kotlin metadata and from toString */
    public final String ifa;

    /* renamed from: o, reason: from kotlin metadata and from toString */
    public final DeviceExt ext;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return Intrinsics.areEqual(this.lmt, device.lmt) && Intrinsics.areEqual(this.ua, device.ua) && Intrinsics.areEqual(this.deviceType, device.deviceType) && Intrinsics.areEqual(this.make, device.make) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.os, device.os) && Intrinsics.areEqual(this.osv, device.osv) && Intrinsics.areEqual(this.h, device.h) && Intrinsics.areEqual(this.w, device.w) && Intrinsics.areEqual((Object) this.pxRatio, (Object) device.pxRatio) && Intrinsics.areEqual(this.language, device.language) && Intrinsics.areEqual(this.carrier, device.carrier) && Intrinsics.areEqual(this.connectionType, device.connectionType) && Intrinsics.areEqual(this.ifa, device.ifa) && Intrinsics.areEqual(this.ext, device.ext);
    }

    public int hashCode() {
        Integer num = this.lmt;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ua;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.make;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.os;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osv;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.h;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.w;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.pxRatio;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        String str6 = this.language;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.carrier;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.connectionType;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.ifa;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        DeviceExt deviceExt = this.ext;
        return hashCode14 + (deviceExt != null ? deviceExt.hashCode() : 0);
    }

    public String toString() {
        return "Device(lmt=" + this.lmt + ", ua=" + this.ua + ", deviceType=" + this.deviceType + ", make=" + this.make + ", model=" + this.model + ", os=" + this.os + ", osv=" + this.osv + ", h=" + this.h + ", w=" + this.w + ", pxRatio=" + this.pxRatio + ", language=" + this.language + ", carrier=" + this.carrier + ", connectionType=" + this.connectionType + ", ifa=" + this.ifa + ", ext=" + this.ext + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.k6$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Device", aVar, 15);
            pluginGeneratedSerialDescriptor.addElement("lmt", true);
            pluginGeneratedSerialDescriptor.addElement("ua", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_DEVICE_TYPE, true);
            pluginGeneratedSerialDescriptor.addElement("make", true);
            pluginGeneratedSerialDescriptor.addElement("model", true);
            pluginGeneratedSerialDescriptor.addElement("os", true);
            pluginGeneratedSerialDescriptor.addElement("osv", true);
            pluginGeneratedSerialDescriptor.addElement("h", true);
            pluginGeneratedSerialDescriptor.addElement("w", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_PXRATIO, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_LANGUAGE, true);
            pluginGeneratedSerialDescriptor.addElement("carrier", true);
            pluginGeneratedSerialDescriptor.addElement("connectiontype", true);
            pluginGeneratedSerialDescriptor.addElement("ifa", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Device deserialize(Decoder decoder) {
            Integer num;
            String str;
            int i;
            DeviceExt deviceExt;
            Integer num2;
            String str2;
            Float f;
            Integer num3;
            String str3;
            String str4;
            Integer num4;
            String str5;
            String str6;
            Integer num5;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            Integer num6;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num7 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, intSerializer, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str12 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
                Integer num8 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 2, intSerializer, null);
                String str13 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
                String str14 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
                String str15 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
                String str16 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
                Integer num9 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 7, intSerializer, null);
                Integer num10 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 8, intSerializer, null);
                Float f2 = (Float) beginStructure.decodeNullableSerializableElement(descriptor, 9, FloatSerializer.INSTANCE, null);
                String str17 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
                String str18 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 11, stringSerializer, null);
                Integer num11 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 12, intSerializer, null);
                String str19 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 13, stringSerializer, null);
                deviceExt = (DeviceExt) beginStructure.decodeNullableSerializableElement(descriptor, 14, DeviceExt.a.a, null);
                str8 = str19;
                num = num7;
                i = 32767;
                f = f2;
                str2 = str17;
                num4 = num9;
                str3 = str16;
                str5 = str15;
                str7 = str13;
                num3 = num10;
                str = str14;
                num5 = num8;
                num2 = num11;
                str4 = str18;
                str6 = str12;
            } else {
                boolean z = true;
                String str20 = null;
                String str21 = null;
                DeviceExt deviceExt2 = null;
                Integer num12 = null;
                Integer num13 = null;
                String str22 = null;
                Float f3 = null;
                Integer num14 = null;
                String str23 = null;
                String str24 = null;
                Integer num15 = null;
                String str25 = null;
                Integer num16 = null;
                String str26 = null;
                int i2 = 0;
                String str27 = null;
                while (z) {
                    Integer num17 = num12;
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            str10 = str20;
                            str11 = str27;
                            num6 = num17;
                            z = false;
                            num12 = num6;
                            str27 = str11;
                            str20 = str10;
                        case 0:
                            str10 = str20;
                            str11 = str27;
                            num6 = num17;
                            num16 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num16);
                            i2 |= 1;
                            str26 = str26;
                            num12 = num6;
                            str27 = str11;
                            str20 = str10;
                        case 1:
                            str10 = str20;
                            str11 = str27;
                            num6 = num17;
                            str26 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str26);
                            i2 |= 2;
                            num12 = num6;
                            str27 = str11;
                            str20 = str10;
                        case 2:
                            str10 = str20;
                            str11 = str27;
                            num12 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 2, IntSerializer.INSTANCE, num17);
                            i2 |= 4;
                            str27 = str11;
                            str20 = str10;
                        case 3:
                            i2 |= 8;
                            str27 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str27);
                            str20 = str20;
                            num12 = num17;
                        case 4:
                            str9 = str27;
                            str21 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, str21);
                            i2 |= 16;
                            num12 = num17;
                            str27 = str9;
                        case 5:
                            str9 = str27;
                            str25 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str25);
                            i2 |= 32;
                            num12 = num17;
                            str27 = str9;
                        case 6:
                            str9 = str27;
                            str23 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, str23);
                            i2 |= 64;
                            num12 = num17;
                            str27 = str9;
                        case 7:
                            str9 = str27;
                            num15 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, num15);
                            i2 |= 128;
                            num12 = num17;
                            str27 = str9;
                        case 8:
                            str9 = str27;
                            num14 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, num14);
                            i2 |= 256;
                            num12 = num17;
                            str27 = str9;
                        case 9:
                            str9 = str27;
                            f3 = (Float) beginStructure.decodeNullableSerializableElement(descriptor, 9, FloatSerializer.INSTANCE, f3);
                            i2 |= 512;
                            num12 = num17;
                            str27 = str9;
                        case 10:
                            str9 = str27;
                            str22 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, str22);
                            i2 |= 1024;
                            num12 = num17;
                            str27 = str9;
                        case 11:
                            str9 = str27;
                            str24 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, str24);
                            i2 |= 2048;
                            num12 = num17;
                            str27 = str9;
                        case 12:
                            str9 = str27;
                            num13 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, num13);
                            i2 |= 4096;
                            num12 = num17;
                            str27 = str9;
                        case 13:
                            str9 = str27;
                            str20 = (String) beginStructure.decodeNullableSerializableElement(descriptor, 13, StringSerializer.INSTANCE, str20);
                            i2 |= 8192;
                            num12 = num17;
                            str27 = str9;
                        case 14:
                            str9 = str27;
                            deviceExt2 = (DeviceExt) beginStructure.decodeNullableSerializableElement(descriptor, 14, DeviceExt.a.a, deviceExt2);
                            i2 |= 16384;
                            num12 = num17;
                            str27 = str9;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                num = num16;
                str = str21;
                i = i2;
                deviceExt = deviceExt2;
                num2 = num13;
                str2 = str22;
                f = f3;
                num3 = num14;
                str3 = str23;
                str4 = str24;
                num4 = num15;
                str5 = str25;
                str6 = str26;
                num5 = num12;
                str7 = str27;
                str8 = str20;
            }
            beginStructure.endStructure(descriptor);
            return new Device(i, num, str6, num5, str7, str, str5, str3, num4, num3, f, str2, str4, num2, str8, deviceExt, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(DeviceExt.a.a)};
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
        public void serialize(Encoder encoder, Device value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Device.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.k6$b, reason: from kotlin metadata */
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

    public /* synthetic */ Device(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, DeviceExt deviceExt, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 2) == 0) {
            this.ua = null;
        } else {
            this.ua = str;
        }
        if ((i & 4) == 0) {
            this.deviceType = null;
        } else {
            this.deviceType = num2;
        }
        if ((i & 8) == 0) {
            this.make = null;
        } else {
            this.make = str2;
        }
        if ((i & 16) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 32) == 0) {
            this.os = null;
        } else {
            this.os = str4;
        }
        if ((i & 64) == 0) {
            this.osv = null;
        } else {
            this.osv = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.w = null;
        } else {
            this.w = num4;
        }
        if ((i & 512) == 0) {
            this.pxRatio = null;
        } else {
            this.pxRatio = f;
        }
        if ((i & 1024) == 0) {
            this.language = null;
        } else {
            this.language = str6;
        }
        if ((i & 2048) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str7;
        }
        if ((i & 4096) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = num5;
        }
        if ((i & 8192) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str8;
        }
        if ((i & 16384) == 0) {
            this.ext = null;
        } else {
            this.ext = deviceExt;
        }
    }

    public static final /* synthetic */ void a(Device self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.lmt != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.lmt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ua != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.ua);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.deviceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.deviceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.make != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.make);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.model != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.model);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.os != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.os);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.osv != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.osv);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.pxRatio != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, FloatSerializer.INSTANCE, self.pxRatio);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.language != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.carrier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.connectionType != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, IntSerializer.INSTANCE, self.connectionType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.ifa != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.ifa);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 14) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 14, DeviceExt.a.a, self.ext);
    }

    public Device(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, DeviceExt deviceExt) {
        this.lmt = num;
        this.ua = str;
        this.deviceType = num2;
        this.make = str2;
        this.model = str3;
        this.os = str4;
        this.osv = str5;
        this.h = num3;
        this.w = num4;
        this.pxRatio = f;
        this.language = str6;
        this.carrier = str7;
        this.connectionType = num5;
        this.ifa = str8;
        this.ext = deviceExt;
    }

    public /* synthetic */ Device(Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, Integer num4, Float f, String str6, String str7, Integer num5, String str8, DeviceExt deviceExt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : str8, (i & 16384) == 0 ? deviceExt : null);
    }
}
