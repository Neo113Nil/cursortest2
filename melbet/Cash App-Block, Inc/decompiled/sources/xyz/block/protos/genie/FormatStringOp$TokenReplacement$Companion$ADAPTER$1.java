package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.FormatStringOp;

/* loaded from: classes10.dex */
public final class FormatStringOp$TokenReplacement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str == null) {
            TransactorKt.missingRequiredFields(obj, "key");
            throw null;
        }
        Expression expression = (Expression) obj2;
        if (expression != null) {
            return new FormatStringOp.TokenReplacement(str, expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "value");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FormatStringOp.TokenReplacement tokenReplacement = (FormatStringOp.TokenReplacement) obj;
        reverseProtoWriter.getClass();
        tokenReplacement.getClass();
        reverseProtoWriter.writeBytes(tokenReplacement.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tokenReplacement.value_);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tokenReplacement.key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FormatStringOp.TokenReplacement tokenReplacement = (FormatStringOp.TokenReplacement) obj;
        tokenReplacement.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(2, tokenReplacement.value_) + ProtoAdapter.STRING.encodedSizeWithTag(1, tokenReplacement.key) + tokenReplacement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FormatStringOp.TokenReplacement tokenReplacement = (FormatStringOp.TokenReplacement) obj;
        tokenReplacement.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(tokenReplacement.value_);
        ByteString byteString = ByteString.EMPTY;
        String str = tokenReplacement.key;
        str.getClass();
        expression.getClass();
        byteString.getClass();
        return new FormatStringOp.TokenReplacement(str, expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FormatStringOp.TokenReplacement tokenReplacement = (FormatStringOp.TokenReplacement) obj;
        tokenReplacement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tokenReplacement.key);
        Expression.ADAPTER.encodeWithTag(protoWriter, 2, tokenReplacement.value_);
        protoWriter.writeBytes(tokenReplacement.unknownFields());
    }
}
