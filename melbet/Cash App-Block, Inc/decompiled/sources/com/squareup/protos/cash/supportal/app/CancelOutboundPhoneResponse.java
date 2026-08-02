package com.squareup.protos.cash.supportal.app;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/CancelOutboundPhoneResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Header$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CancelOutboundPhoneResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelOutboundPhoneResponse> CREATOR;
    public final String message;
    public final String title;

    static {
        CancelOutboundPhoneResponse$Companion$ADAPTER$1 cancelOutboundPhoneResponse$Companion$ADAPTER$1 = new CancelOutboundPhoneResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelOutboundPhoneResponse.class), "type.googleapis.com/squareup.cash.supportal.app.CancelOutboundPhoneResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = cancelOutboundPhoneResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cancelOutboundPhoneResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelOutboundPhoneResponse(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelOutboundPhoneResponse)) {
            return false;
        }
        CancelOutboundPhoneResponse cancelOutboundPhoneResponse = (CancelOutboundPhoneResponse) obj;
        return Intrinsics.areEqual(unknownFields(), cancelOutboundPhoneResponse.unknownFields()) && Intrinsics.areEqual(this.title, cancelOutboundPhoneResponse.title) && Intrinsics.areEqual(this.message, cancelOutboundPhoneResponse.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(15);
        builder.name = this.title;
        builder.value = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelOutboundPhoneResponse{", "}", 0, null, null, 56);
    }
}
