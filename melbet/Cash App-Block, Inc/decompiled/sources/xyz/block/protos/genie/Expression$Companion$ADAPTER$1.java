package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Expression$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        Long l = null;
        Double d = null;
        Boolean bool = null;
        ByteString byteString = null;
        UnaryOp unaryOp = null;
        BinaryOp binaryOp = null;
        ConditionalOp conditionalOp = null;
        FilterOp filterOp = null;
        CollectionLiteral collectionLiteral = null;
        FormatStringOp formatStringOp = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            KeyPath keyPath = r3;
            if (nextTag == -1) {
                return new Expression(keyPath, str, l, d, bool, byteString, unaryOp, binaryOp, conditionalOp, filterOp, collectionLiteral, formatStringOp, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = KeyPath.ADAPTER.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    d = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 5:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    byteString = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 7:
                    unaryOp = UnaryOp.ADAPTER.decode(protoReader);
                    break;
                case 8:
                    binaryOp = BinaryOp.ADAPTER.decode(protoReader);
                    break;
                case 9:
                    conditionalOp = ConditionalOp.ADAPTER.decode(protoReader);
                    break;
                case 10:
                    filterOp = FilterOp.ADAPTER.decode(protoReader);
                    break;
                case 11:
                    collectionLiteral = CollectionLiteral.ADAPTER.decode(protoReader);
                    break;
                case 12:
                    formatStringOp = FormatStringOp.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = keyPath;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Expression expression = (Expression) obj;
        reverseProtoWriter.getClass();
        expression.getClass();
        reverseProtoWriter.writeBytes(expression.unknownFields());
        FormatStringOp.ADAPTER.encodeWithTag(reverseProtoWriter, 12, expression.format_string_op);
        CollectionLiteral.ADAPTER.encodeWithTag(reverseProtoWriter, 11, expression.collection_literal);
        FilterOp.ADAPTER.encodeWithTag(reverseProtoWriter, 10, expression.filter_op);
        ConditionalOp.ADAPTER.encodeWithTag(reverseProtoWriter, 9, expression.conditional_op);
        BinaryOp.ADAPTER.encodeWithTag(reverseProtoWriter, 8, expression.binary_op);
        UnaryOp.ADAPTER.encodeWithTag(reverseProtoWriter, 7, expression.unary_op);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 6, expression.blob_literal);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, expression.bool_literal);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 4, expression.float_literal);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, expression.int_literal);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, expression.string_literal);
        KeyPath.ADAPTER.encodeWithTag(reverseProtoWriter, 1, expression.key_path_ref);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Expression expression = (Expression) obj;
        expression.getClass();
        return FormatStringOp.ADAPTER.encodedSizeWithTag(12, expression.format_string_op) + CollectionLiteral.ADAPTER.encodedSizeWithTag(11, expression.collection_literal) + FilterOp.ADAPTER.encodedSizeWithTag(10, expression.filter_op) + ConditionalOp.ADAPTER.encodedSizeWithTag(9, expression.conditional_op) + BinaryOp.ADAPTER.encodedSizeWithTag(8, expression.binary_op) + UnaryOp.ADAPTER.encodedSizeWithTag(7, expression.unary_op) + ProtoAdapter.BYTES.encodedSizeWithTag(6, expression.blob_literal) + ProtoAdapter.BOOL.encodedSizeWithTag(5, expression.bool_literal) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, expression.float_literal) + ProtoAdapter.INT64.encodedSizeWithTag(3, expression.int_literal) + ProtoAdapter.STRING.encodedSizeWithTag(2, expression.string_literal) + KeyPath.ADAPTER.encodedSizeWithTag(1, expression.key_path_ref) + expression.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Expression expression = (Expression) obj;
        expression.getClass();
        KeyPath keyPath = expression.key_path_ref;
        KeyPath keyPath2 = keyPath != null ? (KeyPath) KeyPath.ADAPTER.redact(keyPath) : null;
        UnaryOp unaryOp = expression.unary_op;
        UnaryOp unaryOp2 = unaryOp != null ? (UnaryOp) UnaryOp.ADAPTER.redact(unaryOp) : null;
        BinaryOp binaryOp = expression.binary_op;
        BinaryOp binaryOp2 = binaryOp != null ? (BinaryOp) BinaryOp.ADAPTER.redact(binaryOp) : null;
        ConditionalOp conditionalOp = expression.conditional_op;
        ConditionalOp conditionalOp2 = conditionalOp != null ? (ConditionalOp) ConditionalOp.ADAPTER.redact(conditionalOp) : null;
        FilterOp filterOp = expression.filter_op;
        FilterOp filterOp2 = filterOp != null ? (FilterOp) FilterOp.ADAPTER.redact(filterOp) : null;
        CollectionLiteral collectionLiteral = expression.collection_literal;
        CollectionLiteral collectionLiteral2 = collectionLiteral != null ? (CollectionLiteral) CollectionLiteral.ADAPTER.redact(collectionLiteral) : null;
        FormatStringOp formatStringOp = expression.format_string_op;
        FormatStringOp formatStringOp2 = formatStringOp != null ? (FormatStringOp) FormatStringOp.ADAPTER.redact(formatStringOp) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = expression.string_literal;
        Long l = expression.int_literal;
        Double d = expression.float_literal;
        Boolean bool = expression.bool_literal;
        ByteString byteString2 = expression.blob_literal;
        byteString.getClass();
        return new Expression(keyPath2, str, l, d, bool, byteString2, unaryOp2, binaryOp2, conditionalOp2, filterOp2, collectionLiteral2, formatStringOp2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Expression expression = (Expression) obj;
        expression.getClass();
        KeyPath.ADAPTER.encodeWithTag(protoWriter, 1, expression.key_path_ref);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, expression.string_literal);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, expression.int_literal);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, expression.float_literal);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, expression.bool_literal);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, expression.blob_literal);
        UnaryOp.ADAPTER.encodeWithTag(protoWriter, 7, expression.unary_op);
        BinaryOp.ADAPTER.encodeWithTag(protoWriter, 8, expression.binary_op);
        ConditionalOp.ADAPTER.encodeWithTag(protoWriter, 9, expression.conditional_op);
        FilterOp.ADAPTER.encodeWithTag(protoWriter, 10, expression.filter_op);
        CollectionLiteral.ADAPTER.encodeWithTag(protoWriter, 11, expression.collection_literal);
        FormatStringOp.ADAPTER.encodeWithTag(protoWriter, 12, expression.format_string_op);
        protoWriter.writeBytes(expression.unknownFields());
    }
}
