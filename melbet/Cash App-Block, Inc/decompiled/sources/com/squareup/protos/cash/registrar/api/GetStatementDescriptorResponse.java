package com.squareup.protos.cash.registrar.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/registrar/api/GetStatementDescriptorResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Header$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetStatementDescriptorResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetStatementDescriptorResponse> CREATOR;
    public final String display_name;
    public final String file_name;

    static {
        GetStatementDescriptorResponse$Companion$ADAPTER$1 getStatementDescriptorResponse$Companion$ADAPTER$1 = new GetStatementDescriptorResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetStatementDescriptorResponse.class), "type.googleapis.com/squareup.cash.registrar.api.GetStatementDescriptorResponse", Syntax.PROTO_2, null, "squareup/cash/registrar/api/get_statement_descriptor.proto");
        ADAPTER = getStatementDescriptorResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getStatementDescriptorResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStatementDescriptorResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.file_name = str;
        this.display_name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStatementDescriptorResponse)) {
            return false;
        }
        GetStatementDescriptorResponse getStatementDescriptorResponse = (GetStatementDescriptorResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getStatementDescriptorResponse.unknownFields()) && Intrinsics.areEqual(this.file_name, getStatementDescriptorResponse.file_name) && Intrinsics.areEqual(this.display_name, getStatementDescriptorResponse.display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.file_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.display_name;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(12);
        builder.name = this.file_name;
        builder.value = this.display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.file_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_name=", arrayList);
        }
        String str2 = this.display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetStatementDescriptorResponse{", "}", 0, null, null, 56);
    }
}
