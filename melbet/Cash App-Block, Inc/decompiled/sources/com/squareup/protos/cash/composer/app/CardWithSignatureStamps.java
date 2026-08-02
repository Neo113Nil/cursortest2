package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.CardWithBoosts;
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
public final class CardWithSignatureStamps extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardWithSignatureStamps> CREATOR;
    public final Card card;

    static {
        CardWithSignatureStamps$Companion$ADAPTER$1 cardWithSignatureStamps$Companion$ADAPTER$1 = new CardWithSignatureStamps$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardWithSignatureStamps.class), "type.googleapis.com/squareup.cash.composer.app.CardWithSignatureStamps", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = cardWithSignatureStamps$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardWithSignatureStamps$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWithSignatureStamps(Card card, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card = card;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardWithSignatureStamps)) {
            return false;
        }
        CardWithSignatureStamps cardWithSignatureStamps = (CardWithSignatureStamps) obj;
        return Intrinsics.areEqual(unknownFields(), cardWithSignatureStamps.unknownFields()) && Intrinsics.areEqual(this.card, cardWithSignatureStamps.card);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Card card = this.card;
        int hashCode2 = hashCode + (card != null ? card.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardWithBoosts.Builder builder = new CardWithBoosts.Builder(2);
        builder.card = this.card;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Card card = this.card;
        if (card != null) {
            arrayList.add("card=" + card);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardWithSignatureStamps{", "}", 0, null, null, 56);
    }
}
