package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/RollupRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/RollupRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RollupRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RollupRow((Integer) obj, (Boolean) obj2, (DisplayedRow) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(DisplayedRow.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RollupRow rollupRow = (RollupRow) obj;
        reverseProtoWriter.getClass();
        rollupRow.getClass();
        reverseProtoWriter.writeBytes(rollupRow.unknownFields());
        DisplayedRow.ADAPTER.encodeWithTag(reverseProtoWriter, 3, rollupRow.first);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, rollupRow.badged);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, rollupRow.count);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RollupRow rollupRow = (RollupRow) obj;
        rollupRow.getClass();
        return DisplayedRow.ADAPTER.encodedSizeWithTag(3, rollupRow.first) + ProtoAdapter.BOOL.encodedSizeWithTag(2, rollupRow.badged) + ProtoAdapter.INT32.encodedSizeWithTag(1, rollupRow.count) + rollupRow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RollupRow rollupRow = (RollupRow) obj;
        rollupRow.getClass();
        DisplayedRow displayedRow = rollupRow.first;
        DisplayedRow displayedRow2 = displayedRow != null ? (DisplayedRow) DisplayedRow.ADAPTER.redact(displayedRow) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = rollupRow.count;
        Boolean bool = rollupRow.badged;
        byteString.getClass();
        return new RollupRow(num, bool, displayedRow2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RollupRow rollupRow = (RollupRow) obj;
        rollupRow.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, rollupRow.count);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, rollupRow.badged);
        DisplayedRow.ADAPTER.encodeWithTag(protoWriter, 3, rollupRow.first);
        protoWriter.writeBytes(rollupRow.unknownFields());
    }
}
