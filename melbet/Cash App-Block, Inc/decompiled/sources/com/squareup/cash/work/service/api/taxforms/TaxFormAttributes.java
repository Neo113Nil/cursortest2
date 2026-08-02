package com.squareup.cash.work.service.api.taxforms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJd\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0010R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001b\u0010\u0010R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/squareup/cash/work/service/api/taxforms/TaxFormAttributes;", "", "", "periodStart", "periodEnd", "periodDisplay", "filename", "description", "formName", "downloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/work/service/api/taxforms/TaxFormAttributes;", "Ljava/lang/String;", "getPeriodStart", "()Ljava/lang/String;", "getPeriodStart$annotations", "()V", "getPeriodEnd", "getPeriodEnd$annotations", "getPeriodDisplay", "getPeriodDisplay$annotations", "getFilename", "getFilename$annotations", "getDescription", "getDescription$annotations", "getFormName", "getFormName$annotations", "getDownloadUrl", "getDownloadUrl$annotations", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxFormAttributes {
    public final String description;
    public final String downloadUrl;
    public final String filename;
    public final String formName;
    public final String periodDisplay;
    public final String periodEnd;
    public final String periodStart;

    public TaxFormAttributes(@Json(name = "period_start") String str, @Json(name = "period_end") String str2, @Json(name = "period_display") String str3, @Json(name = "filename") String str4, @Json(name = "description") String str5, @Json(name = "form_name") String str6, @Json(name = "download_url") String str7) {
        this.periodStart = str;
        this.periodEnd = str2;
        this.periodDisplay = str3;
        this.filename = str4;
        this.description = str5;
        this.formName = str6;
        this.downloadUrl = str7;
    }

    @Json(name = "description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @Json(name = "download_url")
    public static /* synthetic */ void getDownloadUrl$annotations() {
    }

    @Json(name = "filename")
    public static /* synthetic */ void getFilename$annotations() {
    }

    @Json(name = "form_name")
    public static /* synthetic */ void getFormName$annotations() {
    }

    @Json(name = "period_display")
    public static /* synthetic */ void getPeriodDisplay$annotations() {
    }

    @Json(name = "period_end")
    public static /* synthetic */ void getPeriodEnd$annotations() {
    }

    @Json(name = "period_start")
    public static /* synthetic */ void getPeriodStart$annotations() {
    }

    public final TaxFormAttributes copy(@Json(name = "period_start") String periodStart, @Json(name = "period_end") String periodEnd, @Json(name = "period_display") String periodDisplay, @Json(name = "filename") String filename, @Json(name = "description") String description, @Json(name = "form_name") String formName, @Json(name = "download_url") String downloadUrl) {
        return new TaxFormAttributes(periodStart, periodEnd, periodDisplay, filename, description, formName, downloadUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxFormAttributes)) {
            return false;
        }
        TaxFormAttributes taxFormAttributes = (TaxFormAttributes) obj;
        return Intrinsics.areEqual(this.periodStart, taxFormAttributes.periodStart) && Intrinsics.areEqual(this.periodEnd, taxFormAttributes.periodEnd) && Intrinsics.areEqual(this.periodDisplay, taxFormAttributes.periodDisplay) && Intrinsics.areEqual(this.filename, taxFormAttributes.filename) && Intrinsics.areEqual(this.description, taxFormAttributes.description) && Intrinsics.areEqual(this.formName, taxFormAttributes.formName) && Intrinsics.areEqual(this.downloadUrl, taxFormAttributes.downloadUrl);
    }

    public final int hashCode() {
        String str = this.periodStart;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.periodEnd;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.periodDisplay;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filename;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.formName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.downloadUrl;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TaxFormAttributes(periodStart=", this.periodStart, ", periodEnd=", this.periodEnd, ", periodDisplay=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.periodDisplay, ", filename=", this.filename, ", description=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.description, ", formName=", this.formName, ", downloadUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.downloadUrl, ")");
    }
}
