package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.KeyScope;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/common/UnlinkInstrumentResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/giftly/GiftCard$Options$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnlinkInstrumentResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnlinkInstrumentResponse> CREATOR;
    public final ResponseContext response_context;
    public final Status status;
    public final String verification_instrument_token;

    public enum Status implements WireEnum {
        SUCCESS(0),
        INELIGIBLE(1);

        public static final UnlinkInstrumentResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final KeyScope.Companion Companion;
        public final int value;

        static {
            Status status = SUCCESS;
            Companion = new KeyScope.Companion();
            ADAPTER = new UnlinkInstrumentResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SUCCESS;
            }
            if (i != 1) {
                return null;
            }
            return INELIGIBLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        UnlinkInstrumentResponse$Companion$ADAPTER$1 unlinkInstrumentResponse$Companion$ADAPTER$1 = new UnlinkInstrumentResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnlinkInstrumentResponse.class), "type.googleapis.com/squareup.franklin.common.UnlinkInstrumentResponse", Syntax.PROTO_2, null, "squareup/franklin/UnlinkInstrumentResponseProto.proto");
        ADAPTER = unlinkInstrumentResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(unlinkInstrumentResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlinkInstrumentResponse(ResponseContext responseContext, String str, Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.verification_instrument_token = str;
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnlinkInstrumentResponse)) {
            return false;
        }
        UnlinkInstrumentResponse unlinkInstrumentResponse = (UnlinkInstrumentResponse) obj;
        return Intrinsics.areEqual(unknownFields(), unlinkInstrumentResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, unlinkInstrumentResponse.response_context) && Intrinsics.areEqual(this.verification_instrument_token, unlinkInstrumentResponse.verification_instrument_token) && this.status == unlinkInstrumentResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.verification_instrument_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode4 = hashCode3 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(2);
        builder.localizable_label = this.response_context;
        builder.label = this.verification_instrument_token;
        builder.client_scenario = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str = this.verification_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "verification_instrument_token=", arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnlinkInstrumentResponse{", "}", 0, null, null, 56);
    }
}
