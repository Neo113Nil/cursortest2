package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeButtonElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeButtonElement((String) obj, (Action) obj2, (ArcadeButtonElement.State) obj3, (ArcadeButtonElement.Size) obj4, (ArcadeButtonElement.Prominence) obj5, (Boolean) obj6, (Alignment) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                try {
                    obj3 = ArcadeButtonElement.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                switch (nextTag) {
                    case 10:
                        try {
                            obj5 = ArcadeButtonElement.Prominence.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    case 11:
                        obj6 = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 12:
                        try {
                            obj7 = Alignment.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            break;
                        }
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                try {
                    obj4 = ArcadeButtonElement.Size.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeButtonElement arcadeButtonElement = (ArcadeButtonElement) obj;
        reverseProtoWriter.getClass();
        arcadeButtonElement.getClass();
        reverseProtoWriter.writeBytes(arcadeButtonElement.unknownFields());
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 12, arcadeButtonElement.alignment);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, arcadeButtonElement.destructive);
        ArcadeButtonElement.Prominence.ADAPTER.encodeWithTag(reverseProtoWriter, 10, arcadeButtonElement.prominence);
        ArcadeButtonElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 5, arcadeButtonElement.size);
        ArcadeButtonElement.State.ADAPTER.encodeWithTag(reverseProtoWriter, 4, arcadeButtonElement.state);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, arcadeButtonElement.action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, arcadeButtonElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeButtonElement arcadeButtonElement = (ArcadeButtonElement) obj;
        arcadeButtonElement.getClass();
        return Alignment.ADAPTER.encodedSizeWithTag(12, arcadeButtonElement.alignment) + ProtoAdapter.BOOL.encodedSizeWithTag(11, arcadeButtonElement.destructive) + ArcadeButtonElement.Prominence.ADAPTER.encodedSizeWithTag(10, arcadeButtonElement.prominence) + ArcadeButtonElement.Size.ADAPTER.encodedSizeWithTag(5, arcadeButtonElement.size) + ArcadeButtonElement.State.ADAPTER.encodedSizeWithTag(4, arcadeButtonElement.state) + Action.ADAPTER.encodedSizeWithTag(2, arcadeButtonElement.action) + ProtoAdapter.STRING.encodedSizeWithTag(1, arcadeButtonElement.text) + arcadeButtonElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeButtonElement arcadeButtonElement = (ArcadeButtonElement) obj;
        arcadeButtonElement.getClass();
        Action action = arcadeButtonElement.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = arcadeButtonElement.text;
        ArcadeButtonElement.State state = arcadeButtonElement.state;
        ArcadeButtonElement.Size size = arcadeButtonElement.size;
        ArcadeButtonElement.Prominence prominence = arcadeButtonElement.prominence;
        Boolean bool = arcadeButtonElement.destructive;
        Alignment alignment = arcadeButtonElement.alignment;
        byteString.getClass();
        return new ArcadeButtonElement(str, action2, state, size, prominence, bool, alignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeButtonElement arcadeButtonElement = (ArcadeButtonElement) obj;
        arcadeButtonElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, arcadeButtonElement.text);
        Action.ADAPTER.encodeWithTag(protoWriter, 2, arcadeButtonElement.action);
        ArcadeButtonElement.State.ADAPTER.encodeWithTag(protoWriter, 4, arcadeButtonElement.state);
        ArcadeButtonElement.Size.ADAPTER.encodeWithTag(protoWriter, 5, arcadeButtonElement.size);
        ArcadeButtonElement.Prominence.ADAPTER.encodeWithTag(protoWriter, 10, arcadeButtonElement.prominence);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, arcadeButtonElement.destructive);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 12, arcadeButtonElement.alignment);
        protoWriter.writeBytes(arcadeButtonElement.unknownFields());
    }
}
