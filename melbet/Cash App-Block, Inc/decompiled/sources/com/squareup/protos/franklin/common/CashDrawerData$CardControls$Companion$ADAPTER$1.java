package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashDrawerData$CardControls$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashDrawerData.CardControls((UiControl) obj, (UiControl) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiControl.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(UiControl.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(UiControl.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashDrawerData.CardControls cardControls = (CashDrawerData.CardControls) obj;
        reverseProtoWriter.getClass();
        cardControls.getClass();
        reverseProtoWriter.writeBytes(cardControls.unknownFields());
        ProtoAdapter protoAdapter = UiControl.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, cardControls.overflow_controls);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardControls.card_status_control);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardControls.card_control);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashDrawerData.CardControls cardControls = (CashDrawerData.CardControls) obj;
        cardControls.getClass();
        int size$okio = cardControls.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = UiControl.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, cardControls.overflow_controls) + protoAdapter.encodedSizeWithTag(2, cardControls.card_status_control) + protoAdapter.encodedSizeWithTag(1, cardControls.card_control) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashDrawerData.CardControls cardControls = (CashDrawerData.CardControls) obj;
        cardControls.getClass();
        UiControl uiControl = cardControls.card_control;
        UiControl uiControl2 = uiControl != null ? (UiControl) UiControl.ADAPTER.redact(uiControl) : null;
        UiControl uiControl3 = cardControls.card_status_control;
        UiControl uiControl4 = uiControl3 != null ? (UiControl) UiControl.ADAPTER.redact(uiControl3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cardControls.overflow_controls, UiControl.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashDrawerData.CardControls(uiControl2, uiControl4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashDrawerData.CardControls cardControls = (CashDrawerData.CardControls) obj;
        cardControls.getClass();
        ProtoAdapter protoAdapter = UiControl.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cardControls.card_control);
        protoAdapter.encodeWithTag(protoWriter, 2, cardControls.card_status_control);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, cardControls.overflow_controls);
        protoWriter.writeBytes(cardControls.unknownFields());
    }
}
