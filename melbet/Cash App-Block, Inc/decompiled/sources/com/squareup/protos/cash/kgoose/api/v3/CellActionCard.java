package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.CellDefault;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "cell", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "card_buttons", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellActionCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellActionCard> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ActionCard$CardButtons#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActionCard.CardButtons card_buttons;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.CellDefault#ADAPTER", schemaIndex = 0, tag = 1)
    public final CellDefault cell;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellActionCard;", "<init>", "()V", "cell", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "card_buttons", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ActionCard.CardButtons card_buttons;
        public CellDefault cell;

        @Override // com.squareup.wire.Message.Builder
        public CellActionCard build() {
            return new CellActionCard(this.cell, this.card_buttons, buildUnknownFields());
        }

        public final Builder card_buttons(ActionCard.CardButtons card_buttons) {
            this.card_buttons = card_buttons;
            return this;
        }

        public final Builder cell(CellDefault cell) {
            this.cell = cell;
            return this;
        }
    }

    static {
        CellActionCard$Companion$ADAPTER$1 cellActionCard$Companion$ADAPTER$1 = new CellActionCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellActionCard.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CellActionCard", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = cellActionCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cellActionCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellActionCard(CellDefault cellDefault, ActionCard.CardButtons cardButtons, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cell = cellDefault;
        this.card_buttons = cardButtons;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellActionCard)) {
            return false;
        }
        CellActionCard cellActionCard = (CellActionCard) obj;
        return Intrinsics.areEqual(unknownFields(), cellActionCard.unknownFields()) && Intrinsics.areEqual(this.cell, cellActionCard.cell) && Intrinsics.areEqual(this.card_buttons, cellActionCard.card_buttons);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CellDefault cellDefault = this.cell;
        int hashCode2 = (hashCode + (cellDefault != null ? cellDefault.hashCode() : 0)) * 37;
        ActionCard.CardButtons cardButtons = this.card_buttons;
        int hashCode3 = hashCode2 + (cardButtons != null ? cardButtons.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cell = this.cell;
        builder.card_buttons = this.card_buttons;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CellDefault cellDefault = this.cell;
        if (cellDefault != null) {
            arrayList.add("cell=" + cellDefault);
        }
        ActionCard.CardButtons cardButtons = this.card_buttons;
        if (cardButtons != null) {
            arrayList.add("card_buttons=" + cardButtons);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellActionCard{", "}", 0, null, null, 56);
    }
}
