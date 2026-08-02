package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.FieldName;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.person.Alias;
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
import okio.AsyncTimeout;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/LinkCardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/person/Alias$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LinkCardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkCardResponse> CREATOR;
    public final FieldName failure_field;
    public final Instrument instrument;
    public final String passcode_token;
    public final ResponseContext response_context;
    public final Status status;
    public final String unencrypted_pan_ocr_result;
    public final String verification_instrument_token;

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        FAILURE(3),
        INSTRUMENT_TYPE_MISMATCH(4);

        public static final LinkCardResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final AsyncTimeout.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new AsyncTimeout.Companion();
            ADAPTER = new LinkCardResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
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
            if (i == 3) {
                return FAILURE;
            }
            if (i != 4) {
                return null;
            }
            return INSTRUMENT_TYPE_MISMATCH;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LinkCardResponse$Companion$ADAPTER$1 linkCardResponse$Companion$ADAPTER$1 = new LinkCardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkCardResponse.class), "type.googleapis.com/squareup.franklin.app.LinkCardResponse", Syntax.PROTO_2, null, "squareup/franklin/app/card.proto");
        ADAPTER = linkCardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkCardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkCardResponse(ResponseContext responseContext, Status status, FieldName fieldName, String str, String str2, Instrument instrument, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.failure_field = fieldName;
        this.passcode_token = str;
        this.unencrypted_pan_ocr_result = str2;
        this.instrument = instrument;
        this.verification_instrument_token = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkCardResponse)) {
            return false;
        }
        LinkCardResponse linkCardResponse = (LinkCardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), linkCardResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, linkCardResponse.response_context) && this.status == linkCardResponse.status && this.failure_field == linkCardResponse.failure_field && Intrinsics.areEqual(this.passcode_token, linkCardResponse.passcode_token) && Intrinsics.areEqual(this.unencrypted_pan_ocr_result, linkCardResponse.unencrypted_pan_ocr_result) && Intrinsics.areEqual(this.instrument, linkCardResponse.instrument) && Intrinsics.areEqual(this.verification_instrument_token, linkCardResponse.verification_instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        FieldName fieldName = this.failure_field;
        int hashCode4 = (hashCode3 + (fieldName != null ? fieldName.hashCode() : 0)) * 37;
        String str = this.passcode_token;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.unencrypted_pan_ocr_result;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Instrument instrument = this.instrument;
        int hashCode7 = (hashCode6 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        String str3 = this.verification_instrument_token;
        int hashCode8 = hashCode7 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(2, false);
        builder.f1407type = this.response_context;
        builder.first_verified_at_ms = this.status;
        builder.last_verified_at_ms = this.failure_field;
        builder.scope = this.passcode_token;
        builder.value = this.unencrypted_pan_ocr_result;
        builder.created_at = this.instrument;
        builder.updated_at = this.verification_instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        FieldName fieldName = this.failure_field;
        if (fieldName != null) {
            arrayList.add("failure_field=" + fieldName);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        if (this.unencrypted_pan_ocr_result != null) {
            arrayList.add("unencrypted_pan_ocr_result=██");
        }
        Instrument instrument = this.instrument;
        if (instrument != null) {
            arrayList.add("instrument=" + instrument);
        }
        String str = this.verification_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "verification_instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkCardResponse{", "}", 0, null, null, 56);
    }
}
