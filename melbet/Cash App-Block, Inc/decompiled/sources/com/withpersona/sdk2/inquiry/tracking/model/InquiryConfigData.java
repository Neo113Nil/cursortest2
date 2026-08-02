package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ¶\u0001\u00105\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001e¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "", "templateId", "", "templateVersion", "environment", "environmentId", "uiFramework", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "themeSetId", "hasAccountId", "", "hasFields", "hasInquiryId", "hasOneTimeLinkCode", "hasRedirectUri", "hasReferenceId", "hasSessionToken", "hasTheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTemplateId", "()Ljava/lang/String;", "getTemplateVersion", "getEnvironment", "getEnvironmentId", "getUiFramework", "()Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "getThemeSetId", "getHasAccountId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasFields", "getHasInquiryId", "getHasOneTimeLinkCode", "getHasRedirectUri", "getHasReferenceId", "getHasSessionToken", "getHasTheme", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InquiryConfigData {
    private final String environment;
    private final String environmentId;
    private final Boolean hasAccountId;
    private final Boolean hasFields;
    private final Boolean hasInquiryId;
    private final Boolean hasOneTimeLinkCode;
    private final Boolean hasRedirectUri;
    private final Boolean hasReferenceId;
    private final Boolean hasSessionToken;
    private final Boolean hasTheme;
    private final String templateId;
    private final String templateVersion;
    private final String themeSetId;
    private final UiFramework uiFramework;

    public /* synthetic */ InquiryConfigData(String str, String str2, String str3, String str4, UiFramework uiFramework, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : uiFramework, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : bool5, (i & 2048) != 0 ? null : bool6, (i & 4096) != 0 ? null : bool7, (i & PKIFailureInfo.certRevoked) != 0 ? null : bool8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getHasOneTimeLinkCode() {
        return this.hasOneTimeLinkCode;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getHasRedirectUri() {
        return this.hasRedirectUri;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getHasReferenceId() {
        return this.hasReferenceId;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getHasSessionToken() {
        return this.hasSessionToken;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getHasTheme() {
        return this.hasTheme;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEnvironmentId() {
        return this.environmentId;
    }

    /* renamed from: component5, reason: from getter */
    public final UiFramework getUiFramework() {
        return this.uiFramework;
    }

    /* renamed from: component6, reason: from getter */
    public final String getThemeSetId() {
        return this.themeSetId;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getHasAccountId() {
        return this.hasAccountId;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHasFields() {
        return this.hasFields;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getHasInquiryId() {
        return this.hasInquiryId;
    }

    public final InquiryConfigData copy(@Json(name = "template_id") String templateId, @Json(name = "template_version") String templateVersion, String environment, @Json(name = "environment_id") String environmentId, @Json(name = "ui_framework") UiFramework uiFramework, @Json(name = "theme_set_id") String themeSetId, @Json(name = "has_account_id") Boolean hasAccountId, @Json(name = "has_fields") Boolean hasFields, @Json(name = "has_inquiry_id") Boolean hasInquiryId, @Json(name = "has_one_time_link_code") Boolean hasOneTimeLinkCode, @Json(name = "has_redirect_uri") Boolean hasRedirectUri, @Json(name = "has_reference_id") Boolean hasReferenceId, @Json(name = "has_session_token") Boolean hasSessionToken, @Json(name = "has_theme") Boolean hasTheme) {
        return new InquiryConfigData(templateId, templateVersion, environment, environmentId, uiFramework, themeSetId, hasAccountId, hasFields, hasInquiryId, hasOneTimeLinkCode, hasRedirectUri, hasReferenceId, hasSessionToken, hasTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquiryConfigData)) {
            return false;
        }
        InquiryConfigData inquiryConfigData = (InquiryConfigData) other;
        return Intrinsics.areEqual(this.templateId, inquiryConfigData.templateId) && Intrinsics.areEqual(this.templateVersion, inquiryConfigData.templateVersion) && Intrinsics.areEqual(this.environment, inquiryConfigData.environment) && Intrinsics.areEqual(this.environmentId, inquiryConfigData.environmentId) && this.uiFramework == inquiryConfigData.uiFramework && Intrinsics.areEqual(this.themeSetId, inquiryConfigData.themeSetId) && Intrinsics.areEqual(this.hasAccountId, inquiryConfigData.hasAccountId) && Intrinsics.areEqual(this.hasFields, inquiryConfigData.hasFields) && Intrinsics.areEqual(this.hasInquiryId, inquiryConfigData.hasInquiryId) && Intrinsics.areEqual(this.hasOneTimeLinkCode, inquiryConfigData.hasOneTimeLinkCode) && Intrinsics.areEqual(this.hasRedirectUri, inquiryConfigData.hasRedirectUri) && Intrinsics.areEqual(this.hasReferenceId, inquiryConfigData.hasReferenceId) && Intrinsics.areEqual(this.hasSessionToken, inquiryConfigData.hasSessionToken) && Intrinsics.areEqual(this.hasTheme, inquiryConfigData.hasTheme);
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getEnvironmentId() {
        return this.environmentId;
    }

    public final Boolean getHasAccountId() {
        return this.hasAccountId;
    }

    public final Boolean getHasFields() {
        return this.hasFields;
    }

    public final Boolean getHasInquiryId() {
        return this.hasInquiryId;
    }

    public final Boolean getHasOneTimeLinkCode() {
        return this.hasOneTimeLinkCode;
    }

    public final Boolean getHasRedirectUri() {
        return this.hasRedirectUri;
    }

    public final Boolean getHasReferenceId() {
        return this.hasReferenceId;
    }

    public final Boolean getHasSessionToken() {
        return this.hasSessionToken;
    }

    public final Boolean getHasTheme() {
        return this.hasTheme;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateVersion() {
        return this.templateVersion;
    }

    public final String getThemeSetId() {
        return this.themeSetId;
    }

    public final UiFramework getUiFramework() {
        return this.uiFramework;
    }

    public int hashCode() {
        String str = this.templateId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.environment;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.environmentId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UiFramework uiFramework = this.uiFramework;
        int hashCode5 = (hashCode4 + (uiFramework == null ? 0 : uiFramework.hashCode())) * 31;
        String str5 = this.themeSetId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.hasAccountId;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasFields;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasInquiryId;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasOneTimeLinkCode;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasRedirectUri;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasReferenceId;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasSessionToken;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hasTheme;
        return hashCode13 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public String toString() {
        String str = this.templateId;
        String str2 = this.templateVersion;
        String str3 = this.environment;
        String str4 = this.environmentId;
        UiFramework uiFramework = this.uiFramework;
        String str5 = this.themeSetId;
        Boolean bool = this.hasAccountId;
        Boolean bool2 = this.hasFields;
        Boolean bool3 = this.hasInquiryId;
        Boolean bool4 = this.hasOneTimeLinkCode;
        Boolean bool5 = this.hasRedirectUri;
        Boolean bool6 = this.hasReferenceId;
        Boolean bool7 = this.hasSessionToken;
        Boolean bool8 = this.hasTheme;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InquiryConfigData(templateId=", str, ", templateVersion=", str2, ", environment=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", environmentId=", str4, ", uiFramework=");
        m.append(uiFramework);
        m.append(", themeSetId=");
        m.append(str5);
        m.append(", hasAccountId=");
        Thread$State$EnumUnboxingLocalUtility.m(m, bool, ", hasFields=", bool2, ", hasInquiryId=");
        Thread$State$EnumUnboxingLocalUtility.m(m, bool3, ", hasOneTimeLinkCode=", bool4, ", hasRedirectUri=");
        Thread$State$EnumUnboxingLocalUtility.m(m, bool5, ", hasReferenceId=", bool6, ", hasSessionToken=");
        m.append(bool7);
        m.append(", hasTheme=");
        m.append(bool8);
        m.append(")");
        return m.toString();
    }

    public InquiryConfigData(@Json(name = "template_id") String str, @Json(name = "template_version") String str2, String str3, @Json(name = "environment_id") String str4, @Json(name = "ui_framework") UiFramework uiFramework, @Json(name = "theme_set_id") String str5, @Json(name = "has_account_id") Boolean bool, @Json(name = "has_fields") Boolean bool2, @Json(name = "has_inquiry_id") Boolean bool3, @Json(name = "has_one_time_link_code") Boolean bool4, @Json(name = "has_redirect_uri") Boolean bool5, @Json(name = "has_reference_id") Boolean bool6, @Json(name = "has_session_token") Boolean bool7, @Json(name = "has_theme") Boolean bool8) {
        this.templateId = str;
        this.templateVersion = str2;
        this.environment = str3;
        this.environmentId = str4;
        this.uiFramework = uiFramework;
        this.themeSetId = str5;
        this.hasAccountId = bool;
        this.hasFields = bool2;
        this.hasInquiryId = bool3;
        this.hasOneTimeLinkCode = bool4;
        this.hasRedirectUri = bool5;
        this.hasReferenceId = bool6;
        this.hasSessionToken = bool7;
        this.hasTheme = bool8;
    }

    public InquiryConfigData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
