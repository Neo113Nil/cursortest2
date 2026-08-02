package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010+\u001a\u00020\u0017H\u0016J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableListOfIdAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "nullableBooleanAdapter", "", "localizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "nullableListOfCaptureOptionNativeMobileAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "nullableIntAdapter", "", "nullableLongAdapter", "", "stringAdapter", "", "nullableListOfLocalizationOverrideAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "nullableListOfCaptureFileTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "nullableListOfVideoCaptureMethodAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "nullableStringAdapter", "nullableAssetConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "nullableAutoClassificationConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "nullableAxisAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "nullablePendingPageTextPositionAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "nullableDigitalIdConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$DigitalIdConfig;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_ConfigJsonAdapter extends JsonAdapter {
    private volatile Constructor<NextStep.GovernmentId.Config> constructorRef;
    private final JsonAdapter localizationsAdapter;
    private final JsonAdapter nullableAssetConfigAdapter;
    private final JsonAdapter nullableAutoClassificationConfigAdapter;
    private final JsonAdapter nullableAxisAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableDigitalIdConfigAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableListOfCaptureFileTypeAdapter;
    private final JsonAdapter nullableListOfCaptureOptionNativeMobileAdapter;
    private final JsonAdapter nullableListOfIdAdapter;
    private final JsonAdapter nullableListOfLocalizationOverrideAdapter;
    private final JsonAdapter nullableListOfVideoCaptureMethodAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullablePendingPageTextPositionAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_GovernmentId_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("idclasses", "backStepEnabled", "cancelButtonEnabled", "localizations", "enabledCaptureOptionsNativeMobile", "imageCaptureCount", "nativeMobileCameraManualCaptureDelayMs", "fieldKeyDocument", "fieldKeyIdclass", "localizationOverrides", "shouldSkipReviewScreen", "enabledCaptureFileTypes", "videoCaptureMethods", "videoSessionJWT", "assets", "autoClassificationConfig", "reviewCaptureButtonsAxis", "pendingPageTextVerticalPosition", "audioEnabled", "mobileDriversLicense", "staticCaptureTipsEnabled", "holographicTorchEnabledDurationMs", "govidDesignVersion", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds");
        Util.ParameterizedTypeImpl newParameterizedType = Types.newParameterizedType(List.class, Id.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfIdAdapter = moshi.adapter(newParameterizedType, emptySet, "idclasses");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "backStepEnabled");
        this.localizationsAdapter = moshi.adapter(NextStep.GovernmentId.Localizations.class, emptySet, "localizations");
        this.nullableListOfCaptureOptionNativeMobileAdapter = moshi.adapter(Types.newParameterizedType(List.class, CaptureOptionNativeMobile.class), emptySet, "enabledCaptureOptionsNativeMobile");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "imageCaptureCount");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "nativeMobileCameraManualCaptureDelayMs");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fieldKeyDocument");
        this.nullableListOfLocalizationOverrideAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.GovernmentId.LocalizationOverride.class), emptySet, "localizationOverrides");
        this.nullableListOfCaptureFileTypeAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.GovernmentId.CaptureFileType.class), emptySet, "enabledCaptureFileTypes");
        this.nullableListOfVideoCaptureMethodAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.GovernmentId.VideoCaptureMethod.class), emptySet, "videoCaptureMethods");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "videoSessionJwt");
        this.nullableAssetConfigAdapter = moshi.adapter(NextStep.GovernmentId.AssetConfig.class, emptySet, "assets");
        this.nullableAutoClassificationConfigAdapter = moshi.adapter(NextStep.GovernmentId.AutoClassificationConfig.class, emptySet, "autoClassificationConfig");
        this.nullableAxisAdapter = moshi.adapter(StyleElements.Axis.class, emptySet, "reviewCaptureButtonsAxis");
        this.nullablePendingPageTextPositionAdapter = moshi.adapter(PendingPageTextPosition.class, emptySet, "pendingPageTextVerticalPosition");
        this.nullableDigitalIdConfigAdapter = moshi.adapter(NextStep.GovernmentId.DigitalIdConfig.class, emptySet, "mobileDriversLicense");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.Config fromJson(JsonReader reader) {
        int i;
        int i2;
        reader.getClass();
        reader.beginObject();
        int i3 = -1;
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        NextStep.GovernmentId.Localizations localizations = null;
        List list2 = null;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        List list3 = null;
        Boolean bool3 = null;
        List list4 = null;
        List list5 = null;
        String str3 = null;
        NextStep.GovernmentId.AssetConfig assetConfig = null;
        NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig = null;
        StyleElements.Axis axis = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        Boolean bool4 = null;
        NextStep.GovernmentId.DigitalIdConfig digitalIdConfig = null;
        Boolean bool5 = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = null;
        while (true) {
            List list6 = list;
            if (!reader.hasNext()) {
                Boolean bool6 = bool;
                reader.endObject();
                if (i3 == -58720257) {
                    if (localizations == null) {
                        throw Util.missingProperty("localizations", "localizations", reader);
                    }
                    if (str == null) {
                        throw Util.missingProperty("fieldKeyDocument", "fieldKeyDocument", reader);
                    }
                    if (str2 == null) {
                        throw Util.missingProperty("fieldKeyIdclass", "fieldKeyIdclass", reader);
                    }
                    String str7 = str2;
                    String str8 = str;
                    Long l2 = l;
                    Integer num4 = num;
                    return new NextStep.GovernmentId.Config(list6, bool6, bool2, localizations, list2, num4, l2, str8, str7, list3, bool3, list4, list5, str3, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, bool4, digitalIdConfig, bool5, num2, str4, str5, str6, num3);
                }
                Constructor<NextStep.GovernmentId.Config> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i3;
                    constructor = NextStep.GovernmentId.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, NextStep.GovernmentId.Localizations.class, List.class, Integer.class, Long.class, String.class, String.class, List.class, Boolean.class, List.class, List.class, String.class, NextStep.GovernmentId.AssetConfig.class, NextStep.GovernmentId.AutoClassificationConfig.class, StyleElements.Axis.class, PendingPageTextPosition.class, Boolean.class, NextStep.GovernmentId.DigitalIdConfig.class, Boolean.class, Integer.class, String.class, String.class, String.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                    constructor.getClass();
                } else {
                    i = i3;
                }
                Constructor<NextStep.GovernmentId.Config> constructor2 = constructor;
                if (localizations == null) {
                    throw Util.missingProperty("localizations", "localizations", reader);
                }
                if (str == null) {
                    throw Util.missingProperty("fieldKeyDocument", "fieldKeyDocument", reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("fieldKeyIdclass", "fieldKeyIdclass", reader);
                }
                NextStep.GovernmentId.Config newInstance = constructor2.newInstance(list6, bool6, bool2, localizations, list2, num, l, str, str2, list3, bool3, list4, list5, str3, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, bool4, digitalIdConfig, bool5, num2, str4, str5, str6, num3, Integer.valueOf(i), null);
                newInstance.getClass();
                return newInstance;
            }
            Boolean bool7 = bool;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    bool = bool7;
                    list = list6;
                case 0:
                    list = (List) this.nullableListOfIdAdapter.fromJson(reader);
                    bool = bool7;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list = list6;
                case 2:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 3:
                    localizations = (NextStep.GovernmentId.Localizations) this.localizationsAdapter.fromJson(reader);
                    if (localizations == null) {
                        throw Util.unexpectedNull("localizations", "localizations", reader);
                    }
                    bool = bool7;
                    list = list6;
                case 4:
                    list2 = (List) this.nullableListOfCaptureOptionNativeMobileAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 5:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 6:
                    l = (Long) this.nullableLongAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 7:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("fieldKeyDocument", "fieldKeyDocument", reader);
                    }
                    bool = bool7;
                    list = list6;
                case 8:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("fieldKeyIdclass", "fieldKeyIdclass", reader);
                    }
                    bool = bool7;
                    list = list6;
                case 9:
                    list3 = (List) this.nullableListOfLocalizationOverrideAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 10:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 11:
                    list4 = (List) this.nullableListOfCaptureFileTypeAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 12:
                    list5 = (List) this.nullableListOfVideoCaptureMethodAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 13:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 14:
                    assetConfig = (NextStep.GovernmentId.AssetConfig) this.nullableAssetConfigAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 15:
                    autoClassificationConfig = (NextStep.GovernmentId.AutoClassificationConfig) this.nullableAutoClassificationConfigAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 16:
                    axis = (StyleElements.Axis) this.nullableAxisAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 17:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 18:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 19:
                    digitalIdConfig = (NextStep.GovernmentId.DigitalIdConfig) this.nullableDigitalIdConfigAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 20:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 21:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 22:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    bool = bool7;
                    list = list6;
                case 23:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    i2 = -8388609;
                    i3 &= i2;
                    bool = bool7;
                    list = list6;
                case 24:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    i2 = -16777217;
                    i3 &= i2;
                    bool = bool7;
                    list = list6;
                case 25:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i2 = -33554433;
                    i3 &= i2;
                    bool = bool7;
                    list = list6;
                default:
                    bool = bool7;
                    list = list6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.Config value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("idclasses");
        this.nullableListOfIdAdapter.toJson(writer, value_.getIdclasses());
        writer.name("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.name("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.name("localizations");
        this.localizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.name("enabledCaptureOptionsNativeMobile");
        this.nullableListOfCaptureOptionNativeMobileAdapter.toJson(writer, value_.getEnabledCaptureOptionsNativeMobile());
        writer.name("imageCaptureCount");
        this.nullableIntAdapter.toJson(writer, value_.getImageCaptureCount());
        writer.name("nativeMobileCameraManualCaptureDelayMs");
        this.nullableLongAdapter.toJson(writer, value_.getNativeMobileCameraManualCaptureDelayMs());
        writer.name("fieldKeyDocument");
        this.stringAdapter.toJson(writer, value_.getFieldKeyDocument());
        writer.name("fieldKeyIdclass");
        this.stringAdapter.toJson(writer, value_.getFieldKeyIdclass());
        writer.name("localizationOverrides");
        this.nullableListOfLocalizationOverrideAdapter.toJson(writer, value_.getLocalizationOverrides());
        writer.name("shouldSkipReviewScreen");
        this.nullableBooleanAdapter.toJson(writer, value_.getShouldSkipReviewScreen());
        writer.name("enabledCaptureFileTypes");
        this.nullableListOfCaptureFileTypeAdapter.toJson(writer, value_.getEnabledCaptureFileTypes());
        writer.name("videoCaptureMethods");
        this.nullableListOfVideoCaptureMethodAdapter.toJson(writer, value_.getVideoCaptureMethods());
        writer.name("videoSessionJWT");
        this.nullableStringAdapter.toJson(writer, value_.getVideoSessionJwt());
        writer.name("assets");
        this.nullableAssetConfigAdapter.toJson(writer, value_.getAssets());
        writer.name("autoClassificationConfig");
        this.nullableAutoClassificationConfigAdapter.toJson(writer, value_.getAutoClassificationConfig());
        writer.name("reviewCaptureButtonsAxis");
        this.nullableAxisAdapter.toJson(writer, value_.getReviewCaptureButtonsAxis());
        writer.name("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(writer, value_.getPendingPageTextVerticalPosition());
        writer.name("audioEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getAudioEnabled());
        writer.name("mobileDriversLicense");
        this.nullableDigitalIdConfigAdapter.toJson(writer, value_.getMobileDriversLicense());
        writer.name("staticCaptureTipsEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getStaticCaptureTipsEnabled());
        writer.name("holographicTorchEnabledDurationMs");
        this.nullableIntAdapter.toJson(writer, value_.getHolographicTorchEnabledDurationMs());
        writer.name("govidDesignVersion");
        this.nullableStringAdapter.toJson(writer, value_.getGovidDesignVersion());
        writer.name("flowWatermarkText");
        this.nullableStringAdapter.toJson(writer, value_.getFlowWatermarkText());
        writer.name("silentNetworkAuthenticationCheckUrl");
        this.nullableStringAdapter.toJson(writer, value_.getSilentNetworkAuthenticationCheckUrl());
        writer.name("silentNetworkAuthenticationBackgroundTimeoutSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getSilentNetworkAuthenticationBackgroundTimeoutSeconds());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(NextStep.GovernmentId.Config)");
    }
}
