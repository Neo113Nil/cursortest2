package com.squareup.protos.cash.lynx.api.v1_0;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/lynx/api/v1_0/InitiateStripeLinkResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/FullName$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitiateStripeLinkResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateStripeLinkResponse> CREATOR;
    public final String client_secret;
    public final String publishable_key;

    static {
        InitiateStripeLinkResponse$Companion$ADAPTER$1 initiateStripeLinkResponse$Companion$ADAPTER$1 = new InitiateStripeLinkResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateStripeLinkResponse.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.InitiateStripeLinkResponse", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/StripeBankLinking.proto");
        ADAPTER = initiateStripeLinkResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateStripeLinkResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateStripeLinkResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_secret = str;
        this.publishable_key = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateStripeLinkResponse)) {
            return false;
        }
        InitiateStripeLinkResponse initiateStripeLinkResponse = (InitiateStripeLinkResponse) obj;
        return Intrinsics.areEqual(unknownFields(), initiateStripeLinkResponse.unknownFields()) && Intrinsics.areEqual(this.client_secret, initiateStripeLinkResponse.client_secret) && Intrinsics.areEqual(this.publishable_key, initiateStripeLinkResponse.publishable_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.client_secret;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.publishable_key;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        FullName.Builder builder = new FullName.Builder(26);
        builder.given_name = this.client_secret;
        builder.family_name = this.publishable_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.client_secret != null) {
            arrayList.add("client_secret=██");
        }
        String str = this.publishable_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "publishable_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateStripeLinkResponse{", "}", 0, null, null, 56);
    }
}
