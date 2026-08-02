package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.data.Expiration;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.app.ClaimData;
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
import okio.AsyncTimeout;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/app/VerifyPasscodeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/Document$Builder;", "Builder", "ProtectedData", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerifyPasscodeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyPasscodeResponse> CREATOR;
    public final String full_name;
    public final Instrument instrument;
    public final String passcode_token;
    public final ProtectedData protected_data;
    public final ResponseContext response_context;
    public final Status status;

    public final class ProtectedData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ProtectedData> CREATOR;

        /* renamed from: type, reason: collision with root package name */
        public final VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo f1367type;

        public final class CashCardInfo extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CashCardInfo> CREATOR;
            public final String card_token;
            public final String customer_token;
            public final String cvv;
            public final Expiration expiration;
            public final String name_on_card;
            public final String pan;

            static {
                VerifyPasscodeResponse$ProtectedData$CashCardInfo$Companion$ADAPTER$1 verifyPasscodeResponse$ProtectedData$CashCardInfo$Companion$ADAPTER$1 = new VerifyPasscodeResponse$ProtectedData$CashCardInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashCardInfo.class), "type.googleapis.com/squareup.franklin.app.VerifyPasscodeResponse.ProtectedData.CashCardInfo", Syntax.PROTO_2, null, "squareup/franklin/app/passcode.proto");
                ADAPTER = verifyPasscodeResponse$ProtectedData$CashCardInfo$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyPasscodeResponse$ProtectedData$CashCardInfo$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashCardInfo(String str, String str2, String str3, String str4, Expiration expiration, String str5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.card_token = str;
                this.customer_token = str2;
                this.cvv = str3;
                this.pan = str4;
                this.expiration = expiration;
                this.name_on_card = str5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CashCardInfo)) {
                    return false;
                }
                CashCardInfo cashCardInfo = (CashCardInfo) obj;
                return Intrinsics.areEqual(unknownFields(), cashCardInfo.unknownFields()) && Intrinsics.areEqual(this.card_token, cashCardInfo.card_token) && Intrinsics.areEqual(this.customer_token, cashCardInfo.customer_token) && Intrinsics.areEqual(this.cvv, cashCardInfo.cvv) && Intrinsics.areEqual(this.pan, cashCardInfo.pan) && Intrinsics.areEqual(this.expiration, cashCardInfo.expiration) && Intrinsics.areEqual(this.name_on_card, cashCardInfo.name_on_card);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.card_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.customer_token;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.cvv;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.pan;
                int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                Expiration expiration = this.expiration;
                int hashCode6 = (hashCode5 + (expiration != null ? expiration.hashCode() : 0)) * 37;
                String str5 = this.name_on_card;
                int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Document.Builder builder = new Document.Builder(19, false);
                builder.category = this.card_token;
                builder.token = this.customer_token;
                builder.title = this.cvv;
                builder.url = this.pan;
                builder.document_date = this.expiration;
                builder.owner_token = this.name_on_card;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.card_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_token=", arrayList);
                }
                String str2 = this.customer_token;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
                }
                if (this.cvv != null) {
                    arrayList.add("cvv=██");
                }
                if (this.pan != null) {
                    arrayList.add("pan=██");
                }
                if (this.expiration != null) {
                    arrayList.add("expiration=██");
                }
                if (this.name_on_card != null) {
                    arrayList.add("name_on_card=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CashCardInfo{", "}", 0, null, null, 56);
            }
        }

        static {
            VerifyPasscodeResponse$ProtectedData$Companion$ADAPTER$1 verifyPasscodeResponse$ProtectedData$Companion$ADAPTER$1 = new VerifyPasscodeResponse$ProtectedData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProtectedData.class), "type.googleapis.com/squareup.franklin.app.VerifyPasscodeResponse.ProtectedData", Syntax.PROTO_2, null, "squareup/franklin/app/passcode.proto");
            ADAPTER = verifyPasscodeResponse$ProtectedData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyPasscodeResponse$ProtectedData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtectedData(VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1367type = verifyPasscodeResponse$ProtectedData$Type$CashCardInfo;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProtectedData)) {
                return false;
            }
            ProtectedData protectedData = (ProtectedData) obj;
            return Intrinsics.areEqual(unknownFields(), protectedData.unknownFields()) && Intrinsics.areEqual(this.f1367type, protectedData.f1367type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            VerifyPasscodeResponse$ProtectedData$Type$CashCardInfo verifyPasscodeResponse$ProtectedData$Type$CashCardInfo = this.f1367type;
            int hashCode2 = hashCode + (verifyPasscodeResponse$ProtectedData$Type$CashCardInfo != null ? verifyPasscodeResponse$ProtectedData$Type$CashCardInfo.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(22);
            builder.claimable_payment = this.f1367type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.f1367type != null) {
                arrayList.add("type=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProtectedData{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes.dex */
    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        INVALID_PASSCODE(3),
        TOO_MANY_ATTEMPTS(4),
        CARD_BLOCKED(5),
        FAILURE(6);

        public static final VerifyPasscodeResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final AsyncTimeout.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new AsyncTimeout.Companion();
            ADAPTER = new VerifyPasscodeResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return AsyncTimeout.Companion.m4328fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        VerifyPasscodeResponse$Companion$ADAPTER$1 verifyPasscodeResponse$Companion$ADAPTER$1 = new VerifyPasscodeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifyPasscodeResponse.class), "type.googleapis.com/squareup.franklin.app.VerifyPasscodeResponse", Syntax.PROTO_2, null, "squareup/franklin/app/passcode.proto");
        ADAPTER = verifyPasscodeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyPasscodeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasscodeResponse(ResponseContext responseContext, Status status, String str, String str2, Instrument instrument, ProtectedData protectedData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.full_name = str;
        this.passcode_token = str2;
        this.instrument = instrument;
        this.protected_data = protectedData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyPasscodeResponse)) {
            return false;
        }
        VerifyPasscodeResponse verifyPasscodeResponse = (VerifyPasscodeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), verifyPasscodeResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, verifyPasscodeResponse.response_context) && this.status == verifyPasscodeResponse.status && Intrinsics.areEqual(this.full_name, verifyPasscodeResponse.full_name) && Intrinsics.areEqual(this.passcode_token, verifyPasscodeResponse.passcode_token) && Intrinsics.areEqual(this.instrument, verifyPasscodeResponse.instrument) && Intrinsics.areEqual(this.protected_data, verifyPasscodeResponse.protected_data);
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
        String str = this.full_name;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Instrument instrument = this.instrument;
        int hashCode6 = (hashCode5 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        ProtectedData protectedData = this.protected_data;
        int hashCode7 = hashCode6 + (protectedData != null ? protectedData.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(18, false);
        builder.title = this.response_context;
        builder.url = this.status;
        builder.category = this.full_name;
        builder.token = this.passcode_token;
        builder.owner_token = this.instrument;
        builder.document_date = this.protected_data;
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
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        Instrument instrument = this.instrument;
        if (instrument != null) {
            arrayList.add("instrument=" + instrument);
        }
        ProtectedData protectedData = this.protected_data;
        if (protectedData != null) {
            arrayList.add("protected_data=" + protectedData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyPasscodeResponse{", "}", 0, null, null, 56);
    }
}
