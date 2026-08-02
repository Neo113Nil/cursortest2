package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/GetIssuedCardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/time/DateTime$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetIssuedCardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetIssuedCardResponse> CREATOR;
    public final Boolean evict_existing_issued_card;
    public final IssuedCard issued_card;
    public final String message;
    public final ScenarioPlan scenario_plan;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        CONCURRENT_MODIFICATION(2),
        FAILURE(3);

        public static final GetIssuedCardResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new GetIssuedCardResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return CONCURRENT_MODIFICATION;
            }
            if (i != 3) {
                return null;
            }
            return FAILURE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetIssuedCardResponse$Companion$ADAPTER$1 getIssuedCardResponse$Companion$ADAPTER$1 = new GetIssuedCardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetIssuedCardResponse.class), "type.googleapis.com/squareup.franklin.app.GetIssuedCardResponse", Syntax.PROTO_2, null, "squareup/franklin/app/issued_card.proto");
        ADAPTER = getIssuedCardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getIssuedCardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIssuedCardResponse(Status status, IssuedCard issuedCard, String str, ScenarioPlan scenarioPlan, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.issued_card = issuedCard;
        this.message = str;
        this.scenario_plan = scenarioPlan;
        this.evict_existing_issued_card = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetIssuedCardResponse)) {
            return false;
        }
        GetIssuedCardResponse getIssuedCardResponse = (GetIssuedCardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getIssuedCardResponse.unknownFields()) && this.status == getIssuedCardResponse.status && Intrinsics.areEqual(this.issued_card, getIssuedCardResponse.issued_card) && Intrinsics.areEqual(this.message, getIssuedCardResponse.message) && Intrinsics.areEqual(this.scenario_plan, getIssuedCardResponse.scenario_plan) && Intrinsics.areEqual(this.evict_existing_issued_card, getIssuedCardResponse.evict_existing_issued_card);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        IssuedCard issuedCard = this.issued_card;
        int hashCode3 = (hashCode2 + (issuedCard != null ? issuedCard.hashCode() : 0)) * 37;
        String str = this.message;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        ScenarioPlan scenarioPlan = this.scenario_plan;
        int hashCode5 = (hashCode4 + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        Boolean bool = this.evict_existing_issued_card;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(29, false);
        builder.instant_usec = this.status;
        builder.ordinal = this.issued_card;
        builder.posix_tz = this.message;
        builder.timezone_offset_min = this.scenario_plan;
        builder.tz_name = this.evict_existing_issued_card;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        IssuedCard issuedCard = this.issued_card;
        if (issuedCard != null) {
            arrayList.add("issued_card=" + issuedCard);
        }
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        ScenarioPlan scenarioPlan = this.scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("scenario_plan=" + scenarioPlan);
        }
        Boolean bool = this.evict_existing_issued_card;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("evict_existing_issued_card=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetIssuedCardResponse{", "}", 0, null, null, 56);
    }
}
