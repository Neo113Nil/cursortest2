package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class FilterOp$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, "collection");
            throw null;
        }
        String str = (String) obj2;
        if (str == null) {
            TransactorKt.missingRequiredFields(obj2, "item_variable");
            throw null;
        }
        Expression expression2 = (Expression) obj3;
        if (expression2 != null) {
            return new FilterOp(expression, str, expression2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj3, "predicate");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FilterOp filterOp = (FilterOp) obj;
        reverseProtoWriter.getClass();
        filterOp.getClass();
        reverseProtoWriter.writeBytes(filterOp.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, filterOp.predicate);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, filterOp.item_variable);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, filterOp.collection);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FilterOp filterOp = (FilterOp) obj;
        filterOp.getClass();
        int size$okio = filterOp.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, filterOp.predicate) + ProtoAdapter.STRING.encodedSizeWithTag(2, filterOp.item_variable) + protoAdapter.encodedSizeWithTag(1, filterOp.collection) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FilterOp filterOp = (FilterOp) obj;
        filterOp.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(filterOp.collection);
        Expression expression2 = (Expression) protoAdapter.redact(filterOp.predicate);
        ByteString byteString = ByteString.EMPTY;
        String str = filterOp.item_variable;
        expression.getClass();
        str.getClass();
        expression2.getClass();
        byteString.getClass();
        return new FilterOp(expression, str, expression2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FilterOp filterOp = (FilterOp) obj;
        filterOp.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, filterOp.collection);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, filterOp.item_variable);
        protoAdapter.encodeWithTag(protoWriter, 3, filterOp.predicate);
        protoWriter.writeBytes(filterOp.unknownFields());
    }
}
