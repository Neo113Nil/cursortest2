package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;

@Keep
/* loaded from: classes.dex */
public final class KeyResult implements Parcelable {
    public static final Parcelable.Creator<KeyResult> CREATOR = new a();
    private final AccountTokenResult accountAiResult;
    private final AccountTokenResult accountResult;
    private final String aiClientId;
    private final String aiClientSecret;
    private final String ak;
    private final String appKey;
    private final String appid;
    private final String channel;
    private final String clientId;
    private final String clientSecret;
    private final String deviceId;
    private final String deviceUnique;
    private final Integer functionType;
    private final String mac;
    private final String overSeaAk;
    private final int oversea;
    private final OverseasConfigModel overseasConfig;
    private final String secretKey;
    private final String supportLangure;
    private final String ttsAppId;
    private final String ttsAppKey;
    private final String ttsAppSecret;
    private final List<LanguageResult> ttsConfig;
    private final List<LargeModel> typeList;
    private final Long wsExpriceTime;
    private final String xfAsrAPIKey;
    private final String xfAsrAPISecret;
    private final String xfAsrAppId;
    private final String xfAsrStdAPIKey;
    private final String xfAsrStdAppId;
    private final String xfTtsAPIKey;
    private final String xfTtsAPISecret;
    private final String xfTtsAppId;
    private final String xfVoiceName;
    private final Map<String, String> xfVoiceNameList;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final KeyResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap;
            s.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            int readInt = parcel.readInt();
            String readString13 = parcel.readString();
            Parcelable.Creator<AccountTokenResult> creator = AccountTokenResult.CREATOR;
            AccountTokenResult createFromParcel = creator.createFromParcel(parcel);
            AccountTokenResult createFromParcel2 = creator.createFromParcel(parcel);
            String readString14 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i8 = 0;
            while (i8 != readInt2) {
                arrayList4.add(LanguageResult.CREATOR.createFromParcel(parcel));
                i8++;
                readInt2 = readInt2;
            }
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            OverseasConfigModel createFromParcel3 = OverseasConfigModel.CREATOR.createFromParcel(parcel);
            String readString17 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str = readString15;
                arrayList = arrayList4;
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = arrayList4;
                ArrayList arrayList5 = new ArrayList(readInt3);
                str = readString15;
                int i9 = 0;
                while (i9 != readInt3) {
                    arrayList5.add(LargeModel.CREATOR.createFromParcel(parcel));
                    i9++;
                    readInt3 = readInt3;
                }
                arrayList2 = arrayList5;
            }
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                int i10 = 0;
                while (i10 != readInt4) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i10++;
                    readInt4 = readInt4;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                linkedHashMap = linkedHashMap2;
            }
            return new KeyResult(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readInt, readString13, createFromParcel, createFromParcel2, readString14, arrayList, str, readString16, createFromParcel3, readString17, valueOf, arrayList3, readString18, readString19, readString20, readString21, readString22, readString23, readString24, linkedHashMap, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final KeyResult[] newArray(int i8) {
            return new KeyResult[i8];
        }
    }

    public KeyResult() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component10() {
        return this.deviceUnique;
    }

    public final String component11() {
        return this.aiClientId;
    }

    public final String component12() {
        return this.aiClientSecret;
    }

    public final int component13() {
        return this.oversea;
    }

    public final String component14() {
        return this.overSeaAk;
    }

    public final AccountTokenResult component15() {
        return this.accountResult;
    }

    public final AccountTokenResult component16() {
        return this.accountAiResult;
    }

    public final String component17() {
        return this.supportLangure;
    }

    public final List<LanguageResult> component18() {
        return this.ttsConfig;
    }

    public final String component19() {
        return this.mac;
    }

    public final String component2() {
        return this.appKey;
    }

    public final String component20() {
        return this.channel;
    }

    public final OverseasConfigModel component21() {
        return this.overseasConfig;
    }

    public final String component22() {
        return this.ak;
    }

    public final Integer component23() {
        return this.functionType;
    }

    public final List<LargeModel> component24() {
        return this.typeList;
    }

    public final String component25() {
        return this.xfAsrAppId;
    }

    public final String component26() {
        return this.xfAsrAPISecret;
    }

    public final String component27() {
        return this.xfAsrAPIKey;
    }

    public final String component28() {
        return this.xfTtsAppId;
    }

    public final String component29() {
        return this.xfTtsAPISecret;
    }

    public final String component3() {
        return this.secretKey;
    }

    public final String component30() {
        return this.xfTtsAPIKey;
    }

    public final String component31() {
        return this.xfVoiceName;
    }

    public final Map<String, String> component32() {
        return this.xfVoiceNameList;
    }

    public final Long component33() {
        return this.wsExpriceTime;
    }

    public final String component34() {
        return this.xfAsrStdAppId;
    }

    public final String component35() {
        return this.xfAsrStdAPIKey;
    }

    public final String component4() {
        return this.appid;
    }

    public final String component5() {
        return this.clientId;
    }

    public final String component6() {
        return this.clientSecret;
    }

    public final String component7() {
        return this.ttsAppId;
    }

    public final String component8() {
        return this.ttsAppKey;
    }

    public final String component9() {
        return this.ttsAppSecret;
    }

    public final KeyResult copy(String deviceId, String appKey, String secretKey, String appid, String clientId, String clientSecret, String ttsAppId, String ttsAppKey, String ttsAppSecret, String deviceUnique, String aiClientId, String aiClientSecret, int i8, String overSeaAk, AccountTokenResult accountResult, AccountTokenResult accountAiResult, String supportLangure, List<LanguageResult> ttsConfig, String mac, String channel, OverseasConfigModel overseasConfig, String ak, Integer num, List<LargeModel> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, Long l8, String str8, String str9) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(appKey, "appKey");
        s.checkNotNullParameter(secretKey, "secretKey");
        s.checkNotNullParameter(appid, "appid");
        s.checkNotNullParameter(clientId, "clientId");
        s.checkNotNullParameter(clientSecret, "clientSecret");
        s.checkNotNullParameter(ttsAppId, "ttsAppId");
        s.checkNotNullParameter(ttsAppKey, "ttsAppKey");
        s.checkNotNullParameter(ttsAppSecret, "ttsAppSecret");
        s.checkNotNullParameter(deviceUnique, "deviceUnique");
        s.checkNotNullParameter(aiClientId, "aiClientId");
        s.checkNotNullParameter(aiClientSecret, "aiClientSecret");
        s.checkNotNullParameter(overSeaAk, "overSeaAk");
        s.checkNotNullParameter(accountResult, "accountResult");
        s.checkNotNullParameter(accountAiResult, "accountAiResult");
        s.checkNotNullParameter(supportLangure, "supportLangure");
        s.checkNotNullParameter(ttsConfig, "ttsConfig");
        s.checkNotNullParameter(mac, "mac");
        s.checkNotNullParameter(channel, "channel");
        s.checkNotNullParameter(overseasConfig, "overseasConfig");
        s.checkNotNullParameter(ak, "ak");
        return new KeyResult(deviceId, appKey, secretKey, appid, clientId, clientSecret, ttsAppId, ttsAppKey, ttsAppSecret, deviceUnique, aiClientId, aiClientSecret, i8, overSeaAk, accountResult, accountAiResult, supportLangure, ttsConfig, mac, channel, overseasConfig, ak, num, list, str, str2, str3, str4, str5, str6, str7, map, l8, str8, str9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyResult)) {
            return false;
        }
        KeyResult keyResult = (KeyResult) obj;
        return s.areEqual(this.deviceId, keyResult.deviceId) && s.areEqual(this.appKey, keyResult.appKey) && s.areEqual(this.secretKey, keyResult.secretKey) && s.areEqual(this.appid, keyResult.appid) && s.areEqual(this.clientId, keyResult.clientId) && s.areEqual(this.clientSecret, keyResult.clientSecret) && s.areEqual(this.ttsAppId, keyResult.ttsAppId) && s.areEqual(this.ttsAppKey, keyResult.ttsAppKey) && s.areEqual(this.ttsAppSecret, keyResult.ttsAppSecret) && s.areEqual(this.deviceUnique, keyResult.deviceUnique) && s.areEqual(this.aiClientId, keyResult.aiClientId) && s.areEqual(this.aiClientSecret, keyResult.aiClientSecret) && this.oversea == keyResult.oversea && s.areEqual(this.overSeaAk, keyResult.overSeaAk) && s.areEqual(this.accountResult, keyResult.accountResult) && s.areEqual(this.accountAiResult, keyResult.accountAiResult) && s.areEqual(this.supportLangure, keyResult.supportLangure) && s.areEqual(this.ttsConfig, keyResult.ttsConfig) && s.areEqual(this.mac, keyResult.mac) && s.areEqual(this.channel, keyResult.channel) && s.areEqual(this.overseasConfig, keyResult.overseasConfig) && s.areEqual(this.ak, keyResult.ak) && s.areEqual(this.functionType, keyResult.functionType) && s.areEqual(this.typeList, keyResult.typeList) && s.areEqual(this.xfAsrAppId, keyResult.xfAsrAppId) && s.areEqual(this.xfAsrAPISecret, keyResult.xfAsrAPISecret) && s.areEqual(this.xfAsrAPIKey, keyResult.xfAsrAPIKey) && s.areEqual(this.xfTtsAppId, keyResult.xfTtsAppId) && s.areEqual(this.xfTtsAPISecret, keyResult.xfTtsAPISecret) && s.areEqual(this.xfTtsAPIKey, keyResult.xfTtsAPIKey) && s.areEqual(this.xfVoiceName, keyResult.xfVoiceName) && s.areEqual(this.xfVoiceNameList, keyResult.xfVoiceNameList) && s.areEqual(this.wsExpriceTime, keyResult.wsExpriceTime) && s.areEqual(this.xfAsrStdAppId, keyResult.xfAsrStdAppId) && s.areEqual(this.xfAsrStdAPIKey, keyResult.xfAsrStdAPIKey);
    }

    public final AccountTokenResult getAccountAiResult() {
        return this.accountAiResult;
    }

    public final AccountTokenResult getAccountResult() {
        return this.accountResult;
    }

    public final String getAiClientId() {
        return this.aiClientId;
    }

    public final String getAiClientSecret() {
        return this.aiClientSecret;
    }

    public final String getAk() {
        return this.ak;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAppid() {
        return this.appid;
    }

    public final OverseasConfigModel getAzureConfig() {
        return new OverseasConfigModel(this.overSeaAk, this.deviceId);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceUnique() {
        return this.deviceUnique;
    }

    public final Integer getFunctionType() {
        return this.functionType;
    }

    public final List<String> getLanguage() {
        List<String> split$default;
        split$default = StringsKt__StringsKt.split$default((CharSequence) this.supportLangure, new String[]{SystemInfoUtil.COMMA}, false, 0, 6, (Object) null);
        return split$default;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getOverSeaAk() {
        return this.overSeaAk;
    }

    public final int getOversea() {
        return this.oversea;
    }

    public final OverseasConfigModel getOverseasConfig() {
        return this.overseasConfig;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSupportLangure() {
        return this.supportLangure;
    }

    public final String getTtsAppId() {
        return this.ttsAppId;
    }

    public final String getTtsAppKey() {
        return this.ttsAppKey;
    }

    public final String getTtsAppSecret() {
        return this.ttsAppSecret;
    }

    public final List<LanguageResult> getTtsConfig() {
        return this.ttsConfig;
    }

    public final List<LargeModel> getTypeList() {
        return this.typeList;
    }

    public final Long getWsExpriceTime() {
        return this.wsExpriceTime;
    }

    public final String getXfAsrAPIKey() {
        return this.xfAsrAPIKey;
    }

    public final String getXfAsrAPISecret() {
        return this.xfAsrAPISecret;
    }

    public final String getXfAsrAppId() {
        return this.xfAsrAppId;
    }

    public final String getXfAsrStdAPIKey() {
        return this.xfAsrStdAPIKey;
    }

    public final String getXfAsrStdAppId() {
        return this.xfAsrStdAppId;
    }

    public final String getXfTtsAPIKey() {
        return this.xfTtsAPIKey;
    }

    public final String getXfTtsAPISecret() {
        return this.xfTtsAPISecret;
    }

    public final String getXfTtsAppId() {
        return this.xfTtsAppId;
    }

    public final String getXfVoiceName() {
        return this.xfVoiceName;
    }

    public final Map<String, String> getXfVoiceNameList() {
        return this.xfVoiceNameList;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((this.deviceId.hashCode() * 31) + this.appKey.hashCode()) * 31) + this.secretKey.hashCode()) * 31) + this.appid.hashCode()) * 31) + this.clientId.hashCode()) * 31) + this.clientSecret.hashCode()) * 31) + this.ttsAppId.hashCode()) * 31) + this.ttsAppKey.hashCode()) * 31) + this.ttsAppSecret.hashCode()) * 31) + this.deviceUnique.hashCode()) * 31) + this.aiClientId.hashCode()) * 31) + this.aiClientSecret.hashCode()) * 31) + this.oversea) * 31) + this.overSeaAk.hashCode()) * 31) + this.accountResult.hashCode()) * 31) + this.accountAiResult.hashCode()) * 31) + this.supportLangure.hashCode()) * 31) + this.ttsConfig.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.overseasConfig.hashCode()) * 31) + this.ak.hashCode()) * 31;
        Integer num = this.functionType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<LargeModel> list = this.typeList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.xfAsrAppId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.xfAsrAPISecret;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xfAsrAPIKey;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.xfTtsAppId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.xfTtsAPISecret;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.xfTtsAPIKey;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.xfVoiceName;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.xfVoiceNameList;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Long l8 = this.wsExpriceTime;
        int hashCode12 = (hashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str8 = this.xfAsrStdAppId;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.xfAsrStdAPIKey;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isOversea() {
        return this.oversea == 1;
    }

    public final boolean isSt() {
        Integer num = this.functionType;
        return num != null && num.intValue() == 2;
    }

    public String toString() {
        return "KeyResult(deviceId=" + this.deviceId + ", appKey=" + this.appKey + ", secretKey=" + this.secretKey + ", appid=" + this.appid + ", clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", ttsAppId=" + this.ttsAppId + ", ttsAppKey=" + this.ttsAppKey + ", ttsAppSecret=" + this.ttsAppSecret + ", deviceUnique=" + this.deviceUnique + ", aiClientId=" + this.aiClientId + ", aiClientSecret=" + this.aiClientSecret + ", oversea=" + this.oversea + ", overSeaAk=" + this.overSeaAk + ", accountResult=" + this.accountResult + ", accountAiResult=" + this.accountAiResult + ", supportLangure=" + this.supportLangure + ", ttsConfig=" + this.ttsConfig + ", mac=" + this.mac + ", channel=" + this.channel + ", overseasConfig=" + this.overseasConfig + ", ak=" + this.ak + ", functionType=" + this.functionType + ", typeList=" + this.typeList + ", xfAsrAppId=" + this.xfAsrAppId + ", xfAsrAPISecret=" + this.xfAsrAPISecret + ", xfAsrAPIKey=" + this.xfAsrAPIKey + ", xfTtsAppId=" + this.xfTtsAppId + ", xfTtsAPISecret=" + this.xfTtsAPISecret + ", xfTtsAPIKey=" + this.xfTtsAPIKey + ", xfVoiceName=" + this.xfVoiceName + ", xfVoiceNameList=" + this.xfVoiceNameList + ", wsExpriceTime=" + this.wsExpriceTime + ", xfAsrStdAppId=" + this.xfAsrStdAppId + ", xfAsrStdAPIKey=" + this.xfAsrStdAPIKey + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.deviceId);
        out.writeString(this.appKey);
        out.writeString(this.secretKey);
        out.writeString(this.appid);
        out.writeString(this.clientId);
        out.writeString(this.clientSecret);
        out.writeString(this.ttsAppId);
        out.writeString(this.ttsAppKey);
        out.writeString(this.ttsAppSecret);
        out.writeString(this.deviceUnique);
        out.writeString(this.aiClientId);
        out.writeString(this.aiClientSecret);
        out.writeInt(this.oversea);
        out.writeString(this.overSeaAk);
        this.accountResult.writeToParcel(out, i8);
        this.accountAiResult.writeToParcel(out, i8);
        out.writeString(this.supportLangure);
        List<LanguageResult> list = this.ttsConfig;
        out.writeInt(list.size());
        Iterator<LanguageResult> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i8);
        }
        out.writeString(this.mac);
        out.writeString(this.channel);
        this.overseasConfig.writeToParcel(out, i8);
        out.writeString(this.ak);
        Integer num = this.functionType;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        List<LargeModel> list2 = this.typeList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            Iterator<LargeModel> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(out, i8);
            }
        }
        out.writeString(this.xfAsrAppId);
        out.writeString(this.xfAsrAPISecret);
        out.writeString(this.xfAsrAPIKey);
        out.writeString(this.xfTtsAppId);
        out.writeString(this.xfTtsAPISecret);
        out.writeString(this.xfTtsAPIKey);
        out.writeString(this.xfVoiceName);
        Map<String, String> map = this.xfVoiceNameList;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Long l8 = this.wsExpriceTime;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.xfAsrStdAppId);
        out.writeString(this.xfAsrStdAPIKey);
    }

    public KeyResult(String deviceId, String appKey, String secretKey, String appid, String clientId, String clientSecret, String ttsAppId, String ttsAppKey, String ttsAppSecret, String deviceUnique, String aiClientId, String aiClientSecret, int i8, String overSeaAk, AccountTokenResult accountResult, AccountTokenResult accountAiResult, String supportLangure, List<LanguageResult> ttsConfig, String mac, String channel, OverseasConfigModel overseasConfig, String ak, Integer num, List<LargeModel> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, Long l8, String str8, String str9) {
        s.checkNotNullParameter(deviceId, "deviceId");
        s.checkNotNullParameter(appKey, "appKey");
        s.checkNotNullParameter(secretKey, "secretKey");
        s.checkNotNullParameter(appid, "appid");
        s.checkNotNullParameter(clientId, "clientId");
        s.checkNotNullParameter(clientSecret, "clientSecret");
        s.checkNotNullParameter(ttsAppId, "ttsAppId");
        s.checkNotNullParameter(ttsAppKey, "ttsAppKey");
        s.checkNotNullParameter(ttsAppSecret, "ttsAppSecret");
        s.checkNotNullParameter(deviceUnique, "deviceUnique");
        s.checkNotNullParameter(aiClientId, "aiClientId");
        s.checkNotNullParameter(aiClientSecret, "aiClientSecret");
        s.checkNotNullParameter(overSeaAk, "overSeaAk");
        s.checkNotNullParameter(accountResult, "accountResult");
        s.checkNotNullParameter(accountAiResult, "accountAiResult");
        s.checkNotNullParameter(supportLangure, "supportLangure");
        s.checkNotNullParameter(ttsConfig, "ttsConfig");
        s.checkNotNullParameter(mac, "mac");
        s.checkNotNullParameter(channel, "channel");
        s.checkNotNullParameter(overseasConfig, "overseasConfig");
        s.checkNotNullParameter(ak, "ak");
        this.deviceId = deviceId;
        this.appKey = appKey;
        this.secretKey = secretKey;
        this.appid = appid;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.ttsAppId = ttsAppId;
        this.ttsAppKey = ttsAppKey;
        this.ttsAppSecret = ttsAppSecret;
        this.deviceUnique = deviceUnique;
        this.aiClientId = aiClientId;
        this.aiClientSecret = aiClientSecret;
        this.oversea = i8;
        this.overSeaAk = overSeaAk;
        this.accountResult = accountResult;
        this.accountAiResult = accountAiResult;
        this.supportLangure = supportLangure;
        this.ttsConfig = ttsConfig;
        this.mac = mac;
        this.channel = channel;
        this.overseasConfig = overseasConfig;
        this.ak = ak;
        this.functionType = num;
        this.typeList = list;
        this.xfAsrAppId = str;
        this.xfAsrAPISecret = str2;
        this.xfAsrAPIKey = str3;
        this.xfTtsAppId = str4;
        this.xfTtsAPISecret = str5;
        this.xfTtsAPIKey = str6;
        this.xfVoiceName = str7;
        this.xfVoiceNameList = map;
        this.wsExpriceTime = l8;
        this.xfAsrStdAppId = str8;
        this.xfAsrStdAPIKey = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ KeyResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, String str13, AccountTokenResult accountTokenResult, AccountTokenResult accountTokenResult2, String str14, List list, String str15, String str16, OverseasConfigModel overseasConfigModel, String str17, Integer num, List list2, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Map map, Long l8, String str25, String str26, int i9, int i10, o oVar) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r23, r21, r22, r16, r17, r18, r19, r20, r15, (2097152 & i9) != 0 ? "" : str17, (i9 & 4194304) != 0 ? null : num, (i9 & 8388608) != 0 ? null : list2, (i9 & 16777216) != 0 ? null : str18, (i9 & 33554432) != 0 ? null : str19, (i9 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str20, (i9 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str21, (i9 & 268435456) != 0 ? null : str22, (i9 & 536870912) != 0 ? null : str23, (i9 & 1073741824) != 0 ? null : str24, (i9 & Integer.MIN_VALUE) != 0 ? null : map, (i10 & 1) != 0 ? null : l8, (i10 & 2) != 0 ? null : str25, (i10 & 4) == 0 ? str26 : null);
        int i11;
        String str27;
        OverseasConfigModel overseasConfigModel2;
        String str28 = (i9 & 1) != 0 ? "" : str;
        String str29 = (i9 & 2) != 0 ? "" : str2;
        String str30 = (i9 & 4) != 0 ? "" : str3;
        String str31 = (i9 & 8) != 0 ? "" : str4;
        String str32 = (i9 & 16) != 0 ? "" : str5;
        String str33 = (i9 & 32) != 0 ? "" : str6;
        String str34 = (i9 & 64) != 0 ? "" : str7;
        String str35 = (i9 & 128) != 0 ? "" : str8;
        String str36 = (i9 & 256) != 0 ? "" : str9;
        String str37 = (i9 & 512) != 0 ? "" : str10;
        String str38 = (i9 & 1024) != 0 ? "" : str11;
        String str39 = (i9 & 2048) != 0 ? "" : str12;
        int i12 = (i9 & 4096) != 0 ? 0 : i8;
        String str40 = (i9 & 8192) != 0 ? "" : str13;
        AccountTokenResult accountTokenResult3 = (i9 & 16384) != 0 ? new AccountTokenResult(null, 0, null, null, null, null, 0L, 127, null) : accountTokenResult;
        AccountTokenResult accountTokenResult4 = (i9 & 32768) != 0 ? new AccountTokenResult(null, 0, null, null, null, null, 0L, 127, null) : accountTokenResult2;
        String str41 = (i9 & 65536) != 0 ? "zh_cn,en_us" : str14;
        List emptyList = (i9 & 131072) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        String str42 = (i9 & 262144) != 0 ? "" : str15;
        String str43 = (i9 & 524288) != 0 ? "" : str16;
        AccountTokenResult accountTokenResult5 = accountTokenResult3;
        if ((i9 & 1048576) != 0) {
            str27 = str40;
            i11 = i12;
            overseasConfigModel2 = new OverseasConfigModel(null, null, 3, null);
        } else {
            i11 = i12;
            str27 = str40;
            overseasConfigModel2 = overseasConfigModel;
        }
    }
}
