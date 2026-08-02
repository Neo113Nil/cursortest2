package com.squareup.protos.cash.customersearch.api.privacy;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.portfolios.syncvalues.PortfolioState;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/customersearch/api/privacy/GetSearchPrivacySettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/LoanOption$Builder;", "Builder", "BooleanSetting", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSearchPrivacySettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSearchPrivacySettingsResponse> CREATOR;
    public final BooleanSetting search_by_email;
    public final BooleanSetting search_by_name;
    public final BooleanSetting search_by_phone;

    public final class BooleanSetting extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BooleanSetting> CREATOR;
        public final Boolean editable;
        public final Boolean setting_value;

        static {
            GetSearchPrivacySettingsResponse$BooleanSetting$Companion$ADAPTER$1 getSearchPrivacySettingsResponse$BooleanSetting$Companion$ADAPTER$1 = new GetSearchPrivacySettingsResponse$BooleanSetting$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BooleanSetting.class), "type.googleapis.com/squareup.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse.BooleanSetting", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/privacy/Privacy.proto");
            ADAPTER = getSearchPrivacySettingsResponse$BooleanSetting$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getSearchPrivacySettingsResponse$BooleanSetting$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanSetting(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.setting_value = bool;
            this.editable = bool2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanSetting)) {
                return false;
            }
            BooleanSetting booleanSetting = (BooleanSetting) obj;
            return Intrinsics.areEqual(unknownFields(), booleanSetting.unknownFields()) && Intrinsics.areEqual(this.setting_value, booleanSetting.setting_value) && Intrinsics.areEqual(this.editable, booleanSetting.editable);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.setting_value;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.editable;
            int hashCode3 = hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PortfolioState.Builder builder = new PortfolioState.Builder(2);
            builder.has_portfolio = this.setting_value;
            builder.has_holdings = this.editable;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.setting_value;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("setting_value=", bool, arrayList);
            }
            Boolean bool2 = this.editable;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("editable=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BooleanSetting{", "}", 0, null, null, 56);
        }
    }

    static {
        GetSearchPrivacySettingsResponse$Companion$ADAPTER$1 getSearchPrivacySettingsResponse$Companion$ADAPTER$1 = new GetSearchPrivacySettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSearchPrivacySettingsResponse.class), "type.googleapis.com/squareup.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/privacy/Privacy.proto");
        ADAPTER = getSearchPrivacySettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSearchPrivacySettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchPrivacySettingsResponse(BooleanSetting booleanSetting, BooleanSetting booleanSetting2, BooleanSetting booleanSetting3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_by_name = booleanSetting;
        this.search_by_email = booleanSetting2;
        this.search_by_phone = booleanSetting3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSearchPrivacySettingsResponse)) {
            return false;
        }
        GetSearchPrivacySettingsResponse getSearchPrivacySettingsResponse = (GetSearchPrivacySettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSearchPrivacySettingsResponse.unknownFields()) && Intrinsics.areEqual(this.search_by_name, getSearchPrivacySettingsResponse.search_by_name) && Intrinsics.areEqual(this.search_by_email, getSearchPrivacySettingsResponse.search_by_email) && Intrinsics.areEqual(this.search_by_phone, getSearchPrivacySettingsResponse.search_by_phone);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BooleanSetting booleanSetting = this.search_by_name;
        int hashCode2 = (hashCode + (booleanSetting != null ? booleanSetting.hashCode() : 0)) * 37;
        BooleanSetting booleanSetting2 = this.search_by_email;
        int hashCode3 = (hashCode2 + (booleanSetting2 != null ? booleanSetting2.hashCode() : 0)) * 37;
        BooleanSetting booleanSetting3 = this.search_by_phone;
        int hashCode4 = hashCode3 + (booleanSetting3 != null ? booleanSetting3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(6);
        builder.loan_type = this.search_by_name;
        builder.payment_schedule = this.search_by_email;
        builder.tila_data = this.search_by_phone;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BooleanSetting booleanSetting = this.search_by_name;
        if (booleanSetting != null) {
            arrayList.add("search_by_name=" + booleanSetting);
        }
        BooleanSetting booleanSetting2 = this.search_by_email;
        if (booleanSetting2 != null) {
            arrayList.add("search_by_email=" + booleanSetting2);
        }
        BooleanSetting booleanSetting3 = this.search_by_phone;
        if (booleanSetting3 != null) {
            arrayList.add("search_by_phone=" + booleanSetting3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSearchPrivacySettingsResponse{", "}", 0, null, null, 56);
    }
}
