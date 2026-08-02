package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetFullNameRequest;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ActivateDigitalWalletRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivateDigitalWalletRequest> CREATOR;
    public final List digital_wallet_cards;
    public final String issued_card_token;
    public final String pan_reference_id;
    public final RequestContext request_context;

    public final class DigitalWalletCardData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DigitalWalletCardData> CREATOR;
        public final String dpan_id;
        public final String dpan_last_four;
        public final String fpan_id;
        public final String fpan_last_four;
        public final String issued_card_token;

        static {
            ActivateDigitalWalletRequest$DigitalWalletCardData$Companion$ADAPTER$1 activateDigitalWalletRequest$DigitalWalletCardData$Companion$ADAPTER$1 = new ActivateDigitalWalletRequest$DigitalWalletCardData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DigitalWalletCardData.class), "type.googleapis.com/squareup.franklin.app.ActivateDigitalWalletRequest.DigitalWalletCardData", Syntax.PROTO_2, null, "squareup/franklin/app/digital_wallet_token.proto");
            ADAPTER = activateDigitalWalletRequest$DigitalWalletCardData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(activateDigitalWalletRequest$DigitalWalletCardData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DigitalWalletCardData(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.fpan_id = str;
            this.fpan_last_four = str2;
            this.dpan_id = str3;
            this.dpan_last_four = str4;
            this.issued_card_token = str5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DigitalWalletCardData)) {
                return false;
            }
            DigitalWalletCardData digitalWalletCardData = (DigitalWalletCardData) obj;
            return Intrinsics.areEqual(unknownFields(), digitalWalletCardData.unknownFields()) && Intrinsics.areEqual(this.fpan_id, digitalWalletCardData.fpan_id) && Intrinsics.areEqual(this.fpan_last_four, digitalWalletCardData.fpan_last_four) && Intrinsics.areEqual(this.dpan_id, digitalWalletCardData.dpan_id) && Intrinsics.areEqual(this.dpan_last_four, digitalWalletCardData.dpan_last_four) && Intrinsics.areEqual(this.issued_card_token, digitalWalletCardData.issued_card_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.fpan_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.fpan_last_four;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dpan_id;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.dpan_last_four;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.issued_card_token;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileRow.Builder builder = new ProfileRow.Builder(9);
            builder.client_route = this.fpan_id;
            builder.icon_id = this.fpan_last_four;
            builder.title = this.dpan_id;
            builder.subtitle = this.dpan_last_four;
            builder.call_to_action = this.issued_card_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.fpan_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fpan_id=", arrayList);
            }
            String str2 = this.fpan_last_four;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "fpan_last_four=", arrayList);
            }
            String str3 = this.dpan_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dpan_id=", arrayList);
            }
            String str4 = this.dpan_last_four;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dpan_last_four=", arrayList);
            }
            String str5 = this.issued_card_token;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "issued_card_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DigitalWalletCardData{", "}", 0, null, null, 56);
        }
    }

    static {
        ActivateDigitalWalletRequest$Companion$ADAPTER$1 activateDigitalWalletRequest$Companion$ADAPTER$1 = new ActivateDigitalWalletRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivateDigitalWalletRequest.class), "type.googleapis.com/squareup.franklin.app.ActivateDigitalWalletRequest", Syntax.PROTO_2, null, "squareup/franklin/app/digital_wallet_token.proto");
        ADAPTER = activateDigitalWalletRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activateDigitalWalletRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateDigitalWalletRequest(RequestContext requestContext, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.issued_card_token = str;
        this.pan_reference_id = str2;
        this.digital_wallet_cards = TransactorKt.immutableCopyOf("digital_wallet_cards", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    public static ActivateDigitalWalletRequest copy$default(ActivateDigitalWalletRequest activateDigitalWalletRequest, RequestContext requestContext, ArrayList arrayList, ByteString byteString, int i) {
        String str = activateDigitalWalletRequest.issued_card_token;
        String str2 = activateDigitalWalletRequest.pan_reference_id;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = activateDigitalWalletRequest.digital_wallet_cards;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            byteString = activateDigitalWalletRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        activateDigitalWalletRequest.getClass();
        arrayList3.getClass();
        byteString2.getClass();
        return new ActivateDigitalWalletRequest(requestContext, str, str2, arrayList3, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivateDigitalWalletRequest)) {
            return false;
        }
        ActivateDigitalWalletRequest activateDigitalWalletRequest = (ActivateDigitalWalletRequest) obj;
        return Intrinsics.areEqual(unknownFields(), activateDigitalWalletRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, activateDigitalWalletRequest.request_context) && Intrinsics.areEqual(this.issued_card_token, activateDigitalWalletRequest.issued_card_token) && Intrinsics.areEqual(this.pan_reference_id, activateDigitalWalletRequest.pan_reference_id) && Intrinsics.areEqual(this.digital_wallet_cards, activateDigitalWalletRequest.digital_wallet_cards);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.issued_card_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.pan_reference_id;
        int hashCode4 = this.digital_wallet_cards.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetFullNameRequest.Builder builder = new SetFullNameRequest.Builder(2);
        builder.request_context = this.request_context;
        builder.full_name = this.issued_card_token;
        builder.transfer_token = this.pan_reference_id;
        builder.payment_tokens = this.digital_wallet_cards;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.issued_card_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "issued_card_token=", arrayList);
        }
        String str2 = this.pan_reference_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "pan_reference_id=", arrayList);
        }
        List list = this.digital_wallet_cards;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("digital_wallet_cards=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivateDigitalWalletRequest{", "}", 0, null, null, 56);
    }
}
