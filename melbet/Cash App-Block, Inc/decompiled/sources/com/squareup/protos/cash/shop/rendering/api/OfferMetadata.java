package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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

/* loaded from: classes8.dex */
public final class OfferMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferMetadata> CREATOR;
    public final String boost_token;
    public final String offer_token;

    static {
        OfferMetadata$Companion$ADAPTER$1 offerMetadata$Companion$ADAPTER$1 = new OfferMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferMetadata.class), "type.googleapis.com/squareup.cash.shop.rendering.api.OfferMetadata", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
        ADAPTER = offerMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferMetadata(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.boost_token = str;
        this.offer_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferMetadata)) {
            return false;
        }
        OfferMetadata offerMetadata = (OfferMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), offerMetadata.unknownFields()) && Intrinsics.areEqual(this.boost_token, offerMetadata.boost_token) && Intrinsics.areEqual(this.offer_token, offerMetadata.offer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.boost_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.offer_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(13);
        builder.name = this.boost_token;
        builder.value = this.offer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.boost_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_token=", arrayList);
        }
        String str2 = this.offer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "offer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferMetadata{", "}", 0, null, null, 56);
    }
}
