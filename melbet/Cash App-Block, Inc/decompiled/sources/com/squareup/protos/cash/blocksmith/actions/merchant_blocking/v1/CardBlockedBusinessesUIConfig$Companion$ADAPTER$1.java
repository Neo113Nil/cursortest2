package com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardBlockedBusinessesUIConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardBlockedBusinessesUIConfig((String) obj, m, (CardBlockedBusinessesUIConfig.NavigationHelpItem) obj2, (CardBlockedBusinessesUIConfig.ErrorMessageDialog) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(CardBlockedBusinessesUIConfig.SectionConfig.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(CardBlockedBusinessesUIConfig.NavigationHelpItem.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CardBlockedBusinessesUIConfig.ErrorMessageDialog.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = (CardBlockedBusinessesUIConfig) obj;
        reverseProtoWriter.getClass();
        cardBlockedBusinessesUIConfig.getClass();
        reverseProtoWriter.writeBytes(cardBlockedBusinessesUIConfig.unknownFields());
        CardBlockedBusinessesUIConfig.ErrorMessageDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cardBlockedBusinessesUIConfig.error_message);
        CardBlockedBusinessesUIConfig.NavigationHelpItem.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardBlockedBusinessesUIConfig.navigation_item);
        CardBlockedBusinessesUIConfig.SectionConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cardBlockedBusinessesUIConfig.sections);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cardBlockedBusinessesUIConfig.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = (CardBlockedBusinessesUIConfig) obj;
        cardBlockedBusinessesUIConfig.getClass();
        return CardBlockedBusinessesUIConfig.ErrorMessageDialog.ADAPTER.encodedSizeWithTag(4, cardBlockedBusinessesUIConfig.error_message) + CardBlockedBusinessesUIConfig.NavigationHelpItem.ADAPTER.encodedSizeWithTag(3, cardBlockedBusinessesUIConfig.navigation_item) + CardBlockedBusinessesUIConfig.SectionConfig.ADAPTER.asRepeated().encodedSizeWithTag(2, cardBlockedBusinessesUIConfig.sections) + ProtoAdapter.STRING.encodedSizeWithTag(1, cardBlockedBusinessesUIConfig.customer_token) + cardBlockedBusinessesUIConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = (CardBlockedBusinessesUIConfig) obj;
        cardBlockedBusinessesUIConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardBlockedBusinessesUIConfig.sections, CardBlockedBusinessesUIConfig.SectionConfig.ADAPTER);
        CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem = cardBlockedBusinessesUIConfig.navigation_item;
        CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem2 = navigationHelpItem != null ? (CardBlockedBusinessesUIConfig.NavigationHelpItem) CardBlockedBusinessesUIConfig.NavigationHelpItem.ADAPTER.redact(navigationHelpItem) : null;
        CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog = cardBlockedBusinessesUIConfig.error_message;
        CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog2 = errorMessageDialog != null ? (CardBlockedBusinessesUIConfig.ErrorMessageDialog) CardBlockedBusinessesUIConfig.ErrorMessageDialog.ADAPTER.redact(errorMessageDialog) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cardBlockedBusinessesUIConfig.customer_token;
        byteString.getClass();
        return new CardBlockedBusinessesUIConfig(str, m1169redactElements, navigationHelpItem2, errorMessageDialog2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig = (CardBlockedBusinessesUIConfig) obj;
        cardBlockedBusinessesUIConfig.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cardBlockedBusinessesUIConfig.customer_token);
        CardBlockedBusinessesUIConfig.SectionConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cardBlockedBusinessesUIConfig.sections);
        CardBlockedBusinessesUIConfig.NavigationHelpItem.ADAPTER.encodeWithTag(protoWriter, 3, cardBlockedBusinessesUIConfig.navigation_item);
        CardBlockedBusinessesUIConfig.ErrorMessageDialog.ADAPTER.encodeWithTag(protoWriter, 4, cardBlockedBusinessesUIConfig.error_message);
        protoWriter.writeBytes(cardBlockedBusinessesUIConfig.unknownFields());
    }
}
