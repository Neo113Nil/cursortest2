package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public abstract class EnumAdapter extends ProtoAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(KClass kClass, Syntax syntax, WireEnum wireEnum) {
        super(FieldEncoding.VARINT, kClass, (String) null, syntax, wireEnum, (String) null);
        kClass.getClass();
        syntax.getClass();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public WireEnum decode(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        int readVarint32 = ((ByteArrayProtoReader32) protoReader32).readVarint32();
        WireEnum fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, WireEnum wireEnum) {
        protoWriter.getClass();
        wireEnum.getClass();
        protoWriter.writeVarint32(wireEnum.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(WireEnum wireEnum) {
        wireEnum.getClass();
        int value = wireEnum.getValue();
        if ((value & (-128)) == 0) {
            return 1;
        }
        if ((value & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value) == 0) {
            return 3;
        }
        return (value & (-268435456)) == 0 ? 4 : 5;
    }

    public abstract WireEnum fromValue(int i);

    @Override // com.squareup.wire.ProtoAdapter
    public WireEnum redact(WireEnum wireEnum) {
        wireEnum.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, WireEnum wireEnum) {
        reverseProtoWriter.getClass();
        wireEnum.getClass();
        reverseProtoWriter.writeVarint32(wireEnum.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public WireEnum decode(ProtoReader protoReader) {
        protoReader.getClass();
        int readVarint32 = protoReader.readVarint32();
        WireEnum fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, getType());
    }
}
