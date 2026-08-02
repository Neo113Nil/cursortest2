package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Binding$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = KeyPath.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = Action.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        KeyPath keyPath = (KeyPath) obj;
        if (keyPath != null) {
            return new Binding(keyPath, (Expression) obj2, (Expression) obj3, (Expression) obj4, (Action) obj5, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "key_path");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Binding binding = (Binding) obj;
        reverseProtoWriter.getClass();
        binding.getClass();
        reverseProtoWriter.writeBytes(binding.unknownFields());
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 5, binding.on_invalid);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, binding.validation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, binding.set_transform);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, binding.get_transform);
        KeyPath.ADAPTER.encodeWithTag(reverseProtoWriter, 1, binding.key_path);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Binding binding = (Binding) obj;
        binding.getClass();
        int encodedSizeWithTag = KeyPath.ADAPTER.encodedSizeWithTag(1, binding.key_path) + binding.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return Action.ADAPTER.encodedSizeWithTag(5, binding.on_invalid) + protoAdapter.encodedSizeWithTag(4, binding.validation) + protoAdapter.encodedSizeWithTag(3, binding.set_transform) + protoAdapter.encodedSizeWithTag(2, binding.get_transform) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Binding binding = (Binding) obj;
        binding.getClass();
        KeyPath keyPath = (KeyPath) KeyPath.ADAPTER.redact(binding.key_path);
        Expression expression = binding.get_transform;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = binding.set_transform;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = binding.validation;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        Action action = binding.on_invalid;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        keyPath.getClass();
        byteString.getClass();
        return new Binding(keyPath, expression2, expression4, expression6, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Binding binding = (Binding) obj;
        binding.getClass();
        KeyPath.ADAPTER.encodeWithTag(protoWriter, 1, binding.key_path);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, binding.get_transform);
        protoAdapter.encodeWithTag(protoWriter, 3, binding.set_transform);
        protoAdapter.encodeWithTag(protoWriter, 4, binding.validation);
        Action.ADAPTER.encodeWithTag(protoWriter, 5, binding.on_invalid);
        protoWriter.writeBytes(binding.unknownFields());
    }
}
