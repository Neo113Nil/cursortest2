package com.squareup.protos.cash.whimsicard.syncentity;

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
public final class CardSkinAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSkinAsset> CREATOR;
    public final String asset_url;
    public final String skin_token;

    static {
        CardSkinAsset$Companion$ADAPTER$1 cardSkinAsset$Companion$ADAPTER$1 = new CardSkinAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSkinAsset.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.CardSkinAsset", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/card_skin_assets.proto");
        ADAPTER = cardSkinAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSkinAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSkinAsset(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.skin_token = str;
        this.asset_url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSkinAsset)) {
            return false;
        }
        CardSkinAsset cardSkinAsset = (CardSkinAsset) obj;
        return Intrinsics.areEqual(unknownFields(), cardSkinAsset.unknownFields()) && Intrinsics.areEqual(this.skin_token, cardSkinAsset.skin_token) && Intrinsics.areEqual(this.asset_url, cardSkinAsset.asset_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.skin_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.asset_url;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(20);
        builder.name = this.skin_token;
        builder.value = this.asset_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.skin_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "skin_token=", arrayList);
        }
        String str2 = this.asset_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "asset_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSkinAsset{", "}", 0, null, null, 56);
    }
}
