package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/janus/api/StartWebAuthnRegistrationResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/ExpenseSlice$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartWebAuthnRegistrationResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartWebAuthnRegistrationResponse> CREATOR;
    public final ByteString challenge;
    public final String options;
    public final String relying_party_identifier;
    public final String request_id;
    public final ByteString user_id;
    public final String user_name;

    static {
        StartWebAuthnRegistrationResponse$Companion$ADAPTER$1 startWebAuthnRegistrationResponse$Companion$ADAPTER$1 = new StartWebAuthnRegistrationResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartWebAuthnRegistrationResponse.class), "type.googleapis.com/squareup.cash.janus.api.StartWebAuthnRegistrationResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/WebAuthn.proto");
        ADAPTER = startWebAuthnRegistrationResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startWebAuthnRegistrationResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartWebAuthnRegistrationResponse(String str, String str2, String str3, ByteString byteString, String str4, ByteString byteString2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.request_id = str;
        this.options = str2;
        this.relying_party_identifier = str3;
        this.user_id = byteString;
        this.user_name = str4;
        this.challenge = byteString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartWebAuthnRegistrationResponse)) {
            return false;
        }
        StartWebAuthnRegistrationResponse startWebAuthnRegistrationResponse = (StartWebAuthnRegistrationResponse) obj;
        return Intrinsics.areEqual(unknownFields(), startWebAuthnRegistrationResponse.unknownFields()) && Intrinsics.areEqual(this.request_id, startWebAuthnRegistrationResponse.request_id) && Intrinsics.areEqual(this.options, startWebAuthnRegistrationResponse.options) && Intrinsics.areEqual(this.relying_party_identifier, startWebAuthnRegistrationResponse.relying_party_identifier) && Intrinsics.areEqual(this.user_id, startWebAuthnRegistrationResponse.user_id) && Intrinsics.areEqual(this.user_name, startWebAuthnRegistrationResponse.user_name) && Intrinsics.areEqual(this.challenge, startWebAuthnRegistrationResponse.challenge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.request_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.options;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.relying_party_identifier;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ByteString byteString = this.user_id;
        int hashCode5 = (hashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str4 = this.user_name;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        ByteString byteString2 = this.challenge;
        int hashCode7 = hashCode6 + (byteString2 != null ? byteString2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(11);
        builder.slice_token = this.request_id;
        builder.requester = this.options;
        builder.responder = this.relying_party_identifier;
        builder.amount = this.user_id;
        builder.status = this.user_name;
        builder.action = this.challenge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.request_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "request_id=", arrayList);
        }
        if (this.options != null) {
            arrayList.add("options=██");
        }
        String str2 = this.relying_party_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "relying_party_identifier=", arrayList);
        }
        ByteString byteString = this.user_id;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("user_id=", byteString, arrayList);
        }
        if (this.user_name != null) {
            arrayList.add("user_name=██");
        }
        ByteString byteString2 = this.challenge;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("challenge=", byteString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartWebAuthnRegistrationResponse{", "}", 0, null, null, 56);
    }
}
