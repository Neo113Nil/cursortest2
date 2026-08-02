package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
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
public final class CardWithBoosts extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardWithBoosts> CREATOR;
    public final Card card;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Card card;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CardWithBoosts(this.card, buildUnknownFields());
                case 1:
                    return new CardWithBenefits(this.card, buildUnknownFields());
                default:
                    return new CardWithSignatureStamps(this.card, buildUnknownFields());
            }
        }
    }

    static {
        CardWithBoosts$Companion$ADAPTER$1 cardWithBoosts$Companion$ADAPTER$1 = new CardWithBoosts$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardWithBoosts.class), "type.googleapis.com/squareup.cash.composer.app.CardWithBoosts", Syntax.PROTO_2, null, "squareup/cash/composer/app/CardTabNullStateV2.proto");
        ADAPTER = cardWithBoosts$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardWithBoosts$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWithBoosts(Card card, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card = card;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardWithBoosts)) {
            return false;
        }
        CardWithBoosts cardWithBoosts = (CardWithBoosts) obj;
        return Intrinsics.areEqual(unknownFields(), cardWithBoosts.unknownFields()) && Intrinsics.areEqual(this.card, cardWithBoosts.card);
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardWithBoosts{", "}", 0, null, null, 56);
    }
}
