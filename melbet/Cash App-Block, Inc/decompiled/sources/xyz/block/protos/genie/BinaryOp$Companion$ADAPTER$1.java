package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.BinaryOp;

/* loaded from: classes10.dex */
public final class BinaryOp$Companion$ADAPTER$1 extends ProtoAdapter {
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
                try {
                    obj = BinaryOp.Operator.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        BinaryOp.Operator operator = (BinaryOp.Operator) obj;
        if (operator == null) {
            TransactorKt.missingRequiredFields(obj, "operator");
            throw null;
        }
        Expression expression = (Expression) obj2;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj2, "left");
            throw null;
        }
        Expression expression2 = (Expression) obj3;
        if (expression2 != null) {
            return new BinaryOp(operator, expression, expression2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj3, "right");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BinaryOp binaryOp = (BinaryOp) obj;
        reverseProtoWriter.getClass();
        binaryOp.getClass();
        reverseProtoWriter.writeBytes(binaryOp.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, binaryOp.right);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, binaryOp.left);
        BinaryOp.Operator.ADAPTER.encodeWithTag(reverseProtoWriter, 1, binaryOp.operator_);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BinaryOp binaryOp = (BinaryOp) obj;
        binaryOp.getClass();
        int encodedSizeWithTag = BinaryOp.Operator.ADAPTER.encodedSizeWithTag(1, binaryOp.operator_) + binaryOp.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, binaryOp.right) + protoAdapter.encodedSizeWithTag(2, binaryOp.left) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BinaryOp binaryOp = (BinaryOp) obj;
        binaryOp.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(binaryOp.left);
        Expression expression2 = (Expression) protoAdapter.redact(binaryOp.right);
        ByteString byteString = ByteString.EMPTY;
        BinaryOp.Operator operator = binaryOp.operator_;
        operator.getClass();
        expression.getClass();
        expression2.getClass();
        byteString.getClass();
        return new BinaryOp(operator, expression, expression2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BinaryOp binaryOp = (BinaryOp) obj;
        binaryOp.getClass();
        BinaryOp.Operator.ADAPTER.encodeWithTag(protoWriter, 1, binaryOp.operator_);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, binaryOp.left);
        protoAdapter.encodeWithTag(protoWriter, 3, binaryOp.right);
        protoWriter.writeBytes(binaryOp.unknownFields());
    }
}
