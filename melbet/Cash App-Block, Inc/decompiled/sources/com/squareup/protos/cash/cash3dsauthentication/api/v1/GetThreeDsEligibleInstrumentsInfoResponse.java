package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/GetThreeDsEligibleInstrumentsInfoResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Trust$Builder;", "Builder", "InstrumentInfo", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetThreeDsEligibleInstrumentsInfoResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetThreeDsEligibleInstrumentsInfoResponse> CREATOR;
    public final List instrument_info_list;
    public final String ip_address;
    public final String message_version;
    public final ResponseContext response_context;

    public final class InstrumentInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstrumentInfo> CREATOR;
        public final String directory_server_id;
        public final String instrument_link_token;

        static {
            GetThreeDsEligibleInstrumentsInfoResponse$InstrumentInfo$Companion$ADAPTER$1 getThreeDsEligibleInstrumentsInfoResponse$InstrumentInfo$Companion$ADAPTER$1 = new GetThreeDsEligibleInstrumentsInfoResponse$InstrumentInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentInfo.class), "type.googleapis.com/squareup.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo", Syntax.PROTO_2, null, "squareup/cash/cash3dsauthentication/api/v1/three_ds_authenctication_get_three_ds_eligible_instruments_info.proto");
            ADAPTER = getThreeDsEligibleInstrumentsInfoResponse$InstrumentInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getThreeDsEligibleInstrumentsInfoResponse$InstrumentInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentInfo(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrument_link_token = str;
            this.directory_server_id = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstrumentInfo)) {
                return false;
            }
            InstrumentInfo instrumentInfo = (InstrumentInfo) obj;
            return Intrinsics.areEqual(unknownFields(), instrumentInfo.unknownFields()) && Intrinsics.areEqual(this.instrument_link_token, instrumentInfo.instrument_link_token) && Intrinsics.areEqual(this.directory_server_id, instrumentInfo.directory_server_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.instrument_link_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.directory_server_id;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Cashtag.Builder builder = new Cashtag.Builder(10);
            builder.prefix = this.instrument_link_token;
            builder.name = this.directory_server_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.instrument_link_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_link_token=", arrayList);
            }
            String str2 = this.directory_server_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "directory_server_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        GetThreeDsEligibleInstrumentsInfoResponse$Companion$ADAPTER$1 getThreeDsEligibleInstrumentsInfoResponse$Companion$ADAPTER$1 = new GetThreeDsEligibleInstrumentsInfoResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetThreeDsEligibleInstrumentsInfoResponse.class), "type.googleapis.com/squareup.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse", Syntax.PROTO_2, null, "squareup/cash/cash3dsauthentication/api/v1/three_ds_authenctication_get_three_ds_eligible_instruments_info.proto");
        ADAPTER = getThreeDsEligibleInstrumentsInfoResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getThreeDsEligibleInstrumentsInfoResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetThreeDsEligibleInstrumentsInfoResponse(String str, String str2, List list, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.ip_address = str;
        this.message_version = str2;
        this.response_context = responseContext;
        this.instrument_info_list = TransactorKt.immutableCopyOf("instrument_info_list", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetThreeDsEligibleInstrumentsInfoResponse)) {
            return false;
        }
        GetThreeDsEligibleInstrumentsInfoResponse getThreeDsEligibleInstrumentsInfoResponse = (GetThreeDsEligibleInstrumentsInfoResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getThreeDsEligibleInstrumentsInfoResponse.unknownFields()) && Intrinsics.areEqual(this.ip_address, getThreeDsEligibleInstrumentsInfoResponse.ip_address) && Intrinsics.areEqual(this.message_version, getThreeDsEligibleInstrumentsInfoResponse.message_version) && Intrinsics.areEqual(this.instrument_info_list, getThreeDsEligibleInstrumentsInfoResponse.instrument_info_list) && Intrinsics.areEqual(this.response_context, getThreeDsEligibleInstrumentsInfoResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.ip_address;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_version;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.instrument_info_list);
        ResponseContext responseContext = this.response_context;
        int hashCode3 = m + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(1, false);
        builder.title = this.ip_address;
        builder.icon = this.message_version;
        builder.enabled = this.instrument_info_list;
        builder.id = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.ip_address;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "ip_address=", arrayList);
        }
        String str2 = this.message_version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_version=", arrayList);
        }
        List list = this.instrument_info_list;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_info_list=", arrayList, list);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetThreeDsEligibleInstrumentsInfoResponse{", "}", 0, null, null, 56);
    }
}
