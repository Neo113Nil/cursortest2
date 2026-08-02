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
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010$\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "captureMethodAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "nullableBooleanAdapter", "", "localizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "stringAdapter", "", "booleanAdapter", "nullableListOfCaptureFileTypeAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "nullableListOfVideoCaptureMethodAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "assetConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "nullableStringAdapter", "nullableListOfSelfiePoseAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "nullablePendingPageTextPositionAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "nullableListOfPoseConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "nullableIntAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_ConfigJsonAdapter extends JsonAdapter {
    private final JsonAdapter assetConfigAdapter;
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter captureMethodAdapter;
    private volatile Constructor<NextStep.Selfie.Config> constructorRef;
    private final JsonAdapter localizationsAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableListOfCaptureFileTypeAdapter;
    private final JsonAdapter nullableListOfPoseConfigAdapter;
    private final JsonAdapter nullableListOfSelfiePoseAdapter;
    private final JsonAdapter nullableListOfVideoCaptureMethodAdapter;
    private final JsonAdapter nullablePendingPageTextPositionAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_Selfie_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("selfieType", "backStepEnabled", "cancelButtonEnabled", "localizations", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "enabledCaptureFileTypes", "videoCaptureMethods", "assets", "videoSessionJWT", "orderedPoses", "pendingPageTextVerticalPosition", "audioEnabled", "poseConfigs", "designVersion", "imageUploadUrl", "flowWatermarkText", "silentNetworkAuthenticationCheckUrl", "silentNetworkAuthenticationBackgroundTimeoutSeconds");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.captureMethodAdapter = moshi.adapter(NextStep.Selfie.CaptureMethod.class, emptySet, "selfieType");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "backStepEnabled");
        this.localizationsAdapter = moshi.adapter(NextStep.Selfie.Localizations.class, emptySet, "localizations");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "fieldKeySelfie");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "requireStrictSelfieCapture");
        this.nullableListOfCaptureFileTypeAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.Selfie.CaptureFileType.class), emptySet, "enabledCaptureFileTypes");
        this.nullableListOfVideoCaptureMethodAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.Selfie.VideoCaptureMethod.class), emptySet, "videoCaptureMethods");
        this.assetConfigAdapter = moshi.adapter(NextStep.Selfie.AssetConfig.class, emptySet, "assets");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "videoSessionJwt");
        this.nullableListOfSelfiePoseAdapter = moshi.adapter(Types.newParameterizedType(List.class, NextStep.Selfie.SelfiePose.class), emptySet, "orderedPoses");
        this.nullablePendingPageTextPositionAdapter = moshi.adapter(PendingPageTextPosition.class, emptySet, "pendingPageTextVerticalPosition");
        this.nullableListOfPoseConfigAdapter = moshi.adapter(Types.newParameterizedType(List.class, PoseConfig.class), emptySet, "poseConfigs");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "silentNetworkAuthenticationBackgroundTimeoutSeconds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.Config fromJson(JsonReader reader) {
        NextStep.Selfie.Localizations localizations;
        int i;
        reader.getClass();
        reader.beginObject();
        int i2 = -1;
        NextStep.Selfie.CaptureMethod captureMethod = null;
        Boolean bool = null;
        Boolean bool2 = null;
        NextStep.Selfie.Localizations localizations2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        List list = null;
        List list2 = null;
        NextStep.Selfie.AssetConfig assetConfig = null;
        String str2 = null;
        List list3 = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        Boolean bool5 = null;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        while (true) {
            NextStep.Selfie.CaptureMethod captureMethod2 = captureMethod;
            Boolean bool6 = bool;
            Boolean bool7 = bool2;
            if (!reader.hasNext()) {
                NextStep.Selfie.Localizations localizations3 = localizations2;
                reader.endObject();
                if (i2 == -917505) {
                    if (captureMethod2 == null) {
                        throw Util.missingProperty("selfieType", "selfieType", reader);
                    }
                    if (localizations3 == null) {
                        throw Util.missingProperty("localizations", "localizations", reader);
                    }
                    if (str == null) {
                        throw Util.missingProperty("fieldKeySelfie", "fieldKeySelfie", reader);
                    }
                    if (bool3 == null) {
                        throw Util.missingProperty("requireStrictSelfieCapture", "requireStrictSelfieCapture", reader);
                    }
                    List list5 = list2;
                    List list6 = list;
                    Boolean bool8 = bool4;
                    boolean booleanValue = bool3.booleanValue();
                    if (assetConfig != null) {
                        return new NextStep.Selfie.Config(captureMethod2, bool6, bool7, localizations3, str, booleanValue, bool8, list6, list5, assetConfig, str2, list3, pendingPageTextPosition, bool5, list4, str3, str4, str5, str6, num);
                    }
                    throw Util.missingProperty("assets", "assets", reader);
                }
                int i3 = i2;
                NextStep.Selfie.AssetConfig assetConfig2 = assetConfig;
                List list7 = list2;
                List list8 = list;
                Boolean bool9 = bool4;
                String str7 = str;
                Constructor<NextStep.Selfie.Config> constructor = this.constructorRef;
                if (constructor == null) {
                    localizations = localizations3;
                    constructor = NextStep.Selfie.Config.class.getDeclaredConstructor(NextStep.Selfie.CaptureMethod.class, Boolean.class, Boolean.class, NextStep.Selfie.Localizations.class, String.class, Boolean.TYPE, Boolean.class, List.class, List.class, NextStep.Selfie.AssetConfig.class, String.class, List.class, PendingPageTextPosition.class, Boolean.class, List.class, String.class, String.class, String.class, String.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                    constructor.getClass();
                } else {
                    localizations = localizations3;
                }
                Constructor<NextStep.Selfie.Config> constructor2 = constructor;
                if (captureMethod2 == null) {
                    throw Util.missingProperty("selfieType", "selfieType", reader);
                }
                if (localizations == null) {
                    throw Util.missingProperty("localizations", "localizations", reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("fieldKeySelfie", "fieldKeySelfie", reader);
                }
                if (bool3 == null) {
                    throw Util.missingProperty("requireStrictSelfieCapture", "requireStrictSelfieCapture", reader);
                }
                if (assetConfig2 == null) {
                    throw Util.missingProperty("assets", "assets", reader);
                }
                NextStep.Selfie.Config newInstance = constructor2.newInstance(captureMethod2, bool6, bool7, localizations, str7, bool3, bool9, list8, list7, assetConfig2, str2, list3, pendingPageTextPosition, bool5, list4, str3, str4, str5, str6, num, Integer.valueOf(i3), null);
                newInstance.getClass();
                return newInstance;
            }
            NextStep.Selfie.Localizations localizations4 = localizations2;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 0:
                    captureMethod = (NextStep.Selfie.CaptureMethod) this.captureMethodAdapter.fromJson(reader);
                    if (captureMethod == null) {
                        throw Util.unexpectedNull("selfieType", "selfieType", reader);
                    }
                    localizations2 = localizations4;
                    bool = bool6;
                    bool2 = bool7;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool2 = bool7;
                case 2:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                case 3:
                    localizations2 = (NextStep.Selfie.Localizations) this.localizationsAdapter.fromJson(reader);
                    if (localizations2 == null) {
                        throw Util.unexpectedNull("localizations", "localizations", reader);
                    }
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 4:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("fieldKeySelfie", "fieldKeySelfie", reader);
                    }
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 5:
                    bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("requireStrictSelfieCapture", "requireStrictSelfieCapture", reader);
                    }
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 6:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 7:
                    list = (List) this.nullableListOfCaptureFileTypeAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 8:
                    list2 = (List) this.nullableListOfVideoCaptureMethodAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 9:
                    assetConfig = (NextStep.Selfie.AssetConfig) this.assetConfigAdapter.fromJson(reader);
                    if (assetConfig == null) {
                        throw Util.unexpectedNull("assets", "assets", reader);
                    }
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 10:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 11:
                    list3 = (List) this.nullableListOfSelfiePoseAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 12:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 13:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 14:
                    list4 = (List) this.nullableListOfPoseConfigAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 15:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 16:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 17:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    i = -131073;
                    i2 &= i;
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 18:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    i = -262145;
                    i2 &= i;
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                case 19:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i = -524289;
                    i2 &= i;
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
                default:
                    localizations2 = localizations4;
                    captureMethod = captureMethod2;
                    bool = bool6;
                    bool2 = bool7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.Config value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("selfieType");
        this.captureMethodAdapter.toJson(writer, value_.getSelfieType());
        writer.name("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.name("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.name("localizations");
        this.localizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.name("fieldKeySelfie");
        this.stringAdapter.toJson(writer, value_.getFieldKeySelfie());
        writer.name("requireStrictSelfieCapture");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getRequireStrictSelfieCapture()));
        writer.name("skipPromptPage");
        this.nullableBooleanAdapter.toJson(writer, value_.getSkipPromptPage());
        writer.name("enabledCaptureFileTypes");
        this.nullableListOfCaptureFileTypeAdapter.toJson(writer, value_.getEnabledCaptureFileTypes());
        writer.name("videoCaptureMethods");
        this.nullableListOfVideoCaptureMethodAdapter.toJson(writer, value_.getVideoCaptureMethods());
        writer.name("assets");
        this.assetConfigAdapter.toJson(writer, value_.getAssets());
        writer.name("videoSessionJWT");
        this.nullableStringAdapter.toJson(writer, value_.getVideoSessionJwt());
        writer.name("orderedPoses");
        this.nullableListOfSelfiePoseAdapter.toJson(writer, value_.getOrderedPoses());
        writer.name("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(writer, value_.getPendingPageTextVerticalPosition());
        writer.name("audioEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getAudioEnabled());
        writer.name("poseConfigs");
        this.nullableListOfPoseConfigAdapter.toJson(writer, value_.getPoseConfigs());
        writer.name("designVersion");
        this.nullableStringAdapter.toJson(writer, value_.getDesignVersion());
        writer.name("imageUploadUrl");
        this.nullableStringAdapter.toJson(writer, value_.getImageUploadUrl());
        writer.name("flowWatermarkText");
        this.nullableStringAdapter.toJson(writer, value_.getFlowWatermarkText());
        writer.name("silentNetworkAuthenticationCheckUrl");
        this.nullableStringAdapter.toJson(writer, value_.getSilentNetworkAuthenticationCheckUrl());
        writer.name("silentNetworkAuthenticationBackgroundTimeoutSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getSilentNetworkAuthenticationBackgroundTimeoutSeconds());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(44, "GeneratedJsonAdapter(NextStep.Selfie.Config)");
    }
}
