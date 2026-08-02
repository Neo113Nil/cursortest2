package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.SupportConfig;
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
public final class CardDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardDetails> CREATOR;
    public final String expiration;
    public final String pan;
    public final String security_code;

    static {
        CardDetails$Companion$ADAPTER$1 cardDetails$Companion$ADAPTER$1 = new CardDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardDetails.class), "type.googleapis.com/squareup.cash.postcard.app.CardDetails", Syntax.PROTO_2, null, "squareup/cash/postcard/app/GetCardDetails.proto");
        ADAPTER = cardDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetails(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pan = str;
        this.security_code = str2;
        this.expiration = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardDetails)) {
            return false;
        }
        CardDetails cardDetails = (CardDetails) obj;
        return Intrinsics.areEqual(unknownFields(), cardDetails.unknownFields()) && Intrinsics.areEqual(this.pan, cardDetails.pan) && Intrinsics.areEqual(this.security_code, cardDetails.security_code) && Intrinsics.areEqual(this.expiration, cardDetails.expiration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pan;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.security_code;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.expiration;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(24);
        builder.contact_support_url = this.pan;
        builder.privacy_policy_url = this.security_code;
        builder.terms_of_service_url = this.expiration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.pan != null) {
            arrayList.add("pan=██");
        }
        if (this.security_code != null) {
            arrayList.add("security_code=██");
        }
        if (this.expiration != null) {
            arrayList.add("expiration=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardDetails{", "}", 0, null, null, 56);
    }
}
