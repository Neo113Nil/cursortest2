package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/GetFamilyAccountSponsorResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/Member$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetFamilyAccountSponsorResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFamilyAccountSponsorResponse> CREATOR;
    public final Boolean is_sponsor_led;
    public final Sponsor sponsor;

    static {
        GetFamilyAccountSponsorResponse$Companion$ADAPTER$1 getFamilyAccountSponsorResponse$Companion$ADAPTER$1 = new GetFamilyAccountSponsorResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFamilyAccountSponsorResponse.class), "type.googleapis.com/squareup.cash.aegis.api.GetFamilyAccountSponsorResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/GetFamilyAccountSponsorResponse.proto");
        ADAPTER = getFamilyAccountSponsorResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFamilyAccountSponsorResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFamilyAccountSponsorResponse(Sponsor sponsor, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sponsor = sponsor;
        this.is_sponsor_led = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFamilyAccountSponsorResponse)) {
            return false;
        }
        GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFamilyAccountSponsorResponse.unknownFields()) && Intrinsics.areEqual(this.sponsor, getFamilyAccountSponsorResponse.sponsor) && Intrinsics.areEqual(this.is_sponsor_led, getFamilyAccountSponsorResponse.is_sponsor_led);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Sponsor sponsor = this.sponsor;
        int hashCode2 = (hashCode + (sponsor != null ? sponsor.hashCode() : 0)) * 37;
        Boolean bool = this.is_sponsor_led;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(29);
        builder.customer_token = this.sponsor;
        builder.sponsorship_tier = this.is_sponsor_led;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Sponsor sponsor = this.sponsor;
        if (sponsor != null) {
            arrayList.add("sponsor=" + sponsor);
        }
        Boolean bool = this.is_sponsor_led;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_sponsor_led=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFamilyAccountSponsorResponse{", "}", 0, null, null, 56);
    }
}
