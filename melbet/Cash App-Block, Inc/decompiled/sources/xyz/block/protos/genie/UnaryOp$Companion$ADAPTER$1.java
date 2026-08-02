package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class UnaryOp$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                try {
                    obj = UnaryOp.Operator.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        UnaryOp.Operator operator = (UnaryOp.Operator) obj;
        if (operator == null) {
            TransactorKt.missingRequiredFields(obj, "operator");
            throw null;
        }
        Expression expression = (Expression) obj2;
        if (expression != null) {
            return new UnaryOp(operator, expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "operand");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnaryOp unaryOp = (UnaryOp) obj;
        reverseProtoWriter.getClass();
        unaryOp.getClass();
        reverseProtoWriter.writeBytes(unaryOp.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 2, unaryOp.operand);
        UnaryOp.Operator.ADAPTER.encodeWithTag(reverseProtoWriter, 1, unaryOp.operator_);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnaryOp unaryOp = (UnaryOp) obj;
        unaryOp.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(2, unaryOp.operand) + UnaryOp.Operator.ADAPTER.encodedSizeWithTag(1, unaryOp.operator_) + unaryOp.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnaryOp unaryOp = (UnaryOp) obj;
        unaryOp.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(unaryOp.operand);
        ByteString byteString = ByteString.EMPTY;
        UnaryOp.Operator operator = unaryOp.operator_;
        operator.getClass();
        expression.getClass();
        byteString.getClass();
        return new UnaryOp(operator, expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnaryOp unaryOp = (UnaryOp) obj;
        unaryOp.getClass();
        UnaryOp.Operator.ADAPTER.encodeWithTag(protoWriter, 1, unaryOp.operator_);
        Expression.ADAPTER.encodeWithTag(protoWriter, 2, unaryOp.operand);
        protoWriter.writeBytes(unaryOp.unknownFields());
    }
}
