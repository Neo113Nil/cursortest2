package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TextFieldConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TextFieldConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TextFieldConfig((String) obj, (LocalizedString) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextFieldConfig textFieldConfig = (TextFieldConfig) obj;
        reverseProtoWriter.getClass();
        textFieldConfig.getClass();
        reverseProtoWriter.writeBytes(textFieldConfig.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, textFieldConfig.max_length);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, textFieldConfig.empty_placeholder_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, textFieldConfig.prefilled_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextFieldConfig textFieldConfig = (TextFieldConfig) obj;
        textFieldConfig.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(2, textFieldConfig.max_length) + LocalizedString.ADAPTER.encodedSizeWithTag(1, textFieldConfig.empty_placeholder_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, textFieldConfig.prefilled_text) + textFieldConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextFieldConfig textFieldConfig = (TextFieldConfig) obj;
        textFieldConfig.getClass();
        LocalizedString localizedString = textFieldConfig.empty_placeholder_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = textFieldConfig.prefilled_text;
        Integer num = textFieldConfig.max_length;
        byteString.getClass();
        return new TextFieldConfig(str, localizedString2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextFieldConfig textFieldConfig = (TextFieldConfig) obj;
        textFieldConfig.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textFieldConfig.prefilled_text);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, textFieldConfig.empty_placeholder_text);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, textFieldConfig.max_length);
        protoWriter.writeBytes(textFieldConfig.unknownFields());
    }
}
