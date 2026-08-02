package com.squareup.protos.cash.whimsicard.syncentity;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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

/* loaded from: classes8.dex */
public final class CardSkinAssets extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSkinAssets> CREATOR;
    public final List skins;

    static {
        CardSkinAssets$Companion$ADAPTER$1 cardSkinAssets$Companion$ADAPTER$1 = new CardSkinAssets$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSkinAssets.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.CardSkinAssets", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/card_skin_assets.proto");
        ADAPTER = cardSkinAssets$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSkinAssets$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSkinAssets(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.skins = TransactorKt.immutableCopyOf("skins", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSkinAssets)) {
            return false;
        }
        CardSkinAssets cardSkinAssets = (CardSkinAssets) obj;
        return Intrinsics.areEqual(unknownFields(), cardSkinAssets.unknownFields()) && Intrinsics.areEqual(this.skins, cardSkinAssets.skins);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.skins.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(9, false);
        builder.header = this.skins;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.skins;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("skins=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSkinAssets{", "}", 0, null, null, 56);
    }
}
