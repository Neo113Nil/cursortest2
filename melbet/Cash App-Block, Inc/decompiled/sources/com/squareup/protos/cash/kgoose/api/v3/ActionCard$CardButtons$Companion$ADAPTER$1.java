package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ActionCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ActionCard$CardButtons;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionCard$CardButtons$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionCard.CardButtons((ActionableButtonDefault) obj, (String) obj2, (ActionableButtonDefault) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionCard.CardButtons cardButtons = (ActionCard.CardButtons) obj;
        reverseProtoWriter.getClass();
        cardButtons.getClass();
        reverseProtoWriter.writeBytes(cardButtons.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardButtons.secondary_button_hidden_message);
        ProtoAdapter protoAdapter2 = ActionableButtonDefault.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, cardButtons.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardButtons.primary_button_hidden_message);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cardButtons.primary_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionCard.CardButtons cardButtons = (ActionCard.CardButtons) obj;
        cardButtons.getClass();
        int size$okio = cardButtons.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ActionableButtonDefault.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, cardButtons.primary_button) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter2.encodedSizeWithTag(4, cardButtons.secondary_button_hidden_message) + protoAdapter.encodedSizeWithTag(3, cardButtons.secondary_button) + protoAdapter2.encodedSizeWithTag(2, cardButtons.primary_button_hidden_message) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionCard.CardButtons cardButtons = (ActionCard.CardButtons) obj;
        cardButtons.getClass();
        ActionableButtonDefault actionableButtonDefault = cardButtons.primary_button;
        ActionableButtonDefault actionableButtonDefault2 = actionableButtonDefault != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault) : null;
        ActionableButtonDefault actionableButtonDefault3 = cardButtons.secondary_button;
        ActionableButtonDefault actionableButtonDefault4 = actionableButtonDefault3 != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardButtons.primary_button_hidden_message;
        String str2 = cardButtons.secondary_button_hidden_message;
        byteString.getClass();
        return new ActionCard.CardButtons(actionableButtonDefault2, str, actionableButtonDefault4, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionCard.CardButtons cardButtons = (ActionCard.CardButtons) obj;
        cardButtons.getClass();
        ProtoAdapter protoAdapter = ActionableButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cardButtons.primary_button);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, cardButtons.primary_button_hidden_message);
        protoAdapter.encodeWithTag(protoWriter, 3, cardButtons.secondary_button);
        protoAdapter2.encodeWithTag(protoWriter, 4, cardButtons.secondary_button_hidden_message);
        protoWriter.writeBytes(cardButtons.unknownFields());
    }
}
