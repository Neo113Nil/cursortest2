package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.employeejobs.Job;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BusinessIds extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessIds> CREATOR;
    public final String au_abn;
    public final String au_acn;
    public final String es_nif;
    public final String eu_vat_number;
    public final String fr_naf;
    public final String fr_rcs;
    public final String fr_rcs_place;
    public final String fr_siret;
    public final String gb_vat_number;
    public final String ie_vat_number;
    public final String jp_qii_number;

    static {
        BusinessIds$Companion$ADAPTER$1 businessIds$Companion$ADAPTER$1 = new BusinessIds$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessIds.class), "type.googleapis.com/squareup.roster.mds.BusinessIds", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = businessIds$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessIds$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessIds(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.ie_vat_number = str;
        this.eu_vat_number = str2;
        this.fr_siret = str3;
        this.fr_naf = str4;
        this.fr_rcs = str5;
        this.fr_rcs_place = str6;
        this.gb_vat_number = str7;
        this.es_nif = str8;
        this.jp_qii_number = str9;
        this.au_abn = str10;
        this.au_acn = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessIds)) {
            return false;
        }
        BusinessIds businessIds = (BusinessIds) obj;
        return Intrinsics.areEqual(unknownFields(), businessIds.unknownFields()) && Intrinsics.areEqual(this.ie_vat_number, businessIds.ie_vat_number) && Intrinsics.areEqual(this.eu_vat_number, businessIds.eu_vat_number) && Intrinsics.areEqual(this.fr_siret, businessIds.fr_siret) && Intrinsics.areEqual(this.fr_naf, businessIds.fr_naf) && Intrinsics.areEqual(this.fr_rcs, businessIds.fr_rcs) && Intrinsics.areEqual(this.fr_rcs_place, businessIds.fr_rcs_place) && Intrinsics.areEqual(this.gb_vat_number, businessIds.gb_vat_number) && Intrinsics.areEqual(this.es_nif, businessIds.es_nif) && Intrinsics.areEqual(this.jp_qii_number, businessIds.jp_qii_number) && Intrinsics.areEqual(this.au_abn, businessIds.au_abn) && Intrinsics.areEqual(this.au_acn, businessIds.au_acn);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.ie_vat_number;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.eu_vat_number;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.fr_siret;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.fr_naf;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.fr_rcs;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.fr_rcs_place;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.gb_vat_number;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.es_nif;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.jp_qii_number;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.au_abn;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.au_acn;
        int hashCode12 = hashCode11 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(22);
        builder.token = this.ie_vat_number;
        builder.merchant_token = this.eu_vat_number;
        builder.title = this.fr_siret;
        builder.default_wage = this.fr_naf;
        builder.created_at_timestamp_ms = this.fr_rcs;
        builder.updated_at_timestamp_ms = this.fr_rcs_place;
        builder.deleted_at_timestamp_ms = this.gb_vat_number;
        builder.team_member_count = this.es_nif;
        builder.version = this.jp_qii_number;
        builder.tip_eligible = this.au_abn;
        builder.default_color_scheme = this.au_acn;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.ie_vat_number;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "ie_vat_number=", arrayList);
        }
        String str2 = this.eu_vat_number;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "eu_vat_number=", arrayList);
        }
        String str3 = this.fr_siret;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "fr_siret=", arrayList);
        }
        String str4 = this.fr_naf;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "fr_naf=", arrayList);
        }
        String str5 = this.fr_rcs;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "fr_rcs=", arrayList);
        }
        String str6 = this.fr_rcs_place;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "fr_rcs_place=", arrayList);
        }
        String str7 = this.gb_vat_number;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "gb_vat_number=", arrayList);
        }
        String str8 = this.es_nif;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "es_nif=", arrayList);
        }
        String str9 = this.jp_qii_number;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "jp_qii_number=", arrayList);
        }
        String str10 = this.au_abn;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "au_abn=", arrayList);
        }
        String str11 = this.au_acn;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "au_acn=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessIds{", "}", 0, null, null, 56);
    }
}
