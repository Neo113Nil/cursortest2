package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
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
public final class IOSCardData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IOSCardData> CREATOR;
    public final String general_card_data;
    public final String payment_card_data;

    static {
        IOSCardData$Companion$ADAPTER$1 iOSCardData$Companion$ADAPTER$1 = new IOSCardData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IOSCardData.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.IOSCardData", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/client_service.proto");
        ADAPTER = iOSCardData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(iOSCardData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IOSCardData(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.general_card_data = str;
        this.payment_card_data = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IOSCardData)) {
            return false;
        }
        IOSCardData iOSCardData = (IOSCardData) obj;
        return Intrinsics.areEqual(unknownFields(), iOSCardData.unknownFields()) && Intrinsics.areEqual(this.general_card_data, iOSCardData.general_card_data) && Intrinsics.areEqual(this.payment_card_data, iOSCardData.payment_card_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.general_card_data;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payment_card_data;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(13);
        builder.prefix = this.general_card_data;
        builder.name = this.payment_card_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.general_card_data != null) {
            arrayList.add("general_card_data=██");
        }
        if (this.payment_card_data != null) {
            arrayList.add("payment_card_data=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IOSCardData{", "}", 0, null, null, 56);
    }
}
