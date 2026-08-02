package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface InquiryWorkflow$Props extends Parcelable {

    public final class InquiryProps implements InquiryWorkflow$Props {
        public static final Parcelable.Creator<InquiryProps> CREATOR = new MrzKey.Creator(14);
        public final Environment environment;
        public final String environmentId;
        public final String inquiryId;
        public final boolean isCancelled;
        public final String sessionToken;
        public final String shareToken;
        public final Integer theme;

        public InquiryProps(String str, String str2, String str3, Environment environment, Integer num, boolean z, String str4) {
            str.getClass();
            environment.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.environmentId = str3;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z;
            this.shareToken = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InquiryProps)) {
                return false;
            }
            InquiryProps inquiryProps = (InquiryProps) obj;
            return Intrinsics.areEqual(this.inquiryId, inquiryProps.inquiryId) && Intrinsics.areEqual(this.sessionToken, inquiryProps.sessionToken) && Intrinsics.areEqual(this.environmentId, inquiryProps.environmentId) && this.environment == inquiryProps.environment && Intrinsics.areEqual(this.theme, inquiryProps.theme) && this.isCancelled == inquiryProps.isCancelled && Intrinsics.areEqual(this.shareToken, inquiryProps.shareToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final Environment getEnvironment() {
            return this.environment;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final String getShareToken() {
            return this.shareToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final Integer getTheme() {
            return this.theme;
        }

        public final int hashCode() {
            int hashCode = this.inquiryId.hashCode() * 31;
            String str = this.sessionToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.environmentId;
            int hashCode3 = (this.environment.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Integer num = this.theme;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isCancelled);
            String str3 = this.shareToken;
            return m + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InquiryProps(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", environmentId=");
            m.append(this.environmentId);
            m.append(", environment=");
            m.append(this.environment);
            m.append(", theme=");
            m.append(this.theme);
            m.append(", isCancelled=");
            m.append(this.isCancelled);
            m.append(", shareToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.shareToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.environmentId);
            parcel.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeInt(this.isCancelled ? 1 : 0);
            parcel.writeString(this.shareToken);
        }
    }

    public final class OneTimeCodeProps implements InquiryWorkflow$Props {
        public static final Parcelable.Creator<OneTimeCodeProps> CREATOR = new MrzKey.Creator(15);
        public final Environment environment;
        public final boolean isCancelled;
        public final String oneTimeLinkCode;
        public final String shareToken;
        public final Integer theme;

        public OneTimeCodeProps(String str, Environment environment, Integer num, boolean z, String str2) {
            str.getClass();
            environment.getClass();
            this.oneTimeLinkCode = str;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z;
            this.shareToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OneTimeCodeProps)) {
                return false;
            }
            OneTimeCodeProps oneTimeCodeProps = (OneTimeCodeProps) obj;
            return Intrinsics.areEqual(this.oneTimeLinkCode, oneTimeCodeProps.oneTimeLinkCode) && this.environment == oneTimeCodeProps.environment && Intrinsics.areEqual(this.theme, oneTimeCodeProps.theme) && this.isCancelled == oneTimeCodeProps.isCancelled && Intrinsics.areEqual(this.shareToken, oneTimeCodeProps.shareToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final Environment getEnvironment() {
            return this.environment;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final String getShareToken() {
            return this.shareToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final Integer getTheme() {
            return this.theme;
        }

        public final int hashCode() {
            int hashCode = (this.environment.hashCode() + (this.oneTimeLinkCode.hashCode() * 31)) * 31;
            Integer num = this.theme;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isCancelled);
            String str = this.shareToken;
            return m + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OneTimeCodeProps(oneTimeLinkCode=");
            sb.append(this.oneTimeLinkCode);
            sb.append(", environment=");
            sb.append(this.environment);
            sb.append(", theme=");
            sb.append(this.theme);
            sb.append(", isCancelled=");
            sb.append(this.isCancelled);
            sb.append(", shareToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shareToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.oneTimeLinkCode);
            parcel.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeInt(this.isCancelled ? 1 : 0);
            parcel.writeString(this.shareToken);
        }
    }

    public final class TemplateProps implements InquiryWorkflow$Props {
        public static final Parcelable.Creator<TemplateProps> CREATOR = new MrzKey.Creator(16);
        public final String accountId;
        public final Environment environment;
        public final String environmentId;
        public final Map fields;
        public final boolean isCancelled;
        public final String redirectUri;
        public final String referenceId;
        public final String shareToken;
        public final StaticInquiryTemplate staticInquiryTemplate;
        public final String templateId;
        public final String templateVersion;
        public final Integer theme;
        public final String themeSetId;

        public TemplateProps(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, Environment environment, Integer num, boolean z, String str7, String str8) {
            environment.getClass();
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.referenceId = str4;
            this.environmentId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
            this.environment = environment;
            this.theme = num;
            this.isCancelled = z;
            this.redirectUri = str7;
            this.shareToken = str8;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemplateProps)) {
                return false;
            }
            TemplateProps templateProps = (TemplateProps) obj;
            return Intrinsics.areEqual(this.templateId, templateProps.templateId) && Intrinsics.areEqual(this.templateVersion, templateProps.templateVersion) && Intrinsics.areEqual(this.accountId, templateProps.accountId) && Intrinsics.areEqual(this.referenceId, templateProps.referenceId) && Intrinsics.areEqual(this.environmentId, templateProps.environmentId) && Intrinsics.areEqual(this.fields, templateProps.fields) && Intrinsics.areEqual(this.themeSetId, templateProps.themeSetId) && Intrinsics.areEqual(this.staticInquiryTemplate, templateProps.staticInquiryTemplate) && this.environment == templateProps.environment && Intrinsics.areEqual(this.theme, templateProps.theme) && this.isCancelled == templateProps.isCancelled && Intrinsics.areEqual(this.redirectUri, templateProps.redirectUri) && Intrinsics.areEqual(this.shareToken, templateProps.shareToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final Environment getEnvironment() {
            return this.environment;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final String getShareToken() {
            return this.shareToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props
        public final Integer getTheme() {
            return this.theme;
        }

        public final int hashCode() {
            String str = this.templateId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.referenceId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.environmentId;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map map = this.fields;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            int hashCode8 = (this.environment.hashCode() + ((hashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31)) * 31;
            Integer num = this.theme;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isCancelled);
            String str7 = this.redirectUri;
            int hashCode9 = (m + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.shareToken;
            return hashCode9 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TemplateProps(templateId=", this.templateId, ", templateVersion=", this.templateVersion, ", accountId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.accountId, ", referenceId=", this.referenceId, ", environmentId=");
            m.append(this.environmentId);
            m.append(", fields=");
            m.append(this.fields);
            m.append(", themeSetId=");
            m.append(this.themeSetId);
            m.append(", staticInquiryTemplate=");
            m.append(this.staticInquiryTemplate);
            m.append(", environment=");
            m.append(this.environment);
            m.append(", theme=");
            m.append(this.theme);
            m.append(", isCancelled=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.isCancelled, ", redirectUri=", this.redirectUri, ", shareToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.shareToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.templateId);
            parcel.writeString(this.templateVersion);
            parcel.writeString(this.accountId);
            parcel.writeString(this.referenceId);
            parcel.writeString(this.environmentId);
            Map map = this.fields;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), i);
                }
            }
            parcel.writeString(this.themeSetId);
            parcel.writeParcelable(this.staticInquiryTemplate, i);
            parcel.writeString(this.environment.name());
            Integer num = this.theme;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeInt(this.isCancelled ? 1 : 0);
            parcel.writeString(this.redirectUri);
            parcel.writeString(this.shareToken);
        }
    }

    Environment getEnvironment();

    String getShareToken();

    Integer getTheme();
}
