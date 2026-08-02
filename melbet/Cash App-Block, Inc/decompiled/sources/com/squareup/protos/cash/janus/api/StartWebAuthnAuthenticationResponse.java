package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/janus/api/StartWebAuthnAuthenticationResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/discover/api/app/v1/model/Text$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartWebAuthnAuthenticationResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartWebAuthnAuthenticationResponse> CREATOR;
    public final List allow_credential_ids;
    public final ByteString challenge;
    public final String options;
    public final String relying_party_identifier;
    public final String request_id;

    static {
        StartWebAuthnAuthenticationResponse$Companion$ADAPTER$1 startWebAuthnAuthenticationResponse$Companion$ADAPTER$1 = new StartWebAuthnAuthenticationResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartWebAuthnAuthenticationResponse.class), "type.googleapis.com/squareup.cash.janus.api.StartWebAuthnAuthenticationResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/WebAuthn.proto");
        ADAPTER = startWebAuthnAuthenticationResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startWebAuthnAuthenticationResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartWebAuthnAuthenticationResponse(String str, String str2, String str3, ByteString byteString, List list, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.request_id = str;
        this.options = str2;
        this.relying_party_identifier = str3;
        this.challenge = byteString;
        this.allow_credential_ids = TransactorKt.immutableCopyOf("allow_credential_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartWebAuthnAuthenticationResponse)) {
            return false;
        }
        StartWebAuthnAuthenticationResponse startWebAuthnAuthenticationResponse = (StartWebAuthnAuthenticationResponse) obj;
        return Intrinsics.areEqual(unknownFields(), startWebAuthnAuthenticationResponse.unknownFields()) && Intrinsics.areEqual(this.request_id, startWebAuthnAuthenticationResponse.request_id) && Intrinsics.areEqual(this.options, startWebAuthnAuthenticationResponse.options) && Intrinsics.areEqual(this.relying_party_identifier, startWebAuthnAuthenticationResponse.relying_party_identifier) && Intrinsics.areEqual(this.challenge, startWebAuthnAuthenticationResponse.challenge) && Intrinsics.areEqual(this.allow_credential_ids, startWebAuthnAuthenticationResponse.allow_credential_ids);
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
        ByteString byteString = this.challenge;
        int hashCode5 = this.allow_credential_ids.hashCode() + ((hashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(18);
        builder.text = this.request_id;
        builder.text_style = this.options;
        builder.text_decoration = this.relying_party_identifier;
        builder.text_color = this.challenge;
        builder.icon = this.allow_credential_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.request_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "request_id=", arrayList);
        }
        String str2 = this.options;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "options=", arrayList);
        }
        String str3 = this.relying_party_identifier;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "relying_party_identifier=", arrayList);
        }
        ByteString byteString = this.challenge;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("challenge=", byteString, arrayList);
        }
        List list = this.allow_credential_ids;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allow_credential_ids=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartWebAuthnAuthenticationResponse{", "}", 0, null, null, 56);
    }
}
