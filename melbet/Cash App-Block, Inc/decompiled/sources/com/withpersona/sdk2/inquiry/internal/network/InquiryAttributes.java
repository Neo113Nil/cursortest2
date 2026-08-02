package com.withpersona.sdk2.inquiry.internal.network;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.internal.Environment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InquiryAttributes {
    public final String accountId;
    public final Environment environment;
    public final String environmentId;
    public final Map fields;
    public final String inquiryId;
    public final String referenceId;
    public final String sessionToken;
    public final String templateId;
    public final String templateVersion;
    public final String themeSetId;

    public InquiryAttributes(String str, String str2, String str3, String str4, Environment environment, String str5, String str6, String str7, Map map, String str8, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        str7 = (i & 128) != 0 ? null : str7;
        map = (i & 512) != 0 ? null : map;
        str8 = (i & 1024) != 0 ? null : str8;
        environment.getClass();
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.environment = environment;
        this.environmentId = str5;
        this.accountId = str6;
        this.referenceId = str7;
        this.fields = map;
        this.themeSetId = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InquiryAttributes)) {
            return false;
        }
        InquiryAttributes inquiryAttributes = (InquiryAttributes) obj;
        return Intrinsics.areEqual(this.templateId, inquiryAttributes.templateId) && Intrinsics.areEqual(this.templateVersion, inquiryAttributes.templateVersion) && Intrinsics.areEqual(this.inquiryId, inquiryAttributes.inquiryId) && Intrinsics.areEqual(this.sessionToken, inquiryAttributes.sessionToken) && this.environment == inquiryAttributes.environment && Intrinsics.areEqual(this.environmentId, inquiryAttributes.environmentId) && Intrinsics.areEqual(this.accountId, inquiryAttributes.accountId) && Intrinsics.areEqual(this.referenceId, inquiryAttributes.referenceId) && Intrinsics.areEqual(this.fields, inquiryAttributes.fields) && Intrinsics.areEqual(this.themeSetId, inquiryAttributes.themeSetId);
    }

    public final int hashCode() {
        String str = this.templateId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inquiryId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionToken;
        int hashCode4 = (this.environment.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.environmentId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.accountId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceId;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 961;
        Map map = this.fields;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str8 = this.themeSetId;
        return (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InquiryAttributes(templateId=", this.templateId, ", templateVersion=", this.templateVersion, ", inquiryId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.inquiryId, ", sessionToken=", this.sessionToken, ", environment=");
        m.append(this.environment);
        m.append(", environmentId=");
        m.append(this.environmentId);
        m.append(", accountId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.accountId, ", referenceId=", this.referenceId, ", note=null, fields=");
        m.append(this.fields);
        m.append(", themeSetId=");
        m.append(this.themeSetId);
        m.append(", redirectUri=null)");
        return m.toString();
    }
}
