package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenFeed extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenFeed> CREATOR;
    public final List content;
    public final MiniCard market_mini_card;

    static {
        MarketScreenFeed$Companion$ADAPTER$1 marketScreenFeed$Companion$ADAPTER$1 = new MarketScreenFeed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenFeed.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenFeed", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenFeed$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenFeed$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenFeed(List list, MiniCard miniCard, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.market_mini_card = miniCard;
        this.content = TransactorKt.immutableCopyOf("content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenFeed)) {
            return false;
        }
        MarketScreenFeed marketScreenFeed = (MarketScreenFeed) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenFeed.unknownFields()) && Intrinsics.areEqual(this.content, marketScreenFeed.content) && Intrinsics.areEqual(this.market_mini_card, marketScreenFeed.market_mini_card);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.content);
        MiniCard miniCard = this.market_mini_card;
        int hashCode = m + (miniCard != null ? miniCard.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(27);
        builder.card_type = this.content;
        builder.card_pii = this.market_mini_card;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.content;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("content=", arrayList, list);
        }
        MiniCard miniCard = this.market_mini_card;
        if (miniCard != null) {
            arrayList.add("market_mini_card=" + miniCard);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenFeed{", "}", 0, null, null, 56);
    }
}
