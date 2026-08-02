package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
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
public final class CardSeriesContainer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardSeriesContainer> CREATOR;
    public final List items;

    static {
        CardSeriesContainer$Companion$ADAPTER$1 cardSeriesContainer$Companion$ADAPTER$1 = new CardSeriesContainer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardSeriesContainer.class), "type.googleapis.com/squareup.cash.genericelements.ui.CardSeriesContainer", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = cardSeriesContainer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardSeriesContainer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSeriesContainer(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardSeriesContainer)) {
            return false;
        }
        CardSeriesContainer cardSeriesContainer = (CardSeriesContainer) obj;
        return Intrinsics.areEqual(unknownFields(), cardSeriesContainer.unknownFields()) && Intrinsics.areEqual(this.items, cardSeriesContainer.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(15, false);
        builder.scenarios = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardSeriesContainer{", "}", 0, null, null, 56);
    }
}
