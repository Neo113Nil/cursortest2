package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardProcessorDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardProcessorDetails> CREATOR;
    public final String processor_card_id;
    public final String time_based_secret;

    static {
        CardProcessorDetails$Companion$ADAPTER$1 cardProcessorDetails$Companion$ADAPTER$1 = new CardProcessorDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardProcessorDetails.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.CardProcessorDetails", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/get_card_processor_details.proto");
        ADAPTER = cardProcessorDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardProcessorDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardProcessorDetails(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.processor_card_id = str;
        this.time_based_secret = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardProcessorDetails)) {
            return false;
        }
        CardProcessorDetails cardProcessorDetails = (CardProcessorDetails) obj;
        return Intrinsics.areEqual(unknownFields(), cardProcessorDetails.unknownFields()) && Intrinsics.areEqual(this.processor_card_id, cardProcessorDetails.processor_card_id) && Intrinsics.areEqual(this.time_based_secret, cardProcessorDetails.time_based_secret);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.processor_card_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.time_based_secret;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(18);
        builder.prefix = this.processor_card_id;
        builder.name = this.time_based_secret;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.processor_card_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "processor_card_id=", arrayList);
        }
        if (this.time_based_secret != null) {
            arrayList.add("time_based_secret=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardProcessorDetails{", "}", 0, null, null, 56);
    }
}
