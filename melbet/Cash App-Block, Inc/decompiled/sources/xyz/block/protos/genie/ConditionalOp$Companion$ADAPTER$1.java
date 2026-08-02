package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ConditionalOp$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, "condition");
            throw null;
        }
        Expression expression2 = (Expression) obj2;
        if (expression2 == null) {
            TransactorKt.missingRequiredFields(obj2, "then_expr");
            throw null;
        }
        Expression expression3 = (Expression) obj3;
        if (expression3 != null) {
            return new ConditionalOp(expression, expression2, expression3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj3, "else_expr");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConditionalOp conditionalOp = (ConditionalOp) obj;
        reverseProtoWriter.getClass();
        conditionalOp.getClass();
        reverseProtoWriter.writeBytes(conditionalOp.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, conditionalOp.else_expr);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, conditionalOp.then_expr);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, conditionalOp.condition);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConditionalOp conditionalOp = (ConditionalOp) obj;
        conditionalOp.getClass();
        int size$okio = conditionalOp.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, conditionalOp.else_expr) + protoAdapter.encodedSizeWithTag(2, conditionalOp.then_expr) + protoAdapter.encodedSizeWithTag(1, conditionalOp.condition) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConditionalOp conditionalOp = (ConditionalOp) obj;
        conditionalOp.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(conditionalOp.condition);
        Expression expression2 = (Expression) protoAdapter.redact(conditionalOp.then_expr);
        Expression expression3 = (Expression) protoAdapter.redact(conditionalOp.else_expr);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        expression2.getClass();
        expression3.getClass();
        byteString.getClass();
        return new ConditionalOp(expression, expression2, expression3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConditionalOp conditionalOp = (ConditionalOp) obj;
        conditionalOp.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, conditionalOp.condition);
        protoAdapter.encodeWithTag(protoWriter, 2, conditionalOp.then_expr);
        protoAdapter.encodeWithTag(protoWriter, 3, conditionalOp.else_expr);
        protoWriter.writeBytes(conditionalOp.unknownFields());
    }
}
