package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/EndChatResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/profiles/ProfileDetails$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EndChatResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EndChatResponse> CREATOR;
    public final String survey_token;

    static {
        EndChatResponse$Companion$ADAPTER$1 endChatResponse$Companion$ADAPTER$1 = new EndChatResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EndChatResponse.class), "type.googleapis.com/squareup.cash.supportal.app.EndChatResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = endChatResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(endChatResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndChatResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.survey_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EndChatResponse)) {
            return false;
        }
        EndChatResponse endChatResponse = (EndChatResponse) obj;
        return Intrinsics.areEqual(unknownFields(), endChatResponse.unknownFields()) && Intrinsics.areEqual(this.survey_token, endChatResponse.survey_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.survey_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(20);
        builder.bio = this.survey_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.survey_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "survey_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EndChatResponse{", "}", 0, null, null, 56);
    }
}
