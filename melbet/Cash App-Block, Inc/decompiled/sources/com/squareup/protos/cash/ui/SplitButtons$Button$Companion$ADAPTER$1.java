package com.squareup.protos.cash.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes8.dex */
public final class SplitButtons$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SplitButtons.Button((String) obj, (LocalizableString) obj2, (SplitButtons.Button.Action) obj3, (CdfEvent) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(SplitButtons.Button.Action.ADAPTER, protoReader, obj3);
            } else if (nextTag == 3) {
                obj4 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj4);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SplitButtons.Button button = (SplitButtons.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.cdfEvent);
        SplitButtons.Button.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.action);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, button.localizable_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SplitButtons.Button button = (SplitButtons.Button) obj;
        button.getClass();
        return CdfEvent.ADAPTER.encodedSizeWithTag(3, button.cdfEvent) + SplitButtons.Button.Action.ADAPTER.encodedSizeWithTag(2, button.action) + LocalizableString.ADAPTER.encodedSizeWithTag(4, button.localizable_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, button.text) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SplitButtons.Button button = (SplitButtons.Button) obj;
        button.getClass();
        LocalizableString localizableString = button.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        SplitButtons.Button.Action action = button.action;
        SplitButtons.Button.Action action2 = action != null ? (SplitButtons.Button.Action) SplitButtons.Button.Action.ADAPTER.redact(action) : null;
        CdfEvent cdfEvent = button.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = button.text;
        byteString.getClass();
        return new SplitButtons.Button(str, localizableString2, action2, cdfEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SplitButtons.Button button = (SplitButtons.Button) obj;
        button.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, button.localizable_text);
        SplitButtons.Button.Action.ADAPTER.encodeWithTag(protoWriter, 2, button.action);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 3, button.cdfEvent);
        protoWriter.writeBytes(button.unknownFields());
    }
}
