package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashidv.flows.DisplayNameFlowParameters;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/postcard/app/KnotSwitchCardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/app/KnotSwitchCardResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KnotSwitchCardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<KnotSwitchCardResponse> CREATOR;
    public final Integer merchant_id;
    public final Boolean success;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Integer merchant_id;
        public Boolean success;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new KnotSwitchCardResponse(this.success, this.merchant_id, buildUnknownFields());
                case 1:
                    return new DisplayNameFlowParameters(this.success, this.merchant_id, buildUnknownFields());
                default:
                    return new LocalMenuItemModifierList.FreeTextEntry(this.success, this.merchant_id, buildUnknownFields());
            }
        }
    }

    static {
        KnotSwitchCardResponse$Companion$ADAPTER$1 knotSwitchCardResponse$Companion$ADAPTER$1 = new KnotSwitchCardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KnotSwitchCardResponse.class), "type.googleapis.com/squareup.cash.postcard.app.KnotSwitchCardResponse", Syntax.PROTO_2, null, "squareup/cash/postcard/app/KnotApi.proto");
        ADAPTER = knotSwitchCardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(knotSwitchCardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnotSwitchCardResponse(Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.success = bool;
        this.merchant_id = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KnotSwitchCardResponse)) {
            return false;
        }
        KnotSwitchCardResponse knotSwitchCardResponse = (KnotSwitchCardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), knotSwitchCardResponse.unknownFields()) && Intrinsics.areEqual(this.success, knotSwitchCardResponse.success) && Intrinsics.areEqual(this.merchant_id, knotSwitchCardResponse.merchant_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.success;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.merchant_id;
        int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.success = this.success;
        builder.merchant_id = this.merchant_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.success;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("success=", bool, arrayList);
        }
        Integer num = this.merchant_id;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("merchant_id=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "KnotSwitchCardResponse{", "}", 0, null, null, 56);
    }
}
