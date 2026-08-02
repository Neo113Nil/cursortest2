package com.stripe.hcaptcha.config;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.encode.DurationSerializer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/hcaptcha/config/HCaptchaConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class HCaptchaConfig$$serializer implements GeneratedSerializer {
    public static final HCaptchaConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HCaptchaConfig$$serializer hCaptchaConfig$$serializer = new HCaptchaConfig$$serializer();
        INSTANCE = hCaptchaConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.hcaptcha.config.HCaptchaConfig", hCaptchaConfig$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("siteKey", false);
        pluginGeneratedSerialDescriptor.addElement("sentry", true);
        pluginGeneratedSerialDescriptor.addElement("loading", true);
        pluginGeneratedSerialDescriptor.addElement("hideDialog", true);
        pluginGeneratedSerialDescriptor.addElement("rqdata", true);
        pluginGeneratedSerialDescriptor.addElement("jsSrc", true);
        pluginGeneratedSerialDescriptor.addElement("endpoint", true);
        pluginGeneratedSerialDescriptor.addElement("reportapi", true);
        pluginGeneratedSerialDescriptor.addElement("assethost", true);
        pluginGeneratedSerialDescriptor.addElement("imghost", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        pluginGeneratedSerialDescriptor.addElement("host", true);
        pluginGeneratedSerialDescriptor.addElement("customTheme", true);
        pluginGeneratedSerialDescriptor.addElement("tokenExpiration", true);
        pluginGeneratedSerialDescriptor.addElement("disableHardwareAcceleration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = HCaptchaConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, lazyArr[11].getValue(), lazyArr[12].getValue(), lazyArr[13].getValue(), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), DurationSerializer.INSTANCE, booleanSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final HCaptchaConfig deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = HCaptchaConfig.$childSerializers;
        HCaptchaOrientation hCaptchaOrientation = null;
        HCaptchaSize hCaptchaSize = null;
        String str2 = null;
        String str3 = null;
        HCaptchaTheme hCaptchaTheme = null;
        String str4 = null;
        int i2 = 0;
        String str5 = null;
        String str6 = null;
        Duration duration = null;
        boolean z3 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z4 = true;
        String str10 = null;
        String str11 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (z4) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    str = str8;
                    z4 = false;
                    str8 = str;
                case 0:
                    z2 = z3;
                    str = str8;
                    str11 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    z3 = z2;
                    str8 = str;
                case 1:
                    z = z3;
                    z5 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                    z3 = z;
                case 2:
                    z = z3;
                    z6 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                    z3 = z;
                case 3:
                    z3 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                case 4:
                    z2 = z3;
                    str = str8;
                    str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str7);
                    i2 |= 16;
                    z3 = z2;
                    str8 = str;
                case 5:
                    z = z3;
                    str8 = beginStructure.decodeStringElement(serialDescriptor, 5);
                    i2 |= 32;
                    z3 = z;
                case 6:
                    z2 = z3;
                    str = str8;
                    str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str9);
                    i2 |= 64;
                    z3 = z2;
                    str8 = str;
                case 7:
                    z2 = z3;
                    str = str8;
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str4);
                    i2 |= 128;
                    z3 = z2;
                    str8 = str;
                case 8:
                    z2 = z3;
                    str = str8;
                    str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str3);
                    i2 |= 256;
                    z3 = z2;
                    str8 = str;
                case 9:
                    z2 = z3;
                    str = str8;
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str2);
                    i2 |= 512;
                    z3 = z2;
                    str8 = str;
                case 10:
                    z = z3;
                    str10 = beginStructure.decodeStringElement(serialDescriptor, 10);
                    i2 |= 1024;
                    z3 = z;
                case 11:
                    z2 = z3;
                    str = str8;
                    hCaptchaSize = (HCaptchaSize) beginStructure.decodeSerializableElement(serialDescriptor, 11, (KSerializer) lazyArr[11].getValue(), hCaptchaSize);
                    i2 |= 2048;
                    z3 = z2;
                    str8 = str;
                case 12:
                    z2 = z3;
                    str = str8;
                    hCaptchaOrientation = (HCaptchaOrientation) beginStructure.decodeSerializableElement(serialDescriptor, 12, (KSerializer) lazyArr[12].getValue(), hCaptchaOrientation);
                    i2 |= 4096;
                    z3 = z2;
                    str8 = str;
                case 13:
                    z2 = z3;
                    str = str8;
                    hCaptchaTheme = (HCaptchaTheme) beginStructure.decodeSerializableElement(serialDescriptor, 13, (KSerializer) lazyArr[13].getValue(), hCaptchaTheme);
                    i2 |= PKIFailureInfo.certRevoked;
                    z3 = z2;
                    str8 = str;
                case 14:
                    z2 = z3;
                    str = str8;
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str5);
                    i2 |= 16384;
                    z3 = z2;
                    str8 = str;
                case 15:
                    z2 = z3;
                    str = str8;
                    str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str6);
                    i = 32768;
                    i2 |= i;
                    z3 = z2;
                    str8 = str;
                case 16:
                    z2 = z3;
                    str = str8;
                    duration = (Duration) beginStructure.decodeSerializableElement(serialDescriptor, 16, DurationSerializer.INSTANCE, duration);
                    i = 65536;
                    i2 |= i;
                    z3 = z2;
                    str8 = str;
                case 17:
                    z = z3;
                    z7 = beginStructure.decodeBooleanElement(serialDescriptor, 17);
                    i2 |= PKIFailureInfo.unsupportedVersion;
                    z3 = z;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        beginStructure.endStructure(serialDescriptor);
        return new HCaptchaConfig(i2, str11, z5, z6, z3, str7, str8, str9, str4, str3, str2, str10, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str5, str6, duration, z7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v10 com.stripe.hcaptcha.config.HCaptchaTheme, still in use, count: 2, list:
          (r3v10 com.stripe.hcaptcha.config.HCaptchaTheme) from 0x0127: IF  (r3v10 com.stripe.hcaptcha.config.HCaptchaTheme) != (wrap:com.stripe.hcaptcha.config.HCaptchaTheme:0x0123: SGET  A[WRAPPED] com.stripe.hcaptcha.config.HCaptchaTheme.LIGHT com.stripe.hcaptcha.config.HCaptchaTheme)  -> B:44:0x0129 A[HIDDEN]
          (r3v10 com.stripe.hcaptcha.config.HCaptchaTheme) from 0x0129: PHI (r3v17 com.stripe.hcaptcha.config.HCaptchaTheme) = (r3v10 com.stripe.hcaptcha.config.HCaptchaTheme) binds: [B:69:0x0127] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder r22, com.stripe.hcaptcha.config.HCaptchaConfig r23) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.hcaptcha.config.HCaptchaConfig$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.stripe.hcaptcha.config.HCaptchaConfig):void");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
