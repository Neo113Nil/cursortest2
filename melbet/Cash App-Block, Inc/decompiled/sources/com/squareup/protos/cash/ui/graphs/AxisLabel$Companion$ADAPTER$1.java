package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AxisLabel$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AxisLabel((LocalizedString) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AxisLabel axisLabel = (AxisLabel) obj;
        reverseProtoWriter.getClass();
        axisLabel.getClass();
        reverseProtoWriter.writeBytes(axisLabel.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, axisLabel.value);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, axisLabel.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AxisLabel axisLabel = (AxisLabel) obj;
        axisLabel.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, axisLabel.value) + LocalizedString.ADAPTER.encodedSizeWithTag(1, axisLabel.text) + axisLabel.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AxisLabel axisLabel = (AxisLabel) obj;
        axisLabel.getClass();
        LocalizedString localizedString = axisLabel.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = axisLabel.value;
        byteString.getClass();
        return new AxisLabel(localizedString2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AxisLabel axisLabel = (AxisLabel) obj;
        axisLabel.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, axisLabel.text);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, axisLabel.value);
        protoWriter.writeBytes(axisLabel.unknownFields());
    }
}
