package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/janus/api/RegisterProspectTokenResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$CardPii$Builder;", "Builder", "Status", "AliasType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegisterProspectTokenResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterProspectTokenResponse> CREATOR;
    public final AliasType alias_type;
    public final String redacted_alias;
    public final ResponseContext response_context;
    public final Status status;

    public enum AliasType implements WireEnum {
        PHONE_NUMBER(0),
        EMAIL_ADDRESS(1);

        public static final RegisterProspectTokenResponse$AliasType$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            AliasType aliasType = PHONE_NUMBER;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new RegisterProspectTokenResponse$AliasType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AliasType.class), Syntax.PROTO_2, aliasType);
        }

        AliasType(int i) {
            this.value = i;
        }

        public static final AliasType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PHONE_NUMBER;
            }
            if (i != 1) {
                return null;
            }
            return EMAIL_ADDRESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        TOO_MANY_REQUESTS(2),
        INVALID_ALIAS(3),
        DUPLICATE_ALIAS(4);

        public static final RegisterProspectTokenResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new RetailerType.Companion();
            ADAPTER = new RegisterProspectTokenResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return RetailerType.Companion.m3900fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RegisterProspectTokenResponse$Companion$ADAPTER$1 registerProspectTokenResponse$Companion$ADAPTER$1 = new RegisterProspectTokenResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RegisterProspectTokenResponse.class), "type.googleapis.com/squareup.cash.janus.api.RegisterProspectTokenResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/RegisterProspectTokenProto.proto");
        ADAPTER = registerProspectTokenResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(registerProspectTokenResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterProspectTokenResponse(ResponseContext responseContext, Status status, String str, AliasType aliasType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.redacted_alias = str;
        this.alias_type = aliasType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterProspectTokenResponse)) {
            return false;
        }
        RegisterProspectTokenResponse registerProspectTokenResponse = (RegisterProspectTokenResponse) obj;
        return Intrinsics.areEqual(unknownFields(), registerProspectTokenResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, registerProspectTokenResponse.response_context) && this.status == registerProspectTokenResponse.status && Intrinsics.areEqual(this.redacted_alias, registerProspectTokenResponse.redacted_alias) && this.alias_type == registerProspectTokenResponse.alias_type;
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
        String str = this.redacted_alias;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        AliasType aliasType = this.alias_type;
        int hashCode5 = hashCode4 + (aliasType != null ? aliasType.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(26, false);
        builder.last_four_digits = this.response_context;
        builder.expiration = this.status;
        builder.postal_code = this.redacted_alias;
        builder.ciphertext_ = this.alias_type;
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
        if (this.redacted_alias != null) {
            arrayList.add("redacted_alias=██");
        }
        AliasType aliasType = this.alias_type;
        if (aliasType != null) {
            arrayList.add("alias_type=" + aliasType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterProspectTokenResponse{", "}", 0, null, null, 56);
    }
}
