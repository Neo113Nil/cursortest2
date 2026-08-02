package com.squareup.protos.cash.postbank.api;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/postbank/api/GenerateDirectDepositFormResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Header$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GenerateDirectDepositFormResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenerateDirectDepositFormResponse> CREATOR;
    public final String document_token;
    public final String file_url;

    static {
        GenerateDirectDepositFormResponse$Companion$ADAPTER$1 generateDirectDepositFormResponse$Companion$ADAPTER$1 = new GenerateDirectDepositFormResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GenerateDirectDepositFormResponse.class), "type.googleapis.com/squareup.cash.postbank.api.GenerateDirectDepositFormResponse", Syntax.PROTO_2, null, "squareup/cash/postbank/api/GenerateDirectDepositForm.proto");
        ADAPTER = generateDirectDepositFormResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(generateDirectDepositFormResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateDirectDepositFormResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.file_url = str;
        this.document_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateDirectDepositFormResponse)) {
            return false;
        }
        GenerateDirectDepositFormResponse generateDirectDepositFormResponse = (GenerateDirectDepositFormResponse) obj;
        return Intrinsics.areEqual(unknownFields(), generateDirectDepositFormResponse.unknownFields()) && Intrinsics.areEqual(this.file_url, generateDirectDepositFormResponse.file_url) && Intrinsics.areEqual(this.document_token, generateDirectDepositFormResponse.document_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.file_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.document_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(9);
        builder.name = this.file_url;
        builder.value = this.document_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.file_url != null) {
            arrayList.add("file_url=██");
        }
        String str = this.document_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "document_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenerateDirectDepositFormResponse{", "}", 0, null, null, 56);
    }
}
