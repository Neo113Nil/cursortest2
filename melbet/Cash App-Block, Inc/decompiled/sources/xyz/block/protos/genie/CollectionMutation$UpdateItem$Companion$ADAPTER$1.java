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
public final class CollectionMutation$UpdateItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CollectionMutation.SetItemField.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new CollectionMutation.UpdateItem(m, endMessageAndGetUnknownFields, expression);
        }
        TransactorKt.missingRequiredFields(obj, "identity");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CollectionMutation.UpdateItem updateItem = (CollectionMutation.UpdateItem) obj;
        reverseProtoWriter.getClass();
        updateItem.getClass();
        reverseProtoWriter.writeBytes(updateItem.unknownFields());
        CollectionMutation.SetItemField.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, updateItem.fields);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateItem.identity);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CollectionMutation.UpdateItem updateItem = (CollectionMutation.UpdateItem) obj;
        updateItem.getClass();
        return CollectionMutation.SetItemField.ADAPTER.asRepeated().encodedSizeWithTag(2, updateItem.fields) + Expression.ADAPTER.encodedSizeWithTag(1, updateItem.identity) + updateItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CollectionMutation.UpdateItem updateItem = (CollectionMutation.UpdateItem) obj;
        updateItem.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(updateItem.identity);
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateItem.fields, CollectionMutation.SetItemField.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new CollectionMutation.UpdateItem(m1169redactElements, byteString, expression);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CollectionMutation.UpdateItem updateItem = (CollectionMutation.UpdateItem) obj;
        updateItem.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, updateItem.identity);
        CollectionMutation.SetItemField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, updateItem.fields);
        protoWriter.writeBytes(updateItem.unknownFields());
    }
}
