package com.squareup.wire;

import com.squareup.wire.Message;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AnyMessage extends Message {
    public static final ProtoAdapter ADAPTER;
    public final String typeUrl;
    public final ByteString value;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AnyMessage.class);
        Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.wire.AnyMessage$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader32 protoReader32) {
                protoReader32.getClass();
                Object obj = ByteString.EMPTY;
                ByteArrayProtoReader32 byteArrayProtoReader32 = (ByteArrayProtoReader32) protoReader32;
                int beginMessage = byteArrayProtoReader32.beginMessage();
                Object obj2 = "";
                while (true) {
                    int nextTag = byteArrayProtoReader32.nextTag();
                    if (nextTag == -1) {
                        byteArrayProtoReader32.endMessageAndGetUnknownFields(beginMessage);
                        return new AnyMessage((String) obj2, (ByteString) obj);
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(byteArrayProtoReader32);
                    } else if (nextTag != 2) {
                        byteArrayProtoReader32.readUnknownField(nextTag);
                    } else {
                        obj = ProtoAdapter.BYTES.decode(byteArrayProtoReader32);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AnyMessage anyMessage = (AnyMessage) obj;
                reverseProtoWriter.getClass();
                anyMessage.getClass();
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, anyMessage.value);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, anyMessage.typeUrl);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AnyMessage anyMessage = (AnyMessage) obj;
                anyMessage.getClass();
                return ProtoAdapter.BYTES.encodedSizeWithTag(2, anyMessage.value) + ProtoAdapter.STRING.encodedSizeWithTag(1, anyMessage.typeUrl);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((AnyMessage) obj).getClass();
                return new AnyMessage("square.github.io/wire/redacted", ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AnyMessage anyMessage = (AnyMessage) obj;
                anyMessage.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anyMessage.typeUrl);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, anyMessage.value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                Object obj = ByteString.EMPTY;
                long beginMessage = protoReader.beginMessage();
                Object obj2 = "";
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return new AnyMessage((String) obj2, (ByteString) obj);
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyMessage(String str, ByteString byteString) {
        super(ADAPTER, ByteString.EMPTY);
        str.getClass();
        byteString.getClass();
        this.typeUrl = str;
        this.value = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnyMessage)) {
            return false;
        }
        AnyMessage anyMessage = (AnyMessage) obj;
        return Intrinsics.areEqual(this.typeUrl, anyMessage.typeUrl) && Intrinsics.areEqual(this.value, anyMessage.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i * 37, 37, this.typeUrl);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError();
    }

    public final String toString() {
        return "Any{type_url=" + this.typeUrl + ", value=" + this.value + '}';
    }
}
