package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SetViewStateValue$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj = KeyPath.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        KeyPath keyPath = (KeyPath) obj;
        if (keyPath == null) {
            TransactorKt.missingRequiredFields(obj, "key_path");
            throw null;
        }
        Expression expression = (Expression) obj2;
        if (expression != null) {
            return new SetViewStateValue(keyPath, expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "value");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetViewStateValue setViewStateValue = (SetViewStateValue) obj;
        reverseProtoWriter.getClass();
        setViewStateValue.getClass();
        reverseProtoWriter.writeBytes(setViewStateValue.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setViewStateValue.value_);
        KeyPath.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setViewStateValue.key_path);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetViewStateValue setViewStateValue = (SetViewStateValue) obj;
        setViewStateValue.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(2, setViewStateValue.value_) + KeyPath.ADAPTER.encodedSizeWithTag(1, setViewStateValue.key_path) + setViewStateValue.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetViewStateValue setViewStateValue = (SetViewStateValue) obj;
        setViewStateValue.getClass();
        KeyPath keyPath = (KeyPath) KeyPath.ADAPTER.redact(setViewStateValue.key_path);
        Expression expression = (Expression) Expression.ADAPTER.redact(setViewStateValue.value_);
        ByteString byteString = ByteString.EMPTY;
        keyPath.getClass();
        expression.getClass();
        byteString.getClass();
        return new SetViewStateValue(keyPath, expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetViewStateValue setViewStateValue = (SetViewStateValue) obj;
        setViewStateValue.getClass();
        KeyPath.ADAPTER.encodeWithTag(protoWriter, 1, setViewStateValue.key_path);
        Expression.ADAPTER.encodeWithTag(protoWriter, 2, setViewStateValue.value_);
        protoWriter.writeBytes(setViewStateValue.unknownFields());
    }
}
