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
public final class CardWithBenefits extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardWithBenefits> CREATOR;
    public final Card card;

    static {
        CardWithBenefits$Companion$ADAPTER$1 cardWithBenefits$Companion$ADAPTER$1 = new CardWithBenefits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardWithBenefits.class), "type.googleapis.com/squareup.cash.composer.app.CardWithBenefits", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = cardWithBenefits$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardWithBenefits$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWithBenefits(Card card, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card = card;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardWithBenefits)) {
            return false;
        }
        CardWithBenefits cardWithBenefits = (CardWithBenefits) obj;
        return Intrinsics.areEqual(unknownFields(), cardWithBenefits.unknownFields()) && Intrinsics.areEqual(this.card, cardWithBenefits.card);
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
        CardWithBoosts.Builder builder = new CardWithBoosts.Builder(1);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardWithBenefits{", "}", 0, null, null, 56);
    }
}
