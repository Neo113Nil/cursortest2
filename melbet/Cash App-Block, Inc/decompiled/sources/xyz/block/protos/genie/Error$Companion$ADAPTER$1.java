package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Error$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Error((ErrorCode) obj, (DebugInfo) obj2, (DisplayError) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ErrorCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = DebugInfo.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = DisplayError.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Error error = (Error) obj;
        reverseProtoWriter.getClass();
        error.getClass();
        reverseProtoWriter.writeBytes(error.unknownFields());
        DisplayError.ADAPTER.encodeWithTag(reverseProtoWriter, 3, error.display_error);
        DebugInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 2, error.debug_info);
        ErrorCode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, error.code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Error error = (Error) obj;
        error.getClass();
        return DisplayError.ADAPTER.encodedSizeWithTag(3, error.display_error) + DebugInfo.ADAPTER.encodedSizeWithTag(2, error.debug_info) + ErrorCode.ADAPTER.encodedSizeWithTag(1, error.code) + error.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Error error = (Error) obj;
        error.getClass();
        DebugInfo debugInfo = error.debug_info;
        DebugInfo debugInfo2 = debugInfo != null ? (DebugInfo) DebugInfo.ADAPTER.redact(debugInfo) : null;
        DisplayError displayError = error.display_error;
        DisplayError displayError2 = displayError != null ? (DisplayError) DisplayError.ADAPTER.redact(displayError) : null;
        ByteString byteString = ByteString.EMPTY;
        ErrorCode errorCode = error.code;
        byteString.getClass();
        return new Error(errorCode, debugInfo2, displayError2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Error error = (Error) obj;
        error.getClass();
        ErrorCode.ADAPTER.encodeWithTag(protoWriter, 1, error.code);
        DebugInfo.ADAPTER.encodeWithTag(protoWriter, 2, error.debug_info);
        DisplayError.ADAPTER.encodeWithTag(protoWriter, 3, error.display_error);
        protoWriter.writeBytes(error.unknownFields());
    }
}
