package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.CollectionMutation;

/* loaded from: classes10.dex */
public final class CollectionMutation$RemoveItems$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CollectionMutation.RemoveItems(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Expression.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionMutation.RemoveItems removeItems = (CollectionMutation.RemoveItems) obj;
        reverseProtoWriter.getClass();
        removeItems.getClass();
        reverseProtoWriter.writeBytes(removeItems.unknownFields());
        Expression.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, removeItems.item_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionMutation.RemoveItems removeItems = (CollectionMutation.RemoveItems) obj;
        removeItems.getClass();
        return Expression.ADAPTER.asRepeated().encodedSizeWithTag(1, removeItems.item_ids) + removeItems.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionMutation.RemoveItems removeItems = (CollectionMutation.RemoveItems) obj;
        removeItems.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(removeItems.item_ids, Expression.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CollectionMutation.RemoveItems(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionMutation.RemoveItems removeItems = (CollectionMutation.RemoveItems) obj;
        removeItems.getClass();
        Expression.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, removeItems.item_ids);
        protoWriter.writeBytes(removeItems.unknownFields());
    }
}
