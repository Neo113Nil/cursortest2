package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.giftly.GiftCard;
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
public final class SyncGiftCardEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncGiftCardEntity> CREATOR;
    public final GiftCard gift_card;

    static {
        SyncGiftCardEntity$Companion$ADAPTER$1 syncGiftCardEntity$Companion$ADAPTER$1 = new SyncGiftCardEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncGiftCardEntity.class), "type.googleapis.com/squareup.franklin.SyncGiftCardEntity", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncGiftCardEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncGiftCardEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncGiftCardEntity(GiftCard giftCard, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.gift_card = giftCard;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncGiftCardEntity)) {
            return false;
        }
        SyncGiftCardEntity syncGiftCardEntity = (SyncGiftCardEntity) obj;
        return Intrinsics.areEqual(unknownFields(), syncGiftCardEntity.unknownFields()) && Intrinsics.areEqual(this.gift_card, syncGiftCardEntity.gift_card);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GiftCard giftCard = this.gift_card;
        int hashCode2 = hashCode + (giftCard != null ? giftCard.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(7);
        builder.cash_limit_group = this.gift_card;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GiftCard giftCard = this.gift_card;
        if (giftCard != null) {
            arrayList.add("gift_card=" + giftCard);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncGiftCardEntity{", "}", 0, null, null, 56);
    }
}
