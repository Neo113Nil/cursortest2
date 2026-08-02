package com.squareup.protos.cash.postcard;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardHomeAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ErrorEvent.Dd.Companion companion = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardHomeAction(companion, (Icon) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new CardHomeAction$Action$CopyCardNumber((CopyCardNumber) CopyCardNumber.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                companion = new CardHomeAction$Action$LockDevices((LockDevices) LockDevices.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardHomeAction cardHomeAction = (CardHomeAction) obj;
        reverseProtoWriter.getClass();
        cardHomeAction.getClass();
        reverseProtoWriter.writeBytes(cardHomeAction.unknownFields());
        ErrorEvent.Dd.Companion companion = cardHomeAction.action;
        if (companion instanceof CardHomeAction$Action$CopyCardNumber) {
            CopyCardNumber.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CardHomeAction$Action$CopyCardNumber) companion).value);
        } else if (companion instanceof CardHomeAction$Action$LockDevices) {
            LockDevices.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CardHomeAction$Action$LockDevices) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, cardHomeAction.is_disabled);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cardHomeAction.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CardHomeAction cardHomeAction = (CardHomeAction) obj;
        cardHomeAction.getClass();
        int size$okio = cardHomeAction.unknownFields().getSize$okio();
        ErrorEvent.Dd.Companion companion = cardHomeAction.action;
        if (companion instanceof CardHomeAction$Action$CopyCardNumber) {
            encodedSizeWithTag = CopyCardNumber.ADAPTER.encodedSizeWithTag(1, ((CardHomeAction$Action$CopyCardNumber) companion).value);
        } else {
            if (!(companion instanceof CardHomeAction$Action$LockDevices)) {
                if (companion != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, cardHomeAction.is_disabled) + Icon.ADAPTER.encodedSizeWithTag(3, cardHomeAction.icon) + size$okio;
            }
            encodedSizeWithTag = LockDevices.ADAPTER.encodedSizeWithTag(2, ((CardHomeAction$Action$LockDevices) companion).value);
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, cardHomeAction.is_disabled) + Icon.ADAPTER.encodedSizeWithTag(3, cardHomeAction.icon) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardHomeAction cardHomeAction = (CardHomeAction) obj;
        cardHomeAction.getClass();
        Icon icon = cardHomeAction.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        ErrorEvent.Dd.Companion companion = cardHomeAction.action;
        Boolean bool = cardHomeAction.is_disabled;
        byteString.getClass();
        return new CardHomeAction(companion, icon2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardHomeAction cardHomeAction = (CardHomeAction) obj;
        cardHomeAction.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 3, cardHomeAction.icon);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, cardHomeAction.is_disabled);
        ErrorEvent.Dd.Companion companion = cardHomeAction.action;
        if (companion instanceof CardHomeAction$Action$CopyCardNumber) {
            CopyCardNumber.ADAPTER.encodeWithTag(protoWriter, 1, ((CardHomeAction$Action$CopyCardNumber) companion).value);
        } else if (companion instanceof CardHomeAction$Action$LockDevices) {
            LockDevices.ADAPTER.encodeWithTag(protoWriter, 2, ((CardHomeAction$Action$LockDevices) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cardHomeAction.unknownFields());
    }
}
